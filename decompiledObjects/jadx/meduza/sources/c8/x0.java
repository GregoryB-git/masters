package c8;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class x0 implements Continuation<zzags, Task<IntegrityTokenResponse>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntegrityManager f2540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f2541c;

    public x0(y yVar, String str, IntegrityManager integrityManager) {
        this.f2539a = str;
        this.f2540b = integrityManager;
        this.f2541c = yVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<IntegrityTokenResponse> then(Task<zzags> task) {
        if (task.isSuccessful()) {
            this.f2541c.f2543a = task.getResult().zza();
            return this.f2540b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(task.getResult().zza())).setNonce(new String(Base64.encode(MessageDigest.getInstance("SHA-256").digest(this.f2539a.getBytes("UTF-8")), 11))).build());
        }
        y yVar = y.f2542b;
        Log.e("y", "Problem retrieving Play Integrity producer project:  " + task.getException().getMessage());
        return Tasks.forException(task.getException());
    }
}
