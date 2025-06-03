/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.net.Uri
 *  android.os.Handler
 *  java.lang.Object
 */
package F;

import F.e;
import F.f;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;

public abstract class g {
    public static Typeface a(Context context, e e8, int n8, boolean bl, int n9, Handler object, c c8) {
        object = new F.a(c8, (Handler)object);
        if (bl) {
            return f.e(context, e8, (F.a)object, n8, n9);
        }
        return f.d(context, e8, n8, null, (F.a)object);
    }

    public static class a {
        public final int a;
        public final b[] b;

        public a(int n8, b[] arrb) {
            this.a = n8;
            this.b = arrb;
        }

        public static a a(int n8, b[] arrb) {
            return new a(n8, arrb);
        }

        public b[] b() {
            return this.b;
        }

        public int c() {
            return this.a;
        }
    }

    public static class b {
        public final Uri a;
        public final int b;
        public final int c;
        public final boolean d;
        public final int e;

        public b(Uri uri, int n8, int n9, boolean bl, int n10) {
            this.a = (Uri)H.e.b((Object)uri);
            this.b = n8;
            this.c = n9;
            this.d = bl;
            this.e = n10;
        }

        public static b a(Uri uri, int n8, int n9, boolean bl, int n10) {
            return new b(uri, n8, n9, bl, n10);
        }

        public int b() {
            return this.e;
        }

        public int c() {
            return this.b;
        }

        public Uri d() {
            return this.a;
        }

        public int e() {
            return this.c;
        }

        public boolean f() {
            return this.d;
        }
    }

    public static abstract class c {
        public abstract void a(int var1);

        public abstract void b(Typeface var1);
    }

}

