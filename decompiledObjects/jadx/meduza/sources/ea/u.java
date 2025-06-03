package ea;

import android.util.Base64;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4975a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f4976b;

    static {
        byte[] bytes = t.b().getBytes(lc.a.f9829a);
        ec.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f4975a = defpackage.g.e("firebase_session_", encodeToString, "_data");
        f4976b = defpackage.g.e("firebase_session_", encodeToString, "_settings");
    }
}
