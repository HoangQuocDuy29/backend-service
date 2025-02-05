<h2>Prerequisite</h2>
<ul>
    <li>Cài đặt <strong>JDK 17+</strong> nếu chưa thì <a href="https://adoptium.net/">cài đặt JDK</a></li>
    <li>Cài đặt <strong>Maven 3.5+</strong> nếu chưa thì <a href="https://maven.apache.org/install.html">cài đặt Maven</a></li>
    <li>Cài đặt <strong>IntelliJ</strong> nếu chưa thì <a href="https://www.jetbrains.com/idea/download/">cài đặt IntelliJ</a></li>
</ul>

<h2>Technical Stacks</h2>
<ul>
    <li><strong>Java 17</strong></li>
    <li><strong>Spring Boot 3.4.2</strong></li>
    <li><strong>PostgreSQL</strong></li>
    <li><strong>Kafka</strong></li>
    <li><strong>Redis</strong></li>
    <li><strong>Maven 3.5+</strong></li>
    <li><strong>Lombok</strong></li>
    <li><strong>DevTools</strong></li>
    <li><strong>Docker, Docker Compose</strong></li>
</ul>

<h2>Build Application</h2>
<pre>mvn clean package -P dev|test|uat|prod</pre>

<h2>Run Application</h2>
<h3>Maven Statement</h3>
<pre>./mvnw spring-boot:run</pre>

<h3>Jar Statement</h3>
<pre>java -jar target/backend-service.jar</pre>

<h3>Docker</h3>
<pre>docker build -t backend-service .
docker run -d --name backend-service backend-service:latest</pre>
<h2>Package Application</h2>
<pre>docker build -t backend-service .</pre>
