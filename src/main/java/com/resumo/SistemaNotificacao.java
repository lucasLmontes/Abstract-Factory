package com.resumo;

public class SistemaNotificacao {

    private Notificacao notificacao;

    public SistemaNotificacao(FabricaAbstrataNotificacao fabrica) {
        this.notificacao = fabrica.criarNotificacao();
    }

    public String enviarNotificacao() {
        return this.notificacao.enviar();
    }
}
