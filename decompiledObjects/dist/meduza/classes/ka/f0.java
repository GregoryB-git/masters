package ka;

import java.util.List;
import ma.a0.d;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.h;
import ma.l0;
import ma.m0;
import ma.t0;
import ma.v1;
import ma.v1.a;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class f0
  extends w<f0, a>
  implements t0
{
  public static final int DATABASE_FIELD_NUMBER = 1;
  private static final f0 DEFAULT_INSTANCE;
  public static final int LABELS_FIELD_NUMBER = 5;
  private static volatile b1<f0> PARSER;
  public static final int STREAM_ID_FIELD_NUMBER = 2;
  public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
  public static final int WRITES_FIELD_NUMBER = 3;
  private String database_ = "";
  private m0<String, String> labels_ = m0.b;
  private String streamId_ = "";
  private h streamToken_ = h.b;
  private a0.d<e0> writes_ = e1.d;
  
  static
  {
    f0 localf0 = new f0();
    DEFAULT_INSTANCE = localf0;
    w.D(f0.class, localf0);
  }
  
  public static void G(f0 paramf0, String paramString)
  {
    paramf0.getClass();
    paramString.getClass();
    database_ = paramString;
  }
  
  public static void H(f0 paramf0, h paramh)
  {
    paramf0.getClass();
    paramh.getClass();
    streamToken_ = paramh;
  }
  
  public static void I(f0 paramf0, e0 parame0)
  {
    paramf0.getClass();
    a0.d locald = writes_;
    if (!locald.g()) {
      writes_ = w.A(locald);
    }
    writes_.add(parame0);
  }
  
  public static f0 J()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a K()
  {
    return (a)DEFAULT_INSTANCE.s();
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
      return new f0();
    case 2: 
      paramf = b.a;
      return new f1(DEFAULT_INSTANCE, "\000\005\000\000\001\005\005\001\001\000\001Ȉ\002Ȉ\003\033\004\n\0052", new Object[] { "database_", "streamId_", "writes_", e0.class, "streamToken_", "labels_", paramf });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<f0, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
  
  public static final class b
  {
    public static final l0<String, String> a;
    
    static
    {
      v1.a locala = v1.c;
      a = new l0(locala, locala, "");
    }
  }
}

/* Location:
 * Qualified Name:     ka.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */