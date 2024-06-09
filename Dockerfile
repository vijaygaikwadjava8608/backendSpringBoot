FROM openjdk:17
EXPOSE 8080
ADD target/spring_backend_git_hub_action_img.war, spring_backend_git_hub_action_img.war
ENTRYPOINT [ "java","-war","/spring_backend_git_hub_action_img.war" ]