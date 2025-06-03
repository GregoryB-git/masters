package io.flutter.plugins.firebase.auth;

import b8.k0;
import b8.m0;
import b8.o1;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class FlutterFirebaseTotpMultiFactor implements GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final Map<String, m0> multiFactorSecret = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$generateSecret$0(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (!task.isSuccessful()) {
            b.a(task, result);
            return;
        }
        m0 m0Var = (m0) task.getResult();
        multiFactorSecret.put(m0Var.h(), m0Var);
        result.success(new GeneratedAndroidFirebaseAuth.PigeonTotpSecret.Builder().setCodeIntervalSeconds(Long.valueOf(m0Var.f())).setCodeLength(Long.valueOf(m0Var.b())).setSecretKey(m0Var.h()).setHashingAlgorithm(m0Var.a()).setEnrollmentCompletionDeadline(Long.valueOf(m0Var.e())).build());
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi
    public void generateSecret(String str, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonTotpSecret> result) {
        b8.z zVar = FlutterFirebaseMultiFactor.multiFactorSessionMap.get(str);
        m6.j.i(zVar);
        c8.n nVar = (c8.n) zVar;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(nVar.f2494e.K());
        firebaseAuth.getClass();
        firebaseAuth.f3061e.zza(nVar, firebaseAuth.f3066k).continueWithTask(new o1(firebaseAuth)).addOnCompleteListener(new e(result, 4));
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi
    public void getAssertionForEnrollment(String str, String str2, GeneratedAndroidFirebaseAuth.Result<String> result) {
        m0 m0Var = multiFactorSecret.get(str);
        m6.j.i(str2);
        m6.j.i(m0Var);
        k0 k0Var = new k0(str2, m0Var, null);
        String uuid = UUID.randomUUID().toString();
        FlutterFirebaseMultiFactor.multiFactorAssertionMap.put(uuid, k0Var);
        result.success(uuid);
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi
    public void getAssertionForSignIn(String str, String str2, GeneratedAndroidFirebaseAuth.Result<String> result) {
        m6.j.i(str2);
        m6.j.i(str);
        k0 k0Var = new k0(str2, null, str);
        String uuid = UUID.randomUUID().toString();
        FlutterFirebaseMultiFactor.multiFactorAssertionMap.put(uuid, k0Var);
        result.success(uuid);
    }
}
