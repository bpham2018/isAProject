public class Pencil extends WritingTool
{
   
   private int sharpness;
   
   public Pencil()
   {
   		super();
   		sharpness = 1;
   }
   
   public Pencil( int t )
   {
   		super(t);
   		sharpness = 1;
   }
   
   public Pencil( int t, String n )
   {
   		super( t, n );
   		sharpness = 1;
   }
   
   public Pencil( int t, String n, int s )
   {
   		super( t, n );
   		sharpness = s;
   }
   
   public int getSharpness()
   {
   		return sharpness;
   }
   
   public void setName(String n)
   {
   		super.setName(n);
   }
   
   public void setThickness(int t)
   {
   		super.setThickness(t);
   }
   
   public void setSharpness(int s)
   {
   		sharpness = s;
   }
   
   public String toString()
   {
   		return "\nName = " + super.getName() + "\nThickness = " + getThickness() + "\nSharpness = " + getSharpness();
   }
   
   public boolean equals(Pencil p)
   {
   		return(super.equals(p))&&(getSharpness() == p.getSharpness());
   }
}
