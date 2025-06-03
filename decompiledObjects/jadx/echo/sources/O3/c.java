package O3;

import H3.C0396s;
import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c implements k {

    /* renamed from: a, reason: collision with root package name */
    public final String f3973a;

    /* renamed from: b, reason: collision with root package name */
    public final L3.b f3974b;

    /* renamed from: c, reason: collision with root package name */
    public final E3.f f3975c;

    public c(String str, L3.b bVar) {
        this(str, bVar, E3.f.f());
    }

    @Override // O3.k
    public JSONObject a(j jVar, boolean z7) {
        if (!z7) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map f7 = f(jVar);
            L3.a b7 = b(d(f7), jVar);
            this.f3975c.b("Requesting settings from " + this.f3973a);
            this.f3975c.i("Settings query params were: " + f7);
            return g(b7.c());
        } catch (IOException e7) {
            this.f3975c.e("Settings request failed.", e7);
            return null;
        }
    }

    public final L3.a b(L3.a aVar, j jVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", jVar.f4004a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", C0396s.l());
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", jVar.f4005b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", jVar.f4006c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", jVar.f4007d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", jVar.f4008e.a().c());
        return aVar;
    }

    public final void c(L3.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    public L3.a d(Map map) {
        return this.f3974b.a(this.f3973a, map).d("User-Agent", "Crashlytics Android SDK/" + C0396s.l()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    public final JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e7) {
            this.f3975c.l("Failed to parse settings JSON from " + this.f3973a, e7);
            this.f3975c.k("Settings response " + str);
            return null;
        }
    }

    public final Map f(j jVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", jVar.f4011h);
        hashMap.put("display_version", jVar.f4010g);
        hashMap.put("source", Integer.toString(jVar.f4012i));
        String str = jVar.f4009f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public JSONObject g(L3.c cVar) {
        int b7 = cVar.b();
        this.f3975c.i("Settings response code was: " + b7);
        if (h(b7)) {
            return e(cVar.a());
        }
        this.f3975c.d("Settings request failed; (status: " + b7 + ") from " + this.f3973a);
        return null;
    }

    public boolean h(int i7) {
        return i7 == 200 || i7 == 201 || i7 == 202 || i7 == 203;
    }

    public c(String str, L3.b bVar, E3.f fVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f3975c = fVar;
        this.f3974b = bVar;
        this.f3973a = str;
    }
}
