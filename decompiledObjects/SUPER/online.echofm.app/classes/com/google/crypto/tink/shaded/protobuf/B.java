package com.google.crypto.tink.shaded.protobuf;

public enum B
{
  public final Class o;
  public final Class p;
  public final Object q;
  
  static
  {
    B localB1 = new B("VOID", 0, Void.class, Void.class, null);
    r = localB1;
    Object localObject = Integer.TYPE;
    B localB2 = new B("INT", 1, (Class)localObject, Integer.class, Integer.valueOf(0));
    s = localB2;
    B localB3 = new B("LONG", 2, Long.TYPE, Long.class, Long.valueOf(0L));
    t = localB3;
    B localB4 = new B("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0F));
    u = localB4;
    B localB5 = new B("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0D));
    v = localB5;
    B localB6 = new B("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
    w = localB6;
    B localB7 = new B("STRING", 6, String.class, String.class, "");
    x = localB7;
    B localB8 = new B("BYTE_STRING", 7, h.class, h.class, h.p);
    y = localB8;
    B localB9 = new B("ENUM", 8, (Class)localObject, Integer.class, null);
    z = localB9;
    localObject = new B("MESSAGE", 9, Object.class, Object.class, null);
    A = (B)localObject;
    B = new B[] { localB1, localB2, localB3, localB4, localB5, localB6, localB7, localB8, localB9, localObject };
  }
  
  public B(Class paramClass1, Class paramClass2, Object paramObject)
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
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */