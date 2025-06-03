/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListView
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.LinkedHashSet
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  java.util.WeakHashMap
 *  org.json.JSONArray
 */
package B1;

import B1.b;
import B1.f;
import B1.h;
import C1.a;
import C1.c;
import O1.P;
import O1.r;
import O1.v;
import O1.z;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.i;
import org.json.JSONArray;
import x1.B;
import x1.o;

public final class g {
    public static final a f = new a(null);
    public static final String g = g.class.getCanonicalName();
    public static g h;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final Set b;
    public final Set c;
    public HashSet d;
    public final HashMap e;

    public g() {
        Set set = Collections.newSetFromMap((Map)new WeakHashMap());
        Intrinsics.checkNotNullExpressionValue((Object)set, "newSetFromMap(WeakHashMap())");
        this.b = set;
        this.c = new LinkedHashSet();
        this.d = new HashSet();
        this.e = new HashMap();
    }

    public /* synthetic */ g(kotlin.jvm.internal.g g8) {
        this();
    }

    public static /* synthetic */ void a(g g8) {
        g.j(g8);
    }

    public static final /* synthetic */ g b() {
        if (T1.a.d(g.class)) {
            return null;
        }
        try {
            g g8 = h;
            return g8;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, g.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (T1.a.d(g.class)) {
            return null;
        }
        try {
            String string2 = g;
            return string2;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, g.class);
            return null;
        }
    }

    public static final /* synthetic */ void d(g g8) {
        if (T1.a.d(g.class)) {
            return;
        }
        try {
            h = g8;
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, g.class);
            return;
        }
    }

    public static final void j(g g8) {
        if (T1.a.d(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(g8, "this$0");
            g8.g();
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, g.class);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(Activity activity) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)activity, "activity");
            if (z.b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new o("Can't add activity to CodelessMatcher on non-UI thread");
            }
            this.b.add((Object)activity);
            this.d.clear();
            activity = (HashSet)this.e.get((Object)activity.hashCode());
            if (activity != null) {
                this.d = activity;
            }
            this.i();
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
    }

    public final void f(Activity activity) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)activity, "activity");
            this.e.remove((Object)activity.hashCode());
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
    public final void g() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                Object object = (Activity)iterator.next();
                if (object == null) continue;
                Object object2 = G1.g.e((Activity)object);
                object = object.getClass().getSimpleName();
                Handler handler = this.a;
                HashSet hashSet = this.d;
                Intrinsics.checkNotNullExpressionValue(object, "activityName");
                object2 = new c((View)object2, handler, hashSet, (String)object);
                this.c.add(object2);
            }
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(Activity activity) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)activity, "activity");
            if (z.b()) {
                return;
            }
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.b.remove((Object)activity);
                this.c.clear();
                this.e.put((Object)activity.hashCode(), (Object)((HashSet)this.d.clone()));
                this.d.clear();
                return;
            }
            throw new o("Can't remove activity from CodelessMatcher on non-UI thread");
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.g();
                return;
            }
            this.a.post((Runnable)new f(this));
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g g8) {
            this();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final g a() {
            synchronized (this) {
                Throwable throwable2;
                block5 : {
                    g g8;
                    try {
                        if (g.b() == null) {
                            g.d(new g(null));
                        }
                        if ((g8 = g.b()) == null) break block5;
                    }
                    catch (Throwable throwable2) {}
                    return g8;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
                throw throwable2;
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        public final Bundle b(C1.a a8, View view, View view2) {
            Intrinsics.checkNotNullParameter((Object)view, "rootView");
            Intrinsics.checkNotNullParameter((Object)view2, "hostView");
            Bundle bundle = new Bundle();
            if (a8 == null) {
                return bundle;
            }
            List list = a8.c();
            if (list != null) {
                block0 : for (C1.b b8 : list) {
                    Object object;
                    if (b8.d() != null && b8.d().length() > 0) {
                        bundle.putString(b8.a(), b8.d());
                        continue;
                    }
                    if (b8.b().size() <= 0) continue;
                    boolean bl = Intrinsics.a(b8.c(), "relative");
                    Object object2 = c.t;
                    List list2 = b8.b();
                    if (bl) {
                        object = view2.getClass().getSimpleName();
                        Intrinsics.checkNotNullExpressionValue(object, "hostView.javaClass.simpleName");
                        list = view2;
                    } else {
                        object = view.getClass().getSimpleName();
                        Intrinsics.checkNotNullExpressionValue(object, "rootView.javaClass.simpleName");
                        list = view;
                    }
                    list = object2.a(a8, (View)list, list2, 0, -1, (String)object);
                    list = list.iterator();
                    while (list.hasNext()) {
                        object = (b)list.next();
                        if (object.a() == null) continue;
                        object2 = C1.f.a;
                        if ((object = C1.f.k(object.a())).length() <= 0) continue;
                        bundle.putString(b8.a(), (String)object);
                        continue block0;
                    }
                }
            }
            return bundle;
        }
    }

    public static final class b {
        public final WeakReference a;
        public final String b;

        public b(View view, String string2) {
            Intrinsics.checkNotNullParameter((Object)view, "view");
            Intrinsics.checkNotNullParameter(string2, "viewMapKey");
            this.a = new WeakReference((Object)view);
            this.b = string2;
        }

        public final View a() {
            WeakReference weakReference = this.a;
            if (weakReference == null) {
                return null;
            }
            return (View)weakReference.get();
        }

        public final String b() {
            return this.b;
        }
    }

    public static final class c
    implements ViewTreeObserver.OnGlobalLayoutListener,
    ViewTreeObserver.OnScrollChangedListener,
    Runnable {
        public static final a t = new a(null);
        public final WeakReference o;
        public List p;
        public final Handler q;
        public final HashSet r;
        public final String s;

        public c(View view, Handler handler, HashSet hashSet, String string2) {
            Intrinsics.checkNotNullParameter((Object)handler, "handler");
            Intrinsics.checkNotNullParameter((Object)hashSet, "listenerSet");
            Intrinsics.checkNotNullParameter(string2, "activityName");
            this.o = new WeakReference((Object)view);
            this.q = handler;
            this.r = hashSet;
            this.s = string2;
            handler.postDelayed((Runnable)this, 200L);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void a(b object, View view, C1.a a8) {
            if (a8 == null) {
                return;
            }
            try {
                View view2 = object.a();
                if (view2 == null) {
                    return;
                }
                Object object2 = C1.f.a(view2);
                if (object2 != null && C1.f.a.p(view2, (View)object2)) {
                    this.d((b)object, view, a8);
                    return;
                }
                object2 = view2.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(object2, "view.javaClass.name");
                if (i.s((String)object2, "com.facebook.react", false, 2, null)) {
                    return;
                }
                if (!(view2 instanceof AdapterView)) {
                    this.b((b)object, view, a8);
                    return;
                }
                if (!(view2 instanceof ListView)) return;
                {
                    this.c((b)object, view, a8);
                    return;
                }
            }
            catch (Exception exception) {}
            object = P.a;
            P.i0(g.c(), exception);
        }

        public final void b(b object, View view, C1.a a8) {
            View view2;
            boolean bl;
            block4 : {
                block2 : {
                    block3 : {
                        view2 = object.a();
                        if (view2 == null) {
                            return;
                        }
                        object = object.b();
                        View.OnClickListener onClickListener = C1.f.g(view2);
                        if (!(onClickListener instanceof b.a)) break block2;
                        if (onClickListener == null) break block3;
                        if (!((b.a)onClickListener).a()) break block2;
                        bl = true;
                        break block4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                }
                bl = false;
            }
            if (!this.r.contains(object) && !bl) {
                view2.setOnClickListener((View.OnClickListener)B1.b.b(a8, view, view2));
                this.r.add(object);
            }
        }

        public final void c(b object, View view, C1.a a8) {
            boolean bl;
            AdapterView adapterView;
            block4 : {
                block2 : {
                    block3 : {
                        adapterView = (AdapterView)object.a();
                        if (adapterView == null) {
                            return;
                        }
                        object = object.b();
                        AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
                        if (!(onItemClickListener instanceof b.b)) break block2;
                        if (onItemClickListener == null) break block3;
                        if (!((b.b)onItemClickListener).a()) break block2;
                        bl = true;
                        break block4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                }
                bl = false;
            }
            if (!this.r.contains(object) && !bl) {
                adapterView.setOnItemClickListener((AdapterView.OnItemClickListener)B1.b.c(a8, view, adapterView));
                this.r.add(object);
            }
        }

        public final void d(b object, View view, C1.a a8) {
            View view2;
            boolean bl;
            block4 : {
                block2 : {
                    block3 : {
                        view2 = object.a();
                        if (view2 == null) {
                            return;
                        }
                        object = object.b();
                        View.OnTouchListener onTouchListener = C1.f.h(view2);
                        if (!(onTouchListener instanceof h.a)) break block2;
                        if (onTouchListener == null) break block3;
                        if (!((h.a)onTouchListener).a()) break block2;
                        bl = true;
                        break block4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                }
                bl = false;
            }
            if (!this.r.contains(object) && !bl) {
                view2.setOnTouchListener((View.OnTouchListener)h.a(a8, view, view2));
                this.r.add(object);
            }
        }

        public final void e(C1.a a8, View view) {
            if (a8 != null) {
                if (view == null) {
                    return;
                }
                String string2 = a8.a();
                if (string2 != null && string2.length() != 0 && !Intrinsics.a(a8.a(), this.s)) {
                    return;
                }
                string2 = a8.d();
                if (string2.size() > 25) {
                    return;
                }
                string2 = t.a(a8, view, (List)string2, 0, -1, this.s).iterator();
                while (string2.hasNext()) {
                    this.a((b)string2.next(), view, a8);
                }
            }
        }

        public final void f() {
            int n8;
            List list = this.p;
            if (list == null) {
                return;
            }
            if (this.o.get() != null && (n8 = list.size() - 1) >= 0) {
                int n9 = 0;
                do {
                    int n10 = n9 + 1;
                    this.e((C1.a)list.get(n9), (View)this.o.get());
                    if (n10 > n8) {
                        return;
                    }
                    n9 = n10;
                } while (true);
            }
        }

        public void onGlobalLayout() {
            this.f();
        }

        public void onScrollChanged() {
            this.f();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void run() {
            if (T1.a.d(this)) {
                return;
            }
            try {
                r r8 = v.f(B.m());
                if (r8 != null) {
                    if (!r8.b()) {
                        return;
                    }
                    r8 = C1.a.j.b(r8.d());
                    this.p = r8;
                    if (r8 != null) {
                        r8 = (View)this.o.get();
                        if (r8 == null) {
                            return;
                        }
                        if ((r8 = r8.getViewTreeObserver()).isAlive()) {
                            r8.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
                            r8.addOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)this);
                        }
                        this.f();
                    }
                }
                return;
            }
            catch (Throwable throwable) {}
            T1.a.b(throwable, this);
        }

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g g8) {
                this();
            }

            /*
             * Enabled aggressive block sorting
             */
            public final List a(C1.a a8, View view, List list, int n8, int n9, String object) {
                ArrayList arrayList;
                Object object2;
                int n10;
                block18 : {
                    int n11;
                    block16 : {
                        block17 : {
                            block14 : {
                                block15 : {
                                    block13 : {
                                        Intrinsics.checkNotNullParameter((Object)list, "path");
                                        Intrinsics.checkNotNullParameter(object, "mapKey");
                                        object2 = new StringBuilder();
                                        object2.append((String)object);
                                        object2.append('.');
                                        object2.append(n9);
                                        object2 = object2.toString();
                                        arrayList = new ArrayList();
                                        if (view == null) {
                                            return arrayList;
                                        }
                                        if (n8 < list.size()) break block13;
                                        object = new b(view, (String)object2);
                                        break block14;
                                    }
                                    object = (C1.c)list.get(n8);
                                    if (!Intrinsics.a(object.a(), "..")) break block15;
                                    if (!((view = view.getParent()) instanceof ViewGroup) || (n11 = (view = this.b((ViewGroup)view)).size()) <= 0) {
                                        return arrayList;
                                    }
                                    break block16;
                                }
                                if (Intrinsics.a(object.a(), ".")) {
                                    arrayList.add((Object)new b(view, (String)object2));
                                    return arrayList;
                                }
                                if (!this.c(view, (C1.c)object, n9)) {
                                    return arrayList;
                                }
                                if (n8 != list.size() - 1) break block17;
                                object = new b(view, (String)object2);
                            }
                            arrayList.add(object);
                        }
                        if (!(view instanceof ViewGroup) || (n10 = (view = this.b((ViewGroup)view)).size()) <= 0) {
                            return arrayList;
                        }
                        break block18;
                    }
                    n9 = 0;
                    do {
                        int n12 = n9 + 1;
                        arrayList.addAll((Collection)this.a(a8, (View)view.get(n9), list, n8 + 1, n9, (String)object2));
                        if (n12 >= n11) {
                            return arrayList;
                        }
                        n9 = n12;
                    } while (true);
                }
                n9 = 0;
                do {
                    int n13 = n9 + 1;
                    arrayList.addAll((Collection)this.a(a8, (View)view.get(n9), list, n8 + 1, n9, (String)object2));
                    if (n13 >= n10) {
                        return arrayList;
                    }
                    n9 = n13;
                } while (true);
            }

            public final List b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int n8 = viewGroup.getChildCount();
                if (n8 > 0) {
                    int n9 = 0;
                    do {
                        int n10 = n9 + 1;
                        View view = viewGroup.getChildAt(n9);
                        if (view.getVisibility() == 0) {
                            Intrinsics.checkNotNullExpressionValue((Object)view, "child");
                            arrayList.add((Object)view);
                        }
                        if (n10 >= n8) {
                            return arrayList;
                        }
                        n9 = n10;
                    } while (true);
                }
                return arrayList;
            }

            public final boolean c(View object, C1.c object2, int n8) {
                String string2;
                String string3;
                String string4;
                block13 : {
                    block14 : {
                        if (object2.e() != -1 && n8 != object2.e()) {
                            return false;
                        }
                        if (Intrinsics.a(object.getClass().getCanonicalName(), object2.a())) break block13;
                        string3 = object2.a();
                        if (!new Regex(".*android\\..*").b(string3) || !(((Collection)(string3 = i.V(object2.a(), new String[]{"."}, false, 0, 6, null))).isEmpty() ^ true)) break block14;
                        string3 = (String)string3.get(string3.size() - 1);
                        if (Intrinsics.a(object.getClass().getSimpleName(), string3)) break block13;
                    }
                    return false;
                }
                if ((object2.f() & c.b.p.e()) > 0 && object2.d() != object.getId()) {
                    return false;
                }
                if ((object2.f() & c.b.q.e()) > 0) {
                    string3 = object2.h();
                    string4 = C1.f.k((View)object);
                    string2 = P.k(P.F0(string4), "");
                    if (!Intrinsics.a(string3, string4) && !Intrinsics.a(string3, string2)) {
                        return false;
                    }
                }
                if ((object2.f() & c.b.s.e()) > 0) {
                    string4 = object2.b();
                    string3 = object.getContentDescription() == null ? "" : object.getContentDescription().toString();
                    string2 = P.k(P.F0(string3), "");
                    if (!Intrinsics.a(string4, string3) && !Intrinsics.a(string4, string2)) {
                        return false;
                    }
                }
                if ((object2.f() & c.b.t.e()) > 0) {
                    string3 = object2.c();
                    string4 = C1.f.i((View)object);
                    string2 = P.k(P.F0(string4), "");
                    if (!Intrinsics.a(string3, string4) && !Intrinsics.a(string3, string2)) {
                        return false;
                    }
                }
                if ((object2.f() & c.b.r.e()) > 0) {
                    object2 = object2.g();
                    object = object.getTag() == null ? "" : object.getTag().toString();
                    string3 = P.k(P.F0((String)object), "");
                    if (!Intrinsics.a(object2, object) && !Intrinsics.a(object2, string3)) {
                        return false;
                    }
                }
                return true;
            }
        }

    }

}

