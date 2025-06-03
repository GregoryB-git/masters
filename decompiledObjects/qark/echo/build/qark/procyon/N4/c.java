// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N4;

import com.google.protobuf.m0;
import com.google.protobuf.D;
import com.google.protobuf.K;
import java.util.Map;
import com.google.protobuf.E;
import com.google.protobuf.T;
import com.google.protobuf.L;
import com.google.protobuf.r;

public final class c extends r implements L
{
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final c DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile T PARSER;
    private N4.a androidAppInfo_;
    private String appInstanceId_;
    private int applicationProcessState_;
    private int bitField0_;
    private E customAttributes_;
    private String googleAppId_;
    
    static {
        r.Q(c.class, DEFAULT_INSTANCE = new c());
    }
    
    public c() {
        this.customAttributes_ = E.f();
        this.googleAppId_ = "";
        this.appInstanceId_ = "";
    }
    
    public static /* synthetic */ c T() {
        return c.DEFAULT_INSTANCE;
    }
    
    public static c a0() {
        return c.DEFAULT_INSTANCE;
    }
    
    public static b h0() {
        return (b)c.DEFAULT_INSTANCE.u();
    }
    
    public N4.a Z() {
        N4.a a;
        if ((a = this.androidAppInfo_) == null) {
            a = N4.a.X();
        }
        return a;
    }
    
    public final Map b0() {
        return this.g0();
    }
    
    public boolean c0() {
        return (this.bitField0_ & 0x4) != 0x0;
    }
    
    public boolean d0() {
        return (this.bitField0_ & 0x2) != 0x0;
    }
    
    public boolean e0() {
        return (this.bitField0_ & 0x8) != 0x0;
    }
    
    public boolean f0() {
        return (this.bitField0_ & 0x1) != 0x0;
    }
    
    public final E g0() {
        if (!this.customAttributes_.n()) {
            this.customAttributes_ = this.customAttributes_.s();
        }
        return this.customAttributes_;
    }
    
    public final void i0(final N4.a androidAppInfo_) {
        androidAppInfo_.getClass();
        this.androidAppInfo_ = androidAppInfo_;
        this.bitField0_ |= 0x4;
    }
    
    public final void j0(final String appInstanceId_) {
        appInstanceId_.getClass();
        this.bitField0_ |= 0x2;
        this.appInstanceId_ = appInstanceId_;
    }
    
    public final void k0(final d d) {
        this.applicationProcessState_ = d.g();
        this.bitField0_ |= 0x8;
    }
    
    public final void l0(final String googleAppId_) {
        googleAppId_.getClass();
        this.bitField0_ |= 0x1;
        this.googleAppId_ = googleAppId_;
    }
    
    @Override
    public final Object x(final r.c c, final Object o, final Object o2) {
        Label_0184: {
            switch (c$a.a[c.ordinal()]) {
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
                    final T parser = c.PARSER;
                    if (parser == null) {
                        break Label_0184;
                    }
                    return parser;
                }
                case 4: {
                    break Label_0184;
                }
                case 3: {
                    break Label_0184;
                }
                case 2: {
                    break Label_0184;
                }
                case 1: {
                    // monitorenter(c.class)
                    while (true) {
                        Label_0193: {
                            break Label_0193;
                            try {
                                T parser2;
                                if ((parser2 = c.PARSER) == null) {
                                    parser2 = (c.PARSER = new r.b(c.DEFAULT_INSTANCE));
                                }
                                // monitorexit(c.class)
                                return parser2;
                                return new c();
                                return r.O(c.DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0005\u100c\u0003\u00062", new Object[] { "bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", d.c(), "customAttributes_", c.a });
                                return c.DEFAULT_INSTANCE;
                                return new b((c$a)null);
                            }
                            // monitorexit(c.class)
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
            super(c.T());
        }
        
        public boolean D() {
            return ((c)super.p).d0();
        }
        
        public b E(final Map map) {
            ((a)this).y();
            ((c)super.p).b0().putAll(map);
            return this;
        }
        
        public b F(final N4.a.b b) {
            ((a)this).y();
            ((c)super.p).i0((N4.a)((a)b).v());
            return this;
        }
        
        public b G(final String s) {
            ((a)this).y();
            ((c)super.p).j0(s);
            return this;
        }
        
        public b H(final d d) {
            ((a)this).y();
            ((c)super.p).k0(d);
            return this;
        }
        
        public b I(final String s) {
            ((a)this).y();
            ((c)super.p).l0(s);
            return this;
        }
    }
    
    public abstract static final class c
    {
        public static final D a;
        
        static {
            final m0.b y = m0.b.y;
            a = D.d(y, "", y, "");
        }
    }
}
