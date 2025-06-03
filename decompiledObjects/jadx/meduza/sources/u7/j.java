package u7;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import m6.h;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f15096a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15097b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15098c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15099d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15100e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f15101g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        m6.j.k(!v6.g.b(str), "ApplicationId must be set.");
        this.f15097b = str;
        this.f15096a = str2;
        this.f15098c = str3;
        this.f15099d = str4;
        this.f15100e = str5;
        this.f = str6;
        this.f15101g = str7;
    }

    public static j a(Context context) {
        l3.l lVar = new l3.l(context);
        String b10 = lVar.b("google_app_id");
        if (TextUtils.isEmpty(b10)) {
            return null;
        }
        return new j(b10, lVar.b("google_api_key"), lVar.b("firebase_database_url"), lVar.b("ga_trackingId"), lVar.b("gcm_defaultSenderId"), lVar.b("google_storage_bucket"), lVar.b("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return m6.h.a(this.f15097b, jVar.f15097b) && m6.h.a(this.f15096a, jVar.f15096a) && m6.h.a(this.f15098c, jVar.f15098c) && m6.h.a(this.f15099d, jVar.f15099d) && m6.h.a(this.f15100e, jVar.f15100e) && m6.h.a(this.f, jVar.f) && m6.h.a(this.f15101g, jVar.f15101g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15097b, this.f15096a, this.f15098c, this.f15099d, this.f15100e, this.f, this.f15101g});
    }

    public final String toString() {
        h.a aVar = new h.a(this);
        aVar.a(this.f15097b, "applicationId");
        aVar.a(this.f15096a, "apiKey");
        aVar.a(this.f15098c, "databaseUrl");
        aVar.a(this.f15100e, "gcmSenderId");
        aVar.a(this.f, "storageBucket");
        aVar.a(this.f15101g, "projectId");
        return aVar.toString();
    }
}
