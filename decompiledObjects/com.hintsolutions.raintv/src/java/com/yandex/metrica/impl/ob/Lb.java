/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

public final class lb {
    private final String a;
    private final int b;
    private final boolean c;

    public lb(String string, int n4, boolean bl) {
        this.a = string;
        this.b = n4;
        this.c = bl;
    }

    public lb(@NonNull JSONObject jSONObject) throws JSONException {
        this.a = jSONObject.getString("name");
        this.c = jSONObject.getBoolean("required");
        this.b = jSONObject.optInt("version", -1);
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject().put("name", (Object)this.a).put("required", this.c);
        int n4 = this.b;
        if (n4 != -1) {
            jSONObject.put("version", n4);
        }
        return jSONObject;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && lb.class == object.getClass()) {
            Object object2 = (lb)object;
            if (this.b != ((lb)object2).b) {
                return false;
            }
            if (this.c != ((lb)object2).c) {
                return false;
            }
            object = this.a;
            object2 = ((lb)object2).a;
            if (object != null) {
                bl = object.equals(object2);
            } else if (object2 != null) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public int hashCode() {
        String string = this.a;
        int n4 = string != null ? string.hashCode() : 0;
        return (n4 * 31 + this.b) * 31 + this.c;
    }
}

