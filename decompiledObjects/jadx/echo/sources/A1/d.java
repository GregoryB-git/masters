package A1;

import O1.C;
import O1.P;
import W5.w;
import android.content.SharedPreferences;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.C2146B;
import x1.F;
import x1.K;
import x1.L;
import x1.N;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f239a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final String f240b = d.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f241c;

    public static final void b() {
        String b7;
        try {
            F f7 = new F(null, Intrinsics.i(C2146B.m(), "/cloudbridge_settings"), null, L.GET, new F.b() { // from class: A1.c
                @Override // x1.F.b
                public final void a(K k7) {
                    d.c(k7);
                }
            }, null, 32, null);
            C.a aVar = C.f3715e;
            N n7 = N.APP_EVENTS;
            String str = f240b;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            aVar.c(n7, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", f7);
            f7.l();
        } catch (JSONException e7) {
            C.a aVar2 = C.f3715e;
            N n8 = N.APP_EVENTS;
            String str2 = f240b;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            b7 = V5.b.b(e7);
            aVar2.c(n8, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", b7);
        }
    }

    public static final void c(K response) {
        Intrinsics.checkNotNullParameter(response, "response");
        f239a.d(response);
    }

    public static final Map e() {
        boolean F6;
        boolean F7;
        boolean F8;
        if (T1.a.d(d.class)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = C2146B.l().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
            if (sharedPreferences == null) {
                return null;
            }
            o oVar = o.DATASETID;
            String string = sharedPreferences.getString(oVar.e(), null);
            o oVar2 = o.URL;
            String string2 = sharedPreferences.getString(oVar2.e(), null);
            o oVar3 = o.ACCESSKEY;
            String string3 = sharedPreferences.getString(oVar3.e(), null);
            if (string != null) {
                F6 = s.F(string);
                if (!F6 && string2 != null) {
                    F7 = s.F(string2);
                    if (!F7 && string3 != null) {
                        F8 = s.F(string3);
                        if (!F8) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put(oVar2.e(), string2);
                            linkedHashMap.put(oVar.e(), string);
                            linkedHashMap.put(oVar3.e(), string3);
                            C.f3715e.c(N.APP_EVENTS, f240b.toString(), " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", string, string2, string3);
                            return linkedHashMap;
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            T1.a.b(th, d.class);
            return null;
        }
    }

    public final void d(K response) {
        String b7;
        String b8;
        Object s7;
        String b9;
        boolean z7 = false;
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.b() != null) {
            C.a aVar = C.f3715e;
            N n7 = N.APP_EVENTS;
            String str = f240b;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            aVar.c(n7, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", response.b().toString(), String.valueOf(response.b().e()));
            Map e7 = e();
            if (e7 != null) {
                URL url = new URL(String.valueOf(e7.get(o.URL.e())));
                g gVar = g.f265a;
                g.d(String.valueOf(e7.get(o.DATASETID.e())), url.getProtocol() + "://" + ((Object) url.getHost()), String.valueOf(e7.get(o.ACCESSKEY.e())));
                f241c = true;
                return;
            }
            return;
        }
        C.a aVar2 = C.f3715e;
        N n8 = N.APP_EVENTS;
        String TAG = f240b;
        if (TAG == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        aVar2.c(n8, TAG, " \n\nGraph Response Received: \n================\n%s\n\n ", response);
        JSONObject c7 = response.c();
        try {
            P p7 = P.f3756a;
            Object obj = c7 == null ? null : c7.get("data");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            s7 = w.s(P.m((JSONArray) obj));
            Map n9 = P.n(new JSONObject((String) s7));
            String str2 = (String) n9.get(o.URL.e());
            String str3 = (String) n9.get(o.DATASETID.e());
            String str4 = (String) n9.get(o.ACCESSKEY.e());
            if (str2 == null || str3 == null || str4 == null) {
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                aVar2.b(n8, TAG, "CloudBridge Settings API response doesn't have valid data");
                return;
            }
            try {
                g.d(str3, str2, str4);
                g(n9);
                o oVar = o.ENABLED;
                if (n9.get(oVar.e()) != null) {
                    Object obj2 = n9.get(oVar.e());
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    z7 = ((Boolean) obj2).booleanValue();
                }
                f241c = z7;
            } catch (MalformedURLException e8) {
                C.a aVar3 = C.f3715e;
                N n10 = N.APP_EVENTS;
                String TAG2 = f240b;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                b9 = V5.b.b(e8);
                aVar3.c(n10, TAG2, "CloudBridge Settings API response doesn't have valid url\n %s ", b9);
            }
        } catch (NullPointerException e9) {
            C.a aVar4 = C.f3715e;
            N n11 = N.APP_EVENTS;
            String TAG3 = f240b;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            b8 = V5.b.b(e9);
            aVar4.c(n11, TAG3, "CloudBridge Settings API response is not a valid json: \n%s ", b8);
        } catch (JSONException e10) {
            C.a aVar5 = C.f3715e;
            N n12 = N.APP_EVENTS;
            String TAG4 = f240b;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            b7 = V5.b.b(e10);
            aVar5.c(n12, TAG4, "CloudBridge Settings API response is not a valid json: \n%s ", b7);
        }
    }

    public final boolean f() {
        return f241c;
    }

    public final void g(Map map) {
        SharedPreferences sharedPreferences = C2146B.l().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        if (map == null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            edit.apply();
            return;
        }
        o oVar = o.DATASETID;
        Object obj = map.get(oVar.e());
        o oVar2 = o.URL;
        Object obj2 = map.get(oVar2.e());
        o oVar3 = o.ACCESSKEY;
        Object obj3 = map.get(oVar3.e());
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.putString(oVar.e(), obj.toString());
        edit2.putString(oVar2.e(), obj2.toString());
        edit2.putString(oVar3.e(), obj3.toString());
        edit2.apply();
        C.f3715e.c(N.APP_EVENTS, f240b.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
    }
}
