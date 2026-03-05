## Simulação de Fone de Ouvido em Java

Este projeto é uma demonstração prática de conceitos fundamentais de **Programação Orientada a Objetos (POO)**, que aprendi em aula utilizando a analogia de um fone de ouvido para explicar classes, objetos e métodos.

## Analogia

No mundo real, um fone de ouvido possui estados (volume, se está tocando ou pausado) e comportamentos (aumentar som). No código, traduzimos isso da seguinte forma:

- **Classe:** O projeto/molde do fone.
- **Objeto:** Uma unidade específica do fone.
- **Atributos:** As características atuais (Volume em 85%).
- **Métodos:** As ações que o fone executa.

## Funcionalidades
a o volume e exibe um alerta no console caso o nível ultrapasse **75%**, visando a saúde auditiva usuário.

## Exemplo de Uso

```java
// Criando o fone (Objeto)
Fone meuFone = new Fone(10, 10);

// Alterando o volume para um nível alto
meuFone.mudarVolume(85); 

// Saída esperada no console:
// "Cuidado, seu volume pode prejudicar seus tímpanos"
O sistema permite:
1.  **Instanciar um fone** com um volume inicial.
2.  **Alterar o volume** através do método "mudarVolume".
3.  **Sistema de Segurança:** O fone monitor
