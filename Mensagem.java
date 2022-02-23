import javax.swing.JOptionPane;

class Mensagem{
    public static void main(String args[]) {
        JOptionPane jop = new JOptionPane();

        String name = jop.showInputDialog(null,"What's your name?");
        String anoNascimento = jop.showInputDialog(null, "Qual é o ano do seu nascimento?");
        int anoN = Integer.parseInt(anoNascimento);
        int idade = 2022 - anoN;
        jop.showMessageDialog(null, "Sea Bienvenido(a) " + name + ", com " +  idade + " de idade" ); //name Idade
        
        //int AnoN = jop.showInputDialog(null,"Em que ano você nasceu?");
        //int AnoHj = jop.showInputDialog(null, "Em que ano estamos?");
        //

    }
}

/* 
git add . 
git commit -m "Atualização de código"
git push
*/