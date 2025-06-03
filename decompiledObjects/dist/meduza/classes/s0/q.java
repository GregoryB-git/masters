package s0;

import java.lang.reflect.Constructor;

public final class q
{
  public static final p a = new p();
  public static final o<?> b;
  
  static
  {
    o localo2;
    try
    {
      o localo1 = (o)Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
    catch (Exception localException)
    {
      localo2 = null;
    }
    b = localo2;
  }
}

/* Location:
 * Qualified Name:     s0.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */