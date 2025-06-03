// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N4;

import com.google.protobuf.K;
import com.google.protobuf.T;
import com.google.protobuf.L;
import com.google.protobuf.r;

public final class b extends r implements L
{
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final b DEFAULT_INSTANCE;
    private static volatile T PARSER;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;
    
    static {
        r.Q(b.class, DEFAULT_INSTANCE = new b());
    }
    
    public static /* synthetic */ b T() {
        return b.DEFAULT_INSTANCE;
    }
    
    public static b W() {
        return (b)b.DEFAULT_INSTANCE.u();
    }
    
    public final void X(final long clientTimeUs_) {
        this.bitField0_ |= 0x1;
        this.clientTimeUs_ = clientTimeUs_;
    }
    
    public final void Y(final int usedAppJavaHeapMemoryKb_) {
        this.bitField0_ |= 0x2;
        this.usedAppJavaHeapMemoryKb_ = usedAppJavaHeapMemoryKb_;
    }
    
    @Override
    public final Object x(final c c, final Object o, final Object o2) {
        Label_0150: {
            switch (b$a.a[c.ordinal()]) {
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
                    final T parser = b.PARSER;
                    if (parser == null) {
                        break Label_0150;
                    }
                    return parser;
                }
                case 4: {
                    break Label_0150;
                }
                case 3: {
                    break Label_0150;
                }
                case 2: {
                    break Label_0150;
                }
                case 1: {
                    // monitorenter(b.class)
                    while (true) {
                        Label_0159: {
                            break Label_0159;
                            try {
                                T parser2;
                                if ((parser2 = b.PARSER) == null) {
                                    parser2 = (b.PARSER = new r.b(b.DEFAULT_INSTANCE));
                                }
                                // monitorexit(b.class)
                                return parser2;
                                return b.DEFAULT_INSTANCE;
                                return new b((b$a)null);
                                return r.O(b.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1004\u0001", new Object[] { "bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_" });
                                return new b();
                            }
                            // monitorexit(b.class)
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
            super(N4.b.T());
        }
        
        public b D(final long n) {
            ((a)this).y();
            ((N4.b)super.p).X(n);
            return this;
        }
        
        public b E(final int n) {
            ((a)this).y();
            ((N4.b)super.p).Y(n);
            return this;
        }
    }
}
