// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p0;

import java.util.UUID;
import j0.b;
import java.util.HashMap;
import java.util.List;
import l0.y1;
import java.util.Map;

public interface F
{
    void a(final b p0);
    
    boolean b(final byte[] p0, final String p1);
    
    void c(final byte[] p0, final byte[] p1);
    
    Map d(final byte[] p0);
    
    void e(final byte[] p0);
    
    void f(final byte[] p0, final y1 p1);
    
    byte[] g(final byte[] p0, final byte[] p1);
    
    d h();
    
    void i(final byte[] p0);
    
    a j(final byte[] p0, final List p1, final int p2, final HashMap p3);
    
    int k();
    
    j0.b l(final byte[] p0);
    
    byte[] m();
    
    void release();
    
    public static final class a
    {
        public final byte[] a;
        public final String b;
        public final int c;
        
        public a(final byte[] a, final String b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public byte[] a() {
            return this.a;
        }
        
        public String b() {
            return this.b;
        }
    }
    
    public interface b
    {
        void a(final F p0, final byte[] p1, final int p2, final int p3, final byte[] p4);
    }
    
    public interface c
    {
        F a(final UUID p0);
    }
    
    public static final class d
    {
        public final byte[] a;
        public final String b;
        
        public d(final byte[] a, final String b) {
            this.a = a;
            this.b = b;
        }
        
        public byte[] a() {
            return this.a;
        }
        
        public String b() {
            return this.b;
        }
    }
}
