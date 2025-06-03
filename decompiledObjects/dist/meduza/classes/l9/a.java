package l9;

import ka.k;
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
  public static final int DOCUMENT_FIELD_NUMBER = 2;
  public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
  public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
  private static volatile b1<a> PARSER;
  public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
  private int documentTypeCase_ = 0;
  private Object documentType_;
  private boolean hasCommittedMutations_;
  
  static
  {
    a locala = new a();
    DEFAULT_INSTANCE = locala;
    w.D(a.class, locala);
  }
  
  public static void G(a parama, boolean paramBoolean)
  {
    hasCommittedMutations_ = paramBoolean;
  }
  
  public static void H(a parama, b paramb)
  {
    parama.getClass();
    documentType_ = paramb;
    documentTypeCase_ = 1;
  }
  
  public static void I(a parama, k paramk)
  {
    parama.getClass();
    documentType_ = paramk;
    documentTypeCase_ = 2;
  }
  
  public static void J(a parama, d paramd)
  {
    parama.getClass();
    documentType_ = paramd;
    documentTypeCase_ = 3;
  }
  
  public static a P()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public static a Q(byte[] paramArrayOfByte)
  {
    return (a)w.B(DEFAULT_INSTANCE, paramArrayOfByte);
  }
  
  public final k K()
  {
    if (documentTypeCase_ == 2) {
      return (k)documentType_;
    }
    return k.J();
  }
  
  public final int L()
  {
    int i = documentTypeCase_;
    int j = 3;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3) {
            j = 0;
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
      j = 4;
    }
    return j;
  }
  
  public final boolean M()
  {
    return hasCommittedMutations_;
  }
  
  public final b N()
  {
    if (documentTypeCase_ == 1) {
      return (b)documentType_;
    }
    return b.I();
  }
  
  public final d O()
  {
    if (documentTypeCase_ == 3) {
      return (d)documentType_;
    }
    return d.I();
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
      return new f1(DEFAULT_INSTANCE, "\000\004\001\000\001\004\004\000\000\000\001<\000\002<\000\003<\000\004\007", new Object[] { "documentType_", "documentTypeCase_", b.class, k.class, d.class, "hasCommittedMutations_" });
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
}

/* Location:
 * Qualified Name:     l9.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */