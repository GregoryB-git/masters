package s3;

import A2.AbstractC0327m;
import A2.AbstractC0328n;
import A2.C0331q;
import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f19252a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19253b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19254c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19255d;

    /* renamed from: e, reason: collision with root package name */
    public final String f19256e;

    /* renamed from: f, reason: collision with root package name */
    public final String f19257f;

    /* renamed from: g, reason: collision with root package name */
    public final String f19258g;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public String f19259a;

        /* renamed from: b, reason: collision with root package name */
        public String f19260b;

        /* renamed from: c, reason: collision with root package name */
        public String f19261c;

        /* renamed from: d, reason: collision with root package name */
        public String f19262d;

        /* renamed from: e, reason: collision with root package name */
        public String f19263e;

        /* renamed from: f, reason: collision with root package name */
        public String f19264f;

        /* renamed from: g, reason: collision with root package name */
        public String f19265g;

        public m a() {
            return new m(this.f19260b, this.f19259a, this.f19261c, this.f19262d, this.f19263e, this.f19264f, this.f19265g);
        }

        public b b(String str) {
            this.f19259a = AbstractC0328n.f(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.f19260b = AbstractC0328n.f(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.f19261c = str;
            return this;
        }

        public b e(String str) {
            this.f19262d = str;
            return this;
        }

        public b f(String str) {
            this.f19263e = str;
            return this;
        }

        public b g(String str) {
            this.f19265g = str;
            return this;
        }

        public b h(String str) {
            this.f19264f = str;
            return this;
        }
    }

    public m(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC0328n.m(!E2.n.a(str), "ApplicationId must be set.");
        this.f19253b = str;
        this.f19252a = str2;
        this.f19254c = str3;
        this.f19255d = str4;
        this.f19256e = str5;
        this.f19257f = str6;
        this.f19258g = str7;
    }

    public static m a(Context context) {
        C0331q c0331q = new C0331q(context);
        String a7 = c0331q.a("google_app_id");
        if (TextUtils.isEmpty(a7)) {
            return null;
        }
        return new m(a7, c0331q.a("google_api_key"), c0331q.a("firebase_database_url"), c0331q.a("ga_trackingId"), c0331q.a("gcm_defaultSenderId"), c0331q.a("google_storage_bucket"), c0331q.a("project_id"));
    }

    public String b() {
        return this.f19252a;
    }

    public String c() {
        return this.f19253b;
    }

    public String d() {
        return this.f19254c;
    }

    public String e() {
        return this.f19255d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return AbstractC0327m.a(this.f19253b, mVar.f19253b) && AbstractC0327m.a(this.f19252a, mVar.f19252a) && AbstractC0327m.a(this.f19254c, mVar.f19254c) && AbstractC0327m.a(this.f19255d, mVar.f19255d) && AbstractC0327m.a(this.f19256e, mVar.f19256e) && AbstractC0327m.a(this.f19257f, mVar.f19257f) && AbstractC0327m.a(this.f19258g, mVar.f19258g);
    }

    public String f() {
        return this.f19256e;
    }

    public String g() {
        return this.f19258g;
    }

    public String h() {
        return this.f19257f;
    }

    public int hashCode() {
        return AbstractC0327m.b(this.f19253b, this.f19252a, this.f19254c, this.f19255d, this.f19256e, this.f19257f, this.f19258g);
    }

    public String toString() {
        return AbstractC0327m.c(this).a("applicationId", this.f19253b).a("apiKey", this.f19252a).a("databaseUrl", this.f19254c).a("gcmSenderId", this.f19256e).a("storageBucket", this.f19257f).a("projectId", this.f19258g).toString();
    }
}
