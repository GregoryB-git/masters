/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.tagmanager.ContainerHolder
 *  java.lang.Object
 */
package tvrain.analytics.tagmanager;

import com.google.android.gms.tagmanager.ContainerHolder;

public class ContainerHolderSingleton {
    private static ContainerHolder containerHolder;

    private ContainerHolderSingleton() {
    }

    public static ContainerHolder getContainerHolder() {
        return containerHolder;
    }

    public static void setContainerHolder(ContainerHolder containerHolder) {
        ContainerHolderSingleton.containerHolder = containerHolder;
    }
}

