package N4;

import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.r;
import com.google.protobuf.r.a;
import com.google.protobuf.r.b;
import com.google.protobuf.r.c;

public final class b
  extends r
  implements L
{
  public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
  private static final b DEFAULT_INSTANCE;
  private static volatile T PARSER;
  public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
  private int bitField0_;
  private long clientTimeUs_;
  private int usedAppJavaHeapMemoryKb_;
  
  static
  {
    b localb = new b();
    DEFAULT_INSTANCE = localb;
    r.Q(b.class, localb);
  }
  
  public static b W()
  {
    return (b)DEFAULT_INSTANCE.u();
  }
  
  public final void X(long paramLong)
  {
    bitField0_ |= 0x1;
    clientTimeUs_ = paramLong;
  }
  
  public final void Y(int paramInt)
  {
    bitField0_ |= 0x2;
    usedAppJavaHeapMemoryKb_ = paramInt;
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
      return r.O(DEFAULT_INSTANCE, "\001\002\000\001\001\002\002\000\000\000\001ဂ\000\002င\001", new Object[] { "bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new b();
  }
  
  public static final class b
    extends r.a
    implements L
  {
    public b()
    {
      super();
    }
    
    public b D(long paramLong)
    {
      y();
      b.U((b)p, paramLong);
      return this;
    }
    
    public b E(int paramInt)
    {
      y();
      b.V((b)p, paramInt);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     N4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */