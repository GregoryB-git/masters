/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.firebase.components.Component
 *  com.google.firebase.components.ComponentContainer
 *  com.google.firebase.components.ComponentFactory
 *  com.google.firebase.platforminfo.LibraryVersionComponent
 *  com.google.firebase.platforminfo.LibraryVersionComponent$VersionExtractor
 *  com.google.firebase.tracing.ComponentMonitor
 *  java.lang.Object
 *  java.lang.String
 */
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.tracing.ComponentMonitor;

public final class o2
implements ComponentFactory {
    public final int a;
    public final String b;
    public final Object c;

    public /* synthetic */ o2(int n4, Object object, String string) {
        this.a = n4;
        this.b = string;
        this.c = object;
    }

    public final Object create(ComponentContainer componentContainer) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return LibraryVersionComponent.a((String)this.b, (LibraryVersionComponent.VersionExtractor)((LibraryVersionComponent.VersionExtractor)this.c), (ComponentContainer)componentContainer);
            }
        }
        return ComponentMonitor.a((String)this.b, (Component)((Component)this.c), (ComponentContainer)componentContainer);
    }
}

