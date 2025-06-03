/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.lifecycle.Lifecycle$Event
 *  androidx.lifecycle.LifecycleEventObserver
 *  androidx.lifecycle.LifecycleOwner
 *  androidx.savedstate.SavedStateRegistry
 *  java.lang.Object
 */
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;

public final class e4
implements LifecycleEventObserver {
    public final SavedStateRegistry a;

    public /* synthetic */ e4(SavedStateRegistry savedStateRegistry) {
        this.a = savedStateRegistry;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        SavedStateRegistry.a((SavedStateRegistry)this.a, (LifecycleOwner)lifecycleOwner, (Lifecycle.Event)event);
    }
}

