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

public final class e extends x implements P
{
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final e DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    private g aesCtrKeyFormat_;
    private w hmacKeyFormat_;
    
    static {
        x.Q(e.class, DEFAULT_INSTANCE = new e());
    }
    
    public static /* synthetic */ e U() {
        return e.DEFAULT_INSTANCE;
    }
    
    public static b Z() {
        return (b)e.DEFAULT_INSTANCE.q();
    }
    
    public static e a0(final h h, final p p2) {
        return (e)x.K(e.DEFAULT_INSTANCE, h, p2);
    }
    
    public g X() {
        g g;
        if ((g = this.aesCtrKeyFormat_) == null) {
            g = p3.g.X();
        }
        return g;
    }
    
    public w Y() {
        w w;
        if ((w = this.hmacKeyFormat_) == null) {
            w = p3.w.X();
        }
        return w;
    }
    
    public final void b0(final g aesCtrKeyFormat_) {
        aesCtrKeyFormat_.getClass();
        this.aesCtrKeyFormat_ = aesCtrKeyFormat_;
    }
    
    public final void c0(final w hmacKeyFormat_) {
        hmacKeyFormat_.getClass();
        this.hmacKeyFormat_ = hmacKeyFormat_;
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0145: {
            switch (e$a.a[d.ordinal()]) {
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
                    final X parser = e.PARSER;
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
                    // monitorenter(e.class)
                    while (true) {
                        Label_0154: {
                            break Label_0154;
                            try {
                                X parser2;
                                if ((parser2 = e.PARSER) == null) {
                                    parser2 = (e.PARSER = new x.b(e.DEFAULT_INSTANCE));
                                }
                                // monitorexit(e.class)
                                return parser2;
                                return new e();
                                // monitorexit(e.class)
                                return x.I(e.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "aesCtrKeyFormat_", "hmacKeyFormat_" });
                                return e.DEFAULT_INSTANCE;
                                return new b((e$a)null);
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
            super(e.U());
        }
        
        public b y(final g g) {
            ((a)this).s();
            ((e)super.p).b0(g);
            return this;
        }
        
        public b z(final w w) {
            ((a)this).s();
            ((e)super.p).c0(w);
            return this;
        }
    }
}
