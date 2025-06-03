package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import java.util.Arrays;
import z2;

public class Easing
{
  private static final String ACCELERATE = "cubic(0.4, 0.05, 0.8, 0.7)";
  private static final String ACCELERATE_NAME = "accelerate";
  private static final String ANTICIPATE = "cubic(0.36, 0, 0.66, -0.56)";
  private static final String ANTICIPATE_NAME = "anticipate";
  private static final String DECELERATE = "cubic(0.0, 0.0, 0.2, 0.95)";
  private static final String DECELERATE_NAME = "decelerate";
  private static final String LINEAR = "cubic(1, 1, 0, 0)";
  private static final String LINEAR_NAME = "linear";
  public static String[] NAMED_EASING = { "standard", "accelerate", "decelerate", "linear" };
  private static final String OVERSHOOT = "cubic(0.34, 1.56, 0.64, 1)";
  private static final String OVERSHOOT_NAME = "overshoot";
  private static final String STANDARD = "cubic(0.4, 0.0, 0.2, 1)";
  private static final String STANDARD_NAME = "standard";
  public static Easing sDefault = new Easing();
  public String str = "identity";
  
  public static Easing getInterpolator(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    if (paramString.startsWith("cubic")) {
      return new CubicEasing(paramString);
    }
    if (paramString.startsWith("spline")) {
      return new StepCurve(paramString);
    }
    if (paramString.startsWith("Schlick")) {
      return new Schlick(paramString);
    }
    paramString.hashCode();
    int i = -1;
    switch (paramString.hashCode())
    {
    default: 
      break;
    case 1312628413: 
      if (paramString.equals("standard")) {
        i = 5;
      }
      break;
    case -749065269: 
      if (paramString.equals("overshoot")) {
        i = 4;
      }
      break;
    case -1102672091: 
      if (paramString.equals("linear")) {
        i = 3;
      }
      break;
    case -1197605014: 
      if (paramString.equals("anticipate")) {
        i = 2;
      }
      break;
    case -1263948740: 
      if (paramString.equals("decelerate")) {
        i = 1;
      }
      break;
    case -1354466595: 
      if (paramString.equals("accelerate")) {
        i = 0;
      }
      break;
    }
    switch (i)
    {
    default: 
      PrintStream localPrintStream = System.err;
      paramString = z2.t("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or ");
      paramString.append(Arrays.toString(NAMED_EASING));
      localPrintStream.println(paramString.toString());
      return sDefault;
    case 5: 
      return new CubicEasing("cubic(0.4, 0.0, 0.2, 1)");
    case 4: 
      return new CubicEasing("cubic(0.34, 1.56, 0.64, 1)");
    case 3: 
      return new CubicEasing("cubic(1, 1, 0, 0)");
    case 2: 
      return new CubicEasing("cubic(0.36, 0, 0.66, -0.56)");
    case 1: 
      return new CubicEasing("cubic(0.0, 0.0, 0.2, 0.95)");
    }
    return new CubicEasing("cubic(0.4, 0.05, 0.8, 0.7)");
  }
  
  public double get(double paramDouble)
  {
    return paramDouble;
  }
  
  public double getDiff(double paramDouble)
  {
    return 1.0D;
  }
  
  public String toString()
  {
    return str;
  }
  
  public static class CubicEasing
    extends Easing
  {
    private static double d_error = 1.0E-4D;
    private static double error = 0.01D;
    public double x1;
    public double x2;
    public double y1;
    public double y2;
    
    public CubicEasing(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
    {
      setup(paramDouble1, paramDouble2, paramDouble3, paramDouble4);
    }
    
    public CubicEasing(String paramString)
    {
      str = paramString;
      int i = paramString.indexOf('(');
      int j = paramString.indexOf(',', i);
      x1 = Double.parseDouble(paramString.substring(i + 1, j).trim());
      j++;
      i = paramString.indexOf(',', j);
      y1 = Double.parseDouble(paramString.substring(j, i).trim());
      i++;
      j = paramString.indexOf(',', i);
      x2 = Double.parseDouble(paramString.substring(i, j).trim());
      j++;
      y2 = Double.parseDouble(paramString.substring(j, paramString.indexOf(')', j)).trim());
    }
    
    private double getDiffX(double paramDouble)
    {
      double d1 = 1.0D - paramDouble;
      double d2 = x1;
      double d3 = x2;
      return (1.0D - d3) * (3.0D * paramDouble * paramDouble) + ((d3 - d2) * (d1 * 6.0D * paramDouble) + d1 * 3.0D * d1 * d2);
    }
    
    private double getDiffY(double paramDouble)
    {
      double d1 = 1.0D - paramDouble;
      double d2 = y1;
      double d3 = y2;
      return (1.0D - d3) * (3.0D * paramDouble * paramDouble) + ((d3 - d2) * (d1 * 6.0D * paramDouble) + d1 * 3.0D * d1 * d2);
    }
    
    private double getX(double paramDouble)
    {
      double d1 = 1.0D - paramDouble;
      double d2 = 3.0D * d1;
      double d3 = x1;
      return x2 * (d2 * paramDouble * paramDouble) + d3 * (d1 * d2 * paramDouble) + paramDouble * paramDouble * paramDouble;
    }
    
    private double getY(double paramDouble)
    {
      double d1 = 1.0D - paramDouble;
      double d2 = 3.0D * d1;
      double d3 = y1;
      return y2 * (d2 * paramDouble * paramDouble) + d3 * (d1 * d2 * paramDouble) + paramDouble * paramDouble * paramDouble;
    }
    
    public double get(double paramDouble)
    {
      if (paramDouble <= 0.0D) {
        return 0.0D;
      }
      if (paramDouble >= 1.0D) {
        return 1.0D;
      }
      double d1 = 0.5D;
      double d2 = d1;
      while (d1 > error)
      {
        d3 = getX(d2);
        d1 *= 0.5D;
        if (d3 < paramDouble) {
          d2 += d1;
        } else {
          d2 -= d1;
        }
      }
      double d4 = d2 - d1;
      double d3 = getX(d4);
      d1 = d2 + d1;
      d2 = getX(d1);
      d4 = getY(d4);
      return (paramDouble - d3) * (getY(d1) - d4) / (d2 - d3) + d4;
    }
    
    public double getDiff(double paramDouble)
    {
      double d1 = 0.5D;
      double d2 = d1;
      while (d1 > d_error)
      {
        d3 = getX(d2);
        d1 *= 0.5D;
        if (d3 < paramDouble) {
          d2 += d1;
        } else {
          d2 -= d1;
        }
      }
      double d3 = d2 - d1;
      paramDouble = getX(d3);
      d1 = d2 + d1;
      d2 = getX(d1);
      d3 = getY(d3);
      return (getY(d1) - d3) / (d2 - paramDouble);
    }
    
    public void setup(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
    {
      x1 = paramDouble1;
      y1 = paramDouble2;
      x2 = paramDouble3;
      y2 = paramDouble4;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.Easing
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */