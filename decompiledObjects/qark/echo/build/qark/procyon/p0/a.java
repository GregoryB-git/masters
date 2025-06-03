// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p0;

import org.json.JSONArray;
import org.json.JSONException;
import g0.o;
import org.json.JSONObject;
import g0.M;

public abstract class a
{
    public static byte[] a(final byte[] array) {
        if (M.a >= 27) {
            return array;
        }
        return M.r0(c(M.H(array)));
    }
    
    public static byte[] b(final byte[] array) {
        if (M.a >= 27) {
            return array;
        }
        while (true) {
            try {
                final JSONObject jsonObject = new JSONObject(M.H(array));
                final StringBuilder sb = new StringBuilder("{\"keys\":[");
                final JSONArray jsonArray = jsonObject.getJSONArray("keys");
                for (int i = 0; i < jsonArray.length(); ++i) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    final JSONObject jsonObject2 = jsonArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(d(jsonObject2.getString("k")));
                    sb.append("\",\"kid\":\"");
                    sb.append(d(jsonObject2.getString("kid")));
                    sb.append("\",\"kty\":\"");
                    sb.append(jsonObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                return M.r0(sb.toString());
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to adjust response data: ");
                sb2.append(M.H(array));
                final JSONException ex;
                o.d("ClearKeyUtil", sb2.toString(), (Throwable)ex);
                return array;
            }
            catch (JSONException ex) {
                continue;
            }
            break;
        }
    }
    
    public static String c(final String s) {
        return s.replace('+', '-').replace('/', '_');
    }
    
    public static String d(final String s) {
        return s.replace('-', '+').replace('_', '/');
    }
}
