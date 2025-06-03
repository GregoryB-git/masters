/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Zm;
import com.yandex.metrica.impl.ob.td;
import com.yandex.metrica.impl.ob.ud;
import java.util.ArrayList;
import java.util.List;

public class zd
implements td {
    @NonNull
    private final Context a;
    @NonNull
    private final String b;
    @NonNull
    private final Zm c;

    public zd(@NonNull Context context, @NonNull String string, @NonNull Zm zm2) {
        this.a = context;
        this.b = string;
        this.c = zm2;
    }

    @Override
    @NonNull
    public List<ud> a() {
        ArrayList arrayList = new ArrayList();
        String[] stringArray = this.c.b(this.a, this.b, 4096);
        if (stringArray != null) {
            stringArray = stringArray.requestedPermissions;
            int n2 = stringArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                arrayList.add((Object)new ud(stringArray[i2], true));
            }
        }
        return arrayList;
    }
}

