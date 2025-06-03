package io.flutter.plugins.googlesignin;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import b.a0;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.auth.zzdc;
import com.google.android.gms.internal.auth.zzg;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.internal.auth.zzhw;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h6.n;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.auth.Constants;
import io.flutter.plugins.firebase.auth.o;
import io.flutter.plugins.googlesignin.GoogleSignInPlugin;
import io.flutter.plugins.googlesignin.Messages;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import m6.j;
import n7.i;
import z5.l;

/* loaded from: classes.dex */
public class GoogleSignInPlugin implements FlutterPlugin, ActivityAware {
    private ActivityPluginBinding activityPluginBinding;
    private Delegate delegate;
    private BinaryMessenger messenger;

    /* renamed from: io.flutter.plugins.googlesignin.GoogleSignInPlugin$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$googlesignin$Messages$SignInType;

        static {
            int[] iArr = new int[Messages.SignInType.values().length];
            $SwitchMap$io$flutter$plugins$googlesignin$Messages$SignInType = iArr;
            try {
                iArr[Messages.SignInType.GAMES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlesignin$Messages$SignInType[Messages.SignInType.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class Delegate implements IDelegate, PluginRegistry.ActivityResultListener, Messages.GoogleSignInApi {
        private static final String DEFAULT_GAMES_SIGN_IN = "SignInOption.games";
        private static final String DEFAULT_SIGN_IN = "SignInOption.standard";
        private static final String ERROR_FAILURE_TO_RECOVER_AUTH = "failed_to_recover_auth";
        private static final String ERROR_REASON_EXCEPTION = "exception";
        private static final String ERROR_REASON_NETWORK_ERROR = "network_error";
        private static final String ERROR_REASON_SIGN_IN_CANCELED = "sign_in_canceled";
        private static final String ERROR_REASON_SIGN_IN_FAILED = "sign_in_failed";
        private static final String ERROR_REASON_SIGN_IN_REQUIRED = "sign_in_required";
        private static final String ERROR_REASON_STATUS = "status";
        private static final String ERROR_USER_RECOVERABLE_AUTH = "user_recoverable_auth";
        private static final int REQUEST_CODE_RECOVER_AUTH = 53294;
        public static final int REQUEST_CODE_REQUEST_SCOPE = 53295;
        private static final int REQUEST_CODE_SIGNIN = 53293;
        private Activity activity;
        private final BackgroundTaskRunner backgroundTaskRunner = new BackgroundTaskRunner(1);
        private final Context context;
        private final GoogleSignInWrapper googleSignInWrapper;
        private PendingOperation pendingOperation;
        private List<String> requestedScopes;
        private g6.a signInClient;

        public static class PendingOperation {
            public static final /* synthetic */ boolean $assertionsDisabled = false;
            public final Messages.Result<Boolean> boolResult;
            public final Object data;
            public final String method;
            public final Messages.Result<String> stringResult;
            public final Messages.Result<Messages.UserData> userDataResult;
            public final Messages.Result<Void> voidResult;

            public PendingOperation(String str, Messages.Result<Messages.UserData> result, Messages.Result<Void> result2, Messages.Result<Boolean> result3, Messages.Result<String> result4, Object obj) {
                this.method = str;
                this.userDataResult = result;
                this.voidResult = result2;
                this.boolResult = result3;
                this.stringResult = result4;
                this.data = obj;
            }
        }

        public Delegate(Context context, GoogleSignInWrapper googleSignInWrapper) {
            this.context = context;
            this.googleSignInWrapper = googleSignInWrapper;
        }

        private void checkAndSetPendingAccessTokenOperation(String str, Messages.Result<String> result, Object obj) {
            checkAndSetPendingStringOperation(str, result, obj);
        }

        private void checkAndSetPendingBoolOperation(String str, Messages.Result<Boolean> result) {
            checkAndSetPendingOperation(str, null, null, result, null, null);
        }

        private void checkAndSetPendingOperation(String str, Messages.Result<Messages.UserData> result, Messages.Result<Void> result2, Messages.Result<Boolean> result3, Messages.Result<String> result4, Object obj) {
            if (this.pendingOperation == null) {
                this.pendingOperation = new PendingOperation(str, result, result2, result3, result4, obj);
                return;
            }
            StringBuilder l10 = defpackage.f.l("Concurrent operations detected: ");
            l10.append(this.pendingOperation.method);
            l10.append(", ");
            l10.append(str);
            throw new IllegalStateException(l10.toString());
        }

        private void checkAndSetPendingSignInOperation(String str, Messages.Result<Messages.UserData> result) {
            checkAndSetPendingOperation(str, result, null, null, null, null);
        }

        private void checkAndSetPendingStringOperation(String str, Messages.Result<String> result, Object obj) {
            checkAndSetPendingOperation(str, null, null, null, result, obj);
        }

        private void checkAndSetPendingVoidOperation(String str, Messages.Result<Void> result) {
            checkAndSetPendingOperation(str, null, result, null, null, null);
        }

        private String errorCodeForStatus(int i10) {
            return i10 != 4 ? i10 != 7 ? i10 != 12501 ? ERROR_REASON_SIGN_IN_FAILED : ERROR_REASON_SIGN_IN_CANCELED : ERROR_REASON_NETWORK_ERROR : ERROR_REASON_SIGN_IN_REQUIRED;
        }

        private void finishWithBoolean(Boolean bool) {
            Messages.Result<Boolean> result = this.pendingOperation.boolResult;
            Objects.requireNonNull(result);
            result.success(bool);
            this.pendingOperation = null;
        }

        private void finishWithError(String str, String str2) {
            PendingOperation pendingOperation = this.pendingOperation;
            Messages.Result result = pendingOperation.userDataResult;
            if (result == null && (result = pendingOperation.boolResult) == null && (result = pendingOperation.stringResult) == null) {
                result = pendingOperation.voidResult;
            }
            Objects.requireNonNull(result);
            result.error(new Messages.FlutterError(str, str2, null));
            this.pendingOperation = null;
        }

        private void finishWithSuccess() {
            Messages.Result<Void> result = this.pendingOperation.voidResult;
            Objects.requireNonNull(result);
            result.success(null);
            this.pendingOperation = null;
        }

        private void finishWithUserData(Messages.UserData userData) {
            Messages.Result<Messages.UserData> result = this.pendingOperation.userDataResult;
            Objects.requireNonNull(result);
            result.success(userData);
            this.pendingOperation = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Void lambda$clearAuthCache$2(String str) {
            Context context = this.context;
            int i10 = z5.d.f17804d;
            j.h("Calling this from your main thread can lead to deadlock");
            l.d(context);
            Bundle bundle = new Bundle();
            l.e(context, bundle);
            zzdc.zzd(context);
            int i11 = 1;
            if (zzhw.zze() && l.g(context)) {
                zzg zza = zzh.zza(context);
                zzbw zzbwVar = new zzbw();
                zzbwVar.zza(str);
                try {
                    l.c(zza.zza(zzbwVar), "clear token");
                    return null;
                } catch (k6.b e10) {
                    l.f17815c.f("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", "clear token", Log.getStackTraceString(e10));
                }
            }
            l.b(context, l.f17814b, new r4.c(i11, str, bundle));
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$clearAuthCache$3(Messages.Result result, Future future) {
            try {
                result.success((Void) future.get());
            } catch (InterruptedException e10) {
                result.error(new Messages.FlutterError("exception", e10.getMessage(), null));
                Thread.currentThread().interrupt();
            } catch (ExecutionException e11) {
                Throwable cause = e11.getCause();
                result.error(new Messages.FlutterError("exception", cause == null ? null : cause.getMessage(), null));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$disconnect$1(Task task) {
            if (task.isSuccessful()) {
                finishWithSuccess();
            } else {
                finishWithError(ERROR_REASON_STATUS, "Failed to disconnect.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String lambda$getAccessToken$4(String str) {
            TokenData tokenData;
            Bundle bundle;
            Account account = new Account(str, "com.google");
            StringBuilder l10 = defpackage.f.l("oauth2:");
            String valueOf = String.valueOf(' ');
            valueOf.getClass();
            Iterator<T> it = this.requestedScopes.iterator();
            StringBuilder sb2 = new StringBuilder();
            try {
                if (it.hasNext()) {
                    while (true) {
                        Object next = it.next();
                        Objects.requireNonNull(next);
                        sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                        if (!it.hasNext()) {
                            break;
                        }
                        sb2.append((CharSequence) valueOf);
                    }
                }
                l10.append(sb2.toString());
                String sb3 = l10.toString();
                Context context = this.context;
                int i10 = z5.d.f17804d;
                Bundle bundle2 = new Bundle();
                l.f(account);
                j.h("Calling this from your main thread can lead to deadlock");
                j.f("Scope cannot be empty or null.", sb3);
                l.f(account);
                l.d(context);
                Bundle bundle3 = new Bundle(bundle2);
                l.e(context, bundle3);
                zzdc.zzd(context);
                if (zzhw.zze() && l.g(context)) {
                    try {
                        bundle = (Bundle) l.c(zzh.zza(context).zzc(account, sb3, bundle3), "token retrieval");
                    } catch (k6.b e10) {
                        l.f17815c.f("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", "token retrieval", Log.getStackTraceString(e10));
                    }
                    if (bundle != null) {
                        tokenData = l.a(context, bundle);
                        return tokenData.f2743b;
                    }
                    l.f17815c.f("Service call returned null.", new Object[0]);
                    throw new IOException("Service unavailable.");
                }
                tokenData = (TokenData) l.b(context, l.f17814b, new z5.j(account, bundle3, context, sb3));
                return tokenData.f2743b;
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$getAccessToken$5(Messages.Result result, Boolean bool, String str, Future future) {
            String str2;
            Intent intent = null;
            try {
                result.success((String) future.get());
            } catch (InterruptedException e10) {
                result.error(new Messages.FlutterError("exception", e10.getMessage(), null));
                Thread.currentThread().interrupt();
            } catch (ExecutionException e11) {
                if (!(e11.getCause() instanceof UserRecoverableAuthException)) {
                    Throwable cause = e11.getCause();
                    result.error(new Messages.FlutterError("exception", cause == null ? null : cause.getMessage(), null));
                    return;
                }
                if (!bool.booleanValue() || this.pendingOperation != null) {
                    result.error(new Messages.FlutterError(ERROR_USER_RECOVERABLE_AUTH, e11.getLocalizedMessage(), null));
                    return;
                }
                Activity activity = getActivity();
                if (activity == null) {
                    StringBuilder l10 = defpackage.f.l("Cannot recover auth because app is not in foreground. ");
                    l10.append(e11.getLocalizedMessage());
                    result.error(new Messages.FlutterError(ERROR_USER_RECOVERABLE_AUTH, l10.toString(), null));
                    return;
                }
                checkAndSetPendingAccessTokenOperation("getTokens", result, str);
                UserRecoverableAuthException userRecoverableAuthException = (UserRecoverableAuthException) e11.getCause();
                Intent intent2 = userRecoverableAuthException.f2748a;
                if (intent2 == null) {
                    int c10 = q0.g.c(userRecoverableAuthException.f2749b);
                    if (c10 != 0) {
                        if (c10 != 1) {
                            str2 = c10 == 2 ? "this instantiation of UserRecoverableAuthException doesn't support an Intent." : "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.";
                        }
                        Log.e("Auth", str2);
                    } else {
                        Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
                    }
                } else {
                    intent = new Intent(intent2);
                }
                activity.startActivityForResult(intent, REQUEST_CODE_RECOVER_AUTH);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$signOut$0(Task task) {
            if (task.isSuccessful()) {
                finishWithSuccess();
            } else {
                finishWithError(ERROR_REASON_STATUS, "Failed to signout.");
            }
        }

        private void onSignInAccount(GoogleSignInAccount googleSignInAccount) {
            Messages.UserData.Builder displayName = new Messages.UserData.Builder().setEmail(googleSignInAccount.f2765d).setId(googleSignInAccount.f2763b).setIdToken(googleSignInAccount.f2764c).setServerAuthCode(googleSignInAccount.f2767o).setDisplayName(googleSignInAccount.f2766e);
            Uri uri = googleSignInAccount.f;
            if (uri != null) {
                displayName.setPhotoUrl(uri.toString());
            }
            finishWithUserData(displayName.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onSignInResult(Task<GoogleSignInAccount> task) {
            String errorCodeForStatus;
            String obj;
            try {
                onSignInAccount(task.getResult(k6.b.class));
            } catch (RuntimeExecutionException e10) {
                obj = e10.toString();
                errorCodeForStatus = "exception";
                finishWithError(errorCodeForStatus, obj);
            } catch (k6.b e11) {
                errorCodeForStatus = errorCodeForStatus(e11.getStatusCode());
                obj = e11.toString();
                finishWithError(errorCodeForStatus, obj);
            }
        }

        @Override // io.flutter.plugins.googlesignin.GoogleSignInPlugin.IDelegate
        public void clearAuthCache(MethodChannel.Result result, String str) {
            clearAuthCache(str, new VoidMethodChannelResult(result));
        }

        @Override // io.flutter.plugins.googlesignin.Messages.GoogleSignInApi
        public void clearAuthCache(final String str, Messages.Result<Void> result) {
            this.backgroundTaskRunner.runInBackground(new Callable() { // from class: io.flutter.plugins.googlesignin.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void lambda$clearAuthCache$2;
                    lambda$clearAuthCache$2 = GoogleSignInPlugin.Delegate.this.lambda$clearAuthCache$2(str);
                    return lambda$clearAuthCache$2;
                }
            }, new defpackage.e(result, 16));
        }

        @Override // io.flutter.plugins.googlesignin.GoogleSignInPlugin.IDelegate
        public void disconnect(MethodChannel.Result result) {
            signOut(new VoidMethodChannelResult(result));
        }

        @Override // io.flutter.plugins.googlesignin.Messages.GoogleSignInApi
        public void disconnect(Messages.Result<Void> result) {
            checkAndSetPendingVoidOperation("disconnect", result);
            this.signInClient.b().addOnCompleteListener(new o(this, 1));
        }

        @Override // io.flutter.plugins.googlesignin.Messages.GoogleSignInApi
        public void getAccessToken(final String str, Boolean bool, Messages.Result<String> result) {
            this.backgroundTaskRunner.runInBackground(new Callable() { // from class: io.flutter.plugins.googlesignin.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String lambda$getAccessToken$4;
                    lambda$getAccessToken$4 = GoogleSignInPlugin.Delegate.this.lambda$getAccessToken$4(str);
                    return lambda$getAccessToken$4;
                }
            }, new o9.c(this, result, bool, str));
        }

        public Activity getActivity() {
            return this.activity;
        }

        @Override // io.flutter.plugins.googlesignin.GoogleSignInPlugin.IDelegate
        public void getTokens(MethodChannel.Result result, String str, boolean z10) {
            getAccessToken(str, Boolean.valueOf(z10), new ErrorConvertingMethodChannelResult<String>(result) { // from class: io.flutter.plugins.googlesignin.GoogleSignInPlugin.Delegate.2
                @Override // io.flutter.plugins.googlesignin.Messages.Result
                public void success(String str2) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(Constants.ACCESS_TOKEN, str2);
                    this.result.success(hashMap);
                }
            });
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
        
            r6 = io.flutter.plugins.googlesignin.Messages.SignInType.STANDARD;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        
            throw new java.lang.IllegalStateException("Unknown signInOption");
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        
            if (r0 != 1) goto L17;
         */
        @Override // io.flutter.plugins.googlesignin.GoogleSignInPlugin.IDelegate
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void init(io.flutter.plugin.common.MethodChannel.Result r5, java.lang.String r6, java.util.List<java.lang.String> r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11) {
            /*
                r4 = this;
                r0 = -1
                int r1 = r6.hashCode()     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                r2 = 849126666(0x329ca50a, float:1.8235841E-8)
                r3 = 1
                if (r1 == r2) goto L1b
                r2 = 2056100820(0x7a8d9bd4, float:3.676372E35)
                if (r1 == r2) goto L11
                goto L24
            L11:
                java.lang.String r1 = "SignInOption.standard"
                boolean r6 = r6.equals(r1)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                if (r6 == 0) goto L24
                r0 = r3
                goto L24
            L1b:
                java.lang.String r1 = "SignInOption.games"
                boolean r6 = r6.equals(r1)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                if (r6 == 0) goto L24
                r0 = 0
            L24:
                if (r0 == 0) goto L33
                if (r0 != r3) goto L2b
                io.flutter.plugins.googlesignin.Messages$SignInType r6 = io.flutter.plugins.googlesignin.Messages.SignInType.STANDARD     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                goto L35
            L2b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                java.lang.String r7 = "Unknown signInOption"
                r6.<init>(r7)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                throw r6     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
            L33:
                io.flutter.plugins.googlesignin.Messages$SignInType r6 = io.flutter.plugins.googlesignin.Messages.SignInType.GAMES     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
            L35:
                io.flutter.plugins.googlesignin.Messages$InitParams$Builder r0 = new io.flutter.plugins.googlesignin.Messages$InitParams$Builder     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                r0.<init>()     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                io.flutter.plugins.googlesignin.Messages$InitParams$Builder r6 = r0.setSignInType(r6)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                io.flutter.plugins.googlesignin.Messages$InitParams$Builder r6 = r6.setScopes(r7)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                io.flutter.plugins.googlesignin.Messages$InitParams$Builder r6 = r6.setHostedDomain(r8)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                io.flutter.plugins.googlesignin.Messages$InitParams$Builder r6 = r6.setClientId(r9)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                io.flutter.plugins.googlesignin.Messages$InitParams$Builder r6 = r6.setServerClientId(r10)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r11)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                io.flutter.plugins.googlesignin.Messages$InitParams$Builder r6 = r6.setForceCodeForRefreshToken(r7)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                io.flutter.plugins.googlesignin.Messages$InitParams r6 = r6.build()     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                r4.init(r6)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                r6 = 0
                r5.success(r6)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                goto L6e
            L62:
                r6 = move-exception
                java.lang.String r7 = r6.code
                java.lang.String r8 = r6.getMessage()
                java.lang.Object r6 = r6.details
                r5.error(r7, r8, r6)
            L6e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlesignin.GoogleSignInPlugin.Delegate.init(io.flutter.plugin.common.MethodChannel$Result, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, boolean):void");
        }

        @Override // io.flutter.plugins.googlesignin.Messages.GoogleSignInApi
        public void init(Messages.InitParams initParams) {
            GoogleSignInOptions.a aVar;
            boolean z10;
            String str;
            boolean z11;
            int identifier;
            try {
                int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$googlesignin$Messages$SignInType[initParams.getSignInType().ordinal()];
                if (i10 == 1) {
                    aVar = new GoogleSignInOptions.a(GoogleSignInOptions.f2773u);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("Unknown signInOption");
                    }
                    aVar = new GoogleSignInOptions.a(GoogleSignInOptions.t);
                    aVar.f2789a.add(GoogleSignInOptions.f2774v);
                }
                String serverClientId = initParams.getServerClientId();
                if (!i.a(initParams.getClientId()) && i.a(serverClientId)) {
                    Log.w("google_sign_in", "clientId is not supported on Android and is interpreted as serverClientId. Use serverClientId instead to suppress this warning.");
                    serverClientId = initParams.getClientId();
                }
                if (i.a(serverClientId) && (identifier = this.context.getResources().getIdentifier("default_web_client_id", "string", this.context.getPackageName())) != 0) {
                    serverClientId = this.context.getString(identifier);
                }
                if (!i.a(serverClientId)) {
                    aVar.f2792d = true;
                    j.e(serverClientId);
                    String str2 = aVar.f2793e;
                    if (str2 != null && !str2.equals(serverClientId)) {
                        z10 = false;
                        j.a("two different server client ids provided", z10);
                        aVar.f2793e = serverClientId;
                        boolean booleanValue = initParams.getForceCodeForRefreshToken().booleanValue();
                        aVar.f2790b = true;
                        j.e(serverClientId);
                        str = aVar.f2793e;
                        if (str != null && !str.equals(serverClientId)) {
                            z11 = false;
                            j.a("two different server client ids provided", z11);
                            aVar.f2793e = serverClientId;
                            aVar.f2791c = booleanValue;
                        }
                        z11 = true;
                        j.a("two different server client ids provided", z11);
                        aVar.f2793e = serverClientId;
                        aVar.f2791c = booleanValue;
                    }
                    z10 = true;
                    j.a("two different server client ids provided", z10);
                    aVar.f2793e = serverClientId;
                    boolean booleanValue2 = initParams.getForceCodeForRefreshToken().booleanValue();
                    aVar.f2790b = true;
                    j.e(serverClientId);
                    str = aVar.f2793e;
                    if (str != null) {
                        z11 = false;
                        j.a("two different server client ids provided", z11);
                        aVar.f2793e = serverClientId;
                        aVar.f2791c = booleanValue2;
                    }
                    z11 = true;
                    j.a("two different server client ids provided", z11);
                    aVar.f2793e = serverClientId;
                    aVar.f2791c = booleanValue2;
                }
                List<String> scopes = initParams.getScopes();
                this.requestedScopes = scopes;
                Iterator<String> it = scopes.iterator();
                while (it.hasNext()) {
                    aVar.b(new Scope(1, it.next()), new Scope[0]);
                }
                if (!i.a(initParams.getHostedDomain())) {
                    String hostedDomain = initParams.getHostedDomain();
                    j.e(hostedDomain);
                    aVar.f2794g = hostedDomain;
                }
                this.signInClient = this.googleSignInWrapper.getClient(this.context, aVar.a());
            } catch (Exception e10) {
                throw new Messages.FlutterError("exception", e10.getMessage(), null);
            }
        }

        @Override // io.flutter.plugins.googlesignin.Messages.GoogleSignInApi
        public Boolean isSignedIn() {
            GoogleSignInAccount googleSignInAccount;
            h6.o a10 = h6.o.a(this.context);
            synchronized (a10) {
                googleSignInAccount = a10.f7168b;
            }
            return Boolean.valueOf(googleSignInAccount != null);
        }

        @Override // io.flutter.plugins.googlesignin.GoogleSignInPlugin.IDelegate
        public void isSignedIn(MethodChannel.Result result) {
            result.success(isSignedIn());
        }

        @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
        public boolean onActivityResult(int i10, int i11, Intent intent) {
            g6.b bVar;
            PendingOperation pendingOperation = this.pendingOperation;
            if (pendingOperation == null) {
                return false;
            }
            switch (i10) {
                case REQUEST_CODE_SIGNIN /* 53293 */:
                    if (intent == null) {
                        finishWithError(ERROR_REASON_SIGN_IN_FAILED, "Signin failed");
                        break;
                    } else {
                        p6.a aVar = n.f7165a;
                        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
                        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
                        if (googleSignInAccount == null) {
                            if (status == null) {
                                status = Status.f2813o;
                            }
                            bVar = new g6.b(null, status);
                        } else {
                            bVar = new g6.b(googleSignInAccount, Status.f2812e);
                        }
                        GoogleSignInAccount googleSignInAccount2 = bVar.f5901b;
                        onSignInResult((!bVar.f5900a.D() || googleSignInAccount2 == null) ? Tasks.forException(a0.r(bVar.f5900a)) : Tasks.forResult(googleSignInAccount2));
                        break;
                    }
                case REQUEST_CODE_RECOVER_AUTH /* 53294 */:
                    if (i11 != -1) {
                        finishWithError(ERROR_FAILURE_TO_RECOVER_AUTH, "Failed attempt to recover authentication");
                        break;
                    } else {
                        Messages.Result<String> result = pendingOperation.stringResult;
                        Objects.requireNonNull(result);
                        Object obj = this.pendingOperation.data;
                        Objects.requireNonNull(obj);
                        this.pendingOperation = null;
                        getAccessToken((String) obj, Boolean.FALSE, result);
                        break;
                    }
                case REQUEST_CODE_REQUEST_SCOPE /* 53295 */:
                    finishWithBoolean(Boolean.valueOf(i11 == -1));
                    break;
            }
            return false;
        }

        @Override // io.flutter.plugins.googlesignin.GoogleSignInPlugin.IDelegate
        public void requestScopes(MethodChannel.Result result, List<String> list) {
            requestScopes(list, new ErrorConvertingMethodChannelResult<Boolean>(result) { // from class: io.flutter.plugins.googlesignin.GoogleSignInPlugin.Delegate.1
                @Override // io.flutter.plugins.googlesignin.Messages.Result
                public void success(Boolean bool) {
                    this.result.success(bool);
                }
            });
        }

        @Override // io.flutter.plugins.googlesignin.Messages.GoogleSignInApi
        public void requestScopes(List<String> list, Messages.Result<Boolean> result) {
            checkAndSetPendingBoolOperation("requestScopes", result);
            GoogleSignInAccount lastSignedInAccount = this.googleSignInWrapper.getLastSignedInAccount(this.context);
            if (lastSignedInAccount == null) {
                finishWithError(ERROR_REASON_SIGN_IN_REQUIRED, "No account to grant scopes.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                Scope scope = new Scope(1, it.next());
                if (!this.googleSignInWrapper.hasPermissions(lastSignedInAccount, scope)) {
                    arrayList.add(scope);
                }
            }
            if (arrayList.isEmpty()) {
                finishWithBoolean(Boolean.TRUE);
            } else {
                this.googleSignInWrapper.requestPermissions(getActivity(), REQUEST_CODE_REQUEST_SCOPE, lastSignedInAccount, (Scope[]) arrayList.toArray(new Scope[0]));
            }
        }

        public void setActivity(Activity activity) {
            this.activity = activity;
        }

        @Override // io.flutter.plugins.googlesignin.GoogleSignInPlugin.IDelegate
        public void signIn(MethodChannel.Result result) {
            signIn(new UserDataMethodChannelResult(result));
        }

        @Override // io.flutter.plugins.googlesignin.Messages.GoogleSignInApi
        public void signIn(Messages.Result<Messages.UserData> result) {
            if (getActivity() == null) {
                throw new IllegalStateException("signIn needs a foreground activity");
            }
            checkAndSetPendingSignInOperation("signIn", result);
            getActivity().startActivityForResult(this.signInClient.a(), REQUEST_CODE_SIGNIN);
        }

        @Override // io.flutter.plugins.googlesignin.GoogleSignInPlugin.IDelegate
        public void signInSilently(MethodChannel.Result result) {
            signInSilently(new UserDataMethodChannelResult(result));
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x010e  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
        @Override // io.flutter.plugins.googlesignin.Messages.GoogleSignInApi
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void signInSilently(io.flutter.plugins.googlesignin.Messages.Result<io.flutter.plugins.googlesignin.Messages.UserData> r18) {
            /*
                Method dump skipped, instructions count: 292
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlesignin.GoogleSignInPlugin.Delegate.signInSilently(io.flutter.plugins.googlesignin.Messages$Result):void");
        }

        @Override // io.flutter.plugins.googlesignin.GoogleSignInPlugin.IDelegate
        public void signOut(MethodChannel.Result result) {
            signOut(new VoidMethodChannelResult(result));
        }

        @Override // io.flutter.plugins.googlesignin.Messages.GoogleSignInApi
        public void signOut(Messages.Result<Void> result) {
            checkAndSetPendingVoidOperation("signOut", result);
            this.signInClient.signOut().addOnCompleteListener(new defpackage.e(this, 3));
        }
    }

    public static abstract class ErrorConvertingMethodChannelResult<T> implements Messages.Result<T> {
        public final MethodChannel.Result result;

        public ErrorConvertingMethodChannelResult(MethodChannel.Result result) {
            this.result = result;
        }

        @Override // io.flutter.plugins.googlesignin.Messages.Result
        public void error(Throwable th) {
            if (!(th instanceof Messages.FlutterError)) {
                this.result.error(io.flutter.plugins.firebase.crashlytics.Constants.EXCEPTION, th.getMessage(), null);
            } else {
                Messages.FlutterError flutterError = (Messages.FlutterError) th;
                this.result.error(flutterError.code, flutterError.getMessage(), flutterError.details);
            }
        }
    }

    public interface IDelegate {
        void clearAuthCache(MethodChannel.Result result, String str);

        void disconnect(MethodChannel.Result result);

        void getTokens(MethodChannel.Result result, String str, boolean z10);

        void init(MethodChannel.Result result, String str, List<String> list, String str2, String str3, String str4, boolean z10);

        void isSignedIn(MethodChannel.Result result);

        void requestScopes(MethodChannel.Result result, List<String> list);

        void signIn(MethodChannel.Result result);

        void signInSilently(MethodChannel.Result result);

        void signOut(MethodChannel.Result result);
    }

    public static class UserDataMethodChannelResult extends ErrorConvertingMethodChannelResult<Messages.UserData> {
        public UserDataMethodChannelResult(MethodChannel.Result result) {
            super(result);
        }

        @Override // io.flutter.plugins.googlesignin.Messages.Result
        public void success(Messages.UserData userData) {
            HashMap hashMap = new HashMap();
            hashMap.put(Constants.EMAIL, userData.getEmail());
            hashMap.put("id", userData.getId());
            hashMap.put(Constants.ID_TOKEN, userData.getIdToken());
            hashMap.put(Constants.SERVER_AUTH_CODE, userData.getServerAuthCode());
            hashMap.put("displayName", userData.getDisplayName());
            if (userData.getPhotoUrl() != null) {
                hashMap.put("photoUrl", userData.getPhotoUrl());
            }
            this.result.success(hashMap);
        }
    }

    public static class VoidMethodChannelResult extends ErrorConvertingMethodChannelResult<Void> {
        public VoidMethodChannelResult(MethodChannel.Result result) {
            super(result);
        }

        @Override // io.flutter.plugins.googlesignin.Messages.Result
        public void success(Void r22) {
            this.result.success(null);
        }
    }

    private void attachToActivity(ActivityPluginBinding activityPluginBinding) {
        this.activityPluginBinding = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(this.delegate);
        this.delegate.setActivity(activityPluginBinding.getActivity());
    }

    private void dispose() {
        this.delegate = null;
        BinaryMessenger binaryMessenger = this.messenger;
        if (binaryMessenger != null) {
            Messages.GoogleSignInApi.CC.k(binaryMessenger, null);
            this.messenger = null;
        }
    }

    private void disposeActivity() {
        this.activityPluginBinding.removeActivityResultListener(this.delegate);
        this.delegate.setActivity(null);
        this.activityPluginBinding = null;
    }

    public void initInstance(BinaryMessenger binaryMessenger, Context context, GoogleSignInWrapper googleSignInWrapper) {
        this.messenger = binaryMessenger;
        Delegate delegate = new Delegate(context, googleSignInWrapper);
        this.delegate = delegate;
        Messages.GoogleSignInApi.CC.k(binaryMessenger, delegate);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        attachToActivity(activityPluginBinding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext(), new GoogleSignInWrapper());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        disposeActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        disposeActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        dispose();
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "signIn":
                this.delegate.signIn(result);
                break;
            case "signInSilently":
                this.delegate.signInSilently(result);
                break;
            case "isSignedIn":
                this.delegate.isSignedIn(result);
                break;
            case "init":
                String str2 = (String) methodCall.argument("signInOption");
                Objects.requireNonNull(str2);
                List<String> list = (List) methodCall.argument("scopes");
                Objects.requireNonNull(list);
                String str3 = (String) methodCall.argument("hostedDomain");
                String str4 = (String) methodCall.argument("clientId");
                String str5 = (String) methodCall.argument("serverClientId");
                Boolean bool = (Boolean) methodCall.argument("forceCodeForRefreshToken");
                Objects.requireNonNull(bool);
                this.delegate.init(result, str2, list, str3, str4, str5, bool.booleanValue());
                break;
            case "clearAuthCache":
                String str6 = (String) methodCall.argument("token");
                Objects.requireNonNull(str6);
                this.delegate.clearAuthCache(result, str6);
                break;
            case "disconnect":
                this.delegate.disconnect(result);
                break;
            case "getTokens":
                String str7 = (String) methodCall.argument(Constants.EMAIL);
                Objects.requireNonNull(str7);
                Boolean bool2 = (Boolean) methodCall.argument("shouldRecoverAuth");
                Objects.requireNonNull(bool2);
                this.delegate.getTokens(result, str7, bool2.booleanValue());
                break;
            case "requestScopes":
                List<String> list2 = (List) methodCall.argument("scopes");
                Objects.requireNonNull(list2);
                this.delegate.requestScopes(result, list2);
                break;
            case "signOut":
                this.delegate.signOut(result);
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        attachToActivity(activityPluginBinding);
    }
}
