package io.flutter.plugins;

import I5.n;
import J5.i;
import L5.w;
import M5.e;
import N5.h;
import O5.x;
import P5.j;
import R5.l;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.appsflyer.appsflyersdk.AppsflyerSdkPlugin;
import i5.C1361e;
import io.flutter.embedding.engine.a;
import k5.C1478F;
import m5.f;
import n5.C1736E;
import r5.C1927e;
import s5.C1957a;
import t5.AbstractC1995b;
import w1.m;

@Keep
/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(@NonNull a aVar) {
        try {
            aVar.r().c(new AppsflyerSdkPlugin());
        } catch (Exception e7) {
            AbstractC1995b.c(TAG, "Error registering plugin appsflyer_sdk, com.appsflyer.appsflyersdk.AppsflyerSdkPlugin", e7);
        }
        try {
            aVar.r().c(new com.ryanheise.audioservice.a());
        } catch (Exception e8) {
            AbstractC1995b.c(TAG, "Error registering plugin audio_service, com.ryanheise.audioservice.AudioServicePlugin", e8);
        }
        try {
            aVar.r().c(new C1478F());
        } catch (Exception e9) {
            AbstractC1995b.c(TAG, "Error registering plugin audio_session, com.ryanheise.audio_session.AudioSessionPlugin", e9);
        }
        try {
            aVar.r().c(new C1957a());
        } catch (Exception e10) {
            AbstractC1995b.c(TAG, "Error registering plugin facebook_app_events, id.oddbit.flutter.facebook_app_events.FacebookAppEventsPlugin", e10);
        }
        try {
            aVar.r().c(new n());
        } catch (Exception e11) {
            AbstractC1995b.c(TAG, "Error registering plugin firebase_analytics, io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin", e11);
        }
        try {
            aVar.r().c(new h());
        } catch (Exception e12) {
            AbstractC1995b.c(TAG, "Error registering plugin firebase_app_installations, io.flutter.plugins.firebase.installations.firebase_app_installations.FirebaseInstallationsPlugin", e12);
        }
        try {
            aVar.r().c(new i());
        } catch (Exception e13) {
            AbstractC1995b.c(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e13);
        }
        try {
            aVar.r().c(new K5.n());
        } catch (Exception e14) {
            AbstractC1995b.c(TAG, "Error registering plugin firebase_crashlytics, io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin", e14);
        }
        try {
            aVar.r().c(new w());
        } catch (Exception e15) {
            AbstractC1995b.c(TAG, "Error registering plugin firebase_database, io.flutter.plugins.firebase.database.FirebaseDatabasePlugin", e15);
        }
        try {
            aVar.r().c(new x());
        } catch (Exception e16) {
            AbstractC1995b.c(TAG, "Error registering plugin firebase_messaging, io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin", e16);
        }
        try {
            aVar.r().c(new j());
        } catch (Exception e17) {
            AbstractC1995b.c(TAG, "Error registering plugin firebase_performance, io.flutter.plugins.firebase.performance.FlutterFirebasePerformancePlugin", e17);
        }
        try {
            aVar.r().c(new e());
        } catch (Exception e18) {
            AbstractC1995b.c(TAG, "Error registering plugin firebase_remote_config, io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigPlugin", e18);
        }
        try {
            aVar.r().c(new A6.a());
        } catch (Exception e19) {
            AbstractC1995b.c(TAG, "Error registering plugin flutter_native_splash, net.jonhanson.flutter_native_splash.FlutterNativeSplashPlugin", e19);
        }
        try {
            aVar.r().c(new C1361e());
        } catch (Exception e20) {
            AbstractC1995b.c(TAG, "Error registering plugin flutter_secure_storage, com.it_nomads.fluttersecurestorage.FlutterSecureStoragePlugin", e20);
        }
        try {
            aVar.r().c(new f());
        } catch (Exception e21) {
            AbstractC1995b.c(TAG, "Error registering plugin just_audio, com.ryanheise.just_audio.JustAudioPlugin", e21);
        }
        try {
            aVar.r().c(new C1927e());
        } catch (Exception e22) {
            AbstractC1995b.c(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e22);
        }
        try {
            aVar.r().c(new Q5.j());
        } catch (Exception e23) {
            AbstractC1995b.c(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e23);
        }
        try {
            aVar.r().c(new m());
        } catch (Exception e24) {
            AbstractC1995b.c(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e24);
        }
        try {
            aVar.r().c(new l());
        } catch (Exception e25) {
            AbstractC1995b.c(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e25);
        }
        try {
            aVar.r().c(new C1736E());
        } catch (Exception e26) {
            AbstractC1995b.c(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e26);
        }
        try {
            aVar.r().c(new S5.j());
        } catch (Exception e27) {
            AbstractC1995b.c(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e27);
        }
    }
}
