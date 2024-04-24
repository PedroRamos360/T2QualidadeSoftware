# Framework TestNG

## Introdução

TestNG é um poderoso framework de teste para Java que torna mais fácil escrever testes automatizados, bem como simplifica o processo de execução e relatório dos testes. Ele foi inspirado no JUnit e NUnit, mas introduziu algumas funcionalidades adicionais que o tornam mais flexível e poderoso.

## Características Principais

Anotações Flexíveis: TestNG introduz um conjunto de anotações flexíveis que permitem uma configuração detalhada dos testes, como @Test, @BeforeSuite, @AfterSuite, @BeforeTest, @AfterTest, entre outras.

Suporte a Grupos de Testes: Permite agrupar testes e executá-los de forma independente ou em conjunto. Isso é útil para categorizar testes e executar apenas um conjunto específico, se necessário.

Paralelismo de Testes: TestNG oferece suporte embutido para execução paralela de testes, permitindo que os testes sejam executados de forma mais rápida e eficiente.

Dependências de Testes: É possível definir dependências entre testes, garantindo que um teste específico só seja executado se as dependências forem atendidas.

Suporte a Data Providers: TestNG permite fornecer dados de teste externamente, facilitando a execução dos mesmos testes com diferentes conjuntos de dados.

Relatórios Detalhados: Gera relatórios detalhados sobre a execução dos testes, incluindo informações sobre testes passados e falhados, tempo de execução, exceções lançadas, entre outros.

Integração com Ferramentas de Build: TestNG pode ser facilmente integrado com ferramentas de build populares, como Maven e Gradle, facilitando a inclusão de testes automatizados nos fluxos de trabalho de desenvolvimento.

## Exemplo de Uso

Aqui está um exemplo básico de como escrever e executar testes usando TestNG:

```java
import org.testng.annotations.Test;

public class TestNGExample {

    @Test
    public void testAddition() {
        int result = Calculator.add(3, 5);
        assert result == 8;
    }

    @Test
    public void testSubtraction() {
        int result = Calculator.subtract(10, 5);
        assert result == 5;
    }

}
```

## Conclusão

TestNG é uma ferramenta poderosa para escrever e executar testes automatizados em Java. Sua flexibilidade e recursos avançados o tornam uma escolha popular entre os desenvolvedores para garantir a qualidade do software. Com sua capacidade de suportar anotações, grupos de testes, paralelismo, dependências e relatórios detalhados, TestNG simplifica o processo de teste e melhora a eficiência do desenvolvimento de software.
