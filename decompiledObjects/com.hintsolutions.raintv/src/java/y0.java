/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.firebase.heartbeatinfo.DefaultHeartBeatController
 *  com.google.firebase.installations.FirebaseInstallations
 *  java.lang.Object
 *  java.util.concurrent.Callable
 */
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.installations.FirebaseInstallations;
import java.util.concurrent.Callable;

public final class y0
implements Callable {
    public final int a;
    public final Object b;

    public /* synthetic */ y0(Object object, int n) {
        this.a = n;
        this.b = object;
    }

    public final Object call() {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                return DefaultHeartBeatController.a((DefaultHeartBeatController)((DefaultHeartBeatController)this.b));
            }
            case 0: {
                return DefaultHeartBeatController.b((DefaultHeartBeatController)((DefaultHeartBeatController)this.b));
            }
        }
        return FirebaseInstallations.e((FirebaseInstallations)((FirebaseInstallations)this.b));
    }
}

