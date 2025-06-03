/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.core.view.MenuHostHelper
 *  androidx.core.view.MenuProvider
 *  androidx.lifecycle.Lifecycle$Event
 *  androidx.lifecycle.LifecycleEventObserver
 *  androidx.lifecycle.LifecycleOwner
 *  java.lang.Object
 */
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public final class f3
implements LifecycleEventObserver {
    public final MenuHostHelper a;
    public final MenuProvider b;

    public /* synthetic */ f3(MenuHostHelper menuHostHelper, MenuProvider menuProvider) {
        this.a = menuHostHelper;
        this.b = menuProvider;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        MenuHostHelper.b((MenuHostHelper)this.a, (MenuProvider)this.b, (LifecycleOwner)lifecycleOwner, (Lifecycle.Event)event);
    }
}

