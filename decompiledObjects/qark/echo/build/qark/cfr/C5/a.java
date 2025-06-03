/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 */
package C5;

import io.flutter.plugins.GeneratedPluginRegistrant;
import java.lang.reflect.Method;
import t5.b;

public abstract class a {
    public static void a(io.flutter.embedding.engine.a a8) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", new Class[]{io.flutter.embedding.engine.a.class}).invoke((Object)null, new Object[]{a8});
            return;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Tried to automatically register plugins with FlutterEngine (");
            stringBuilder.append((Object)a8);
            stringBuilder.append(") but could not find or invoke the GeneratedPluginRegistrant.");
            b.b("GeneratedPluginsRegister", stringBuilder.toString());
            b.c("GeneratedPluginsRegister", "Received exception while registering", (Throwable)exception);
            return;
        }
    }
}

