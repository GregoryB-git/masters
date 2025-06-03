// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p3;

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.x;

public final class c extends x implements P
{
    private static final c DEFAULT_INSTANCE;
    private static volatile X PARSER;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;
    
    static {
        x.Q(c.class, DEFAULT_INSTANCE = new c());
    }
    
    public static /* synthetic */ c U() {
        return c.DEFAULT_INSTANCE;
    }
    
    public static c W() {
        return c.DEFAULT_INSTANCE;
    }
    
    public static b Y() {
        return (b)c.DEFAULT_INSTANCE.q();
    }
    
    public int X() {
        return this.tagSize_;
    }
    
    public final void Z(final int tagSize_) {
        this.tagSize_ = tagSize_;
    }
    
    @Override
    public final Object t(final d d, final Object o, final Object o2) {
        Label_0140: {
            switch (c$a.a[d.ordinal()]) {
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
                        break Label_0140;
                    }
                    return parser;
                }
                case 4: {
                    break Label_0140;
                }
                case 3: {
                    break Label_0140;
                }
                case 2: {
                    break Label_0140;
                }
                case 1: {
                    // monitorenter(c.class)
                    while (true) {
                        Label_0149: {
                            break Label_0149;
                            try {
                                X parser2;
                                if ((parser2 = c.PARSER) == null) {
                                    parser2 = (c.PARSER = new x.b(c.DEFAULT_INSTANCE));
                                }
                                // monitorexit(c.class)
                                return parser2;
                                return c.DEFAULT_INSTANCE;
                                // monitorexit(c.class)
                                return x.I(c.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[] { "tagSize_" });
                                return new b((c$a)null);
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
    
    public static final class b extends a implements P
    {
        public b() {
            super(c.U());
        }
        
        public b y(final int n) {
            ((a)this).s();
            ((c)super.p).Z(n);
            return this;
        }
    }
}
