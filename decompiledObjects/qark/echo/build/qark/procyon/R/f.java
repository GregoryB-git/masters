// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R;

import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.O;
import java.util.Collections;
import java.io.InputStream;
import java.util.Map;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.w;

public final class f extends w implements P
{
    private static final f DEFAULT_INSTANCE;
    private static volatile X PARSER;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private I preferences_;
    
    static {
        w.F(f.class, DEFAULT_INSTANCE = new f());
    }
    
    public f() {
        this.preferences_ = I.f();
    }
    
    public static /* synthetic */ f H() {
        return f.DEFAULT_INSTANCE;
    }
    
    public static a N() {
        return (a)f.DEFAULT_INSTANCE.p();
    }
    
    public static f O(final InputStream inputStream) {
        return (f)w.D(f.DEFAULT_INSTANCE, inputStream);
    }
    
    public final Map J() {
        return this.L();
    }
    
    public Map K() {
        return Collections.unmodifiableMap((Map<?, ?>)this.M());
    }
    
    public final I L() {
        if (!this.preferences_.n()) {
            this.preferences_ = this.preferences_.s();
        }
        return this.preferences_;
    }
    
    public final I M() {
        return this.preferences_;
    }
    
    @Override
    public final Object s(final d d, final Object o, final Object o2) {
        Label_0148: {
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
                    final X parser = f.PARSER;
                    if (parser == null) {
                        break Label_0148;
                    }
                    return parser;
                }
                case 4: {
                    break Label_0148;
                }
                case 3: {
                    break Label_0148;
                }
                case 2: {
                    break Label_0148;
                }
                case 1: {
                    // monitorenter(f.class)
                    while (true) {
                        Label_0157: {
                            break Label_0157;
                            try {
                                X parser2;
                                if ((parser2 = f.PARSER) == null) {
                                    parser2 = (f.PARSER = new w.b(f.DEFAULT_INSTANCE));
                                }
                                // monitorexit(f.class)
                                return parser2;
                                return f.DEFAULT_INSTANCE;
                                return new f();
                                return w.C(f.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "preferences_", b.a });
                                return new a((e)null);
                            }
                            // monitorexit(f.class)
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
            super(f.H());
        }
        
        public a A(final String s, final h h) {
            s.getClass();
            h.getClass();
            ((w.a)this).v();
            ((f)super.p).J().put(s, h);
            return this;
        }
    }
    
    public abstract static final class b
    {
        public static final H a;
        
        static {
            a = H.d(r0.b.y, "", r0.b.A, h.Q());
        }
    }
}
