package Y1;

import O1.P;
import Y1.u;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import x1.C2146B;
import x1.C2148a;
import x1.C2156i;
import x1.C2162o;
import x1.EnumC2155h;
import x1.K;
import y1.C2237F;

/* loaded from: classes.dex */
public abstract class A implements Parcelable {

    /* renamed from: q, reason: collision with root package name */
    public static final a f7349q = new a(null);

    /* renamed from: o, reason: collision with root package name */
    public Map f7350o;

    /* renamed from: p, reason: collision with root package name */
    public u f7351p;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final C2148a a(Bundle bundle, EnumC2155h enumC2155h, String applicationId) {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            P p7 = P.f3756a;
            Date x7 = P.x(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date x8 = P.x(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            if (string2 == null || string2.length() == 0 || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null || string.length() == 0) {
                return null;
            }
            return new C2148a(string2, applicationId, string, stringArrayList, null, null, enumC2155h, x7, new Date(), x8, bundle.getString("graph_domain"));
        }

        public final C2148a b(Collection collection, Bundle bundle, EnumC2155h enumC2155h, String applicationId) {
            Collection collection2;
            ArrayList arrayList;
            ArrayList arrayList2;
            List V6;
            ArrayList d7;
            List V7;
            List V8;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            P p7 = P.f3756a;
            Date x7 = P.x(bundle, "expires_in", new Date());
            String string = bundle.getString("access_token");
            if (string == null) {
                return null;
            }
            Date x8 = P.x(bundle, "data_access_expiration_time", new Date(0L));
            String string2 = bundle.getString("granted_scopes");
            if (string2 == null || string2.length() <= 0) {
                collection2 = collection;
            } else {
                V8 = kotlin.text.s.V(string2, new String[]{","}, false, 0, 6, null);
                Object[] array = V8.toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) array;
                collection2 = W5.o.d(Arrays.copyOf(strArr, strArr.length));
            }
            String string3 = bundle.getString("denied_scopes");
            if (string3 == null || string3.length() <= 0) {
                arrayList = null;
            } else {
                V7 = kotlin.text.s.V(string3, new String[]{","}, false, 0, 6, null);
                Object[] array2 = V7.toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr2 = (String[]) array2;
                arrayList = W5.o.d(Arrays.copyOf(strArr2, strArr2.length));
            }
            String string4 = bundle.getString("expired_scopes");
            if (string4 == null || string4.length() <= 0) {
                arrayList2 = null;
            } else {
                V6 = kotlin.text.s.V(string4, new String[]{","}, false, 0, 6, null);
                Object[] array3 = V6.toArray(new String[0]);
                if (array3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr3 = (String[]) array3;
                d7 = W5.o.d(Arrays.copyOf(strArr3, strArr3.length));
                arrayList2 = d7;
            }
            if (P.c0(string)) {
                return null;
            }
            return new C2148a(string, applicationId, e(bundle.getString("signed_request")), collection2, arrayList, arrayList2, enumC2155h, x7, new Date(), x8, bundle.getString("graph_domain"));
        }

        public final C2156i c(Bundle bundle, String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string == null || string.length() == 0 || str == null || str.length() == 0) {
                return null;
            }
            try {
                return new C2156i(string, str);
            } catch (Exception e7) {
                throw new C2162o(e7.getMessage());
            }
        }

        public final C2156i d(Bundle bundle, String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String string = bundle.getString("id_token");
            if (string == null || string.length() == 0 || str == null || str.length() == 0) {
                return null;
            }
            try {
                return new C2156i(string, str);
            } catch (Exception e7) {
                throw new C2162o(e7.getMessage(), e7);
            }
        }

        public final String e(String str) {
            List V6;
            Object[] array;
            if (str == null || str.length() == 0) {
                throw new C2162o("Authorization response does not contain the signed_request");
            }
            try {
                V6 = kotlin.text.s.V(str, new String[]{"."}, false, 0, 6, null);
                array = V6.toArray(new String[0]);
            } catch (UnsupportedEncodingException | JSONException unused) {
            }
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            if (strArr.length == 2) {
                byte[] data = Base64.decode(strArr[1], 0);
                Intrinsics.checkNotNullExpressionValue(data, "data");
                String string = new JSONObject(new String(data, kotlin.text.b.f16240b)).getString("user_id");
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"user_id\")");
                return string;
            }
            throw new C2162o("Failed to retrieve user_id from signed_request");
        }
    }

    public A(u loginClient) {
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        m(loginClient);
    }

    public void a(String str, Object obj) {
        if (this.f7350o == null) {
            this.f7350o = new HashMap();
        }
        Map map = this.f7350o;
        if (map == null) {
            return;
        }
    }

    public String c(String authId) {
        Intrinsics.checkNotNullParameter(authId, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", authId);
            jSONObject.put("3_method", f());
            l(jSONObject);
        } catch (JSONException e7) {
            Log.w("LoginMethodHandler", Intrinsics.i("Error creating client state json: ", e7.getMessage()));
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "param.toString()");
        return jSONObject2;
    }

    public final u d() {
        u uVar = this.f7351p;
        if (uVar != null) {
            return uVar;
        }
        Intrinsics.n("loginClient");
        throw null;
    }

    public final Map e() {
        return this.f7350o;
    }

    public abstract String f();

    public String g() {
        return "fb" + C2146B.m() + "://authorize/";
    }

    public void h(String str) {
        u.e o7 = d().o();
        String a7 = o7 == null ? null : o7.a();
        if (a7 == null) {
            a7 = C2146B.m();
        }
        C2237F c2237f = new C2237F(d().i(), a7);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", a7);
        c2237f.h("fb_dialogs_web_login_dialog_complete", null, bundle);
    }

    public boolean i() {
        return false;
    }

    public boolean j(int i7, int i8, Intent intent) {
        return false;
    }

    public Bundle k(u.e request, Bundle values) {
        x1.F a7;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(values, "values");
        String string = values.getString("code");
        if (P.c0(string)) {
            throw new C2162o("No code param found from the request");
        }
        if (string == null) {
            a7 = null;
        } else {
            E e7 = E.f7361a;
            String g7 = g();
            String f7 = request.f();
            if (f7 == null) {
                f7 = "";
            }
            a7 = E.a(string, g7, f7);
        }
        if (a7 == null) {
            throw new C2162o("Failed to create code exchange request");
        }
        K k7 = a7.k();
        x1.r b7 = k7.b();
        if (b7 != null) {
            throw new x1.D(b7, b7.c());
        }
        try {
            JSONObject c7 = k7.c();
            String string2 = c7 != null ? c7.getString("access_token") : null;
            if (c7 == null || P.c0(string2)) {
                throw new C2162o("No access token found from result");
            }
            values.putString("access_token", string2);
            if (c7.has("id_token")) {
                values.putString("id_token", c7.getString("id_token"));
            }
            return values;
        } catch (JSONException e8) {
            throw new C2162o(Intrinsics.i("Fail to process code exchange response: ", e8.getMessage()));
        }
    }

    public void l(JSONObject param) {
        Intrinsics.checkNotNullParameter(param, "param");
    }

    public final void m(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<set-?>");
        this.f7351p = uVar;
    }

    public boolean n() {
        return false;
    }

    public abstract int o(u.e eVar);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        P p7 = P.f3756a;
        P.H0(dest, this.f7350o);
    }

    public A(Parcel source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Map t02 = P.t0(source);
        this.f7350o = t02 == null ? null : W5.F.o(t02);
    }

    public void b() {
    }
}
