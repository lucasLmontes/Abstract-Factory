package com.resumo;

public class NotificacaoSMS implements Notificacao {

    @Override
    public String enviar() {
        return "Notificação por SMS";
    }
}
