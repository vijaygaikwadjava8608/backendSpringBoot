FROM openjdk:17
EXPOSE 8080
ADD target/spring_backend_git_hub_action_img.jar, spring_backend_git_hub_action_img.jar
ENTRYPOINT [ "java","-jar","/spring_backend_git_hub_action_img.jar" ]

