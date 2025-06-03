/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.firebase.FirebaseApp
 *  com.google.firebase.components.ComponentDiscovery
 *  com.google.firebase.inject.Provider
 *  com.google.firebase.installations.FirebaseInstallations
 *  java.lang.Object
 *  java.lang.String
 */
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallations;

public final class j0
implements Provider {
    public final int a;
    public final Object b;

    public /* synthetic */ j0(Object object, int n4) {
        this.a = n4;
        this.b = object;
    }

    public final Object get() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return ComponentDiscovery.a((String)((String)this.b));
            }
        }
        return FirebaseInstallations.a((FirebaseApp)((FirebaseApp)this.b));
    }
}

