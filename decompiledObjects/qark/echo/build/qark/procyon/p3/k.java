// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p3;

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.x;

public final class k extends x implements P
{
    private static final k DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile X PARSER;
    private int ivSize_;
    
    static {
        x.Q(k.class, DEFAULT_INSTANCE = new k());
    }
    
    public static /* synthetic */ k U() {
        return k.DEFAULT_INSTANCE;
    }
    
    public static k W() {
        return k.DEFAULT_INSTANCE;
    }
    
    public static b Y() {
        return (b)k.DEFAULT_INSTANCE.q();
    }
    
    private void Z(final int ivSize_) {
        this.ivSize_ = ivSize_;
    }
    
    public int X() {
        return this.ivSize_;
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0140: {
            switch (k$a.a[d.ordinal()]) {
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
                    final X parser = k.PARSER;
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
                    // monitorenter(k.class)
                    while (true) {
                        Label_0149: {
                            break Label_0149;
                            try {
                                X parser2;
                                if ((parser2 = k.PARSER) == null) {
                                    parser2 = (k.PARSER = new x.b(k.DEFAULT_INSTANCE));
                                }
                                // monitorexit(k.class)
                                return parser2;
                                return k.DEFAULT_INSTANCE;
                                return new k();
                                // monitorexit(k.class)
                                return new b((k$a)null);
                                return x.I(k.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[] { "ivSize_" });
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
            super(k.U());
        }
        
        public b y(final int n) {
            ((a)this).s();
            ((k)super.p).Z(n);
            return this;
        }
    }
}
