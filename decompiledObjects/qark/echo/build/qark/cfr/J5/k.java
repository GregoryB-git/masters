/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package J5;

import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import s3.e;

public final class k
implements Runnable {
    public final /* synthetic */ e o;
    public final /* synthetic */ V2.k p;

    public /* synthetic */ k(e e8, V2.k k8) {
        this.o = e8;
        this.p = k8;
    }

    public final void run() {
        FlutterFirebasePluginRegistry.b(this.o, this.p);
    }
}

