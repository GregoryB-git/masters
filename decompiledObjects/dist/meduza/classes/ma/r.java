package ma;

import java.lang.reflect.Constructor;

public final class r
{
  public static final q a = new q();
  public static final p<?> b;
  
  static
  {
    p localp2;
    try
    {
      p localp1 = (p)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
    catch (Exception localException)
    {
      localp2 = null;
    }
    b = localp2;
  }
}

/* Location:
 * Qualified Name:     ma.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */