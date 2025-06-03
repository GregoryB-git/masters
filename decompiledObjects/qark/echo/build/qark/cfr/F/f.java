/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.graphics.Typeface
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 */
package F;

import F.a;
import F.d;
import F.g;
import F.h;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public abstract class f {
    public static final t.g a = new t.g(16);
    public static final ExecutorService b = h.a("fonts-androidx", 10, 10000);
    public static final Object c = new Object();
    public static final t.h d = new t.h();

    public static String a(F.e e8, int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(e8.d());
        stringBuilder.append("-");
        stringBuilder.append(n8);
        return stringBuilder.toString();
    }

    public static int b(g.a arrb) {
        int n8 = arrb.c();
        int n9 = 1;
        if (n8 != 0) {
            if (arrb.c() != 1) {
                return -3;
            }
            return -2;
        }
        if ((arrb = arrb.b()) != null) {
            if (arrb.length == 0) {
                return 1;
            }
            int n10 = arrb.length;
            int n11 = 0;
            n8 = 0;
            do {
                n9 = n11;
                if (n8 >= n10) break;
                n9 = arrb[n8].b();
                if (n9 != 0) {
                    if (n9 < 0) {
                        return -3;
                    }
                    return n9;
                }
                ++n8;
            } while (true);
        }
        return n9;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static e c(String string2, Context context, F.e object, int n8) {
        t.g g8 = a;
        Typeface typeface = (Typeface)g8.c(string2);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            object = d.e(context, (F.e)object, null);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return new e(-1);
        }
        int n9 = f.b((g.a)object);
        if (n9 != 0) {
            return new e(n9);
        }
        if ((context = A.h.b(context, null, object.b(), n8)) == null) return new e(-3);
        g8.d(string2, (Object)context);
        return new e((Typeface)context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static Typeface d(final Context context, F.e object, int n8, Executor executor, a object2) {
        String string2 = f.a((F.e)object, n8);
        Object object3 = (Typeface)a.c(string2);
        if (object3 != null) {
            object2.b(new e((Typeface)object3));
            return object3;
        }
        object3 = new H.a(){

            public void a(e e8) {
                e e9 = e8;
                if (e8 == null) {
                    e9 = new e(-3);
                }
                a.this.b(e9);
            }
        };
        object2 = c;
        // MONITORENTER : object2
        t.h h8 = d;
        ArrayList arrayList = (ArrayList)h8.get(string2);
        if (arrayList != null) {
            arrayList.add(object3);
            // MONITOREXIT : object2
            return null;
        }
        arrayList = new ArrayList();
        arrayList.add(object3);
        h8.put(string2, (Object)arrayList);
        // MONITOREXIT : object2
        object = new Callable((F.e)object, n8){
            public final /* synthetic */ F.e q;
            public final /* synthetic */ int r;
            {
                this.q = e8;
                this.r = n8;
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            public e a() {
                try {
                    return f.c(String.this, context, this.q, this.r);
                }
                catch (Throwable throwable) {
                    return new e(-3);
                }
            }
        };
        context = executor;
        if (executor == null) {
            context = b;
        }
        h.b((Executor)context, (Callable)object, new H.a(){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            public void a(e e8) {
                Object object = f.c;
                // MONITORENTER : object
                t.h h8 = f.d;
                ArrayList arrayList = (ArrayList)h8.get(String.this);
                if (arrayList == null) {
                    // MONITOREXIT : object
                    return;
                }
                h8.remove(String.this);
                // MONITOREXIT : object
                int n8 = 0;
                while (n8 < arrayList.size()) {
                    ((H.a)arrayList.get(n8)).accept(e8);
                    ++n8;
                }
                return;
            }
        });
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Typeface e(Context object, F.e e8, a a8, int n8, int n9) {
        String string2 = f.a(e8, n8);
        Typeface typeface = (Typeface)a.c(string2);
        if (typeface != null) {
            a8.b(new e(typeface));
            return typeface;
        }
        if (n9 == -1) {
            object = f.c(string2, (Context)object, e8, n8);
            a8.b((e)object);
            return object.a;
        }
        object = new Callable((Context)object, e8, n8){
            public final /* synthetic */ Context p;
            public final /* synthetic */ F.e q;
            public final /* synthetic */ int r;
            {
                this.p = context;
                this.q = e8;
                this.r = n8;
            }

            public e a() {
                return f.c(String.this, this.p, this.q, this.r);
            }
        };
        try {
            object = (e)h.c(b, (Callable)object, n9);
            a8.b((e)object);
            return object.a;
        }
        catch (InterruptedException interruptedException) {}
        a8.b(new e(-3));
        return null;
    }

    public static final class e {
        public final Typeface a;
        public final int b;

        public e(int n8) {
            this.a = null;
            this.b = n8;
        }

        public e(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }

        public boolean a() {
            if (this.b == 0) {
                return true;
            }
            return false;
        }
    }

}

