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

public final class w extends x implements P
{
    private static final w DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private p3.x params_;
    private int version_;
    
    static {
        x.Q(w.class, DEFAULT_INSTANCE = new w());
    }
    
    public static /* synthetic */ w U() {
        return w.DEFAULT_INSTANCE;
    }
    
    public static w X() {
        return w.DEFAULT_INSTANCE;
    }
    
    public static b a0() {
        return (b)w.DEFAULT_INSTANCE.q();
    }
    
    public static w b0(final h h, final p p2) {
        return (w)x.K(w.DEFAULT_INSTANCE, h, p2);
    }
    
    private void c0(final int keySize_) {
        this.keySize_ = keySize_;
    }
    
    private void d0(final p3.x params_) {
        params_.getClass();
        this.params_ = params_;
    }
    
    public int Y() {
        return this.keySize_;
    }
    
    public p3.x Z() {
        p3.x x;
        if ((x = this.params_) == null) {
            x = p3.x.X();
        }
        return x;
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0150: {
            switch (w$a.a[d.ordinal()]) {
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
                    final X parser = w.PARSER;
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
                    // monitorenter(w.class)
                    while (true) {
                        Label_0159: {
                            break Label_0159;
                            try {
                                X parser2;
                                if ((parser2 = w.PARSER) == null) {
                                    parser2 = (w.PARSER = new x.b(w.DEFAULT_INSTANCE));
                                }
                                // monitorexit(w.class)
                                return parser2;
                                // monitorexit(w.class)
                                return w.DEFAULT_INSTANCE;
                                return new w();
                                return x.I(w.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[] { "params_", "keySize_", "version_" });
                                return new b((w$a)null);
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
            super(w.U());
        }
        
        public b y(final int n) {
            ((a)this).s();
            ((w)super.p).c0(n);
            return this;
        }
        
        public b z(final p3.x x) {
            ((a)this).s();
            ((w)super.p).d0(x);
            return this;
        }
    }
}
