# Jest

## Instalação:

Antes de tudo, é preciso ter o Node.js instalado em seu sistema. É possível verificar isso digitando node -v no
terminal.

Depois de ter o Node.js instalado, você pode instalar o Jest usando npm (Node Package Manager) ou Yarn. Abra seu terminal e execute um dos seguintes comandos, dependendo do seu gerenciador de pacotes:

## Com Yarn:

```bash
yarn add jest
```

Isso instalará o Jest como uma dependênciaem seu projeto.

## Configuração:

Por padrão, o Jest espera que seus testes estejam em um diretório chamado **tests** ou que tenham o sufixo .test.js
ou .spec.js. Se você deseja configurar o diretório de testes ou a extensão dos arquivos de teste, você pode criar
um arquivo jest.config.js na raiz do seu projeto e definir essas opções lá.

Exemplo de jest.config.js:

```typescript
module.exports = {
  testMatch: ["**/__tests__/**/*.js?(x)", "**/?(*.)+(spec|test).js?(x)"],
  testEnvironment: "node",
  preset: "ts-node",
};
```

Escrevendo Testes:
Agora que você tem o Jest configurado, você pode começar a escrever seus testes. Crie um arquivo de teste com o sufixo .test.js ou .spec.js dentro do diretório de testes ou em qualquer lugar que você configurou para seus testes.

Exemplo de um arquivo de teste math.test.js:

```typescript
// math.ts
export function sum(a: number, b: number) {
  return a + b;
}

// math.test.ts
import { sum } from "./math.ts";

test("adds 1 + 2 to equal 3", () => {
  expect(sum(1, 2)).toBe(3);
});
```

Principais Funções do Jest:
`test(name, fn, timeout)`: Define um novo caso de teste. name é uma descrição do caso de teste, fn é a função que contém a lógica do teste, e timeout é um valor opcional que determina quanto tempo o Jest aguardará até que o teste seja considerado falho.

`expect(value)`: Utilizado dentro de um caso de teste para afirmar expectativas sobre os resultados. Pode ser encadeado com funções de asserção, como toBe(), toEqual(), not.toBe(), etc.

Matchers: São funções utilizadas com expect() para verificar valores. Alguns exemplos incluem toBe(), toEqual(), not.toBe(), toContain(), toThrow(), entre outros.

beforeEach(fn), afterEach(fn), beforeAll(fn), afterAll(fn): Funções que permitem executar código antes ou depois de cada caso de teste (beforeEach e afterEach) ou antes ou depois de todos os casos de teste em um arquivo (beforeAll e afterAll).

Mock Functions: O Jest fornece a capacidade de criar funções simuladas, também conhecidas como mocks. Isso é útil para simular comportamentos de funções, métodos ou módulos em seus testes.

Com essas ferramentas, você pode começar a escrever testes eficazes para seu código JavaScript usando o Jest. Lembre-se de que a prática é fundamental para se tornar proficiente na escrita de testes de qualidade.
