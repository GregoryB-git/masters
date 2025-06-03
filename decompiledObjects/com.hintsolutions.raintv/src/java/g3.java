/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.core.view.MenuHostHelper
 *  androidx.core.view.MenuProvider
 *  androidx.lifecycle.Lifecycle$Event
 *  androidx.lifecycle.Lifecycle$State
 *  androidx.lifecycle.LifecycleEventObserver
 *  androidx.lifecycle.LifecycleOwner
 *  java.lang.Object
 */
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public final class g3
implements LifecycleEventObserver {
    public final MenuHostHelper a;
    public final Lifecycle.State b;
    public final MenuProvider c;

    public /* synthetic */ g3(MenuHostHelper menuHostHelper, Lifecycle.State state, MenuProvider menuProvider) {
        this.a = menuHostHelper;
        this.b = state;
        this.c = menuProvider;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        MenuHostHelper.a((MenuHostHelper)this.a, (Lifecycle.State)this.b, (MenuProvider)this.c, (LifecycleOwner)lifecycleOwner, (Lifecycle.Event)event);
    }
}

