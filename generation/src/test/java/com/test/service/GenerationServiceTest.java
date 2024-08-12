package com.test.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class GenerationServiceTest {

    private GenerationService generationService = new GenerationService();

    @Test
    void ShouldGenerateNumber()
    {
        String res = generationService.generateNumber();

        Assertions.assertThat(res).isNotNull();
        Assertions.assertThat(res.length()).isEqualTo(13);
    }
}