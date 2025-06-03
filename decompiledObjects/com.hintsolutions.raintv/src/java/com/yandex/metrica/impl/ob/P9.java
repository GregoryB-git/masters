/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.Dl
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Arrays
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Dl;
import com.yandex.metrica.impl.ob.jm;
import java.util.Arrays;

public class p9 {
    @NonNull
    private final a a;
    @NonNull
    private final Dl b;

    public p9() {
        this(new a(), new Dl());
    }

    @VisibleForTesting
    public p9(@NonNull a a2, @NonNull Dl dl) {
        this.a = a2;
        this.b = dl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public byte[] a(@Nullable byte[] byArray, @NonNull String object) {
        Object object2;
        Object var3_4 = null;
        try {
            byte[] byArray2 = Arrays.copyOfRange((byte[])byArray, (int)0, (int)16);
            object2 = this.a;
            object = object.getBytes();
            object2.getClass();
            object2 = new jm("AES/CBC/PKCS5Padding", (byte[])object, byArray2);
            object = var3_4;
        }
        catch (Throwable throwable) {
            return var3_4;
        }
        if (A2.a(byArray)) return object;
        byArray = ((jm)object2).a(byArray, 16, byArray.length - 16);
        return this.b.uncompress(byArray);
    }

    public static class a {
    }
}

