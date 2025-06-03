package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Constructor;

public abstract class L
{
  public static final J a = ;
  public static final J b = new K();
  
  public static J a()
  {
    return a;
  }
  
  public static J b()
  {
    return b;
  }
  
  public static J c()
  {
    try
    {
      J localJ = (J)Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return localJ;
    }
    catch (Exception localException) {}
    return null;
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.L
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */