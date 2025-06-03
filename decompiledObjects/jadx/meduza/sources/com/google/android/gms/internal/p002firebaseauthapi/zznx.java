package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class zznx {
    private ArrayList<zznw> zza = new ArrayList<>();
    private zznr zzb = zznr.zza;
    private Integer zzc = null;

    public final zznu zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.zzc;
        if (num != null) {
            int intValue = num.intValue();
            ArrayList<zznw> arrayList = this.zza;
            int size = arrayList.size();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                zznw zznwVar = arrayList.get(i10);
                i10++;
                if (zznwVar.zza() == intValue) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
        }
        zznu zznuVar = new zznu(this.zzb, Collections.unmodifiableList(this.zza), this.zzc);
        this.zza = null;
        return zznuVar;
    }

    public final zznx zza(int i10) {
        if (this.zza == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.zzc = Integer.valueOf(i10);
        return this;
    }

    public final zznx zza(zzbq zzbqVar, int i10, String str, String str2) {
        ArrayList<zznw> arrayList = this.zza;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new zznw(zzbqVar, i10, str, str2));
        return this;
    }

    public final zznx zza(zznr zznrVar) {
        if (this.zza == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.zzb = zznrVar;
        return this;
    }
}
