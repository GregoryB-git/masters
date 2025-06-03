/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Thread
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.am;
import com.yandex.metrica.impl.ob.z6;

public class i3
implements am<Thread, z6> {
    @Override
    @NonNull
    public z6 a(Thread object) {
        String string = object.getName();
        int n2 = object.getPriority();
        long l2 = object.getId();
        object = (object = object.getThreadGroup()) != null ? object.getName() : "";
        return new z6(string, n2, l2, (String)object, null, null);
    }
}

