/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package s3;

import A2.m;
import A2.q;
import E2.n;
import android.content.Context;
import android.text.TextUtils;

public final class m {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public m(String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        A2.n.m(n.a(string2) ^ true, "ApplicationId must be set.");
        this.b = string2;
        this.a = string3;
        this.c = string4;
        this.d = string5;
        this.e = string6;
        this.f = string7;
        this.g = string8;
    }

    public /* synthetic */ m(String string2, String string3, String string4, String string5, String string6, String string7, String string8,  a8) {
        this(string2, string3, string4, string5, string6, string7, string8);
    }

    public static m a(Context object) {
        String string2 = (object = new q((Context)object)).a("google_app_id");
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return null;
        }
        return new m(string2, object.a("google_api_key"), object.a("firebase_database_url"), object.a("ga_trackingId"), object.a("gcm_defaultSenderId"), object.a("google_storage_bucket"), object.a("project_id"));
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

    public boolean equals(Object object) {
        boolean bl = object instanceof m;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (m)object;
        bl = bl2;
        if (A2.m.a(this.b, object.b)) {
            bl = bl2;
            if (A2.m.a(this.a, object.a)) {
                bl = bl2;
                if (A2.m.a(this.c, object.c)) {
                    bl = bl2;
                    if (A2.m.a(this.d, object.d)) {
                        bl = bl2;
                        if (A2.m.a(this.e, object.e)) {
                            bl = bl2;
                            if (A2.m.a(this.f, object.f)) {
                                bl = bl2;
                                if (A2.m.a(this.g, object.g)) {
                                    bl = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bl;
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

    public int hashCode() {
        return A2.m.b(this.b, this.a, this.c, this.d, this.e, this.f, this.g);
    }

    public String toString() {
        return A2.m.c(this).a("applicationId", this.b).a("apiKey", this.a).a("databaseUrl", this.c).a("gcmSenderId", this.e).a("storageBucket", this.f).a("projectId", this.g).toString();
    }

    public static final class b {
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

        public b b(String string2) {
            this.a = A2.n.f(string2, "ApiKey must be set.");
            return this;
        }

        public b c(String string2) {
            this.b = A2.n.f(string2, "ApplicationId must be set.");
            return this;
        }

        public b d(String string2) {
            this.c = string2;
            return this;
        }

        public b e(String string2) {
            this.d = string2;
            return this;
        }

        public b f(String string2) {
            this.e = string2;
            return this;
        }

        public b g(String string2) {
            this.g = string2;
            return this;
        }

        public b h(String string2) {
            this.f = string2;
            return this;
        }
    }

}

