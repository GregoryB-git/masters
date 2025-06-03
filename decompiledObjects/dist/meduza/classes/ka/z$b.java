package ka;

import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class z$b
  extends w<b, a>
  implements t0
{
  public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
  public static final int COLLECTION_ID_FIELD_NUMBER = 2;
  private static final b DEFAULT_INSTANCE;
  private static volatile b1<b> PARSER;
  private boolean allDescendants_;
  private String collectionId_ = "";
  
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
    collectionId_ = paramString;
  }
  
  public static void H(b paramb)
  {
    allDescendants_ = true;
  }
  
  public static a K()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public final boolean I()
  {
    return allDescendants_;
  }
  
  public final String J()
  {
    return collectionId_;
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
      return new f1(DEFAULT_INSTANCE, "\000\002\000\000\002\003\002\000\000\000\002Ȉ\003\007", new Object[] { "collectionId_", "allDescendants_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<z.b, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.z.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */