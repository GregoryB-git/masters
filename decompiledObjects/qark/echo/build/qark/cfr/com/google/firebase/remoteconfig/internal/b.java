/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Date
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b {
    public static final Date g = new Date(0L);
    public JSONObject a;
    public JSONObject b;
    public Date c;
    public JSONArray d;
    public JSONObject e;
    public long f;

    public b(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long l8) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", (Object)jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", (Object)jSONArray);
        jSONObject3.put("personalization_metadata_key", (Object)jSONObject2);
        jSONObject3.put("template_version_number_key", l8);
        this.b = jSONObject;
        this.c = date;
        this.d = jSONArray;
        this.e = jSONObject2;
        this.f = l8;
        this.a = jSONObject3;
    }

    public /* synthetic */ b(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long l8,  a8) {
        this(jSONObject, date, jSONArray, jSONObject2, l8);
    }

    public static /* synthetic */ Date a() {
        return g;
    }

    public static b b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3 = jSONObject2 = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObject2 == null) {
            jSONObject3 = new JSONObject();
        }
        return new b(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject3, jSONObject.optLong("template_version_number_key"));
    }

    public static b c(JSONObject jSONObject) {
        return b.b(new JSONObject(jSONObject.toString()));
    }

    public static b j() {
        return new b(null);
    }

    public JSONArray d() {
        return this.d;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Set e(b b8) {
        JSONObject jSONObject = b.c(b8.a).f();
        HashSet hashSet = new HashSet();
        Iterator iterator = this.f().keys();
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            if (!b8.f().has(string2) || !this.f().get(string2).equals(b8.f().get(string2)) || this.h().has(string2) && !b8.h().has(string2) || !this.h().has(string2) && b8.h().has(string2) || this.h().has(string2) && b8.h().has(string2) && !this.h().getJSONObject(string2).toString().equals((Object)b8.h().getJSONObject(string2).toString())) {
                hashSet.add((Object)string2);
                continue;
            }
            jSONObject.remove(string2);
        }
        b8 = jSONObject.keys();
        while (b8.hasNext()) {
            hashSet.add((Object)((String)b8.next()));
        }
        return hashSet;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        object = (b)object;
        return this.a.toString().equals((Object)object.toString());
    }

    public JSONObject f() {
        return this.b;
    }

    public Date g() {
        return this.c;
    }

    public JSONObject h() {
        return this.e;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public long i() {
        return this.f;
    }

    public String toString() {
        return this.a.toString();
    }

    public static class b {
        public JSONObject a = new JSONObject();
        public Date b = b.a();
        public JSONArray c = new JSONArray();
        public JSONObject d = new JSONObject();
        public long e = 0L;

        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public b a() {
            return new b(this.a, this.b, this.c, this.d, this.e, null);
        }

        public b b(Map map) {
            this.a = new JSONObject(map);
            return this;
        }

        public b c(JSONObject jSONObject) {
            try {
                this.a = new JSONObject(jSONObject.toString());
                return this;
            }
            catch (JSONException jSONException) {
                return this;
            }
        }

        public b d(JSONArray jSONArray) {
            try {
                this.c = new JSONArray(jSONArray.toString());
                return this;
            }
            catch (JSONException jSONException) {
                return this;
            }
        }

        public b e(Date date) {
            this.b = date;
            return this;
        }

        public b f(JSONObject jSONObject) {
            try {
                this.d = new JSONObject(jSONObject.toString());
                return this;
            }
            catch (JSONException jSONException) {
                return this;
            }
        }

        public b g(long l8) {
            this.e = l8;
            return this;
        }
    }

}

