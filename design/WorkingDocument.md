# Java Based Traffic Simulator
## Program Working Document

### Specification
The client, specifically for the people who are learning to drive after getting their driving licenses, needs a medium of learning about the traffic in city areas.
Learning about the traffic is necessary to learn about the safety and the rules of the traffic when driving their vehicles.
Therefore, this Traffic Simulator program is specifically designed to help people learn about the vehicles' behaviour on the road interacting with intersections, traffic lights and other vehicles.
This version is a GUI-based program that runs in a JAR (Java archive) application that simulates many vehicles moving along many roads within a city and having the aforementioned interaction behaviours.
The simulated vehicles interacts with the traffic lights, which will stop when the light is red and moves to the next connected roads when the light is green.

### Decomposition
The problem is broken into several objects, which consist of the following classes:

#### Model.Vehicle (abstract)
Describes an average sized road vehicle, having the following attributes:
- *ID*: Unique identifier of the vehicle
- *Length*: The length of the vehicle
- *Width*: The width is half of the length of the vehicle
- *Speed*: The rate in which the vehicle moves in each turn
- *Position*: Where the vehicle is located on the road
- *Current Model.Road*: In which road the vehicle is located
- *Colour*: The colour of the vehicle when drawn graphically

The vehicle moves using the Move() method, depending on the speed defined by the user as well as the speed limit.
The vehicle stops when the traffic light is red, and the vehicle will move to the next road when the traffic light is green.
The vehicle is removed from the road when the vehicle's position is equal to the End Position of the road.
The vehicle is also represented graphically using the Draw() method.

##### Model.Car
Describes an average sized road vehicle.

##### Model.Bus
Describes a large sized road vehicle, inheriting all the Model.Car attributes except that the length is three times the length of a Model.Car class.

##### Model.Motorbike
Describes a small sized road vehicle, inheriting all the Model.Car attributes except that the length is half of the length of a Model.Car class.

#### Model.Road
Describes a single lane road, having the following attributes:
- *ID*: Unique identifier of the road
- *Speed Limit*: Maximum speed a vehicle may travel at
- *Length*: The length of the road
- *Start Position*: Where the road begins
- *End Position*: Where the road ends
- *Connected Roads*: Other roads that physically connect the road
- *Lights on Road*: How many traffic lights are on the road
- *Cars on Road*: How many vehicles are traveling on the road
- *Orientation*: The graphical orientation on the road (horizontal or vertical)

Unlike the prototype, the speed limit of the road can be defined by the user.
The length of the road is variable depending on the user input.
Roads interact with other roads by connecting them, creating a simple intersection.
Vehicles move from the Start Position to the End Position of the road.
Traffic lights can only be placed in the End Positions on the road.

#### Traffic Light
Describes a traffic light, having the following attributes:
- *ID*: Unique identifier of the traffic light
- *State*: What colour is the traffic light (red/green)
- *Position*: Where the traffic light is located on the road
- *Model.Road Attached To*: In which road the traffic light is attached to

The traffic light operates using the Operate() method.
The traffic light randomly change from green to red, and vice versa using randomly generated pseudo-numbers.
The traffic light can only be placed at the end of each road and will interact with the vehicles in that position.
The vehicle stops when the traffic light is red, and the vehicle will move to the next road when the traffic light is green.
The traffic light is also represented graphically using the Draw() method.

### View.SimulationPanel
- *VehiclesSpawns*: Number of vehicles to be spawned in the simulator at a time
- *VehiclesSpawned*: How many vehicles have been spawned in the simulator
- *VehiclesRemoved*: Any vehicles that reached the end of the road are removed from the simulator
- *Cycles*: Cycles between vehicle spawns
- *Scale*: Objects drawn graphically to scale

Generates a graphical display of the simulation mode of the program.
The initial roads and traffic light objects are generated upon program start.
Before starting the simulation, the user goes through the vehicle creation tool and the types are randomised.
The user can also the simulation update rate.
The simulation has a time limit and will run based on the set time.

### View.EditorPanel
- *Scale*: Objects drawn graphically to scale

Generates a graphical display of the city editor mode of the program.
The city editor mode allows the user to click to place roads, define orientation and connect roads with other roads.

### Model.SaveFile
Handles the saving of simulation files.

### Main
The Main class calls both the Editor and Simulation panels.
The class also has the user navigation menu, as well as the option menu for handling user inputs and parameters such as number of vehicles spawned.
All the objects needed for the simulation (roads, vehicles and traffic lights) are handled using the user inputs and parameters in this class.
