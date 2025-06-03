package I1;

import I1.e;
import O1.C0458v;
import O1.P;
import O1.r;
import W5.w;
import android.os.Bundle;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import y1.C2248e;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f2495a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final String f2496b = e.class.getSimpleName();

    public static final Bundle a(e.a eventType, String applicationId, List appEvents) {
        if (T1.a.d(d.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", eventType.toString());
            bundle.putString("app_id", applicationId);
            if (e.a.CUSTOM_APP_EVENTS == eventType) {
                JSONArray b7 = f2495a.b(appEvents, applicationId);
                if (b7.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", b7.toString());
            }
            return bundle;
        } catch (Throwable th) {
            T1.a.b(th, d.class);
            return null;
        }
    }

    public final JSONArray b(List list, String str) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<C2248e> I6 = w.I(list);
            D1.a.d(I6);
            boolean c7 = c(str);
            for (C2248e c2248e : I6) {
                if (c2248e.g()) {
                    if (!(!c2248e.h())) {
                        if (c2248e.h() && c7) {
                        }
                    }
                    jSONArray.put(c2248e.e());
                } else {
                    P p7 = P.f3756a;
                    P.j0(f2496b, Intrinsics.i("Event with invalid checksum: ", c2248e));
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final boolean c(String str) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            r q7 = C0458v.q(str, false);
            if (q7 != null) {
                return q7.n();
            }
            return false;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }
}
