// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p3;

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.x;

public final class f extends x implements P
{
    private static final f DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private h keyValue_;
    private p3.h params_;
    private int version_;
    
    static {
        x.Q(f.class, DEFAULT_INSTANCE = new f());
    }
    
    public f() {
        this.keyValue_ = h.p;
    }
    
    public static /* synthetic */ f U() {
        return f.DEFAULT_INSTANCE;
    }
    
    public static f Y() {
        return f.DEFAULT_INSTANCE;
    }
    
    public static b c0() {
        return (b)f.DEFAULT_INSTANCE.q();
    }
    
    public static f d0(final h h, final p p2) {
        return (f)x.K(f.DEFAULT_INSTANCE, h, p2);
    }
    
    private void e0(final h keyValue_) {
        keyValue_.getClass();
        this.keyValue_ = keyValue_;
    }
    
    private void g0(final int version_) {
        this.version_ = version_;
    }
    
    public h Z() {
        return this.keyValue_;
    }
    
    public p3.h a0() {
        p3.h h;
        if ((h = this.params_) == null) {
            h = p3.h.W();
        }
        return h;
    }
    
    public int b0() {
        return this.version_;
    }
    
    public final void f0(final p3.h params_) {
        params_.getClass();
        this.params_ = params_;
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0150: {
            switch (f$a.a[d.ordinal()]) {
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
                    final X parser = f.PARSER;
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
                    // monitorenter(f.class)
                    while (true) {
                        Label_0159: {
                            break Label_0159;
                            try {
                                X parser2;
                                if ((parser2 = f.PARSER) == null) {
                                    parser2 = (f.PARSER = new x.b(f.DEFAULT_INSTANCE));
                                }
                                // monitorexit(f.class)
                                return parser2;
                                // monitorexit(f.class)
                                return new f();
                                return f.DEFAULT_INSTANCE;
                                return new b((f$a)null);
                                return x.I(f.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[] { "version_", "params_", "keyValue_" });
                            }
                            finally {}
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    public static final class b extends a implements P
    {
        public b() {
            super(f.U());
        }
        
        public b A(final int n) {
            ((a)this).s();
            ((f)super.p).g0(n);
            return this;
        }
        
        public b y(final h h) {
            ((a)this).s();
            ((f)super.p).e0(h);
            return this;
        }
        
        public b z(final p3.h h) {
            ((a)this).s();
            ((f)super.p).f0(h);
            return this;
        }
    }
}
