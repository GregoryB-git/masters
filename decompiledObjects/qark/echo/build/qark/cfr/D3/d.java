/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.TimeUnit
 */
package D3;

import D3.a;
import D3.b;
import D3.c;
import D3.e;
import E3.f;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import r4.a;
import w3.a;

public class d {
    public final r4.a a;
    public volatile F3.a b;
    public volatile G3.b c;
    public final List d;

    public d(r4.a a8) {
        this(a8, new G3.c(), new F3.f());
    }

    public d(r4.a a8, G3.b b8, F3.a a9) {
        this.a = a8;
        this.c = b8;
        this.d = new ArrayList();
        this.b = a9;
        this.f();
    }

    public static /* synthetic */ void a(d d8, r4.b b8) {
        d8.i(b8);
    }

    public static /* synthetic */ void b(d d8, String string2, Bundle bundle) {
        d8.g(string2, bundle);
    }

    public static /* synthetic */ void c(d d8, G3.a a8) {
        d8.h(a8);
    }

    public static a.a j(w3.a object, e e8) {
        a.a a8 = object.g("clx", e8);
        Object object2 = a8;
        if (a8 == null) {
            f.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            object2 = object = object.g("crash", e8);
            if (object != null) {
                f.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
                object2 = object;
            }
        }
        return object2;
    }

    public F3.a d() {
        return new b(this);
    }

    public G3.b e() {
        return new a(this);
    }

    public final void f() {
        this.a.a(new c(this));
    }

    public final /* synthetic */ void g(String string2, Bundle bundle) {
        this.b.a(string2, bundle);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void h(G3.a a8) {
        synchronized (this) {
            try {
                if (this.c instanceof G3.c) {
                    this.d.add((Object)a8);
                }
                this.c.a(a8);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void i(r4.b object) {
        f.f().b("AnalyticsConnector now available.");
        Object object2 = (w3.a)object.get();
        F3.e e8 = new F3.e((w3.a)object2);
        object = new e();
        if (d.j((w3.a)object2, (e)object) == null) {
            f.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        f.f().b("Registered Firebase Analytics listener.");
        object2 = new F3.d();
        F3.c c8 = new F3.c(e8, 500, TimeUnit.MILLISECONDS);
        synchronized (this) {
            try {
                Iterator iterator = this.d.iterator();
                do {
                    if (!iterator.hasNext()) {
                        object.d((F3.b)object2);
                        object.e(c8);
                        this.c = object2;
                        this.b = c8;
                        return;
                    }
                    object2.a((G3.a)iterator.next());
                } while (true);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

