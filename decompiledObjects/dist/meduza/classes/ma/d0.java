package ma;

import java.io.Serializable;

public enum d0
{
  public final Object a;
  
  static
  {
    d0 locald01 = new d0("VOID", 0, Void.class, null);
    b = locald01;
    d0 locald02 = new d0("INT", 1, Integer.class, Integer.valueOf(0));
    c = locald02;
    d0 locald03 = new d0("LONG", 2, Long.class, Long.valueOf(0L));
    d = locald03;
    d0 locald04 = new d0("FLOAT", 3, Float.class, Float.valueOf(0.0F));
    e = locald04;
    d0 locald05 = new d0("DOUBLE", 4, Double.class, Double.valueOf(0.0D));
    f = locald05;
    d0 locald06 = new d0("BOOLEAN", 5, Boolean.class, Boolean.FALSE);
    o = locald06;
    d0 locald07 = new d0("STRING", 6, String.class, "");
    p = locald07;
    d0 locald08 = new d0("BYTE_STRING", 7, h.class, h.b);
    q = locald08;
    d0 locald09 = new d0("ENUM", 8, Integer.class, null);
    r = locald09;
    d0 locald010 = new d0("MESSAGE", 9, Object.class, null);
    s = locald010;
    t = new d0[] { locald01, locald02, locald03, locald04, locald05, locald06, locald07, locald08, locald09, locald010 };
  }
  
  public d0(Class paramClass, Serializable paramSerializable)
  {
    a = paramSerializable;
  }
}

/* Location:
 * Qualified Name:     ma.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */