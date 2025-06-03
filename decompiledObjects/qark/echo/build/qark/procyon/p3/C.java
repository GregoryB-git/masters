// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p3;

import java.util.Collections;
import java.util.List;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.p;
import java.io.InputStream;
import com.google.crypto.tink.shaded.protobuf.z;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.x;

public final class C extends x implements P
{
    private static final C DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private z.d key_;
    private int primaryKeyId_;
    
    static {
        x.Q(C.class, DEFAULT_INSTANCE = new C());
    }
    
    public C() {
        this.key_ = x.u();
    }
    
    public static /* synthetic */ C U() {
        return C.DEFAULT_INSTANCE;
    }
    
    public static b d0() {
        return (b)C.DEFAULT_INSTANCE.q();
    }
    
    public static C e0(final InputStream inputStream, final p p2) {
        return (C)x.L(C.DEFAULT_INSTANCE, inputStream, p2);
    }
    
    public static C f0(final byte[] array, final p p2) {
        return (C)x.M(C.DEFAULT_INSTANCE, array, p2);
    }
    
    public final void X(final c c) {
        c.getClass();
        this.Y();
        this.key_.add(c);
    }
    
    public final void Y() {
        final z.d key_ = this.key_;
        if (!key_.p()) {
            this.key_ = x.G(key_);
        }
    }
    
    public c Z(final int n) {
        return this.key_.get(n);
    }
    
    public int a0() {
        return this.key_.size();
    }
    
    public List b0() {
        return this.key_;
    }
    
    public int c0() {
        return this.primaryKeyId_;
    }
    
    public final void g0(final int primaryKeyId_) {
        this.primaryKeyId_ = primaryKeyId_;
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0150: {
            switch (C$a.a[d.ordinal()]) {
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
                    final X parser = C.PARSER;
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
                    // monitorenter(C.class)
                    while (true) {
                        Label_0159: {
                            break Label_0159;
                            try {
                                X parser2;
                                if ((parser2 = C.PARSER) == null) {
                                    parser2 = (C.PARSER = new x.b(C.DEFAULT_INSTANCE));
                                }
                                // monitorexit(C.class)
                                return parser2;
                                return new b((C$a)null);
                                return C.DEFAULT_INSTANCE;
                                return new C();
                                // monitorexit(C.class)
                                return x.I(C.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[] { "primaryKeyId_", "key_", c.class });
                            }
                            finally {}
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    public static final class b extends x.a implements P
    {
        public b() {
            super(C.U());
        }
        
        public int A() {
            return ((C)super.p).a0();
        }
        
        public List B() {
            return Collections.unmodifiableList((List<?>)((C)super.p).b0());
        }
        
        public b C(final int n) {
            ((x.a)this).s();
            ((C)super.p).g0(n);
            return this;
        }
        
        public b y(final C.c c) {
            ((x.a)this).s();
            ((C)super.p).X(c);
            return this;
        }
        
        public C.c z(final int n) {
            return ((C)super.p).Z(n);
        }
    }
    
    public static final class c extends x implements P
    {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile X PARSER;
        public static final int STATUS_FIELD_NUMBER = 2;
        private y keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        
        static {
            x.Q(c.class, DEFAULT_INSTANCE = new c());
        }
        
        public static /* synthetic */ c U() {
            return c.DEFAULT_INSTANCE;
        }
        
        public static a e0() {
            return (a)c.DEFAULT_INSTANCE.q();
        }
        
        private void h0(final I i) {
            this.outputPrefixType_ = i.g();
        }
        
        public y Z() {
            y y;
            if ((y = this.keyData_) == null) {
                y = p3.y.Y();
            }
            return y;
        }
        
        public int a0() {
            return this.keyId_;
        }
        
        public I b0() {
            I i;
            if ((i = I.c(this.outputPrefixType_)) == null) {
                i = I.u;
            }
            return i;
        }
        
        public p3.z c0() {
            p3.z z;
            if ((z = p3.z.c(this.status_)) == null) {
                z = p3.z.t;
            }
            return z;
        }
        
        public boolean d0() {
            return this.keyData_ != null;
        }
        
        public final void f0(final y keyData_) {
            keyData_.getClass();
            this.keyData_ = keyData_;
        }
        
        public final void g0(final int keyId_) {
            this.keyId_ = keyId_;
        }
        
        public final void i0(final p3.z z) {
            this.status_ = z.g();
        }
        
        @Override
        public final Object t(final d d, final Object o, final Object o2) {
            Label_0155: {
                switch (C$a.a[d.ordinal()]) {
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
                        final X parser = c.PARSER;
                        if (parser == null) {
                            break Label_0155;
                        }
                        return parser;
                    }
                    case 4: {
                        break Label_0155;
                    }
                    case 3: {
                        break Label_0155;
                    }
                    case 2: {
                        break Label_0155;
                    }
                    case 1: {
                        // monitorenter(c.class)
                        while (true) {
                            Label_0164: {
                                break Label_0164;
                                try {
                                    X parser2;
                                    if ((parser2 = c.PARSER) == null) {
                                        parser2 = (c.PARSER = new x.b(c.DEFAULT_INSTANCE));
                                    }
                                    // monitorexit(c.class)
                                    return parser2;
                                    return c.DEFAULT_INSTANCE;
                                    return new c();
                                    return new a((C$a)null);
                                    // monitorexit(c.class)
                                    return x.I(c.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[] { "keyData_", "status_", "keyId_", "outputPrefixType_" });
                                }
                                finally {}
                            }
                            continue;
                        }
                    }
                }
            }
        }
        
        public static final class a extends x.a implements P
        {
            public a() {
                super(C.c.U());
            }
            
            public a A(final I i) {
                ((x.a)this).s();
                ((C.c)super.p).h0(i);
                return this;
            }
            
            public a B(final p3.z z) {
                ((x.a)this).s();
                ((C.c)super.p).i0(z);
                return this;
            }
            
            public a y(final y y) {
                ((x.a)this).s();
                ((C.c)super.p).f0(y);
                return this;
            }
            
            public a z(final int n) {
                ((x.a)this).s();
                ((C.c)super.p).g0(n);
                return this;
            }
        }
    }
}
