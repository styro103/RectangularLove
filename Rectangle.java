/*
 * Rectangle Class
 * Run Time O(1)
 */

class Rectangle 
{
    // coordinates of bottom left corner
    Integer leftX;
    Integer bottomY;

    // dimensions
    Integer width;
    Integer height;

    public Rectangle(Integer leftX, Integer bottomY, Integer width, Integer height) 
    {
        this.leftX = leftX;
        this.bottomY = bottomY;
        this.width  = width;
        this.height = height;
    }
    //public Rectangle() {} //Originally Given, Not Needed With My Solution
    public String toString() 
    	{return String.format("(%d, %d, %d, %d)", leftX, bottomY, width, height);}
}