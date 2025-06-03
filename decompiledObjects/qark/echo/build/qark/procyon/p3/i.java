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

public final class i extends x implements P
{
    private static final i DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private h keyValue_;
    private k params_;
    private int version_;
    
    static {
        x.Q(i.class, DEFAULT_INSTANCE = new i());
    }
    
    public i() {
        this.keyValue_ = h.p;
    }
    
    public static /* synthetic */ i U() {
        return i.DEFAULT_INSTANCE;
    }
    
    public static b b0() {
        return (b)i.DEFAULT_INSTANCE.q();
    }
    
    public static i c0(final h h, final p p2) {
        return (i)x.K(i.DEFAULT_INSTANCE, h, p2);
    }
    
    private void d0(final h keyValue_) {
        keyValue_.getClass();
        this.keyValue_ = keyValue_;
    }
    
    private void f0(final int version_) {
        this.version_ = version_;
    }
    
    public h Y() {
        return this.keyValue_;
    }
    
    public k Z() {
        k k;
        if ((k = this.params_) == null) {
            k = p3.k.W();
        }
        return k;
    }
    
    public int a0() {
        return this.version_;
    }
    
    public final void e0(final k params_) {
        params_.getClass();
        this.params_ = params_;
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0150: {
            switch (i$a.a[d.ordinal()]) {
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
                    final X parser = i.PARSER;
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
                    // monitorenter(i.class)
                    while (true) {
                        Label_0159: {
                            break Label_0159;
                            try {
                                X parser2;
                                if ((parser2 = i.PARSER) == null) {
                                    parser2 = (i.PARSER = new x.b(i.DEFAULT_INSTANCE));
                                }
                                // monitorexit(i.class)
                                return parser2;
                                return i.DEFAULT_INSTANCE;
                                return new i();
                                // monitorexit(i.class)
                                return new b((i$a)null);
                                return x.I(i.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[] { "version_", "params_", "keyValue_" });
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
            super(i.U());
        }
        
        public b A(final int n) {
            ((a)this).s();
            ((i)super.p).f0(n);
            return this;
        }
        
        public b y(final h h) {
            ((a)this).s();
            ((i)super.p).d0(h);
            return this;
        }
        
        public b z(final k k) {
            ((a)this).s();
            ((i)super.p).e0(k);
            return this;
        }
    }
}
