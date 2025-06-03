// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C1;

import java.lang.reflect.Method;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

public final class e
{
    public static final e a;
    public static final String b;
    public static Class c;
    
    static {
        a = new e();
        b = e.class.getCanonicalName();
    }
    
    public static final void a() {
        d("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }
    
    public static final void c(final String s) {
        d("UnityFacebookSDKPlugin", "OnReceiveMapping", s);
    }
    
    public static final void d(final String s, final String s2, final String s3) {
        while (true) {
            try {
                if (e.c == null) {
                    e.c = e.a.b();
                }
                final Class c = e.c;
                if (c == null) {
                    Intrinsics.n("unityPlayer");
                    throw null;
                }
                final Method method = c.getMethod("UnitySendMessage", String.class, String.class, String.class);
                final Class c2 = e.c;
                if (c2 != null) {
                    method.invoke(c2, s, s2, s3);
                    return;
                }
                Intrinsics.n("unityPlayer");
                throw null;
                final Exception ex;
                Log.e(e.b, "Failed to send message to Unity", (Throwable)ex);
            }
            catch (Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public final Class b() {
        final Class<?> forName = Class.forName("com.unity3d.player.UnityPlayer");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(UNITY_PLAYER_CLASS)");
        return forName;
    }
}
