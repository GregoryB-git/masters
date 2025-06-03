package N4;

import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.r;
import com.google.protobuf.r.a;
import com.google.protobuf.r.b;
import com.google.protobuf.r.c;

public final class e
  extends r
  implements L
{
  public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
  private static final e DEFAULT_INSTANCE;
  private static volatile T PARSER;
  public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
  public static final int USER_TIME_US_FIELD_NUMBER = 2;
  private int bitField0_;
  private long clientTimeUs_;
  private long systemTimeUs_;
  private long userTimeUs_;
  
  static
  {
    e locale = new e();
    DEFAULT_INSTANCE = locale;
    r.Q(e.class, locale);
  }
  
  public static b X()
  {
    return (b)DEFAULT_INSTANCE.u();
  }
  
  private void Y(long paramLong)
  {
    bitField0_ |= 0x1;
    clientTimeUs_ = paramLong;
  }
  
  public final void Z(long paramLong)
  {
    bitField0_ |= 0x4;
    systemTimeUs_ = paramLong;
  }
  
  public final void a0(long paramLong)
  {
    bitField0_ |= 0x2;
    userTimeUs_ = paramLong;
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
      return r.O(DEFAULT_INSTANCE, "\001\003\000\001\001\003\003\000\000\000\001ဂ\000\002ဂ\001\003ဂ\002", new Object[] { "bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new e();
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
      e.U((e)p, paramLong);
      return this;
    }
    
    public b E(long paramLong)
    {
      y();
      e.W((e)p, paramLong);
      return this;
    }
    
    public b F(long paramLong)
    {
      y();
      e.V((e)p, paramLong);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     N4.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */