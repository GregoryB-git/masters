/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 *  android.widget.Toast
 *  com.facebook.CallbackManager
 *  com.facebook.CallbackManager$Factory
 *  com.facebook.FacebookCallback
 *  com.facebook.FacebookException
 *  com.facebook.login.LoginManager
 *  com.facebook.login.LoginResult
 *  com.google.android.gms.auth.api.signin.GoogleSignIn
 *  com.google.android.gms.auth.api.signin.GoogleSignInAccount
 *  com.google.android.gms.auth.api.signin.GoogleSignInClient
 *  com.google.android.gms.auth.api.signin.GoogleSignInOptions
 *  com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder
 *  com.google.android.gms.common.api.ApiException
 *  com.google.android.gms.tasks.Task
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.Map
 *  kotlin.Lazy
 *  kotlin.LazyKt
 *  kotlin.Metadata
 *  kotlin.Pair
 *  kotlin.TuplesKt
 *  kotlin.Unit
 *  kotlin.collections.CollectionsKt
 *  kotlin.collections.MapsKt
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  ru.tvrain.core.data.RainUser
 *  rx.Observable
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 *  tvrain.managers.UserManager
 */
package com.hintsolutions.raintv.profile;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.databinding.ActivityAuthorizationBinding;
import com.hintsolutions.raintv.interfaces.TaskCallback;
import com.hintsolutions.raintv.profile.AuthorizationActivity;
import com.hintsolutions.raintv.profile.RecoveryActivity;
import com.hintsolutions.raintv.profile.a;
import com.hintsolutions.raintv.profile.b;
import com.rengwuxian.materialedittext.MaterialEditText;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.identity.TwitterAuthClient;
import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKCallback;
import com.vk.sdk.VKSdk;
import com.vk.sdk.api.VKError;
import com.yandex.authsdk.YandexAuthException;
import com.yandex.authsdk.YandexAuthOptions;
import com.yandex.authsdk.YandexAuthSdk;
import com.yandex.authsdk.YandexAuthToken;
import java.util.Collection;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.tvrain.core.data.RainUser;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import tvrain.managers.UserManager;

@Metadata(d1={"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 E2\u00020\u0001:\u0001EB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"H\u0002J\u001e\u0010$\u001a\u00020\u001c2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010(\u001a\u00020\"H\u0002J\u0018\u0010)\u001a\u00020\u001c2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+H\u0002J\u0010\u0010-\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u00100\u001a\u000201H\u0014J\u0010\u00102\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\"H\u0002J\u0016\u00103\u001a\u00020\u001c2\f\u00104\u001a\b\u0012\u0004\u0012\u00020605H\u0002J\u001a\u00107\u001a\u00020\u001c2\u0006\u00108\u001a\u0002012\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\u001a\u0010;\u001a\u00020\u001c2\u0006\u00108\u001a\u0002012\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\b\u0010<\u001a\u00020\u001cH\u0002J\"\u0010=\u001a\u00020\u001c2\u0006\u0010>\u001a\u0002012\u0006\u00108\u001a\u0002012\b\u00109\u001a\u0004\u0018\u00010:H\u0014J\u0012\u0010?\u001a\u00020\u001c2\b\u0010@\u001a\u0004\u0018\u00010AH\u0014J\u0006\u0010B\u001a\u00020\u001cJ\b\u0010C\u001a\u00020\u001cH\u0002J\b\u0010D\u001a\u00020\u001cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0010\u0010\bR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006F"}, d2={"Lcom/hintsolutions/raintv/profile/AuthorizationActivity;", "Lcom/hintsolutions/raintv/common/BaseActivity;", "()V", "binding", "Lcom/hintsolutions/raintv/databinding/ActivityAuthorizationBinding;", "emailEditText", "Landroid/widget/EditText;", "getEmailEditText", "()Landroid/widget/EditText;", "emailEditText$delegate", "Lkotlin/Lazy;", "fbCallbackManager", "Lcom/facebook/CallbackManager;", "mGoogleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "passwordEditText", "getPasswordEditText", "passwordEditText$delegate", "twitterAuthClient", "Lcom/twitter/sdk/android/core/identity/TwitterAuthClient;", "getTwitterAuthClient", "()Lcom/twitter/sdk/android/core/identity/TwitterAuthClient;", "twitterAuthClient$delegate", "yandexAuthOptions", "Lcom/yandex/authsdk/YandexAuthOptions;", "yandexAuthSdk", "Lcom/yandex/authsdk/YandexAuthSdk;", "emailPasswordAuth", "", "finishFacebookLogin", "loginResult", "Lcom/facebook/login/LoginResult;", "finishGoogleLogin", "token", "", "finishMailLogin", "finishSocialLogin", "observable", "Lrx/Observable;", "Lru/tvrain/core/data/RainUser;", "type", "finishTwitterLogin", "result", "Lcom/twitter/sdk/android/core/Result;", "Lcom/twitter/sdk/android/core/TwitterSession;", "finishVkLogin", "Lcom/vk/sdk/VKAccessToken;", "finishYandexLogin", "getLayoutResource", "", "gtmLogSuccessAuth", "handleGoogleSignInResult", "completedTask", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "handleMailSignInResult", "resultCode", "data", "Landroid/content/Intent;", "handleYandexSignInResult", "initSdks", "onActivityResult", "requestCode", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "recovery", "setupListeners", "showLinkDialog", "Companion", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class AuthorizationActivity
extends BaseActivity {
    private static final int AUTHORIZATION_REQUEST;
    @NotNull
    public static final Companion Companion;
    private static final int GOOGLE_SIGN_IN_REQUEST;
    private static final int MAIL_SIGN_IN_REQUEST;
    private static final int YANDEX_SIGN_IN_REQUEST;
    private ActivityAuthorizationBinding binding;
    @NotNull
    private final Lazy emailEditText$delegate;
    @Nullable
    private CallbackManager fbCallbackManager;
    @Nullable
    private GoogleSignInClient mGoogleSignInClient;
    @NotNull
    private final Lazy passwordEditText$delegate;
    @NotNull
    private final Lazy twitterAuthClient$delegate = LazyKt.lazy((Function0)twitterAuthClient.2.INSTANCE);
    @Nullable
    private YandexAuthOptions yandexAuthOptions;
    @Nullable
    private YandexAuthSdk yandexAuthSdk;

    static {
        Companion = new Object(null){
            {
                this();
            }

            public final int getAUTHORIZATION_REQUEST() {
                return AUTHORIZATION_REQUEST;
            }

            public final int getGOOGLE_SIGN_IN_REQUEST() {
                return GOOGLE_SIGN_IN_REQUEST;
            }

            public final int getMAIL_SIGN_IN_REQUEST() {
                return MAIL_SIGN_IN_REQUEST;
            }

            public final int getYANDEX_SIGN_IN_REQUEST() {
                return YANDEX_SIGN_IN_REQUEST;
            }
        };
        AUTHORIZATION_REQUEST = 100;
        GOOGLE_SIGN_IN_REQUEST = 200;
        YANDEX_SIGN_IN_REQUEST = 300;
        MAIL_SIGN_IN_REQUEST = 400;
    }

    public AuthorizationActivity() {
        this.emailEditText$delegate = LazyKt.lazy((Function0)new Function0<MaterialEditText>(this){
            public final AuthorizationActivity this$0;
            {
                this.this$0 = authorizationActivity;
                super(0);
            }

            @NotNull
            public final MaterialEditText invoke() {
                ActivityAuthorizationBinding activityAuthorizationBinding;
                ActivityAuthorizationBinding activityAuthorizationBinding2 = activityAuthorizationBinding = AuthorizationActivity.access$getBinding$p(this.this$0);
                if (activityAuthorizationBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)"binding");
                    activityAuthorizationBinding2 = null;
                }
                return activityAuthorizationBinding2.email;
            }
        });
        this.passwordEditText$delegate = LazyKt.lazy((Function0)new Function0<MaterialEditText>(this){
            public final AuthorizationActivity this$0;
            {
                this.this$0 = authorizationActivity;
                super(0);
            }

            @NotNull
            public final MaterialEditText invoke() {
                ActivityAuthorizationBinding activityAuthorizationBinding;
                ActivityAuthorizationBinding activityAuthorizationBinding2 = activityAuthorizationBinding = AuthorizationActivity.access$getBinding$p(this.this$0);
                if (activityAuthorizationBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)"binding");
                    activityAuthorizationBinding2 = null;
                }
                return activityAuthorizationBinding2.password;
            }
        });
    }

    public static /* synthetic */ void A(AuthorizationActivity authorizationActivity, View view) {
        AuthorizationActivity.setupListeners$lambda$4(authorizationActivity, view);
    }

    public static /* synthetic */ void B(AuthorizationActivity authorizationActivity, View view) {
        AuthorizationActivity.setupListeners$lambda$3(authorizationActivity, view);
    }

    public static /* synthetic */ void C(AuthorizationActivity authorizationActivity) {
        AuthorizationActivity.onActivityResult$lambda$12(authorizationActivity);
    }

    public static /* synthetic */ void D(AuthorizationActivity authorizationActivity, DialogInterface dialogInterface) {
        AuthorizationActivity.showLinkDialog$lambda$9(authorizationActivity, dialogInterface);
    }

    public static /* synthetic */ void E(Object object, Function1 function1) {
        AuthorizationActivity.emailPasswordAuth$lambda$13(function1, object);
    }

    public static /* synthetic */ void F(AuthorizationActivity authorizationActivity, Throwable throwable) {
        AuthorizationActivity.emailPasswordAuth$lambda$14(authorizationActivity, throwable);
    }

    public static /* synthetic */ void G(AuthorizationActivity authorizationActivity, View view) {
        AuthorizationActivity.setupListeners$lambda$0(authorizationActivity, view);
    }

    public static /* synthetic */ void H(AuthorizationActivity authorizationActivity, MaterialDialog materialDialog, DialogAction dialogAction) {
        AuthorizationActivity.showLinkDialog$lambda$10(authorizationActivity, materialDialog, dialogAction);
    }

    public static /* synthetic */ void I(AuthorizationActivity authorizationActivity, Throwable throwable) {
        AuthorizationActivity.finishSocialLogin$lambda$8(authorizationActivity, throwable);
    }

    public static /* synthetic */ void J(Object object, Function1 function1) {
        AuthorizationActivity.finishSocialLogin$lambda$6(function1, object);
    }

    public static /* synthetic */ void K(AuthorizationActivity authorizationActivity, View view) {
        AuthorizationActivity.setupListeners$lambda$1(authorizationActivity, view);
    }

    public static final /* synthetic */ void access$checkUser(AuthorizationActivity authorizationActivity, TaskCallback taskCallback) {
        authorizationActivity.checkUser(taskCallback);
    }

    public static final /* synthetic */ void access$finishFacebookLogin(AuthorizationActivity authorizationActivity, LoginResult loginResult) {
        authorizationActivity.finishFacebookLogin(loginResult);
    }

    public static final /* synthetic */ void access$finishTwitterLogin(AuthorizationActivity authorizationActivity, Result result) {
        authorizationActivity.finishTwitterLogin(result);
    }

    public static final /* synthetic */ void access$finishVkLogin(AuthorizationActivity authorizationActivity, VKAccessToken vKAccessToken) {
        authorizationActivity.finishVkLogin(vKAccessToken);
    }

    public static final /* synthetic */ ActivityAuthorizationBinding access$getBinding$p(AuthorizationActivity authorizationActivity) {
        return authorizationActivity.binding;
    }

    public static final /* synthetic */ UserManager access$getUserManager$p$s1134055712(AuthorizationActivity authorizationActivity) {
        return authorizationActivity.userManager;
    }

    public static final /* synthetic */ void access$gtmLogSuccessAuth(AuthorizationActivity authorizationActivity, String string) {
        authorizationActivity.gtmLogSuccessAuth(string);
    }

    public static final /* synthetic */ void access$showLinkDialog(AuthorizationActivity authorizationActivity) {
        authorizationActivity.showLinkDialog();
    }

    private final void emailPasswordAuth() {
        String string = this.getEmailEditText().getText().toString();
        String string2 = this.getPasswordEditText().getText().toString();
        this.addSubscription(this.rainApi.authByLogin(this.getAuthorization(), string, string2).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new s(new Function1<RainUser, Unit>(this){
            public final AuthorizationActivity this$0;
            {
                this.this$0 = authorizationActivity;
                super(1);
            }

            public static /* synthetic */ void a(AuthorizationActivity authorizationActivity) {
                emailPasswordAuth.1.invoke$lambda$0(authorizationActivity);
            }

            private static final void invoke$lambda$0(AuthorizationActivity authorizationActivity) {
                Intrinsics.checkNotNullParameter((Object)authorizationActivity, (String)"this$0");
                authorizationActivity.setResult(-1);
                AuthorizationActivity.access$gtmLogSuccessAuth(authorizationActivity, "email");
                authorizationActivity.finish();
            }

            public final void invoke(RainUser object) {
                UserManager userManager = AuthorizationActivity.access$getUserManager$p$s1134055712(this.this$0);
                Intrinsics.checkNotNullExpressionValue((Object)object, (String)"user");
                userManager.authorize(object);
                object = this.this$0;
                AuthorizationActivity.access$checkUser((AuthorizationActivity)object, new a((AuthorizationActivity)object, 0));
            }
        }, 0), (Action1)new a(this, 1)));
    }

    private static final void emailPasswordAuth$lambda$13(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter((Object)function1, (String)"$tmp0");
        function1.invoke(object);
    }

    private static final void emailPasswordAuth$lambda$14(AuthorizationActivity authorizationActivity, Throwable object) {
        String string;
        block5: {
            block4: {
                Intrinsics.checkNotNullParameter((Object)authorizationActivity, (String)"this$0");
                string = authorizationActivity.getRetrofitErrorMessage((Throwable)object);
                Intrinsics.checkNotNullExpressionValue((Object)string, (String)"message");
                if (!StringsKt.b((CharSequence)string, (String)"[email]")) break block4;
                object = "\u041d\u0435\u0432\u0435\u0440\u043d\u044b\u0439 e-mail.";
            }
            if (!StringsKt.b((CharSequence)string, (String)"[passw]")) break block5;
            object = "\u041d\u0435\u0432\u0435\u0440\u043d\u044b\u0439 \u043f\u0430\u0440\u043e\u043b\u044c.";
        }
        try {
            object = new StringBuilder();
            object.append("\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u0430\u0432\u0442\u043e\u0440\u0438\u0437\u043e\u0432\u0430\u0442\u044c\u0441\u044f: ");
            object.append(string);
            object = object.toString();
        }
        catch (Exception exception) {
            object = "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u0430\u0432\u0442\u043e\u0440\u0438\u0437\u043e\u0432\u0430\u0442\u044c\u0441\u044f.";
        }
        Toast.makeText((Context)authorizationActivity, (CharSequence)object, (int)1).show();
        authorizationActivity.tagManager.logError("Auth", "emailPasswordAuth", (String)object);
    }

    private final void finishFacebookLogin(LoginResult loginResult) {
        loginResult = this.rainApi.facebookLogin(loginResult.getAccessToken().getToken()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue((Object)loginResult, (String)"rainApi.facebookLogin(lo\u2026dSchedulers.mainThread())");
        this.finishSocialLogin((Observable<RainUser>)loginResult, "facebook");
    }

    private final void finishGoogleLogin(String string) {
        string = this.rainApi.googleLogin(string).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue((Object)string, (String)"rainApi.googleLogin(toke\u2026dSchedulers.mainThread())");
        this.finishSocialLogin((Observable<RainUser>)string, "google");
    }

    private final void finishMailLogin(String string) {
        string = this.rainApi.mailLogin(string).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue((Object)string, (String)"rainApi.mailLogin(token)\u2026dSchedulers.mainThread())");
        this.finishSocialLogin((Observable<RainUser>)string, "mailru");
    }

    private final void finishSocialLogin(Observable<RainUser> observable, String string) {
        this.showProgressDialog();
        this.addSubscription(observable.subscribe((Action1)new s(new Function1<RainUser, Unit>(this, string){
            public final String $type;
            public final AuthorizationActivity this$0;
            {
                this.this$0 = authorizationActivity;
                this.$type = string;
                super(1);
            }

            public static /* synthetic */ void a(AuthorizationActivity authorizationActivity, String string) {
                finishSocialLogin.1.invoke$lambda$1$lambda$0(authorizationActivity, string);
            }

            private static final void invoke$lambda$1$lambda$0(AuthorizationActivity authorizationActivity, String string) {
                Intrinsics.checkNotNullParameter((Object)authorizationActivity, (String)"$this_run");
                Intrinsics.checkNotNullParameter((Object)string, (String)"$type");
                authorizationActivity.setResult(-1);
                AuthorizationActivity.access$gtmLogSuccessAuth(authorizationActivity, string);
                if (!AuthorizationActivity.access$getUserManager$p$s1134055712(authorizationActivity).hasLinkedAccounts()) {
                    AuthorizationActivity.access$showLinkDialog(authorizationActivity);
                } else {
                    authorizationActivity.finish();
                }
            }

            public final void invoke(RainUser rainUser) {
                AuthorizationActivity authorizationActivity = this.this$0;
                String string = this.$type;
                UserManager userManager = AuthorizationActivity.access$getUserManager$p$s1134055712(authorizationActivity);
                Intrinsics.checkNotNullExpressionValue((Object)rainUser, (String)"rainUser");
                userManager.authorize(rainUser);
                AuthorizationActivity.access$checkUser(authorizationActivity, new b(authorizationActivity, string));
            }
        }, 1), (Action1)new a(this, 2)));
    }

    private static final void finishSocialLogin$lambda$6(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter((Object)function1, (String)"$tmp0");
        function1.invoke(object);
    }

    private static final void finishSocialLogin$lambda$8(AuthorizationActivity authorizationActivity, Throwable throwable) {
        Intrinsics.checkNotNullParameter((Object)authorizationActivity, (String)"this$0");
        authorizationActivity.hideProgressDialog();
        authorizationActivity.showErrorDialog(throwable);
    }

    private final void finishTwitterLogin(Result<TwitterSession> observable) {
        if (observable != null) {
            observable = this.rainApi.twitterLogin(((TwitterAuthToken)((TwitterSession)observable.data).getAuthToken()).token, ((TwitterAuthToken)((TwitterSession)observable.data).getAuthToken()).secret).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            Intrinsics.checkNotNullExpressionValue((Object)observable, (String)"rainApi.twitterLogin(res\u2026dSchedulers.mainThread())");
            this.finishSocialLogin((Observable<RainUser>)observable, "twitter");
        }
    }

    private final void finishVkLogin(VKAccessToken vKAccessToken) {
        vKAccessToken = this.rainApi.vkLogin(vKAccessToken.accessToken).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue((Object)vKAccessToken, (String)"rainApi.vkLogin(token.ac\u2026dSchedulers.mainThread())");
        this.finishSocialLogin((Observable<RainUser>)vKAccessToken, "vk");
    }

    private final void finishYandexLogin(String string) {
        string = this.rainApi.yandexLogin(string).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue((Object)string, (String)"rainApi.yandexLogin(toke\u2026dSchedulers.mainThread())");
        this.finishSocialLogin((Observable<RainUser>)string, "yandex");
    }

    private final EditText getEmailEditText() {
        Object object = this.emailEditText$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"<get-emailEditText>(...)");
        return (EditText)object;
    }

    private final EditText getPasswordEditText() {
        Object object = this.passwordEditText$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"<get-passwordEditText>(...)");
        return (EditText)object;
    }

    private final TwitterAuthClient getTwitterAuthClient() {
        return (TwitterAuthClient)this.twitterAuthClient$delegate.getValue();
    }

    private final void gtmLogSuccessAuth(String string) {
        this.tagManager.log((Map)MapsKt.hashMapOf((Pair[])new Pair[]{TuplesKt.to((Object)"event", (Object)"screenview"), TuplesKt.to((Object)"screenname", (Object)"Auth/success"), TuplesKt.to((Object)"auth_type", (Object)string)}));
    }

    private final void handleGoogleSignInResult(Task<GoogleSignInAccount> object) {
        block6: {
            block5: {
                block4: {
                    object = (GoogleSignInAccount)object.getResult(ApiException.class);
                    if (object == null) break block4;
                    object = object.getIdToken();
                    break block5;
                }
                object = null;
            }
            if (object == null) break block6;
            try {
                this.finishGoogleLogin((String)object);
            }
            catch (ApiException apiException) {
                Toast.makeText((Context)this, (CharSequence)apiException.getMessage(), (int)1).show();
            }
        }
    }

    private final void handleMailSignInResult(int n2, Intent object) {
        if (n2 != 0) {
            if (n2 == 1 && object != null && object.hasExtra("token") && (object = object.getStringExtra("token")) != null) {
                this.finishMailLogin((String)object);
            }
        } else if (object != null && object.hasExtra("error")) {
            Toast.makeText((Context)this, (CharSequence)object.getStringExtra("error"), (int)1).show();
        }
    }

    private final void handleYandexSignInResult(int n2, Intent object) {
        block6: {
            block5: {
                block4: {
                    YandexAuthSdk yandexAuthSdk = this.yandexAuthSdk;
                    if (yandexAuthSdk == null) break block4;
                    object = yandexAuthSdk.extractToken(n2, (Intent)object);
                    break block5;
                }
                object = null;
            }
            if (object == null) break block6;
            try {
                object = ((YandexAuthToken)object).getValue();
                Intrinsics.checkNotNullExpressionValue((Object)object, (String)"token.value");
                this.finishYandexLogin((String)object);
            }
            catch (YandexAuthException yandexAuthException) {
                Toast.makeText((Context)this, (CharSequence)yandexAuthException.getMessage(), (int)1).show();
            }
        }
    }

    private final void initSdks() {
        this.fbCallbackManager = CallbackManager.Factory.create();
        LoginManager.getInstance().registerCallback(this.fbCallbackManager, (FacebookCallback)new FacebookCallback<LoginResult>(this){
            public final AuthorizationActivity this$0;
            {
                this.this$0 = authorizationActivity;
            }

            public void onCancel() {
            }

            public void onError(@NotNull FacebookException facebookException) {
                Intrinsics.checkNotNullParameter((Object)facebookException, (String)"exception");
                Toast.makeText((Context)this.this$0, (CharSequence)facebookException.getMessage(), (int)1).show();
            }

            public void onSuccess(@NotNull LoginResult loginResult) {
                Intrinsics.checkNotNullParameter((Object)loginResult, (String)"loginResult");
                AuthorizationActivity.access$finishFacebookLogin(this.this$0, loginResult);
            }
        });
        Object object = this.getString(2131755275);
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"getString(R.string.google_server_client_id)");
        object = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestIdToken((String)object).requestEmail().build();
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"Builder(GoogleSignInOpti\u2026\n                .build()");
        this.mGoogleSignInClient = GoogleSignIn.getClient((Activity)this, (GoogleSignInOptions)object);
        this.yandexAuthOptions = object = new YandexAuthOptions((Context)this, true);
        Intrinsics.checkNotNull((Object)object);
        this.yandexAuthSdk = new YandexAuthSdk((Context)this, (YandexAuthOptions)object);
    }

    private static final void onActivityResult$lambda$12(AuthorizationActivity authorizationActivity) {
        Intrinsics.checkNotNullParameter((Object)authorizationActivity, (String)"this$0");
        authorizationActivity.setResult(-1);
        authorizationActivity.finish();
    }

    private final void setupListeners() {
        ActivityAuthorizationBinding activityAuthorizationBinding = this.binding;
        Object var2_2 = null;
        ActivityAuthorizationBinding activityAuthorizationBinding2 = activityAuthorizationBinding;
        if (activityAuthorizationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"binding");
            activityAuthorizationBinding2 = null;
        }
        activityAuthorizationBinding2.facebook.setOnClickListener((View.OnClickListener)new t(this, 0));
        activityAuthorizationBinding2 = activityAuthorizationBinding = this.binding;
        if (activityAuthorizationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"binding");
            activityAuthorizationBinding2 = null;
        }
        activityAuthorizationBinding2.twitter.setOnClickListener((View.OnClickListener)new t(this, 1));
        activityAuthorizationBinding2 = activityAuthorizationBinding = this.binding;
        if (activityAuthorizationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"binding");
            activityAuthorizationBinding2 = null;
        }
        activityAuthorizationBinding2.google.setOnClickListener((View.OnClickListener)new t(this, 2));
        activityAuthorizationBinding2 = activityAuthorizationBinding = this.binding;
        if (activityAuthorizationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"binding");
            activityAuthorizationBinding2 = null;
        }
        activityAuthorizationBinding2.recovery.setOnClickListener((View.OnClickListener)new t(this, 3));
        activityAuthorizationBinding2 = this.binding;
        if (activityAuthorizationBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"binding");
            activityAuthorizationBinding2 = var2_2;
        }
        activityAuthorizationBinding2.login.setOnClickListener((View.OnClickListener)new t(this, 4));
    }

    private static final void setupListeners$lambda$0(AuthorizationActivity authorizationActivity, View view) {
        Intrinsics.checkNotNullParameter((Object)authorizationActivity, (String)"this$0");
        LoginManager.getInstance().logInWithReadPermissions((Activity)authorizationActivity, (Collection)CollectionsKt.listOf((Object[])new String[]{"public_profile", "email"}));
    }

    private static final void setupListeners$lambda$1(AuthorizationActivity authorizationActivity, View view) {
        Intrinsics.checkNotNullParameter((Object)authorizationActivity, (String)"this$0");
        authorizationActivity.getTwitterAuthClient().authorize((Activity)authorizationActivity, new Callback<TwitterSession>(authorizationActivity){
            public final AuthorizationActivity this$0;
            {
                this.this$0 = authorizationActivity;
            }

            public void failure(@Nullable TwitterException object) {
                AuthorizationActivity authorizationActivity;
                block3: {
                    block2: {
                        authorizationActivity = this.this$0;
                        if (object == null) break block2;
                        String string = object.getMessage();
                        object = string;
                        if (string != null) break block3;
                    }
                    object = this.this$0.getString(2131755239);
                    Intrinsics.checkNotNullExpressionValue((Object)object, (String)"getString(R.string.error_login)");
                }
                authorizationActivity.showErrorDialog((String)object);
            }

            public void success(@Nullable Result<TwitterSession> result) {
                AuthorizationActivity.access$finishTwitterLogin(this.this$0, result);
            }
        });
    }

    private static final void setupListeners$lambda$2(AuthorizationActivity authorizationActivity, View view) {
        Intrinsics.checkNotNullParameter((Object)authorizationActivity, (String)"this$0");
        view = authorizationActivity.mGoogleSignInClient;
        Intrinsics.checkNotNull((Object)view);
        view = view.getSignInIntent();
        Intrinsics.checkNotNullExpressionValue((Object)view, (String)"mGoogleSignInClient!!.getSignInIntent()");
        authorizationActivity.startActivityForResult((Intent)view, GOOGLE_SIGN_IN_REQUEST);
    }

    private static final void setupListeners$lambda$3(AuthorizationActivity authorizationActivity, View view) {
        Intrinsics.checkNotNullParameter((Object)authorizationActivity, (String)"this$0");
        authorizationActivity.recovery();
    }

    private static final void setupListeners$lambda$4(AuthorizationActivity authorizationActivity, View view) {
        Intrinsics.checkNotNullParameter((Object)authorizationActivity, (String)"this$0");
        authorizationActivity.emailPasswordAuth();
    }

    private final void showLinkDialog() {
        new MaterialDialog.Builder((Context)this).title(2131755202).positiveColorRes(2131099728).content(2131755055).positiveText(2131755070).cancelListener(new u(this)).onPositive(new a(this, 4)).cancelable(true).show();
    }

    private static final void showLinkDialog$lambda$10(AuthorizationActivity authorizationActivity, MaterialDialog materialDialog, DialogAction dialogAction) {
        Intrinsics.checkNotNullParameter((Object)authorizationActivity, (String)"this$0");
        Intrinsics.checkNotNullParameter((Object)materialDialog, (String)"dialog");
        Intrinsics.checkNotNullParameter((Object)((Object)dialogAction), (String)"which");
        authorizationActivity.finish();
    }

    private static final void showLinkDialog$lambda$9(AuthorizationActivity authorizationActivity, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter((Object)authorizationActivity, (String)"this$0");
        authorizationActivity.finish();
    }

    public static /* synthetic */ void z(AuthorizationActivity authorizationActivity, View view) {
        AuthorizationActivity.setupListeners$lambda$2(authorizationActivity, view);
    }

    @Override
    public int getLayoutResource() {
        return 2131492894;
    }

    @Override
    public void onActivityResult(int n2, int n4, @Nullable Intent intent) {
        if (VKSdk.onActivityResult(n2, n4, intent, new VKCallback<VKAccessToken>(this){
            public final AuthorizationActivity this$0;
            {
                this.this$0 = authorizationActivity;
            }

            public void onError(@NotNull VKError vKError) {
                Intrinsics.checkNotNullParameter((Object)vKError, (String)"error");
                this.this$0.showErrorDialog(vKError.errorMessage);
            }

            public void onResult(@NotNull VKAccessToken vKAccessToken) {
                Intrinsics.checkNotNullParameter((Object)vKAccessToken, (String)"token");
                AuthorizationActivity.access$finishVkLogin(this.this$0, vKAccessToken);
            }
        })) {
            return;
        }
        Object object = this.fbCallbackManager;
        boolean bl = true;
        if (object == null || !object.onActivityResult(n2, n4, intent)) {
            bl = false;
        }
        if (bl) {
            return;
        }
        this.getTwitterAuthClient().onActivityResult(n2, n4, intent);
        if (n2 == GOOGLE_SIGN_IN_REQUEST) {
            object = GoogleSignIn.getSignedInAccountFromIntent((Intent)intent);
            Intrinsics.checkNotNullExpressionValue((Object)object, (String)"getSignedInAccountFromIntent(data)");
            this.handleGoogleSignInResult((Task<GoogleSignInAccount>)object);
        }
        if (n2 == YANDEX_SIGN_IN_REQUEST) {
            this.handleYandexSignInResult(n4, intent);
        }
        if (n2 == MAIL_SIGN_IN_REQUEST) {
            this.handleMailSignInResult(n4, intent);
        }
        if (n2 == AUTHORIZATION_REQUEST && n4 == -1) {
            RainUser rainUser = new RainUser();
            Object var6_7 = null;
            object = intent != null ? intent.getStringExtra("user_id") : null;
            rainUser.user_id = object;
            object = var6_7;
            if (intent != null) {
                object = intent.getStringExtra("device_token");
            }
            rainUser.device_token = object;
            this.userManager.authorize(rainUser);
            this.checkUser(new a(this, 3));
        }
        super.onActivityResult(n2, n4, intent);
    }

    @Override
    public void onCreate(@Nullable Bundle object) {
        super.onCreate((Bundle)object);
        ActivityAuthorizationBinding activityAuthorizationBinding = ActivityAuthorizationBinding.inflate(this.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue((Object)activityAuthorizationBinding, (String)"inflate(layoutInflater)");
        this.binding = activityAuthorizationBinding;
        Object var2_3 = null;
        object = activityAuthorizationBinding;
        if (activityAuthorizationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"binding");
            object = null;
        }
        object = ((ActivityAuthorizationBinding)object).getRoot();
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"binding.root");
        this.setContentView((View)object);
        object = this.binding;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"binding");
            object = var2_3;
        }
        this.setSupportActionBar(((ActivityAuthorizationBinding)object).toolbar.toolbar);
        object = this.getSupportActionBar();
        if (object != null) {
            object.setDisplayHomeAsUpEnabled(true);
        }
        this.setupListeners();
        this.initSdks();
        this.tagManager.logOpenView("Auth");
    }

    public final void recovery() {
        this.startActivity(new Intent((Context)this, RecoveryActivity.class));
    }
}

