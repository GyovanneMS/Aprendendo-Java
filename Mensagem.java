import javax.swing.JOptionPane;

class Mensagem{
    public static void main(String args[]) {
        JOptionPane jop = new JOptionPane();

        int anoNascimento = jop.showConfirmDialog(null, "Qual o ano do seu nasimento?");

        //String name = jop.showInputDialog(null,"What's your name?");
        //int AnoN = jop.showInputDialog(null,"Em que ano você nasceu?");
        //int AnoHj = jop.showInputDialog(null, "Em que ano estamos?");
        //int Idade = AnoHj - AnoN;
        //jop.showMessageDialog(null, "Sea Bienvenido(a) pessoa com idade" + AnoN ); //name Idade

    }
}