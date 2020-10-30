FROM adoptopenjdk/openjdk11
CMD java -version && javac -version
COPY gradlew gradlew
COPY gradle gradle
COPY settings.gradle.kts settings.gradle.kts
COPY version version
RUN ./gradlew tasks
CMD ./gradlew greet