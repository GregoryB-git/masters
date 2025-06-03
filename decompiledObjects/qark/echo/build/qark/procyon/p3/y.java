// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p3;

import com.google.crypto.tink.shaded.protobuf.z;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.x;

public final class y extends x implements P
{
    private static final y DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile X PARSER;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_;
    private h value_;
    
    static {
        x.Q(y.class, DEFAULT_INSTANCE = new y());
    }
    
    public y() {
        this.typeUrl_ = "";
        this.value_ = h.p;
    }
    
    public static /* synthetic */ y U() {
        return y.DEFAULT_INSTANCE;
    }
    
    public static y Y() {
        return y.DEFAULT_INSTANCE;
    }
    
    public static b c0() {
        return (b)y.DEFAULT_INSTANCE.q();
    }
    
    public c Z() {
        c c;
        if ((c = y.c.c(this.keyMaterialType_)) == null) {
            c = y.c.u;
        }
        return c;
    }
    
    public String a0() {
        return this.typeUrl_;
    }
    
    public h b0() {
        return this.value_;
    }
    
    public final void d0(final c c) {
        this.keyMaterialType_ = c.g();
    }
    
    public final void e0(final String typeUrl_) {
        typeUrl_.getClass();
        this.typeUrl_ = typeUrl_;
    }
    
    public final void f0(final h value_) {
        value_.getClass();
        this.value_ = value_;
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0150: {
            switch (y$a.a[d.ordinal()]) {
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
                    final X parser = y.PARSER;
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
                    // monitorenter(y.class)
                    while (true) {
                        Label_0159: {
                            break Label_0159;
                            try {
                                X parser2;
                                if ((parser2 = y.PARSER) == null) {
                                    parser2 = (y.PARSER = new x.b(y.DEFAULT_INSTANCE));
                                }
                                // monitorexit(y.class)
                                return parser2;
                                // monitorexit(y.class)
                                return new b((y$a)null);
                                return y.DEFAULT_INSTANCE;
                                return x.I(y.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\n\u0003\f", new Object[] { "typeUrl_", "value_", "keyMaterialType_" });
                                return new y();
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
            super(y.U());
        }
        
        public b A(final h h) {
            ((a)this).s();
            ((y)super.p).f0(h);
            return this;
        }
        
        public b y(final y.c c) {
            ((a)this).s();
            ((y)super.p).d0(c);
            return this;
        }
        
        public b z(final String s) {
            ((a)this).s();
            ((y)super.p).e0(s);
            return this;
        }
    }
    
    public enum c implements z.a
    {
        p("UNKNOWN_KEYMATERIAL", 0, 0), 
        q("SYMMETRIC", 1, 1), 
        r("ASYMMETRIC_PRIVATE", 2, 2), 
        s("ASYMMETRIC_PUBLIC", 3, 3), 
        t("REMOTE", 4, 4), 
        u("UNRECOGNIZED", 5, -1);
        
        public static final z.b v;
        public final int o;
        
        static {
            v = new z.b() {};
        }
        
        public c(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        public static c c(final int n) {
            if (n == 0) {
                return c.p;
            }
            if (n == 1) {
                return c.q;
            }
            if (n == 2) {
                return c.r;
            }
            if (n == 3) {
                return c.s;
            }
            if (n != 4) {
                return null;
            }
            return c.t;
        }
        
        public final int g() {
            if (this != c.u) {
                return this.o;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }
}
