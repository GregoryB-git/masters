// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p3;

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.P;

public final class x extends com.google.crypto.tink.shaded.protobuf.x implements P
{
    private static final x DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile X PARSER;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;
    
    static {
        com.google.crypto.tink.shaded.protobuf.x.Q(x.class, DEFAULT_INSTANCE = new x());
    }
    
    public static /* synthetic */ x U() {
        return x.DEFAULT_INSTANCE;
    }
    
    public static x X() {
        return x.DEFAULT_INSTANCE;
    }
    
    public static b a0() {
        return (b)x.DEFAULT_INSTANCE.q();
    }
    
    private void c0(final int tagSize_) {
        this.tagSize_ = tagSize_;
    }
    
    public u Y() {
        u u;
        if ((u = p3.u.c(this.hash_)) == null) {
            u = p3.u.v;
        }
        return u;
    }
    
    public int Z() {
        return this.tagSize_;
    }
    
    public final void b0(final u u) {
        this.hash_ = u.g();
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0145: {
            switch (x$a.a[d.ordinal()]) {
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
                    final X parser = x.PARSER;
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
                    // monitorenter(x.class)
                    while (true) {
                        Label_0154: {
                            break Label_0154;
                            try {
                                X parser2;
                                if ((parser2 = x.PARSER) == null) {
                                    parser2 = (x.PARSER = new com.google.crypto.tink.shaded.protobuf.x.b(x.DEFAULT_INSTANCE));
                                }
                                // monitorexit(x.class)
                                return parser2;
                                return new b((x$a)null);
                                return com.google.crypto.tink.shaded.protobuf.x.I(x.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[] { "hash_", "tagSize_" });
                                return x.DEFAULT_INSTANCE;
                                // monitorexit(x.class)
                                return;
                                return new x();
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
            super(x.U());
        }
        
        public b y(final u u) {
            ((a)this).s();
            ((x)super.p).b0(u);
            return this;
        }
        
        public b z(final int n) {
            ((a)this).s();
            ((x)super.p).c0(n);
            return this;
        }
    }
}
