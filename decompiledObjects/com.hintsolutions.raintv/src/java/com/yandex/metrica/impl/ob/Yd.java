/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Set
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.pd;
import com.yandex.metrica.impl.ob.ud;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class yd
implements pd {
    @NonNull
    private Set<String> a;

    public yd(@Nullable List<ud> iterator) {
        if (iterator == null) {
            this.a = new HashSet();
        } else {
            this.a = new HashSet(iterator.size());
            for (ud ud2 : iterator) {
                if (!ud2.b) continue;
                this.a.add((Object)ud2.a);
            }
        }
    }

    @Override
    public boolean a(@NonNull String string) {
        return this.a.contains((Object)string);
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("StartupBasedPermissionStrategy{mEnabledPermissions=");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

