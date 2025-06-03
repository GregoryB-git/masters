package com.google.android.gms.internal.measurement;

public enum l4
{
  public final Class o;
  public final Class p;
  public final Object q;
  
  static
  {
    l4 locall41 = new l4("VOID", 0, Void.class, Void.class, null);
    r = locall41;
    Object localObject = Integer.TYPE;
    l4 locall42 = new l4("INT", 1, (Class)localObject, Integer.class, Integer.valueOf(0));
    s = locall42;
    l4 locall43 = new l4("LONG", 2, Long.TYPE, Long.class, Long.valueOf(0L));
    t = locall43;
    l4 locall44 = new l4("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0F));
    u = locall44;
    l4 locall45 = new l4("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0D));
    v = locall45;
    l4 locall46 = new l4("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
    w = locall46;
    l4 locall47 = new l4("STRING", 6, String.class, String.class, "");
    x = locall47;
    l4 locall48 = new l4("BYTE_STRING", 7, q3.class, q3.class, q3.p);
    y = locall48;
    localObject = new l4("ENUM", 8, (Class)localObject, Integer.class, null);
    z = (l4)localObject;
    l4 locall49 = new l4("MESSAGE", 9, Object.class, Object.class, null);
    A = locall49;
    B = new l4[] { locall41, locall42, locall43, locall44, locall45, locall46, locall47, locall48, localObject, locall49 };
  }
  
  public l4(Class paramClass1, Class paramClass2, Object paramObject)
  {
    o = paramClass1;
    p = paramClass2;
    q = paramObject;
  }
  
  public final Class c()
  {
    return p;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.l4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */