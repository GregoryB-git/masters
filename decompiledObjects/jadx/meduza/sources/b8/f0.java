package b8;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class f0 {
    private static final p6.a zza = new p6.a("PhoneAuthProvider", new String[0]);

    public void onCodeAutoRetrievalTimeOut(String str) {
        p6.a aVar = zza;
        Log.i(aVar.f13015a, aVar.d("Sms auto retrieval timed-out.", new Object[0]));
    }

    public void onCodeSent(String str, e0 e0Var) {
    }

    public abstract void onVerificationCompleted(c0 c0Var);

    public abstract void onVerificationFailed(u7.h hVar);
}
