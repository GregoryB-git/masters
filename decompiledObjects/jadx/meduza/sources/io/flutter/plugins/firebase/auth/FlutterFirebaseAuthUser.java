package io.flutter.plugins.firebase.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import b8.b0;
import b8.c0;
import b8.n1;
import b8.r;
import c8.f0;
import c8.s0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzadr;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuth.c;
import com.google.firebase.auth.internal.GenericIdpActivity;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.util.ArrayList;
import java.util.Map;
import v3.x0;

/* loaded from: classes.dex */
public class FlutterFirebaseAuthUser implements GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi {
    private Activity activity;

    public static r getCurrentUserFromPigeon(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(u7.f.f(authPigeonFirebaseApp.getAppName()));
        if (authPigeonFirebaseApp.getTenantId() != null) {
            String tenantId = authPigeonFirebaseApp.getTenantId();
            firebaseAuth.getClass();
            m6.j.e(tenantId);
            synchronized (firebaseAuth.f3065j) {
                firebaseAuth.f3066k = tenantId;
            }
        }
        return firebaseAuth.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$delete$0(GeneratedAndroidFirebaseAuth.VoidResult voidResult, Task task) {
        if (task.isSuccessful()) {
            voidResult.success();
        } else {
            voidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$getIdToken$1(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result result, Boolean bool) {
        r currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
            return;
        }
        try {
            result.success(PigeonParser.parseTokenResult((b8.s) Tasks.await(FirebaseAuth.getInstance(currentUserFromPigeon.K()).j(currentUserFromPigeon, bool.booleanValue()))));
        } catch (Exception e10) {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$linkWithCredential$2(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((b8.g) task.getResult()));
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$linkWithProvider$3(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((b8.g) task.getResult()));
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$reauthenticateWithCredential$4(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((b8.g) task.getResult()));
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$reauthenticateWithProvider$5(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((b8.g) task.getResult()));
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$reload$6(GeneratedAndroidFirebaseAuth.Result result, r rVar, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseFirebaseUser(rVar));
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendEmailVerification$7(GeneratedAndroidFirebaseAuth.VoidResult voidResult, Task task) {
        if (task.isSuccessful()) {
            voidResult.success();
        } else {
            voidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendEmailVerification$8(GeneratedAndroidFirebaseAuth.VoidResult voidResult, Task task) {
        if (task.isSuccessful()) {
            voidResult.success();
        } else {
            voidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$unlink$9(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((b8.g) task.getResult()));
        } else {
            Exception exception = task.getException();
            result.error(exception.getMessage().contains("User was not linked to an account with the given provider.") ? FlutterFirebaseAuthPluginException.noSuchProvider() : FlutterFirebaseAuthPluginException.parserExceptionToFlutter(exception));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateEmail$10(GeneratedAndroidFirebaseAuth.Result result, r rVar, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseFirebaseUser(rVar));
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateEmail$11(r rVar, GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            rVar.I().addOnCompleteListener(new l(0, result, rVar));
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePassword$12(GeneratedAndroidFirebaseAuth.Result result, r rVar, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseFirebaseUser(rVar));
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePassword$13(r rVar, GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            rVar.I().addOnCompleteListener(new m(0, rVar, result));
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePhoneNumber$14(GeneratedAndroidFirebaseAuth.Result result, r rVar, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseFirebaseUser(rVar));
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePhoneNumber$15(r rVar, GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            rVar.I().addOnCompleteListener(new m(1, rVar, result));
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateProfile$16(GeneratedAndroidFirebaseAuth.Result result, r rVar, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseFirebaseUser(rVar));
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateProfile$17(r rVar, GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            rVar.I().addOnCompleteListener(new n(result, rVar));
        } else {
            b.a(task, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$verifyBeforeUpdateEmail$18(GeneratedAndroidFirebaseAuth.VoidResult voidResult, Task task) {
        if (task.isSuccessful()) {
            voidResult.success();
        } else {
            voidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$verifyBeforeUpdateEmail$19(GeneratedAndroidFirebaseAuth.VoidResult voidResult, Task task) {
        if (task.isSuccessful()) {
            voidResult.success();
        } else {
            voidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void delete(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.VoidResult voidResult) {
        r currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            voidResult.error(FlutterFirebaseAuthPluginException.noUser());
            return;
        }
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(currentUserFromPigeon.K());
        firebaseAuth.getClass();
        firebaseAuth.f3061e.zza(currentUserFromPigeon, new n1(firebaseAuth, currentUserFromPigeon)).addOnCompleteListener(new h(voidResult, 2));
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void getIdToken(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, Boolean bool, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonIdTokenResult> result) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new x0(authPigeonFirebaseApp, result, bool, 9));
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void linkWithCredential(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, Map<String, Object> map, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        r currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        b8.f credential = PigeonParser.getCredential(map);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else if (credential == null) {
            result.error(FlutterFirebaseAuthPluginException.invalidCredential());
        } else {
            FirebaseAuth.getInstance(currentUserFromPigeon.K()).i(currentUserFromPigeon, credential).addOnCompleteListener(new e(result, 3));
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void linkWithProvider(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonSignInProvider pigeonSignInProvider, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        boolean z10;
        Task task;
        r currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        b0.a v10 = b0.v(pigeonSignInProvider.getProviderId(), FirebaseAuth.getInstance());
        if (pigeonSignInProvider.getScopes() != null) {
            v10.f2035a.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(pigeonSignInProvider.getScopes()));
        }
        if (pigeonSignInProvider.getCustomParameters() != null) {
            v10.a(pigeonSignInProvider.getCustomParameters());
        }
        Activity activity = this.activity;
        Bundle bundle = v10.f2035a;
        currentUserFromPigeon.getClass();
        m6.j.i(activity);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(currentUserFromPigeon.K());
        firebaseAuth.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        c8.w wVar = firebaseAuth.t.f2526b;
        if (wVar.f2531a) {
            z10 = false;
        } else {
            wVar.b(activity, new c8.z(wVar, activity, taskCompletionSource, firebaseAuth, currentUserFromPigeon));
            z10 = true;
            wVar.f2531a = true;
        }
        if (z10) {
            f0.c(activity.getApplicationContext(), firebaseAuth, currentUserFromPigeon);
            Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
            intent.setClass(activity, GenericIdpActivity.class);
            intent.setPackage(activity.getPackageName());
            intent.putExtras(bundle);
            activity.startActivity(intent);
            task = taskCompletionSource.getTask();
        } else {
            task = Tasks.forException(zzadr.zza(new Status(17057, null, null, null)));
        }
        task.addOnCompleteListener(new i(result, 3));
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void reauthenticateWithCredential(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, Map<String, Object> map, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        r currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        b8.f credential = PigeonParser.getCredential(map);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else if (credential == null) {
            result.error(FlutterFirebaseAuthPluginException.invalidCredential());
        } else {
            FirebaseAuth.getInstance(currentUserFromPigeon.K()).r(currentUserFromPigeon, credential).addOnCompleteListener(new i(result, 2));
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void reauthenticateWithProvider(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonSignInProvider pigeonSignInProvider, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        boolean z10;
        Task task;
        r currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        b0.a v10 = b0.v(pigeonSignInProvider.getProviderId(), FirebaseAuth.getInstance());
        if (pigeonSignInProvider.getScopes() != null) {
            v10.f2035a.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(pigeonSignInProvider.getScopes()));
        }
        if (pigeonSignInProvider.getCustomParameters() != null) {
            v10.a(pigeonSignInProvider.getCustomParameters());
        }
        Activity activity = this.activity;
        Bundle bundle = v10.f2035a;
        currentUserFromPigeon.getClass();
        m6.j.i(activity);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(currentUserFromPigeon.K());
        firebaseAuth.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        c8.w wVar = firebaseAuth.t.f2526b;
        if (wVar.f2531a) {
            z10 = false;
        } else {
            wVar.b(activity, new c8.z(wVar, activity, taskCompletionSource, firebaseAuth, currentUserFromPigeon));
            z10 = true;
            wVar.f2531a = true;
        }
        if (z10) {
            f0.c(activity.getApplicationContext(), firebaseAuth, currentUserFromPigeon);
            Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
            intent.setClass(activity, GenericIdpActivity.class);
            intent.setPackage(activity.getPackageName());
            intent.putExtras(bundle);
            activity.startActivity(intent);
            task = taskCompletionSource.getTask();
        } else {
            task = Tasks.forException(zzadr.zza(new Status(17057, null, null, null)));
        }
        task.addOnCompleteListener(new e(result, 2));
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void reload(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> result) {
        r currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else {
            currentUserFromPigeon.I().addOnCompleteListener(new k(result, currentUserFromPigeon));
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void sendEmailVerification(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings pigeonActionCodeSettings, GeneratedAndroidFirebaseAuth.VoidResult voidResult) {
        r currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            voidResult.error(FlutterFirebaseAuthPluginException.noUser());
        } else if (pigeonActionCodeSettings == null) {
            FirebaseAuth.getInstance(currentUserFromPigeon.K()).j(currentUserFromPigeon, false).continueWithTask(new g.s(currentUserFromPigeon, 7)).addOnCompleteListener(new g(voidResult, 2));
        } else {
            FirebaseAuth.getInstance(currentUserFromPigeon.K()).j(currentUserFromPigeon, false).continueWithTask(new r4.c(currentUserFromPigeon, PigeonParser.getActionCodeSettings(pigeonActionCodeSettings), 3)).addOnCompleteListener(new h(voidResult, 1));
        }
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [c8.s0, com.google.firebase.auth.FirebaseAuth$c] */
    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void unlink(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        r currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
            return;
        }
        m6.j.e(str);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(currentUserFromPigeon.K());
        firebaseAuth.getClass();
        m6.j.e(str);
        firebaseAuth.f3061e.zzb(firebaseAuth.f3057a, currentUserFromPigeon, str, firebaseAuth.new c()).addOnCompleteListener(new i(result, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [c8.s0, com.google.firebase.auth.FirebaseAuth$c] */
    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void updateEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> result) {
        r currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
            return;
        }
        m6.j.e(str);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(currentUserFromPigeon.K());
        firebaseAuth.getClass();
        m6.j.e(str);
        firebaseAuth.f3061e.zzc(firebaseAuth.f3057a, currentUserFromPigeon, str, firebaseAuth.new c()).addOnCompleteListener(new k(currentUserFromPigeon, result));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [c8.s0, com.google.firebase.auth.FirebaseAuth$c] */
    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void updatePassword(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> result) {
        r currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
            return;
        }
        m6.j.e(str);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(currentUserFromPigeon.K());
        firebaseAuth.getClass();
        m6.j.e(str);
        firebaseAuth.f3061e.zzd(firebaseAuth.f3057a, currentUserFromPigeon, str, firebaseAuth.new c()).addOnCompleteListener(new n(0, currentUserFromPigeon, result));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [c8.s0, com.google.firebase.auth.FirebaseAuth$c] */
    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void updatePhoneNumber(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, Map<String, Object> map, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> result) {
        r currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
            return;
        }
        c0 c0Var = (c0) PigeonParser.getCredential(map);
        if (c0Var == null) {
            result.error(FlutterFirebaseAuthPluginException.invalidCredential());
            return;
        }
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(currentUserFromPigeon.K());
        firebaseAuth.getClass();
        firebaseAuth.f3061e.zza(firebaseAuth.f3057a, currentUserFromPigeon, (c0) c0Var.F(), (s0) firebaseAuth.new c()).addOnCompleteListener(new l(2, currentUserFromPigeon, (GeneratedAndroidFirebaseAuth.Result) result));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Type inference failed for: r3v2, types: [c8.s0, com.google.firebase.auth.FirebaseAuth$c] */
    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateProfile(io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp r7, io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonUserProfile r8, io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result<io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonUserDetails> r9) {
        /*
            r6 = this;
            b8.r r7 = getCurrentUserFromPigeon(r7)
            if (r7 != 0) goto Le
            io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth$FlutterError r7 = io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPluginException.noUser()
            r9.error(r7)
            return
        Le:
            java.lang.Boolean r0 = r8.getDisplayNameChanged()
            boolean r0 = r0.booleanValue()
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L25
            java.lang.String r0 = r8.getDisplayName()
            if (r0 != 0) goto L23
            r4 = r2
            goto L26
        L23:
            r4 = r1
            goto L27
        L25:
            r4 = r1
        L26:
            r0 = r3
        L27:
            java.lang.Boolean r5 = r8.getPhotoUrlChanged()
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L42
            java.lang.String r5 = r8.getPhotoUrl()
            if (r5 == 0) goto L41
            java.lang.String r8 = r8.getPhotoUrl()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            if (r8 != 0) goto L43
        L41:
            r1 = r2
        L42:
            r8 = r3
        L43:
            b8.p0 r5 = new b8.p0
            if (r8 != 0) goto L48
            goto L4c
        L48:
            java.lang.String r3 = r8.toString()
        L4c:
            r5.<init>(r0, r3, r4, r1)
            u7.f r8 = r7.K()
            com.google.firebase.auth.FirebaseAuth r8 = com.google.firebase.auth.FirebaseAuth.getInstance(r8)
            r8.getClass()
            com.google.android.gms.internal.firebase-auth-api.zzabq r0 = r8.f3061e
            u7.f r1 = r8.f3057a
            com.google.firebase.auth.FirebaseAuth$c r3 = new com.google.firebase.auth.FirebaseAuth$c
            r3.<init>()
            com.google.android.gms.tasks.Task r8 = r0.zza(r1, r7, r5, r3)
            io.flutter.plugins.firebase.auth.l r0 = new io.flutter.plugins.firebase.auth.l
            r0.<init>(r2, r7, r9)
            r8.addOnCompleteListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.firebase.auth.FlutterFirebaseAuthUser.updateProfile(io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth$AuthPigeonFirebaseApp, io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth$PigeonUserProfile, io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth$Result):void");
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void verifyBeforeUpdateEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings pigeonActionCodeSettings, GeneratedAndroidFirebaseAuth.VoidResult voidResult) {
        r currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            voidResult.error(FlutterFirebaseAuthPluginException.noUser());
            return;
        }
        int i10 = 0;
        if (pigeonActionCodeSettings == null) {
            FirebaseAuth.getInstance(currentUserFromPigeon.K()).j(currentUserFromPigeon, false).continueWithTask(new r3.a0(currentUserFromPigeon, str, (b8.c) null)).addOnCompleteListener(new h(voidResult, 3));
        } else {
            FirebaseAuth.getInstance(currentUserFromPigeon.K()).j(currentUserFromPigeon, false).continueWithTask(new r3.a0(currentUserFromPigeon, str, PigeonParser.getActionCodeSettings(pigeonActionCodeSettings))).addOnCompleteListener(new o(voidResult, i10));
        }
    }
}
