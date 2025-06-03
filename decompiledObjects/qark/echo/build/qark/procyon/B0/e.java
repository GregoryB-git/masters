// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B0;

import java.util.Iterator;
import g0.a;
import java.util.concurrent.CopyOnWriteArrayList;
import android.os.Handler;
import i0.y;

public interface e
{
    y a();
    
    long b();
    
    void c(final a p0);
    
    long d();
    
    void i(final Handler p0, final a p1);
    
    public interface a
    {
        void c0(final int p0, final long p1, final long p2);
        
        public static final class a
        {
            public final CopyOnWriteArrayList a;
            
            public a() {
                this.a = new CopyOnWriteArrayList();
            }
            
            public void b(final Handler handler, final e.a a) {
                a.e(handler);
                a.e(a);
                this.e(a);
                this.a.add(new e.a.a.a(handler, a));
            }
            
            public void c(final int n, final long n2, final long n3) {
                for (final e.a.a.a a : this.a) {
                    if (!e.a.a.a.b(a)) {
                        e.a.a.a.c(a).post((Runnable)new d(a, n, n2, n3));
                    }
                }
            }
            
            public void e(final e.a a) {
                for (final e.a.a.a o : this.a) {
                    if (e.a.a.a.a(o) == a) {
                        o.d();
                        this.a.remove(o);
                    }
                }
            }
            
            public static final class a
            {
                public final Handler a;
                public final e.a b;
                public boolean c;
                
                public a(final Handler a, final e.a b) {
                    this.a = a;
                    this.b = b;
                }
                
                public static /* synthetic */ e.a a(final a a) {
                    return a.b;
                }
                
                public static /* synthetic */ boolean b(final a a) {
                    return a.c;
                }
                
                public static /* synthetic */ Handler c(final a a) {
                    return a.a;
                }
                
                public void d() {
                    this.c = true;
                }
            }
        }
    }
}
