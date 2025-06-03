package com.google.android.gms.tasks;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l6.f;
import l6.g;

/* loaded from: classes.dex */
final class zzv extends f {
    private final List zza;

    private zzv(g gVar) {
        super(gVar);
        this.zza = new ArrayList();
        this.mLifecycleFragment.c("TaskOnStopCallback", this);
    }

    public static zzv zza(Activity activity) {
        zzv zzvVar;
        g fragment = f.getFragment(activity);
        synchronized (fragment) {
            zzvVar = (zzv) fragment.a(zzv.class, "TaskOnStopCallback");
            if (zzvVar == null) {
                zzvVar = new zzv(fragment);
            }
        }
        return zzvVar;
    }

    @Override // l6.f
    public final void onStop() {
        synchronized (this.zza) {
            Iterator it = this.zza.iterator();
            while (it.hasNext()) {
                zzq zzqVar = (zzq) ((WeakReference) it.next()).get();
                if (zzqVar != null) {
                    zzqVar.zzc();
                }
            }
            this.zza.clear();
        }
    }

    public final void zzb(zzq zzqVar) {
        synchronized (this.zza) {
            this.zza.add(new WeakReference(zzqVar));
        }
    }
}
