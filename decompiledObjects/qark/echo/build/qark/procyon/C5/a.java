// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C5;

import t5.b;
import io.flutter.plugins.GeneratedPluginRegistrant;

public abstract class a
{
    public static void a(final io.flutter.embedding.engine.a obj) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", io.flutter.embedding.engine.a.class).invoke(null, obj);
        }
        catch (Exception ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Tried to automatically register plugins with FlutterEngine (");
            sb.append(obj);
            sb.append(") but could not find or invoke the GeneratedPluginRegistrant.");
            b.b("GeneratedPluginsRegister", sb.toString());
            b.c("GeneratedPluginsRegister", "Received exception while registering", ex);
        }
    }
}
