/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.firebase.components.Component
 *  com.google.firebase.components.ComponentRuntime
 *  com.google.firebase.inject.Provider
 *  java.lang.Object
 */
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;

public final class k0
implements Provider {
    public final ComponentRuntime a;
    public final Component b;

    public /* synthetic */ k0(ComponentRuntime componentRuntime, Component component) {
        this.a = componentRuntime;
        this.b = component;
    }

    public final Object get() {
        return ComponentRuntime.a((ComponentRuntime)this.a, (Component)this.b);
    }
}

