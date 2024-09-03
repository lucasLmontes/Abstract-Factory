package com.resumo;

public class NotificacaoEmail implements Notificacao {

    @Override
    public String enviar() {
        return "Notificação por Email";
    }
}
