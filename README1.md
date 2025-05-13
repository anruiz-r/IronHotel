# **IronHotel - Sistema de Reservas Hotelero  🏨**

## **📌 Descripción del Proyecto**
IronHotel es una aplicación web diseñada para la **gestión de reservas hoteleras**. Permite a los huéspedes reservar habitaciones, a los empleados administrar reservas, y a los administradores gestionar los usuarios del sistema.

### **🌟 Características principales**
- ✅ Registro y autenticación de usuarios (huéspedes y empleados).
- ✅ Gestión de habitaciones con distintas categorías (`Standard`, `Suite`, `Economic`).
- ✅ Creación, modificación y cancelación de reservas.
- ✅ Control de disponibilidad.

---

## **📌 Diagrama de Clases**
Aquí se encuentra el diagrama UML con las clases principales del proyecto (`Room`,`Economic`, `Standard`, `Suite`, `Reservation`, `User`, `Employee`, `Guest`, `Admin`).

📷 _[Inserta imagen del diagrama aquí]_

---

## **📌 Configuración y Setup**
### **1️⃣ Clona el repositorio**

git clone https://github.com/tu-usuario/IronHotel.git

## ** 💻 Technologies Used**

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Lombok
- Maven
- Postman (testing)
- JUnit (testing)

🧭 Controllers and Routes Structure
Method	Endpoint	Description
GET	/api/public/reservations	Listar todas las reservas
GET	/api/public/reservations/{id}	Obtener una reserva por ID
POST	/api/public/reservations	Crear una nueva reserva
PUT	/api/public/reservations/{id}	Actualizar una reserva existente
DELETE	/api/public/reservations/{id}	Eliminar una reserva por ID
GET	/api/public/rooms	Listar habitaciones
GET	/api/public/users	Listar usuarios
🔗 Extra Links

    📌 Trello Board: Enlace a Trello

    🎤 Presentation Slides: Presentación

    📫 Postman Collection: Documentación API

🔮 Future Work

    Añadir Spring Security con JWT y roles (admin, user)

    Validaciones más robustas (por ejemplo, que arrivalDate < departureDate)

    Implementar paginación y búsqueda por filtros (por usuario, fecha, habitación…)

    Añadir Swagger para documentación interactiva

    Posible integración con servicio de pagos o pasarela de check-in

📚 Resources

    Documentación oficial de Spring Boot

    Guía de Lombok

    MySQL Docs

    Baeldung Spring Tutorials

👥 Team Members

    👩‍💻 Nombre Apellido – Backend Developer – @githubUser

    👨‍💻 Nombre Apellido – Project Manager – @githubUser2
```sh