# Como usar pytest

Para usar o pytest, basta ter a versão 3.8 ou acima do Python instalada no sistema juntamente
com o pip, então é só rodar o comando:

`pip install pytest`

Depois disso é preciso criar métodos que funcionarão como os casos de teste que incluam alguma
função do pytest um exemplo é o assert:

`assert f() == 1`

Com ele é possível testar se uma condição é verdadeira.

Caso seja necessário que o caso de teste detecte um erro, isso pode ser feito usando a função
with:

`with pytest.raises(NomeDoErro# Como usar pytest

Para usar o pytest, basta ter a versão 3.8 ou acima do Python instalada no sistema juntamente
com o pip, então é só rodar o comando:

`pip install pytest`

Depois disso é preciso criar métodos que funcionarão como os casos de teste que incluam alguma
função do pytest um exemplo é o assert:

`assert f() == 1`

Com ele é possível testar se uma condição é verdadeira.

Caso seja necessário que o caso de teste detecte um erro, isso pode ser feito usando a função
with:

`with pytest.raises(NomeDoErro)# Como usar pytest

Para usar o pytest, basta ter a versão 3.8 ou acima do Python instalada no sistema juntamente
com o pip, então é só rodar o comando:`

`pip install pytest`

Depois disso é preciso criar métodos que funcionarão como os casos de teste que incluam alguma
função do pytest um exemplo é o assert:

`assert f() == 1`

Com ele é possível testar se uma condição é verdadeira.

Caso seja necessário que o caso de teste detecte um erro, isso pode ser feito usando with:

```python
with pytest.raises(NomeDoErro):
    funcao_chamada()
```

Para rodar os testes basta executar:

`pytest nome_arquivo.py`
