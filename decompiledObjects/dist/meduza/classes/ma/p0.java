package ma;

import java.lang.reflect.Constructor;

public final class p0
{
  public static final n0 a;
  public static final o0 b = new o0();
  
  static
  {
    n0 localn02;
    try
    {
      n0 localn01 = (n0)Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
    catch (Exception localException)
    {
      localn02 = null;
    }
    a = localn02;
  }
}

/* Location:
 * Qualified Name:     ma.p0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */