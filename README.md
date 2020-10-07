# Guideance

## Java Installation



## Java version selection
`$ update-ulternatives --config java`

```
There are 2 choices for the alternative java (providing /usr/bin/java).

  Selection    Path                                            Priority   Status
------------------------------------------------------------
  0            /usr/lib/jvm/java-11-openjdk-amd64/bin/java      1111      auto mode
  1            /usr/lib/jvm/java-11-openjdk-amd64/bin/java      1111      manual mode
* 2            /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java   1081      manual mode

Press <enter> to keep the current choice[*], or type selection number: 
```



## Derby Database connection

- start derby  : `$ cd /home/mo/glassfish-5.1.0/glassfish5/javadb/bin` then `./startNetworkServer` it should start listening on port 1527 

- host         : `localhost`
- port         : `1527`
- Database     : `testdb`
- Username     : `APP`
- password     : `APP`

- full url     : `jdbc:derby://localhost/testdb;create=true` 

- Note         : always create new database name to avoid conflicts if database already created it will give connection error message 

