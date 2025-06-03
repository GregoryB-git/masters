// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package h2;

public final class a implements U5.a
{
    public static final Object c;
    public volatile U5.a a;
    public volatile Object b;
    
    static {
        c = new Object();
    }
    
    public a(final U5.a a) {
        this.b = h2.a.c;
        this.a = a;
    }
    
    public static U5.a a(final U5.a a) {
        d.b(a);
        if (a instanceof a) {
            return a;
        }
        return new a(a);
    }
    
    public static Object b(final Object obj, final Object obj2) {
        if (obj == a.c) {
            return obj2;
        }
        if (obj == obj2) {
            return obj2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Scoped provider was invoked recursively returning different results: ");
        sb.append(obj);
        sb.append(" & ");
        sb.append(obj2);
        sb.append(". This is likely due to a circular dependency.");
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public Object get() {
        final Object b = this.b;
        final Object c = h2.a.c;
        if (b == c) {
            // monitorenter(this)
            while (true) {
                try {
                    Object o;
                    if ((o = this.b) == c) {
                        o = this.a.get();
                        this.b = b(this.b, o);
                        this.a = null;
                    }
                    // monitorexit(this)
                    return o;
                    // monitorexit(this)
                    return b;
                }
                finally {}
                continue;
            }
        }
        return b;
    }
}
