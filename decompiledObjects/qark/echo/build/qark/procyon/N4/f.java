// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N4;

import com.google.protobuf.K;
import com.google.protobuf.T;
import com.google.protobuf.L;
import com.google.protobuf.r;

public final class f extends r implements L
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
    private String processName_;
    
    static {
        r.Q(f.class, DEFAULT_INSTANCE = new f());
    }
    
    public f() {
        this.processName_ = "";
    }
    
    public static /* synthetic */ f T() {
        return f.DEFAULT_INSTANCE;
    }
    
    public static f X() {
        return f.DEFAULT_INSTANCE;
    }
    
    public static b Z() {
        return (b)f.DEFAULT_INSTANCE.u();
    }
    
    public boolean Y() {
        return (this.bitField0_ & 0x10) != 0x0;
    }
    
    public final void a0(final int deviceRamSizeKb_) {
        this.bitField0_ |= 0x8;
        this.deviceRamSizeKb_ = deviceRamSizeKb_;
    }
    
    public final void b0(final int maxAppJavaHeapMemoryKb_) {
        this.bitField0_ |= 0x10;
        this.maxAppJavaHeapMemoryKb_ = maxAppJavaHeapMemoryKb_;
    }
    
    public final void c0(final int maxEncouragedAppJavaHeapMemoryKb_) {
        this.bitField0_ |= 0x20;
        this.maxEncouragedAppJavaHeapMemoryKb_ = maxEncouragedAppJavaHeapMemoryKb_;
    }
    
    @Override
    public final Object x(final c c, final Object o, final Object o2) {
        Label_0172: {
            switch (f$a.a[c.ordinal()]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return 1;
                }
                case 5: {
                    final T parser = f.PARSER;
                    if (parser == null) {
                        break Label_0172;
                    }
                    return parser;
                }
                case 4: {
                    break Label_0172;
                }
                case 3: {
                    break Label_0172;
                }
                case 2: {
                    break Label_0172;
                }
                case 1: {
                    // monitorenter(f.class)
                    while (true) {
                        Label_0181: {
                            break Label_0181;
                            try {
                                T parser2;
                                if ((parser2 = f.PARSER) == null) {
                                    parser2 = (f.PARSER = new r.b(f.DEFAULT_INSTANCE));
                                }
                                // monitorexit(f.class)
                                return parser2;
                                return r.O(f.DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u1004\u0003\u0004\u1004\u0004\u0005\u1004\u0005\u0006\u1004\u0002", new Object[] { "bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_" });
                                return new b((f$a)null);
                                return new f();
                                // monitorexit(f.class)
                                return f.DEFAULT_INSTANCE;
                            }
                            finally {}
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    public static final class b extends a implements L
    {
        public b() {
            super(f.T());
        }
        
        public b D(final int n) {
            ((a)this).y();
            ((f)super.p).a0(n);
            return this;
        }
        
        public b E(final int n) {
            ((a)this).y();
            ((f)super.p).b0(n);
            return this;
        }
        
        public b F(final int n) {
            ((a)this).y();
            ((f)super.p).c0(n);
            return this;
        }
    }
}
