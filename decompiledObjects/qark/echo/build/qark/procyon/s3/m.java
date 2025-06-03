// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s3;

import android.text.TextUtils;
import A2.q;
import android.content.Context;
import E2.n;

public final class m
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    
    public m(final String b, final String a, final String c, final String d, final String e, final String f, final String g) {
        A2.n.m(n.a(b) ^ true, "ApplicationId must be set.");
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static m a(final Context context) {
        final q q = new q(context);
        final String a = q.a("google_app_id");
        if (TextUtils.isEmpty((CharSequence)a)) {
            return null;
        }
        return new m(a, q.a("google_api_key"), q.a("firebase_database_url"), q.a("ga_trackingId"), q.a("gcm_defaultSenderId"), q.a("google_storage_bucket"), q.a("project_id"));
    }
    
    public String b() {
        return this.a;
    }
    
    public String c() {
        return this.b;
    }
    
    public String d() {
        return this.c;
    }
    
    public String e() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof m;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final m m = (m)o;
        boolean b3 = b2;
        if (A2.m.a(this.b, m.b)) {
            b3 = b2;
            if (A2.m.a(this.a, m.a)) {
                b3 = b2;
                if (A2.m.a(this.c, m.c)) {
                    b3 = b2;
                    if (A2.m.a(this.d, m.d)) {
                        b3 = b2;
                        if (A2.m.a(this.e, m.e)) {
                            b3 = b2;
                            if (A2.m.a(this.f, m.f)) {
                                b3 = b2;
                                if (A2.m.a(this.g, m.g)) {
                                    b3 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return b3;
    }
    
    public String f() {
        return this.e;
    }
    
    public String g() {
        return this.g;
    }
    
    public String h() {
        return this.f;
    }
    
    @Override
    public int hashCode() {
        return A2.m.b(this.b, this.a, this.c, this.d, this.e, this.f, this.g);
    }
    
    @Override
    public String toString() {
        return A2.m.c(this).a("applicationId", this.b).a("apiKey", this.a).a("databaseUrl", this.c).a("gcmSenderId", this.e).a("storageBucket", this.f).a("projectId", this.g).toString();
    }
    
    public static final class b
    {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        
        public m a() {
            return new m(this.b, this.a, this.c, this.d, this.e, this.f, this.g, null);
        }
        
        public b b(final String s) {
            this.a = A2.n.f(s, "ApiKey must be set.");
            return this;
        }
        
        public b c(final String s) {
            this.b = A2.n.f(s, "ApplicationId must be set.");
            return this;
        }
        
        public b d(final String c) {
            this.c = c;
            return this;
        }
        
        public b e(final String d) {
            this.d = d;
            return this;
        }
        
        public b f(final String e) {
            this.e = e;
            return this;
        }
        
        public b g(final String g) {
            this.g = g;
            return this;
        }
        
        public b h(final String f) {
            this.f = f;
            return this;
        }
    }
}
