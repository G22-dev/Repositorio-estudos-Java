# Repositório-estudos-Java
Repositório para testes e exemplos em Java

### Estrutura De Repetição

A estrutura de repetição **for** e utlizda quando se sabe o numero exato de condições a serem repetidas, for deve conter a inicialização, a condição e o incremento em sua estrutura.

```
for (inicialização; condição; incremento) {
    // Bloco a ser repetido.
}
```

como por exemplo:

```
int i;

for (i = 0; i < 5; i++) {
    System.out.println("Contando " + i)
}
```
Neste Codigo o **for** se inicia com i = 0 e o repete ate o i ser menor que 5, quando o codigo começa a rodar o i e incrementado em +1 na referencia de i++, parando assim que o codigo chegar a 5.

o baixo o log gerado deste bloco:

```
Contando 0
Contando 1
Contando 2
Contando 3
Contando 4
```
