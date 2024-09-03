package com.resumo;

public class FabricaNotificacaoEmail implements FabricaAbstrataNotificacao {

    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoEmail();
    }
}
