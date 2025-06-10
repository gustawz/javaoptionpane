/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ex2.test;
import javax.swing.JOptionPane;

public class CalculadoraMenu {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        int opcao = 0;

        while (opcao != 5) {
            JOptionPane.showMessageDialog(null,
                    "[1] Somar\n" +
                    "[2] Multiplicar\n" +
                    "[3] Maior número\n" +
                    "[4] Novo número\n" +
                    "[5] Sair");

            opcao = Integer.parseInt(JOptionPane.showInputDialog("Qual é sua opção? "));

            if (opcao == 1) {
                int soma = n1 + n2;
                JOptionPane.showMessageDialog(null, "A soma entre " + n1 + " e " + n2 + " é " + soma);
            } else if (opcao == 2) {
                int mult = n1 * n2;
                JOptionPane.showMessageDialog(null, "A multiplicação entre " + n1 + " e " + n2 + " é " + mult);
            } else if (opcao == 3) {
                if (n1 > n2) {
                    JOptionPane.showMessageDialog(null, "Entre " + n1 + " e " + n2 + ", o maior é " + n1);
                } else if (n2 > n1) {
                    JOptionPane.showMessageDialog(null, "Entre " + n1 + " e " + n2 + ", o maior é " + n2);
                } else {
                    JOptionPane.showMessageDialog(null, "Os dois números são iguais!");
                }
            } else if (opcao == 4) {
                JOptionPane.showMessageDialog(null, "Informe os números novamente");
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
            } else if (opcao == 5) {
                JOptionPane.showMessageDialog(null, "Finalizando...");
            } else {
                JOptionPane.showMessageDialog(null, "Erro: opção inválida! Tente novamente.");
            }
        }

        JOptionPane.showMessageDialog(null, "Fim do programa. Volte sempre!");
    }
        
    }
