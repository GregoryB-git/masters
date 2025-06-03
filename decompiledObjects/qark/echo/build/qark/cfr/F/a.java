/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.Runnable
 */
package F;

import F.f;
import F.g;
import android.graphics.Typeface;
import android.os.Handler;

public class a {
    public final g.c a;
    public final Handler b;

    public a(g.c c8, Handler handler) {
        this.a = c8;
        this.b = handler;
    }

    public final void a(final int n8) {
        final g.c c8 = this.a;
        this.b.post(new Runnable(){

            public void run() {
                c8.a(n8);
            }
        });
    }

    public void b(f.e e8) {
        if (e8.a()) {
            this.c(e8.a);
            return;
        }
        this.a(e8.b);
    }

    public final void c(final Typeface typeface) {
        final g.c c8 = this.a;
        this.b.post(new Runnable(){

            public void run() {
                c8.b(typeface);
            }
        });
    }

}

