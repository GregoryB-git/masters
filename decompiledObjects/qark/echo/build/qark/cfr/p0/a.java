/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package p0;

import g0.M;
import g0.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class a {
    public static byte[] a(byte[] arrby) {
        if (M.a >= 27) {
            return arrby;
        }
        return M.r0(a.c(M.H(arrby)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] b(byte[] arrby) {
        byte[] arrby2;
        if (M.a >= 27) {
            return arrby;
        }
        try {
            JSONObject jSONObject = new JSONObject(M.H(arrby));
            arrby2 = new StringBuilder("{\"keys\":[");
            jSONObject = jSONObject.getJSONArray("keys");
            for (int i8 = 0; i8 < jSONObject.length(); ++i8) {
                if (i8 != 0) {
                    arrby2.append(",");
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject(i8);
                arrby2.append("{\"k\":\"");
                arrby2.append(a.d(jSONObject2.getString("k")));
                arrby2.append("\",\"kid\":\"");
                arrby2.append(a.d(jSONObject2.getString("kid")));
                arrby2.append("\",\"kty\":\"");
                arrby2.append(jSONObject2.getString("kty"));
                arrby2.append("\"}");
            }
            arrby2.append("]}");
            return M.r0(arrby2.toString());
        }
        catch (JSONException jSONException) {}
        arrby2 = new byte[]();
        arrby2.append("Failed to adjust response data: ");
        arrby2.append(M.H(arrby));
        o.d("ClearKeyUtil", arrby2.toString(), (Throwable)jSONException);
        return arrby;
    }

    public static String c(String string2) {
        return string2.replace('+', '-').replace('/', '_');
    }

    public static String d(String string2) {
        return string2.replace('-', '+').replace('_', '/');
    }
}

