package b8;

import android.net.Uri;
import com.google.android.gms.internal.p002firebaseauthapi.zzan;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final zzan<String, Integer> f2065d;

    /* renamed from: a, reason: collision with root package name */
    public final String f2066a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2067b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2068c;

    static {
        HashMap hashMap = new HashMap();
        defpackage.g.k(2, hashMap, "recoverEmail", 0, "resetPassword", 4, "signIn", 1, "verifyEmail");
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        f2065d = zzan.zza(hashMap);
    }

    public d(String str) {
        String a10 = a(str, "apiKey");
        String a11 = a(str, "oobCode");
        String a12 = a(str, "mode");
        if (a10 == null || a11 == null || a12 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
        }
        m6.j.e(a10);
        m6.j.e(a11);
        this.f2066a = a11;
        m6.j.e(a12);
        this.f2067b = a12;
        a(str, "continueUrl");
        a(str, "languageCode");
        this.f2068c = a(str, "tenantId");
    }

    public static String a(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (!queryParameterNames.contains("link")) {
                return null;
            }
            String queryParameter = parse.getQueryParameter("link");
            m6.j.e(queryParameter);
            return Uri.parse(queryParameter).getQueryParameter(str2);
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
