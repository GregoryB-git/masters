package N4;

import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.r;
import com.google.protobuf.r.a;
import com.google.protobuf.r.b;
import com.google.protobuf.r.c;

public final class f
  extends r
  implements L
{
  public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
  public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
  private static final f DEFAULT_INSTANCE;
  public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
  public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
  public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
  private static volatile T PARSER;
  public static final int PROCESS_NAME_FIELD_NUMBER = 1;
  private int bitField0_;
  private int cpuClockRateKhz_;
  private int cpuProcessorCount_;
  private int deviceRamSizeKb_;
  private int maxAppJavaHeapMemoryKb_;
  private int maxEncouragedAppJavaHeapMemoryKb_;
  private String processName_ = "";
  
  static
  {
    f localf = new f();
    DEFAULT_INSTANCE = localf;
    r.Q(f.class, localf);
  }
  
  public static f X()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static b Z()
  {
    return (b)DEFAULT_INSTANCE.u();
  }
  
  public boolean Y()
  {
    boolean bool;
    if ((bitField0_ & 0x10) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void a0(int paramInt)
  {
    bitField0_ |= 0x8;
    deviceRamSizeKb_ = paramInt;
  }
  
  public final void b0(int paramInt)
  {
    bitField0_ |= 0x10;
    maxAppJavaHeapMemoryKb_ = paramInt;
  }
  
  public final void c0(int paramInt)
  {
    bitField0_ |= 0x20;
    maxEncouragedAppJavaHeapMemoryKb_ = paramInt;
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
      return r.O(DEFAULT_INSTANCE, "\001\006\000\001\001\006\006\000\000\000\001ဈ\000\002င\001\003င\003\004င\004\005င\005\006င\002", new Object[] { "bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new f();
  }
  
  public static final class b
    extends r.a
    implements L
  {
    public b()
    {
      super();
    }
    
    public b D(int paramInt)
    {
      y();
      f.W((f)p, paramInt);
      return this;
    }
    
    public b E(int paramInt)
    {
      y();
      f.U((f)p, paramInt);
      return this;
    }
    
    public b F(int paramInt)
    {
      y();
      f.V((f)p, paramInt);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     N4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */