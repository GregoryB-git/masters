/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.firebase.components.ComponentContainer
 *  com.google.firebase.components.ComponentFactory
 *  com.google.firebase.components.Qualified
 *  com.google.firebase.crashlytics.CrashlyticsRegistrar
 *  com.google.firebase.heartbeatinfo.DefaultHeartBeatController
 *  java.lang.Object
 */
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;

public final class s0
implements ComponentFactory {
    public final int a;
    public final Object b;

    public /* synthetic */ s0(Object object, int n4) {
        this.a = n4;
        this.b = object;
    }

    public final Object create(ComponentContainer componentContainer) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return CrashlyticsRegistrar.a((CrashlyticsRegistrar)((CrashlyticsRegistrar)this.b), (ComponentContainer)componentContainer);
            }
        }
        return DefaultHeartBeatController.d((Qualified)((Qualified)this.b), (ComponentContainer)componentContainer);
    }
}

