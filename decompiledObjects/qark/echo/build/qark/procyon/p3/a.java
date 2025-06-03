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

public final class a extends x implements P
{
    private static final a DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private h keyValue_;
    private p3.c params_;
    private int version_;
    
    static {
        x.Q(a.class, DEFAULT_INSTANCE = new a());
    }
    
    public a() {
        this.keyValue_ = h.p;
    }
    
    public static /* synthetic */ a U() {
        return a.DEFAULT_INSTANCE;
    }
    
    public static b b0() {
        return (b)a.DEFAULT_INSTANCE.q();
    }
    
    public static a c0(final h h, final p p2) {
        return (a)x.K(a.DEFAULT_INSTANCE, h, p2);
    }
    
    public h Y() {
        return this.keyValue_;
    }
    
    public p3.c Z() {
        p3.c c;
        if ((c = this.params_) == null) {
            c = p3.c.W();
        }
        return c;
    }
    
    public int a0() {
        return this.version_;
    }
    
    public final void d0(final h keyValue_) {
        keyValue_.getClass();
        this.keyValue_ = keyValue_;
    }
    
    public final void e0(final p3.c params_) {
        params_.getClass();
        this.params_ = params_;
    }
    
    public final void f0(final int version_) {
        this.version_ = version_;
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0150: {
            switch (a$a.a[d.ordinal()]) {
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
                    final X parser = a.PARSER;
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
                    // monitorenter(a.class)
                    while (true) {
                        Label_0159: {
                            break Label_0159;
                            try {
                                X parser2;
                                if ((parser2 = a.PARSER) == null) {
                                    parser2 = (a.PARSER = new x.b(a.DEFAULT_INSTANCE));
                                }
                                // monitorexit(a.class)
                                return parser2;
                                return new a();
                                // monitorexit(a.class)
                                return x.I(a.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[] { "version_", "keyValue_", "params_" });
                                return new b((a$a)null);
                                return a.DEFAULT_INSTANCE;
                            }
                            finally {}
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    public static final class b extends x.a implements P
    {
        public b() {
            super(a.U());
        }
        
        public b A(final int n) {
            ((x.a)this).s();
            ((a)super.p).f0(n);
            return this;
        }
        
        public b y(final h h) {
            ((x.a)this).s();
            ((a)super.p).d0(h);
            return this;
        }
        
        public b z(final p3.c c) {
            ((x.a)this).s();
            ((a)super.p).e0(c);
            return this;
        }
    }
}
