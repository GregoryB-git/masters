package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Comparator;

/* loaded from: classes.dex */
final class zzaiy implements Comparator<zzaiw> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzaiw zzaiwVar, zzaiw zzaiwVar2) {
        zzaiw zzaiwVar3 = zzaiwVar;
        zzaiw zzaiwVar4 = zzaiwVar2;
        zzajc zzajcVar = (zzajc) zzaiwVar3.iterator();
        zzajc zzajcVar2 = (zzajc) zzaiwVar4.iterator();
        while (zzajcVar.hasNext() && zzajcVar2.hasNext()) {
            int compare = Integer.compare(zzaiw.zza(zzajcVar.zza()), zzaiw.zza(zzajcVar2.zza()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzaiwVar3.zzb(), zzaiwVar4.zzb());
    }
}
