package B1;

import B1.l;
import O1.C;
import O1.P;
import O1.z;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.C2146B;
import x1.C2148a;
import x1.F;
import x1.K;
import x1.N;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final a f720e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final String f721f;

    /* renamed from: g, reason: collision with root package name */
    public static l f722g;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f723a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f724b;

    /* renamed from: c, reason: collision with root package name */
    public Timer f725c;

    /* renamed from: d, reason: collision with root package name */
    public String f726d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public static final void c(K it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C.f3715e.b(N.APP_EVENTS, l.d(), "App index sent to FB!");
        }

        public final F b(String str, C2148a c2148a, String str2, String requestType) {
            Intrinsics.checkNotNullParameter(requestType, "requestType");
            if (str == null) {
                return null;
            }
            F.c cVar = F.f20890n;
            x xVar = x.f16233a;
            String format = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            F A7 = cVar.A(c2148a, format, null, null);
            Bundle u7 = A7.u();
            if (u7 == null) {
                u7 = new Bundle();
            }
            u7.putString("tree", str);
            u7.putString("app_version", G1.g.d());
            u7.putString("platform", "android");
            u7.putString("request_type", requestType);
            if (Intrinsics.a(requestType, "app_indexing")) {
                u7.putString("device_session_id", e.g());
            }
            A7.G(u7);
            A7.C(new F.b() { // from class: B1.k
                @Override // x1.F.b
                public final void a(K k7) {
                    l.a.c(k7);
                }
            });
            return A7;
        }
    }

    public static final class b implements Callable {

        /* renamed from: o, reason: collision with root package name */
        public final WeakReference f727o;

        public b(View rootView) {
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            this.f727o = new WeakReference(rootView);
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            View view = (View) this.f727o.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
            return encodeToString;
        }
    }

    public static final class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                Activity activity = (Activity) l.c(l.this).get();
                View e7 = G1.g.e(activity);
                if (activity != null && e7 != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    if (e.h()) {
                        if (z.b()) {
                            C1.e.a();
                            return;
                        }
                        FutureTask futureTask = new FutureTask(new b(e7));
                        l.e(l.this).post(futureTask);
                        String str = "";
                        try {
                            str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                        } catch (Exception e8) {
                            Log.e(l.d(), "Failed to take screenshot.", e8);
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("screenname", simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(C1.f.d(e7));
                            jSONObject.put("view", jSONArray);
                        } catch (JSONException unused) {
                            Log.e(l.d(), "Failed to create JSONObject");
                        }
                        String jSONObject2 = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "viewTree.toString()");
                        l.f(l.this, jSONObject2);
                    }
                }
            } catch (Exception e9) {
                Log.e(l.d(), "UI Component tree indexing failure!", e9);
            }
        }
    }

    static {
        String canonicalName = l.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f721f = canonicalName;
    }

    public l(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f724b = new WeakReference(activity);
        this.f726d = null;
        this.f723a = new Handler(Looper.getMainLooper());
        f722g = this;
    }

    public static final /* synthetic */ WeakReference c(l lVar) {
        if (T1.a.d(l.class)) {
            return null;
        }
        try {
            return lVar.f724b;
        } catch (Throwable th) {
            T1.a.b(th, l.class);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
        if (T1.a.d(l.class)) {
            return null;
        }
        try {
            return f721f;
        } catch (Throwable th) {
            T1.a.b(th, l.class);
            return null;
        }
    }

    public static final /* synthetic */ Handler e(l lVar) {
        if (T1.a.d(l.class)) {
            return null;
        }
        try {
            return lVar.f723a;
        } catch (Throwable th) {
            T1.a.b(th, l.class);
            return null;
        }
    }

    public static final /* synthetic */ void f(l lVar, String str) {
        if (T1.a.d(l.class)) {
            return;
        }
        try {
            lVar.j(str);
        } catch (Throwable th) {
            T1.a.b(th, l.class);
        }
    }

    public static final void i(l this$0, TimerTask indexingTask) {
        if (T1.a.d(l.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(indexingTask, "$indexingTask");
            try {
                Timer timer = this$0.f725c;
                if (timer != null) {
                    timer.cancel();
                }
                this$0.f726d = null;
                Timer timer2 = new Timer();
                timer2.scheduleAtFixedRate(indexingTask, 0L, 1000L);
                this$0.f725c = timer2;
            } catch (Exception e7) {
                Log.e(f721f, "Error scheduling indexing job", e7);
            }
        } catch (Throwable th) {
            T1.a.b(th, l.class);
        }
    }

    public static final void k(String tree, l this$0) {
        if (T1.a.d(l.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(tree, "$tree");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            String m02 = P.m0(tree);
            C2148a e7 = C2148a.f21014z.e();
            if (m02 == null || !Intrinsics.a(m02, this$0.f726d)) {
                this$0.g(f720e.b(tree, e7, C2146B.m(), "app_indexing"), m02);
            }
        } catch (Throwable th) {
            T1.a.b(th, l.class);
        }
    }

    public final void g(F f7, String str) {
        if (T1.a.d(this) || f7 == null) {
            return;
        }
        try {
            K k7 = f7.k();
            try {
                JSONObject c7 = k7.c();
                if (c7 == null) {
                    Log.e(f721f, Intrinsics.i("Error sending UI component tree to Facebook: ", k7.b()));
                    return;
                }
                if (Intrinsics.a("true", c7.optString("success"))) {
                    C.f3715e.b(N.APP_EVENTS, f721f, "Successfully send UI component tree to server");
                    this.f726d = str;
                }
                if (c7.has("is_app_indexing_enabled")) {
                    e.n(c7.getBoolean("is_app_indexing_enabled"));
                }
            } catch (JSONException e7) {
                Log.e(f721f, "Error decoding server response.", e7);
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
            final c cVar = new c();
            try {
                C2146B.t().execute(new Runnable() { // from class: B1.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.i(l.this, cVar);
                    }
                });
            } catch (RejectedExecutionException e7) {
                Log.e(f721f, "Error scheduling indexing job", e7);
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void j(final String str) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            C2146B.t().execute(new Runnable() { // from class: B1.j
                @Override // java.lang.Runnable
                public final void run() {
                    l.k(str, this);
                }
            });
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void l() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            if (((Activity) this.f724b.get()) == null) {
                return;
            }
            try {
                Timer timer = this.f725c;
                if (timer != null) {
                    timer.cancel();
                }
                this.f725c = null;
            } catch (Exception e7) {
                Log.e(f721f, "Error unscheduling indexing job", e7);
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }
}
