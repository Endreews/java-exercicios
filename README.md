# desafios java

Uns exercícios de Java que fui fazendo pra treinar a base: entrada de dados,
operadores, condicional, laço, e algumas classes simples pra representar
conta bancária, retângulo e triângulo. Nada muito elaborado, é só prática.

Escrevi em JDK 21, mas não usa nada específico da versão, deve rodar de boa
a partir do Java 8 também.

## como tá organizado

```
src/
  entities/     (Account, Rectangle, Triangle, usadas por alguns exercícios)
  exercicios/   (todos os exercícios, package exercicios)
```

Todo mundo em `exercicios/` está no mesmo package. ContaBancaria, Retangulo
e triangulo usam as classes de `entities/`, então precisam compilar junto
com ela.

## rodando

```bash
javac -d out src/exercicios/*.java src/entities/*.java
java -cp out exercicios.AreaQuadrado
```

Muda o nome da classe no final e serve pra qualquer um dos exercícios.

Se for pela IDE é mais simples ainda, só abrir o arquivo e dar run no main.

## o que cada um faz

- Ano: idade a partir do ano de nascimento
- AreaQuadrado: área do quadrado a partir do lado
- AreaRetangulo: área do retângulo a partir da base e altura
- CalculoSimples: valor total de duas peças (quantidade vezes preço)
- Consumo: consumo médio em km/l
- ContaBancaria: lê titular, saldo e depósito, mostra o saldo final
- Contagem: imprime os pares de 0 a 20
- ContagemCrescente: 0 a 10 com while
- ContagemDecresente: 10 a 0 com while
- Distancia: converte distância em minutos de percurso
- DistanciaDoisPontos: distância entre dois pontos (x, y)
- Esfera: volume da esfera a partir do raio
- IdadeDiferenca: diferença de idade entre duas pessoas
- Main: salário pelas horas trabalhadas vezes valor da hora
- OMaior: o maior entre três números
- Pares: pares de 0 a 20
- Retangulo: área, perímetro e diagonal de um retângulo
- SalarioBonus: salário fixo + 15% de comissão sobre vendas
- triangulo: compara a área de dois triângulos e diz qual é maior

## detalhe chato

Boa parte dos exercícios lê direto do Scanner sem avisar o que esperar. Se a
tela ficar parada depois de rodar, é só digitar o valor e dar Enter.
