/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  java.io.File
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Set
 *  java.util.concurrent.ScheduledExecutorService
 */
package R3;

import R3.h;
import R3.j;
import T3.f;
import T3.h;
import T3.n;
import V3.l;
import V3.r;
import X3.a;
import X3.b;
import X3.c;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import c4.d;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import s3.e;

public class i
implements l {
    public final Context a;
    public final Set b = new HashSet();
    public final e c;

    public i(e e8) {
        this.c = e8;
        if (e8 != null) {
            this.a = e8.m();
            return;
        }
        Log.e((String)"FirebaseDatabase", (String)"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Log.e((String)"FirebaseDatabase", (String)"ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
        Log.e((String)"FirebaseDatabase", (String)"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
    }

    @Override
    public r a(V3.f f8) {
        return new Y3.c(f8.q("RunLoop")){
            public final /* synthetic */ c4.c b;
            {
                this.b = c8;
            }

            @Override
            public void g(final Throwable throwable) {
                final String string2 = Y3.c.h(throwable);
                this.b.c(string2, throwable);
                new Handler(i.this.a.getMainLooper()).post(new Runnable(){

                    public void run() {
                        throw new RuntimeException(string2, throwable);
                    }
                });
                this.d().shutdownNow();
            }

        };
    }

    @Override
    public d b(V3.f f8, d.a a8, List list) {
        return new c4.a(a8, list);
    }

    @Override
    public File c() {
        return this.a.getApplicationContext().getDir("sslcache", 0);
    }

    @Override
    public T3.h d(V3.f object, T3.c c8, f f8, h.a a8) {
        object = new n(c8, f8, a8);
        this.c.g(new e.a((T3.h)object){
            public final /* synthetic */ T3.h a;
            {
                this.a = h8;
            }

            @Override
            public void a(boolean bl) {
                if (bl) {
                    this.a.j("app_in_background");
                    return;
                }
                this.a.p("app_in_background");
            }
        });
        return object;
    }

    @Override
    public String e(V3.f f8) {
        f8 = new StringBuilder();
        f8.append(Build.VERSION.SDK_INT);
        f8.append("/Android");
        return f8.toString();
    }

    @Override
    public X3.e f(V3.f f8, String string2) {
        String string3 = f8.x();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("_");
        stringBuilder.append(string3);
        string2 = stringBuilder.toString();
        if (!this.b.contains((Object)string2)) {
            this.b.add((Object)string2);
            return new b(f8, new j(this.a, f8, string2), new c(f8.s()));
        }
        f8 = new StringBuilder();
        f8.append("SessionPersistenceKey '");
        f8.append(string3);
        f8.append("' has already been used.");
        throw new Q3.d(f8.toString());
    }

    @Override
    public V3.j g(V3.f f8) {
        return new h();
    }

}

