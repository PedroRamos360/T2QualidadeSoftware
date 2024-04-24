# Framework Pytest

## Introdução

Pytest é um framework de teste para Python que simplifica o processo de escrita, organização e execução de testes automatizados. Ele foi projetado para ser simples de usar, enquanto oferece poderosas funcionalidades para testar diversos tipos de código Python, desde pequenas funções até grandes aplicações.

## Características Principais

Sintaxe Simples e Concisa: Pytest utiliza uma sintaxe simples e intuitiva para escrever testes, tornando-o fácil de aprender e usar para desenvolvedores de todos os níveis de experiência.

Detecção Automática de Testes: Pytest possui um mecanismo de descoberta automática de testes, o que significa que ele pode encontrar e executar automaticamente todos os testes dentro de um projeto Python, sem a necessidade de configuração manual.

Anotações Flexíveis: Assim como o TestNG, Pytest oferece suporte a anotações flexíveis para personalizar o comportamento dos testes, como @pytest.fixture, @pytest.mark.parametrize, @pytest.mark.skip, @pytest.mark.xfail, entre outras.

Extensibilidade: Pytest é altamente extensível e permite que os desenvolvedores escrevam plugins personalizados para estender suas funcionalidades conforme necessário.

Integração com Ferramentas de Build: Pytest pode ser facilmente integrado com diversas ferramentas de build e automação, como pytest-runner, tox, e outros, tornando-o uma escolha popular para inclusão de testes automatizados em pipelines de CI/CD.

Relatórios Detalhados: Gera relatórios detalhados sobre a execução dos testes, incluindo informações sobre testes passados e falhados, tempo de execução, exceções lançadas, entre outros, facilitando a identificação e resolução de problemas.

Suporte a Cobertura de Código: Pytest oferece suporte integrado para geração de relatórios de cobertura de código, permitindo que os desenvolvedores avaliem a qualidade dos testes em relação ao código fonte.

## Exemplo de Uso

Aqui está um exemplo básico de como escrever e executar testes usando Pytest:

```python
# test_example.py

def add(x, y):
return x + y

def test_addition():
assert add(3, 5) == 8

def test_subtraction():
assert add(10, 5) == 15
```

Para executar os testes, basta executar o comando pytest no terminal na pasta onde os arquivos de teste estão localizados.

## Conclusão

Pytest é uma ferramenta poderosa e fácil de usar para escrever e executar testes automatizados em Python. Com sua sintaxe simples, detecção automática de testes, anotações flexíveis e extensibilidade, Pytest simplifica o processo de teste e melhora a qualidade do software Python. Seus recursos avançados, como integração com ferramentas de build, relatórios detalhados e suporte a cobertura de código, fazem dele uma escolha popular entre os desenvolvedores Python para garantir a qualidade do código e a confiabilidade das aplicações.
