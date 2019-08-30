/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author yurilima
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTRUTOR CHEIO
        Atleta atleta01 = new Atleta(1,"JOAO","EQUIPE01","LINS","SP");
        Atleta atleta02 = new Atleta(2,"JOSE","EQUIPE01","LINS","SP");
        Atleta atleta03 = new Atleta(3,"ANTONIO","EQUIPE01","LINS","SP");
        Atleta atleta04 = new Atleta(4,"JOAQUIM","EQUIPE01","LINS","SP");
        Atleta atleta05 = new Atleta(5,"MIGUEL","EQUIPE01","LINS","SP");
        
        ArrayList<Atleta> listaAtleta = new ArrayList<Atleta>();
        //ADICIONANDO 5 OBJETOS DA CLASSE Atleta
        listaAtleta.add(atleta01);//Indice 0 do Array
        listaAtleta.add(atleta02);
        listaAtleta.add(atleta03);
        listaAtleta.add(atleta04);
        listaAtleta.add(atleta05);//Indice 4 do Array
        
        //Adicionando 5 objetos (usando o FOR) e adicionar no mesmo objeto da 
        //classe ArrayList
        for(int i = 6; i < 11; i++){
            Atleta objAtleta = new Atleta(i,"Atleta" + i,"EQUIPE" + 2,"MARILIA","SP");
            listaAtleta.add(objAtleta);
        }
        
        //Percorrer a lista e exibir os dados de todos os atletas
        for(int j = 0; j < listaAtleta.size(); j++){
            System.out.println("Atleta" + listaAtleta.get(j).getIdAtleta() + " - " +
                                           listaAtleta.get(j).getNome() + " - " +
                                           listaAtleta.get(j).getEquipe() + " - " +
                                           listaAtleta.get(j).getCidade() + " - " +
                                           listaAtleta.get(j).getEstado() + " - ");
        }
        
        //Encontrar atleta ID 5
        Atleta objAtleta = new Atleta();
        for(int k = 0; k < listaAtleta.size(); k++){
            
            objAtleta = listaAtleta.get(k);
            
            if(objAtleta.getIdAtleta() == 5){
                
                System.out.println("Atleta " + objAtleta.getNome() + 
                                   " - ID - " + objAtleta.getIdAtleta());
            }
        }
        
        //Localizar atletas pelo Nome
        for(int x = 0; x < listaAtleta.size(); x++){
            
            objAtleta = listaAtleta.get(x);
            
            if("JOAQUIM".equals(objAtleta.getNome())){
                
                System.out.println("Atleta " + objAtleta.getNome() + " - " +
                                                objAtleta.getEquipe());
            }
        }
        
        //Localizar atletas EQUIPE01
        for(int y = 0; y < listaAtleta.size(); y++){
            
            objAtleta = listaAtleta.get(y);
            
            if("EQUIPE01".equals(objAtleta.getEquipe())){
                
                System.out.println("Atleta " + objAtleta.getNome() + " - " +
                                                objAtleta.getEquipe());
            }
        }
        
    }//Fim Main
    
}//Fim Principal
