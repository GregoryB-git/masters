package r8;

import android.text.TextUtils;
import android.util.Log;
import eb.y;
import j8.a0;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f13783a;

    /* renamed from: b, reason: collision with root package name */
    public final y f13784b;

    public b(String str, y yVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f13784b = yVar;
        this.f13783a = str;
    }

    public static void a(o8.a aVar, i iVar) {
        b(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", iVar.f13805a);
        b(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        b(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", "19.4.0");
        b(aVar, "Accept", "application/json");
        b(aVar, "X-CRASHLYTICS-DEVICE-MODEL", iVar.f13806b);
        b(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", iVar.f13807c);
        b(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", iVar.f13808d);
        b(aVar, "X-CRASHLYTICS-INSTALLATION-ID", ((j8.c) ((a0) iVar.f13809e).c()).f8559a);
    }

    public static void b(o8.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.f12078c.put(str, str2);
        }
    }

    public static HashMap c(i iVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", iVar.f13811h);
        hashMap.put("display_version", iVar.f13810g);
        hashMap.put("source", Integer.toString(iVar.f13812i));
        String str = iVar.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public final JSONObject d(o8.b bVar) {
        int i10 = bVar.f12079a;
        String h10 = defpackage.f.h("Settings response code was: ", i10);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", h10, null);
        }
        if (!(i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203)) {
            StringBuilder n2 = a0.j.n("Settings request failed; (status: ", i10, ") from ");
            n2.append(this.f13783a);
            Log.e("FirebaseCrashlytics", n2.toString(), null);
            return null;
        }
        String str = bVar.f12080b;
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            StringBuilder l10 = defpackage.f.l("Failed to parse settings JSON from ");
            l10.append(this.f13783a);
            Log.w("FirebaseCrashlytics", l10.toString(), e10);
            Log.w("FirebaseCrashlytics", "Settings response " + str, null);
            return null;
        }
    }
}
