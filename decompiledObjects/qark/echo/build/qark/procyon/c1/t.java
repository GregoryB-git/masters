// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c1;

import d0.q;
import g0.g;

public interface t
{
    k a(final byte[] p0, final int p1, final int p2);
    
    void b();
    
    void c(final byte[] p0, final int p1, final int p2, final b p3, final g p4);
    
    int d();
    
    public interface a
    {
        public static final a a = new a() {
            @Override
            public boolean a(final q q) {
                return false;
            }
            
            @Override
            public t b(final q q) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
            
            @Override
            public int c(final q q) {
                return 1;
            }
        };
        
        boolean a(final q p0);
        
        t b(final q p0);
        
        int c(final q p0);
    }
    
    public static class b
    {
        public static final b c;
        public final long a;
        public final boolean b;
        
        static {
            c = new b(-9223372036854775807L, false);
        }
        
        public b(final long a, final boolean b) {
            this.a = a;
            this.b = b;
        }
        
        public static b b() {
            return b.c;
        }
        
        public static b c(final long n) {
            return new b(n, true);
        }
    }
}
