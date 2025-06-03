/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package io.flutter.plugins;

import I5.n;
import J5.i;
import L5.w;
import N5.h;
import O5.x;
import P5.j;
import R5.l;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.appsflyer.appsflyersdk.AppsflyerSdkPlugin;
import k5.F;
import m5.f;
import n5.E;
import r5.e;
import s5.a;
import t5.b;
import w1.m;

@Keep
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(@NonNull io.flutter.embedding.engine.a a8) {
        try {
            a8.r().c(new AppsflyerSdkPlugin());
        }
        catch (Exception exception) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin appsflyer_sdk, com.appsflyer.appsflyersdk.AppsflyerSdkPlugin", (Throwable)exception);
        }
        try {
            a8.r().c(new com.ryanheise.audioservice.a());
        }
        catch (Exception exception) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin audio_service, com.ryanheise.audioservice.AudioServicePlugin", (Throwable)exception);
        }
        try {
            a8.r().c(new F());
        }
        catch (Exception exception) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin audio_session, com.ryanheise.audio_session.AudioSessionPlugin", (Throwable)exception);
        }
        try {
            a8.r().c(new a());
        }
        catch (Exception exception) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin facebook_app_events, id.oddbit.flutter.facebook_app_events.FacebookAppEventsPlugin", (Throwable)exception);
        }
        try {
            a8.r().c(new n());
        }
        catch (Exception exception) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_analytics, io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin", (Throwable)exception);
        }
        try {
            a8.r().c(new h());
        }
        catch (Exception exception) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_app_installations, io.flutter.plugins.firebase.installations.firebase_app_installations.FirebaseInstallationsPlugin", (Throwable)exception);
        }
        try {
            a8.r().c(new i());
        }
        catch (Exception exception) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", (Throwable)exception);
        }
        try {
            a8.r().c(new K5.n());
        }
        catch (Exception exception) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_crashlytics, io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin", (Throwable)exception);
        }
        try {
            a8.r().c(new w());
        }
        catch (Exception exception) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_database, io.flutter.plugins.firebase.database.FirebaseDatabasePlugin", (Throwable)exception);
        }
        try {
            a8.r().c(new x());
        }
        catch (Exception exception) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_messaging, io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin", (Throwable)exception);
        }
        try {
            a8.r().c(new j());
        }
        catch (Exception exception) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_performance, io.flutter.plugins.firebase.performance.FlutterFirebasePerformancePlugin", (Throwable)exception);
        }
        try {
            a8.r().c(new M5.e());
        }
        catch (Exception exception) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_remote_config, io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigPlugin", (Throwable)exception);
        }
        try {
            a8.r().c(new A6.a());
        }
        catch (Exception exception) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin flutter_native_splash, net.jonhanson.flutter_native_splash.FlutterNativeSplashPlugin", (Throwable)exception);
        }
        try {
            a8.r().c(new i5.e());
        }
        catch (Exception exception) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin flutter_secure_storage, com.it_nomads.fluttersecurestorage.FlutterSecureStoragePlugin", (Throwable)exception);
        }
        try {
            a8.r().c(new f());
        }
        catch (Exception exception) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin just_audio, com.ryanheise.just_audio.JustAudioPlugin", (Throwable)exception);
        }
        try {
            a8.r().c(new e());
        }
        catch (Exception exception) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", (Throwable)exception);
        }
        try {
            a8.r().c(new Q5.j());
        }
        catch (Exception exception) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", (Throwable)exception);
        }
        try {
            a8.r().c(new m());
        }
        catch (Exception exception) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", (Throwable)exception);
        }
        try {
            a8.r().c(new l());
        }
        catch (Exception exception) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", (Throwable)exception);
        }
        try {
            a8.r().c(new E());
        }
        catch (Exception exception) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", (Throwable)exception);
        }
        try {
            a8.r().c(new S5.j());
            return;
        }
        catch (Exception exception) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", (Throwable)exception);
            return;
        }
    }
}

