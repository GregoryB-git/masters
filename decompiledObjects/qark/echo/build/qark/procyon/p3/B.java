// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p3;

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.x;

public final class B extends x implements P
{
    public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
    private static final B DEFAULT_INSTANCE;
    public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
    public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
    private static volatile X PARSER;
    public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
    public static final int TYPE_URL_FIELD_NUMBER = 2;
    private String catalogueName_;
    private int keyManagerVersion_;
    private boolean newKeyAllowed_;
    private String primitiveName_;
    private String typeUrl_;
    
    static {
        x.Q(B.class, DEFAULT_INSTANCE = new B());
    }
    
    public B() {
        this.primitiveName_ = "";
        this.typeUrl_ = "";
        this.catalogueName_ = "";
    }
    
    public static /* synthetic */ B U() {
        return B.DEFAULT_INSTANCE;
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0160: {
            switch (B$a.a[d.ordinal()]) {
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
                    final X parser = B.PARSER;
                    if (parser == null) {
                        break Label_0160;
                    }
                    return parser;
                }
                case 4: {
                    break Label_0160;
                }
                case 3: {
                    break Label_0160;
                }
                case 2: {
                    break Label_0160;
                }
                case 1: {
                    // monitorenter(B.class)
                    while (true) {
                        Label_0169: {
                            break Label_0169;
                            try {
                                X parser2;
                                if ((parser2 = B.PARSER) == null) {
                                    parser2 = (B.PARSER = new x.b(B.DEFAULT_INSTANCE));
                                }
                                // monitorexit(B.class)
                                return parser2;
                                // monitorexit(B.class)
                                return B.DEFAULT_INSTANCE;
                                return new b((B$a)null);
                                return x.I(B.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u000b\u0004\u0007\u0005\u0208", new Object[] { "primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_" });
                                return new B();
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
            super(B.U());
        }
    }
}
