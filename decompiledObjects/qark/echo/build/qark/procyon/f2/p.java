// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f2;

import android.util.Base64;

public abstract class p
{
    public static a a() {
        return new d.b().d(c2.d.o);
    }
    
    public abstract String b();
    
    public abstract byte[] c();
    
    public abstract c2.d d();
    
    public boolean e() {
        return this.c() != null;
    }
    
    public p f(final c2.d d) {
        return a().b(this.b()).d(d).c(this.c()).a();
    }
    
    @Override
    public final String toString() {
        final String b = this.b();
        final c2.d d = this.d();
        String encodeToString;
        if (this.c() == null) {
            encodeToString = "";
        }
        else {
            encodeToString = Base64.encodeToString(this.c(), 2);
        }
        return String.format("TransportContext(%s, %s, %s)", b, d, encodeToString);
    }
    
    public abstract static class a
    {
        public abstract p a();
        
        public abstract a b(final String p0);
        
        public abstract a c(final byte[] p0);
        
        public abstract a d(final c2.d p0);
    }
}
