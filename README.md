# Mars Rovers

Mars Rovers is a simulation problem. I have to find out what the final position of the rover is after certain steps.
To solve this problem it is important to store all driving information in constants to avoid using unnecessary conditions.

To solve the direction view I indexed the cardinal points in clockwise.
All this indexes are in circular array, so to turn right increment a value and turn left decrement it.

[0: North, 1: East, 2: South, 3:East]

To move the rover, I stored all the change coordinate in a array.
For example, to move to north it's necessary decrement only the Y coordinate.

- North: decrement Y
- East: increment X
- South: increment Y
- West: decrement X

[North: (0, -1), East: (1, 0), South: (0, 1), West: (-1, 0)]

# Test Program

- Java v17.0.2
- Maven v3.6.1

Compile the source.

```sh
mvn compile
```
Run with default file.

```sh
mvn exec:java -Dexec.mainClass=br.com.italo.marsrovers.App
```

Run with custom file, put the relative path of the file in args system, replace the name fileDirectory from the example below.

```sh
mvn exec:java -Dexec.mainClass=br.com.italo.marsrovers.App -Dexec.args="fileDirectory"
```
