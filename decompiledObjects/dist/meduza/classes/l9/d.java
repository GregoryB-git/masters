package l9;

import ma.b1;
import ma.f1;
import ma.n1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class d
  extends w<d, a>
  implements t0
{
  private static final d DEFAULT_INSTANCE;
  public static final int NAME_FIELD_NUMBER = 1;
  private static volatile b1<d> PARSER;
  public static final int VERSION_FIELD_NUMBER = 2;
  private int bitField0_;
  private String name_ = "";
  private n1 version_;
  
  static
  {
    d locald = new d();
    DEFAULT_INSTANCE = locald;
    w.D(d.class, locald);
  }
  
  public static void G(d paramd, String paramString)
  {
    paramd.getClass();
    paramString.getClass();
    name_ = paramString;
  }
  
  public static void H(d paramd, n1 paramn1)
  {
    paramd.getClass();
    version_ = paramn1;
    bitField0_ |= 0x1;
  }
  
  public static d I()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a L()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public final String J()
  {
    return name_;
  }
  
  public final n1 K()
  {
    n1 localn11 = version_;
    n1 localn12 = localn11;
    if (localn11 == null) {
      localn12 = n1.I();
    }
    return localn12;
  }
  
  public final Object t(w.f paramf)
  {
    switch (paramf.ordinal())
    {
    default: 
      throw new UnsupportedOperationException();
    case 6: 
      b1 localb1 = PARSER;
      paramf = localb1;
      if (localb1 == null) {
        try
        {
          localb1 = PARSER;
          paramf = localb1;
          if (localb1 == null)
          {
            paramf = new ma/w$b;
            paramf.<init>(DEFAULT_INSTANCE);
            PARSER = paramf;
          }
        }
        finally {}
      }
      return paramf;
    case 5: 
      return DEFAULT_INSTANCE;
    case 4: 
      return new a();
    case 3: 
      return new d();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\002\000\001\001\002\002\000\000\000\001Ȉ\002ဉ\000", new Object[] { "bitField0_", "name_", "version_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<d, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     l9.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */