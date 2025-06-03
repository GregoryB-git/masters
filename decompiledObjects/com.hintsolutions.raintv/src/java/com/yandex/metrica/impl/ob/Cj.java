/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.telephony.CellInfo
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.Fh;
import com.yandex.metrica.impl.ob.S;
import com.yandex.metrica.impl.ob.hj;

@TargetApi(value=17)
public abstract class cj
implements S {
    private final String a;
    @Nullable
    private volatile Fh b;

    public cj() {
        StringBuilder stringBuilder = z2.t("[");
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append("]");
        this.a = stringBuilder.toString();
    }

    private boolean b(@NonNull CellInfo cellInfo) {
        boolean bl2;
        block2: {
            block3: {
                boolean bl3;
                Fh fh2 = this.b;
                bl2 = bl3 = false;
                if (fh2 == null) break block2;
                bl2 = bl3;
                if (!fh2.t) break block2;
                boolean bl4 = cellInfo.isRegistered();
                if (!fh2.u) break block3;
                bl2 = bl3;
                if (!bl4) break block2;
            }
            bl2 = true;
        }
        return bl2;
    }

    public void a(@NonNull CellInfo cellInfo, @NonNull hj.a a2) {
        this.b(cellInfo, a2);
        if (this.b(cellInfo)) {
            this.c(cellInfo, a2);
        }
    }

    @Override
    public void a(@NonNull Fh fh2) {
        this.b = fh2;
    }

    public abstract void b(@NonNull CellInfo var1, @NonNull hj.a var2);

    public abstract void c(@NonNull CellInfo var1, @NonNull hj.a var2);
}

