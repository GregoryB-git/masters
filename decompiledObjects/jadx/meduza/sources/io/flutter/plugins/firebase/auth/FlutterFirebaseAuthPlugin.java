package io.flutter.plugins.firebase.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import b8.b0;
import b8.c0;
import b8.h0;
import b8.j0;
import b8.m1;
import b8.r;
import c8.f0;
import c8.k1;
import c8.r0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzadr;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuth.d;
import com.google.firebase.auth.internal.GenericIdpActivity;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class FlutterFirebaseAuthPlugin implements FlutterFirebasePlugin, FlutterPlugin, ActivityAware, GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String METHOD_CHANNEL_NAME = "plugins.flutter.io/firebase_auth";
    public static final HashMap<Integer, b8.f> authCredentials = new HashMap<>();
    private Activity activity;
    private MethodChannel channel;
    private BinaryMessenger messenger;
    private final Map<EventChannel, EventChannel.StreamHandler> streamHandlers = new HashMap();
    private final FlutterFirebaseAuthUser firebaseAuthUser = new FlutterFirebaseAuthUser();
    private final FlutterFirebaseMultiFactor firebaseMultiFactor = new FlutterFirebaseMultiFactor();
    private final FlutterFirebaseTotpMultiFactor firebaseTotpMultiFactor = new FlutterFirebaseTotpMultiFactor();
    private final FlutterFirebaseTotpSecret firebaseTotpSecret = new FlutterFirebaseTotpSecret();

    private Activity getActivity() {
        return this.activity;
    }

    public static FirebaseAuth getAuthFromPigeon(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(u7.f.f(authPigeonFirebaseApp.getAppName()));
        if (authPigeonFirebaseApp.getTenantId() != null) {
            String tenantId = authPigeonFirebaseApp.getTenantId();
            firebaseAuth.getClass();
            m6.j.e(tenantId);
            synchronized (firebaseAuth.f3065j) {
                firebaseAuth.f3066k = tenantId;
            }
        }
        String str = FlutterFirebaseCorePlugin.customAuthDomain.get(authPigeonFirebaseApp.getAppName());
        if (str != null) {
            firebaseAuth.f(str);
        }
        if (authPigeonFirebaseApp.getCustomAuthDomain() != null) {
            firebaseAuth.f(authPigeonFirebaseApp.getCustomAuthDomain());
        }
        return firebaseAuth;
    }

    private void initInstance(BinaryMessenger binaryMessenger) {
        FlutterFirebasePluginRegistry.registerPlugin(METHOD_CHANNEL_NAME, this);
        this.channel = new MethodChannel(binaryMessenger, METHOD_CHANNEL_NAME);
        GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(binaryMessenger, this);
        GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.p(binaryMessenger, this.firebaseAuthUser);
        GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.g(binaryMessenger, this.firebaseMultiFactor);
        GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi.CC.c(binaryMessenger, this.firebaseMultiFactor);
        GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.CC.e(binaryMessenger, this.firebaseTotpMultiFactor);
        GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi.CC.d(binaryMessenger, this.firebaseTotpSecret);
        this.messenger = binaryMessenger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$applyActionCode$0(GeneratedAndroidFirebaseAuth.VoidResult voidResult, Task task) {
        if (task.isSuccessful()) {
            voidResult.success();
        } else {
            voidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$checkActionCode$1(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseActionCodeResult((b8.b) task.getResult()));
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$confirmPasswordReset$2(GeneratedAndroidFirebaseAuth.VoidResult voidResult, Task task) {
        if (task.isSuccessful()) {
            voidResult.success();
        } else {
            voidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createUserWithEmailAndPassword$3(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((b8.g) task.getResult()));
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$didReinitializeFirebaseCore$17(TaskCompletionSource taskCompletionSource) {
        try {
            removeEventListeners();
            authCredentials.clear();
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fetchSignInMethodsForEmail$10(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(((j0) task.getResult()).a());
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$getPluginConstantsForFirebaseApp$16(u7.f fVar, TaskCompletionSource taskCompletionSource) {
        String str;
        try {
            HashMap hashMap = new HashMap();
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(fVar);
            r rVar = firebaseAuth.f;
            synchronized (firebaseAuth.f3063h) {
                str = firebaseAuth.f3064i;
            }
            GeneratedAndroidFirebaseAuth.PigeonUserDetails parseFirebaseUser = rVar == null ? null : PigeonParser.parseFirebaseUser(rVar);
            if (str != null) {
                hashMap.put("APP_LANGUAGE_CODE", str);
            }
            if (parseFirebaseUser != null) {
                hashMap.put("APP_CURRENT_USER", PigeonParser.manuallyToList(parseFirebaseUser));
            }
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendPasswordResetEmail$11(GeneratedAndroidFirebaseAuth.VoidResult voidResult, Task task) {
        if (task.isSuccessful()) {
            voidResult.success();
        } else {
            voidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendPasswordResetEmail$12(GeneratedAndroidFirebaseAuth.VoidResult voidResult, Task task) {
        if (task.isSuccessful()) {
            voidResult.success();
        } else {
            voidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendSignInLinkToEmail$13(GeneratedAndroidFirebaseAuth.VoidResult voidResult, Task task) {
        if (task.isSuccessful()) {
            voidResult.success();
        } else {
            voidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$signInAnonymously$4(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((b8.g) task.getResult()));
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$signInWithCredential$5(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((b8.g) task.getResult()));
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$signInWithCustomToken$6(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((b8.g) task.getResult()));
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$signInWithEmailAndPassword$7(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((b8.g) task.getResult()));
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$signInWithEmailLink$8(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((b8.g) task.getResult()));
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$signInWithProvider$9(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((b8.g) task.getResult()));
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$verifyPasswordResetCode$14(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success((String) task.getResult());
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$verifyPhoneNumber$15(c0 c0Var) {
        authCredentials.put(Integer.valueOf(c0Var.hashCode()), c0Var);
    }

    private void removeEventListeners() {
        for (EventChannel eventChannel : this.streamHandlers.keySet()) {
            EventChannel.StreamHandler streamHandler = this.streamHandlers.get(eventChannel);
            if (streamHandler != null) {
                streamHandler.onCancel(null);
            }
            eventChannel.setStreamHandler(null);
        }
        this.streamHandlers.clear();
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void applyActionCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.VoidResult voidResult) {
        FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
        authFromPigeon.getClass();
        m6.j.e(str);
        authFromPigeon.f3061e.zza(authFromPigeon.f3057a, str, authFromPigeon.f3066k).addOnCompleteListener(new d(voidResult, 1));
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void checkActionCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo> result) {
        FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
        authFromPigeon.getClass();
        m6.j.e(str);
        authFromPigeon.f3061e.zzb(authFromPigeon.f3057a, str, authFromPigeon.f3066k).addOnCompleteListener(new j(result, 0));
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void confirmPasswordReset(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, String str2, GeneratedAndroidFirebaseAuth.VoidResult voidResult) {
        FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
        authFromPigeon.getClass();
        m6.j.e(str);
        m6.j.e(str2);
        authFromPigeon.f3061e.zza(authFromPigeon.f3057a, str, str2, authFromPigeon.f3066k).addOnCompleteListener(new g(voidResult, 1));
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void createUserWithEmailAndPassword(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, String str2, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
        authFromPigeon.getClass();
        m6.j.e(str);
        m6.j.e(str2);
        new com.google.firebase.auth.e(authFromPigeon, str, str2).a(authFromPigeon, authFromPigeon.f3066k, authFromPigeon.f3070o).addOnCompleteListener(new c(result, 0));
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new w.g(28, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void fetchSignInMethodsForEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.Result<List<String>> result) {
        FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
        authFromPigeon.getClass();
        m6.j.e(str);
        authFromPigeon.f3061e.zzc(authFromPigeon.f3057a, str, authFromPigeon.f3066k).addOnCompleteListener(new j(result, 1));
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(u7.f fVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(fVar, taskCompletionSource, 0));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        Activity activity = activityPluginBinding.getActivity();
        this.activity = activity;
        this.firebaseAuthUser.setActivity(activity);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.activity = null;
        this.firebaseAuthUser.setActivity(null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.activity = null;
        this.firebaseAuthUser.setActivity(null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.channel.setMethodCallHandler(null);
        GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(this.messenger, null);
        GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.p(this.messenger, null);
        GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.g(this.messenger, null);
        GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi.CC.c(this.messenger, null);
        GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.CC.e(this.messenger, null);
        GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi.CC.d(this.messenger, null);
        this.channel = null;
        this.messenger = null;
        removeEventListeners();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        Activity activity = activityPluginBinding.getActivity();
        this.activity = activity;
        this.firebaseAuthUser.setActivity(activity);
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void registerAuthStateListener(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<String> result) {
        try {
            FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
            AuthStateChannelStreamHandler authStateChannelStreamHandler = new AuthStateChannelStreamHandler(authFromPigeon);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("plugins.flutter.io/firebase_auth/auth-state/");
            u7.f fVar = authFromPigeon.f3057a;
            fVar.a();
            sb2.append(fVar.f15085b);
            String sb3 = sb2.toString();
            EventChannel eventChannel = new EventChannel(this.messenger, sb3);
            eventChannel.setStreamHandler(authStateChannelStreamHandler);
            this.streamHandlers.put(eventChannel, authStateChannelStreamHandler);
            result.success(sb3);
        } catch (Exception e10) {
            result.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void registerIdTokenListener(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<String> result) {
        try {
            FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
            IdTokenChannelStreamHandler idTokenChannelStreamHandler = new IdTokenChannelStreamHandler(authFromPigeon);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("plugins.flutter.io/firebase_auth/id-token/");
            u7.f fVar = authFromPigeon.f3057a;
            fVar.a();
            sb2.append(fVar.f15085b);
            String sb3 = sb2.toString();
            EventChannel eventChannel = new EventChannel(this.messenger, sb3);
            eventChannel.setStreamHandler(idTokenChannelStreamHandler);
            this.streamHandlers.put(eventChannel, idTokenChannelStreamHandler);
            result.success(sb3);
        } catch (Exception e10) {
            result.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void revokeTokenWithAuthorizationCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.VoidResult voidResult) {
        voidResult.success();
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void sendPasswordResetEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings pigeonActionCodeSettings, GeneratedAndroidFirebaseAuth.VoidResult voidResult) {
        Task<Void> e10;
        OnCompleteListener<Void> hVar;
        FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
        int i10 = 0;
        if (pigeonActionCodeSettings == null) {
            authFromPigeon.getClass();
            m6.j.e(str);
            e10 = authFromPigeon.e(str, null);
            hVar = new g(voidResult, i10);
        } else {
            e10 = authFromPigeon.e(str, PigeonParser.getActionCodeSettings(pigeonActionCodeSettings));
            hVar = new h(voidResult, i10);
        }
        e10.addOnCompleteListener(hVar);
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void sendSignInLinkToEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings pigeonActionCodeSettings, GeneratedAndroidFirebaseAuth.VoidResult voidResult) {
        FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
        b8.c actionCodeSettings = PigeonParser.getActionCodeSettings(pigeonActionCodeSettings);
        authFromPigeon.getClass();
        m6.j.e(str);
        m6.j.i(actionCodeSettings);
        if (!actionCodeSettings.f2042o) {
            throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
        }
        String str2 = authFromPigeon.f3064i;
        if (str2 != null) {
            actionCodeSettings.f2043p = str2;
        }
        new m1(authFromPigeon, str, actionCodeSettings).a(authFromPigeon, authFromPigeon.f3066k, authFromPigeon.f3068m).addOnCompleteListener(new d(voidResult, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setLanguageCode(io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp r2, java.lang.String r3, io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result<java.lang.String> r4) {
        /*
            r1 = this;
            com.google.firebase.auth.FirebaseAuth r2 = getAuthFromPigeon(r2)     // Catch: java.lang.Exception -> L30
            if (r3 != 0) goto L14
            java.lang.Object r3 = r2.f3063h     // Catch: java.lang.Exception -> L30
            monitor-enter(r3)     // Catch: java.lang.Exception -> L30
            java.lang.String r0 = com.google.android.gms.internal.p002firebaseauthapi.zzaee.zza()     // Catch: java.lang.Throwable -> L11
            r2.f3064i = r0     // Catch: java.lang.Throwable -> L11
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            goto L20
        L11:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            throw r2     // Catch: java.lang.Exception -> L30
        L14:
            r2.getClass()     // Catch: java.lang.Exception -> L30
            m6.j.e(r3)     // Catch: java.lang.Exception -> L30
            java.lang.Object r0 = r2.f3063h     // Catch: java.lang.Exception -> L30
            monitor-enter(r0)     // Catch: java.lang.Exception -> L30
            r2.f3064i = r3     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
        L20:
            java.lang.Object r3 = r2.f3063h     // Catch: java.lang.Exception -> L30
            monitor-enter(r3)     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = r2.f3064i     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
            r4.success(r2)     // Catch: java.lang.Exception -> L30
            goto L34
        L2a:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
            throw r2     // Catch: java.lang.Exception -> L30
        L2d:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r2     // Catch: java.lang.Exception -> L30
        L30:
            r2 = move-exception
            r4.error(r2)
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin.setLanguageCode(io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth$AuthPigeonFirebaseApp, java.lang.String, io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth$Result):void");
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void setSettings(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonFirebaseAuthSettings pigeonFirebaseAuthSettings, GeneratedAndroidFirebaseAuth.VoidResult voidResult) {
        try {
            FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
            authFromPigeon.f3062g.f2442c = pigeonFirebaseAuthSettings.getAppVerificationDisabledForTesting().booleanValue();
            if (pigeonFirebaseAuthSettings.getForceRecaptchaFlow() != null) {
                authFromPigeon.f3062g.f2443d = pigeonFirebaseAuthSettings.getForceRecaptchaFlow().booleanValue();
            }
            if (pigeonFirebaseAuthSettings.getPhoneNumber() != null && pigeonFirebaseAuthSettings.getSmsCode() != null) {
                c8.f fVar = authFromPigeon.f3062g;
                String phoneNumber = pigeonFirebaseAuthSettings.getPhoneNumber();
                String smsCode = pigeonFirebaseAuthSettings.getSmsCode();
                fVar.f2440a = phoneNumber;
                fVar.f2441b = smsCode;
            }
            voidResult.success();
        } catch (Exception e10) {
            voidResult.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void signInAnonymously(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        Task<b8.g> zza;
        FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
        r rVar = authFromPigeon.f;
        if (rVar == null || !rVar.H()) {
            zza = authFromPigeon.f3061e.zza(authFromPigeon.f3057a, authFromPigeon.new d(), authFromPigeon.f3066k);
        } else {
            c8.i iVar = (c8.i) authFromPigeon.f;
            iVar.f2461r = false;
            zza = Tasks.forResult(new k1(iVar));
        }
        zza.addOnCompleteListener(new i(result, 1));
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void signInWithCredential(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, Map<String, Object> map, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
        b8.f credential = PigeonParser.getCredential(map);
        if (credential == null) {
            throw FlutterFirebaseAuthPluginException.invalidCredential();
        }
        authFromPigeon.g(credential).addOnCompleteListener(new c(result, 2));
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void signInWithCustomToken(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
        authFromPigeon.getClass();
        m6.j.e(str);
        authFromPigeon.f3061e.zza(authFromPigeon.f3057a, str, authFromPigeon.f3066k, authFromPigeon.new d()).addOnCompleteListener(new c(result, 3));
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void signInWithEmailAndPassword(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, String str2, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
        authFromPigeon.getClass();
        m6.j.e(str);
        m6.j.e(str2);
        authFromPigeon.k(str, str2, authFromPigeon.f3066k, null, false).addOnCompleteListener(new c(result, 1));
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void signInWithEmailLink(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, String str2, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
        authFromPigeon.getClass();
        authFromPigeon.g(va.a.c(str, str2)).addOnCompleteListener(new e(result, 1));
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void signInWithProvider(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonSignInProvider pigeonSignInProvider, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        boolean z10;
        Task task;
        FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
        b0.a v10 = b0.v(pigeonSignInProvider.getProviderId(), authFromPigeon);
        if (pigeonSignInProvider.getScopes() != null) {
            v10.f2035a.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(pigeonSignInProvider.getScopes()));
        }
        if (pigeonSignInProvider.getCustomParameters() != null) {
            v10.a(pigeonSignInProvider.getCustomParameters());
        }
        Activity activity = getActivity();
        Bundle bundle = v10.f2035a;
        m6.j.i(activity);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        c8.w wVar = authFromPigeon.t.f2526b;
        int i10 = 0;
        if (wVar.f2531a) {
            z10 = false;
        } else {
            wVar.b(activity, new c8.z(wVar, activity, taskCompletionSource, authFromPigeon, null));
            z10 = true;
            wVar.f2531a = true;
        }
        if (z10) {
            f0.b(activity.getApplicationContext(), authFromPigeon);
            Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
            intent.setClass(activity, GenericIdpActivity.class);
            intent.setPackage(activity.getPackageName());
            intent.putExtras(bundle);
            activity.startActivity(intent);
            task = taskCompletionSource.getTask();
        } else {
            task = Tasks.forException(zzadr.zza(new Status(17057, null, null, null)));
        }
        task.addOnCompleteListener(new e(result, i10));
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void signOut(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.VoidResult voidResult) {
        Map<String, b8.v> map;
        try {
            FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
            if (authFromPigeon.f != null && (map = FlutterFirebaseMultiFactor.multiFactorUserMap.get(authPigeonFirebaseApp.getAppName())) != null) {
                map.remove(authFromPigeon.f.a());
            }
            authFromPigeon.s();
            r0 r0Var = authFromPigeon.f3078x;
            if (r0Var != null) {
                c8.r rVar = r0Var.f2515b;
                rVar.f2513e.removeCallbacks(rVar.f);
            }
            voidResult.success();
        } catch (Exception e10) {
            voidResult.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void useEmulator(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, Long l10, GeneratedAndroidFirebaseAuth.VoidResult voidResult) {
        try {
            FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
            int intValue = l10.intValue();
            authFromPigeon.getClass();
            m6.j.e(str);
            m6.j.a("Port number must be in the range 0-65535", intValue >= 0 && intValue <= 65535);
            zzafm.zza(authFromPigeon.f3057a, str, intValue);
            voidResult.success();
        } catch (Exception e10) {
            voidResult.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void verifyPasswordResetCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.Result<String> result) {
        FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
        authFromPigeon.getClass();
        m6.j.e(str);
        authFromPigeon.f3061e.zzd(authFromPigeon.f3057a, str, authFromPigeon.f3066k).addOnCompleteListener(new i(result, 0));
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void verifyPhoneNumber(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonVerifyPhoneNumberRequest pigeonVerifyPhoneNumberRequest, GeneratedAndroidFirebaseAuth.Result<String> result) {
        try {
            String str = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
            EventChannel eventChannel = new EventChannel(this.messenger, str);
            h0 h0Var = null;
            b8.z zVar = pigeonVerifyPhoneNumberRequest.getMultiFactorSessionId() != null ? FlutterFirebaseMultiFactor.multiFactorSessionMap.get(pigeonVerifyPhoneNumberRequest.getMultiFactorSessionId()) : null;
            String multiFactorInfoId = pigeonVerifyPhoneNumberRequest.getMultiFactorInfoId();
            if (multiFactorInfoId != null) {
                Iterator<String> it = FlutterFirebaseMultiFactor.multiFactorResolverMap.keySet().iterator();
                while (it.hasNext()) {
                    Iterator it2 = FlutterFirebaseMultiFactor.multiFactorResolverMap.get(it.next()).E().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            b8.x xVar = (b8.x) it2.next();
                            if (xVar.a().equals(multiFactorInfoId) && (xVar instanceof h0)) {
                                h0Var = (h0) xVar;
                                break;
                            }
                        }
                    }
                }
            }
            PhoneNumberVerificationStreamHandler phoneNumberVerificationStreamHandler = new PhoneNumberVerificationStreamHandler(getActivity(), authPigeonFirebaseApp, pigeonVerifyPhoneNumberRequest, zVar, h0Var, new b());
            eventChannel.setStreamHandler(phoneNumberVerificationStreamHandler);
            this.streamHandlers.put(eventChannel, phoneNumberVerificationStreamHandler);
            result.success(str);
        } catch (Exception e10) {
            result.error(e10);
        }
    }
}
