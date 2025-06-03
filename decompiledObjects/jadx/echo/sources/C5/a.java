package C5;

import io.flutter.plugins.GeneratedPluginRegistrant;
import t5.AbstractC1995b;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(io.flutter.embedding.engine.a aVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", io.flutter.embedding.engine.a.class).invoke(null, aVar);
        } catch (Exception e7) {
            AbstractC1995b.b("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + aVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            AbstractC1995b.c("GeneratedPluginsRegister", "Received exception while registering", e7);
        }
    }
}
