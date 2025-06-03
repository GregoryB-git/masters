// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p3;

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.x;

public final class A extends x implements P
{
    private static final A DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile X PARSER;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_;
    private h value_;
    
    static {
        x.Q(A.class, DEFAULT_INSTANCE = new A());
    }
    
    public A() {
        this.typeUrl_ = "";
        this.value_ = h.p;
    }
    
    public static /* synthetic */ A U() {
        return A.DEFAULT_INSTANCE;
    }
    
    public static A Y() {
        return A.DEFAULT_INSTANCE;
    }
    
    public static b c0() {
        return (b)A.DEFAULT_INSTANCE.q();
    }
    
    private void e0(final String typeUrl_) {
        typeUrl_.getClass();
        this.typeUrl_ = typeUrl_;
    }
    
    private void f0(final h value_) {
        value_.getClass();
        this.value_ = value_;
    }
    
    public I Z() {
        I i;
        if ((i = I.c(this.outputPrefixType_)) == null) {
            i = I.u;
        }
        return i;
    }
    
    public String a0() {
        return this.typeUrl_;
    }
    
    public h b0() {
        return this.value_;
    }
    
    public final void d0(final I i) {
        this.outputPrefixType_ = i.g();
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0150: {
            switch (A$a.a[d.ordinal()]) {
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
                    final X parser = A.PARSER;
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
                    // monitorenter(A.class)
                    while (true) {
                        Label_0159: {
                            break Label_0159;
                            try {
                                X parser2;
                                if ((parser2 = A.PARSER) == null) {
                                    parser2 = (A.PARSER = new x.b(A.DEFAULT_INSTANCE));
                                }
                                // monitorexit(A.class)
                                return parser2;
                                return x.I(A.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\n\u0003\f", new Object[] { "typeUrl_", "value_", "outputPrefixType_" });
                                // monitorexit(A.class)
                                return A.DEFAULT_INSTANCE;
                                return new A();
                                return new b((A$a)null);
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
            super(A.U());
        }
        
        public b A(final h h) {
            ((a)this).s();
            ((A)super.p).f0(h);
            return this;
        }
        
        public b y(final I i) {
            ((a)this).s();
            ((A)super.p).d0(i);
            return this;
        }
        
        public b z(final String s) {
            ((a)this).s();
            ((A)super.p).e0(s);
            return this;
        }
    }
}
