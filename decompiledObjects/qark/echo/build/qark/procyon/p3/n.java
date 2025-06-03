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

public final class n extends x implements P
{
    private static final n DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private h keyValue_;
    private int version_;
    
    static {
        x.Q(n.class, DEFAULT_INSTANCE = new n());
    }
    
    public n() {
        this.keyValue_ = h.p;
    }
    
    public static /* synthetic */ n U() {
        return n.DEFAULT_INSTANCE;
    }
    
    public static b Z() {
        return (b)n.DEFAULT_INSTANCE.q();
    }
    
    public static n a0(final h h, final p p2) {
        return (n)x.K(n.DEFAULT_INSTANCE, h, p2);
    }
    
    private void b0(final h keyValue_) {
        keyValue_.getClass();
        this.keyValue_ = keyValue_;
    }
    
    private void c0(final int version_) {
        this.version_ = version_;
    }
    
    public h X() {
        return this.keyValue_;
    }
    
    public int Y() {
        return this.version_;
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0145: {
            switch (n$a.a[d.ordinal()]) {
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
                    final X parser = n.PARSER;
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
                    // monitorenter(n.class)
                    while (true) {
                        Label_0154: {
                            break Label_0154;
                            try {
                                X parser2;
                                if ((parser2 = n.PARSER) == null) {
                                    parser2 = (n.PARSER = new x.b(n.DEFAULT_INSTANCE));
                                }
                                // monitorexit(n.class)
                                return parser2;
                                return x.I(n.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[] { "version_", "keyValue_" });
                                return new b((n$a)null);
                                return new n();
                                // monitorexit(n.class)
                                return n.DEFAULT_INSTANCE;
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
            super(n.U());
        }
        
        public b y(final h h) {
            ((a)this).s();
            ((n)super.p).b0(h);
            return this;
        }
        
        public b z(final int n) {
            ((a)this).s();
            ((n)super.p).c0(n);
            return this;
        }
    }
}
