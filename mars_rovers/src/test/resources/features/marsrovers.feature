@marsrovers
@compass
@lastposition

Feature: Mars Rovers
		 I would like to confirm last positions of Mars Rovers

Background: Define plateau's upper-right coordinates
Given the plateau's upper-right coordinates is "5 5" 
		 
@movement
@rotate
Scenario Outline: verify last positions of Mars Rovers are calculated successfully when they moved and rotated
Given the beginning rover position is <first_position>
When the Mars Rovers is moved based on <series_introduction> intructions 
Then last position of the Mars Rovers should be <lastposition>
Examples:
     first_position | series_introduction | lastposition |
    | 1,2,N 		   | LMLMLMLMM			 | 1 3 N        |
    | 3,3,E 		   | MMRMMRMRRM			 | 5 1 E        |      