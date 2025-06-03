package ka;

import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class t
  extends w<t, a>
  implements t0
{
  private static final t DEFAULT_INSTANCE;
  public static final int DOCUMENT_CHANGE_FIELD_NUMBER = 3;
  public static final int DOCUMENT_DELETE_FIELD_NUMBER = 4;
  public static final int DOCUMENT_REMOVE_FIELD_NUMBER = 6;
  public static final int FILTER_FIELD_NUMBER = 5;
  private static volatile b1<t> PARSER;
  public static final int TARGET_CHANGE_FIELD_NUMBER = 2;
  private int responseTypeCase_ = 0;
  private Object responseType_;
  
  static
  {
    t localt = new t();
    DEFAULT_INSTANCE = localt;
    w.D(t.class, localt);
  }
  
  public static t G()
  {
    return DEFAULT_INSTANCE;
  }
  
  public final l H()
  {
    if (responseTypeCase_ == 3) {
      return (l)responseType_;
    }
    return l.G();
  }
  
  public final m I()
  {
    if (responseTypeCase_ == 4) {
      return (m)responseType_;
    }
    return m.G();
  }
  
  public final o J()
  {
    if (responseTypeCase_ == 6) {
      return (o)responseType_;
    }
    return o.G();
  }
  
  public final q K()
  {
    if (responseTypeCase_ == 5) {
      return (q)responseType_;
    }
    return q.H();
  }
  
  public final int L()
  {
    int i = responseTypeCase_;
    int j = 5;
    if (i != 0)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4)
          {
            if (i != 5) {
              if (i != 6) {
                j = 0;
              } else {
                j = 4;
              }
            }
          }
          else {
            j = 3;
          }
        }
        else {
          j = 2;
        }
      }
      else {
        j = 1;
      }
    }
    else {
      j = 6;
    }
    return j;
  }
  
  public final b0 M()
  {
    if (responseTypeCase_ == 2) {
      return (b0)responseType_;
    }
    return b0.H();
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
      return new t();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\005\001\000\002\006\005\000\000\000\002<\000\003<\000\004<\000\005<\000\006<\000", new Object[] { "responseType_", "responseTypeCase_", b0.class, l.class, m.class, q.class, o.class });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<t, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */