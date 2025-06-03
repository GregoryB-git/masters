package s0;

import java.io.Serializable;

public enum o1
{
  public final Object a;
  
  static
  {
    o1 localo11 = new o1("INT", 0, Integer.valueOf(0));
    b = localo11;
    o1 localo12 = new o1("LONG", 1, Long.valueOf(0L));
    c = localo12;
    o1 localo13 = new o1("FLOAT", 2, Float.valueOf(0.0F));
    d = localo13;
    o1 localo14 = new o1("DOUBLE", 3, Double.valueOf(0.0D));
    e = localo14;
    o1 localo15 = new o1("BOOLEAN", 4, Boolean.FALSE);
    f = localo15;
    o1 localo16 = new o1("STRING", 5, "");
    o = localo16;
    o1 localo17 = new o1("BYTE_STRING", 6, g.b);
    p = localo17;
    o1 localo18 = new o1("ENUM", 7, null);
    q = localo18;
    o1 localo19 = new o1("MESSAGE", 8, null);
    r = localo19;
    s = new o1[] { localo11, localo12, localo13, localo14, localo15, localo16, localo17, localo18, localo19 };
  }
  
  public o1(Serializable paramSerializable)
  {
    a = paramSerializable;
  }
}

/* Location:
 * Qualified Name:     s0.o1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */