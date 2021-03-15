#### Домашнее задание к занятию 1.5 Клиент-серверное взаимодействие. Blocking и Non-Blocking IO.
#### Задача 1. Тяжелые вычисления

В качестве решения выбран алгоритм с блокирующим взаимодействием, так как важно полностью получить и обработать запрос отклиента.

SERVER
```text
"C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\jbr\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\lib\idea_rt.jar=63587:C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\User\IdeaProjects\HardTask\target\classes;C:\Users\User\.m2\repository\org\apache\httpcomponents\httpclient\4.5.12\httpclient-4.5.12.jar;C:\Users\User\.m2\repository\org\apache\httpcomponents\httpcore\4.4.13\httpcore-4.4.13.jar;C:\Users\User\.m2\repository\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;C:\Users\User\.m2\repository\commons-codec\commons-codec\1.11\commons-codec-1.11.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.12.1\jackson-databind-2.12.1.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.12.1\jackson-annotations-2.12.1.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.12.1\jackson-core-2.12.1.jar;C:\Users\User\.m2\repository\org\hamcrest\hamcrest-all\1.3\hamcrest-all-1.3.jar ru.idcore.ServerMain
SERVER is running...
Client: /127.0.0.1:63594 - 5 - й номер ряда Фибоначи?
Client: /127.0.0.1:63594 - 10 - й номер ряда Фибоначи?
Client: /127.0.0.1:63594 - 15 - й номер ряда Фибоначи?
Client: /127.0.0.1:63594 - 20 - й номер ряда Фибоначи?
Client: /127.0.0.1:63594 - 25 - й номер ряда Фибоначи?
SERVER is stopped...

Process finished with exit code 0
```

CLIENT
```text
"C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\jbr\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\lib\idea_rt.jar=63592:C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\User\IdeaProjects\HardTask\target\classes;C:\Users\User\.m2\repository\org\apache\httpcomponents\httpclient\4.5.12\httpclient-4.5.12.jar;C:\Users\User\.m2\repository\org\apache\httpcomponents\httpcore\4.4.13\httpcore-4.4.13.jar;C:\Users\User\.m2\repository\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;C:\Users\User\.m2\repository\commons-codec\commons-codec\1.11\commons-codec-1.11.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.12.1\jackson-databind-2.12.1.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.12.1\jackson-annotations-2.12.1.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.12.1\jackson-core-2.12.1.jar;C:\Users\User\.m2\repository\org\hamcrest\hamcrest-all\1.3\hamcrest-all-1.3.jar ru.idcore.ClientMain
Введите N -й номер ряда Фибоначи: 
5
SERVER: 5 - й член ряда Фибоначи: 5
Введите N -й номер ряда Фибоначи: 
10
SERVER: 10 - й член ряда Фибоначи: 55
Введите N -й номер ряда Фибоначи: 
15
SERVER: 15 - й член ряда Фибоначи: 610
Введите N -й номер ряда Фибоначи: 
20
SERVER: 20 - й член ряда Фибоначи: 6765
Введите N -й номер ряда Фибоначи: 
25
SERVER: 25 - й член ряда Фибоначи: 75025
Введите N -й номер ряда Фибоначи: 
end

Process finished with exit code 0
```