import javax.swing.JOptionPane;

class Mensagem{
    public static void main(String args[]) {
        JOptionPane jop = new JOptionPane();

        String name = jop.showInputDialog(null,"What's your name?");
        int anoNascimento = Integer.parseInt(jop.showInputDialog(null, "Qual é o ano do seu nascimento?"));
        int idade = 2022 - anoNascimento;
        jop.showMessageDialog(null, "Sea Bienvenido(a) " + name + ", com " +  idade + " anos de idade!!" );
        

    }
}

/* 
Não faz parte do código...
git add . 
git commit -m "Atualização de código"
git push
*/