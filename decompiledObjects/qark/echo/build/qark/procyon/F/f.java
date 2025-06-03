// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F;

import java.util.concurrent.Callable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.CancellationSignal;
import android.graphics.Typeface;
import android.content.Context;
import t.h;
import java.util.concurrent.ExecutorService;
import t.g;

public abstract class f
{
    public static final g a;
    public static final ExecutorService b;
    public static final Object c;
    public static final h d;
    
    static {
        a = new g(16);
        b = F.h.a("fonts-androidx", 10, 10000);
        c = new Object();
        d = new h();
    }
    
    public static String a(final F.e e, final int i) {
        final StringBuilder sb = new StringBuilder();
        sb.append(e.d());
        sb.append("-");
        sb.append(i);
        return sb.toString();
    }
    
    public static int b(final F.g.a a) {
        final int c = a.c();
        int n = 1;
        if (c == 0) {
            final F.g.b[] b = a.b();
            if (b != null) {
                if (b.length == 0) {
                    return 1;
                }
                final int length = b.length;
                final boolean b2 = false;
                int n2 = 0;
                while (true) {
                    n = (b2 ? 1 : 0);
                    if (n2 >= length) {
                        break;
                    }
                    final int b3 = b[n2].b();
                    if (b3 != 0) {
                        if (b3 < 0) {
                            return -3;
                        }
                        return b3;
                    }
                    else {
                        ++n2;
                    }
                }
            }
            return n;
        }
        if (a.c() != 1) {
            return -3;
        }
        return -2;
    }
    
    public static e c(final String s, final Context context, final F.e e, final int n) {
        final g a = f.a;
        final Typeface typeface = (Typeface)a.c(s);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            final F.g.a e2 = F.d.e(context, e, null);
            final int b = b(e2);
            if (b != 0) {
                return new e(b);
            }
            final Typeface b2 = A.h.b(context, null, e2.b(), n);
            if (b2 != null) {
                a.d(s, b2);
                return new e(b2);
            }
            return new e(-3);
        }
        catch (PackageManager$NameNotFoundException ex) {
            return new e(-1);
        }
    }
    
    public static Typeface d(final Context context, final F.e e, final int n, final Executor executor, a c) {
        final String a = a(e, n);
        final Typeface typeface = (Typeface)f.a.c(a);
        if (typeface != null) {
            c.b(new e(typeface));
            return typeface;
        }
        final H.a a2 = new H.a() {
            public void a(final e e) {
                e e2 = e;
                if (e == null) {
                    e2 = new e(-3);
                }
                c.b(e2);
            }
        };
        c = (a)f.c;
        // monitorenter(c)
        while (true) {
            try {
                final h d = f.d;
                final ArrayList list = (ArrayList)d.get(a);
                if (list != null) {
                    list.add(a2);
                    // monitorexit(c)
                    return null;
                }
                final ArrayList<f$b> list2 = new ArrayList<f$b>();
                list2.add(a2);
                d.put(a, list2);
                // monitorexit(c)
                final Callable callable = new Callable() {
                    public e a() {
                        try {
                            return f.c(a, context, e, n);
                        }
                        finally {
                            return new e(-3);
                        }
                    }
                };
                Executor b;
                if ((b = executor) == null) {
                    b = f.b;
                }
                F.h.b(b, callable, new H.a() {
                    public void a(final e e) {
                        final Object c = f.c;
                        // monitorenter(c)
                        while (true) {
                            try {
                                final h d = f.d;
                                final ArrayList list = (ArrayList)d.get(a);
                                if (list == null) {
                                    // monitorexit(c)
                                    return;
                                }
                                d.remove(a);
                                // monitorexit(c)
                                for (int i = 0; i < list.size(); ++i) {
                                    list.get(i).accept(e);
                                }
                                return;
                                // monitorexit(c)
                                throw;
                            }
                            finally {
                                continue;
                            }
                            break;
                        }
                    }
                });
                return null;
                // monitorexit(c)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static Typeface e(final Context context, final F.e e, final a a, final int n, final int n2) {
        final String a2 = a(e, n);
        final Typeface typeface = (Typeface)f.a.c(a2);
        if (typeface != null) {
            a.b(new e(typeface));
            return typeface;
        }
        if (n2 == -1) {
            final e c = c(a2, context, e, n);
            a.b(c);
            return c.a;
        }
        final Callable callable = new Callable() {
            public e a() {
                return f.c(a2, context, e, n);
            }
        };
        while (true) {
            try {
                final e e2 = (e)F.h.c(f.b, callable, n2);
                a.b(e2);
                return e2.a;
                a.b(new e(-3));
                return null;
            }
            catch (InterruptedException ex) {
                continue;
            }
            break;
        }
    }
    
    public static final class e
    {
        public final Typeface a;
        public final int b;
        
        public e(final int b) {
            this.a = null;
            this.b = b;
        }
        
        public e(final Typeface a) {
            this.a = a;
            this.b = 0;
        }
        
        public boolean a() {
            return this.b == 0;
        }
    }
}
