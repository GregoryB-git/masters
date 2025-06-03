package ma;

import java.io.Serializable;

public enum w1
{
  public final Object a;
  
  static
  {
    w1 localw11 = new w1("INT", 0, Integer.valueOf(0));
    b = localw11;
    w1 localw12 = new w1("LONG", 1, Long.valueOf(0L));
    c = localw12;
    w1 localw13 = new w1("FLOAT", 2, Float.valueOf(0.0F));
    d = localw13;
    w1 localw14 = new w1("DOUBLE", 3, Double.valueOf(0.0D));
    e = localw14;
    w1 localw15 = new w1("BOOLEAN", 4, Boolean.FALSE);
    f = localw15;
    w1 localw16 = new w1("STRING", 5, "");
    o = localw16;
    w1 localw17 = new w1("BYTE_STRING", 6, h.b);
    p = localw17;
    w1 localw18 = new w1("ENUM", 7, null);
    q = localw18;
    w1 localw19 = new w1("MESSAGE", 8, null);
    r = localw19;
    s = new w1[] { localw11, localw12, localw13, localw14, localw15, localw16, localw17, localw18, localw19 };
  }
  
  public w1(Serializable paramSerializable)
  {
    a = paramSerializable;
  }
}

/* Location:
 * Qualified Name:     ma.w1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */