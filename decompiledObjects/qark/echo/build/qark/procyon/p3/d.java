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

public final class d extends x implements P
{
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final d DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private f aesCtrKey_;
    private v hmacKey_;
    private int version_;
    
    static {
        x.Q(d.class, DEFAULT_INSTANCE = new d());
    }
    
    public static /* synthetic */ d U() {
        return d.DEFAULT_INSTANCE;
    }
    
    public static b b0() {
        return (b)d.DEFAULT_INSTANCE.q();
    }
    
    public static d c0(final h h, final p p2) {
        return (d)x.K(d.DEFAULT_INSTANCE, h, p2);
    }
    
    private void f0(final int version_) {
        this.version_ = version_;
    }
    
    public f Y() {
        f f;
        if ((f = this.aesCtrKey_) == null) {
            f = p3.f.Y();
        }
        return f;
    }
    
    public v Z() {
        v v;
        if ((v = this.hmacKey_) == null) {
            v = p3.v.Y();
        }
        return v;
    }
    
    public int a0() {
        return this.version_;
    }
    
    public final void d0(final f aesCtrKey_) {
        aesCtrKey_.getClass();
        this.aesCtrKey_ = aesCtrKey_;
    }
    
    public final void e0(final v hmacKey_) {
        hmacKey_.getClass();
        this.hmacKey_ = hmacKey_;
    }
    
    @Override
    public final Object t(final x.d d, final Object o, final Object o2) {
        Label_0150: {
            switch (d$a.a[d.ordinal()]) {
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
                    final X parser = d.PARSER;
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
                    // monitorenter(d.class)
                    while (true) {
                        Label_0159: {
                            break Label_0159;
                            try {
                                X parser2;
                                if ((parser2 = d.PARSER) == null) {
                                    parser2 = (d.PARSER = new x.b(d.DEFAULT_INSTANCE));
                                }
                                // monitorexit(d.class)
                                return parser2;
                                return new b((d$a)null);
                                return x.I(d.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[] { "version_", "aesCtrKey_", "hmacKey_" });
                                return d.DEFAULT_INSTANCE;
                                // monitorexit(d.class)
                                return new d();
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
            super(d.U());
        }
        
        public b A(final int n) {
            ((a)this).s();
            ((d)super.p).f0(n);
            return this;
        }
        
        public b y(final f f) {
            ((a)this).s();
            ((d)super.p).d0(f);
            return this;
        }
        
        public b z(final v v) {
            ((a)this).s();
            ((d)super.p).e0(v);
            return this;
        }
    }
}
