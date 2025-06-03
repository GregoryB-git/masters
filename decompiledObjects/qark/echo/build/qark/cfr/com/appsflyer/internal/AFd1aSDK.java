/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFb1fSDK;
import com.appsflyer.internal.AFe1sSDK;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFd1aSDK {
    public final AFe1sSDK AFInAppEventParameterName;
    public final AFb1fSDK.AFa1ySDK values;

    public AFd1aSDK() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AFd1aSDK(JSONObject jSONObject) {
        Object object;
        AFe1sSDK aFe1sSDK;
        block6 : {
            boolean bl = jSONObject.has("exc_mngr");
            aFe1sSDK = null;
            if (bl) {
                try {
                    object = jSONObject.getJSONArray("exc_mngr").optJSONObject(0).optJSONObject("data");
                    Objects.requireNonNull((Object)object);
                    object = object.optJSONObject("v1");
                    object = new AFb1fSDK.AFa1ySDK(object.getString("sdk_ver"), object.optInt("min", -1), object.optInt("expire", -1), object.optLong("ttl", -1L));
                    break block6;
                }
                catch (NullPointerException | JSONException nullPointerException) {}
            }
            object = null;
        }
        AFe1sSDK aFe1sSDK2 = aFe1sSDK;
        if (jSONObject.has("meta_data")) {
            try {
                jSONObject = jSONObject.getJSONArray("meta_data").optJSONObject(0).optJSONObject("data");
                Objects.requireNonNull((Object)jSONObject);
                aFe1sSDK2 = new AFe1sSDK(jSONObject.optJSONObject("v1").optDouble("send_rate", 1.0));
            }
            catch (NullPointerException | JSONException jSONException) {
                aFe1sSDK2 = aFe1sSDK;
            }
        }
        this.values = object;
        this.AFInAppEventParameterName = aFe1sSDK2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (AFd1aSDK.class != object.getClass()) {
                return false;
            }
            object = (AFd1aSDK)object;
            Object object2 = this.values;
            if (object2 != null && object2.equals((Object)object.values) && (object2 = this.AFInAppEventParameterName) != null && object2.equals((Object)object.AFInAppEventParameterName)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        AFb1fSDK.AFa1ySDK aFa1ySDK = this.values;
        if (aFa1ySDK != null) {
            return aFa1ySDK.hashCode();
        }
        return 0;
    }
}

