
# **IronHotel - Sistema de Reservas Hotelero  🏨**

## **📌 Descripción del Proyecto**

IronHotel es una aplicación web diseñada para la **gestión de reservas hoteleras** de forma simplificada para la presentación del proyecto 1 del curso JAVA BACKEND de IRONHACK y OPENBANK. Esta aplicación permite a los huéspedes reservar habitaciones, a los empleados administrar reservas, y a los administradores gestionar los usuarios del sistema.
---

## 📚 Class Diagram

![Class Diagram](src/main/resources/images/image.png)

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
3. Ejecuta la aplicación con tu IDE preferido o cualquier otro método de tu elección.

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

| Method | Endpoint                        | Description                      |
|--------|---------------------------------|----------------------------------|
| GET    | `/api/public/reservations`      | Listar todas las reservas        |
| GET    | `/api/public/reservations/{id}` | Obtener una reserva por ID       |
| POST   | `/api/public/reservations`      | Crear una nueva reserva          |
| PUT    | `/api/public/reservations/{id}` | Actualizar una reserva existente |
| DELETE | `/api/public/reservations/{id}` | Eliminar una reserva por ID      |
| GET    | `/api/public/rooms`             | Listar habitaciones              |
| GET    | `/api/public/users`             | Listar usuarios                  |
|POST    | `/api/public/users`             | Crear usuarios                   |     

---

## 🔗 Extra Links

- 📌 [Trello Board](https://trello.com/b/CBEI8Qc5/project1)
- 🎤 [Presentation Slides](https://www.canva.com/design/DAGnU3G9gAk/xpXPNnJSJ6cQ8cX80CXaEw/edit?utm_content=DAGnU3G9gAk&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)
- 📫 [Postman Collection](https://craftshop.postman.co/workspace/My-Workspace~64247626-9b1b-40cf-82e4-df164e396f63/collection/39061244-5ccde0dc-49f7-424a-a40d-19eb2b697f9b?action=share&creator=39061244)

---

## 🔮 Future Work

- Implementar correctamente Spring Security con JWT y roles (admin, user) ya que ahora no termina de funcionar.
- Validaciones más robustas (por ejemplo, que `arrivalDate < departureDate`)
- Posible integración de entidades de pago
- Hacer posible la funcionalidad de check-in /check-out

---

## 📚 Resources

- [Documentación oficial de Spring Boot](https://spring.io/projects/spring-boot)
- [Guía de Lombok](https://projectlombok.org/)
- [MySQL Docs](https://dev.mysql.com/doc/)
- [Baeldung Spring Tutorials](https://www.baeldung.com/)

---

## 👥 Team Members

- 👩‍💻 Ángela Ruiz Rodríguez– Full Stack Developer – [@githubUser](https://github.com/anruiz-r)
