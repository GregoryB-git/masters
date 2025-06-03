package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import b8.f0;
import b8.r;
import c8.t;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import l6.g;
import m6.j;
import u7.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzaeg<ResultT, CallbackT> implements zzaer<ResultT> {
    public final int zza;
    public f zzc;
    public r zzd;
    public CallbackT zze;
    public t zzf;
    public zzaeh<ResultT> zzg;
    public Executor zzi;
    public zzagw zzj;
    public zzagl zzk;
    public zzafw zzl;
    public zzahg zzm;
    public b8.f zzn;
    public String zzo;
    public String zzp;
    public zzzs zzq;
    public zzagt zzr;
    public zzags zzs;
    public zzahs zzt;
    private boolean zzu;
    public final zzaei zzb = new zzaei(this);
    public final List<f0> zzh = new ArrayList();

    public static class zza extends l6.f {
        private final List<f0> zza;

        private zza(g gVar, List<f0> list) {
            super(gVar);
            this.mLifecycleFragment.c("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<f0> list) {
            g fragment = l6.f.getFragment(activity);
            if (((zza) fragment.a(zza.class, "PhoneAuthActivityStopCallback")) == null) {
                new zza(fragment, list);
            }
        }

        @Override // l6.f
        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzaeg(int i10) {
        this.zza = i10;
    }

    public static /* synthetic */ void zza(zzaeg zzaegVar) {
        zzaegVar.zzb();
        j.k(zzaegVar.zzu, "no success or failure set on method implementation");
    }

    public static /* synthetic */ void zza(zzaeg zzaegVar, Status status) {
        t tVar = zzaegVar.zzf;
        if (tVar != null) {
            tVar.zza(status);
        }
    }

    public final zzaeg<ResultT, CallbackT> zza(f0 f0Var, Activity activity, Executor executor, String str) {
        f0 zza2 = zzafc.zza(str, f0Var, this);
        synchronized (this.zzh) {
            List<f0> list = this.zzh;
            j.i(zza2);
            list.add(zza2);
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        j.i(executor);
        this.zzi = executor;
        return this;
    }

    public final zzaeg<ResultT, CallbackT> zza(r rVar) {
        if (rVar == null) {
            throw new NullPointerException("firebaseUser cannot be null");
        }
        this.zzd = rVar;
        return this;
    }

    public final void zza(Status status) {
        this.zzu = true;
        this.zzg.zza(null, status);
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzu = true;
        this.zzg.zza(resultt, null);
    }

    public final zzaeg<ResultT, CallbackT> zza(t tVar) {
        if (tVar == null) {
            throw new NullPointerException("external failure callback cannot be null");
        }
        this.zzf = tVar;
        return this;
    }

    public final zzaeg<ResultT, CallbackT> zza(CallbackT callbackt) {
        if (callbackt == null) {
            throw new NullPointerException("external callback cannot be null");
        }
        this.zze = callbackt;
        return this;
    }

    public final zzaeg<ResultT, CallbackT> zza(f fVar) {
        if (fVar == null) {
            throw new NullPointerException("firebaseApp cannot be null");
        }
        this.zzc = fVar;
        return this;
    }
}
