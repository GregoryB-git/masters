// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

public abstract class m0
{
    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    
    static {
        a = c(1, 3);
        b = c(1, 4);
        c = c(2, 0);
        d = c(3, 2);
    }
    
    public static int a(final int n) {
        return n >>> 3;
    }
    
    public static int b(final int n) {
        return n & 0x7;
    }
    
    public static int c(final int n, final int n2) {
        return n << 3 | n2;
    }
    
    public enum b
    {
        A(x2, 2) {
        }, 
        B(m0.c.v, 2) {
        }, 
        C("UINT32", 12, p, 0), 
        D("ENUM", 13, m0.c.w, 0), 
        E("SFIXED32", 14, p, 5), 
        F("SFIXED64", 15, q2, 1), 
        G("SINT32", 16, p, 0), 
        H("SINT64", 17, q2, 0), 
        q("DOUBLE", 0, m0.c.s, 1), 
        r("FLOAT", 1, m0.c.r, 5), 
        s("INT64", 2, q2, 0), 
        t("UINT64", 3, q2, 0), 
        u("INT32", 4, p, 0), 
        v("FIXED64", 5, q2, 1), 
        w("FIXED32", 6, p, 5), 
        x("BOOL", 7, m0.c.t, 0), 
        y(m0.c.u, 2) {
        }, 
        z(x2, 3) {
        };
        
        public final c o;
        public final int p;
        
        static {
            final c q2 = m0.c.q;
            final c p = m0.c.p;
            final c x2 = m0.c.x;
            I = c();
        }
        
        public b(final String name, final int ordinal, final c o, final int p4) {
            this.o = o;
            this.p = p4;
        }
        
        public static /* synthetic */ b[] c() {
            return new b[] { b.q, b.r, b.s, b.t, b.u, b.v, b.w, b.x, b.y, b.z, b.A, b.B, b.C, b.D, b.E, b.F, b.G, b.H };
        }
        
        public c e() {
            return this.o;
        }
        
        public int h() {
            return this.p;
        }
    }
    
    public enum c
    {
        p("INT", 0, (Object)0), 
        q("LONG", 1, (Object)0L), 
        r("FLOAT", 2, (Object)0.0f), 
        s("DOUBLE", 3, (Object)0.0), 
        t("BOOLEAN", 4, (Object)Boolean.FALSE), 
        u("STRING", 5, (Object)""), 
        v("BYTE_STRING", 6, (Object)f.p), 
        w("ENUM", 7, (Object)null), 
        x("MESSAGE", 8, (Object)null);
        
        public final Object o;
        
        static {
            y = c();
        }
        
        public c(final String name, final int ordinal, final Object o) {
            this.o = o;
        }
        
        public static /* synthetic */ c[] c() {
            return new c[] { c.p, c.q, c.r, c.s, c.t, c.u, c.v, c.w, c.x };
        }
    }
}
