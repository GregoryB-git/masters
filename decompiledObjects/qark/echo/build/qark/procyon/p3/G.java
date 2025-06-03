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

public final class G extends x implements P
{
    private static final G DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private H params_;
    private int version_;
    
    static {
        x.Q(G.class, DEFAULT_INSTANCE = new G());
    }
    
    public static /* synthetic */ G U() {
        return G.DEFAULT_INSTANCE;
    }
    
    public static b Z() {
        return (b)G.DEFAULT_INSTANCE.q();
    }
    
    public static G a0(final h h, final p p2) {
        return (G)x.K(G.DEFAULT_INSTANCE, h, p2);
    }
    
    private void c0(final int version_) {
        this.version_ = version_;
    }
    
    public H X() {
        H h;
        if ((h = this.params_) == null) {
            h = H.V();
        }
        return h;
    }
    
    public int Y() {
        return this.version_;
    }
    
    public final void b0(final H params_) {
        params_.getClass();
        this.params_ = params_;
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0145: {
            switch (G$a.a[d.ordinal()]) {
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
                    final X parser = G.PARSER;
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
                    // monitorenter(G.class)
                    while (true) {
                        Label_0154: {
                            break Label_0154;
                            try {
                                X parser2;
                                if ((parser2 = G.PARSER) == null) {
                                    parser2 = (G.PARSER = new x.b(G.DEFAULT_INSTANCE));
                                }
                                // monitorexit(G.class)
                                return parser2;
                                return x.I(G.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[] { "version_", "params_" });
                                return G.DEFAULT_INSTANCE;
                                // monitorexit(G.class)
                                return new G();
                                return new b((G$a)null);
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
            super(G.U());
        }
        
        public b y(final H h) {
            ((a)this).s();
            ((G)super.p).b0(h);
            return this;
        }
        
        public b z(final int n) {
            ((a)this).s();
            ((G)super.p).c0(n);
            return this;
        }
    }
}
