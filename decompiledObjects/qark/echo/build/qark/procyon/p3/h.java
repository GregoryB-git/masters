// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p3;

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.x;

public final class h extends x implements P
{
    private static final h DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile X PARSER;
    private int ivSize_;
    
    static {
        x.Q(h.class, DEFAULT_INSTANCE = new h());
    }
    
    public static /* synthetic */ h U() {
        return h.DEFAULT_INSTANCE;
    }
    
    public static h W() {
        return h.DEFAULT_INSTANCE;
    }
    
    public static b Y() {
        return (b)h.DEFAULT_INSTANCE.q();
    }
    
    public int X() {
        return this.ivSize_;
    }
    
    public final void Z(final int ivSize_) {
        this.ivSize_ = ivSize_;
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0140: {
            switch (h$a.a[d.ordinal()]) {
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
                        break Label_0140;
                    }
                    return parser;
                }
                case 4: {
                    break Label_0140;
                }
                case 3: {
                    break Label_0140;
                }
                case 2: {
                    break Label_0140;
                }
                case 1: {
                    // monitorenter(h.class)
                    while (true) {
                        Label_0149: {
                            break Label_0149;
                            try {
                                X parser2;
                                if ((parser2 = h.PARSER) == null) {
                                    parser2 = (h.PARSER = new x.b(h.DEFAULT_INSTANCE));
                                }
                                // monitorexit(h.class)
                                return parser2;
                                return new b((h$a)null);
                                // monitorexit(h.class)
                                return x.I(h.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[] { "ivSize_" });
                                return h.DEFAULT_INSTANCE;
                                return new h();
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
            super(h.U());
        }
        
        public b y(final int n) {
            ((a)this).s();
            ((h)super.p).Z(n);
            return this;
        }
    }
}
