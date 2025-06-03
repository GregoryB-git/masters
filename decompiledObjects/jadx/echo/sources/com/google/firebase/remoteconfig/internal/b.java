package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: g, reason: collision with root package name */
    public static final Date f11893g = new Date(0);

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f11894a;

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f11895b;

    /* renamed from: c, reason: collision with root package name */
    public Date f11896c;

    /* renamed from: d, reason: collision with root package name */
    public JSONArray f11897d;

    /* renamed from: e, reason: collision with root package name */
    public JSONObject f11898e;

    /* renamed from: f, reason: collision with root package name */
    public long f11899f;

    /* renamed from: com.google.firebase.remoteconfig.internal.b$b, reason: collision with other inner class name */
    public static class C0178b {

        /* renamed from: a, reason: collision with root package name */
        public JSONObject f11900a;

        /* renamed from: b, reason: collision with root package name */
        public Date f11901b;

        /* renamed from: c, reason: collision with root package name */
        public JSONArray f11902c;

        /* renamed from: d, reason: collision with root package name */
        public JSONObject f11903d;

        /* renamed from: e, reason: collision with root package name */
        public long f11904e;

        public C0178b() {
            this.f11900a = new JSONObject();
            this.f11901b = b.f11893g;
            this.f11902c = new JSONArray();
            this.f11903d = new JSONObject();
            this.f11904e = 0L;
        }

        public b a() {
            return new b(this.f11900a, this.f11901b, this.f11902c, this.f11903d, this.f11904e);
        }

        public C0178b b(Map map) {
            this.f11900a = new JSONObject(map);
            return this;
        }

        public C0178b c(JSONObject jSONObject) {
            try {
                this.f11900a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public C0178b d(JSONArray jSONArray) {
            try {
                this.f11902c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public C0178b e(Date date) {
            this.f11901b = date;
            return this;
        }

        public C0178b f(JSONObject jSONObject) {
            try {
                this.f11903d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public C0178b g(long j7) {
            this.f11904e = j7;
            return this;
        }
    }

    public b(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j7) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j7);
        this.f11895b = jSONObject;
        this.f11896c = date;
        this.f11897d = jSONArray;
        this.f11898e = jSONObject2;
        this.f11899f = j7;
        this.f11894a = jSONObject3;
    }

    public static b b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new b(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject, jSONObject.optLong("template_version_number_key"));
    }

    public static b c(JSONObject jSONObject) {
        return b(new JSONObject(jSONObject.toString()));
    }

    public static C0178b j() {
        return new C0178b();
    }

    public JSONArray d() {
        return this.f11897d;
    }

    public Set e(b bVar) {
        JSONObject f7 = c(bVar.f11894a).f();
        HashSet hashSet = new HashSet();
        Iterator<String> keys = f().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (bVar.f().has(next) && f().get(next).equals(bVar.f().get(next)) && ((!h().has(next) || bVar.h().has(next)) && ((h().has(next) || !bVar.h().has(next)) && !(h().has(next) && bVar.h().has(next) && !h().getJSONObject(next).toString().equals(bVar.h().getJSONObject(next).toString()))))) {
                f7.remove(next);
            } else {
                hashSet.add(next);
            }
        }
        Iterator<String> keys2 = f7.keys();
        while (keys2.hasNext()) {
            hashSet.add(keys2.next());
        }
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f11894a.toString().equals(((b) obj).toString());
        }
        return false;
    }

    public JSONObject f() {
        return this.f11895b;
    }

    public Date g() {
        return this.f11896c;
    }

    public JSONObject h() {
        return this.f11898e;
    }

    public int hashCode() {
        return this.f11894a.hashCode();
    }

    public long i() {
        return this.f11899f;
    }

    public String toString() {
        return this.f11894a.toString();
    }
}
