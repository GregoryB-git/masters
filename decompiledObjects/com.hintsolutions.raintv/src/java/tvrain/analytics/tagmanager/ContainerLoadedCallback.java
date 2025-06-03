/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.tagmanager.Container
 *  com.google.android.gms.tagmanager.ContainerHolder
 *  com.google.android.gms.tagmanager.ContainerHolder$ContainerAvailableListener
 *  java.lang.Object
 *  java.lang.String
 */
package tvrain.analytics.tagmanager;

import com.google.android.gms.tagmanager.Container;
import com.google.android.gms.tagmanager.ContainerHolder;

public class ContainerLoadedCallback
implements ContainerHolder.ContainerAvailableListener {
    public static void registerCallbacksForContainer(Container container) {
    }

    public void onContainerAvailable(ContainerHolder containerHolder, String string) {
        containerHolder.getContainer();
    }
}

