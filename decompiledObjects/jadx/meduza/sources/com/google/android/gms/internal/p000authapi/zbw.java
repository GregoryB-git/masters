package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.IStatusCallback;
import d6.b;
import d6.e;
import d6.f;

/* loaded from: classes.dex */
public final class zbw extends zba {
    public zbw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbm zbmVar, b bVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbmVar);
        zbc.zbc(zba, bVar);
        zbb(1, zba);
    }

    public final void zbd(zbp zbpVar, e eVar, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, zbpVar);
        zbc.zbc(zba, eVar);
        zba.writeString(str);
        zbb(4, zba);
    }

    public final void zbe(zbr zbrVar, f fVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbrVar);
        zbc.zbc(zba, fVar);
        zbb(3, zba);
    }

    public final void zbf(IStatusCallback iStatusCallback, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, iStatusCallback);
        zba.writeString(str);
        zbb(2, zba);
    }
}
