/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package K1;

import C1.d;
import K1.c;
import K1.f;
import K1.j;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class g
implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final a r = new a(null);
    public static final Map s = new HashMap();
    public final WeakReference o;
    public final Handler p;
    public final AtomicBoolean q;

    public g(Activity activity) {
        this.o = new WeakReference((Object)activity);
        this.p = new Handler(Looper.getMainLooper());
        this.q = new AtomicBoolean(false);
    }

    public /* synthetic */ g(Activity activity, kotlin.jvm.internal.g g8) {
        this(activity);
    }

    public static /* synthetic */ void a(g g8) {
        g.f(g8);
    }

    public static final /* synthetic */ Map b() {
        if (T1.a.d(g.class)) {
            return null;
        }
        try {
            Map map = s;
            return map;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, g.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(g g8) {
        if (T1.a.d(g.class)) {
            return;
        }
        try {
            g8.g();
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, g.class);
            return;
        }
    }

    public static final /* synthetic */ void d(g g8) {
        if (T1.a.d(g.class)) {
            return;
        }
        try {
            g8.h();
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, g.class);
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void f(g g8) {
        if (T1.a.d(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(g8, "this$0");
            G1.g g9 = G1.g.a;
            g9 = G1.g.e((Activity)g8.o.get());
            g8 = (Activity)g8.o.get();
            if (g9 == null) return;
            if (g8 == null) {
                return;
            }
            Iterator iterator = c.a((View)g9).iterator();
            while (iterator.hasNext()) {
                Object object;
                View view = (View)iterator.next();
                if (d.g(view) || (object = c.d(view)).length() <= 0 || object.length() > 300) continue;
                object = j.s;
                String string2 = g8.getLocalClassName();
                Intrinsics.checkNotNullExpressionValue(string2, "activity.localClassName");
                object.d(view, (View)g9, string2);
            }
            return;
        }
        catch (Throwable throwable222) {}
        T1.a.b(throwable222, g.class);
        return;
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            f f8 = new f(this);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                f8.run();
                return;
            }
            this.p.post((Runnable)f8);
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
    }

    public final void g() {
        Throwable throwable2;
        block8 : {
            block7 : {
                G1.g g8;
                block6 : {
                    if (T1.a.d(this)) {
                        return;
                    }
                    try {
                        if (this.q.getAndSet(true)) {
                            return;
                        }
                        g8 = G1.g.a;
                        g8 = G1.g.e((Activity)this.o.get());
                        if (g8 != null) break block6;
                        return;
                    }
                    catch (Throwable throwable2) {}
                }
                g8 = g8.getViewTreeObserver();
                if (g8.isAlive()) {
                    g8.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
                    this.e();
                    return;
                }
                break block7;
                break block8;
            }
            return;
        }
        T1.a.b(throwable2, this);
    }

    public final void h() {
        G1.g g8;
        block6 : {
            if (T1.a.d(this)) {
                return;
            }
            try {
                if (!this.q.getAndSet(false)) {
                    return;
                }
                g8 = G1.g.a;
                g8 = G1.g.e((Activity)this.o.get());
                if (g8 != null) break block6;
                return;
            }
            catch (Throwable throwable) {
                T1.a.b(throwable, this);
                return;
            }
        }
        g8 = g8.getViewTreeObserver();
        if (!g8.isAlive()) {
            return;
        }
        g8.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
    }

    public void onGlobalLayout() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            this.e();
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g g8) {
            this();
        }

        public final void a(Activity activity) {
            Object object;
            Intrinsics.checkNotNullParameter((Object)activity, "activity");
            int n8 = activity.hashCode();
            Map map = g.b();
            Integer n9 = n8;
            Object object2 = object = map.get((Object)n9);
            if (object == null) {
                object2 = new g(activity, null);
                map.put((Object)n9, object2);
            }
            g.c((g)object2);
        }

        public final void b(Activity object) {
            Intrinsics.checkNotNullParameter(object, "activity");
            int n8 = object.hashCode();
            object = (g)g.b().remove((Object)n8);
            if (object == null) {
                return;
            }
            g.d((g)object);
        }
    }

}

