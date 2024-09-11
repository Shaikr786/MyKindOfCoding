// 874. Walking Robot Simulation

class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {

        //directions
        int[][] dist = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        //store obstacles in a set
        Set<String> obstacleSet = new HashSet<>();
        for(int[] obstacle : obstacles)
        {
            obstacleSet.add(obstacle[0] +"," + obstacle[1]);
        }

        //start at facing north -> {0, 0}
        int x = 0;
        int y = 0;
        int directionIndex = 0;
        int maxDistanceSquared = 0;

        //go through all the commands
        for(int command: commands)
        {
            if(command == -2)
            {
                directionIndex = (directionIndex+3) % 4;
            }
            else if(command == -1)
            {
                directionIndex = (directionIndex + 1) % 4;
            }
            else
            {
                for(int i = 0 ; i < command ; i++)
                {
                    int newX = x + dist[directionIndex][0];
                    int newY = y + dist[directionIndex][1];

                    if(obstacleSet.contains(newX +"," +newY))
                    {
                        break;
                    }
                    x = newX;
                    y = newY;

                    maxDistanceSquared = Math.max(maxDistanceSquared, x * x + y * y);
                }
               
            }
        }
        return maxDistanceSquared;
    }
}