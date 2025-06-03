// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p3;

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.z;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.x;

public final class J extends x implements P
{
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final J DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    private String configName_;
    private z.d entry_;
    
    static {
        x.Q(J.class, DEFAULT_INSTANCE = new J());
    }
    
    public J() {
        this.configName_ = "";
        this.entry_ = x.u();
    }
    
    public static /* synthetic */ J U() {
        return J.DEFAULT_INSTANCE;
    }
    
    public static J V() {
        return J.DEFAULT_INSTANCE;
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0150: {
            switch (J$a.a[d.ordinal()]) {
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
                    final X parser = J.PARSER;
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
                    // monitorenter(J.class)
                    while (true) {
                        Label_0159: {
                            break Label_0159;
                            try {
                                X parser2;
                                if ((parser2 = J.PARSER) == null) {
                                    parser2 = (J.PARSER = new x.b(J.DEFAULT_INSTANCE));
                                }
                                // monitorexit(J.class)
                                return parser2;
                                return x.I(J.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u001b", new Object[] { "configName_", "entry_", B.class });
                                return new J();
                                return new b((J$a)null);
                                // monitorexit(J.class)
                                return J.DEFAULT_INSTANCE;
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
            super(J.U());
        }
    }
}
