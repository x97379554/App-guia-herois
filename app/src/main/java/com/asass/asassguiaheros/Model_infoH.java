package com.asass.asassguiaheros;

public class Model_infoH {
    //Nome e imagem
    private  String nome_h;
    // Habilidades
    private  String habilidades_h;
    // Imagem de perfil
    private  String img_h;

    public Model_infoH(String nome_h, String habilidades_h, String img_h) {
        this.nome_h = nome_h;
        this.habilidades_h = habilidades_h;
        this.img_h = img_h;
    }

    public String getNome_h() {
        return nome_h;
    }

    public String getHabilidades_h() {
        return habilidades_h;
    }

    public String getImg_h() {
        return img_h;
    }
}
