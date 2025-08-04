📌 Langkah-langkah penerapan Spring Security HTTP Basic - JWT

Proyek ini adalah implementasi sederhana Spring Boot + Spring Security dengan otentikasi menggunakan HTTP Basic Auth. Data pengguna diambil dari database PostgreSQL, dan endpoint API dilindungi menggunakan mekanisme autentikasi dasar (username dan password).



🔧 Fitur

    🔐 HTTP Basic Authentication

    🗄️ Autentikasi berbasis UserDetailsService (custom service)

    🧑‍💻 Data pengguna diambil dari database PostgreSQL

    📦 Spring Boot 3.x + Spring Security 6.x

    REST API endpoint dilindungi


🚀 Teknologi

    Java 17+

    Spring Boot

    Spring Security

    Spring Data JPA

    PostgreSQL

🗂️ Struktur Proyek Singkat

    src/main/java/com/ahmad/SpringSecEx
    config                # Konfigurasi keamanan
    controller            # API endpoint
    model                 # Entity JPA (Pengguna)
    repo                  # Repository JPA
    service               # Custom UserDetailsService
    SpringSecExApplication.java

⚙️ Setup & Jalankan
1. Clone Repositori

    ```.json
    git clone https://github.com/username/SpringSecEx.git
    cd SpringSecEx
    ```
2. Atur Konfigurasi Database (application.properties)

    ```.json
    spring.datasource.url=jdbc:postgresql://localhost:5432/myapp
    spring.datasource.username=postgres
    spring.datasource.password=
    spring.jpa.hibernate.ddl-auto=update
    ```

4. Jalankan Aplikasi
    ```.json
    mvn spring-boot:run
    ```

🔐 Tes HTTP Basic Auth

Gunakan tools seperti curl, Postman, atau REST Client:
    ```
    curl -u ahmad:rahasia http://localhost:8080/api/pengguna
    ```
   