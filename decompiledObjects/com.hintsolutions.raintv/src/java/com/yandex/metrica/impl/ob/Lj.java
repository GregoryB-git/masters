/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.telephony.CellInfo
 *  android.telephony.CellInfoCdma
 *  android.telephony.CellInfoGsm
 *  android.telephony.CellInfoLte
 *  android.telephony.CellInfoWcdma
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Fh;
import com.yandex.metrica.impl.ob.S;
import com.yandex.metrica.impl.ob.cj;
import com.yandex.metrica.impl.ob.hj;
import com.yandex.metrica.impl.ob.mj;
import com.yandex.metrica.impl.ob.nj;
import com.yandex.metrica.impl.ob.oj;
import com.yandex.metrica.impl.ob.tj;
import com.yandex.metrica.impl.ob.uj;
import com.yandex.metrica.impl.ob.wj;

@TargetApi(value=17)
public class lj
implements S {
    @NonNull
    private final wj a;
    @NonNull
    private final cj b;
    @NonNull
    private final cj c;
    @NonNull
    private final cj d;
    @NonNull
    private final cj e;
    @NonNull
    private final S[] f;

    public lj() {
        this(new nj());
    }

    private lj(@NonNull cj cj2) {
        wj wj2 = new wj();
        oj oj2 = new oj();
        mj mj2 = new mj();
        tj tj2 = new tj();
        if (A2.a(18)) {
            cj2 = new uj();
        }
        this(wj2, oj2, mj2, tj2, cj2);
    }

    @VisibleForTesting
    public lj(@NonNull wj wj2, @NonNull cj cj2, @NonNull cj cj3, @NonNull cj cj4, @NonNull cj cj5) {
        this.a = wj2;
        this.b = cj2;
        this.c = cj3;
        this.d = cj4;
        this.e = cj5;
        this.f = new S[]{cj2, cj3, cj5, cj4};
    }

    public void a(CellInfo cellInfo, hj.a a2) {
        this.a.a(cellInfo, a2);
        if (cellInfo instanceof CellInfoGsm) {
            this.b.a((CellInfo)((CellInfoGsm)cellInfo), a2);
        } else if (cellInfo instanceof CellInfoCdma) {
            this.c.a((CellInfo)((CellInfoCdma)cellInfo), a2);
        } else if (cellInfo instanceof CellInfoLte) {
            this.d.a((CellInfo)((CellInfoLte)cellInfo), a2);
        } else if (A2.a(18) && cellInfo instanceof CellInfoWcdma) {
            this.e.a((CellInfo)((CellInfoWcdma)cellInfo), a2);
        }
    }

    @Override
    public void a(@NonNull Fh fh2) {
        S[] sArray = this.f;
        int n2 = sArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            sArray[i2].a(fh2);
        }
    }
}

