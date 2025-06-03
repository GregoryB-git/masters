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

public final class s extends x implements P
{
    private static final s DEFAULT_INSTANCE;
    private static volatile X PARSER;
    
    static {
        x.Q(s.class, DEFAULT_INSTANCE = new s());
    }
    
    public static /* synthetic */ s U() {
        return s.DEFAULT_INSTANCE;
    }
    
    public static s V() {
        return s.DEFAULT_INSTANCE;
    }
    
    public static s W(final h h, final p p2) {
        return (s)x.K(s.DEFAULT_INSTANCE, h, p2);
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0132: {
            switch (s$a.a[d.ordinal()]) {
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
                    final X parser = s.PARSER;
                    if (parser == null) {
                        break Label_0132;
                    }
                    return parser;
                }
                case 4: {
                    break Label_0132;
                }
                case 3: {
                    break Label_0132;
                }
                case 2: {
                    break Label_0132;
                }
                case 1: {
                    // monitorenter(s.class)
                    while (true) {
                        Label_0141: {
                            break Label_0141;
                            try {
                                X parser2;
                                if ((parser2 = s.PARSER) == null) {
                                    parser2 = (s.PARSER = new x.b(s.DEFAULT_INSTANCE));
                                }
                                // monitorexit(s.class)
                                return parser2;
                                return new b((s$a)null);
                                return new s();
                                // monitorexit(s.class)
                                return s.DEFAULT_INSTANCE;
                                return x.I(s.DEFAULT_INSTANCE, "\u0000\u0000", null);
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
            super(s.U());
        }
    }
}
