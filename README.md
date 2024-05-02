# curso_javaBS

# Qual a diferença entre JDK, JRE e JVM

## [O fluxo é basicamente o seguinte:](https://dicasdeprogramacao.com.br/qual-a-diferenca-entre-jdk-jre-e-jvm/)

1. Você escreve o seu código-fonte (arquivo com a extensão **_.java_**)
2. Você utiliza o **JDK** para compilar o seu código-fonte e gerar o arquivo **bytecode** (arquivo com a extensão **_.class_**).

3. Para executar o seu programa, a **JVM** lê o seu arquivo compilado **(.class)** e as bibliotecas padrões do Java que estão no **JRE**.

JDK (Java Development Kit) - é o Kit de Desenvolvimento Java responsável por compilar código-fonte (.java) em bytecode (.class)
JVM (Java Virtual Machine) - é a Máquina Virtual do Java reponsável por executar o bytecode (.class)
JRE (Java Runtime Environment) - Ambiente de Execução do Java que fornece as bibliotecas padrões do Java para o JDK compilar o seu código e para a JVM executar o seu programa.

![Exemplo](https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-1d01e8d4000d0056db55eb3ef028df1826fae21c%252Fimage%2520%2811%29%2520%281%29%2520%281%29%2520%281%29%2520%281%29%2520%281%29%2520%281%29.png%3Falt%3Dmedia&width=768&dpr=4&quality=100&sign=0c2813ab593c22c014e4f130d5f87b373e35a2a1ee0a9144280491d52143a2e4)

## Regras para nomeação de classes

|Ao nomear uma classe algumas convenções devem ser seguidas:|
|------------------------------------------------------------|

 - Manter o nome simples e descritivo;
 - Usar palavras inteiras, isto é, sem siglas e abreviações;
 - Todo arquivo .java deve começar com letra MAIÚSCULA. 
 - Se a palavra for composta, a segunda palavra deve também ser maiúscula, 
 exemplo:
```
Calculadora.java, CalculadoraCientifica.java
```
- Nome da classe no arquivo: A classe deve possuir o mesmo nome do arquivo.java, 

```
// arquivo CalculadoraCientifica.java

public class CalculadoraCientifica {

}
```