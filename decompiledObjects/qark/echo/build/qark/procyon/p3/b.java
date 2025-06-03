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

public final class b extends x implements P
{
    private static final b DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    private int keySize_;
    private p3.c params_;
    
    static {
        x.Q(b.class, DEFAULT_INSTANCE = new b());
    }
    
    public static /* synthetic */ b U() {
        return b.DEFAULT_INSTANCE;
    }
    
    public static b Z() {
        return (b)b.DEFAULT_INSTANCE.q();
    }
    
    public static b a0(final h h, final p p2) {
        return (b)x.K(b.DEFAULT_INSTANCE, h, p2);
    }
    
    private void c0(final p3.c params_) {
        params_.getClass();
        this.params_ = params_;
    }
    
    public int X() {
        return this.keySize_;
    }
    
    public p3.c Y() {
        p3.c c;
        if ((c = this.params_) == null) {
            c = p3.c.W();
        }
        return c;
    }
    
    public final void b0(final int keySize_) {
        this.keySize_ = keySize_;
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0145: {
            switch (b$a.a[d.ordinal()]) {
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
                    final X parser = b.PARSER;
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
                    // monitorenter(b.class)
                    while (true) {
                        Label_0154: {
                            break Label_0154;
                            try {
                                X parser2;
                                if ((parser2 = b.PARSER) == null) {
                                    parser2 = (b.PARSER = new x.b(b.DEFAULT_INSTANCE));
                                }
                                // monitorexit(b.class)
                                return parser2;
                                return b.DEFAULT_INSTANCE;
                                return x.I(b.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[] { "keySize_", "params_" });
                                return new b();
                                // monitorexit(b.class)
                                return new b((b$a)null);
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
            super(p3.b.U());
        }
        
        public b y(final int n) {
            ((a)this).s();
            ((p3.b)super.p).b0(n);
            return this;
        }
        
        public b z(final p3.c c) {
            ((a)this).s();
            ((p3.b)super.p).c0(c);
            return this;
        }
    }
}
