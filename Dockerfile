FROM openjdk:8
COPY target/ping.jar /
RUN mkdir /config
CMD ["java", "-cp", "ping.jar:/config", "org.springframework.boot.loader.JarLauncher"]
EXPOSE 80
