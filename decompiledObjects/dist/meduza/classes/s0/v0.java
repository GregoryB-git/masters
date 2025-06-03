package s0;

import java.lang.reflect.Constructor;

public final class v0
{
  public static final t0 a;
  public static final u0 b = new u0();
  
  static
  {
    t0 localt02;
    try
    {
      t0 localt01 = (t0)Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
    catch (Exception localException)
    {
      localt02 = null;
    }
    a = localt02;
  }
}

/* Location:
 * Qualified Name:     s0.v0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */