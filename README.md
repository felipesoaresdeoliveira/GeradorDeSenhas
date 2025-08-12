
# Gerador de Senhas em Java com Interface Gráfica

Aplicativo simples desenvolvido em Java que gera senhas seguras e personalizadas utilizando uma interface gráfica amigável com JOptionPane.

---

## Funcionalidades

- Geração de senhas aleatórias com letras maiúsculas, minúsculas e números
- Opção para incluir ou não caracteres especiais na senha
- Interface gráfica simples para interação com o usuário
- Possibilidade de gerar várias senhas em sequência

---

## Tecnologias utilizadas

- Java (JDK 7+)
- Swing (`JOptionPane`) para interface gráfica
- Sem dependências externas

---

## Como usar

### Pré-requisitos

- Java instalado em sua máquina (JDK 7 ou superior)
- IDE Java ou execução via terminal

### Passos para executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/felipesoaresdeoliveira/Gerador-de-senhas-em-java.git
   ```

2. Navegue até a pasta do projeto:

   ```bash
   cd Gerador-de-senhas-em-java
   ```

3. Compile o arquivo Java:

   ```bash
   javac GeradorDeSenhas.java
   ```

4. Execute o programa:

   ```bash
   java GeradorDeSenhas
   ```

5. Interaja com a interface para informar o tamanho da senha e se deseja incluir caracteres especiais. O programa exibirá a senha gerada em uma janela.

---

## Como funciona

O programa exibe caixas de diálogo para:

- Perguntar o tamanho da senha desejada
- Perguntar se o usuário deseja incluir caracteres especiais na senha
- Mostrar a senha gerada em uma janela com rolagem, para facilitar a visualização
- Perguntar se deseja gerar outra senha ou finalizar

---

## Exemplo de uso

Ao executar o programa, a interface exibirá:

1. Uma mensagem de boas-vindas.  
2. Caixa de diálogo solicitando o tamanho da senha.  
3. Opção para incluir caracteres especiais (botões Sim/Não).  
4. Senha gerada exibida em uma caixa de texto.  
5. Pergunta para gerar outra senha ou sair.  

---

## Código principal (resumo)

```java
// Método gerarSenha que cria a senha com ou sem caracteres especiais
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
```

---

## Contribuindo

Contribuições são sempre bem-vindas! Se desejar colaborar:

1. Faça um fork do projeto  
2. Crie uma branch com a sua feature (`git checkout -b minha-feature`)  
3. Realize os commits com mensagens claras (`git commit -m 'Minha nova feature'`)  
4. Envie para o repositório remoto (`git push origin minha-feature`)  
5. Abra um Pull Request para revisão

---

## Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Obrigado por usar e contribuir! 🚀
