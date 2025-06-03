package androidx.constraintlayout.core.motion.utils;

public class HyperSpline$Cubic
{
  public double mA;
  public double mB;
  public double mC;
  public double mD;
  
  public HyperSpline$Cubic(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    mA = paramDouble1;
    mB = paramDouble2;
    mC = paramDouble3;
    mD = paramDouble4;
  }
  
  public double eval(double paramDouble)
  {
    return ((mD * paramDouble + mC) * paramDouble + mB) * paramDouble + mA;
  }
  
  public double vel(double paramDouble)
  {
    double d = mD;
    return (mC * 2.0D + d * 3.0D * paramDouble) * paramDouble + mB;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.HyperSpline.Cubic
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */