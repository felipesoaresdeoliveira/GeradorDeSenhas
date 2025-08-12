import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class GeradorDeSenhas {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Olá, seja bem-vindo(a) ao Gerador de Senhas!", "Gerador de Senhas", JOptionPane.INFORMATION_MESSAGE);
        
        do {
            String tamanhoStr = JOptionPane.showInputDialog(null, "Qual o tamanho da senha a ser gerada?", "Gerador de Senhas", JOptionPane.QUESTION_MESSAGE);
            
            if (tamanhoStr == null || tamanhoStr.isEmpty()) break;
            
            int tamanhoSenha = Integer.parseInt(tamanhoStr);

            Object[] opcoes = { "Sim", "Não" };
            int resposta = JOptionPane.showOptionDialog(null, 
                "Deseja que a senha tenha caracteres especiais? (#, @, !, etc.)", 
                "Gerador de Senhas", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, opcoes, opcoes[0]);

            boolean usarEspeciais = (resposta == JOptionPane.YES_OPTION);

            String senhaGerada = gerarSenha(tamanhoSenha, usarEspeciais);

            JTextArea textArea = new JTextArea(senhaGerada);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setPreferredSize(new Dimension(350, 100));

            JOptionPane.showMessageDialog(null, scrollPane, "Senha Gerada", JOptionPane.INFORMATION_MESSAGE);

        } while (JOptionPane.showConfirmDialog(null, "Deseja gerar outra senha?", "Gerador de Senhas", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null, "Obrigado por usar o Gerador de Senhas!", "Gerador de Senhas", JOptionPane.INFORMATION_MESSAGE);
    }

    public static String gerarSenha(int tamanho, boolean usarEspeciais) {
        String caracteresNormais = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String caracteresComEspeciais = caracteresNormais + "!@#$%&*()/-_=+";
        
        String caracteres = usarEspeciais ? caracteresComEspeciais : caracteresNormais;

        Random random = new Random();
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            int indice = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(indice));
        }

        return senha.toString();
    }
}
