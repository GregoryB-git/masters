package c8;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzagw;
import com.google.android.gms.internal.p002firebaseauthapi.zzzp;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public Context f2495a;

    /* renamed from: b, reason: collision with root package name */
    public String f2496b;

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f2497c;

    /* renamed from: d, reason: collision with root package name */
    public p6.a f2498d;

    public n0(Context context, String str) {
        m6.j.i(context);
        m6.j.e(str);
        this.f2496b = str;
        this.f2495a = context.getApplicationContext();
        this.f2497c = this.f2495a.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", this.f2496b), 0);
        this.f2498d = new p6.a("StorageHelpers", new String[0]);
    }

    public final i a(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        k a10;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z10 = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(e.D(jSONArray3.getString(i10)));
            }
            i iVar = new i(u7.f.f(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                iVar.L(zzagw.zzb(string));
            }
            if (!z10) {
                iVar.f2459p = Boolean.FALSE;
            }
            iVar.f2458o = str;
            if (jSONObject.has("userMetadata") && (a10 = k.a(jSONObject.getJSONObject("userMetadata"))) != null) {
                iVar.f2460q = a10;
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i11));
                    String optString = jSONObject2.optString("factorIdKey");
                    arrayList2.add(Constants.SIGN_IN_METHOD_PHONE.equals(optString) ? b8.h0.G(jSONObject2) : Objects.equals(optString, "totp") ? b8.l0.G(jSONObject2) : null);
                }
                iVar.P(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                    arrayList3.add(b8.t0.D(new JSONObject(jSONArray.getString(i12))));
                }
                iVar.N(arrayList3);
            }
            return iVar;
        } catch (zzzp | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException e10) {
            Log.wtf(this.f2498d.f13015a, e10);
            return null;
        }
    }
}
