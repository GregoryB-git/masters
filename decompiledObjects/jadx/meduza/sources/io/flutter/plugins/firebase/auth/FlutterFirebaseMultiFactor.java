package io.flutter.plugins.firebase.auth;

import b8.c0;
import b8.g0;
import b8.r;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class FlutterFirebaseMultiFactor implements GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi, GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final Map<String, Map<String, b8.v>> multiFactorUserMap = new HashMap();
    public static final Map<String, b8.z> multiFactorSessionMap = new HashMap();
    public static final Map<String, b8.y> multiFactorResolverMap = new HashMap();
    public static final Map<String, b8.w> multiFactorAssertionMap = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$enrollPhone$0(GeneratedAndroidFirebaseAuth.VoidResult voidResult, Task task) {
        if (task.isSuccessful()) {
            voidResult.success();
        } else {
            voidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$enrollTotp$1(GeneratedAndroidFirebaseAuth.VoidResult voidResult, Task task) {
        if (task.isSuccessful()) {
            voidResult.success();
        } else {
            voidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getSession$2(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (!task.isSuccessful()) {
            b.a(task, result);
            return;
        }
        b8.z zVar = (b8.z) task.getResult();
        String uuid = UUID.randomUUID().toString();
        multiFactorSessionMap.put(uuid, zVar);
        result.success(new GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession.Builder().setId(uuid).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$resolveSignIn$4(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((b8.g) task.getResult()));
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$unenroll$3(GeneratedAndroidFirebaseAuth.VoidResult voidResult, Task task) {
        if (task.isSuccessful()) {
            voidResult.success();
        } else {
            voidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi
    public void enrollPhone(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion pigeonPhoneMultiFactorAssertion, String str, GeneratedAndroidFirebaseAuth.VoidResult voidResult) {
        try {
            getAppMultiFactor(authPigeonFirebaseApp).a(new g0(c0.G(pigeonPhoneMultiFactorAssertion.getVerificationId(), pigeonPhoneMultiFactorAssertion.getVerificationCode())), str).addOnCompleteListener(new d(voidResult, 2));
        } catch (z9.a e10) {
            voidResult.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi
    public void enrollTotp(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, String str2, GeneratedAndroidFirebaseAuth.VoidResult voidResult) {
        try {
            getAppMultiFactor(authPigeonFirebaseApp).a(multiFactorAssertionMap.get(str), str2).addOnCompleteListener(new h(voidResult, 4));
        } catch (z9.a e10) {
            voidResult.error(e10);
        }
    }

    public b8.v getAppMultiFactor(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp) {
        r currentUserFromPigeon = FlutterFirebaseAuthUser.getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            throw new z9.a("No user is signed in");
        }
        Map<String, Map<String, b8.v>> map = multiFactorUserMap;
        if (map.get(authPigeonFirebaseApp.getAppName()) == null) {
            map.put(authPigeonFirebaseApp.getAppName(), new HashMap());
        }
        Map<String, b8.v> map2 = map.get(authPigeonFirebaseApp.getAppName());
        if (map2.get(currentUserFromPigeon.a()) == null) {
            map2.put(currentUserFromPigeon.a(), currentUserFromPigeon.E());
        }
        return map2.get(currentUserFromPigeon.a());
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi
    public void getEnrolledFactors(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<List<GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo>> result) {
        try {
            result.success(PigeonParser.multiFactorInfoToPigeon(getAppMultiFactor(authPigeonFirebaseApp).b()));
        } catch (z9.a e10) {
            result.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi
    public void getSession(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession> result) {
        try {
            getAppMultiFactor(authPigeonFirebaseApp).c().addOnCompleteListener(new c(result, 4));
        } catch (z9.a e10) {
            result.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi
    public void resolveSignIn(String str, GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion pigeonPhoneMultiFactorAssertion, String str2, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        b8.y yVar = multiFactorResolverMap.get(str);
        if (yVar == null) {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(new Exception("Resolver not found")));
        } else {
            yVar.G(pigeonPhoneMultiFactorAssertion != null ? new g0(c0.G(pigeonPhoneMultiFactorAssertion.getVerificationId(), pigeonPhoneMultiFactorAssertion.getVerificationCode())) : multiFactorAssertionMap.get(str2)).addOnCompleteListener(new i(result, 5));
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi
    public void unenroll(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.VoidResult voidResult) {
        try {
            getAppMultiFactor(authPigeonFirebaseApp).d(str).addOnCompleteListener(new g(voidResult, 3));
        } catch (z9.a e10) {
            voidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(e10));
        }
    }
}
