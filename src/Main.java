import view.FuncionarioView;

/**
 * Main TEMPORARIA — so para testar o modulo do Aluno 1 sozinho.
 *
 * Na integracao final, o Aluno 5 substitui isto pela MenuPrincipalView,
 * que junta os menus de todos os modulos.
 */
public class Main {

    public static void main(String[] args) {
        FuncionarioView view = new FuncionarioView();
        view.exibirMenu();
    }
}
