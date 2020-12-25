public class SampleClassProgram
{

	private final double x,y,z;

        public SampleClassProgram(double c1,double c2,double c3)
        {
                x=c1;
                y=c2;
                z=c3;
        }

        public double potential(double rx,double ry)
        {
                double kx=1.23;
                double x1=rx-x;
                double x2=ry-y;
                return kx*x1*x2;
        }

        public String toString()
        {
                return x+"x: "+y+ "y: "+z+ "z: ";
        }



	public static void main(String args[])
	{
               	System.out.println("--------------------------------------------------------------------");
                System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
                System.out.println("--------------------------------------------------------------------");

		double rx=Double.parseDouble(args[0]);
                double ry=Double.parseDouble(args[1]);
                SampleClassProgram s1 = new SampleClassProgram(1.2,2.3,4.5);
                double result=s1.potential(rx,ry);
                System.out.println("object reference variable "+s1);


	}
}
