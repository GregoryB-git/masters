package e7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.android.gms.internal.measurement.zzbw;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class q0 extends zzbu implements n0 {
    public q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // e7.n0
    public final void C(k6 k6Var) {
        Parcel b_ = b_();
        zzbw.zza(b_, k6Var);
        zzb(20, b_);
    }

    @Override // e7.n0
    public final void E0(k6 k6Var) {
        Parcel b_ = b_();
        zzbw.zza(b_, k6Var);
        zzb(6, b_);
    }

    @Override // e7.n0
    public final void F(f fVar, k6 k6Var) {
        Parcel b_ = b_();
        zzbw.zza(b_, fVar);
        zzbw.zza(b_, k6Var);
        zzb(12, b_);
    }

    @Override // e7.n0
    public final void M1(k6 k6Var, e eVar) {
        Parcel b_ = b_();
        zzbw.zza(b_, k6Var);
        zzbw.zza(b_, eVar);
        zzb(30, b_);
    }

    @Override // e7.n0
    public final void M2(k6 k6Var) {
        Parcel b_ = b_();
        zzbw.zza(b_, k6Var);
        zzb(18, b_);
    }

    @Override // e7.n0
    public final void N1(k6 k6Var, d6 d6Var, s0 s0Var) {
        Parcel b_ = b_();
        zzbw.zza(b_, k6Var);
        zzbw.zza(b_, d6Var);
        zzbw.zza(b_, s0Var);
        zzb(29, b_);
    }

    @Override // e7.n0
    public final List<q6> O2(String str, String str2, boolean z10, k6 k6Var) {
        Parcel b_ = b_();
        b_.writeString(str);
        b_.writeString(str2);
        zzbw.zza(b_, z10);
        zzbw.zza(b_, k6Var);
        Parcel zza = zza(14, b_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(q6.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // e7.n0
    public final List<f> T2(String str, String str2, k6 k6Var) {
        Parcel b_ = b_();
        b_.writeString(str);
        b_.writeString(str2);
        zzbw.zza(b_, k6Var);
        Parcel zza = zza(16, b_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(f.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // e7.n0
    public final void V(f0 f0Var, k6 k6Var) {
        Parcel b_ = b_();
        zzbw.zza(b_, f0Var);
        zzbw.zza(b_, k6Var);
        zzb(1, b_);
    }

    @Override // e7.n0
    public final String V1(k6 k6Var) {
        Parcel b_ = b_();
        zzbw.zza(b_, k6Var);
        Parcel zza = zza(11, b_);
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // e7.n0
    public final byte[] V2(f0 f0Var, String str) {
        Parcel b_ = b_();
        zzbw.zza(b_, f0Var);
        b_.writeString(str);
        Parcel zza = zza(9, b_);
        byte[] createByteArray = zza.createByteArray();
        zza.recycle();
        return createByteArray;
    }

    @Override // e7.n0
    public final void Y1(k6 k6Var) {
        Parcel b_ = b_();
        zzbw.zza(b_, k6Var);
        zzb(27, b_);
    }

    @Override // e7.n0
    public final void d1(long j10, String str, String str2, String str3) {
        Parcel b_ = b_();
        b_.writeLong(j10);
        b_.writeString(str);
        b_.writeString(str2);
        b_.writeString(str3);
        zzb(10, b_);
    }

    @Override // e7.n0
    public final void g0(q6 q6Var, k6 k6Var) {
        Parcel b_ = b_();
        zzbw.zza(b_, q6Var);
        zzbw.zza(b_, k6Var);
        zzb(2, b_);
    }

    @Override // e7.n0
    public final List<q6> h0(String str, String str2, String str3, boolean z10) {
        Parcel b_ = b_();
        b_.writeString(str);
        b_.writeString(str2);
        b_.writeString(str3);
        zzbw.zza(b_, z10);
        Parcel zza = zza(15, b_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(q6.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // e7.n0
    public final List<f> h1(String str, String str2, String str3) {
        Parcel b_ = b_();
        b_.writeString(str);
        b_.writeString(str2);
        b_.writeString(str3);
        Parcel zza = zza(17, b_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(f.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // e7.n0
    public final void h2(k6 k6Var, Bundle bundle, p0 p0Var) {
        Parcel b_ = b_();
        zzbw.zza(b_, k6Var);
        zzbw.zza(b_, bundle);
        zzbw.zza(b_, p0Var);
        zzb(31, b_);
    }

    @Override // e7.n0
    public final void k0(k6 k6Var) {
        Parcel b_ = b_();
        zzbw.zza(b_, k6Var);
        zzb(26, b_);
    }

    @Override // e7.n0
    public final void l1(k6 k6Var) {
        Parcel b_ = b_();
        zzbw.zza(b_, k6Var);
        zzb(25, b_);
    }

    @Override // e7.n0
    public final List m(Bundle bundle, k6 k6Var) {
        Parcel b_ = b_();
        zzbw.zza(b_, k6Var);
        zzbw.zza(b_, bundle);
        Parcel zza = zza(24, b_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(w5.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // e7.n0
    /* renamed from: m */
    public final void mo0m(Bundle bundle, k6 k6Var) {
        Parcel b_ = b_();
        zzbw.zza(b_, bundle);
        zzbw.zza(b_, k6Var);
        zzb(19, b_);
    }

    @Override // e7.n0
    public final void r2(k6 k6Var) {
        Parcel b_ = b_();
        zzbw.zza(b_, k6Var);
        zzb(4, b_);
    }

    @Override // e7.n0
    public final n v1(k6 k6Var) {
        Parcel b_ = b_();
        zzbw.zza(b_, k6Var);
        Parcel zza = zza(21, b_);
        n nVar = (n) zzbw.zza(zza, n.CREATOR);
        zza.recycle();
        return nVar;
    }
}
