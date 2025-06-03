package z1;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import kotlin.text.Regex;
import kotlin.text.s;
import y1.C2237F;

/* loaded from: classes.dex */
public final class f implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: s, reason: collision with root package name */
    public static final a f21635s = new a(null);

    /* renamed from: t, reason: collision with root package name */
    public static final Map f21636t = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final Set f21637o;

    /* renamed from: p, reason: collision with root package name */
    public final Handler f21638p;

    /* renamed from: q, reason: collision with root package name */
    public final WeakReference f21639q;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f21640r;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final String c(String str, String str2) {
            return Intrinsics.a("r2", str) ? new Regex("[^\\d.]").replace(str2, "") : str2;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (r7.equals("r5") == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
        
            r8 = new kotlin.text.Regex("[^a-z]+").replace(r8, "");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        
            if (r7.equals("r4") == false) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(java.util.Map r6, java.lang.String r7, java.lang.String r8) {
            /*
                r5 = this;
                int r0 = r7.hashCode()
                r1 = 0
                r2 = 2
                r3 = 0
                switch(r0) {
                    case 3585: goto L5e;
                    case 3586: goto L47;
                    case 3587: goto L3e;
                    case 3588: goto Lc;
                    default: goto La;
                }
            La:
                goto L84
            Lc:
                java.lang.String r0 = "r6"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L16
                goto L84
            L16:
                java.lang.String r0 = "-"
                boolean r1 = kotlin.text.i.v(r8, r0, r3, r2, r1)
                if (r1 == 0) goto L84
                kotlin.text.Regex r1 = new kotlin.text.Regex
                r1.<init>(r0)
                java.util.List r8 = r1.c(r8, r3)
                java.util.Collection r8 = (java.util.Collection) r8
                java.lang.String[] r0 = new java.lang.String[r3]
                java.lang.Object[] r8 = r8.toArray(r0)
                if (r8 == 0) goto L36
                java.lang.String[] r8 = (java.lang.String[]) r8
                r8 = r8[r3]
                goto L84
            L36:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException
                java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<T>"
                r6.<init>(r7)
                throw r6
            L3e:
                java.lang.String r0 = "r5"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L50
                goto L84
            L47:
                java.lang.String r0 = "r4"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L50
                goto L84
            L50:
                kotlin.text.Regex r0 = new kotlin.text.Regex
                java.lang.String r1 = "[^a-z]+"
                r0.<init>(r1)
                java.lang.String r1 = ""
                java.lang.String r8 = r0.replace(r8, r1)
                goto L84
            L5e:
                java.lang.String r0 = "r3"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L67
                goto L84
            L67:
                java.lang.String r0 = "m"
                boolean r4 = kotlin.text.i.s(r8, r0, r3, r2, r1)
                if (r4 != 0) goto L83
                java.lang.String r4 = "b"
                boolean r4 = kotlin.text.i.s(r8, r4, r3, r2, r1)
                if (r4 != 0) goto L83
                java.lang.String r4 = "ge"
                boolean r8 = kotlin.text.i.s(r8, r4, r3, r2, r1)
                if (r8 == 0) goto L80
                goto L83
            L80:
                java.lang.String r8 = "f"
                goto L84
            L83:
                r8 = r0
            L84:
                r6.put(r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z1.f.a.d(java.util.Map, java.lang.String, java.lang.String):void");
        }

        public final void e(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int hashCode = activity.hashCode();
            Map b7 = f.b();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = b7.get(valueOf);
            if (obj == null) {
                obj = new f(activity, null);
                b7.put(valueOf, obj);
            }
            f.c((f) obj);
        }
    }

    public f(Activity activity) {
        this.f21637o = new LinkedHashSet();
        this.f21638p = new Handler(Looper.getMainLooper());
        this.f21639q = new WeakReference(activity);
        this.f21640r = new AtomicBoolean(false);
    }

    public static final /* synthetic */ Map b() {
        if (T1.a.d(f.class)) {
            return null;
        }
        try {
            return f21636t;
        } catch (Throwable th) {
            T1.a.b(th, f.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(f fVar) {
        if (T1.a.d(f.class)) {
            return;
        }
        try {
            fVar.h();
        } catch (Throwable th) {
            T1.a.b(th, f.class);
        }
    }

    public static final void e(View view, f this$0) {
        if (T1.a.d(f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "$view");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (view instanceof EditText) {
                this$0.f(view);
            }
        } catch (Throwable th) {
            T1.a.b(th, f.class);
        }
    }

    public final void d(final View view) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            g(new Runnable() { // from class: z1.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.e(view, this);
                }
            });
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void f(View view) {
        CharSequence f02;
        String c7;
        if (T1.a.d(this)) {
            return;
        }
        try {
            String obj = ((EditText) view).getText().toString();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            f02 = s.f0(obj);
            String obj2 = f02.toString();
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = obj2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (lowerCase.length() != 0 && !this.f21637o.contains(lowerCase) && lowerCase.length() <= 100) {
                this.f21637o.add(lowerCase);
                HashMap hashMap = new HashMap();
                List b7 = c.b(view);
                List list = null;
                for (d dVar : d.f21628d.c()) {
                    a aVar = f21635s;
                    String c8 = aVar.c(dVar.c(), lowerCase);
                    if (dVar.d().length() > 0) {
                        c cVar = c.f21627a;
                        if (!c.f(c8, dVar.d())) {
                        }
                    }
                    c cVar2 = c.f21627a;
                    if (c.e(b7, dVar.b())) {
                        c7 = dVar.c();
                    } else {
                        if (list == null) {
                            list = c.a(view);
                        }
                        if (c.e(list, dVar.b())) {
                            c7 = dVar.c();
                        }
                    }
                    aVar.d(hashMap, c7, c8);
                }
                C2237F.f21324b.e(hashMap);
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void g(Runnable runnable) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f21638p.post(runnable);
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void h() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            if (this.f21640r.getAndSet(true)) {
                return;
            }
            G1.g gVar = G1.g.f2041a;
            View e7 = G1.g.e((Activity) this.f21639q.get());
            if (e7 == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = e7.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalFocusChangeListener(this);
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (T1.a.d(this)) {
            return;
        }
        if (view != null) {
            try {
                d(view);
            } catch (Throwable th) {
                T1.a.b(th, this);
                return;
            }
        }
        if (view2 != null) {
            d(view2);
        }
    }

    public /* synthetic */ f(Activity activity, g gVar) {
        this(activity);
    }
}
