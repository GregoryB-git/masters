// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.remoteconfig.internal;

import org.json.JSONException;
import java.util.Map;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Date;

public class b
{
    public static final Date g;
    public JSONObject a;
    public JSONObject b;
    public Date c;
    public JSONArray d;
    public JSONObject e;
    public long f;
    
    static {
        g = new Date(0L);
    }
    
    public b(final JSONObject b, final Date c, final JSONArray d, final JSONObject e, final long f) {
        final JSONObject a = new JSONObject();
        a.put("configs_key", (Object)b);
        a.put("fetch_time_key", c.getTime());
        a.put("abt_experiments_key", (Object)d);
        a.put("personalization_metadata_key", (Object)e);
        a.put("template_version_number_key", f);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.a = a;
    }
    
    public static /* synthetic */ Date a() {
        return b.g;
    }
    
    public static b b(final JSONObject jsonObject) {
        JSONObject optJSONObject;
        if ((optJSONObject = jsonObject.optJSONObject("personalization_metadata_key")) == null) {
            optJSONObject = new JSONObject();
        }
        return new b(jsonObject.getJSONObject("configs_key"), new Date(jsonObject.getLong("fetch_time_key")), jsonObject.getJSONArray("abt_experiments_key"), optJSONObject, jsonObject.optLong("template_version_number_key"));
    }
    
    public static b c(final JSONObject jsonObject) {
        return b(new JSONObject(jsonObject.toString()));
    }
    
    public static b j() {
        return new b(null);
    }
    
    public JSONArray d() {
        return this.d;
    }
    
    public Set e(final b b) {
        final JSONObject f = c(b.a).f();
        final HashSet<String> set = new HashSet<String>();
        final Iterator keys = this.f().keys();
        while (keys.hasNext()) {
            final String s = keys.next();
            if (b.f().has(s)) {
                if (this.f().get(s).equals(b.f().get(s))) {
                    if (!this.h().has(s) || b.h().has(s)) {
                        if (this.h().has(s) || !b.h().has(s)) {
                            if (!this.h().has(s) || !b.h().has(s) || this.h().getJSONObject(s).toString().equals(b.h().getJSONObject(s).toString())) {
                                f.remove(s);
                                continue;
                            }
                        }
                    }
                }
            }
            set.add(s);
        }
        final Iterator keys2 = f.keys();
        while (keys2.hasNext()) {
            set.add(keys2.next());
        }
        return set;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof b && this.a.toString().equals(((b)o).toString()));
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
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    public long i() {
        return this.f;
    }
    
    @Override
    public String toString() {
        return this.a.toString();
    }
    
    public static class b
    {
        public JSONObject a;
        public Date b;
        public JSONArray c;
        public JSONObject d;
        public long e;
        
        public b() {
            this.a = new JSONObject();
            this.b = com.google.firebase.remoteconfig.internal.b.a();
            this.c = new JSONArray();
            this.d = new JSONObject();
            this.e = 0L;
        }
        
        public com.google.firebase.remoteconfig.internal.b a() {
            return new com.google.firebase.remoteconfig.internal.b(this.a, this.b, this.c, this.d, this.e, null);
        }
        
        public b b(final Map map) {
            this.a = new JSONObject(map);
            return this;
        }
        
        public b c(final JSONObject jsonObject) {
            try {
                this.a = new JSONObject(jsonObject.toString());
                return this;
            }
            catch (JSONException ex) {
                return this;
            }
        }
        
        public b d(final JSONArray jsonArray) {
            try {
                this.c = new JSONArray(jsonArray.toString());
                return this;
            }
            catch (JSONException ex) {
                return this;
            }
        }
        
        public b e(final Date b) {
            this.b = b;
            return this;
        }
        
        public b f(final JSONObject jsonObject) {
            try {
                this.d = new JSONObject(jsonObject.toString());
                return this;
            }
            catch (JSONException ex) {
                return this;
            }
        }
        
        public b g(final long e) {
            this.e = e;
            return this;
        }
    }
}
