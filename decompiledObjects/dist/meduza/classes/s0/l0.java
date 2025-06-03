package s0;

import java.lang.reflect.Constructor;

public final class l0
{
  public static final j0 a;
  public static final k0 b = new k0();
  
  static
  {
    j0 localj02;
    try
    {
      j0 localj01 = (j0)Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
    catch (Exception localException)
    {
      localj02 = null;
    }
    a = localj02;
  }
}

/* Location:
 * Qualified Name:     s0.l0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */