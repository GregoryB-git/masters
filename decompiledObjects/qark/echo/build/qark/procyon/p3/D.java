// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p3;

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.z;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.x;

public final class D extends x implements P
{
    private static final D DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private z.d keyInfo_;
    private int primaryKeyId_;
    
    static {
        x.Q(D.class, DEFAULT_INSTANCE = new D());
    }
    
    public D() {
        this.keyInfo_ = x.u();
    }
    
    public static /* synthetic */ D U() {
        return D.DEFAULT_INSTANCE;
    }
    
    public static b a0() {
        return (b)D.DEFAULT_INSTANCE.q();
    }
    
    private void b0(final int primaryKeyId_) {
        this.primaryKeyId_ = primaryKeyId_;
    }
    
    public final void X(final c c) {
        c.getClass();
        this.Y();
        this.keyInfo_.add(c);
    }
    
    public final void Y() {
        final z.d keyInfo_ = this.keyInfo_;
        if (!keyInfo_.p()) {
            this.keyInfo_ = x.G(keyInfo_);
        }
    }
    
    public c Z(final int n) {
        return this.keyInfo_.get(n);
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0150: {
            switch (D$a.a[d.ordinal()]) {
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
                    final X parser = D.PARSER;
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
                    // monitorenter(D.class)
                    while (true) {
                        Label_0159: {
                            break Label_0159;
                            try {
                                X parser2;
                                if ((parser2 = D.PARSER) == null) {
                                    parser2 = (D.PARSER = new x.b(D.DEFAULT_INSTANCE));
                                }
                                // monitorexit(D.class)
                                return parser2;
                                return new b((D$a)null);
                                return D.DEFAULT_INSTANCE;
                                // monitorexit(D.class)
                                return x.I(D.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[] { "primaryKeyId_", "keyInfo_", c.class });
                                return new D();
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
            super(D.U());
        }
        
        public b y(final D.c c) {
            ((x.a)this).s();
            ((D)super.p).X(c);
            return this;
        }
        
        public b z(final int n) {
            ((x.a)this).s();
            ((D)super.p).b0(n);
            return this;
        }
    }
    
    public static final class c extends x implements P
    {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile X PARSER;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_;
        
        static {
            x.Q(c.class, DEFAULT_INSTANCE = new c());
        }
        
        public c() {
            this.typeUrl_ = "";
        }
        
        public static /* synthetic */ c U() {
            return c.DEFAULT_INSTANCE;
        }
        
        public static a a0() {
            return (a)c.DEFAULT_INSTANCE.q();
        }
        
        private void b0(final int keyId_) {
            this.keyId_ = keyId_;
        }
        
        private void c0(final I i) {
            this.outputPrefixType_ = i.g();
        }
        
        private void d0(final p3.z z) {
            this.status_ = z.g();
        }
        
        private void e0(final String typeUrl_) {
            typeUrl_.getClass();
            this.typeUrl_ = typeUrl_;
        }
        
        public int Z() {
            return this.keyId_;
        }
        
        @Override
        public final Object t(final d d, final Object o, final Object o2) {
            Label_0155: {
                switch (D$a.a[d.ordinal()]) {
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
                                    return new a((D$a)null);
                                    // monitorexit(c.class)
                                    return c.DEFAULT_INSTANCE;
                                    return x.I(c.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\f\u0003\u000b\u0004\f", new Object[] { "typeUrl_", "status_", "keyId_", "outputPrefixType_" });
                                    return new c();
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
                super(D.c.U());
            }
            
            public a A(final p3.z z) {
                ((x.a)this).s();
                ((D.c)super.p).d0(z);
                return this;
            }
            
            public a B(final String s) {
                ((x.a)this).s();
                ((D.c)super.p).e0(s);
                return this;
            }
            
            public a y(final int n) {
                ((x.a)this).s();
                ((D.c)super.p).b0(n);
                return this;
            }
            
            public a z(final I i) {
                ((x.a)this).s();
                ((D.c)super.p).c0(i);
                return this;
            }
        }
    }
}
