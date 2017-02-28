public class Pen extends WritingTool
{
   private String color;
   
   public Pen()
   {
   		super();
   		color = "Black";
   }
   
   public Pen( int t )
   {
   		super( t );
   		color = "Black";
   }
   
   public Pen( int t, String n )
   {
   		super( t, n );
   		color = "Black";
   }
   
   public Pen( int t, String n, String c )
   {
   		super( t, n );
   		color = c;
   }
   	
   public String getColor()
   {
       return color;
   }
   
   public void setName(String n)
   {
   		super.setName(n);
   }
   
   public void setThickness(int t)
   {
   		super.setThickness(t);
   }
   
   public void setColor(String c)
   {
       color = c;
   }
   
   public String toString()
   {
       return "\nName = " + super.getName() + "\nThickness = " + super.getThickness() + "\nColor = " + getColor();
   }
   public boolean equals(Pen p)
   {
       return(super.equals(p))&&(this.getColor() == p.getColor());
   }
}
