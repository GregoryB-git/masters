package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes.dex */
public interface IFragmentWrapper extends IInterface {

    public static abstract class Stub extends zzb implements IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        public static IFragmentWrapper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return queryLocalInterface instanceof IFragmentWrapper ? (IFragmentWrapper) queryLocalInterface : new a(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
            IInterface zzg;
            int i12;
            int i13;
            int i14;
            switch (i10) {
                case 2:
                    zzg = zzg();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, zzg);
                    return true;
                case 3:
                    Bundle zzd = zzd();
                    parcel2.writeNoException();
                    zzc.zzd(parcel2, zzd);
                    return true;
                case 4:
                    i12 = zzb();
                    parcel2.writeNoException();
                    i13 = i12;
                    parcel2.writeInt(i13);
                    return true;
                case 5:
                    zzg = zze();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, zzg);
                    return true;
                case 6:
                    zzg = zzh();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, zzg);
                    return true;
                case 7:
                    i14 = zzs();
                    parcel2.writeNoException();
                    int i15 = zzc.zza;
                    i13 = i14;
                    parcel2.writeInt(i13);
                    return true;
                case 8:
                    String zzj = zzj();
                    parcel2.writeNoException();
                    parcel2.writeString(zzj);
                    return true;
                case 9:
                    zzg = zzf();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, zzg);
                    return true;
                case 10:
                    i12 = zzc();
                    parcel2.writeNoException();
                    i13 = i12;
                    parcel2.writeInt(i13);
                    return true;
                case 11:
                    i14 = zzt();
                    parcel2.writeNoException();
                    int i152 = zzc.zza;
                    i13 = i14;
                    parcel2.writeInt(i13);
                    return true;
                case 12:
                    zzg = zzi();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, zzg);
                    return true;
                case 13:
                    i14 = zzu();
                    parcel2.writeNoException();
                    int i1522 = zzc.zza;
                    i13 = i14;
                    parcel2.writeInt(i13);
                    return true;
                case 14:
                    i14 = zzv();
                    parcel2.writeNoException();
                    int i15222 = zzc.zza;
                    i13 = i14;
                    parcel2.writeInt(i13);
                    return true;
                case 15:
                    i14 = zzw();
                    parcel2.writeNoException();
                    int i152222 = zzc.zza;
                    i13 = i14;
                    parcel2.writeInt(i13);
                    return true;
                case 16:
                    i14 = zzx();
                    parcel2.writeNoException();
                    int i1522222 = zzc.zza;
                    i13 = i14;
                    parcel2.writeInt(i13);
                    return true;
                case 17:
                    i14 = zzy();
                    parcel2.writeNoException();
                    int i15222222 = zzc.zza;
                    i13 = i14;
                    parcel2.writeInt(i13);
                    return true;
                case 18:
                    i14 = zzz();
                    parcel2.writeNoException();
                    int i152222222 = zzc.zza;
                    i13 = i14;
                    parcel2.writeInt(i13);
                    return true;
                case 19:
                    i14 = Y2();
                    parcel2.writeNoException();
                    int i1522222222 = zzc.zza;
                    i13 = i14;
                    parcel2.writeInt(i13);
                    return true;
                case 20:
                    IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzc.zzb(parcel);
                    P1(asInterface);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean zzf = zzc.zzf(parcel);
                    zzc.zzb(parcel);
                    B(zzf);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean zzf2 = zzc.zzf(parcel);
                    zzc.zzb(parcel);
                    U(zzf2);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean zzf3 = zzc.zzf(parcel);
                    zzc.zzb(parcel);
                    w0(zzf3);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    boolean zzf4 = zzc.zzf(parcel);
                    zzc.zzb(parcel);
                    I2(zzf4);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    Intent intent = (Intent) zzc.zza(parcel, Intent.CREATOR);
                    zzc.zzb(parcel);
                    G0(intent);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    Intent intent2 = (Intent) zzc.zza(parcel, Intent.CREATOR);
                    int readInt = parcel.readInt();
                    zzc.zzb(parcel);
                    q2(readInt, intent2);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzc.zzb(parcel);
                    Z1(asInterface2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void B(boolean z10);

    void G0(Intent intent);

    void I2(boolean z10);

    void P1(IObjectWrapper iObjectWrapper);

    void U(boolean z10);

    boolean Y2();

    void Z1(IObjectWrapper iObjectWrapper);

    void q2(int i10, Intent intent);

    void w0(boolean z10);

    int zzb();

    int zzc();

    Bundle zzd();

    IFragmentWrapper zze();

    IFragmentWrapper zzf();

    IObjectWrapper zzg();

    IObjectWrapper zzh();

    IObjectWrapper zzi();

    String zzj();

    boolean zzs();

    boolean zzt();

    boolean zzu();

    boolean zzv();

    boolean zzw();

    boolean zzx();

    boolean zzy();

    boolean zzz();
}
