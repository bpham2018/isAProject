public class WritingTool
{
    private int thickness;
    private String name;
    
    public WritingTool()
    {
        this(1, "WritingTool");
    }
    public WritingTool(int t)
    {
        this(t, "WritingTool");
    }
    public WritingTool(String n)
    {
        this(1, n);
    }
    public WritingTool(int t, String n)
    {
        thickness = t;
        name = n;
    }
    public String getName()
    {
        return name;
    }
    public int getThickness()
    {
        return thickness;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setThickness(int t)
    {
        thickness = t;
    }
    public String toString()
    {
        return "\nName = " + getName() + "\nThickness = " + getThickness();
    }
    
    public boolean equals(WritingTool w)
    {
       return(w.getName() == this.getName())&&(w.getThickness() == this.getThickness());
    }
    
    
}
