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

public final class m extends x implements P
{
    private static final m DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private int version_;
    
    static {
        x.Q(m.class, DEFAULT_INSTANCE = new m());
    }
    
    public static /* synthetic */ m U() {
        return m.DEFAULT_INSTANCE;
    }
    
    public static b X() {
        return (b)m.DEFAULT_INSTANCE.q();
    }
    
    public static m Y(final h h, final p p2) {
        return (m)x.K(m.DEFAULT_INSTANCE, h, p2);
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
            switch (m$a.a[d.ordinal()]) {
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
                    final X parser = m.PARSER;
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
                    // monitorenter(m.class)
                    while (true) {
                        Label_0154: {
                            break Label_0154;
                            try {
                                X parser2;
                                if ((parser2 = m.PARSER) == null) {
                                    parser2 = (m.PARSER = new x.b(m.DEFAULT_INSTANCE));
                                }
                                // monitorexit(m.class)
                                return parser2;
                                return new m();
                                return m.DEFAULT_INSTANCE;
                                return new b((m$a)null);
                                return x.I(m.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[] { "keySize_", "version_" });
                            }
                            // monitorexit(m.class)
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
            super(m.U());
        }
        
        public b y(final int n) {
            ((a)this).s();
            ((m)super.p).Z(n);
            return this;
        }
    }
}
