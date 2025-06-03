package io.flutter.plugins;

import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.ryanheise.audioservice.b;
import e3.e;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import io.flutter.plugins.firebase.dynamiclinks.FlutterFirebaseDynamicLinksPlugin;
import io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin;
import io.flutter.plugins.firebase.functions.FlutterFirebaseFunctionsPlugin;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;
import io.flutter.plugins.googlesignin.GoogleSignInPlugin;
import io.flutter.plugins.pathprovider.PathProviderPlugin;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin;
import io.flutter.plugins.urllauncher.UrlLauncherPlugin;
import pa.g;
import ra.a;
import sa.f;
import ua.c;
import va.s;
import ya.d;

/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(FlutterEngine flutterEngine) {
        try {
            flutterEngine.getPlugins().add(new a());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin app_links, com.llfbandit.app_links.AppLinksPlugin", e10);
        }
        try {
            flutterEngine.getPlugins().add(new b());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin audio_service, com.ryanheise.audioservice.AudioServicePlugin", e11);
        }
        try {
            flutterEngine.getPlugins().add(new f());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin audio_session, com.ryanheise.audio_session.AudioSessionPlugin", e12);
        }
        try {
            flutterEngine.getPlugins().add(new g());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin better_player, com.jhomlala.better_player.BetterPlayerPlugin", e13);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseFirestorePlugin());
        } catch (Exception e14) {
            Log.e(TAG, "Error registering plugin cloud_firestore, io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin", e14);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseFunctionsPlugin());
        } catch (Exception e15) {
            Log.e(TAG, "Error registering plugin cloud_functions, io.flutter.plugins.firebase.functions.FlutterFirebaseFunctionsPlugin", e15);
        }
        try {
            flutterEngine.getPlugins().add(new d());
        } catch (Exception e16) {
            Log.e(TAG, "Error registering plugin connectivity_plus, dev.fluttercommunity.plus.connectivity.ConnectivityPlugin", e16);
        }
        try {
            flutterEngine.getPlugins().add(new qa.a());
        } catch (Exception e17) {
            Log.e(TAG, "Error registering plugin dart_ui_isolate, com.lib.dart_ui_isolate.DartUiIsolatePlugin", e17);
        }
        try {
            flutterEngine.getPlugins().add(new za.a());
        } catch (Exception e18) {
            Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e18);
        }
        try {
            flutterEngine.getPlugins().add(new f3.b());
        } catch (Exception e19) {
            Log.e(TAG, "Error registering plugin dynamic_icon_flutter, com.chuanpham.dynamic_icon_flutter.DynamicIconFlutterPlugin", e19);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseAnalyticsPlugin());
        } catch (Exception e20) {
            Log.e(TAG, "Error registering plugin firebase_analytics, io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin", e20);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseAuthPlugin());
        } catch (Exception e21) {
            Log.e(TAG, "Error registering plugin firebase_auth, io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin", e21);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseCorePlugin());
        } catch (Exception e22) {
            Log.e(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e22);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseCrashlyticsPlugin());
        } catch (Exception e23) {
            Log.e(TAG, "Error registering plugin firebase_crashlytics, io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin", e23);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseDynamicLinksPlugin());
        } catch (Exception e24) {
            Log.e(TAG, "Error registering plugin firebase_dynamic_links, io.flutter.plugins.firebase.dynamiclinks.FlutterFirebaseDynamicLinksPlugin", e24);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseMessagingPlugin());
        } catch (Exception e25) {
            Log.e(TAG, "Error registering plugin firebase_messaging, io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin", e25);
        }
        try {
            flutterEngine.getPlugins().add(new d3.b());
        } catch (Exception e26) {
            Log.e(TAG, "Error registering plugin flutter_displaymode, com.ajinasokan.flutterdisplaymode.DisplayModePlugin", e26);
        }
        try {
            flutterEngine.getPlugins().add(new vn.hunghd.flutterdownloader.b());
        } catch (Exception e27) {
            Log.e(TAG, "Error registering plugin flutter_downloader, vn.hunghd.flutterdownloader.FlutterDownloaderPlugin", e27);
        }
        try {
            flutterEngine.getPlugins().add(new InAppWebViewFlutterPlugin());
        } catch (Exception e28) {
            Log.e(TAG, "Error registering plugin flutter_inappwebview_android, com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin", e28);
        }
        try {
            flutterEngine.getPlugins().add(new GoogleSignInPlugin());
        } catch (Exception e29) {
            Log.e(TAG, "Error registering plugin google_sign_in_android, io.flutter.plugins.googlesignin.GoogleSignInPlugin", e29);
        }
        try {
            flutterEngine.getPlugins().add(new xa.b());
        } catch (Exception e30) {
            Log.e(TAG, "Error registering plugin in_app_review, dev.britannio.in_app_review.InAppReviewPlugin", e30);
        }
        try {
            flutterEngine.getPlugins().add(new c());
        } catch (Exception e31) {
            Log.e(TAG, "Error registering plugin just_audio, com.ryanheise.just_audio.JustAudioPlugin", e31);
        }
        try {
            flutterEngine.getPlugins().add(new ab.a());
        } catch (Exception e32) {
            Log.e(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e32);
        }
        try {
            flutterEngine.getPlugins().add(new PathProviderPlugin());
        } catch (Exception e33) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e33);
        }
        try {
            flutterEngine.getPlugins().add(new e());
        } catch (Exception e34) {
            Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e34);
        }
        try {
            flutterEngine.getPlugins().add(new bb.e());
        } catch (Exception e35) {
            Log.e(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e35);
        }
        try {
            flutterEngine.getPlugins().add(new SharedPreferencesPlugin());
        } catch (Exception e36) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e36);
        }
        try {
            flutterEngine.getPlugins().add(new c3.a());
        } catch (Exception e37) {
            Log.e(TAG, "Error registering plugin sign_in_with_apple, com.aboutyou.dart_packages.sign_in_with_apple.SignInWithApplePlugin", e37);
        }
        try {
            flutterEngine.getPlugins().add(new s());
        } catch (Exception e38) {
            Log.e(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e38);
        }
        try {
            flutterEngine.getPlugins().add(new UrlLauncherPlugin());
        } catch (Exception e39) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e39);
        }
        try {
            flutterEngine.getPlugins().add(new cb.c());
        } catch (Exception e40) {
            Log.e(TAG, "Error registering plugin wakelock_plus, dev.fluttercommunity.plus.wakelock.WakelockPlusPlugin", e40);
        }
    }
}
