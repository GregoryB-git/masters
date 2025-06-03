// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N4;

import com.google.protobuf.K;
import com.google.protobuf.T;
import com.google.protobuf.L;
import com.google.protobuf.r;

public final class a extends r implements L
{
    private static final a DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile T PARSER;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_;
    private String sdkVersion_;
    private String versionName_;
    
    static {
        r.Q(a.class, DEFAULT_INSTANCE = new a());
    }
    
    public a() {
        this.packageName_ = "";
        this.sdkVersion_ = "";
        this.versionName_ = "";
    }
    
    public static /* synthetic */ a T() {
        return a.DEFAULT_INSTANCE;
    }
    
    public static a X() {
        return a.DEFAULT_INSTANCE;
    }
    
    public static b a0() {
        return (b)a.DEFAULT_INSTANCE.u();
    }
    
    public boolean Y() {
        return (this.bitField0_ & 0x1) != 0x0;
    }
    
    public boolean Z() {
        return (this.bitField0_ & 0x2) != 0x0;
    }
    
    public final void b0(final String packageName_) {
        packageName_.getClass();
        this.bitField0_ |= 0x1;
        this.packageName_ = packageName_;
    }
    
    public final void c0(final String sdkVersion_) {
        sdkVersion_.getClass();
        this.bitField0_ |= 0x2;
        this.sdkVersion_ = sdkVersion_;
    }
    
    public final void d0(final String versionName_) {
        versionName_.getClass();
        this.bitField0_ |= 0x4;
        this.versionName_ = versionName_;
    }
    
    @Override
    public final Object x(final c c, final Object o, final Object o2) {
        Label_0155: {
            switch (a$a.a[c.ordinal()]) {
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
                    final T parser = a.PARSER;
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
                    // monitorenter(a.class)
                    while (true) {
                        Label_0164: {
                            break Label_0164;
                            try {
                                T parser2;
                                if ((parser2 = a.PARSER) == null) {
                                    parser2 = (a.PARSER = new r.b(a.DEFAULT_INSTANCE));
                                }
                                // monitorexit(a.class)
                                return parser2;
                                return r.O(a.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "bitField0_", "packageName_", "sdkVersion_", "versionName_" });
                                // monitorexit(a.class)
                                return a.DEFAULT_INSTANCE;
                                return new a();
                                return new b((a$a)null);
                            }
                            finally {}
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    public static final class b extends r.a implements L
    {
        public b() {
            super(a.T());
        }
        
        public b D(final String s) {
            ((r.a)this).y();
            ((a)super.p).b0(s);
            return this;
        }
        
        public b E(final String s) {
            ((r.a)this).y();
            ((a)super.p).c0(s);
            return this;
        }
        
        public b F(final String s) {
            ((r.a)this).y();
            ((a)super.p).d0(s);
            return this;
        }
    }
}
