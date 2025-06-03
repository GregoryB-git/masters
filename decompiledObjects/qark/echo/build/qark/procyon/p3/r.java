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

public final class r extends x implements P
{
    private static final r DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private h keyValue_;
    private int version_;
    
    static {
        x.Q(r.class, DEFAULT_INSTANCE = new r());
    }
    
    public r() {
        this.keyValue_ = h.p;
    }
    
    public static /* synthetic */ r U() {
        return r.DEFAULT_INSTANCE;
    }
    
    public static b Z() {
        return (b)r.DEFAULT_INSTANCE.q();
    }
    
    public static r a0(final h h, final p p2) {
        return (r)x.K(r.DEFAULT_INSTANCE, h, p2);
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
            switch (r$a.a[d.ordinal()]) {
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
                    final X parser = r.PARSER;
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
                    // monitorenter(r.class)
                    while (true) {
                        Label_0154: {
                            break Label_0154;
                            try {
                                X parser2;
                                if ((parser2 = r.PARSER) == null) {
                                    parser2 = (r.PARSER = new x.b(r.DEFAULT_INSTANCE));
                                }
                                // monitorexit(r.class)
                                return parser2;
                                // monitorexit(r.class)
                                return new b((r$a)null);
                                return new r();
                                return r.DEFAULT_INSTANCE;
                                return x.I(r.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[] { "version_", "keyValue_" });
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
            super(r.U());
        }
        
        public b y(final h h) {
            ((a)this).s();
            ((r)super.p).b0(h);
            return this;
        }
        
        public b z(final int n) {
            ((a)this).s();
            ((r)super.p).c0(n);
            return this;
        }
    }
}
