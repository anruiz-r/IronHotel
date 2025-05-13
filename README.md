
# **IronHotel - Sistema de Reservas Hotelero  🏨**

## **📌 Descripción del Proyecto**

IronHotel es una aplicación web diseñada para la **gestión de reservas hoteleras**. Permite a los huéspedes reservar habitaciones, a los empleados administrar reservas, y a los administradores gestionar los usuarios del sistema.
---

## 📚 Class Diagram

![Class Diagram](ruta/a/diagrama.png) <!-- Reemplaza con la URL o ruta correcta si la tienes -->

---

## ⚙️ Setup

1. Clona el repositorio:
```bash
git clone https://github.com/anruiz-r/IronHotel.git
cd IronHotel
```

2. Configura tu base de datos MySQL y actualiza `application.properties`:
```properties
spring.application.name=ironhotel
spring.datasource.url=jdbc:mysql://localhost:3306/ironhotel
spring.datasource.username=root
spring.datasource.password=admin
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
server.port=8080

```
3. Ejecuta la aplicación:

---

## 💻 Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Lombok
- Maven
- Postman (testing)
- JUnit (testing)
- Mockito (testing)

---

## 🧭 Controllers and Routes Structure

| Method | Endpoint                         | Description                          |
|--------|----------------------------------|--------------------------------------|
| GET    | `/api/public/reservations`      | Listar todas las reservas            |
| GET    | `/api/public/reservations/{id}` | Obtener una reserva por ID          |
| POST   | `/api/public/reservations`      | Crear una nueva reserva             |
| PUT    | `/api/public/reservations/{id}` | Actualizar una reserva existente    |
| DELETE | `/api/public/reservations/{id}` | Eliminar una reserva por ID         |
| GET    | `/api/public/rooms`             | Listar habitaciones                 |
| GET    | `/api/public/users`             | Listar usuarios                     |

---

## 🔗 Extra Links

- 📌 [Trello Board](https://trello.com/b/CBEI8Qc5/project1)
- 🎤 [Presentation Slides](https://slides.com)
- 📫 [Postman Collection](https://craftshop.postman.co/workspace/My-Workspace~64247626-9b1b-40cf-82e4-df164e396f63/collection/39061244-5ccde0dc-49f7-424a-a40d-19eb2b697f9b?action=share&creator=39061244)

---

## 🔮 Future Work

- Añadir Spring Security con JWT y roles (admin, user)
- Validaciones más robustas (por ejemplo, que `arrivalDate < departureDate`)
- Implementar paginación y búsqueda por filtros (por usuario, fecha, habitación…)
- Añadir Swagger para documentación interactiva
- Posible integración con servicio de pagos o pasarela de check-in

---

## 📚 Resources

- [Documentación oficial de Spring Boot](https://spring.io/projects/spring-boot)
- [Guía de Lombok](https://projectlombok.org/)
- [MySQL Docs](https://dev.mysql.com/doc/)
- [Baeldung Spring Tutorials](https://www.baeldung.com/)

---

## 👥 Team Members

- 👩‍💻 Nombre Apellido – Backend Developer – [@githubUser](https://github.com/githubUser)
- 👨‍💻 Nombre Apellido – Project Manager – [@githubUser2](https://github.com/githubUser2)
