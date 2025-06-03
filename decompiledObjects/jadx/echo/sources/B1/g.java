package B1;

import B1.b;
import B1.h;
import O1.C0458v;
import O1.P;
import O1.z;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import x1.C2146B;
import x1.C2162o;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: f, reason: collision with root package name */
    public static final a f694f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final String f695g = g.class.getCanonicalName();

    /* renamed from: h, reason: collision with root package name */
    public static g f696h;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f697a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f698b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f699c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f700d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f701e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final synchronized g a() {
            g b7;
            try {
                if (g.b() == null) {
                    g.d(new g(null));
                }
                b7 = g.b();
                if (b7 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
                }
            } catch (Throwable th) {
                throw th;
            }
            return b7;
        }

        public final Bundle b(C1.a aVar, View rootView, View hostView) {
            String simpleName;
            int i7;
            int i8;
            C1.a aVar2;
            View view;
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            Bundle bundle = new Bundle();
            if (aVar == null) {
                return bundle;
            }
            List<C1.b> c7 = aVar.c();
            if (c7 != null) {
                for (C1.b bVar : c7) {
                    if (bVar.d() != null && bVar.d().length() > 0) {
                        bundle.putString(bVar.a(), bVar.d());
                    } else if (bVar.b().size() > 0) {
                        boolean a7 = Intrinsics.a(bVar.c(), "relative");
                        c.a aVar3 = c.f704t;
                        List b7 = bVar.b();
                        if (a7) {
                            simpleName = hostView.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName, "hostView.javaClass.simpleName");
                            i7 = 0;
                            i8 = -1;
                            aVar2 = aVar;
                            view = hostView;
                        } else {
                            simpleName = rootView.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName, "rootView.javaClass.simpleName");
                            i7 = 0;
                            i8 = -1;
                            aVar2 = aVar;
                            view = rootView;
                        }
                        Iterator it = aVar3.a(aVar2, view, b7, i7, i8, simpleName).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                b bVar2 = (b) it.next();
                                if (bVar2.a() != null) {
                                    C1.f fVar = C1.f.f913a;
                                    String k7 = C1.f.k(bVar2.a());
                                    if (k7.length() > 0) {
                                        bundle.putString(bVar.a(), k7);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f702a;

        /* renamed from: b, reason: collision with root package name */
        public final String f703b;

        public b(View view, String viewMapKey) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(viewMapKey, "viewMapKey");
            this.f702a = new WeakReference(view);
            this.f703b = viewMapKey;
        }

        public final View a() {
            WeakReference weakReference = this.f702a;
            if (weakReference == null) {
                return null;
            }
            return (View) weakReference.get();
        }

        public final String b() {
            return this.f703b;
        }
    }

    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* renamed from: t, reason: collision with root package name */
        public static final a f704t = new a(null);

        /* renamed from: o, reason: collision with root package name */
        public final WeakReference f705o;

        /* renamed from: p, reason: collision with root package name */
        public List f706p;

        /* renamed from: q, reason: collision with root package name */
        public final Handler f707q;

        /* renamed from: r, reason: collision with root package name */
        public final HashSet f708r;

        /* renamed from: s, reason: collision with root package name */
        public final String f709s;

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x00d2 A[LOOP:0: B:14:0x00b7->B:16:0x00d2, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:17:0x00d4 A[EDGE_INSN: B:17:0x00d4->B:18:0x00d4 BREAK  A[LOOP:0: B:14:0x00b7->B:16:0x00d2], SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.util.List a(C1.a r10, android.view.View r11, java.util.List r12, int r13, int r14, java.lang.String r15) {
                /*
                    r9 = this;
                    java.lang.String r0 = "path"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                    java.lang.String r0 = "mapKey"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r15)
                    r15 = 46
                    r0.append(r15)
                    r0.append(r14)
                    java.lang.String r15 = r0.toString()
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    if (r11 != 0) goto L26
                    return r0
                L26:
                    int r1 = r12.size()
                    r2 = 0
                    if (r13 < r1) goto L37
                    B1.g$b r14 = new B1.g$b
                    r14.<init>(r11, r15)
                L32:
                    r0.add(r14)
                    goto La6
                L37:
                    java.lang.Object r1 = r12.get(r13)
                    C1.c r1 = (C1.c) r1
                    java.lang.String r3 = r1.a()
                    java.lang.String r4 = ".."
                    boolean r3 = kotlin.jvm.internal.Intrinsics.a(r3, r4)
                    if (r3 == 0) goto L7c
                    android.view.ViewParent r11 = r11.getParent()
                    boolean r14 = r11 instanceof android.view.ViewGroup
                    if (r14 == 0) goto L7b
                    android.view.ViewGroup r11 = (android.view.ViewGroup) r11
                    java.util.List r11 = r9.b(r11)
                    int r14 = r11.size()
                    if (r14 <= 0) goto L7b
                    r6 = r2
                L5e:
                    int r8 = r6 + 1
                    java.lang.Object r1 = r11.get(r6)
                    r3 = r1
                    android.view.View r3 = (android.view.View) r3
                    int r5 = r13 + 1
                    r1 = r9
                    r2 = r10
                    r4 = r12
                    r7 = r15
                    java.util.List r1 = r1.a(r2, r3, r4, r5, r6, r7)
                    java.util.Collection r1 = (java.util.Collection) r1
                    r0.addAll(r1)
                    if (r8 < r14) goto L79
                    goto L7b
                L79:
                    r6 = r8
                    goto L5e
                L7b:
                    return r0
                L7c:
                    java.lang.String r3 = r1.a()
                    java.lang.String r4 = "."
                    boolean r3 = kotlin.jvm.internal.Intrinsics.a(r3, r4)
                    if (r3 == 0) goto L91
                    B1.g$b r10 = new B1.g$b
                    r10.<init>(r11, r15)
                    r0.add(r10)
                    return r0
                L91:
                    boolean r14 = r9.c(r11, r1, r14)
                    if (r14 != 0) goto L98
                    return r0
                L98:
                    int r14 = r12.size()
                    int r14 = r14 + (-1)
                    if (r13 != r14) goto La6
                    B1.g$b r14 = new B1.g$b
                    r14.<init>(r11, r15)
                    goto L32
                La6:
                    boolean r14 = r11 instanceof android.view.ViewGroup
                    if (r14 == 0) goto Ld4
                    android.view.ViewGroup r11 = (android.view.ViewGroup) r11
                    java.util.List r11 = r9.b(r11)
                    int r14 = r11.size()
                    if (r14 <= 0) goto Ld4
                    r6 = r2
                Lb7:
                    int r8 = r6 + 1
                    java.lang.Object r1 = r11.get(r6)
                    r3 = r1
                    android.view.View r3 = (android.view.View) r3
                    int r5 = r13 + 1
                    r1 = r9
                    r2 = r10
                    r4 = r12
                    r7 = r15
                    java.util.List r1 = r1.a(r2, r3, r4, r5, r6, r7)
                    java.util.Collection r1 = (java.util.Collection) r1
                    r0.addAll(r1)
                    if (r8 < r14) goto Ld2
                    goto Ld4
                Ld2:
                    r6 = r8
                    goto Lb7
                Ld4:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: B1.g.c.a.a(C1.a, android.view.View, java.util.List, int, int, java.lang.String):java.util.List");
            }

            public final List b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    int i7 = 0;
                    while (true) {
                        int i8 = i7 + 1;
                        View child = viewGroup.getChildAt(i7);
                        if (child.getVisibility() == 0) {
                            Intrinsics.checkNotNullExpressionValue(child, "child");
                            arrayList.add(child);
                        }
                        if (i8 >= childCount) {
                            break;
                        }
                        i7 = i8;
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.a(r10.getClass().getSimpleName(), (java.lang.String) r12.get(r12.size() - 1)) == false) goto L15;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final boolean c(android.view.View r10, C1.c r11, int r12) {
                /*
                    Method dump skipped, instructions count: 324
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: B1.g.c.a.c(android.view.View, C1.c, int):boolean");
            }
        }

        public c(View view, Handler handler, HashSet listenerSet, String activityName) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(listenerSet, "listenerSet");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            this.f705o = new WeakReference(view);
            this.f707q = handler;
            this.f708r = listenerSet;
            this.f709s = activityName;
            handler.postDelayed(this, 200L);
        }

        public final void a(b bVar, View view, C1.a aVar) {
            boolean s7;
            if (aVar == null) {
                return;
            }
            try {
                View a7 = bVar.a();
                if (a7 == null) {
                    return;
                }
                View a8 = C1.f.a(a7);
                if (a8 != null && C1.f.f913a.p(a7, a8)) {
                    d(bVar, view, aVar);
                    return;
                }
                String name = a7.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "view.javaClass.name");
                s7 = r.s(name, "com.facebook.react", false, 2, null);
                if (s7) {
                    return;
                }
                if (!(a7 instanceof AdapterView)) {
                    b(bVar, view, aVar);
                } else if (a7 instanceof ListView) {
                    c(bVar, view, aVar);
                }
            } catch (Exception e7) {
                P p7 = P.f3756a;
                P.i0(g.c(), e7);
            }
        }

        public final void b(b bVar, View view, C1.a aVar) {
            boolean z7;
            View a7 = bVar.a();
            if (a7 == null) {
                return;
            }
            String b7 = bVar.b();
            View.OnClickListener g7 = C1.f.g(a7);
            if (g7 instanceof b.a) {
                if (g7 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                }
                if (((b.a) g7).a()) {
                    z7 = true;
                    if (!this.f708r.contains(b7) || z7) {
                    }
                    a7.setOnClickListener(B1.b.b(aVar, view, a7));
                    this.f708r.add(b7);
                    return;
                }
            }
            z7 = false;
            if (this.f708r.contains(b7)) {
            }
        }

        public final void c(b bVar, View view, C1.a aVar) {
            boolean z7;
            AdapterView adapterView = (AdapterView) bVar.a();
            if (adapterView == null) {
                return;
            }
            String b7 = bVar.b();
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            if (onItemClickListener instanceof b.C0009b) {
                if (onItemClickListener == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                }
                if (((b.C0009b) onItemClickListener).a()) {
                    z7 = true;
                    if (!this.f708r.contains(b7) || z7) {
                    }
                    adapterView.setOnItemClickListener(B1.b.c(aVar, view, adapterView));
                    this.f708r.add(b7);
                    return;
                }
            }
            z7 = false;
            if (this.f708r.contains(b7)) {
            }
        }

        public final void d(b bVar, View view, C1.a aVar) {
            boolean z7;
            View a7 = bVar.a();
            if (a7 == null) {
                return;
            }
            String b7 = bVar.b();
            View.OnTouchListener h7 = C1.f.h(a7);
            if (h7 instanceof h.a) {
                if (h7 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                }
                if (((h.a) h7).a()) {
                    z7 = true;
                    if (!this.f708r.contains(b7) || z7) {
                    }
                    a7.setOnTouchListener(h.a(aVar, view, a7));
                    this.f708r.add(b7);
                    return;
                }
            }
            z7 = false;
            if (this.f708r.contains(b7)) {
            }
        }

        public final void e(C1.a aVar, View view) {
            if (aVar == null || view == null) {
                return;
            }
            String a7 = aVar.a();
            if (a7 == null || a7.length() == 0 || Intrinsics.a(aVar.a(), this.f709s)) {
                List d7 = aVar.d();
                if (d7.size() > 25) {
                    return;
                }
                Iterator it = f704t.a(aVar, view, d7, 0, -1, this.f709s).iterator();
                while (it.hasNext()) {
                    a((b) it.next(), view, aVar);
                }
            }
        }

        public final void f() {
            int size;
            List list = this.f706p;
            if (list == null || this.f705o.get() == null || list.size() - 1 < 0) {
                return;
            }
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                e((C1.a) list.get(i7), (View) this.f705o.get());
                if (i8 > size) {
                    return;
                } else {
                    i7 = i8;
                }
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            f();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            f();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (T1.a.d(this)) {
                return;
            }
            try {
                O1.r f7 = C0458v.f(C2146B.m());
                if (f7 != null && f7.b()) {
                    List b7 = C1.a.f871j.b(f7.d());
                    this.f706p = b7;
                    if (b7 == null || (view = (View) this.f705o.get()) == null) {
                        return;
                    }
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        viewTreeObserver.addOnScrollChangedListener(this);
                    }
                    f();
                }
            } catch (Throwable th) {
                T1.a.b(th, this);
            }
        }
    }

    public g() {
        this.f697a = new Handler(Looper.getMainLooper());
        Set newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f698b = newSetFromMap;
        this.f699c = new LinkedHashSet();
        this.f700d = new HashSet();
        this.f701e = new HashMap();
    }

    public static final /* synthetic */ g b() {
        if (T1.a.d(g.class)) {
            return null;
        }
        try {
            return f696h;
        } catch (Throwable th) {
            T1.a.b(th, g.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (T1.a.d(g.class)) {
            return null;
        }
        try {
            return f695g;
        } catch (Throwable th) {
            T1.a.b(th, g.class);
            return null;
        }
    }

    public static final /* synthetic */ void d(g gVar) {
        if (T1.a.d(g.class)) {
            return;
        }
        try {
            f696h = gVar;
        } catch (Throwable th) {
            T1.a.b(th, g.class);
        }
    }

    public static final void j(g this$0) {
        if (T1.a.d(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.g();
        } catch (Throwable th) {
            T1.a.b(th, g.class);
        }
    }

    public final void e(Activity activity) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (z.b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new C2162o("Can't add activity to CodelessMatcher on non-UI thread");
            }
            this.f698b.add(activity);
            this.f700d.clear();
            HashSet hashSet = (HashSet) this.f701e.get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.f700d = hashSet;
            }
            i();
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void f(Activity activity) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f701e.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void g() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            for (Activity activity : this.f698b) {
                if (activity != null) {
                    View e7 = G1.g.e(activity);
                    String activityName = activity.getClass().getSimpleName();
                    Handler handler = this.f697a;
                    HashSet hashSet = this.f700d;
                    Intrinsics.checkNotNullExpressionValue(activityName, "activityName");
                    this.f699c.add(new c(e7, handler, hashSet, activityName));
                }
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void h(Activity activity) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (z.b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new C2162o("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            this.f698b.remove(activity);
            this.f699c.clear();
            this.f701e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f700d.clone());
            this.f700d.clear();
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void i() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                g();
            } else {
                this.f697a.post(new Runnable() { // from class: B1.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.j(g.this);
                    }
                });
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public /* synthetic */ g(kotlin.jvm.internal.g gVar) {
        this();
    }
}
