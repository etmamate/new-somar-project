# 🌐 Projeto Somar

O **Somar** é uma plataforma digital com proposta de impacto social, funcionando como uma rede colaborativa que conecta **ONGs** e **doadores/voluntários**, facilitando a criação de campanhas e a solicitação de ajuda para causas sociais.

---

## 🎯 Objetivo

O objetivo do Somar é:

- Facilitar a arrecadação de recursos para ONGs  
- Conectar pessoas dispostas a ajudar com instituições que precisam de suporte  
- Promover transparência e engajamento em ações sociais  

---

## 🧩 Funcionalidades Principais

### 👤 Usuários
- Cadastro e autenticação
- Perfis com diferentes papéis:
  - Doador
  - ONG
  - Administrador

---

### 🏢 ONGs
- Cadastro de informações institucionais
- Gerenciamento de campanhas
- Criação de solicitações de serviços

---

### 💰 Campanhas
- Criação de campanhas de arrecadação
- Definição de meta financeira
- Acompanhamento de progresso
- Registro de doações

---

### 🤝 Doações
- Usuários podem contribuir financeiramente
- Histórico de doações
- Transparência de valores arrecadados

---

### 🛠️ Serviços (Voluntariado)
- ONGs podem solicitar ajuda (ex: transporte, eventos, apoio logístico)
- Usuários podem se candidatar como voluntários
- Controle de status das solicitações

---

## 🏗️ Modelagem do Sistema

### Entidades principais:

- **Usuário**
- **Ong**
- **Campanha**
- **Doação**
- **Serviços**
- **Vuluntários**

---

### 🔗 Relacionamentos

- Um usuário pode estar associado a uma ONG
- Uma ONG pode criar várias campanhas
- Uma campanha pode receber várias doações
- Um usuário pode realizar várias doações
- Uma ONG pode criar vários serviços
- Um serviço pode ter vários voluntários

---

## 🧠 Regras de Negócio

- Apenas usuários com perfil de ONG podem criar campanhas e serviços  
- Doações só podem ser feitas em campanhas ativas  
- Serviços possuem estados (aberto, em andamento, concluído)  
- Voluntários precisam ser aprovados pela ONG  

---

## ⚙️ Tecnologias Utilizadas

### Frontend
- Angular

### Backend
- Java
- Spring Boot
- Spring Data JPA

### Banco de Dados
- PostgreSQL (via Supabase)

### Autenticação
- JWT ou Supabase Auth (a definir)

---

## 🚀 Possíveis Evoluções

- Sistema de avaliações (ONG ↔ voluntários)
- Chat interno
- Notificações em tempo real
- Integração com meios de pagamento
- Geolocalização de serviços
- Aplicativo mobile 

---

## 📌 Status do Projeto

🚧 Em desenvolvimento — fase de modelagem e estruturação backend

---

## 🤝 Contribuição

Sugestões e melhorias são bem-vindas!  
Sinta-se à vontade para abrir issues ou pull requests.
