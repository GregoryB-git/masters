// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package j6;

import java.io.Serializable;
import b6.b;
import kotlin.jvm.internal.g;

public abstract class c
{
    public static final a o;
    public static final c p;
    
    static {
        o = new a(null);
        p = b.a.b();
    }
    
    public static final /* synthetic */ c a() {
        return c.p;
    }
    
    public abstract int b(final int p0);
    
    public int c() {
        return this.b(32);
    }
    
    public static final class a extends c implements Serializable
    {
        private final Object writeReplace() {
            return c.a.a.o;
        }
        
        @Override
        public int b(final int n) {
            return c.a().b(n);
        }
        
        @Override
        public int c() {
            return c.a().c();
        }
        
        public static final class a implements Serializable
        {
            public static final a o;
            private static final long serialVersionUID = 0L;
            
            static {
                o = new a();
            }
            
            private final Object readResolve() {
                return c.o;
            }
        }
    }
}
