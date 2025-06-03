// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

public class D
{
    public final a a;
    public final Object b;
    public final Object c;
    
    public D(final m0.b b, final Object b2, final m0.b b3, final Object c) {
        this.a = new a(b, b2, b3, c);
        this.b = b2;
        this.c = c;
    }
    
    public static int b(final a a, final Object o, final Object o2) {
        return o.b(a.a, 1, o) + o.b(a.c, 2, o2);
    }
    
    public static D d(final m0.b b, final Object o, final m0.b b2, final Object o2) {
        return new D(b, o, b2, o2);
    }
    
    public static void e(final h h, final a a, final Object o, final Object o2) {
        o.u(h, a.a, 1, o);
        o.u(h, a.c, 2, o2);
    }
    
    public int a(final int n, final Object o, final Object o2) {
        return h.O(n) + h.z(b(this.a, o, o2));
    }
    
    public a c() {
        return this.a;
    }
    
    public static class a
    {
        public final m0.b a;
        public final Object b;
        public final m0.b c;
        public final Object d;
        
        public a(final m0.b a, final Object b, final m0.b c, final Object d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
}
