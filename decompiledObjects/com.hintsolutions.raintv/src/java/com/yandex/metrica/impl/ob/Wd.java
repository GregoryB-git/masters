/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.Zm;
import com.yandex.metrica.impl.ob.td;
import com.yandex.metrica.impl.ob.ud;
import java.util.ArrayList;
import java.util.List;

@TargetApi(value=16)
class wd
implements td {
    private final Context a;
    private final Zm b;

    @VisibleForTesting
    public wd(Context context, @NonNull Zm zm2) {
        this.a = context;
        this.b = zm2;
    }

    @Override
    @NonNull
    public List<ud> a() {
        ArrayList arrayList = new ArrayList();
        Object object = this.b;
        String[] stringArray = this.a;
        if ((object = ((Zm)object).b((Context)stringArray, stringArray.getPackageName(), 4096)) == null) {
            return arrayList;
        }
        stringArray = ((PackageInfo)object).requestedPermissions;
        object = ((PackageInfo)object).requestedPermissionsFlags;
        if (stringArray == null) {
            return arrayList;
        }
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string = stringArray[i2];
            if (object != null && ((Object)object).length > i2 && (object[i2] & 2) != 0) {
                arrayList.add((Object)new ud(string, true));
                continue;
            }
            arrayList.add((Object)new ud(string, false));
        }
        return arrayList;
    }
}

