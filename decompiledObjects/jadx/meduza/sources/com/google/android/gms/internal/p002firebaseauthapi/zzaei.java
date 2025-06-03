package com.google.android.gms.internal.p002firebaseauthapi;

import b8.c0;
import b8.f;
import c8.p;
import c8.t;
import com.google.android.gms.common.api.Status;
import m6.j;

/* loaded from: classes.dex */
final class zzaei implements zzadm {
    public final /* synthetic */ zzaeg zza;

    public zzaei(zzaeg zzaegVar) {
        this.zza = zzaegVar;
    }

    private final void zza(Status status, f fVar, String str, String str2) {
        zzaeg.zza(this.zza, status);
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzn = fVar;
        zzaegVar.zzo = str;
        zzaegVar.zzp = str2;
        t tVar = zzaegVar.zzf;
        if (tVar != null) {
            tVar.zza(status);
        }
        this.zza.zza(status);
    }

    private final void zza(zzaen zzaenVar) {
        this.zza.zzi.execute(new zzaeo(this, zzaenVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza() {
        int i10 = this.zza.zza;
        j.k(i10 == 5, "Unexpected response type " + i10);
        zzaeg.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(c0 c0Var) {
        int i10 = this.zza.zza;
        j.k(i10 == 8, "Unexpected response type " + i10);
        this.zza.zzu = true;
        zza(new zzaej(this, c0Var));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(Status status) {
        String str = status.f2817b;
        if (str != null) {
            if (str.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081, null, null, null);
            } else if (str.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082, null, null, null);
            } else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083, null, null, null);
            } else if (str.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084, null, null, null);
            } else if (str.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085, null, null, null);
            } else if (str.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086, null, null, null);
            } else if (str.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087, null, null, null);
            } else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088, null, null, null);
            } else if (str.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089, null, null, null);
            } else if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090, null, null, null);
            }
        }
        zzaeg zzaegVar = this.zza;
        if (zzaegVar.zza == 8) {
            zzaegVar.zzu = true;
            zza(new zzael(this, status));
        } else {
            zzaeg.zza(zzaegVar, status);
            this.zza.zza(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(Status status, c0 c0Var) {
        int i10 = this.zza.zza;
        j.k(i10 == 2, "Unexpected response type " + i10);
        zza(status, c0Var, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzafw zzafwVar) {
        int i10 = this.zza.zza;
        j.k(i10 == 3, "Unexpected response type " + i10);
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzl = zzafwVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzags zzagsVar) {
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzs = zzagsVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzagt zzagtVar) {
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzr = zzagtVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzagw zzagwVar) {
        int i10 = this.zza.zza;
        j.k(i10 == 1, "Unexpected response type: " + i10);
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzj = zzagwVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzagw zzagwVar, zzagl zzaglVar) {
        int i10 = this.zza.zza;
        j.k(i10 == 2, "Unexpected response type: " + i10);
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzj = zzagwVar;
        zzaegVar.zzk = zzaglVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzahg zzahgVar) {
        int i10 = this.zza.zza;
        j.k(i10 == 4, "Unexpected response type " + i10);
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzm = zzahgVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzahh zzahhVar) {
        zzaeg.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzahs zzahsVar) {
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzt = zzahsVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzzs zzzsVar) {
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzq = zzzsVar;
        zzaegVar.zza(p.a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzzt zzztVar) {
        zza(zzztVar.zza(), zzztVar.zzb(), zzztVar.zzc(), zzztVar.zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(String str) {
        int i10 = this.zza.zza;
        j.k(i10 == 8, "Unexpected response type " + i10);
        this.zza.zzu = true;
        zza(new zzaem(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zzb() {
        int i10 = this.zza.zza;
        j.k(i10 == 6, "Unexpected response type " + i10);
        zzaeg.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zzb(String str) {
        int i10 = this.zza.zza;
        j.k(i10 == 8, "Unexpected response type " + i10);
        zza(new zzaek(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zzc() {
        int i10 = this.zza.zza;
        j.k(i10 == 9, "Unexpected response type " + i10);
        zzaeg.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zzc(String str) {
        int i10 = this.zza.zza;
        j.k(i10 == 7, "Unexpected response type " + i10);
        zzaeg.zza(this.zza);
    }
}
