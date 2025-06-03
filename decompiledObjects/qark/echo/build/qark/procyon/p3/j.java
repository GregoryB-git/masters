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

public final class j extends x implements P
{
    private static final j DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile X PARSER;
    private int keySize_;
    private k params_;
    
    static {
        x.Q(j.class, DEFAULT_INSTANCE = new j());
    }
    
    public static /* synthetic */ j U() {
        return j.DEFAULT_INSTANCE;
    }
    
    public static b Z() {
        return (b)j.DEFAULT_INSTANCE.q();
    }
    
    public static j a0(final h h, final p p2) {
        return (j)x.K(j.DEFAULT_INSTANCE, h, p2);
    }
    
    private void b0(final int keySize_) {
        this.keySize_ = keySize_;
    }
    
    private void c0(final k params_) {
        params_.getClass();
        this.params_ = params_;
    }
    
    public int X() {
        return this.keySize_;
    }
    
    public k Y() {
        k k;
        if ((k = this.params_) == null) {
            k = p3.k.W();
        }
        return k;
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0145: {
            switch (j$a.a[d.ordinal()]) {
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
                    final X parser = j.PARSER;
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
                    // monitorenter(j.class)
                    while (true) {
                        Label_0154: {
                            break Label_0154;
                            try {
                                X parser2;
                                if ((parser2 = j.PARSER) == null) {
                                    parser2 = (j.PARSER = new x.b(j.DEFAULT_INSTANCE));
                                }
                                // monitorexit(j.class)
                                return parser2;
                                return new j();
                                // monitorexit(j.class)
                                return x.I(j.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[] { "params_", "keySize_" });
                                return j.DEFAULT_INSTANCE;
                                return new b((j$a)null);
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
            super(j.U());
        }
        
        public b y(final int n) {
            ((a)this).s();
            ((j)super.p).b0(n);
            return this;
        }
        
        public b z(final k k) {
            ((a)this).s();
            ((j)super.p).c0(k);
            return this;
        }
    }
}
