/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.X6;
import com.yandex.metrica.impl.ob.am;
import com.yandex.metrica.impl.ob.c7;
import java.io.File;
import org.jetbrains.annotations.NotNull;

public final class d7
implements am<File, String> {
    @NotNull
    private final X6 a;
    private final c7 b;

    public d7(@NotNull X6 x6, @NotNull c7 c72) {
        this.a = x6;
        this.b = c72;
    }

    @Override
    public Object a(Object object) {
        object = (File)object;
        return this.b.a((File)object, this.a);
    }
}

