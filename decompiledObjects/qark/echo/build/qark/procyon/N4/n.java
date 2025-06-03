// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N4;

import com.google.protobuf.t;
import com.google.protobuf.K;
import com.google.protobuf.T;
import com.google.protobuf.L;
import com.google.protobuf.r;

public final class n extends r implements L
{
    private static final n DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile T PARSER;
    private int bitField0_;
    private int dispatchDestination_;
    
    static {
        r.Q(n.class, DEFAULT_INSTANCE = new n());
    }
    
    public static /* synthetic */ n T() {
        return n.DEFAULT_INSTANCE;
    }
    
    @Override
    public final Object x(final r.c c, final Object o, final Object o2) {
        Label_0153: {
            switch (n$a.a[c.ordinal()]) {
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
                    final T parser = n.PARSER;
                    if (parser == null) {
                        break Label_0153;
                    }
                    return parser;
                }
                case 4: {
                    break Label_0153;
                }
                case 3: {
                    break Label_0153;
                }
                case 2: {
                    break Label_0153;
                }
                case 1: {
                    // monitorenter(n.class)
                    while (true) {
                        Label_0162: {
                            break Label_0162;
                            try {
                                T parser2;
                                if ((parser2 = n.PARSER) == null) {
                                    parser2 = (n.PARSER = new r.b(n.DEFAULT_INSTANCE));
                                }
                                // monitorexit(n.class)
                                return parser2;
                                return new b((n$a)null);
                                return r.O(n.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "bitField0_", "dispatchDestination_", n.c.c() });
                                // monitorexit(n.class)
                                return new n();
                                return n.DEFAULT_INSTANCE;
                            }
                            finally {}
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    public static final class b extends a implements L
    {
        public b() {
            super(n.T());
        }
    }
    
    public enum c implements t.a
    {
        p("SOURCE_UNKNOWN", 0, 0), 
        q("FL_LEGACY_V1", 1, 1);
        
        public static final t.b r;
        public final int o;
        
        static {
            r = new t.b() {};
        }
        
        public c(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        public static t.c c() {
            return b.a;
        }
        
        @Override
        public final int g() {
            return this.o;
        }
        
        public static final class b implements t.c
        {
            public static final t.c a;
            
            static {
                a = new b();
            }
        }
    }
}
