/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.api.NetworkTask;
import com.yandex.metrica.networktasks.api.b;

class c {
    public final NetworkTask a;
    private final String b;

    private c(NetworkTask networkTask) {
        this.a = networkTask;
        this.b = networkTask.description();
    }

    public /* synthetic */ c(NetworkTask networkTask, b b3) {
        this(networkTask);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && c.class == object.getClass()) {
            object = (c)object;
            return this.b.equals((Object)((c)object).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}

