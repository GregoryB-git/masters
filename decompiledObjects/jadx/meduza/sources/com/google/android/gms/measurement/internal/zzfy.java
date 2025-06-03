package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzbx;
import e7.a1;
import e7.d6;
import e7.e;
import e7.f;
import e7.f0;
import e7.k6;
import e7.n;
import e7.n0;
import e7.p0;
import e7.q6;
import e7.r0;
import e7.r6;
import e7.s0;
import e7.s2;
import e7.s6;
import e7.u0;
import e7.z1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import m6.j;

/* loaded from: classes.dex */
public abstract class zzfy extends zzbx implements n0 {
    public zzfy() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        List O2;
        int i12 = 0;
        int i13 = 1;
        ArrayList arrayList = null;
        p0 p0Var = null;
        s0 s0Var = null;
        switch (i10) {
            case 1:
                f0 f0Var = (f0) zzbw.zza(parcel, f0.CREATOR);
                k6 k6Var = (k6) zzbw.zza(parcel, k6.CREATOR);
                zzbw.zzb(parcel);
                ((zzig) this).V(f0Var, k6Var);
                parcel2.writeNoException();
                return true;
            case 2:
                q6 q6Var = (q6) zzbw.zza(parcel, q6.CREATOR);
                k6 k6Var2 = (k6) zzbw.zza(parcel, k6.CREATOR);
                zzbw.zzb(parcel);
                ((zzig) this).g0(q6Var, k6Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                k6 k6Var3 = (k6) zzbw.zza(parcel, k6.CREATOR);
                zzbw.zzb(parcel);
                ((zzig) this).r2(k6Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                f0 f0Var2 = (f0) zzbw.zza(parcel, f0.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzbw.zzb(parcel);
                ((zzig) this).g(f0Var2, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                k6 k6Var4 = (k6) zzbw.zza(parcel, k6.CREATOR);
                zzbw.zzb(parcel);
                ((zzig) this).E0(k6Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                k6 k6Var5 = (k6) zzbw.zza(parcel, k6.CREATOR);
                boolean zzc = zzbw.zzc(parcel);
                zzbw.zzb(parcel);
                zzig zzigVar = (zzig) this;
                zzigVar.e3(k6Var5);
                String str = k6Var5.f4437a;
                j.i(str);
                try {
                    List<s6> list = (List) zzigVar.f2908a.zzl().p(new z1(str, i13, zzigVar)).get();
                    ArrayList arrayList2 = new ArrayList(list.size());
                    for (s6 s6Var : list) {
                        if (zzc || !r6.r0(s6Var.f4651c)) {
                            arrayList2.add(new q6(s6Var));
                        }
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException | ExecutionException e10) {
                    zzigVar.f2908a.zzj().f4060o.d("Failed to get user properties. appId", a1.p(k6Var5.f4437a), e10);
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                f0 f0Var3 = (f0) zzbw.zza(parcel, f0.CREATOR);
                String readString3 = parcel.readString();
                zzbw.zzb(parcel);
                byte[] V2 = ((zzig) this).V2(f0Var3, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(V2);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                zzbw.zzb(parcel);
                ((zzig) this).d1(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                k6 k6Var6 = (k6) zzbw.zza(parcel, k6.CREATOR);
                zzbw.zzb(parcel);
                String V1 = ((zzig) this).V1(k6Var6);
                parcel2.writeNoException();
                parcel2.writeString(V1);
                return true;
            case 12:
                f fVar = (f) zzbw.zza(parcel, f.CREATOR);
                k6 k6Var7 = (k6) zzbw.zza(parcel, k6.CREATOR);
                zzbw.zzb(parcel);
                ((zzig) this).F(fVar, k6Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                f fVar2 = (f) zzbw.zza(parcel, f.CREATOR);
                zzbw.zzb(parcel);
                zzig zzigVar2 = (zzig) this;
                j.i(fVar2);
                j.i(fVar2.f4184c);
                j.e(fVar2.f4182a);
                zzigVar2.d3(fVar2.f4182a, true);
                zzigVar2.f3(new s2(i12, zzigVar2, new f(fVar2)));
                parcel2.writeNoException();
                return true;
            case 14:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean zzc2 = zzbw.zzc(parcel);
                k6 k6Var8 = (k6) zzbw.zza(parcel, k6.CREATOR);
                zzbw.zzb(parcel);
                O2 = ((zzig) this).O2(readString7, readString8, zzc2, k6Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(O2);
                return true;
            case 15:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean zzc3 = zzbw.zzc(parcel);
                zzbw.zzb(parcel);
                O2 = ((zzig) this).h0(readString9, readString10, readString11, zzc3);
                parcel2.writeNoException();
                parcel2.writeTypedList(O2);
                return true;
            case 16:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                k6 k6Var9 = (k6) zzbw.zza(parcel, k6.CREATOR);
                zzbw.zzb(parcel);
                O2 = ((zzig) this).T2(readString12, readString13, k6Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(O2);
                return true;
            case 17:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                zzbw.zzb(parcel);
                O2 = ((zzig) this).h1(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(O2);
                return true;
            case 18:
                k6 k6Var10 = (k6) zzbw.zza(parcel, k6.CREATOR);
                zzbw.zzb(parcel);
                ((zzig) this).M2(k6Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                k6 k6Var11 = (k6) zzbw.zza(parcel, k6.CREATOR);
                zzbw.zzb(parcel);
                ((zzig) this).mo0m(bundle, k6Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                k6 k6Var12 = (k6) zzbw.zza(parcel, k6.CREATOR);
                zzbw.zzb(parcel);
                ((zzig) this).C(k6Var12);
                parcel2.writeNoException();
                return true;
            case 21:
                k6 k6Var13 = (k6) zzbw.zza(parcel, k6.CREATOR);
                zzbw.zzb(parcel);
                n v12 = ((zzig) this).v1(k6Var13);
                parcel2.writeNoException();
                zzbw.zzb(parcel2, v12);
                return true;
            case 24:
                k6 k6Var14 = (k6) zzbw.zza(parcel, k6.CREATOR);
                Bundle bundle2 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                zzbw.zzb(parcel);
                O2 = ((zzig) this).m(bundle2, k6Var14);
                parcel2.writeNoException();
                parcel2.writeTypedList(O2);
                return true;
            case 25:
                k6 k6Var15 = (k6) zzbw.zza(parcel, k6.CREATOR);
                zzbw.zzb(parcel);
                ((zzig) this).l1(k6Var15);
                parcel2.writeNoException();
                return true;
            case 26:
                k6 k6Var16 = (k6) zzbw.zza(parcel, k6.CREATOR);
                zzbw.zzb(parcel);
                ((zzig) this).k0(k6Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                k6 k6Var17 = (k6) zzbw.zza(parcel, k6.CREATOR);
                zzbw.zzb(parcel);
                ((zzig) this).Y1(k6Var17);
                parcel2.writeNoException();
                return true;
            case 29:
                k6 k6Var18 = (k6) zzbw.zza(parcel, k6.CREATOR);
                d6 d6Var = (d6) zzbw.zza(parcel, d6.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    s0Var = queryLocalInterface instanceof s0 ? (s0) queryLocalInterface : new u0(readStrongBinder);
                }
                zzbw.zzb(parcel);
                ((zzig) this).N1(k6Var18, d6Var, s0Var);
                parcel2.writeNoException();
                return true;
            case 30:
                k6 k6Var19 = (k6) zzbw.zza(parcel, k6.CREATOR);
                e eVar = (e) zzbw.zza(parcel, e.CREATOR);
                zzbw.zzb(parcel);
                ((zzig) this).M1(k6Var19, eVar);
                parcel2.writeNoException();
                return true;
            case 31:
                k6 k6Var20 = (k6) zzbw.zza(parcel, k6.CREATOR);
                Bundle bundle3 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    p0Var = queryLocalInterface2 instanceof p0 ? (p0) queryLocalInterface2 : new r0(readStrongBinder2);
                }
                zzbw.zzb(parcel);
                ((zzig) this).h2(k6Var20, bundle3, p0Var);
                parcel2.writeNoException();
                return true;
        }
    }
}
