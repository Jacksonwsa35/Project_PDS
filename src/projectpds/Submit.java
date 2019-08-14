/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpds;

/**
 * Classe para visualizar testes de um sistema.
 *
 * @authors: Jackson e João Pedro
 * @version 1.0
 * @since '06/08/2019'
 *
 */
public class Submit {

    /**
     * Método que mostra o inicio do teste.
     */
    private void teste() {
        System.out.println("iniciando teste...");
    }

    /**
     * Método que mostra os dados de um objeto
     *
     * @param data String[] - dado a ser vizualizado
     */
    private void data(String[] data) {
        for (String string : data) {
            System.out.println(string);
        }
    }

    /**
     * Método que retorna o acesso do usuario
     *
     * @return Strin - Acesso atualizado
     */
    private String acess() {
        return "Acesso autorizado!";
    }
}
