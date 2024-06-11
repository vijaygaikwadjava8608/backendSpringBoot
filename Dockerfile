FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/spring_backend_git_hub_action_img.jar spring_backend_git_hub_action_img.jar
EXPOSE 8080
CMD [ "java","-jar","spring_backend_git_hub_action_img.jar" ]


