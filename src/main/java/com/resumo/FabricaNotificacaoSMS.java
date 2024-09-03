package com.resumo;

public class FabricaNotificacaoSMS implements FabricaAbstrataNotificacao {

    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoSMS();
    }
}
