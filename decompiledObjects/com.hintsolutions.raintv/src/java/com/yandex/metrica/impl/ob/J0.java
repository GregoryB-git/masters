/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package com.yandex.metrica.impl.ob;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.K0;
import java.util.HashMap;
import java.util.Map;

public class j0 {
    @NonNull
    private final K0 a;
    @NonNull
    private final Map<Boolean, String> b = new HashMap();

    public j0(@NonNull K0 k02) {
        this.a = k02;
    }

    private void a(@Nullable String string, boolean bl) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            if (!A2.a((Object)string, this.b.get((Object)(bl ^ true)))) {
                this.a.a(string, bl);
            }
            this.b.put((Object)bl, (Object)string);
        }
    }

    public void a(@Nullable Intent intent) {
        if (intent != null) {
            this.a(intent.getDataString(), false);
        }
    }

    public void a(@Nullable String string) {
        this.a(string, false);
    }

    public void b(@Nullable String string) {
        this.a(string, true);
    }
}

