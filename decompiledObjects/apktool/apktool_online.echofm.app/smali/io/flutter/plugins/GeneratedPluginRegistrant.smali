.class public final Lio/flutter/plugins/GeneratedPluginRegistrant;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "GeneratedPluginRegistrant"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static registerWith(Lio/flutter/embedding/engine/a;)V
    .locals 3
    .param p0    # Lio/flutter/embedding/engine/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "GeneratedPluginRegistrant"

    :try_start_0
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->r()LA5/b;

    move-result-object v1

    new-instance v2, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    invoke-direct {v2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;-><init>()V

    invoke-interface {v1, v2}, LA5/b;->c(LA5/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Error registering plugin appsflyer_sdk, com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"

    invoke-static {v0, v2, v1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    :try_start_1
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->r()LA5/b;

    move-result-object v1

    new-instance v2, Lcom/ryanheise/audioservice/a;

    invoke-direct {v2}, Lcom/ryanheise/audioservice/a;-><init>()V

    invoke-interface {v1, v2}, LA5/b;->c(LA5/a;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    const-string v2, "Error registering plugin audio_service, com.ryanheise.audioservice.AudioServicePlugin"

    invoke-static {v0, v2, v1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    :try_start_2
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->r()LA5/b;

    move-result-object v1

    new-instance v2, Lk5/F;

    invoke-direct {v2}, Lk5/F;-><init>()V

    invoke-interface {v1, v2}, LA5/b;->c(LA5/a;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v1

    const-string v2, "Error registering plugin audio_session, com.ryanheise.audio_session.AudioSessionPlugin"

    invoke-static {v0, v2, v1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    :try_start_3
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->r()LA5/b;

    move-result-object v1

    new-instance v2, Ls5/a;

    invoke-direct {v2}, Ls5/a;-><init>()V

    invoke-interface {v1, v2}, LA5/b;->c(LA5/a;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catch_3
    move-exception v1

    const-string v2, "Error registering plugin facebook_app_events, id.oddbit.flutter.facebook_app_events.FacebookAppEventsPlugin"

    invoke-static {v0, v2, v1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    :try_start_4
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->r()LA5/b;

    move-result-object v1

    new-instance v2, LI5/n;

    invoke-direct {v2}, LI5/n;-><init>()V

    invoke-interface {v1, v2}, LA5/b;->c(LA5/a;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_4

    :catch_4
    move-exception v1

    const-string v2, "Error registering plugin firebase_analytics, io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin"

    invoke-static {v0, v2, v1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_4
    :try_start_5
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->r()LA5/b;

    move-result-object v1

    new-instance v2, LN5/h;

    invoke-direct {v2}, LN5/h;-><init>()V

    invoke-interface {v1, v2}, LA5/b;->c(LA5/a;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_5

    :catch_5
    move-exception v1

    const-string v2, "Error registering plugin firebase_app_installations, io.flutter.plugins.firebase.installations.firebase_app_installations.FirebaseInstallationsPlugin"

    invoke-static {v0, v2, v1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_5
    :try_start_6
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->r()LA5/b;

    move-result-object v1

    new-instance v2, LJ5/i;

    invoke-direct {v2}, LJ5/i;-><init>()V

    invoke-interface {v1, v2}, LA5/b;->c(LA5/a;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_6

    :catch_6
    move-exception v1

    const-string v2, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin"

    invoke-static {v0, v2, v1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_6
    :try_start_7
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->r()LA5/b;

    move-result-object v1

    new-instance v2, LK5/n;

    invoke-direct {v2}, LK5/n;-><init>()V

    invoke-interface {v1, v2}, LA5/b;->c(LA5/a;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    goto :goto_7

    :catch_7
    move-exception v1

    const-string v2, "Error registering plugin firebase_crashlytics, io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin"

    invoke-static {v0, v2, v1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_7
    :try_start_8
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->r()LA5/b;

    move-result-object v1

    new-instance v2, LL5/w;

    invoke-direct {v2}, LL5/w;-><init>()V

    invoke-interface {v1, v2}, LA5/b;->c(LA5/a;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    goto :goto_8

    :catch_8
    move-exception v1

    const-string v2, "Error registering plugin firebase_database, io.flutter.plugins.firebase.database.FirebaseDatabasePlugin"

    invoke-static {v0, v2, v1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_8
    :try_start_9
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->r()LA5/b;

    move-result-object v1

    new-instance v2, LO5/x;

    invoke-direct {v2}, LO5/x;-><init>()V

    invoke-interface {v1, v2}, LA5/b;->c(LA5/a;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9

    goto :goto_9

    :catch_9
    move-exception v1

    const-string v2, "Error registering plugin firebase_messaging, io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin"

    invoke-static {v0, v2, v1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_9
    :try_start_a
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->r()LA5/b;

    move-result-object v1

    new-instance v2, LP5/j;

    invoke-direct {v2}, LP5/j;-><init>()V

    invoke-interface {v1, v2}, LA5/b;->c(LA5/a;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_a

    goto :goto_a

    :catch_a
    move-exception v1

    const-string v2, "Error registering plugin firebase_performance, io.flutter.plugins.firebase.performance.FlutterFirebasePerformancePlugin"

    invoke-static {v0, v2, v1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_a
    :try_start_b
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->r()LA5/b;

    move-result-object v1

    new-instance v2, LM5/e;

    invoke-direct {v2}, LM5/e;-><init>()V

    invoke-interface {v1, v2}, LA5/b;->c(LA5/a;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_b

    goto :goto_b

    :catch_b
    move-exception v1

    const-string v2, "Error registering plugin firebase_remote_config, io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigPlugin"

    invoke-static {v0, v2, v1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_b
    :try_start_c
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->r()LA5/b;

    move-result-object v1

    new-instance v2, LA6/a;

    invoke-direct {v2}, LA6/a;-><init>()V

    invoke-interface {v1, v2}, LA5/b;->c(LA5/a;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_c

    goto :goto_c

    :catch_c
    move-exception v1

    const-string v2, "Error registering plugin flutter_native_splash, net.jonhanson.flutter_native_splash.FlutterNativeSplashPlugin"

    invoke-static {v0, v2, v1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_c
    :try_start_d
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->r()LA5/b;

    move-result-object v1

    new-instance v2, Li5/e;

    invoke-direct {v2}, Li5/e;-><init>()V

    invoke-interface {v1, v2}, LA5/b;->c(LA5/a;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_d

    goto :goto_d

    :catch_d
    move-exception v1

    const-string v2, "Error registering plugin flutter_secure_storage, com.it_nomads.fluttersecurestorage.FlutterSecureStoragePlugin"

    invoke-static {v0, v2, v1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_d
    :try_start_e
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->r()LA5/b;

    move-result-object v1

    new-instance v2, Lm5/f;

    invoke-direct {v2}, Lm5/f;-><init>()V

    invoke-interface {v1, v2}, LA5/b;->c(LA5/a;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_e

    goto :goto_e

    :catch_e
    move-exception v1

    const-string v2, "Error registering plugin just_audio, com.ryanheise.just_audio.JustAudioPlugin"

    invoke-static {v0, v2, v1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_e
    :try_start_f
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->r()LA5/b;

    move-result-object v1

    new-instance v2, Lr5/e;

    invoke-direct {v2}, Lr5/e;-><init>()V

    invoke-interface {v1, v2}, LA5/b;->c(LA5/a;)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_f

    goto :goto_f

    :catch_f
    move-exception v1

    const-string v2, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin"

    invoke-static {v0, v2, v1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_f
    :try_start_10
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->r()LA5/b;

    move-result-object v1

    new-instance v2, LQ5/j;

    invoke-direct {v2}, LQ5/j;-><init>()V

    invoke-interface {v1, v2}, LA5/b;->c(LA5/a;)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_10

    goto :goto_10

    :catch_10
    move-exception v1

    const-string v2, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin"

    invoke-static {v0, v2, v1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_10
    :try_start_11
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->r()LA5/b;

    move-result-object v1

    new-instance v2, Lw1/m;

    invoke-direct {v2}, Lw1/m;-><init>()V

    invoke-interface {v1, v2}, LA5/b;->c(LA5/a;)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_11

    goto :goto_11

    :catch_11
    move-exception v1

    const-string v2, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin"

    invoke-static {v0, v2, v1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_11
    :try_start_12
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->r()LA5/b;

    move-result-object v1

    new-instance v2, LR5/l;

    invoke-direct {v2}, LR5/l;-><init>()V

    invoke-interface {v1, v2}, LA5/b;->c(LA5/a;)V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_12

    goto :goto_12

    :catch_12
    move-exception v1

    const-string v2, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin"

    invoke-static {v0, v2, v1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_12
    :try_start_13
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->r()LA5/b;

    move-result-object v1

    new-instance v2, Ln5/E;

    invoke-direct {v2}, Ln5/E;-><init>()V

    invoke-interface {v1, v2}, LA5/b;->c(LA5/a;)V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_13

    goto :goto_13

    :catch_13
    move-exception v1

    const-string v2, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin"

    invoke-static {v0, v2, v1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_13
    :try_start_14
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->r()LA5/b;

    move-result-object p0

    new-instance v1, LS5/j;

    invoke-direct {v1}, LS5/j;-><init>()V

    invoke-interface {p0, v1}, LA5/b;->c(LA5/a;)V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_14

    goto :goto_14

    :catch_14
    move-exception p0

    const-string v1, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin"

    invoke-static {v0, v1, p0}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_14
    return-void
.end method
