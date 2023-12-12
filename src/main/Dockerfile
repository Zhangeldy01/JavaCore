FROM bellsoft/liberica-openjdk-alpine:11.0.19-7-aarch64
COPY ./java ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d out src/homeWork1/sample/Main.java
CMD java -classpath ./out homeWork1.sample.Main