/*
 * Solution to Interviw Cakes Rectagular Love Problem
 * Run Time O(1)
 */

import java.lang.Math;

public class Solution 
{
    static Rectangle getIntersection(Rectangle A, Rectangle B) //Finds Intersection of Two Rectangles
    {
        Integer rXA = A.leftX + A.width; //Right X Point of First Rectangle
        Integer rXB = B.leftX + B.width; //Right X Point of Second Rectangle
        Integer tYA = A.bottomY + A.height; //Top Y Point of First Rectangle
        Integer tYB = B.bottomY + B.height; //Top Y Point of Second Rectangle
        Integer lX = Math.max(A.leftX, B.leftX); //If Rectangles Intersect, Left X Will be Right Most of Input's Left Xs
        Integer bY = Math.max(A.bottomY, B.bottomY); //If Rectangles Intersect, Bottom Y Will be Higher of Input's Bottom Ys
        Integer w = Math.min(rXA, rXB) - lX; //Width is Distance Between Left Most of Input's Right Xs, and Left X of Intersection
        Integer h = Math.min(tYA, tYB) - bY; //Height is Distance Between Lower of Input's Top Ys, and Bottom Y of Intersection
        
        if (w<0 || h<0) return new Rectangle(-1, -1, -1, -1); //If Rectangles Don't Intersect, Width and/or Height Will be Negative
        else return new Rectangle(lX, bY, w, h); //Return Rectangle of Intersection
    }
       
    public static void main(String[] args) 
    {
        Rectangle X = new Rectangle(0, 0, 1, 1); //Create Rectangle
        Rectangle Y = new Rectangle(1, 1, 1, 1); //Create Rectangle
        System.out.println(getIntersection(X, Y).toString()); //Print Rectangle of Intersection
    }
}