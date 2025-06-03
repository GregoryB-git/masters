package K1;

import O1.P;
import W5.F;
import android.content.SharedPreferences;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.C2146B;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static SharedPreferences f3157c;

    /* renamed from: a, reason: collision with root package name */
    public static final b f3155a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3156b = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f3158d = new AtomicBoolean(false);

    public static final void a(String pathID, String predictedEvent) {
        Map m7;
        if (T1.a.d(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(pathID, "pathID");
            Intrinsics.checkNotNullParameter(predictedEvent, "predictedEvent");
            if (!f3158d.get()) {
                f3155a.c();
            }
            Map map = f3156b;
            map.put(pathID, predictedEvent);
            SharedPreferences sharedPreferences = f3157c;
            if (sharedPreferences == null) {
                Intrinsics.n("shardPreferences");
                throw null;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            P p7 = P.f3756a;
            m7 = F.m(map);
            edit.putString("SUGGESTED_EVENTS_HISTORY", P.l0(m7)).apply();
        } catch (Throwable th) {
            T1.a.b(th, b.class);
        }
    }

    public static final String b(View view, String text) {
        if (T1.a.d(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(text, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", text);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = C1.f.j(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            P p7 = P.f3756a;
            return P.F0(jSONObject.toString());
        } catch (Throwable th) {
            T1.a.b(th, b.class);
            return null;
        }
    }

    public static final String d(String pathID) {
        if (T1.a.d(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(pathID, "pathID");
            Map map = f3156b;
            if (map.containsKey(pathID)) {
                return (String) map.get(pathID);
            }
            return null;
        } catch (Throwable th) {
            T1.a.b(th, b.class);
            return null;
        }
    }

    public final void c() {
        String str = "";
        if (T1.a.d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f3158d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = C2146B.l().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
            f3157c = sharedPreferences;
            Map map = f3156b;
            P p7 = P.f3756a;
            SharedPreferences sharedPreferences2 = f3157c;
            if (sharedPreferences2 == null) {
                Intrinsics.n("shardPreferences");
                throw null;
            }
            String string = sharedPreferences2.getString("SUGGESTED_EVENTS_HISTORY", "");
            if (string != null) {
                str = string;
            }
            map.putAll(P.h0(str));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }
}
