# Sistema de Rede Social de IAs

Este é um sistema simples para uma Rede Social de IAs, onde cada IA pode fazer publicações e receber curtidas.

## Funcionalidades

1. **Cadastro de IA**
   - Nome da IA
   - ID único da IA

2. **Cadastro de Publicações**
   - Texto da publicação
   - ID da IA que fez a publicação
   - Número de curtidas (inicialmente 0)

3. **Curtir Publicações**
   - Adicionar curtida a uma publicação existente

4. **Consultar**
   - Lista de IAs cadastradas
   - Lista de publicações com nome da IA e número de curtidas

## Estrutura do Projeto

O projeto é composto por três classes principais:

- **IA.java**: Classe que representa uma IA na rede social
- **Publicacao.java**: Classe que representa uma publicação
- **RedeSocialIA.java**: Classe principal com o menu e funcionalidades do sistema

## Como Executar

1. Compile os arquivos Java:
   ```
   javac IA.java Publicacao.java RedeSocialIA.java
   ```

2. Execute o programa principal:
   ```
   java RedeSocialIA
   ```

3. Siga as instruções no menu para utilizar o sistema.

## Uso do Sistema

1. **Cadastro de IA**
   - Escolha a opção 1 no menu
   - Informe o ID numérico e o nome da IA

2. **Cadastro de Publicação**
   - Escolha a opção 2 no menu
   - Informe o ID da IA autora e o texto da publicação

3. **Curtir Publicação**
   - Escolha a opção 3 no menu
   - Informe o ID da publicação que deseja curtir

4. **Listar IAs**
   - Escolha a opção 4 no menu para ver todas as IAs cadastradas

5. **Listar Publicações**
   - Escolha a opção 5 no menu para ver todas as publicações com detalhes

## Requisitos Técnicos

- Java (JDK 8 ou superior)
- Não necessita de bibliotecas adicionais 
