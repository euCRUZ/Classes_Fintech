package br.com.classes_fintech.Repositorio;

import br.com.classes_fintech.Entidades.Meta;
import java.util.ArrayList;
import java.util.Iterator;

public class RepositorioMeta implements IRepositorioMeta{

    ArrayList<Meta> listaMetas = new ArrayList<Meta>();

    @Override
    public boolean salvarMeta(Meta meta) {
        try {
            listaMetas.add(meta);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean deletarMetaPorID(int id) {
        for (Meta meta : listaMetas) {
            if (meta.getId() == id) {
                listaMetas.remove(meta);
            }
        }
        return false;
    }

    @Override
    public ArrayList<Meta> buscarMeta() {

        return listaMetas;
    }

    @Override
    public boolean atualizarMeta(Meta meta) {
        listaMetas.removeIf(existingMeta -> existingMeta.getId() == meta.getId());
        listaMetas.add(meta);
        return true;
    }

//    @Override
//    public boolean atualizarMeta(Meta meta) {
//
//        for (Meta meta1 : listaMetas) {
//            if (meta1.getId() == meta.getId()) {
//                listaMetas.remove(meta1);
//                listaMetas.add(meta);
//            }
//        }
//        return false;
//    }

}
