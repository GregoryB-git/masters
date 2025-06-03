// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p3;

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.x;

public final class g extends x implements P
{
    private static final g DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile X PARSER;
    private int keySize_;
    private h params_;
    
    static {
        x.Q(g.class, DEFAULT_INSTANCE = new g());
    }
    
    public static /* synthetic */ g U() {
        return g.DEFAULT_INSTANCE;
    }
    
    public static g X() {
        return g.DEFAULT_INSTANCE;
    }
    
    public static b a0() {
        return (b)g.DEFAULT_INSTANCE.q();
    }
    
    public static g b0(final com.google.crypto.tink.shaded.protobuf.h h, final p p2) {
        return (g)x.K(g.DEFAULT_INSTANCE, h, p2);
    }
    
    private void c0(final int keySize_) {
        this.keySize_ = keySize_;
    }
    
    private void d0(final h params_) {
        params_.getClass();
        this.params_ = params_;
    }
    
    public int Y() {
        return this.keySize_;
    }
    
    public h Z() {
        h h;
        if ((h = this.params_) == null) {
            h = p3.h.W();
        }
        return h;
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0145: {
            switch (g$a.a[d.ordinal()]) {
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
                    final X parser = g.PARSER;
                    if (parser == null) {
                        break Label_0145;
                    }
                    return parser;
                }
                case 4: {
                    break Label_0145;
                }
                case 3: {
                    break Label_0145;
                }
                case 2: {
                    break Label_0145;
                }
                case 1: {
                    // monitorenter(g.class)
                    while (true) {
                        Label_0154: {
                            break Label_0154;
                            try {
                                X parser2;
                                if ((parser2 = g.PARSER) == null) {
                                    parser2 = (g.PARSER = new x.b(g.DEFAULT_INSTANCE));
                                }
                                // monitorexit(g.class)
                                return parser2;
                                return g.DEFAULT_INSTANCE;
                                // monitorexit(g.class)
                                return;
                                return new b((g$a)null);
                                return new g();
                                return x.I(g.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[] { "params_", "keySize_" });
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
            super(g.U());
        }
        
        public b y(final int n) {
            ((a)this).s();
            ((g)super.p).c0(n);
            return this;
        }
        
        public b z(final h h) {
            ((a)this).s();
            ((g)super.p).d0(h);
            return this;
        }
    }
}
