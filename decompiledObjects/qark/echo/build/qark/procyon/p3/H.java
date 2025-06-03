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

public final class H extends x implements P
{
    private static final H DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile X PARSER;
    private A dekTemplate_;
    private String kekUri_;
    
    static {
        x.Q(H.class, DEFAULT_INSTANCE = new H());
    }
    
    public H() {
        this.kekUri_ = "";
    }
    
    public static /* synthetic */ H U() {
        return H.DEFAULT_INSTANCE;
    }
    
    public static H V() {
        return H.DEFAULT_INSTANCE;
    }
    
    public static H Z(final h h, final p p2) {
        return (H)x.K(H.DEFAULT_INSTANCE, h, p2);
    }
    
    public A W() {
        A a;
        if ((a = this.dekTemplate_) == null) {
            a = A.Y();
        }
        return a;
    }
    
    public String X() {
        return this.kekUri_;
    }
    
    public boolean Y() {
        return this.dekTemplate_ != null;
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0145: {
            switch (H$a.a[d.ordinal()]) {
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
                    final X parser = H.PARSER;
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
                    // monitorenter(H.class)
                    while (true) {
                        Label_0154: {
                            break Label_0154;
                            try {
                                X parser2;
                                if ((parser2 = H.PARSER) == null) {
                                    parser2 = (H.PARSER = new x.b(H.DEFAULT_INSTANCE));
                                }
                                // monitorexit(H.class)
                                return parser2;
                                return H.DEFAULT_INSTANCE;
                                // monitorexit(H.class)
                                return x.I(H.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\t", new Object[] { "kekUri_", "dekTemplate_" });
                                return new H();
                                return new b((H$a)null);
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
            super(H.U());
        }
    }
}
