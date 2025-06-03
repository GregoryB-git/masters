package ka;

import java.util.List;
import ma.a0.d;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class a0$b
  extends w<b, a>
  implements t0
{
  private static final b DEFAULT_INSTANCE;
  public static final int DOCUMENTS_FIELD_NUMBER = 2;
  private static volatile b1<b> PARSER;
  private a0.d<String> documents_ = e1.d;
  
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
    a0.d locald = documents_;
    if (!locald.g()) {
      documents_ = w.A(locald);
    }
    documents_.add(paramString);
  }
  
  public static b H()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a K()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public final String I()
  {
    return (String)documents_.get(0);
  }
  
  public final int J()
  {
    return documents_.size();
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
      return new b();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\001\000\000\002\002\001\000\001\000\002Ț", new Object[] { "documents_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<a0.b, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.a0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */