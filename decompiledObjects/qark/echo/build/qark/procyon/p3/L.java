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

public final class L extends x implements P
{
    private static final L DEFAULT_INSTANCE;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;
    
    static {
        x.Q(L.class, DEFAULT_INSTANCE = new L());
    }
    
    public static /* synthetic */ L U() {
        return L.DEFAULT_INSTANCE;
    }
    
    public static L V() {
        return L.DEFAULT_INSTANCE;
    }
    
    public static L W(final h h, final p p2) {
        return (L)x.K(L.DEFAULT_INSTANCE, h, p2);
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0140: {
            switch (L$a.a[d.ordinal()]) {
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
                    final X parser = L.PARSER;
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
                    // monitorenter(L.class)
                    while (true) {
                        Label_0149: {
                            break Label_0149;
                            try {
                                X parser2;
                                if ((parser2 = L.PARSER) == null) {
                                    parser2 = (L.PARSER = new x.b(L.DEFAULT_INSTANCE));
                                }
                                // monitorexit(L.class)
                                return parser2;
                                // monitorexit(L.class)
                                return L.DEFAULT_INSTANCE;
                                return x.I(L.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[] { "version_" });
                                return new b((L$a)null);
                                return new L();
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
            super(L.U());
        }
    }
}
