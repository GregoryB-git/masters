/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Gl;

public class im {
    @NonNull
    private final Context a;

    public im(@NonNull Context context) {
        this.a = context;
    }

    public byte[] a() {
        Object object;
        try {
            object = new StringBuilder(this.a.getPackageName());
            object = Gl.b(object.reverse().toString());
        }
        catch (Throwable throwable) {
            object = new byte[16];
        }
        return object;
    }

    public byte[] b() {
        byte[] byArray;
        try {
            byArray = Gl.b(this.a.getPackageName());
        }
        catch (Throwable throwable) {
            byArray = new byte[16];
        }
        return byArray;
    }
}

