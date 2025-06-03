// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

public class H
{
    public final a a;
    public final Object b;
    public final Object c;
    
    public H(final r0.b b, final Object b2, final r0.b b3, final Object c) {
        this.a = new a(b, b2, b3, c);
        this.b = b2;
        this.c = c;
    }
    
    public static int b(final a a, final Object o, final Object o2) {
        return s.b(a.a, 1, o) + s.b(a.c, 2, o2);
    }
    
    public static H d(final r0.b b, final Object o, final r0.b b2, final Object o2) {
        return new H(b, o, b2, o2);
    }
    
    public static void e(final j j, final a a, final Object o, final Object o2) {
        s.u(j, a.a, 1, o);
        s.u(j, a.c, 2, o2);
    }
    
    public int a(final int n, final Object o, final Object o2) {
        return j.P(n) + j.y(b(this.a, o, o2));
    }
    
    public a c() {
        return this.a;
    }
    
    public static class a
    {
        public final r0.b a;
        public final Object b;
        public final r0.b c;
        public final Object d;
        
        public a(final r0.b a, final Object b, final r0.b c, final Object d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
}
