package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Constructor;

public abstract class r
{
  public static final p a = new q();
  public static final p b = c();
  
  public static p a()
  {
    p localp = b;
    if (localp != null) {
      return localp;
    }
    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
  }
  
  public static p b()
  {
    return a;
  }
  
  public static p c()
  {
    try
    {
      p localp = (p)Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return localp;
    }
    catch (Exception localException) {}
    return null;
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */