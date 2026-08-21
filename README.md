# Exercícios iniciais de Java — DIO

Exercícios que fiz durante o módulo "Fundamentos da Linguagem de Programação Java",
do bootcamp Santander na DIO. São programas pequenos de console, cada um focado em
um conceito: entrada de dados, operadores, condicionais e laços de repetição.

## Como rodar

Requer JDK 21 (o projeto foi escrito nessa versão, mas os exercícios funcionam a
partir do Java 8).

```bash
javac src/desafios/area-quadrado/AreaQuadrado.java -d out
java -cp out AreaQuadrado
```

Trocando o caminho e o nome da classe, o mesmo comando vale para qualquer exercício.
Pela IDE, é só abrir o arquivo e rodar o `main`.

## Exercícios

| Pasta | Classe | O que faz |
|---|---|---|
| `area-quadrado` | `AreaQuadrado` | Calcula a área de um quadrado a partir do lado |
| `area-retangulo` | `AreaRetangulo` | Calcula a área de um retângulo a partir da base e da altura |
| `calculo-comissao` | `SalarioBonus` | Soma o salário fixo com 15% de comissão sobre as vendas |
| `calculo-salario` | `Main` | Calcula o salário pelas horas trabalhadas e o valor da hora |
| `calculo-simples` | `CalculoSimples` | Soma o valor total de duas peças (quantidade × preço) |
| `consumo-combustivel` | `Consumo` | Calcula o consumo médio em km/l |
| `contagem-crescente` | `ContagemCrescente` | Imprime de 0 a 10 usando `while` |
| `contagem-decrescente` | `ContagemDecresente` | Imprime de 10 a 0 usando `while` |
| `diferenca-idade` | `IdadeDiferenca` | Mostra a diferença de idade entre duas pessoas |
| `idade-atual` | `Ano` | Calcula a idade a partir do ano de nascimento |
| `maior-valor` | `OMaior` | Descobre o maior entre três números |
| `numeros-pares` | `Pares` | Imprime os números pares de 0 a 20 |
| `volume-esfera` | `Esfera` | Calcula o volume de uma esfera a partir do raio |

## Estrutura

```
src/desafios/
  <nome-do-desafio>/
    <Classe>.java
```

Cada exercício fica em sua própria pasta para ficar fácil de achar. Os arquivos
não usam `package`, então a classe é executada direto pelo nome.

## Observação sobre a entrada

Parte dos exercícios (os que vieram de plataformas de desafio) lê os dados
direto do `Scanner`, sem imprimir mensagem pedindo o valor. Se ao rodar a tela
ficar parada, é porque o programa está esperando você digitar a entrada e
pressionar Enter.
