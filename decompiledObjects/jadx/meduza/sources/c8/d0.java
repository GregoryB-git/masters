package c8;

import com.google.android.gms.internal.p002firebaseauthapi.zzzp;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p6.a f2424a = new p6.a("GetTokenResultFactory", new String[0]);

    public static b8.s a(String str) {
        Map hashMap;
        try {
            hashMap = c0.b(str);
        } catch (zzzp e10) {
            f2424a.b("Error parsing token claims", e10, new Object[0]);
            hashMap = new HashMap();
        }
        return new b8.s(str, hashMap);
    }
}
