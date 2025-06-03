/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.Arrays
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.Yl;
import com.yandex.metrica.impl.ob.z6;
import java.util.Arrays;
import java.util.List;

public class j3
implements Yl<Thread, StackTraceElement[], z6> {
    @Override
    @NonNull
    public Object a(@NonNull Object object, @Nullable Object object2) {
        Thread thread = (Thread)object;
        object2 = (StackTraceElement[])object2;
        String string = thread.getName();
        int n2 = thread.getPriority();
        long l2 = thread.getId();
        object = thread.getThreadGroup();
        object = object != null ? object.getName() : "";
        int n3 = thread.getState().ordinal();
        object2 = object2 == null ? null : Arrays.asList((Object[])object2);
        return new z6(string, n2, l2, (String)object, n3, (List<StackTraceElement>)object2);
    }
}

