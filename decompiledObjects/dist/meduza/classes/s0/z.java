package s0;

import java.io.Serializable;

public enum z
{
  public final Object a;
  
  static
  {
    z localz1 = new z("VOID", 0, Void.class, null);
    b = localz1;
    z localz2 = new z("INT", 1, Integer.class, Integer.valueOf(0));
    c = localz2;
    z localz3 = new z("LONG", 2, Long.class, Long.valueOf(0L));
    d = localz3;
    z localz4 = new z("FLOAT", 3, Float.class, Float.valueOf(0.0F));
    e = localz4;
    z localz5 = new z("DOUBLE", 4, Double.class, Double.valueOf(0.0D));
    f = localz5;
    z localz6 = new z("BOOLEAN", 5, Boolean.class, Boolean.FALSE);
    o = localz6;
    z localz7 = new z("STRING", 6, String.class, "");
    p = localz7;
    z localz8 = new z("BYTE_STRING", 7, g.class, g.b);
    q = localz8;
    z localz9 = new z("ENUM", 8, Integer.class, null);
    r = localz9;
    z localz10 = new z("MESSAGE", 9, Object.class, null);
    s = localz10;
    t = new z[] { localz1, localz2, localz3, localz4, localz5, localz6, localz7, localz8, localz9, localz10 };
  }
  
  public z(Class paramClass, Serializable paramSerializable)
  {
    a = paramSerializable;
  }
}

/* Location:
 * Qualified Name:     s0.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */