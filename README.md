# Mare Estudos - Study Management System

[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://openjdk.java.net/projects/jdk/21/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.4-green.svg)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-8.0+-blue.svg)](https://www.mysql.com/)
[![Maven](https://img.shields.io/badge/Maven-3.6+-red.svg)](https://maven.apache.org/)

A comprehensive study management system built with Spring Boot, designed to help students and educators organize and track their academic activities.

## 🚀 Features

- **User Management**: Secure authentication and authorization
- **Study Planning**: Create and manage study schedules
- **Progress Tracking**: Monitor learning progress and achievements
- **Database Management**: Automatic schema creation and updates
- **RESTful API**: Modern web service architecture
- **Security**: Built-in Spring Security with JWT support

## 🛠️ Technology Stack

- **Backend**: Spring Boot 3.5.4
- **Database**: MySQL 8.0+
- **ORM**: Spring Data JPA with Hibernate
- **Security**: Spring Security
- **Build Tool**: Maven
- **Java Version**: 21

## 📋 Prerequisites

Before running this application, make sure you have the following installed:

- **Java 21** or higher
- **Maven 3.6** or higher
- **MySQL 8.0** or higher
- **Git** (for cloning the repository)

## 🚀 Quick Start

### 1. Clone the Repository

```bash
git clone <your-repository-url>
cd mareestudos
```

### 2. Environment Configuration

1. **Copy the environment template:**
   ```bash
   cp env.example .env
   ```

2. **Edit the `.env` file with your database settings:**
   ```bash
   # MySQL Database Configuration
   MYSQL_URL=jdbc:mysql://localhost:3306/mareestudos?createDatabaseIfNotExist=true&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
   MYSQL_USERNAME=root
   MYSQL_PASSWORD=your_password
   
   # Application Configuration
   SERVER_PORT=8080
   SPRING_APPLICATION_NAME=mareestudos
   ```

3. **Configure MySQL:**
   - Ensure MySQL is running on your system
   - Create a database user or use root (not recommended for production)
   - Update credentials in the `.env` file

### 3. Run the Application

```bash
# Clean and compile the project
./mvnw clean compile

# Run the application
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080`

## 🏗️ Project Structure

```
mareestudos/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/nosde/mareestudos/
│   │   │       ├── controllers/     # REST API endpoints
│   │   │       ├── services/        # Business logic
│   │   │       ├── repositories/    # Data access layer
│   │   │       ├── models/          # Entity classes
│   │   │       └── config/          # Configuration classes
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/              # Static resources
│   └── test/                        # Test files
├── pom.xml                          # Maven configuration
├── env.example                      # Environment template
└── README.md                        # This file
```

## 🔧 Configuration

### Database Configuration

The application automatically:
- Creates the database if it doesn't exist
- Updates the schema based on JPA entities
- Configures connection pooling with HikariCP

### Security Configuration

- **Default Security**: Basic authentication enabled
- **Generated Password**: Check console logs for the generated password
- **Custom Security**: Extend `SecurityConfig` for custom authentication

## 🧪 Testing

```bash
# Run all tests
./mvnw test

# Run tests with coverage
./mvnw test jacoco:report
```

## 📦 Building

```bash
# Create JAR file
./mvnw clean package

# Run JAR file
java -jar target/mareestudos-0.0.1-SNAPSHOT.jar
```

## 🔒 Security Best Practices

- **Never commit** the `.env` file to Git
- **Use environment variables** for sensitive data
- **The `.env` file is configured** in `.gitignore`
- **Update default passwords** before production deployment
- **Enable HTTPS** in production environments

## 🌍 Environment Variables

| Variable | Description | Default Value |
|----------|-------------|---------------|
| `MYSQL_URL` | MySQL connection URL | `jdbc:mysql://localhost:3306/mareestudos?...` |
| `MYSQL_USERNAME` | Database username | `root` |
| `MYSQL_PASSWORD` | Database password | `root` |
| `SERVER_PORT` | Application port | `8080` |
| `SPRING_APPLICATION_NAME` | Application name | `mareestudos` |

## 📝 Development Notes

- **Auto-schema**: Database schema is automatically created/updated
- **No Flyway**: Database migrations are handled by JPA/Hibernate
- **Hot Reload**: Changes are automatically detected during development
- **Logging**: Comprehensive logging with configurable levels

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🆘 Support

If you encounter any issues:

1. Check the [Issues](../../issues) page
2. Review the application logs
3. Verify your environment configuration
4. Create a new issue with detailed information

## 🔮 Roadmap

- [ ] User registration and authentication
- [ ] Study plan creation and management
- [ ] Progress tracking and analytics
- [ ] Mobile application
- [ ] API documentation with Swagger
- [ ] Docker containerization
- [ ] CI/CD pipeline setup

---

**Made with ❤️ by the Mare Estudos Team**
