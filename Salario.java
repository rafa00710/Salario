package Shadow;

import javax.swing.*;

public class Salario {
    public static void main(String[] args) {

        String cargo;
        int quantidadeFuncionarios;
        float salarioFuncionario;
        float totalSalarios = 0;
        float mediaSalarial ;

        //variável contadora para laço
        
        int contadora = 0;

        cargo = (JOptionPane.showInputDialog(null,"Digite o cargo do funcionário:","cargo",JOptionPane.QUESTION_MESSAGE));

        quantidadeFuncionarios = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de funcionários:","Número de funcionários",JOptionPane.QUESTION_MESSAGE));


        while (contadora < quantidadeFuncionarios){
            contadora++;
            salarioFuncionario = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o salário do funcionário:","Salário",JOptionPane.QUESTION_MESSAGE));
            totalSalarios = totalSalarios + salarioFuncionario;
        }

        mediaSalarial = totalSalarios / quantidadeFuncionarios;
        System.out.println("Cargo: " + cargo);
        System.out.println("Média Salarial = " + mediaSalarial);



    }

}

