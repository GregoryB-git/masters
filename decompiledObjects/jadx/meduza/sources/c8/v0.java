package c8;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f2529a;

    static {
        HashMap hashMap = new HashMap();
        f2529a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        hashMap.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        hashMap.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        hashMap.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        hashMap.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString(Constants.MESSAGE);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                HashMap hashMap = f2529a;
                if (hashMap.containsKey(string)) {
                    return p.a(((String) hashMap.get(string)) + ":" + string2);
                }
            }
            return p.a("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e10) {
            return p.a("WEB_INTERNAL_ERROR:" + str + "[ " + e10.getLocalizedMessage() + " ]");
        }
    }
}
