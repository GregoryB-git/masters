package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import b.a0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import k6.a;
import k6.d;
import l6.n;
import l6.q;
import m6.j;
import z5.b;
import z5.i;

/* loaded from: classes.dex */
final class zzab extends d implements zzg {
    private static final a.g zza;
    private static final a.AbstractC0130a zzb;
    private static final a zzc;
    private static final p6.a zzd;
    private final Context zze;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzv zzvVar = new zzv();
        zzb = zzvVar;
        zzc = new a("GoogleAuthService.API", zzvVar, gVar);
        zzd = new p6.a("Auth", "GoogleAuthServiceClient");
    }

    public zzab(Context context) {
        super(context, (a<a.d.c>) zzc, a.d.f9096j, d.a.f9097c);
        this.zze = context;
    }

    public static void zzf(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.D() ? taskCompletionSource.trySetResult(obj) : taskCompletionSource.trySetException(a0.r(status))) {
            return;
        }
        zzd.f("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zza(final zzbw zzbwVar) {
        q.a aVar = new q.a();
        aVar.f9716c = new j6.d[]{i.f17807c};
        aVar.f9714a = new n() { // from class: com.google.android.gms.internal.auth.zzt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l6.n
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzd(new zzx(zzabVar, (TaskCompletionSource) obj2), zzbwVar);
            }
        };
        aVar.f9717d = 1513;
        return doWrite(aVar.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzb(final b bVar) {
        if (bVar == null) {
            throw new NullPointerException("request cannot be null.");
        }
        q.a aVar = new q.a();
        aVar.f9716c = new j6.d[]{i.f17806b};
        aVar.f9714a = new n() { // from class: com.google.android.gms.internal.auth.zzu
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l6.n
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                b bVar2 = bVar;
                ((zzp) ((zzi) obj).getService()).zze(new zzz(zzabVar, (TaskCompletionSource) obj2), bVar2);
            }
        };
        aVar.f9717d = 1515;
        return doWrite(aVar.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzc(final Account account, final String str, final Bundle bundle) {
        if (account == null) {
            throw new NullPointerException("Account name cannot be null!");
        }
        j.f("Scope cannot be null!", str);
        q.a aVar = new q.a();
        aVar.f9716c = new j6.d[]{i.f17807c};
        aVar.f9714a = new n() { // from class: com.google.android.gms.internal.auth.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l6.n
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzf(new zzw(zzabVar, (TaskCompletionSource) obj2), account, str, bundle);
            }
        };
        aVar.f9717d = 1512;
        return doWrite(aVar.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzd(final Account account) {
        if (account == null) {
            throw new NullPointerException("account cannot be null.");
        }
        q.a aVar = new q.a();
        aVar.f9716c = new j6.d[]{i.f17806b};
        aVar.f9714a = new n() { // from class: com.google.android.gms.internal.auth.zzr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l6.n
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzg(new zzaa(zzabVar, (TaskCompletionSource) obj2), account);
            }
        };
        aVar.f9717d = 1517;
        return doWrite(aVar.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zze(final String str) {
        if (str == null) {
            throw new NullPointerException("Client package name cannot be null!");
        }
        q.a aVar = new q.a();
        aVar.f9716c = new j6.d[]{i.f17806b};
        aVar.f9714a = new n() { // from class: com.google.android.gms.internal.auth.zzq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l6.n
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzh(new zzy(zzabVar, (TaskCompletionSource) obj2), str);
            }
        };
        aVar.f9717d = 1514;
        return doWrite(aVar.a());
    }
}
