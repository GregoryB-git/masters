package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import android.text.TextUtils;
import b8.c;
import b8.c0;
import b8.f0;
import b8.g;
import b8.g0;
import b8.h;
import b8.h0;
import b8.j0;
import b8.k0;
import b8.p0;
import b8.r;
import b8.s;
import c8.e;
import c8.i;
import c8.k;
import c8.n;
import c8.s0;
import c8.t;
import c8.u;
import c8.z0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import m6.j;
import u7.f;
import x6.b;

/* loaded from: classes.dex */
public final class zzabq extends zzaep {
    public zzabq(f fVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzado(fVar, scheduledExecutorService);
        this.zzb = executor;
    }

    public static i zza(f fVar, zzagl zzaglVar) {
        j.i(fVar);
        j.i(zzaglVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new e(zzaglVar));
        List<zzahc> zzl = zzaglVar.zzl();
        if (zzl != null && !zzl.isEmpty()) {
            for (int i10 = 0; i10 < zzl.size(); i10++) {
                arrayList.add(new e(zzl.get(i10)));
            }
        }
        i iVar = new i(fVar, arrayList);
        iVar.f2460q = new k(zzaglVar.zzb(), zzaglVar.zza());
        iVar.f2461r = zzaglVar.zzn();
        iVar.f2462s = zzaglVar.zze();
        iVar.P(b.G0(zzaglVar.zzk()));
        iVar.N(zzaglVar.zzd());
        return iVar;
    }

    public final Task<zzags> zza() {
        return zza(new zzaca());
    }

    public final Task<Void> zza(r rVar, u uVar) {
        return zza((zzabx) new zzabx().zza(rVar).zza((zzaeg<Void, u>) uVar).zza((t) uVar));
    }

    public final Task<zzahs> zza(n nVar, String str) {
        return zza(new zzada(nVar, str));
    }

    public final Task<Void> zza(n nVar, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, String str5, boolean z12, f0 f0Var, Executor executor, Activity activity) {
        zzadb zzadbVar = new zzadb(nVar, str, str2, j10, z10, z11, str3, str4, str5, z12);
        zzadbVar.zza(f0Var, activity, executor, str);
        return zza(zzadbVar);
    }

    public final Task<Void> zza(String str) {
        return zza(new zzacs(str));
    }

    public final Task<zzagt> zza(String str, String str2) {
        return zza(new zzacd(str, str2));
    }

    public final Task<Void> zza(String str, String str2, String str3, String str4) {
        return zza(new zzacr(str, str2, str3, str4));
    }

    public final Task<g> zza(f fVar, c0 c0Var, String str, z0 z0Var) {
        zzafc.zza();
        return zza((zzacy) new zzacy(c0Var, str).zza(fVar).zza((zzaeg<g, z0>) z0Var));
    }

    public final Task<Void> zza(f fVar, c cVar, String str) {
        return zza((zzacq) new zzacq(str, cVar).zza(fVar));
    }

    public final Task<g> zza(f fVar, b8.f fVar2, String str, z0 z0Var) {
        return zza((zzacu) new zzacu(fVar2, str).zza(fVar).zza((zzaeg<g, z0>) z0Var));
    }

    public final Task<Void> zza(f fVar, g0 g0Var, r rVar, String str, z0 z0Var) {
        zzafc.zza();
        zzabz zzabzVar = new zzabz(g0Var, rVar.zze(), str, null);
        zzabzVar.zza(fVar).zza((zzaeg<Void, z0>) z0Var);
        return zza(zzabzVar);
    }

    public final Task<g> zza(f fVar, h hVar, String str, z0 z0Var) {
        return zza((zzacz) new zzacz(hVar, str).zza(fVar).zza((zzaeg<g, z0>) z0Var));
    }

    public final Task<Void> zza(f fVar, k0 k0Var, r rVar, String str, String str2, z0 z0Var) {
        zzabz zzabzVar = new zzabz(k0Var, rVar.zze(), str, str2);
        zzabzVar.zza(fVar).zza((zzaeg<Void, z0>) z0Var);
        return zza(zzabzVar);
    }

    public final Task<Void> zza(f fVar, r rVar, c0 c0Var, s0 s0Var) {
        zzafc.zza();
        return zza((zzadj) new zzadj(c0Var).zza(fVar).zza(rVar).zza((zzaeg<Void, z0>) s0Var).zza((t) s0Var));
    }

    public final Task<Void> zza(f fVar, r rVar, c0 c0Var, String str, s0 s0Var) {
        zzafc.zza();
        return zza((zzacm) new zzacm(c0Var, str).zza(fVar).zza(rVar).zza((zzaeg<Void, z0>) s0Var).zza((t) s0Var));
    }

    public final Task<g> zza(f fVar, r rVar, g0 g0Var, String str, z0 z0Var) {
        zzafc.zza();
        zzaby zzabyVar = new zzaby(g0Var, str, null);
        zzabyVar.zza(fVar).zza((zzaeg<g, z0>) z0Var);
        if (rVar != null) {
            zzabyVar.zza(rVar);
        }
        return zza(zzabyVar);
    }

    public final Task<Void> zza(f fVar, r rVar, h hVar, String str, s0 s0Var) {
        return zza((zzaci) new zzaci(hVar, str).zza(fVar).zza(rVar).zza((zzaeg<Void, z0>) s0Var).zza((t) s0Var));
    }

    public final Task<g> zza(f fVar, r rVar, k0 k0Var, String str, String str2, z0 z0Var) {
        zzaby zzabyVar = new zzaby(k0Var, str, str2);
        zzabyVar.zza(fVar).zza((zzaeg<g, z0>) z0Var);
        if (rVar != null) {
            zzabyVar.zza(rVar);
        }
        return zza(zzabyVar);
    }

    public final Task<Void> zza(f fVar, r rVar, p0 p0Var, s0 s0Var) {
        return zza((zzadi) new zzadi(p0Var).zza(fVar).zza(rVar).zza((zzaeg<Void, z0>) s0Var).zza((t) s0Var));
    }

    public final Task<Void> zza(f fVar, r rVar, s0 s0Var) {
        return zza((zzaco) new zzaco().zza(fVar).zza(rVar).zza((zzaeg<Void, z0>) s0Var).zza((t) s0Var));
    }

    public final Task<s> zza(f fVar, r rVar, String str, s0 s0Var) {
        return zza((zzacb) new zzacb(str).zza(fVar).zza(rVar).zza((zzaeg<s, z0>) s0Var).zza((t) s0Var));
    }

    public final Task<Void> zza(f fVar, r rVar, String str, String str2, s0 s0Var) {
        return zza((zzadc) new zzadc(rVar.zze(), str, str2).zza(fVar).zza(rVar).zza((zzaeg<Void, z0>) s0Var).zza((t) s0Var));
    }

    public final Task<Void> zza(f fVar, r rVar, String str, String str2, String str3, String str4, s0 s0Var) {
        return zza((zzack) new zzack(str, str2, str3, str4).zza(fVar).zza(rVar).zza((zzaeg<Void, z0>) s0Var).zza((t) s0Var));
    }

    public final Task<g> zza(f fVar, z0 z0Var, String str) {
        return zza((zzacv) new zzacv(str).zza(fVar).zza((zzaeg<g, z0>) z0Var));
    }

    public final Task<Void> zza(f fVar, String str, String str2) {
        return zza((zzabt) new zzabt(str, str2).zza(fVar));
    }

    public final Task<g> zza(f fVar, String str, String str2, z0 z0Var) {
        return zza((zzacx) new zzacx(str, str2).zza(fVar).zza((zzaeg<g, z0>) z0Var));
    }

    public final Task<Void> zza(f fVar, String str, String str2, String str3) {
        return zza((zzabv) new zzabv(str, str2, str3).zza(fVar));
    }

    public final Task<g> zza(f fVar, String str, String str2, String str3, String str4, z0 z0Var) {
        return zza((zzabu) new zzabu(str, str2, str3, str4).zza(fVar).zza((zzaeg<g, z0>) z0Var));
    }

    public final void zza(f fVar, zzahk zzahkVar, f0 f0Var, Activity activity, Executor executor) {
        zza((zzadn) new zzadn(zzahkVar).zza(fVar).zza(f0Var, activity, executor, zzahkVar.zzd()));
    }

    public final Task<g> zzb(f fVar, r rVar, c0 c0Var, String str, s0 s0Var) {
        zzafc.zza();
        return zza((zzacp) new zzacp(c0Var, str).zza(fVar).zza(rVar).zza((zzaeg<g, z0>) s0Var).zza((t) s0Var));
    }

    public final Task<Void> zzb(f fVar, r rVar, b8.f fVar2, String str, s0 s0Var) {
        return zza((zzacg) new zzacg(fVar2, str).zza(fVar).zza(rVar).zza((zzaeg<Void, z0>) s0Var).zza((t) s0Var));
    }

    public final Task<g> zzb(f fVar, r rVar, h hVar, String str, s0 s0Var) {
        return zza((zzacl) new zzacl(hVar, str).zza(fVar).zza(rVar).zza((zzaeg<g, z0>) s0Var).zza((t) s0Var));
    }

    public final Task<g> zzb(f fVar, r rVar, String str, s0 s0Var) {
        j.i(fVar);
        j.e(str);
        j.i(rVar);
        j.i(s0Var);
        List<String> zzg = rVar.zzg();
        if ((zzg != null && !zzg.contains(str)) || rVar.H()) {
            return Tasks.forException(zzadr.zza(new Status(17016, str, null, null)));
        }
        str.getClass();
        return !str.equals("password") ? zza((zzade) new zzade(str).zza(fVar).zza(rVar).zza((zzaeg<g, z0>) s0Var).zza((t) s0Var)) : zza((zzadf) new zzadf().zza(fVar).zza(rVar).zza((zzaeg<g, z0>) s0Var).zza((t) s0Var));
    }

    public final Task<g> zzb(f fVar, r rVar, String str, String str2, String str3, String str4, s0 s0Var) {
        return zza((zzacn) new zzacn(str, str2, str3, str4).zza(fVar).zza(rVar).zza((zzaeg<g, z0>) s0Var).zza((t) s0Var));
    }

    public final Task<b8.b> zzb(f fVar, String str, String str2) {
        return zza((zzabs) new zzabs(str, str2).zza(fVar));
    }

    public final Task<g> zzb(f fVar, String str, String str2, String str3, String str4, z0 z0Var) {
        return zza((zzacw) new zzacw(str, str2, str3, str4).zza(fVar).zza((zzaeg<g, z0>) z0Var));
    }

    public final Task<g> zzc(f fVar, r rVar, b8.f fVar2, String str, s0 s0Var) {
        return zza((zzacj) new zzacj(fVar2, str).zza(fVar).zza(rVar).zza((zzaeg<g, z0>) s0Var).zza((t) s0Var));
    }

    public final Task<Void> zzc(f fVar, r rVar, String str, s0 s0Var) {
        return zza((zzadh) new zzadh(str).zza(fVar).zza(rVar).zza((zzaeg<Void, z0>) s0Var).zza((t) s0Var));
    }

    public final Task<j0> zzc(f fVar, String str, String str2) {
        return zza((zzabw) new zzabw(str, str2).zza(fVar));
    }

    public final Task<Void> zzd(f fVar, r rVar, String str, s0 s0Var) {
        return zza((zzadg) new zzadg(str).zza(fVar).zza(rVar).zza((zzaeg<Void, z0>) s0Var).zza((t) s0Var));
    }

    public final Task<String> zzd(f fVar, String str, String str2) {
        return zza((zzadk) new zzadk(str, str2).zza(fVar));
    }

    public final Task<Void> zzb(f fVar, String str, c cVar, String str2, String str3) {
        cVar.f2044q = 6;
        return zza((zzact) new zzact(str, cVar, str2, str3, "sendSignInLinkToEmail").zza(fVar));
    }

    public final Task<Void> zza(n nVar, h0 h0Var, String str, long j10, boolean z10, boolean z11, String str2, String str3, String str4, boolean z12, f0 f0Var, Executor executor, Activity activity) {
        String str5 = nVar.f2491b;
        j.e(str5);
        zzadd zzaddVar = new zzadd(h0Var, str5, str, j10, z10, z11, str2, str3, str4, z12);
        zzaddVar.zza(f0Var, activity, executor, h0Var.f2085a);
        return zza(zzaddVar);
    }

    public final Task<Void> zza(String str, String str2, c cVar) {
        cVar.f2044q = 7;
        return zza(new zzadl(str, str2, cVar));
    }

    public final Task<g> zza(f fVar, r rVar, b8.f fVar2, String str, s0 s0Var) {
        j.i(fVar);
        j.i(fVar2);
        j.i(rVar);
        j.i(s0Var);
        List<String> zzg = rVar.zzg();
        if (zzg != null && zzg.contains(fVar2.D())) {
            return Tasks.forException(zzadr.zza(new Status(17015, null, null, null)));
        }
        if (fVar2 instanceof h) {
            h hVar = (h) fVar2;
            return !(TextUtils.isEmpty(hVar.f2082c) ^ true) ? zza((zzacc) new zzacc(hVar, str).zza(fVar).zza(rVar).zza((zzaeg<g, z0>) s0Var).zza((t) s0Var)) : zza((zzach) new zzach(hVar).zza(fVar).zza(rVar).zza((zzaeg<g, z0>) s0Var).zza((t) s0Var));
        }
        if (!(fVar2 instanceof c0)) {
            return zza((zzacf) new zzacf(fVar2).zza(fVar).zza(rVar).zza((zzaeg<g, z0>) s0Var).zza((t) s0Var));
        }
        zzafc.zza();
        return zza((zzace) new zzace((c0) fVar2).zza(fVar).zza(rVar).zza((zzaeg<g, z0>) s0Var).zza((t) s0Var));
    }

    public final Task<Void> zza(f fVar, String str, c cVar, String str2, String str3) {
        cVar.f2044q = 1;
        return zza((zzact) new zzact(str, cVar, str2, str3, "sendPasswordResetEmail").zza(fVar));
    }
}
