# Mare Estudos - Sistema de Gestão de Estudos

## 🚀 Configuração do Ambiente

### Pré-requisitos
- Java 21
- Maven 3.6+
- MySQL 8.0+

### Configuração das Variáveis de Ambiente

1. **Copie o arquivo de exemplo:**
   ```bash
   cp env.example .env
   ```

2. **Edite o arquivo `.env` com suas configurações:**
   ```bash
   # Configurações do Banco de Dados MySQL
   MYSQL_URL=jdbc:mysql://localhost:3306/mareestudos?createDatabaseIfNotExist=true&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
   MYSQL_USERNAME=seu_usuario
   MYSQL_PASSWORD=sua_senha
   MYSQL_DRIVER=com.mysql.cj.jdbc.Driver
   ```

3. **Configure o MySQL:**
   - Crie um usuário no MySQL ou use o root
   - Ajuste as credenciais no arquivo `.env`

### Executando o Projeto

```bash
# Compilar o projeto
mvn clean compile

# Executar
mvn spring-boot:run
```

### Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── com/nosde/mareestudos/
│   └── resources/
│       ├── application.properties
│       └── db/migration/
└── test/
```

## 🔒 Segurança

- **NUNCA** commite o arquivo `.env` no Git
- Use sempre variáveis de ambiente para credenciais
- O arquivo `.env` está configurado no `.gitignore`

## 📝 Notas

- O banco de dados será criado automaticamente na primeira execução
- As migrações do Flyway serão executadas automaticamente
- O JPA está configurado para atualizar o schema automaticamente
