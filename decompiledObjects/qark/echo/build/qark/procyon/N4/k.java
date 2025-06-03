// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N4;

import com.google.protobuf.K;
import com.google.protobuf.t;
import com.google.protobuf.u;
import com.google.protobuf.T;
import com.google.protobuf.L;
import com.google.protobuf.r;

public final class k extends r implements L
{
    private static final k DEFAULT_INSTANCE;
    private static volatile T PARSER;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final u sessionVerbosity_converter_;
    private int bitField0_;
    private String sessionId_;
    private t.d sessionVerbosity_;
    
    static {
        sessionVerbosity_converter_ = new u() {};
        r.Q(k.class, DEFAULT_INSTANCE = new k());
    }
    
    public k() {
        this.sessionId_ = "";
        this.sessionVerbosity_ = r.y();
    }
    
    public static /* synthetic */ k T() {
        return k.DEFAULT_INSTANCE;
    }
    
    public static c a0() {
        return (c)k.DEFAULT_INSTANCE.u();
    }
    
    private void b0(final String sessionId_) {
        sessionId_.getClass();
        this.bitField0_ |= 0x1;
        this.sessionId_ = sessionId_;
    }
    
    public final void W(final l l) {
        l.getClass();
        this.X();
        this.sessionVerbosity_.z(l.g());
    }
    
    public final void X() {
        final t.d sessionVerbosity_ = this.sessionVerbosity_;
        if (!((t.e)sessionVerbosity_).p()) {
            this.sessionVerbosity_ = r.L(sessionVerbosity_);
        }
    }
    
    public l Y(final int n) {
        l l;
        if ((l = N4.l.c(this.sessionVerbosity_.F(n))) == null) {
            l = N4.l.p;
        }
        return l;
    }
    
    public int Z() {
        return this.sessionVerbosity_.size();
    }
    
    @Override
    public final Object x(final r.c c, final Object o, final Object o2) {
        Label_0158: {
            switch (k$b.a[c.ordinal()]) {
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
                    final T parser = k.PARSER;
                    if (parser == null) {
                        break Label_0158;
                    }
                    return parser;
                }
                case 4: {
                    break Label_0158;
                }
                case 3: {
                    break Label_0158;
                }
                case 2: {
                    break Label_0158;
                }
                case 1: {
                    // monitorenter(k.class)
                    while (true) {
                        Label_0167: {
                            break Label_0167;
                            try {
                                T parser2;
                                if ((parser2 = k.PARSER) == null) {
                                    parser2 = (k.PARSER = new b(k.DEFAULT_INSTANCE));
                                }
                                // monitorexit(k.class)
                                return parser2;
                                return k.DEFAULT_INSTANCE;
                                // monitorexit(k.class)
                                return r.O(k.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001e", new Object[] { "bitField0_", "sessionId_", "sessionVerbosity_", l.e() });
                                return new k();
                                return new c((k$a)null);
                            }
                            finally {}
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    public static final class c extends a implements L
    {
        public c() {
            super(k.T());
        }
        
        public c D(final l l) {
            ((a)this).y();
            ((k)super.p).W(l);
            return this;
        }
        
        public c E(final String s) {
            ((a)this).y();
            ((k)super.p).b0(s);
            return this;
        }
    }
}
