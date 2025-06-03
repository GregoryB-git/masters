package b8;

import android.os.Bundle;
import com.google.android.gms.internal.p002firebaseauthapi.zzaed;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.Map;

/* loaded from: classes.dex */
public final class b0 extends m.e {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f2035a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f2036b;

        public a(String str, FirebaseAuth firebaseAuth) {
            String str2;
            Bundle bundle = new Bundle();
            this.f2035a = bundle;
            Bundle bundle2 = new Bundle();
            this.f2036b = bundle2;
            u7.f fVar = firebaseAuth.f3057a;
            fVar.a();
            bundle.putString("com.google.firebase.auth.KEY_API_KEY", fVar.f15086c.f15096a);
            bundle.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str);
            bundle.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", bundle2);
            bundle.putString("com.google.firebase.auth.internal.CLIENT_VERSION", zzaed.zza().zzb());
            synchronized (firebaseAuth.f3065j) {
                str2 = firebaseAuth.f3066k;
            }
            bundle.putString("com.google.firebase.auth.KEY_TENANT_ID", str2);
            u7.f fVar2 = firebaseAuth.f3057a;
            fVar2.a();
            bundle.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", fVar2.f15085b);
            bundle.putString("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", firebaseAuth.B);
        }

        public final void a(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                this.f2036b.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public static a v(String str, FirebaseAuth firebaseAuth) {
        m6.j.e(str);
        m6.j.i(firebaseAuth);
        if (!Constants.SIGN_IN_METHOD_FACEBOOK.equals(str) || zzafm.zza(firebaseAuth.f3057a)) {
            return new a(str, firebaseAuth);
        }
        throw new IllegalArgumentException("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
    }
}
