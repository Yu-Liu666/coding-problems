
import java.util.PriorityQueue;

public class Solution {
	
public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while(tx>sx&&ty>sy)
        {
            if(tx>ty)
                tx%=ty;
            else
                ty%=tx;
        }
        return (tx==sx&&(ty-sy)%sx==0)||(ty==sy&&(tx-sx)%sy==0);
    }
}
