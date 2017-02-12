package hackonthehill.hoth;

/**
 * Created by Tyler on 11-Feb-17.
 */

public class Game {
    GraphObject[][] gameDisplay = new GraphObject[8][8];
    Player player;

    public static final int TILE_LEN = 40;    // in units of dp

    public GraphObject getObject(int x, int y)
    {
    	if (x>=0 && x<8 && y>=0 && y<8)
	    	return gameDisplay[x][y];
	    return null;
    }

    public void moveUp(View view)
    {
    	//TODO: check position below to see if it's
    	// 1) valid position to move to (not on grid)
    	// 2) if there's something else in the position
		int x = player.x;
    	int y = player.y;
    	if (y-TILE_LEN < 0) {return;}
    	GraphObject next = getObject(x,y-1);
    	if (next==null) {return;}

    	//check ID of object
    	String id = next.image_id;
    	player.y-=TILE_LEN;

    }
    public void moveDown(View view)
    {
    	//TODO: check position below to see if it's
    	// 1) valid position to move to (not on grid)
    	// 2) if there's something else in the position
    	
    	int x = player.x;
    	int y = player.y;
    	if (y+TILE_LEN>7) {return;}
    	GraphObject next = getObject(x,y+1);
    	if (next==null) {return;}

    	//check ID of object
    	player.y+=TILE_LEN;
    }
    public void moveLeft(View view)
    {
    	int x = player.x;
    	int y = player.y;
    	if (x-TILE_LEN < 0) {return;}
    	GraphObject next = getObject(x-1,y);
    	if (next==null) {return;}

    	//check ID of object
    	player.x-=TILE_LEN;
    }
    public void moveRight(View view)
    {
    	int x = player.x;
    	int y = player.y;
    	if (x+TILE_LEN < 0) {return;}
    	GraphObject next = getObject(x+1,y);
    	if (next==null) {return;}

    	//check ID of object
    	player.x+=TILE_LEN;
    }
}

