package c8;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.google.firebase.auth.internal.RecaptchaActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2410a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Uri f2411b;

    public /* synthetic */ b0(Uri uri, int i10) {
        this.f2410a = i10;
        this.f2411b = uri;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        switch (this.f2410a) {
            case 0:
                Uri uri = this.f2411b;
                u0 u0Var = GenericIdpActivity.f3105c;
                Uri.Builder buildUpon = uri.buildUpon();
                if (task.isSuccessful()) {
                    z7.a aVar = (z7.a) task.getResult();
                    if (aVar.a() != null) {
                        Log.w("GenericIdpActivity", "Error getting App Check token; using placeholder token instead. Error: " + String.valueOf(aVar.a()));
                    }
                    buildUpon.fragment("fac=" + aVar.b());
                } else {
                    Log.e("GenericIdpActivity", "Unexpected error getting App Check token: " + task.getException().getMessage());
                }
                return buildUpon.build();
            default:
                Uri uri2 = this.f2411b;
                u0 u0Var2 = RecaptchaActivity.f3108c;
                Uri.Builder buildUpon2 = uri2.buildUpon();
                if (task.isSuccessful()) {
                    z7.a aVar2 = (z7.a) task.getResult();
                    if (aVar2.a() != null) {
                        Log.w("RecaptchaActivity", "Error getting App Check token; using placeholder token instead. Error: " + String.valueOf(aVar2.a()));
                    }
                    buildUpon2.fragment("fac=" + aVar2.b());
                } else {
                    Log.e("RecaptchaActivity", "Unexpected error getting App Check token: " + task.getException().getMessage());
                }
                return buildUpon2.build();
        }
    }
}
