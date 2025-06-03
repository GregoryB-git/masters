/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.ei;
import com.yandex.metrica.impl.ob.li;
import com.yandex.metrica.networktasks.api.NetworkServiceLocator;
import com.yandex.metrica.networktasks.api.NetworkTask;

public class ki
implements li {
    private final ei a;

    public ki(@NonNull ei ei2) {
        this.a = ei2;
    }

    @Override
    public void a() {
        NetworkTask networkTask = this.a.c();
        if (networkTask != null) {
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTask);
        }
    }
}

