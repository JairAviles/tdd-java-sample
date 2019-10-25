package com.jairaviles.javatest.player;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class PlayerTest {

    @Mock
    Dice dice;

    @InjectMocks
    Player player = new Player();

    @Test
    public void looses_when_dice_number_is_too_low() {
        Mockito.when(dice.roll()).thenReturn(2);

        player = new Player(dice, 3);
        assertFalse(player.play());
    }

    @Test
    public void wins_when_dice_number_is_higher() {
        Mockito.when(dice.roll()).thenReturn(5);

        player = new Player(dice, 3);
        assertTrue(player.play());
    }
}