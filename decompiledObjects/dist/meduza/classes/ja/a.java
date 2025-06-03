package ja;

import ka.z;
import ma.a0.a;
import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class a
  extends w<a, a>
  implements t0
{
  private static final a DEFAULT_INSTANCE;
  public static final int LIMIT_TYPE_FIELD_NUMBER = 3;
  public static final int PARENT_FIELD_NUMBER = 1;
  private static volatile b1<a> PARSER;
  public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
  private int limitType_;
  private String parent_ = "";
  private int queryTypeCase_ = 0;
  private Object queryType_;
  
  static
  {
    a locala = new a();
    DEFAULT_INSTANCE = locala;
    w.D(a.class, locala);
  }
  
  public static void G(a parama, String paramString)
  {
    parama.getClass();
    paramString.getClass();
    parent_ = paramString;
  }
  
  public static void H(a parama, z paramz)
  {
    parama.getClass();
    paramz.getClass();
    queryType_ = paramz;
    queryTypeCase_ = 2;
  }
  
  public static void I(a parama, b paramb)
  {
    parama.getClass();
    limitType_ = paramb.a();
  }
  
  public static a M()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public static a N(byte[] paramArrayOfByte)
  {
    return (a)w.B(DEFAULT_INSTANCE, paramArrayOfByte);
  }
  
  public final b J()
  {
    int i = limitType_;
    b localb1;
    if (i != 0)
    {
      if (i != 1) {
        localb1 = null;
      } else {
        localb1 = b.c;
      }
    }
    else {
      localb1 = b.b;
    }
    b localb2 = localb1;
    if (localb1 == null) {
      localb2 = b.d;
    }
    return localb2;
  }
  
  public final String K()
  {
    return parent_;
  }
  
  public final z L()
  {
    if (queryTypeCase_ == 2) {
      return (z)queryType_;
    }
    return z.M();
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
      return new a();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\003\001\000\001\003\003\000\000\000\001Ȉ\002<\000\003\f", new Object[] { "queryType_", "queryTypeCase_", "parent_", z.class, "limitType_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<a, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
  
  public static enum b
    implements a0.a
  {
    public final int a;
    
    static
    {
      b localb1 = new b("FIRST", 0, 0);
      b = localb1;
      b localb2 = new b("LAST", 1, 1);
      c = localb2;
      b localb3 = new b("UNRECOGNIZED", 2, -1);
      d = localb3;
      e = new b[] { localb1, localb2, localb3 };
    }
    
    public b(int paramInt)
    {
      a = paramInt;
    }
    
    public final int a()
    {
      if (this != d) {
        return a;
      }
      throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
  }
}

/* Location:
 * Qualified Name:     ja.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */