package b8;

import com.google.android.gms.internal.p002firebaseauthapi.zzahs;
import com.google.android.gms.internal.p002firebaseauthapi.zzahy;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public final class o1 implements Continuation<zzahs, Task<m0>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f2122a;

    public o1(FirebaseAuth firebaseAuth) {
        this.f2122a = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<m0> then(Task<zzahs> task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            m6.j.i(exception);
            return Tasks.forException(exception);
        }
        zzahs result = task.getResult();
        if (!(result instanceof zzahy)) {
            throw new IllegalArgumentException(a0.j.j("Response should be an instance of StartTotpMfaEnrollmentResponse but was ", result.getClass().getName(), "."));
        }
        zzahy zzahyVar = (zzahy) result;
        String zzf = zzahyVar.zzf();
        m6.j.e(zzf);
        String zze = zzahyVar.zze();
        m6.j.e(zze);
        int zzc = zzahyVar.zzc();
        int zzb = zzahyVar.zzb();
        long zzd = zzahyVar.zzd();
        String zza = zzahyVar.zza();
        m6.j.e(zza);
        return Tasks.forResult(new c8.t0(zzf, zze, zzc, zzb, zzd, zza, this.f2122a));
    }
}
