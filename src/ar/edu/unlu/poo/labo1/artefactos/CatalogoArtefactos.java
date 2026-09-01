package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {
    Set<Artefacto> listaArtefactos = new HashSet<>();

    void agregarArtefacto(Artefacto artefacto){
        if (!listaArtefactos.contains(artefacto.getNombre())){
            listaArtefactos.add(artefacto);
        }
    }

    public Set obtenerArtefactosUnicos(){
        Set<Artefacto> listaUnicos= new HashSet<>();
        listaUnicos.addAll(listaArtefactos);
        return listaUnicos;
    }

    public List buscarArtefactosPorTipo(String tipo){
        List<Artefacto> mismoTipo = new ArrayList<>();

        for(Artefacto ar : listaArtefactos){
            if (ar.getTipo().equals(tipo)) mismoTipo.add(ar);
        }

        return mismoTipo;
    }

    public Map<String, Integer> contarArtefactosPorTipo(){
        Map<String, Integer> cantidadPorTipo = new HashMap<>();

        for(Artefacto ar : listaArtefactos){

            if (cantidadPorTipo.containsKey(ar.getTipo())){
                int conteoActual = cantidadPorTipo.get(ar.getNombre());
                cantidadPorTipo.put(ar.getNombre(), conteoActual++);
            }else {
                cantidadPorTipo.put(ar.getNombre(), 1);
            }
        }

        return cantidadPorTipo;
    }




}
