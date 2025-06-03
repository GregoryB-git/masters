package b8;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public final class l1 extends c8.i0<Void> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f2112b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f2113c;

    public l1(FirebaseAuth firebaseAuth, String str, c cVar) {
        this.f2111a = str;
        this.f2112b = cVar;
        this.f2113c = firebaseAuth;
    }

    @Override // c8.i0
    public final Task<Void> b(String str) {
        String str2;
        StringBuilder sb2;
        if (TextUtils.isEmpty(str)) {
            String str3 = this.f2111a;
            sb2 = new StringBuilder("Password reset request ");
            sb2.append(str3);
            str2 = " with empty reCAPTCHA token";
        } else {
            str2 = this.f2111a;
            sb2 = new StringBuilder("Got reCAPTCHA token for password reset of email ");
        }
        sb2.append(str2);
        Log.i("FirebaseAuth", sb2.toString());
        FirebaseAuth firebaseAuth = this.f2113c;
        return firebaseAuth.f3061e.zza(firebaseAuth.f3057a, this.f2111a, this.f2112b, firebaseAuth.f3066k, str);
    }
}
