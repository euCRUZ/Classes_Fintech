package br.com.classes_fintech.Repositorio;

import br.com.classes_fintech.Entidades.Meta;
import java.util.ArrayList;

public interface IRepositorioMeta {

    public boolean salvarMeta(Meta meta);
    public boolean deletarMetaPorID(int id);
    public ArrayList<Meta> buscarMeta();
    public boolean atualizarMeta(Meta meta);

}
