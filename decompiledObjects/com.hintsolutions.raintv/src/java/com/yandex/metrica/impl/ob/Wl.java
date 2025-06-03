/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Set
 */
package com.yandex.metrica.impl.ob;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import java.util.Set;

public class wl {
    @NonNull
    private final Set<String> a;

    public wl(@NonNull Set<String> set) {
        this.a = set;
    }

    @Nullable
    private String a(String[] stringArray) {
        for (String string : stringArray) {
            if (!this.a.contains((Object)string)) continue;
            return string;
        }
        return null;
    }

    @Nullable
    public String a() {
        if (A2.a(21)) {
            String string = this.a(Build.SUPPORTED_64_BIT_ABIS);
            if (string == null) {
                string = this.a(Build.SUPPORTED_32_BIT_ABIS);
            }
            return string;
        }
        return this.a(new String[]{Build.CPU_ABI, Build.CPU_ABI2});
    }
}

