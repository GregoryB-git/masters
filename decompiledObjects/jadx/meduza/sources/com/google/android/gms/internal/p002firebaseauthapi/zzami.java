package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzami extends zzamn {
    private final /* synthetic */ zzamh zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzami(zzamh zzamhVar) {
        super(zzamhVar);
        this.zza = zzamhVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzamj(this.zza);
    }
}
