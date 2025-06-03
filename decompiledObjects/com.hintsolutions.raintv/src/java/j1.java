/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.firebase.components.ComponentContainer
 *  com.google.firebase.components.ComponentFactory
 *  com.google.firebase.concurrent.ExecutorsRegistrar
 *  com.google.firebase.datatransport.TransportRegistrar
 *  com.google.firebase.installations.FirebaseInstallationsRegistrar
 *  com.google.firebase.messaging.FirebaseMessagingRegistrar
 *  com.google.firebase.platforminfo.DefaultUserAgentPublisher
 *  java.lang.Object
 */
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;

public final class j1
implements ComponentFactory {
    public final int a;

    public /* synthetic */ j1(int n4) {
        this.a = n4;
    }

    public final Object create(ComponentContainer componentContainer) {
        switch (this.a) {
            default: {
                break;
            }
            case 6: {
                return FirebaseMessagingRegistrar.a((ComponentContainer)componentContainer);
            }
            case 5: {
                return FirebaseInstallationsRegistrar.a((ComponentContainer)componentContainer);
            }
            case 4: {
                return TransportRegistrar.a((ComponentContainer)componentContainer);
            }
            case 3: {
                return ExecutorsRegistrar.e((ComponentContainer)componentContainer);
            }
            case 2: {
                return ExecutorsRegistrar.f((ComponentContainer)componentContainer);
            }
            case 1: {
                return ExecutorsRegistrar.a((ComponentContainer)componentContainer);
            }
            case 0: {
                return ExecutorsRegistrar.h((ComponentContainer)componentContainer);
            }
        }
        return DefaultUserAgentPublisher.a((ComponentContainer)componentContainer);
    }
}

