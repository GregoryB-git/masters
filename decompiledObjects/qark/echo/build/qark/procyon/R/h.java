// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R;

import androidx.datastore.preferences.protobuf.O;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.w;

public final class h extends w implements P
{
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile X PARSER;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_;
    private Object value_;
    
    static {
        w.F(h.class, DEFAULT_INSTANCE = new h());
    }
    
    public h() {
        this.valueCase_ = 0;
    }
    
    public static /* synthetic */ h L() {
        return h.DEFAULT_INSTANCE;
    }
    
    public static h Q() {
        return h.DEFAULT_INSTANCE;
    }
    
    public static a Y() {
        return (a)h.DEFAULT_INSTANCE.p();
    }
    
    public boolean P() {
        return this.valueCase_ == 1 && (boolean)this.value_;
    }
    
    public double R() {
        if (this.valueCase_ == 7) {
            return (double)this.value_;
        }
        return 0.0;
    }
    
    public float S() {
        if (this.valueCase_ == 2) {
            return (float)this.value_;
        }
        return 0.0f;
    }
    
    public int T() {
        if (this.valueCase_ == 3) {
            return (int)this.value_;
        }
        return 0;
    }
    
    public long U() {
        if (this.valueCase_ == 4) {
            return (long)this.value_;
        }
        return 0L;
    }
    
    public String V() {
        if (this.valueCase_ == 5) {
            return (String)this.value_;
        }
        return "";
    }
    
    public g W() {
        if (this.valueCase_ == 6) {
            return (g)this.value_;
        }
        return g.L();
    }
    
    public b X() {
        return b.c(this.valueCase_);
    }
    
    public final void Z(final boolean b) {
        this.valueCase_ = 1;
        this.value_ = b;
    }
    
    public final void a0(final double d) {
        this.valueCase_ = 7;
        this.value_ = d;
    }
    
    public final void b0(final float f) {
        this.valueCase_ = 2;
        this.value_ = f;
    }
    
    public final void c0(final int i) {
        this.valueCase_ = 3;
        this.value_ = i;
    }
    
    public final void d0(final long l) {
        this.valueCase_ = 4;
        this.value_ = l;
    }
    
    public final void e0(final String value_) {
        value_.getClass();
        this.valueCase_ = 5;
        this.value_ = value_;
    }
    
    public final void f0(final g.a a) {
        this.value_ = ((w.a)a).s();
        this.valueCase_ = 6;
    }
    
    @Override
    public final Object s(final d d, final Object o, final Object o2) {
        Label_0155: {
            switch (e.a[d.ordinal()]) {
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
                    final X parser = h.PARSER;
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
                    // monitorenter(h.class)
                    while (true) {
                        Label_0164: {
                            break Label_0164;
                            try {
                                X parser2;
                                if ((parser2 = h.PARSER) == null) {
                                    parser2 = (h.PARSER = new w.b(h.DEFAULT_INSTANCE));
                                }
                                // monitorexit(h.class)
                                return parser2;
                                return new a((e)null);
                                return w.C(h.DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[] { "value_", "valueCase_", "bitField0_", g.class });
                                return new h();
                                // monitorexit(h.class)
                                return;
                                return h.DEFAULT_INSTANCE;
                            }
                            finally {}
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    public static final class a extends w.a implements P
    {
        public a() {
            super(h.L());
        }
        
        public a A(final boolean b) {
            ((w.a)this).v();
            ((h)super.p).Z(b);
            return this;
        }
        
        public a B(final double n) {
            ((w.a)this).v();
            ((h)super.p).a0(n);
            return this;
        }
        
        public a C(final float n) {
            ((w.a)this).v();
            ((h)super.p).b0(n);
            return this;
        }
        
        public a D(final int n) {
            ((w.a)this).v();
            ((h)super.p).c0(n);
            return this;
        }
        
        public a E(final long n) {
            ((w.a)this).v();
            ((h)super.p).d0(n);
            return this;
        }
        
        public a F(final String s) {
            ((w.a)this).v();
            ((h)super.p).e0(s);
            return this;
        }
        
        public a G(final g.a a) {
            ((w.a)this).v();
            ((h)super.p).f0(a);
            return this;
        }
    }
    
    public enum b
    {
        p("BOOLEAN", 0, 1), 
        q("FLOAT", 1, 2), 
        r("INTEGER", 2, 3), 
        s("LONG", 3, 4), 
        t("STRING", 4, 5), 
        u("STRING_SET", 5, 6), 
        v("DOUBLE", 6, 7), 
        w("VALUE_NOT_SET", 7, 0);
        
        public final int o;
        
        public b(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        public static b c(final int n) {
            switch (n) {
                default: {
                    return null;
                }
                case 7: {
                    return b.v;
                }
                case 6: {
                    return b.u;
                }
                case 5: {
                    return b.t;
                }
                case 4: {
                    return b.s;
                }
                case 3: {
                    return b.r;
                }
                case 2: {
                    return b.q;
                }
                case 1: {
                    return b.p;
                }
                case 0: {
                    return b.w;
                }
            }
        }
    }
}
