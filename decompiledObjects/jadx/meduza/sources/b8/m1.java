package b8;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public final class m1 extends c8.i0<Void> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f2115b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f2116c;

    public m1(FirebaseAuth firebaseAuth, String str, c cVar) {
        this.f2114a = str;
        this.f2115b = cVar;
        this.f2116c = firebaseAuth;
    }

    @Override // c8.i0
    public final Task<Void> b(String str) {
        String str2;
        StringBuilder sb2;
        if (TextUtils.isEmpty(str)) {
            String str3 = this.f2114a;
            sb2 = new StringBuilder("Email link sign in for ");
            sb2.append(str3);
            str2 = " with empty reCAPTCHA token";
        } else {
            str2 = this.f2114a;
            sb2 = new StringBuilder("Got reCAPTCHA token for email link sign in for ");
        }
        sb2.append(str2);
        Log.i("FirebaseAuth", sb2.toString());
        FirebaseAuth firebaseAuth = this.f2116c;
        return firebaseAuth.f3061e.zzb(firebaseAuth.f3057a, this.f2114a, this.f2115b, firebaseAuth.f3066k, str);
    }
}
