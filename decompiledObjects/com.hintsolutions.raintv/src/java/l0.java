/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.firebase.components.ComponentRegistrar
 *  com.google.firebase.components.ComponentRuntime
 *  com.google.firebase.components.ComponentRuntime$Builder
 *  com.google.firebase.inject.Provider
 *  java.lang.Object
 */
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;

public final class l0
implements Provider {
    public final int a;
    public final ComponentRegistrar b;

    public /* synthetic */ l0(ComponentRegistrar componentRegistrar, int n4) {
        this.a = n4;
        this.b = componentRegistrar;
    }

    public final Object get() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return ComponentRuntime.b((ComponentRegistrar)this.b);
            }
        }
        return ComponentRuntime.Builder.a((ComponentRegistrar)this.b);
    }
}

