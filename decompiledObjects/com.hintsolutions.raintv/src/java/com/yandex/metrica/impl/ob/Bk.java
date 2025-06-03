/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.regex.Pattern
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.el;
import com.yandex.metrica.impl.ob.pl;
import java.util.regex.Pattern;

public class bk
implements pl {
    @NonNull
    private final Pattern a;

    public bk(@NonNull Pattern pattern) {
        this.a = pattern;
    }

    @Override
    @NonNull
    public el.b a() {
        return el.b.c;
    }

    public boolean a(@NonNull Object object) {
        object = (String)object;
        return this.a.matcher((CharSequence)object).matches() ^ true;
    }
}

