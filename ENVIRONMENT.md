# Configuração de Variáveis de Ambiente

## Variáveis Necessárias

### Banco de Dados MySQL
```bash
MYSQL_URL=jdbc:mysql://localhost:3306/mareestudos?createDatabaseIfNotExist=true&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
MYSQL_USERNAME=root
MYSQL_PASSWORD=root
```

### Aplicação
```bash
SERVER_PORT=8080
```

## Como Configurar

### Windows (PowerShell)
```powershell
$env:MYSQL_URL="jdbc:mysql://localhost:3306/mareestudos?createDatabaseIfNotExist=true&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true"
$env:MYSQL_USERNAME="root"
$env:MYSQL_PASSWORD="root"
```

### Windows (CMD)
```cmd
set MYSQL_URL=jdbc:mysql://localhost:3306/mareestudos?createDatabaseIfNotExist=true&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
set MYSQL_USERNAME=root
set MYSQL_PASSWORD=root
```

### Linux/Mac
```bash
export MYSQL_URL="jdbc:mysql://localhost:3306/mareestudos?createDatabaseIfNotExist=true&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true"
export MYSQL_USERNAME="root"
export MYSQL_PASSWORD="root"
```

## Valores Padrão
Se as variáveis não estiverem definidas, a aplicação usará os valores padrão definidos no `application.properties`.
