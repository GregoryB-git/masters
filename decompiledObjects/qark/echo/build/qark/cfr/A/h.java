/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.CancellationSignal
 *  android.os.Handler
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package A;

import A.i;
import A.j;
import A.k;
import A.l;
import A.m;
import A.n;
import F.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import t.g;
import z.e;
import z.h;

public abstract class h {
    public static final n a;
    public static final g b;

    /*
     * Enabled aggressive block sorting
     */
    static {
        void var1_2;
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 29) {
            m m8 = new m();
        } else if (n8 >= 28) {
            l l8 = new l();
        } else if (n8 >= 26) {
            k k8 = new k();
        } else if (n8 >= 24 && j.j()) {
            j j8 = new j();
        } else {
            i i8 = new i();
        }
        a = var1_2;
        b = new g(16);
    }

    public static Typeface a(Context context, Typeface typeface, int n8) {
        if (context != null) {
            return Typeface.create((Typeface)typeface, (int)n8);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] arrb, int n8) {
        return a.b(context, cancellationSignal, arrb, n8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Typeface c(Context object, e.b b8, Resources resources, int n8, String string2, int n9, int n10, h.b object2, Handler handler, boolean bl) {
        if (b8 instanceof e.e) {
            Typeface typeface = h.g((b8 = (e.e)b8).c());
            if (typeface != null) {
                if (object2 != null) {
                    object2.d(typeface, handler);
                }
                return typeface;
            }
            boolean bl2 = bl ? b8.a() == 0 : object2 == null;
            int n11 = bl ? b8.d() : -1;
            handler = h.b.e(handler);
            object2 = new a((h.b)object2);
            object = F.g.a((Context)object, b8.b(), n10, bl2, n11, handler, (g.c)object2);
        } else {
            b8 = a.a((Context)object, (e.c)b8, resources, n10);
            object = b8;
            if (object2 != null) {
                if (b8 != null) {
                    object2.d((Typeface)b8, handler);
                    object = b8;
                } else {
                    object2.c(-3, handler);
                    object = b8;
                }
            }
        }
        if (object != null) {
            b.d(h.e(resources, n8, string2, n9, n10), object);
        }
        return object;
    }

    public static Typeface d(Context context, Resources object, int n8, String string2, int n9, int n10) {
        if ((context = a.d(context, (Resources)object, n8, string2, n10)) != null) {
            object = h.e((Resources)object, n8, string2, n9, n10);
            b.d(object, (Object)context);
        }
        return context;
    }

    public static String e(Resources resources, int n8, String string2, int n9, int n10) {
        resources = new StringBuilder(resources.getResourcePackageName(n8));
        resources.append('-');
        resources.append(string2);
        resources.append('-');
        resources.append(n9);
        resources.append('-');
        resources.append(n8);
        resources.append('-');
        resources.append(n10);
        return resources.toString();
    }

    public static Typeface f(Resources resources, int n8, String string2, int n9, int n10) {
        return (Typeface)b.c(h.e(resources, n8, string2, n9, n10));
    }

    public static Typeface g(String string2) {
        String string3;
        String string4 = string3 = null;
        if (string2 != null) {
            if (string2.isEmpty()) {
                return null;
            }
            string2 = Typeface.create((String)string2, (int)0);
            Typeface typeface = Typeface.create((Typeface)Typeface.DEFAULT, (int)0);
            string4 = string3;
            if (string2 != null) {
                string4 = string3;
                if (!string2.equals((Object)typeface)) {
                    string4 = string2;
                }
            }
        }
        return string4;
    }

    public static class a
    extends g.c {
        public h.b a;

        public a(h.b b8) {
            this.a = b8;
        }

        @Override
        public void a(int n8) {
            h.b b8 = this.a;
            if (b8 != null) {
                b8.h(n8);
            }
        }

        @Override
        public void b(Typeface typeface) {
            h.b b8 = this.a;
            if (b8 != null) {
                b8.i(typeface);
            }
        }
    }

}

