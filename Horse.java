package com.nix.module1;

public class Horse {
    public boolean check(Point point,Point newPoint)
    { if(point==null ) return false;
      if(point.x>8||point.y>8||newPoint.x>8||newPoint.y>8) return false;
        if(((newPoint.x==point.x+2)&&(newPoint.y==point.y+1)||(newPoint.x==point.x+2)&&(newPoint.y==point.y-1))||((newPoint.x==point.x-2)&&(newPoint.y==point.y+1)||(newPoint.x==point.x-2)&&(newPoint.y==point.y-1))
                ||((newPoint.y==point.y+2)&&(newPoint.x==point.x+1)||(newPoint.y==point.y+2)&&(newPoint.x==point.x-1))
                ||((newPoint.y==point.y-2)&&(newPoint.x==point.x+1)||(newPoint.y==point.y-2)&&(newPoint.x==point.x-1)))
            return true;
      else  return false;
    }
    public static class Point
    {
        int x;
        int y;
        public Point(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
}
