// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p3;

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.x;

public final class p extends x implements P
{
    private static final p DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private h keyValue_;
    private int version_;
    
    static {
        x.Q(p.class, DEFAULT_INSTANCE = new p());
    }
    
    public p() {
        this.keyValue_ = h.p;
    }
    
    public static /* synthetic */ p U() {
        return p.DEFAULT_INSTANCE;
    }
    
    public static b Z() {
        return (b)p.DEFAULT_INSTANCE.q();
    }
    
    public static p a0(final h h, final com.google.crypto.tink.shaded.protobuf.p p2) {
        return (p)x.K(p.DEFAULT_INSTANCE, h, p2);
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
            switch (p$a.a[d.ordinal()]) {
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
                    final X parser = p.PARSER;
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
                    // monitorenter(p.class)
                    while (true) {
                        Label_0154: {
                            break Label_0154;
                            try {
                                X parser2;
                                if ((parser2 = p.PARSER) == null) {
                                    parser2 = (p.PARSER = new x.b(p.DEFAULT_INSTANCE));
                                }
                                // monitorexit(p.class)
                                return parser2;
                                return p.DEFAULT_INSTANCE;
                                return new p();
                                return x.I(p.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[] { "version_", "keyValue_" });
                                return new b((p$a)null);
                            }
                            // monitorexit(p.class)
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
            super(p.U());
        }
        
        public b y(final h h) {
            ((a)this).s();
            ((p)super.p).b0(h);
            return this;
        }
        
        public b z(final int n) {
            ((a)this).s();
            ((p)super.p).c0(n);
            return this;
        }
    }
}
