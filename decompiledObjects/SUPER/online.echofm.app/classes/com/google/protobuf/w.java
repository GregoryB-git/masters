package com.google.protobuf;

public enum w
{
  public final Class o;
  public final Class p;
  public final Object q;
  
  static
  {
    Class localClass = Integer.TYPE;
    s = new w("INT", 1, localClass, Integer.class, Integer.valueOf(0));
    t = new w("LONG", 2, Long.TYPE, Long.class, Long.valueOf(0L));
    u = new w("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0F));
    v = new w("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0D));
    w = new w("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
    x = new w("STRING", 6, String.class, String.class, "");
    y = new w("BYTE_STRING", 7, f.class, f.class, f.p);
    z = new w("ENUM", 8, localClass, Integer.class, null);
  }
  
  public w(Class paramClass1, Class paramClass2, Object paramObject)
  {
    o = paramClass1;
    p = paramClass2;
    q = paramObject;
  }
  
  public Class e()
  {
    return p;
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */