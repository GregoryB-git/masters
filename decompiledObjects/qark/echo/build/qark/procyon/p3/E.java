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

public final class E extends x implements P
{
    private static final E DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private F params_;
    private int version_;
    
    static {
        x.Q(E.class, DEFAULT_INSTANCE = new E());
    }
    
    public static /* synthetic */ E U() {
        return E.DEFAULT_INSTANCE;
    }
    
    public static b Z() {
        return (b)E.DEFAULT_INSTANCE.q();
    }
    
    public static E a0(final h h, final p p2) {
        return (E)x.K(E.DEFAULT_INSTANCE, h, p2);
    }
    
    private void c0(final int version_) {
        this.version_ = version_;
    }
    
    public F X() {
        F f;
        if ((f = this.params_) == null) {
            f = F.V();
        }
        return f;
    }
    
    public int Y() {
        return this.version_;
    }
    
    public final void b0(final F params_) {
        params_.getClass();
        this.params_ = params_;
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0145: {
            switch (E$a.a[d.ordinal()]) {
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
                    final X parser = E.PARSER;
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
                    // monitorenter(E.class)
                    while (true) {
                        Label_0154: {
                            break Label_0154;
                            try {
                                X parser2;
                                if ((parser2 = E.PARSER) == null) {
                                    parser2 = (E.PARSER = new x.b(E.DEFAULT_INSTANCE));
                                }
                                // monitorexit(E.class)
                                return parser2;
                                return new b((E$a)null);
                                return x.I(E.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[] { "version_", "params_" });
                                // monitorexit(E.class)
                                return E.DEFAULT_INSTANCE;
                                return new E();
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
            super(E.U());
        }
        
        public b y(final F f) {
            ((a)this).s();
            ((E)super.p).b0(f);
            return this;
        }
        
        public b z(final int n) {
            ((a)this).s();
            ((E)super.p).c0(n);
            return this;
        }
    }
}
