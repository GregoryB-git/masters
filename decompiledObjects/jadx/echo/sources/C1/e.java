package C1;

import android.util.Log;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f910a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final String f911b = e.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    public static Class f912c;

    public static final void a() {
        d("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    public static final void c(String str) {
        d("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    public static final void d(String str, String str2, String str3) {
        try {
            if (f912c == null) {
                f912c = f910a.b();
            }
            Class cls = f912c;
            if (cls == null) {
                Intrinsics.n("unityPlayer");
                throw null;
            }
            Method method = cls.getMethod("UnitySendMessage", String.class, String.class, String.class);
            Class cls2 = f912c;
            if (cls2 != null) {
                method.invoke(cls2, str, str2, str3);
            } else {
                Intrinsics.n("unityPlayer");
                throw null;
            }
        } catch (Exception e7) {
            Log.e(f911b, "Failed to send message to Unity", e7);
        }
    }

    public final Class b() {
        Class<?> cls = Class.forName("com.unity3d.player.UnityPlayer");
        Intrinsics.checkNotNullExpressionValue(cls, "forName(UNITY_PLAYER_CLASS)");
        return cls;
    }
}
