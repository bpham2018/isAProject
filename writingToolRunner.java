public class writingToolRunner
{

	public static void main(String[] args)
	{
		WritingTool wt = new WritingTool();
		Pen p = new Pen(); //what if I put Pen p = new WritingTool();?
		Pencil pc = new Pencil();
		
		System.out.println(wt);
		System.out.println(p);
		System.out.println(pc);
		
		wt.setThickness( 96 );
		System.out.println(wt);
		
		p.setName("Pen");
		System.out.println(p);
		
		pc.setSharpness( 23 );
		System.out.println(pc);
		
		WritingTool wt1 = new WritingTool();
		WritingTool wt2 = new WritingTool();
		
		System.out.println( wt1.equals(wt2));
		System.out.println( wt1.equals(wt));
		
		Pen p1 = new Pen();
		Pen p2 = new Pen();
		
		System.out.println( p1.equals(p2));
		System.out.println( p1.equals(p));
		
		Pencil pc1 = new Pencil();
		Pencil pc2 = new Pencil();
		
		System.out.println( pc1.equals(pc2));
		System.out.println( pc1.equals(pc));
		
	}






}