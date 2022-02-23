import javax.swing.JOptionPane;

class Mensagem{
    public static void main(String args[]) {
        JOptionPane jop = new JOptionPane();

        String name = jop.showInputDialog(null,"What's your name?");
        int anoNascimento = Integer.parseInt(jop.showInputDialog(null, "Qual é o ano do seu nascimento?"));
        double altura = Double.parseDouble(jop.showInputDialog(null, "Qual a sua altura?"));
        int peso = Integer.parseInt(jop.showInputDialog(null, "Qual é o seu peso aproximadamente? (sem vírgula, como por exemplo 90)" ));
        double peso2 = Math.pow(2, peso);
        double iMC = altura / peso2;
        int idade = 2022 - anoNascimento;
        jop.showMessageDialog(null, "Sea Bienvenido(a) " + name + ", com " +  idade + " anos de idade!!" );
        jop.showMessageDialog(null, "Seu IMC é igual a " + iMC + "!" );
        

    }
}

/* 
Não faz parte do código...
git add . 
git commit -m "Atualização de código"
git push
*/