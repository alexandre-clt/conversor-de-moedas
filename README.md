# 🪙 Conversor de Moedas em Java

## Um projeto simples e funcional desenvolvido em Java, utilizando a ExchangeRate API para obter cotações de moedas em tempo real.
O objetivo é permitir que o usuário converta valores entre diferentes moedas de forma prática através do console.

## 📌 Objetivo do Projeto

O Conversor de Moedas foi criado com as seguintes finalidades:

Praticar lógica de programação em Java

Utilizar requisições HTTP com HttpClient

Aprender a consumir uma API externa

Trabalhar com JSON utilizando a biblioteca Gson

Criar um programa interativo no console

Entender organização de projeto com packages

## 🚀 Funcionalidades

Conversão entre diversas moedas (USD, BRL, EUR, ARS, etc.)

Busca de taxa de câmbio em tempo real

Interface de texto simples e clara

Tratamento de erros (API indisponível, código incorreto, etc.)

Fácil de ampliar e personalizar

## 💻 Como Usar
**1. Clone o repositório**

`git clone https://github.com/seu-usuario/conversor-moedas.git`

**2. Abra o projeto no IntelliJ / VS Code / Eclipse**

Certifique-se de que tem:

Java 17+

Biblioteca Gson instalada

**3. Coloque sua API Key**

No arquivo principal, substitua pela sua chave:

String apiKey = "SUA_API_KEY_AQUI";


Você pode obter uma chave gratuita em:
`https://www.exchangerate-api.com/`

**4. Execute o programa**

Via terminal:

java Main


Ou clicando em Run na IDE.

## 🧭 Exemplo de Uso

### Quando o programa iniciar, você verá:

### ===== CONVERSOR DE MOEDAS =====
Digite o código da moeda de origem (ex: USD):


Exemplo:

Origem: USD
Destino: BRL
Valor: 10


Saída:

10 USD equivalem a 57.82 BRL

## 🛠️ Tecnologias Utilizadas

Java 17

HttpClient (requisições HTTP)

Gson (Google) para interpretar JSON

Scanner para entrada de dados

ExchangeRate API

## 📚 Aprendizados com o Projeto

✔ Utilização de API real
✔ Trabalhar com JSON no Java
✔ Estruturar um projeto com packages
✔ Criar métodos reutilizáveis
✔ Boas práticas de código

## 📈 Próximos Passos (Melhorias Futuras)

Criar interface gráfica (JavaFX)

Permitir salvar histórico de conversões

Suportar múltiplas conversões em sequência

Tratamento avançado de erros e logs


