/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author Aluno
 */
public class BdAdapter2 {
    private ParadoxAdapter paradoxAdapter;
    private FirebirdAdapter firebirdAdapter;
    private MySQLAdapter mySqlAdapter;

    public BdAdapter2(int perfil) {
        switch (perfil) {
            case 1:
                paradoxAdapter = new ParadoxAdapter();
                break;
            case 2:
                firebirdAdapter = new FirebirdAdapter();
                paradoxAdapter = new ParadoxAdapter();
                break;
            case 3:
                mySqlAdapter = new MySQLAdapter();
                firebirdAdapter = new FirebirdAdapter();
                paradoxAdapter = new ParadoxAdapter();
                break;
            default:
                throw new IllegalArgumentException("Perfil inválido: " + perfil);
        }
    }

    public void conectar() {
        paradoxAdapter.conectar();
    }

    public void desconectar() {
        paradoxAdapter.desconectar();
    }

    public void executar() {
        paradoxAdapter.executar();
    }

    public void excluir() {
        paradoxAdapter.excluir();
    }
    
    public void conectar2() {
        firebirdAdapter.conectar();
    }

    public void desconectar2() {
        firebirdAdapter.desconectar();
    }

    public void executar2() {
       firebirdAdapter.executar();
    }

    public void excluir2() {
        firebirdAdapter.excluir();
    }
    
    public void conectar3() {
        mySqlAdapter.conectar();
    }

    public void desconectar3() {
        mySqlAdapter.desconectar();
    }

    public void executar3() {
       mySqlAdapter.executar();
    }

    public void excluir3() {
        mySqlAdapter.excluir();
    }
}