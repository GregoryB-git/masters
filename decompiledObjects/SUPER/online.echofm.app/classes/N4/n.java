package N4;

import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.r;
import com.google.protobuf.r.a;
import com.google.protobuf.r.b;
import com.google.protobuf.r.c;
import com.google.protobuf.t.a;
import com.google.protobuf.t.b;
import com.google.protobuf.t.c;

public final class n
  extends r
  implements L
{
  private static final n DEFAULT_INSTANCE;
  public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
  private static volatile T PARSER;
  private int bitField0_;
  private int dispatchDestination_;
  
  static
  {
    n localn = new n();
    DEFAULT_INSTANCE = localn;
    r.Q(n.class, localn);
  }
  
  public final Object x(r.c paramc, Object paramObject1, Object paramObject2)
  {
    switch (a.a[paramc.ordinal()])
    {
    default: 
      throw new UnsupportedOperationException();
    case 7: 
      return null;
    case 6: 
      return Byte.valueOf((byte)1);
    case 5: 
      paramObject1 = PARSER;
      paramc = (r.c)paramObject1;
      if (paramObject1 == null)
      {
        try
        {
          paramObject1 = PARSER;
          paramc = (r.c)paramObject1;
          if (paramObject1 == null)
          {
            paramc = new com/google/protobuf/r$b;
            paramc.<init>(DEFAULT_INSTANCE);
            PARSER = paramc;
          }
        }
        finally
        {
          break label118;
        }
        break label123;
        throw paramc;
      }
      return paramc;
    case 4: 
      return DEFAULT_INSTANCE;
    case 3: 
      paramc = c.c();
      return r.O(DEFAULT_INSTANCE, "\001\001\000\001\001\001\001\000\000\000\001ဌ\000", new Object[] { "bitField0_", "dispatchDestination_", paramc });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new n();
  }
  
  public static final class b
    extends r.a
    implements L
  {
    public b()
    {
      super();
    }
  }
  
  public static enum c
    implements t.a
  {
    public static final t.b r = new a();
    public final int o;
    
    static
    {
      c localc1 = new c("SOURCE_UNKNOWN", 0, 0);
      p = localc1;
      c localc2 = new c("FL_LEGACY_V1", 1, 1);
      q = localc2;
      s = new c[] { localc1, localc2 };
    }
    
    public c(int paramInt1)
    {
      o = paramInt1;
    }
    
    public static t.c c()
    {
      return b.a;
    }
    
    public final int g()
    {
      return o;
    }
    
    public class a
      implements t.b
    {}
    
    public static final class b
      implements t.c
    {
      public static final t.c a = new b();
    }
  }
}

/* Location:
 * Qualified Name:     N4.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */