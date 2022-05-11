# Blood-Donation-Management-System

Building Blood Donation Management System Project with Using Java Swing, Mysql & Maven.

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
