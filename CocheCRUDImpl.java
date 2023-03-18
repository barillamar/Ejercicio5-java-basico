package com.ejercicios.Interfaces;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{


    @Override
    public void save(CocheCRUD cocheCRUD) {

    }

    @Override
    public void findAll() {

    }

    @Override
    public void delete(CocheCRUD cocheCRUD) {

    }

    String save = "Guardar ";
    String findAll = "Encontrar todos ";
    String delete = "Eliminar ";

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }

   
}
