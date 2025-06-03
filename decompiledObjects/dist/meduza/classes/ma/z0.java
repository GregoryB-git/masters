package ma;

import java.lang.reflect.Constructor;

public final class z0
{
  public static final x0 a;
  public static final y0 b = new y0();
  
  static
  {
    x0 localx02;
    try
    {
      x0 localx01 = (x0)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
    catch (Exception localException)
    {
      localx02 = null;
    }
    a = localx02;
  }
}

/* Location:
 * Qualified Name:     ma.z0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */