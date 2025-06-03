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

public final class o extends x implements P
{
    private static final o DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int keySize_;
    private int version_;
    
    static {
        x.Q(o.class, DEFAULT_INSTANCE = new o());
    }
    
    public static /* synthetic */ o U() {
        return o.DEFAULT_INSTANCE;
    }
    
    public static b X() {
        return (b)o.DEFAULT_INSTANCE.q();
    }
    
    public static o Y(final h h, final p p2) {
        return (o)x.K(o.DEFAULT_INSTANCE, h, p2);
    }
    
    private void Z(final int keySize_) {
        this.keySize_ = keySize_;
    }
    
    public int W() {
        return this.keySize_;
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0145: {
            switch (o$a.a[d.ordinal()]) {
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
                    final X parser = o.PARSER;
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
                    // monitorenter(o.class)
                    while (true) {
                        Label_0154: {
                            break Label_0154;
                            try {
                                X parser2;
                                if ((parser2 = o.PARSER) == null) {
                                    parser2 = (o.PARSER = new x.b(o.DEFAULT_INSTANCE));
                                }
                                // monitorexit(o.class)
                                return parser2;
                                return x.I(o.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[] { "version_", "keySize_" });
                                return o.DEFAULT_INSTANCE;
                                return new o();
                                // monitorexit(o.class)
                                return new b((o$a)null);
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
            super(o.U());
        }
        
        public b y(final int n) {
            ((a)this).s();
            ((o)super.p).Z(n);
            return this;
        }
    }
}
