/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.k7;

class x7 {
    @NonNull
    public final String a;
    public final boolean b;
    public final boolean c;
    @Nullable
    public final k7 d;

    public x7(@NonNull String string, boolean bl, @Nullable k7 k72) {
        boolean bl2 = A2.a(23) && Process.is64Bit();
        this(string, bl, k72, bl2);
    }

    @VisibleForTesting
    public x7(@NonNull String string, boolean bl, @Nullable k7 k72, boolean bl2) {
        this.a = string;
        this.c = bl;
        this.d = k72;
        this.b = bl2;
    }
}

