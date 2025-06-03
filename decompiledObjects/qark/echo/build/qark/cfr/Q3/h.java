/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package Q3;

import A2.n;
import Q3.d;
import Q3.e;
import Q3.i;
import Q3.l;
import V3.g;
import V3.k;
import V3.p;
import V3.q;
import android.text.TextUtils;
import i4.a;
import s3.m;

public class h {
    public final s3.e a;
    public final p b;
    public final g c;
    public a d;
    public V3.m e;

    public h(s3.e e8, p p8, g g8) {
        this.a = e8;
        this.b = p8;
        this.c = g8;
    }

    public static h d(s3.e e8) {
        String string2;
        String string3 = string2 = e8.r().d();
        if (string2 == null) {
            if (e8.r().g() != null) {
                string3 = new StringBuilder();
                string3.append("https://");
                string3.append(e8.r().g());
                string3.append("-default-rtdb.firebaseio.com");
                string3 = string3.toString();
            } else {
                throw new d("Failed to get FirebaseDatabase instance: Can't determine Firebase Database URL. Be sure to include a Project ID in your configuration.");
            }
        }
        return h.e(e8, string3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static h e(s3.e object, String string2) {
        synchronized (h.class) {
            Throwable throwable2;
            i i8;
            block4 : {
                try {
                    if (TextUtils.isEmpty((CharSequence)string2)) throw new d("Failed to get FirebaseDatabase instance: Specify DatabaseURL within FirebaseApp or from your getInstance() call.");
                    n.j(object, "Provided FirebaseApp must not be null.");
                    i8 = (i)object.k(i.class);
                    n.j(i8, "Firebase Database component is not present.");
                    object = Y3.m.h(string2);
                    if (!object.b.isEmpty()) break block4;
                    return i8.a(object.a);
                }
                catch (Throwable throwable2) {}
            }
            i8 = new StringBuilder();
            i8.append("Specified Database URL '");
            i8.append(string2);
            i8.append("' is invalid. It should point to the root of a Firebase Database but it includes a path: ");
            i8.append(object.b.toString());
            throw new d(i8.toString());
            throw throwable2;
        }
    }

    public static String g() {
        return "20.3.0";
    }

    public final void b(String string2) {
        if (this.e == null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Calls to ");
        stringBuilder.append(string2);
        stringBuilder.append("() must be made before any other usage of FirebaseDatabase instance.");
        throw new d(stringBuilder.toString());
    }

    public final void c() {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                block3 : {
                    try {
                        if (this.e != null) break block3;
                        this.b.a(this.d);
                        this.e = q.b(this.c, this.b, this);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public e f(String object) {
        this.c();
        if (object != null) {
            Y3.n.i((String)object);
            object = new k((String)object);
            return new e(this.e, (k)object);
        }
        throw new NullPointerException("Can't pass null for argument 'pathString' in FirebaseDatabase.getReference()");
    }

    public void h() {
        this.c();
        q.c(this.e);
    }

    public void i() {
        this.c();
        q.d(this.e);
    }

    public void j() {
        this.c();
        this.e.i0(new Runnable(){

            public void run() {
                h.this.e.a0();
            }
        });
    }

    public void k(l l8) {
        synchronized (this) {
            this.b("setLogLevel");
            this.c.L(l8);
            return;
        }
    }

    public void l(long l8) {
        synchronized (this) {
            this.b("setPersistenceCacheSizeBytes");
            this.c.M(l8);
            return;
        }
    }

    public void m(boolean bl) {
        synchronized (this) {
            this.b("setPersistenceEnabled");
            this.c.N(bl);
            return;
        }
    }

    public void n(String string2, int n8) {
        if (this.e == null) {
            this.d = new a(string2, n8);
            return;
        }
        throw new IllegalStateException("Cannot call useEmulator() after instance has already been initialized.");
    }

}

