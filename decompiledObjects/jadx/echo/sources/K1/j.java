package K1;

import H1.f;
import K1.j;
import O1.P;
import android.os.Bundle;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.r;
import org.json.JSONException;
import org.json.JSONObject;
import x1.C2146B;
import x1.F;
import y1.C2237F;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public static final a f3177s = new a(null);

    /* renamed from: t, reason: collision with root package name */
    public static final Set f3178t = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final View.OnClickListener f3179o;

    /* renamed from: p, reason: collision with root package name */
    public final WeakReference f3180p;

    /* renamed from: q, reason: collision with root package name */
    public final WeakReference f3181q;

    /* renamed from: r, reason: collision with root package name */
    public final String f3182r;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public static final void g(String queriedEvent, String buttonText) {
            Intrinsics.checkNotNullParameter(queriedEvent, "$queriedEvent");
            Intrinsics.checkNotNullParameter(buttonText, "$buttonText");
            j.f3177s.e(queriedEvent, buttonText, new float[0]);
        }

        public final void d(View hostView, View rootView, String activityName) {
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            int hashCode = hostView.hashCode();
            if (j.b().contains(Integer.valueOf(hashCode))) {
                return;
            }
            C1.f fVar = C1.f.f913a;
            C1.f.r(hostView, new j(hostView, rootView, activityName, null));
            j.b().add(Integer.valueOf(hashCode));
        }

        public final void e(String str, String str2, float[] fArr) {
            if (e.f(str)) {
                new C2237F(C2146B.l()).e(str, str2);
            } else if (e.e(str)) {
                h(str, str2, fArr);
            }
        }

        public final boolean f(String str, final String str2) {
            final String d7 = b.d(str);
            if (d7 == null) {
                return false;
            }
            if (Intrinsics.a(d7, "other")) {
                return true;
            }
            P p7 = P.f3756a;
            P.B0(new Runnable() { // from class: K1.i
                @Override // java.lang.Runnable
                public final void run() {
                    j.a.g(d7, str2);
                }
            });
            return true;
        }

        public final void h(String str, String str2, float[] fArr) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                int length = fArr.length;
                int i7 = 0;
                while (i7 < length) {
                    float f7 = fArr[i7];
                    i7++;
                    sb.append(f7);
                    sb.append(",");
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", str2);
                bundle.putString("metadata", jSONObject.toString());
                F.c cVar = F.f20890n;
                x xVar = x.f16233a;
                String format = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{C2146B.m()}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                F A7 = cVar.A(null, format, null, null);
                A7.G(bundle);
                A7.k();
            } catch (JSONException unused) {
            }
        }
    }

    public j(View view, View view2, String str) {
        String q7;
        this.f3179o = C1.f.g(view);
        this.f3180p = new WeakReference(view2);
        this.f3181q = new WeakReference(view);
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
        q7 = r.q(lowerCase, "activity", "", false, 4, null);
        this.f3182r = q7;
    }

    public static final /* synthetic */ Set b() {
        if (T1.a.d(j.class)) {
            return null;
        }
        try {
            return f3178t;
        } catch (Throwable th) {
            T1.a.b(th, j.class);
            return null;
        }
    }

    public static final void d(JSONObject viewData, String buttonText, j this$0, String pathID) {
        if (T1.a.d(j.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(viewData, "$viewData");
            Intrinsics.checkNotNullParameter(buttonText, "$buttonText");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(pathID, "$pathID");
            try {
                P p7 = P.f3756a;
                String u7 = P.u(C2146B.l());
                if (u7 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = u7.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                float[] a7 = K1.a.a(viewData, lowerCase);
                String c7 = K1.a.c(buttonText, this$0.f3182r, lowerCase);
                if (a7 == null) {
                    return;
                }
                H1.f fVar = H1.f.f2181a;
                String[] q7 = H1.f.q(f.a.MTML_APP_EVENT_PREDICTION, new float[][]{a7}, new String[]{c7});
                if (q7 == null) {
                    return;
                }
                String str = q7[0];
                b.a(pathID, str);
                if (Intrinsics.a(str, "other")) {
                    return;
                }
                f3177s.e(str, buttonText, a7);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            T1.a.b(th, j.class);
        }
    }

    public final void c(final String str, final String str2, final JSONObject jSONObject) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            P p7 = P.f3756a;
            P.B0(new Runnable() { // from class: K1.h
                @Override // java.lang.Runnable
                public final void run() {
                    j.d(jSONObject, str2, this, str);
                }
            });
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void e() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            View view = (View) this.f3180p.get();
            View view2 = (View) this.f3181q.get();
            if (view == null || view2 == null) {
                return;
            }
            try {
                String d7 = c.d(view2);
                String b7 = b.b(view2, d7);
                if (b7 == null || f3177s.f(b7, d7)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("view", c.b(view, view2));
                jSONObject.put("screenname", this.f3182r);
                c(b7, d7, jSONObject);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            View.OnClickListener onClickListener = this.f3179o;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            e();
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public /* synthetic */ j(View view, View view2, String str, kotlin.jvm.internal.g gVar) {
        this(view, view2, str);
    }
}
