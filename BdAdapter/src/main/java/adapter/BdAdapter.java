/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author JCMB
 */
public class BdAdapter {
    
    public static void main(String[] args) {
        // criar a aplicação para o perfil 1
        BdAdapter2 appPerfil1 = new BdAdapter2(1);

        // testar conexão, execução e exclusão com o perfil 1
        System.out.println("TESTANDO USUÁRIO 1(GRATUITO): ");
        appPerfil1.conectar();
        appPerfil1.executar();
        appPerfil1.excluir();
        appPerfil1.desconectar();

        // criar a aplicação para o perfil 2
        BdAdapter2 appPerfil2 = new BdAdapter2(2);

        // testar conexão, execução e exclusão com o perfil 2
        System.out.println("TESTE 1 - USUÁRIO 2(BÁSICO): ");
        appPerfil2.conectar2();
        appPerfil2.executar2();
        appPerfil2.excluir2();
        appPerfil2.desconectar2();
        System.out.println("TESTE 2 - USUÁRIO 2(BÁSICO): ");
        appPerfil1.conectar();
        appPerfil1.executar();
        appPerfil1.excluir();
        appPerfil1.desconectar();

        // criar a aplicação para o perfil 3
        BdAdapter2 appPerfil3 = new BdAdapter2(3);

        // testar conexão, execução e exclusão com o perfil 3
        System.out.println("TESTE 1 - USUÁRIO 3(ULTIMATE):");
        appPerfil3.conectar3();
        appPerfil3.executar3();
        appPerfil3.excluir3();
        appPerfil3.desconectar3();
        
        System.out.println("TESTE 2 - USUÁRIO 3(ULTIMATE):");
        appPerfil2.conectar2();
        appPerfil2.executar2();
        appPerfil2.excluir2();
        appPerfil2.desconectar2();
        
        System.out.println("TESTE 3 - USUÁRIO 3(ULTIMATE):");
        appPerfil1.conectar();
        appPerfil1.executar();
        appPerfil1.excluir();
        appPerfil1.desconectar();
        
        BdAdapter2 appPerfil4 = new BdAdapter2(4);
        
        System.out.println("TESTE 4 - USUÁRIO 4):");
        appPerfil4.conectar();
        appPerfil4.executar();
        appPerfil4.excluir();
        appPerfil4.desconectar();
    }
}