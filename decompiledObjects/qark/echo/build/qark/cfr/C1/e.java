/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 */
package C1;

import android.util.Log;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

public final class e {
    public static final e a = new e();
    public static final String b = e.class.getCanonicalName();
    public static Class c;

    public static final void a() {
        e.d("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    public static final void c(String string2) {
        e.d("UnityFacebookSDKPlugin", "OnReceiveMapping", string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void d(String string2, String string3, String string4) {
        try {
            Class class_;
            if (c == null) {
                c = a.b();
            }
            if ((class_ = c) == null) {
                Intrinsics.n("unityPlayer");
                throw null;
            }
            class_ = class_.getMethod("UnitySendMessage", new Class[]{String.class, String.class, String.class});
            Class class_2 = c;
            if (class_2 != null) {
                class_.invoke((Object)class_2, new Object[]{string2, string3, string4});
                return;
            }
            Intrinsics.n("unityPlayer");
            throw null;
        }
        catch (Exception exception) {}
        Log.e((String)b, (String)"Failed to send message to Unity", (Throwable)exception);
    }

    public final Class b() {
        Class class_ = Class.forName((String)"com.unity3d.player.UnityPlayer");
        Intrinsics.checkNotNullExpressionValue((Object)class_, "forName(UNITY_PLAYER_CLASS)");
        return class_;
    }
}

