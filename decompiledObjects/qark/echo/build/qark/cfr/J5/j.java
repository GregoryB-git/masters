/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package J5;

import V2.k;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;

public final class j
implements Runnable {
    public final /* synthetic */ k o;

    public /* synthetic */ j(k k8) {
        this.o = k8;
    }

    public final void run() {
        FlutterFirebasePluginRegistry.a(this.o);
    }
}

