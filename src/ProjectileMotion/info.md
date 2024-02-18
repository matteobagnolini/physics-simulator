This package contains classes to simulate the trajectory of an object.\
The Projectile class is an abstract class, used to create both 1D and 2D projectile trajectory.\
Projectile1D simulates the vertical launch of an object. The UseProjectile1D class draws a plot of height vs time, and velocity vs time.\
Projectile2D simulates the launch of an object with both vertical and horizontal components. The UseProjectile2D class first asks the user to insert some values (speed, angle, initial height), then draws a plot of x vs y, which represents the trajectory of the object.\
Both classes also calculate the air resistance. The coefficient of the air resistance can be modified in the Projectile class (it should be between 0.001 and 1.0).\
The GUI class is a simple and little elegant class that permitts the user to decide the parameters of the launch in an easy way. I know it is not very readable and there are lots of things I can improve.\
The way the plot is drawn can be modified: it can show the full trajectory (many points together), or it can show the actual launch (one point at a time that's moving). The details can be found in comments inside the UseProjectile1D and GUI class.\