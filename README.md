
# CeilingFan
Solution to confirm which speed and direction a ceiling fan Speed and Direction speed settings:

# Solution 
The unit has 2 pull cords which perform the following actions:  

o   One increases the speed each time it is pulled.  There are 3 speed settings: 0 for off, 1 for low, 2 for medium, 3 for high.  If the cord is pulled on speed 3, the fan returns to the “off” setting.

o   One reverses the direction of the fan at the current speed setting. Once the direction has been reversed, it remains reversed as we cycle through the speed settings, until reversed again.

o   You can assume the unit is always powered (no wall switch)    

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The following java libraries are required to run the project java classes:
o   java.util.Random;
o   java.util.stream.IntStream;

The following java libraries are required to run the junit java classes:
o   org.junit.Before
o   org.junit.Test
o   org.junit.Assert
