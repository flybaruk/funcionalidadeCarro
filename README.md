# **Projeto: Simulador de Controle de Carro**

Este projeto implementa um sistema que simula o funcionamento básico de um carro, permitindo ligar, desligar, acelerar, frear, trocar marchas e verificar a velocidade.

## **Funcionalidades do sistema**
O código controla as seguintes funções do carro:

- **Ligar o carro**  
- **Desligar o carro**  
- **Acelerar** (incrementa 1 km/h por vez, até o máximo de 120 km/h)  
- **Diminuir a velocidade** (reduz 1 km/h por vez, até o mínimo de 0 km/h)  
- **Trocar de marcha** (seguindo a sequência correta, sem pular marchas)  
- **Virar para esquerda/direita** (desde que a velocidade esteja entre 1 km/h e 40 km/h)  
- **Verificar a velocidade atual**  

## **Regras de implementação**

1. O carro começa desligado, em ponto morto (marcha 0) e com velocidade 0.  
2. O carro desligado não pode realizar nenhuma ação.  
3. Só é possível desligar o carro se ele estiver em ponto morto e com velocidade 0.  
4. A troca de marchas deve seguir a sequência correta, sem pular marchas.  
5. A velocidade permitida por marcha é:  
   - **Marcha 0 (ponto morto)** → Não pode acelerar.  
   - **1ª marcha** → 0 km/h a 20 km/h  
   - **2ª marcha** → 21 km/h a 40 km/h  
   - **3ª marcha** → 41 km/h a 60 km/h  
   - **4ª marcha** → 61 km/h a 80 km/h  
   - **5ª marcha** → 81 km/h a 100 km/h  
   - **6ª marcha** → 101 km/h a 120 km/h  
6. Só pode virar se a velocidade estiver entre 1 km/h e 40 km/h.  

---

## **Aprendizados com este projeto**
Este projeto ajudou a consolidar diversos conceitos de lógica de programação e controle de estados, incluindo:

- **Estados e transições** → O carro tem estados como "ligado/desligado" e "marcha atual", que determinam quais ações são permitidas.  
- **Condicionais e regras de negócio** → As verificações garantem que o carro só acelere, freie ou troque de marcha dentro dos limites estabelecidos.  
- **Manipulação de variáveis** → Velocidade e marcha precisam ser atualizadas corretamente para manter a simulação realista.  
- **Validação de entrada** → Restrições foram aplicadas para impedir mudanças inválidas de marcha ou aceleração fora dos limites permitidos.  

Esse projeto é uma ótima base para desenvolver um simulador mais completo no futuro, podendo incluir consumo de combustível, frenagem mais realista e até um modelo gráfico.
