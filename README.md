#### Домашнее задание к занятию 1.5 Клиент-серверное взаимодействие. Blocking и Non-Blocking IO.
#### Задача 1. Тяжелые вычисления

В качестве решения выбран алгоритм с блокирующим взаимодействием, так как важно полностью получить и обработать запрос отклиента.

SERVER
```text
SERVER is running...
Client: /127.0.0.1:63385 - 5 - й член ряда Фибоначи?
Client: /127.0.0.1:63385 - 10 - й член ряда Фибоначи?
Client: /127.0.0.1:63385 - 100 - й член ряда Фибоначи?
Client: /127.0.0.1:63385 - 1000 - й член ряда Фибоначи?
SERVER is stopped...

Process finished with exit code 0
```

CLIENT
```text
"C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\jbr\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\lib\idea_rt.jar=63383:C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\User\IdeaProjects\HardTask\target\classes;C:\Users\User\.m2\repository\org\apache\httpcomponents\httpclient\4.5.12\httpclient-4.5.12.jar;C:\Users\User\.m2\repository\org\apache\httpcomponents\httpcore\4.4.13\httpcore-4.4.13.jar;C:\Users\User\.m2\repository\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;C:\Users\User\.m2\repository\commons-codec\commons-codec\1.11\commons-codec-1.11.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.12.1\jackson-databind-2.12.1.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.12.1\jackson-annotations-2.12.1.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.12.1\jackson-core-2.12.1.jar;C:\Users\User\.m2\repository\org\hamcrest\hamcrest-all\1.3\hamcrest-all-1.3.jar ru.idcore.ClientMain
Введите номер N -й номер ряда Фибоначи: 
5
SERVER: 5 - й член ряда Фибоначи: 5
Введите номер N -й номер ряда Фибоначи: 
10
SERVER: 10 - й член ряда Фибоначи: 55
Введите номер N -й номер ряда Фибоначи: 
100
SERVER: 100 - й член ряда Фибоначи: 3736710778780434371
Введите номер N -й номер ряда Фибоначи: 
1000
SERVER: 1000 - й член ряда Фибоначи: 817770325994397771
Введите номер N -й номер ряда Фибоначи: 
end

Process finished with exit code 0
```