// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A;

import android.os.Handler;
import android.content.res.Resources;
import z.e;
import android.os.CancellationSignal;
import android.graphics.Typeface;
import android.content.Context;
import android.os.Build$VERSION;
import t.g;

public abstract class h
{
    public static final n a;
    public static final g b;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        n a2;
        if (sdk_INT >= 29) {
            a2 = new m();
        }
        else if (sdk_INT >= 28) {
            a2 = new l();
        }
        else if (sdk_INT >= 26) {
            a2 = new k();
        }
        else if (sdk_INT >= 24 && j.j()) {
            a2 = new j();
        }
        else {
            a2 = new i();
        }
        a = a2;
        b = new g(16);
    }
    
    public static Typeface a(final Context context, final Typeface typeface, final int n) {
        if (context != null) {
            return Typeface.create(typeface, n);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }
    
    public static Typeface b(final Context context, final CancellationSignal cancellationSignal, final F.g.b[] array, final int n) {
        return h.a.b(context, cancellationSignal, array, n);
    }
    
    public static Typeface c(final Context context, final e.b b, final Resources resources, final int n, final String s, final int n2, final int n3, final z.h.b b2, Handler e, final boolean b3) {
        Typeface typeface;
        if (b instanceof e.e) {
            final e.e e2 = (e.e)b;
            final Typeface g = g(e2.c());
            if (g != null) {
                if (b2 != null) {
                    b2.d(g, e);
                }
                return g;
            }
            final boolean b4 = b3 ? (e2.a() == 0) : (b2 == null);
            int d;
            if (b3) {
                d = e2.d();
            }
            else {
                d = -1;
            }
            e = z.h.b.e(e);
            typeface = F.g.a(context, e2.b(), n3, b4, d, e, (F.g.c)new a(b2));
        }
        else {
            final Typeface typeface2 = typeface = h.a.a(context, (e.c)b, resources, n3);
            if (b2 != null) {
                if (typeface2 != null) {
                    b2.d(typeface2, e);
                    typeface = typeface2;
                }
                else {
                    b2.c(-3, e);
                    typeface = typeface2;
                }
            }
        }
        if (typeface != null) {
            h.b.d(e(resources, n, s, n2, n3), typeface);
        }
        return typeface;
    }
    
    public static Typeface d(final Context context, final Resources resources, final int n, final String s, final int n2, final int n3) {
        final Typeface d = h.a.d(context, resources, n, s, n3);
        if (d != null) {
            h.b.d(e(resources, n, s, n2, n3), d);
        }
        return d;
    }
    
    public static String e(final Resources resources, final int i, final String str, final int j, final int k) {
        final StringBuilder sb = new StringBuilder(resources.getResourcePackageName(i));
        sb.append('-');
        sb.append(str);
        sb.append('-');
        sb.append(j);
        sb.append('-');
        sb.append(i);
        sb.append('-');
        sb.append(k);
        return sb.toString();
    }
    
    public static Typeface f(final Resources resources, final int n, final String s, final int n2, final int n3) {
        return (Typeface)h.b.c(e(resources, n, s, n2, n3));
    }
    
    public static Typeface g(final String s) {
        Typeface typeface2;
        final Typeface typeface = typeface2 = null;
        if (s != null) {
            if (s.isEmpty()) {
                return null;
            }
            final Typeface create = Typeface.create(s, 0);
            final Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            typeface2 = typeface;
            if (create != null) {
                typeface2 = typeface;
                if (!create.equals((Object)create2)) {
                    typeface2 = create;
                }
            }
        }
        return typeface2;
    }
    
    public static class a extends c
    {
        public z.h.b a;
        
        public a(final z.h.b a) {
            this.a = a;
        }
        
        @Override
        public void a(final int n) {
            final z.h.b a = this.a;
            if (a != null) {
                a.h(n);
            }
        }
        
        @Override
        public void b(final Typeface typeface) {
            final z.h.b a = this.a;
            if (a != null) {
                a.i(typeface);
            }
        }
    }
}
