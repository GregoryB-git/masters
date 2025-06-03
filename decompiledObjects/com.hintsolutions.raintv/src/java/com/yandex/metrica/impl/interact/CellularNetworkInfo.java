/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.metrica.impl.interact.CellularNetworkInfo$a
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.interact;

import android.content.Context;
import com.yandex.metrica.impl.interact.CellularNetworkInfo;
import com.yandex.metrica.impl.ob.Kj;
import com.yandex.metrica.impl.ob.Nj;
import com.yandex.metrica.impl.ob.P;

public class CellularNetworkInfo {
    private String a = "";

    public CellularNetworkInfo(Context context) {
        new Kj(context, P.g().d().b()).a((Nj)new a(this));
    }

    public static /* synthetic */ String a(CellularNetworkInfo cellularNetworkInfo, String string) {
        cellularNetworkInfo.a = string;
        return string;
    }

    public String getCelluralInfo() {
        return this.a;
    }
}

