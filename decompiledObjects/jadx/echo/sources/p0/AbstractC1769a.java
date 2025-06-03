package p0;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1769a {
    public static byte[] a(byte[] bArr) {
        return g0.M.f14261a >= 27 ? bArr : g0.M.r0(c(g0.M.H(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (g0.M.f14261a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(g0.M.H(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                if (i7 != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
                sb.append("{\"k\":\"");
                sb.append(d(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(d(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return g0.M.r0(sb.toString());
        } catch (JSONException e7) {
            g0.o.d("ClearKeyUtil", "Failed to adjust response data: " + g0.M.H(bArr), e7);
            return bArr;
        }
    }

    public static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    public static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
