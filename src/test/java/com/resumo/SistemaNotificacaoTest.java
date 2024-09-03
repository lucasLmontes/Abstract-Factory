package com.resumo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SistemaNotificacaoTest {

    @Test
    public void testarEnviarNotificacaoPorEmail() {
        FabricaAbstrataNotificacao notificacao = new FabricaNotificacaoEmail();
        SistemaNotificacao sistema = new SistemaNotificacao(notificacao);
        assertEquals("Notificação por Email", sistema.enviarNotificacao());
    }

    @Test
    public void testarEnviarNotificacaoPorSMS() {
        FabricaAbstrataNotificacao fabrica = new FabricaNotificacaoSMS();
        SistemaNotificacao sistema = new SistemaNotificacao(fabrica);
        assertEquals("Notificação por SMS", sistema.enviarNotificacao());
    }
}