# 📝 BoardProject

Um sistema simples de gerenciamento de **boards**, **colunas** e **cards**, com suporte a bloqueio, desbloqueio, movimentação e cancelamento de cards.  
O projeto foi desenvolvido em **Java**, utilizando **SpringBoot**, **MySQL**.

---

## 📌 Funcionalidades

- Criar boards com colunas personalizadas.
- Adicionar, mover, cancelar, bloquear e desbloquear cards.
- Visualizar detalhes de boards, colunas e cards.
- Persistência em banco de dados MySQL usando JDBC.
- Migrações de banco via **Liquibase**.

---

## 📂 Estrutura do Projeto

O projeto está dividido nas seguintes camadas:

### **Entity**
Modelos que representam as entidades do domínio:
- `BoardEntity` → Representa um quadro.
- `BoardColumnEntity` → Representa uma coluna do quadro.
- `CardEntity` → Representa um card dentro de uma coluna.
- `BlockEntity` → Representa o bloqueio de um card.
- `BoardColumnKindEnum` → Enum para tipos de coluna: `INITIAL`, `FINAL`, `CANCEL`, `PENDING`.

### **DAO (Data Access Object)**
Classes responsáveis pela comunicação com o banco de dados:
- `BoardDAO`
- `BoardColumnDAO`
- `CardDAO`
- `BlockDAO`

### **DTO**
Objetos de transferência de dados:
- `BoardDetailsDTO`
- `BoardColumnDTO`
- `BoardColumnInfoDTO`
- `CardDetailsDTO`

### **Service**
Camada de regras de negócio:
- `BoardService` / `BoardQueryService`
- `BoardColumnQueryService`
- `CardService` / `CardQueryService`

### **Exception**
Exceções personalizadas:
- `EntityNotFoundException`
- `CardBlockedException`
- `CardFinishedException`

### **UI (Interface de Usuário via Console)**
Menus para interação via terminal:
- `MainMenu` → Menu principal para criar, selecionar ou deletar boards.
- `BoardMenu` → Menu interno para operações de cards dentro de um board.

---

## ⚙️ Requisitos

- **Java 17+**
- **MySQL 8+**
- **Maven** ou **Gradle**
- **Lombok**

