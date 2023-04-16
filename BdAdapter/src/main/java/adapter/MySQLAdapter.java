/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author JCMB
 */
public class MySQLAdapter implements ISGBD {
    
    @Override
    public void conectar() {
        System.out.println("Conectando ao banco de dados MySQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando do banco de dados MySQL");
    }

    @Override
    public void executar() {
        System.out.println("Executando o comando no banco de dados MySQL");
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo da tabela no banco de dados MySQL");
    }
}