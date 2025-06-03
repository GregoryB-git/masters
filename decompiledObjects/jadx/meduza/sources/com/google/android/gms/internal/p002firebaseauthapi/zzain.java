package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzain;
import com.google.android.gms.internal.p002firebaseauthapi.zzaip;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class zzain<MessageType extends zzain<MessageType, BuilderType>, BuilderType extends zzaip<MessageType, BuilderType>> implements zzaln {
    public int zza = 0;

    public int zza(zzamc zzamcVar) {
        int zzi = zzi();
        if (zzi != -1) {
            return zzi;
        }
        int zza = zzamcVar.zza(this);
        zzb(zza);
        return zza;
    }

    public final void zza(OutputStream outputStream) {
        zzajo zza = zzajo.zza(outputStream, zzajo.zzd(zzl()));
        zza(zza);
        zza.zzc();
    }

    void zzb(int i10) {
        throw new UnsupportedOperationException();
    }

    int zzi() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaln
    public final zzaiw zzj() {
        try {
            zzajf zzc = zzaiw.zzc(zzl());
            zza(zzc.zzb());
            return zzc.zza();
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    public final byte[] zzk() {
        try {
            byte[] bArr = new byte[zzl()];
            zzajo zzb = zzajo.zzb(bArr);
            zza(zzb);
            zzb.zzb();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}
