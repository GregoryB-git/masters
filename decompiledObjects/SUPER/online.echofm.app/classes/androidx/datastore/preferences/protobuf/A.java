package androidx.datastore.preferences.protobuf;

public enum A
{
  public final Class o;
  public final Class p;
  public final Object q;
  
  static
  {
    A localA1 = new A("VOID", 0, Void.class, Void.class, null);
    r = localA1;
    Object localObject = Integer.TYPE;
    A localA2 = new A("INT", 1, (Class)localObject, Integer.class, Integer.valueOf(0));
    s = localA2;
    A localA3 = new A("LONG", 2, Long.TYPE, Long.class, Long.valueOf(0L));
    t = localA3;
    A localA4 = new A("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0F));
    u = localA4;
    A localA5 = new A("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0D));
    v = localA5;
    A localA6 = new A("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
    w = localA6;
    A localA7 = new A("STRING", 6, String.class, String.class, "");
    x = localA7;
    A localA8 = new A("BYTE_STRING", 7, g.class, g.class, g.p);
    y = localA8;
    A localA9 = new A("ENUM", 8, (Class)localObject, Integer.class, null);
    z = localA9;
    localObject = new A("MESSAGE", 9, Object.class, Object.class, null);
    A = (A)localObject;
    B = new A[] { localA1, localA2, localA3, localA4, localA5, localA6, localA7, localA8, localA9, localObject };
  }
  
  public A(Class paramClass1, Class paramClass2, Object paramObject)
  {
    o = paramClass1;
    p = paramClass2;
    q = paramObject;
  }
  
  public Class c()
  {
    return p;
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.A
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */