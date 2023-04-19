package com.movilespascual.recyclerview;

public class ListaElementos {
    public  String color, name, ciudad, estado, correo, tel;

    public ListaElementos(String color, String name, String ciudad, String estado, String correo, String tel) {
        this.color = color;
        this.name = name;
        this.ciudad = ciudad;
        this.estado = estado;
        this.correo = correo;
        this.tel = tel;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getInicial() {
        String inicial= name.substring(0, 1);
        return inicial;
    }
}
