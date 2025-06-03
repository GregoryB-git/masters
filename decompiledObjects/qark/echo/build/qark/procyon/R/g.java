// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R;

import androidx.datastore.preferences.protobuf.O;
import java.util.List;
import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.w;

public final class g extends w implements P
{
    private static final g DEFAULT_INSTANCE;
    private static volatile X PARSER;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private y.b strings_;
    
    static {
        w.F(g.class, DEFAULT_INSTANCE = new g());
    }
    
    public g() {
        this.strings_ = w.t();
    }
    
    public static /* synthetic */ g H() {
        return g.DEFAULT_INSTANCE;
    }
    
    public static g L() {
        return g.DEFAULT_INSTANCE;
    }
    
    public static a N() {
        return (a)g.DEFAULT_INSTANCE.p();
    }
    
    public final void J(final Iterable iterable) {
        this.K();
        androidx.datastore.preferences.protobuf.a.e(iterable, this.strings_);
    }
    
    public final void K() {
        if (!this.strings_.p()) {
            this.strings_ = w.A(this.strings_);
        }
    }
    
    public List M() {
        return this.strings_;
    }
    
    @Override
    public final Object s(final d d, final Object o, final Object o2) {
        Label_0140: {
            switch (e.a[d.ordinal()]) {
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
                    final X parser = g.PARSER;
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
                    // monitorenter(g.class)
                    while (true) {
                        Label_0149: {
                            break Label_0149;
                            try {
                                X parser2;
                                if ((parser2 = g.PARSER) == null) {
                                    parser2 = (g.PARSER = new b(g.DEFAULT_INSTANCE));
                                }
                                // monitorexit(g.class)
                                return parser2;
                                return w.C(g.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "strings_" });
                                return new g();
                                return g.DEFAULT_INSTANCE;
                                // monitorexit(g.class)
                                return new a((e)null);
                            }
                            finally {}
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    public static final class a extends w.a implements P
    {
        public a() {
            super(g.H());
        }
        
        public a A(final Iterable iterable) {
            ((w.a)this).v();
            ((g)super.p).J(iterable);
            return this;
        }
    }
}
