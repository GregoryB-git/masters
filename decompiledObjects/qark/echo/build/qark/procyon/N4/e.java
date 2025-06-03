// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N4;

import com.google.protobuf.K;
import com.google.protobuf.T;
import com.google.protobuf.L;
import com.google.protobuf.r;

public final class e extends r implements L
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
    
    static {
        r.Q(e.class, DEFAULT_INSTANCE = new e());
    }
    
    public static /* synthetic */ e T() {
        return e.DEFAULT_INSTANCE;
    }
    
    public static b X() {
        return (b)e.DEFAULT_INSTANCE.u();
    }
    
    private void Y(final long clientTimeUs_) {
        this.bitField0_ |= 0x1;
        this.clientTimeUs_ = clientTimeUs_;
    }
    
    public final void Z(final long systemTimeUs_) {
        this.bitField0_ |= 0x4;
        this.systemTimeUs_ = systemTimeUs_;
    }
    
    public final void a0(final long userTimeUs_) {
        this.bitField0_ |= 0x2;
        this.userTimeUs_ = userTimeUs_;
    }
    
    @Override
    public final Object x(final c c, final Object o, final Object o2) {
        Label_0155: {
            switch (e$a.a[c.ordinal()]) {
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
                    final T parser = e.PARSER;
                    if (parser == null) {
                        break Label_0155;
                    }
                    return parser;
                }
                case 4: {
                    break Label_0155;
                }
                case 3: {
                    break Label_0155;
                }
                case 2: {
                    break Label_0155;
                }
                case 1: {
                    // monitorenter(e.class)
                    while (true) {
                        Label_0164: {
                            break Label_0164;
                            try {
                                T parser2;
                                if ((parser2 = e.PARSER) == null) {
                                    parser2 = (e.PARSER = new r.b(e.DEFAULT_INSTANCE));
                                }
                                // monitorexit(e.class)
                                return parser2;
                                return new e();
                                return new b((e$a)null);
                                return r.O(e.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002", new Object[] { "bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_" });
                                // monitorexit(e.class)
                                return e.DEFAULT_INSTANCE;
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
            super(e.T());
        }
        
        public b D(final long n) {
            ((a)this).y();
            ((e)super.p).Y(n);
            return this;
        }
        
        public b E(final long n) {
            ((a)this).y();
            ((e)super.p).Z(n);
            return this;
        }
        
        public b F(final long n) {
            ((a)this).y();
            ((e)super.p).a0(n);
            return this;
        }
    }
}
