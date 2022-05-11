# Blood-Donation-Management-System

Building Blood Donation Management System Project with Using Java Swing, Mysql & Maven.

## Links
[Blood Bank Management System in java (JFrame, Netbeans, Mysql) Complete Project (step by step)](https://www.youtube.com/watch?v=C0N-6VZwwf0)
[How to create a runnable JAR file with Maven? || How to make an executable jar in Maven?](https://www.youtube.com/watch?v=GIyIWpC5YIw)

## Dependencies
* JDK (jdk-18_windows-x64_bin)
* MySql
* mysql-connector-java-8.0.29
* rs2xml
* jcalendar-1.4

## POM.xml
add these line of codes with in ```<project></project>```:

```xml
 <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-jar-plugin</artifactId>
                <configuration>
                        <archive>
                                <manifest>
                                        <addClasspath>true</addClasspath>
                                        <mainClass>com.mycompany.mavenproject1.Mavenproject1</mainClass>
                                </manifest>
                        </archive>
                </configuration>
            </plugin>
        </plugins>
    </build>
```
