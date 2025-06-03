// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p3;

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.p;
import java.io.InputStream;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.x;

public final class t extends x implements P
{
    private static final t DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile X PARSER;
    private h encryptedKeyset_;
    private D keysetInfo_;
    
    static {
        x.Q(t.class, DEFAULT_INSTANCE = new t());
    }
    
    public t() {
        this.encryptedKeyset_ = h.p;
    }
    
    public static /* synthetic */ t U() {
        return t.DEFAULT_INSTANCE;
    }
    
    public static b Y() {
        return (b)t.DEFAULT_INSTANCE.q();
    }
    
    public static t Z(final InputStream inputStream, final p p2) {
        return (t)x.L(t.DEFAULT_INSTANCE, inputStream, p2);
    }
    
    public h X() {
        return this.encryptedKeyset_;
    }
    
    public final void a0(final h encryptedKeyset_) {
        encryptedKeyset_.getClass();
        this.encryptedKeyset_ = encryptedKeyset_;
    }
    
    public final void b0(final D keysetInfo_) {
        keysetInfo_.getClass();
        this.keysetInfo_ = keysetInfo_;
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0145: {
            switch (t$a.a[d.ordinal()]) {
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
                    final X parser = t.PARSER;
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
                    // monitorenter(t.class)
                    while (true) {
                        Label_0154: {
                            break Label_0154;
                            try {
                                X parser2;
                                if ((parser2 = t.PARSER) == null) {
                                    parser2 = (t.PARSER = new x.b(t.DEFAULT_INSTANCE));
                                }
                                // monitorexit(t.class)
                                return parser2;
                                return new b((t$a)null);
                                // monitorexit(t.class)
                                return x.I(t.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[] { "encryptedKeyset_", "keysetInfo_" });
                                return new t();
                                return t.DEFAULT_INSTANCE;
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
            super(t.U());
        }
        
        public b y(final h h) {
            ((a)this).s();
            ((t)super.p).a0(h);
            return this;
        }
        
        public b z(final D d) {
            ((a)this).s();
            ((t)super.p).b0(d);
            return this;
        }
    }
}
