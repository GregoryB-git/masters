// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugins;

import n5.E;
import R5.l;
import w1.m;
import m5.f;
import M5.e;
import P5.j;
import O5.x;
import L5.w;
import J5.i;
import N5.h;
import I5.n;
import k5.F;
import t5.b;
import com.appsflyer.appsflyersdk.AppsflyerSdkPlugin;
import androidx.annotation.NonNull;
import io.flutter.embedding.engine.a;
import androidx.annotation.Keep;

@Keep
public final class GeneratedPluginRegistrant
{
    private static final String TAG = "GeneratedPluginRegistrant";
    
    public static void registerWith(@NonNull final a a) {
        try {
            a.r().c(new AppsflyerSdkPlugin());
        }
        catch (Exception ex) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin appsflyer_sdk, com.appsflyer.appsflyersdk.AppsflyerSdkPlugin", ex);
        }
        try {
            a.r().c(new com.ryanheise.audioservice.a());
        }
        catch (Exception ex2) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin audio_service, com.ryanheise.audioservice.AudioServicePlugin", ex2);
        }
        try {
            a.r().c(new F());
        }
        catch (Exception ex3) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin audio_session, com.ryanheise.audio_session.AudioSessionPlugin", ex3);
        }
        try {
            a.r().c(new s5.a());
        }
        catch (Exception ex4) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin facebook_app_events, id.oddbit.flutter.facebook_app_events.FacebookAppEventsPlugin", ex4);
        }
        try {
            a.r().c(new n());
        }
        catch (Exception ex5) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_analytics, io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin", ex5);
        }
        try {
            a.r().c(new h());
        }
        catch (Exception ex6) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_app_installations, io.flutter.plugins.firebase.installations.firebase_app_installations.FirebaseInstallationsPlugin", ex6);
        }
        try {
            a.r().c(new i());
        }
        catch (Exception ex7) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", ex7);
        }
        try {
            a.r().c(new K5.n());
        }
        catch (Exception ex8) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_crashlytics, io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin", ex8);
        }
        try {
            a.r().c(new w());
        }
        catch (Exception ex9) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_database, io.flutter.plugins.firebase.database.FirebaseDatabasePlugin", ex9);
        }
        try {
            a.r().c(new x());
        }
        catch (Exception ex10) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_messaging, io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin", ex10);
        }
        try {
            a.r().c(new j());
        }
        catch (Exception ex11) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_performance, io.flutter.plugins.firebase.performance.FlutterFirebasePerformancePlugin", ex11);
        }
        try {
            a.r().c(new e());
        }
        catch (Exception ex12) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_remote_config, io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigPlugin", ex12);
        }
        try {
            a.r().c(new A6.a());
        }
        catch (Exception ex13) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin flutter_native_splash, net.jonhanson.flutter_native_splash.FlutterNativeSplashPlugin", ex13);
        }
        try {
            a.r().c(new i5.e());
        }
        catch (Exception ex14) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin flutter_secure_storage, com.it_nomads.fluttersecurestorage.FlutterSecureStoragePlugin", ex14);
        }
        try {
            a.r().c(new f());
        }
        catch (Exception ex15) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin just_audio, com.ryanheise.just_audio.JustAudioPlugin", ex15);
        }
        try {
            a.r().c(new r5.e());
        }
        catch (Exception ex16) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", ex16);
        }
        try {
            a.r().c(new Q5.j());
        }
        catch (Exception ex17) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", ex17);
        }
        try {
            a.r().c(new m());
        }
        catch (Exception ex18) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", ex18);
        }
        try {
            a.r().c(new l());
        }
        catch (Exception ex19) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", ex19);
        }
        try {
            a.r().c(new E());
        }
        catch (Exception ex20) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", ex20);
        }
        try {
            a.r().c(new S5.j());
        }
        catch (Exception ex21) {
            b.c("GeneratedPluginRegistrant", "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", ex21);
        }
    }
}
