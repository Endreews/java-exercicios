# Java Exercícios Iniciais — DIO

Repositório com os desafios de código do bootcamp **Santander 2026 - Back-End com Java**, da [DIO](https://www.dio.me/), referentes à aula **Fundamentos da Linguagem de Programação Java**.

Cada exercício resolve um problema simples e independente (entrada via `Scanner`, cálculos e estruturas de repetição/condicionais básicas), usado para fixar a sintaxe e os fundamentos da linguagem.

## 🧠 Tecnologias

- Java (JDK 11+)
- IntelliJ IDEA

## 📁 Estrutura do projeto

```
get-started/
├── src/
│   └── desafios/
│       ├── area-quadrado/
│       ├── area-retangulo/
│       ├── calculo-comissao/
│       ├── calculo-salario/
│       ├── calculo-simples/
│       ├── consumo-combustivel/
│       ├── contagem-crescente/
│       ├── contagem-decrescente/
│       ├── diferenca-idade/
│       ├── idade-atual/
│       ├── maior-valor/
│       ├── numeros-pares/
│       └── volume-esfera/
├── .gitignore
├── LICENSE
└── README.md
```

Cada pasta em `src/desafios/` contém um único arquivo `.java` com uma classe `public class` executável (método `main`), correspondente a um desafio da aula.

## 📋 Desafios

| Desafio | Classe | Descrição |
|---|---|---|
| Área do quadrado | `AreaQuadrado` | Calcula a área de um quadrado a partir do lado informado |
| Área do retângulo | `AreaRetangulo` | Calcula a área de um retângulo a partir da base e da altura |
| Cálculo de comissão | `SalarioBonus` | Calcula o salário de um vendedor somando o fixo a 15% de comissão sobre as vendas |
| Cálculo de salário | `Main` | Calcula o salário de um funcionário a partir das horas trabalhadas e do valor da hora |
| Cálculo simples de peças | `CalculoSimples` | Soma o valor total de duas peças a partir de código, quantidade e valor unitário |
| Consumo de combustível | `Consumo` | Calcula o consumo médio (km/l) a partir da distância percorrida e do combustível gasto |
| Contagem crescente | `ContagemCrescente` | Imprime uma contagem de 0 a 10 |
| Contagem decrescente | `ContagemDecresente` | Imprime uma contagem de 10 a 0 |
| Diferença de idade | `IdadeDiferenca` | Calcula a diferença de idade entre duas pessoas |
| Idade atual | `Ano` | Calcula a idade de uma pessoa a partir do ano de nascimento |
| Maior valor | `OMaior` | Identifica o maior entre três valores informados |
| Números pares | `Pares` | Imprime os números pares entre 0 e 20 |
| Volume da esfera | `Esfera` | Calcula o volume de uma esfera a partir do raio |

## ▶️ Como executar

Cada desafio é um arquivo `.java` independente, sem `package` e sem dependências externas. Para executar um deles diretamente pela linha de comando:

```bash
cd src/desafios/<nome-do-desafio>
javac <NomeDaClasse>.java
java <NomeDaClasse>
```

Ou abra o projeto no IntelliJ IDEA e execute a classe desejada com "Run".

## 📄 Licença

Este projeto está sob a licença MIT — veja o arquivo [LICENSE](LICENSE) para mais detalhes.
