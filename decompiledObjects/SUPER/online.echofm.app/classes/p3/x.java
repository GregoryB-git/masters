package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.x.d;

public final class x
  extends com.google.crypto.tink.shaded.protobuf.x
  implements P
{
  private static final x DEFAULT_INSTANCE;
  public static final int HASH_FIELD_NUMBER = 1;
  private static volatile X PARSER;
  public static final int TAG_SIZE_FIELD_NUMBER = 2;
  private int hash_;
  private int tagSize_;
  
  static
  {
    x localx = new x();
    DEFAULT_INSTANCE = localx;
    com.google.crypto.tink.shaded.protobuf.x.Q(x.class, localx);
  }
  
  public static x X()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static b a0()
  {
    return (b)DEFAULT_INSTANCE.q();
  }
  
  private void c0(int paramInt)
  {
    tagSize_ = paramInt;
  }
  
  public u Y()
  {
    u localu1 = u.c(hash_);
    u localu2 = localu1;
    if (localu1 == null) {
      localu2 = u.v;
    }
    return localu2;
  }
  
  public int Z()
  {
    return tagSize_;
  }
  
  public final void b0(u paramu)
  {
    hash_ = paramu.g();
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
      return com.google.crypto.tink.shaded.protobuf.x.I(DEFAULT_INSTANCE, "\000\002\000\000\001\002\002\000\000\000\001\f\002\013", new Object[] { "hash_", "tagSize_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new x();
  }
  
  public static final class b
    extends com.google.crypto.tink.shaded.protobuf.x.a
    implements P
  {
    public b()
    {
      super();
    }
    
    public b y(u paramu)
    {
      s();
      x.V((x)p, paramu);
      return this;
    }
    
    public b z(int paramInt)
    {
      s();
      x.W((x)p, paramInt);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     p3.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */