package ia;

import java.util.List;
import ma.a0.a;
import ma.a0.d;
import ma.b1;
import ma.e1;
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
  public static final int FIELDS_FIELD_NUMBER = 3;
  public static final int NAME_FIELD_NUMBER = 1;
  private static volatile b1<a> PARSER;
  public static final int QUERY_SCOPE_FIELD_NUMBER = 2;
  public static final int STATE_FIELD_NUMBER = 4;
  private a0.d<b> fields_ = e1.d;
  private String name_ = "";
  private int queryScope_;
  private int state_;
  
  static
  {
    a locala = new a();
    DEFAULT_INSTANCE = locala;
    w.D(a.class, locala);
  }
  
  public static void G(a parama)
  {
    c localc = c.b;
    parama.getClass();
    queryScope_ = localc.a();
  }
  
  public static void H(a parama, b paramb)
  {
    parama.getClass();
    a0.d locald = fields_;
    if (!locald.g()) {
      fields_ = w.A(locald);
    }
    fields_.add(paramb);
  }
  
  public static a J()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public static a K(byte[] paramArrayOfByte)
  {
    return (a)w.B(DEFAULT_INSTANCE, paramArrayOfByte);
  }
  
  public final a0.d I()
  {
    return fields_;
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
      return new f1(DEFAULT_INSTANCE, "\000\004\000\000\001\004\004\000\001\000\001Ȉ\002\f\003\033\004\f", new Object[] { "name_", "queryScope_", "fields_", b.class, "state_" });
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
  
  public static final class b
    extends w<b, b>
    implements t0
  {
    public static final int ARRAY_CONFIG_FIELD_NUMBER = 3;
    private static final b DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 1;
    public static final int ORDER_FIELD_NUMBER = 2;
    private static volatile b1<b> PARSER;
    private String fieldPath_ = "";
    private int valueModeCase_ = 0;
    private Object valueMode_;
    
    static
    {
      b localb = new b();
      DEFAULT_INSTANCE = localb;
      w.D(b.class, localb);
    }
    
    public static void G(b paramb, String paramString)
    {
      paramb.getClass();
      paramString.getClass();
      fieldPath_ = paramString;
    }
    
    public static void H(b paramb, c paramc)
    {
      paramb.getClass();
      valueMode_ = Integer.valueOf(paramc.a());
      valueModeCase_ = 2;
    }
    
    public static void I(b paramb)
    {
      a locala = a.b;
      paramb.getClass();
      valueMode_ = Integer.valueOf(locala.a());
      valueModeCase_ = 3;
    }
    
    public static b M()
    {
      return (b)DEFAULT_INSTANCE.s();
    }
    
    public final String J()
    {
      return fieldPath_;
    }
    
    public final c K()
    {
      c localc1 = c.b;
      c localc2 = localc1;
      if (valueModeCase_ == 2)
      {
        int i = ((Integer)valueMode_).intValue();
        if (i != 0) {
          if (i != 1)
          {
            if (i != 2) {
              localc1 = null;
            } else {
              localc1 = c.d;
            }
          }
          else {
            localc1 = c.c;
          }
        }
        localc2 = localc1;
        if (localc1 == null) {
          localc2 = c.e;
        }
      }
      return localc2;
    }
    
    public final int L()
    {
      int i = valueModeCase_;
      int j = 2;
      if (i != 0)
      {
        if (i != 2)
        {
          if (i != 3) {
            j = 0;
          }
        }
        else {
          j = 1;
        }
      }
      else {
        j = 3;
      }
      return j;
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
        return new b();
      case 3: 
        return new b();
      case 2: 
        return new f1(DEFAULT_INSTANCE, "\000\003\001\000\001\003\003\000\000\000\001Ȉ\002?\000\003?\000", new Object[] { "valueMode_", "valueModeCase_", "fieldPath_" });
      case 1: 
        return null;
      }
      return Byte.valueOf((byte)1);
    }
    
    public static enum a
      implements a0.a
    {
      public final int a;
      
      static
      {
        a locala1 = new a("ARRAY_CONFIG_UNSPECIFIED", 0, 0);
        a locala2 = new a("CONTAINS", 1, 1);
        b = locala2;
        a locala3 = new a("UNRECOGNIZED", 2, -1);
        c = locala3;
        d = new a[] { locala1, locala2, locala3 };
      }
      
      public a(int paramInt)
      {
        a = paramInt;
      }
      
      public final int a()
      {
        if (this != c) {
          return a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
      }
    }
    
    public static final class b
      extends w.a<a.b, b>
      implements t0
    {
      public b()
      {
        super();
      }
    }
    
    public static enum c
      implements a0.a
    {
      public final int a;
      
      static
      {
        c localc1 = new c("ORDER_UNSPECIFIED", 0, 0);
        b = localc1;
        c localc2 = new c("ASCENDING", 1, 1);
        c = localc2;
        c localc3 = new c("DESCENDING", 2, 2);
        d = localc3;
        c localc4 = new c("UNRECOGNIZED", 3, -1);
        e = localc4;
        f = new c[] { localc1, localc2, localc3, localc4 };
      }
      
      public c(int paramInt)
      {
        a = paramInt;
      }
      
      public final int a()
      {
        if (this != e) {
          return a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
      }
    }
  }
  
  public static enum c
    implements a0.a
  {
    public final int a;
    
    static
    {
      c localc1 = new c("QUERY_SCOPE_UNSPECIFIED", 0, 0);
      c localc2 = new c("COLLECTION", 1, 1);
      c localc3 = new c("COLLECTION_GROUP", 2, 2);
      b = localc3;
      c localc4 = new c("UNRECOGNIZED", 3, -1);
      c = localc4;
      d = new c[] { localc1, localc2, localc3, localc4 };
    }
    
    public c(int paramInt)
    {
      a = paramInt;
    }
    
    public final int a()
    {
      if (this != c) {
        return a;
      }
      throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
  }
}

/* Location:
 * Qualified Name:     ia.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */