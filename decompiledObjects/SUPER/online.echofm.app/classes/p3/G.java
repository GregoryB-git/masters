package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.x.a;
import com.google.crypto.tink.shaded.protobuf.x.b;
import com.google.crypto.tink.shaded.protobuf.x.d;

public final class G
  extends x
  implements P
{
  private static final G DEFAULT_INSTANCE;
  public static final int PARAMS_FIELD_NUMBER = 2;
  private static volatile X PARSER;
  public static final int VERSION_FIELD_NUMBER = 1;
  private H params_;
  private int version_;
  
  static
  {
    G localG = new G();
    DEFAULT_INSTANCE = localG;
    x.Q(G.class, localG);
  }
  
  public static b Z()
  {
    return (b)DEFAULT_INSTANCE.q();
  }
  
  public static G a0(h paramh, p paramp)
  {
    return (G)x.K(DEFAULT_INSTANCE, paramh, paramp);
  }
  
  private void c0(int paramInt)
  {
    version_ = paramInt;
  }
  
  public H X()
  {
    H localH1 = params_;
    H localH2 = localH1;
    if (localH1 == null) {
      localH2 = H.V();
    }
    return localH2;
  }
  
  public int Y()
  {
    return version_;
  }
  
  public final void b0(H paramH)
  {
    paramH.getClass();
    params_ = paramH;
  }
  
  public final Object t(x.d paramd, Object paramObject1, Object paramObject2)
  {
    switch (a.a[paramd.ordinal()])
    {
    default: 
      throw new UnsupportedOperationException();
    case 7: 
      return null;
    case 6: 
      return Byte.valueOf((byte)1);
    case 5: 
      paramObject1 = PARSER;
      paramd = (x.d)paramObject1;
      if (paramObject1 == null)
      {
        try
        {
          paramObject1 = PARSER;
          paramd = (x.d)paramObject1;
          if (paramObject1 == null)
          {
            paramd = new com/google/crypto/tink/shaded/protobuf/x$b;
            paramd.<init>(DEFAULT_INSTANCE);
            PARSER = paramd;
          }
        }
        finally
        {
          break label118;
        }
        break label123;
        throw paramd;
      }
      return paramd;
    case 4: 
      return DEFAULT_INSTANCE;
    case 3: 
      return x.I(DEFAULT_INSTANCE, "\000\002\000\000\001\002\002\000\000\000\001\013\002\t", new Object[] { "version_", "params_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new G();
  }
  
  public static final class b
    extends x.a
    implements P
  {
    public b()
    {
      super();
    }
    
    public b y(H paramH)
    {
      s();
      G.W((G)p, paramH);
      return this;
    }
    
    public b z(int paramInt)
    {
      s();
      G.V((G)p, paramInt);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     p3.G
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */