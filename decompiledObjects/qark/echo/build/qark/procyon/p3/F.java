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

public final class F extends x implements P
{
    private static final F DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile X PARSER;
    private String keyUri_;
    
    static {
        x.Q(F.class, DEFAULT_INSTANCE = new F());
    }
    
    public F() {
        this.keyUri_ = "";
    }
    
    public static /* synthetic */ F U() {
        return F.DEFAULT_INSTANCE;
    }
    
    public static F V() {
        return F.DEFAULT_INSTANCE;
    }
    
    public static F X(final h h, final p p2) {
        return (F)x.K(F.DEFAULT_INSTANCE, h, p2);
    }
    
    public String W() {
        return this.keyUri_;
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0140: {
            switch (F$a.a[d.ordinal()]) {
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
                    final X parser = F.PARSER;
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
                    // monitorenter(F.class)
                    while (true) {
                        Label_0149: {
                            break Label_0149;
                            try {
                                X parser2;
                                if ((parser2 = F.PARSER) == null) {
                                    parser2 = (F.PARSER = new x.b(F.DEFAULT_INSTANCE));
                                }
                                // monitorexit(F.class)
                                return parser2;
                                // monitorexit(F.class)
                                return x.I(F.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "keyUri_" });
                                return F.DEFAULT_INSTANCE;
                                return new F();
                                return new b((F$a)null);
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
            super(F.U());
        }
    }
}
