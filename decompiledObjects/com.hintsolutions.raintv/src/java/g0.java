/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.firebase.components.Component
 *  com.google.firebase.components.ComponentContainer
 *  com.google.firebase.components.ComponentFactory
 *  java.lang.Object
 */
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

public final class g0
implements ComponentFactory {
    public final int a;
    public final Object b;

    public /* synthetic */ g0(Object object, int n4) {
        this.a = n4;
        this.b = object;
    }

    public final Object create(ComponentContainer componentContainer) {
        switch (this.a) {
            default: {
                break;
            }
            case 3: {
                return Component.e((Object)this.b, (ComponentContainer)componentContainer);
            }
            case 2: {
                return Component.b((Object)this.b, (ComponentContainer)componentContainer);
            }
            case 1: {
                return Component.a((Object)this.b, (ComponentContainer)componentContainer);
            }
            case 0: {
                return Component.d((Object)this.b, (ComponentContainer)componentContainer);
            }
        }
        return Component.c((Object)this.b, (ComponentContainer)componentContainer);
    }
}

