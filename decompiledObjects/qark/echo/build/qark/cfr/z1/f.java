/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.Editable
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalFocusChangeListener
 *  android.widget.EditText
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.LinkedHashSet
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package z1;

import G1.g;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.i;
import y1.F;
import z1.c;
import z1.d;
import z1.e;

public final class f
implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public static final a s = new a(null);
    public static final Map t = new HashMap();
    public final Set o = new LinkedHashSet();
    public final Handler p = new Handler(Looper.getMainLooper());
    public final WeakReference q;
    public final AtomicBoolean r;

    public f(Activity activity) {
        this.q = new WeakReference((Object)activity);
        this.r = new AtomicBoolean(false);
    }

    public /* synthetic */ f(Activity activity, kotlin.jvm.internal.g g8) {
        this(activity);
    }

    public static /* synthetic */ void a(View view, f f8) {
        f.e(view, f8);
    }

    public static final /* synthetic */ Map b() {
        if (T1.a.d(f.class)) {
            return null;
        }
        try {
            Map map = t;
            return map;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, f.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(f f8) {
        if (T1.a.d(f.class)) {
            return;
        }
        try {
            f8.h();
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, f.class);
            return;
        }
    }

    public static final void e(View view, f f8) {
        if (T1.a.d(f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)view, "$view");
            Intrinsics.checkNotNullParameter(f8, "this$0");
            if (!(view instanceof EditText)) {
                return;
            }
            f8.f(view);
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, f.class);
            return;
        }
    }

    public final void d(View view) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            this.g(new e(view, this));
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(View view) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Object object = ((EditText)view).getText().toString();
            if (object == null) throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            if ((object = i.f0((CharSequence)object).toString()) == null) throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            String string2 = object.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(string2, "(this as java.lang.String).toLowerCase()");
            if (string2.length() == 0) {
                return;
            }
            if (this.o.contains((Object)string2)) return;
            if (string2.length() > 100) {
                return;
            }
            this.o.add((Object)string2);
            HashMap hashMap = new HashMap();
            List list = c.b(view);
            Iterator iterator = d.d.c().iterator();
            object = null;
            do {
                Object object2;
                if (!iterator.hasNext()) {
                    F.b.e((Map)hashMap);
                    return;
                }
                Object object3 = (d)iterator.next();
                a a8 = s;
                String string3 = a8.c(object3.c(), string2);
                if (object3.d().length() > 0) {
                    object2 = c.a;
                    if (!c.f(string3, object3.d())) continue;
                }
                object2 = c.a;
                if (c.e(list, object3.b())) {
                    object2 = object3.c();
                } else {
                    object2 = object;
                    if (object == null) {
                        object2 = c.a(view);
                    }
                    object = object2;
                    if (!c.e((List)object2, object3.b())) continue;
                    object3 = object3.c();
                    object = object2;
                    object2 = object3;
                }
                a8.d((Map)hashMap, (String)object2, string3);
            } while (true);
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(Runnable runnable) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
                return;
            }
            this.p.post(runnable);
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
    }

    public final void h() {
        Throwable throwable2;
        block8 : {
            block7 : {
                g g8;
                block6 : {
                    if (T1.a.d(this)) {
                        return;
                    }
                    try {
                        if (this.r.getAndSet(true)) {
                            return;
                        }
                        g8 = g.a;
                        g8 = g.e((Activity)this.q.get());
                        if (g8 != null) break block6;
                        return;
                    }
                    catch (Throwable throwable2) {}
                }
                g8 = g8.getViewTreeObserver();
                if (g8.isAlive()) {
                    g8.addOnGlobalFocusChangeListener((ViewTreeObserver.OnGlobalFocusChangeListener)this);
                    return;
                }
                break block7;
                break block8;
            }
            return;
        }
        T1.a.b(throwable2, this);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void onGlobalFocusChanged(View var1_1, View var2_3) {
        if (T1.a.d(this)) {
            return;
        }
        if (var1_1 == null) ** GOTO lbl6
        try {
            this.d(var1_1);
lbl6: // 2 sources:
            if (var2_3 == null) return;
            this.d(var2_3);
            return;
        }
        catch (Throwable var1_2) {}
        T1.a.b(var1_2, this);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g g8) {
            this();
        }

        public final String c(String string2, String string3) {
            String string4 = string3;
            if (Intrinsics.a("r2", string2)) {
                string4 = new Regex("[^\\d.]").replace(string3, "");
            }
            return string4;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public final void d(Map var1_1, String var2_2, String var3_3) {
            block11 : {
                switch (var2_2.hashCode()) {
                    default: {
                        var4_4 = var3_3;
                        break block11;
                    }
                    case 3588: {
                        if (!var2_2.equals((Object)"r6")) {
                            var4_4 = var3_3;
                        } else {
                            var4_4 = var3_3;
                            if (i.v((CharSequence)var3_3, "-", false, 2, null)) {
                                if ((var3_3 = ((Collection)new Regex("-").c((CharSequence)var3_3, 0)).toArray((Object[])new String[0])) == null) throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                var4_4 = ((String[])var3_3)[0];
                            }
                        }
                        break block11;
                    }
                    case 3587: {
                        if (var2_2.equals((Object)"r5")) ** GOTO lbl-1000
                        var4_4 = var3_3;
                        break block11;
                    }
                    case 3586: {
                        if (!var2_2.equals((Object)"r4")) {
                            var4_4 = var3_3;
                        } else lbl-1000: // 2 sources:
                        {
                            var4_4 = new Regex("[^a-z]+").replace((CharSequence)var3_3, "");
                        }
                        break block11;
                    }
                    case 3585: 
                }
                var4_4 = !var2_2.equals((Object)"r3") ? var3_3 : (!(i.s((String)var3_3, "m", false, 2, null) || i.s((String)var3_3, "b", false, 2, null) || i.s((String)var3_3, "ge", false, 2, null)) ? "f" : "m");
            }
            var1_1.put((Object)var2_2, (Object)var4_4);
        }

        public final void e(Activity activity) {
            Object object;
            Intrinsics.checkNotNullParameter((Object)activity, "activity");
            int n8 = activity.hashCode();
            Map map = f.b();
            Integer n9 = n8;
            Object object2 = object = map.get((Object)n9);
            if (object == null) {
                object2 = new f(activity, null);
                map.put((Object)n9, object2);
            }
            f.c((f)object2);
        }
    }

}

