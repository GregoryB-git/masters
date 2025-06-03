package io.flutter.plugins;

import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.PluginRegistry;
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
import sa.f;
import va.s;
import ya.d;

public final class GeneratedPluginRegistrant
{
  private static final String TAG = "GeneratedPluginRegistrant";
  
  public static void registerWith(FlutterEngine paramFlutterEngine)
  {
    Object localObject;
    try
    {
      PluginRegistry localPluginRegistry1 = paramFlutterEngine.getPlugins();
      localObject = new ra/a;
      ((ra.a)localObject).<init>();
      localPluginRegistry1.add((FlutterPlugin)localObject);
    }
    catch (Exception localException1)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin app_links, com.llfbandit.app_links.AppLinksPlugin", localException1);
    }
    try
    {
      localObject = paramFlutterEngine.getPlugins();
      com.ryanheise.audioservice.b localb = new com/ryanheise/audioservice/b;
      localb.<init>();
      ((PluginRegistry)localObject).add(localb);
    }
    catch (Exception localException2)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin audio_service, com.ryanheise.audioservice.AudioServicePlugin", localException2);
    }
    try
    {
      localObject = paramFlutterEngine.getPlugins();
      f localf = new sa/f;
      localf.<init>();
      ((PluginRegistry)localObject).add(localf);
    }
    catch (Exception localException3)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin audio_session, com.ryanheise.audio_session.AudioSessionPlugin", localException3);
    }
    try
    {
      localObject = paramFlutterEngine.getPlugins();
      g localg = new pa/g;
      localg.<init>();
      ((PluginRegistry)localObject).add(localg);
    }
    catch (Exception localException4)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin better_player, com.jhomlala.better_player.BetterPlayerPlugin", localException4);
    }
    try
    {
      localObject = paramFlutterEngine.getPlugins();
      FlutterFirebaseFirestorePlugin localFlutterFirebaseFirestorePlugin = new io/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;
      localFlutterFirebaseFirestorePlugin.<init>();
      ((PluginRegistry)localObject).add(localFlutterFirebaseFirestorePlugin);
    }
    catch (Exception localException5)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin cloud_firestore, io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin", localException5);
    }
    try
    {
      PluginRegistry localPluginRegistry2 = paramFlutterEngine.getPlugins();
      localObject = new io/flutter/plugins/firebase/functions/FlutterFirebaseFunctionsPlugin;
      ((FlutterFirebaseFunctionsPlugin)localObject).<init>();
      localPluginRegistry2.add((FlutterPlugin)localObject);
    }
    catch (Exception localException6)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin cloud_functions, io.flutter.plugins.firebase.functions.FlutterFirebaseFunctionsPlugin", localException6);
    }
    try
    {
      localObject = paramFlutterEngine.getPlugins();
      d locald = new ya/d;
      locald.<init>();
      ((PluginRegistry)localObject).add(locald);
    }
    catch (Exception localException7)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin connectivity_plus, dev.fluttercommunity.plus.connectivity.ConnectivityPlugin", localException7);
    }
    try
    {
      PluginRegistry localPluginRegistry3 = paramFlutterEngine.getPlugins();
      localObject = new qa/a;
      ((qa.a)localObject).<init>();
      localPluginRegistry3.add((FlutterPlugin)localObject);
    }
    catch (Exception localException8)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin dart_ui_isolate, com.lib.dart_ui_isolate.DartUiIsolatePlugin", localException8);
    }
    try
    {
      PluginRegistry localPluginRegistry4 = paramFlutterEngine.getPlugins();
      localObject = new za/a;
      ((za.a)localObject).<init>();
      localPluginRegistry4.add((FlutterPlugin)localObject);
    }
    catch (Exception localException9)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", localException9);
    }
    try
    {
      localObject = paramFlutterEngine.getPlugins();
      f3.b localb1 = new f3/b;
      localb1.<init>();
      ((PluginRegistry)localObject).add(localb1);
    }
    catch (Exception localException10)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin dynamic_icon_flutter, com.chuanpham.dynamic_icon_flutter.DynamicIconFlutterPlugin", localException10);
    }
    try
    {
      PluginRegistry localPluginRegistry5 = paramFlutterEngine.getPlugins();
      localObject = new io/flutter/plugins/firebase/analytics/FlutterFirebaseAnalyticsPlugin;
      ((FlutterFirebaseAnalyticsPlugin)localObject).<init>();
      localPluginRegistry5.add((FlutterPlugin)localObject);
    }
    catch (Exception localException11)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin firebase_analytics, io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin", localException11);
    }
    try
    {
      localObject = paramFlutterEngine.getPlugins();
      FlutterFirebaseAuthPlugin localFlutterFirebaseAuthPlugin = new io/flutter/plugins/firebase/auth/FlutterFirebaseAuthPlugin;
      localFlutterFirebaseAuthPlugin.<init>();
      ((PluginRegistry)localObject).add(localFlutterFirebaseAuthPlugin);
    }
    catch (Exception localException12)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin firebase_auth, io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin", localException12);
    }
    try
    {
      PluginRegistry localPluginRegistry6 = paramFlutterEngine.getPlugins();
      localObject = new io/flutter/plugins/firebase/core/FlutterFirebaseCorePlugin;
      ((FlutterFirebaseCorePlugin)localObject).<init>();
      localPluginRegistry6.add((FlutterPlugin)localObject);
    }
    catch (Exception localException13)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", localException13);
    }
    try
    {
      localObject = paramFlutterEngine.getPlugins();
      FlutterFirebaseCrashlyticsPlugin localFlutterFirebaseCrashlyticsPlugin = new io/flutter/plugins/firebase/crashlytics/FlutterFirebaseCrashlyticsPlugin;
      localFlutterFirebaseCrashlyticsPlugin.<init>();
      ((PluginRegistry)localObject).add(localFlutterFirebaseCrashlyticsPlugin);
    }
    catch (Exception localException14)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin firebase_crashlytics, io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin", localException14);
    }
    try
    {
      localObject = paramFlutterEngine.getPlugins();
      FlutterFirebaseDynamicLinksPlugin localFlutterFirebaseDynamicLinksPlugin = new io/flutter/plugins/firebase/dynamiclinks/FlutterFirebaseDynamicLinksPlugin;
      localFlutterFirebaseDynamicLinksPlugin.<init>();
      ((PluginRegistry)localObject).add(localFlutterFirebaseDynamicLinksPlugin);
    }
    catch (Exception localException15)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin firebase_dynamic_links, io.flutter.plugins.firebase.dynamiclinks.FlutterFirebaseDynamicLinksPlugin", localException15);
    }
    try
    {
      PluginRegistry localPluginRegistry7 = paramFlutterEngine.getPlugins();
      localObject = new io/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingPlugin;
      ((FlutterFirebaseMessagingPlugin)localObject).<init>();
      localPluginRegistry7.add((FlutterPlugin)localObject);
    }
    catch (Exception localException16)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin firebase_messaging, io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin", localException16);
    }
    try
    {
      localObject = paramFlutterEngine.getPlugins();
      d3.b localb2 = new d3/b;
      localb2.<init>();
      ((PluginRegistry)localObject).add(localb2);
    }
    catch (Exception localException17)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin flutter_displaymode, com.ajinasokan.flutterdisplaymode.DisplayModePlugin", localException17);
    }
    try
    {
      PluginRegistry localPluginRegistry8 = paramFlutterEngine.getPlugins();
      localObject = new vn/hunghd/flutterdownloader/b;
      ((vn.hunghd.flutterdownloader.b)localObject).<init>();
      localPluginRegistry8.add((FlutterPlugin)localObject);
    }
    catch (Exception localException18)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin flutter_downloader, vn.hunghd.flutterdownloader.FlutterDownloaderPlugin", localException18);
    }
    try
    {
      PluginRegistry localPluginRegistry9 = paramFlutterEngine.getPlugins();
      localObject = new com/pichillilorenzo/flutter_inappwebview_android/InAppWebViewFlutterPlugin;
      ((InAppWebViewFlutterPlugin)localObject).<init>();
      localPluginRegistry9.add((FlutterPlugin)localObject);
    }
    catch (Exception localException19)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin flutter_inappwebview_android, com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin", localException19);
    }
    try
    {
      localObject = paramFlutterEngine.getPlugins();
      GoogleSignInPlugin localGoogleSignInPlugin = new io/flutter/plugins/googlesignin/GoogleSignInPlugin;
      localGoogleSignInPlugin.<init>();
      ((PluginRegistry)localObject).add(localGoogleSignInPlugin);
    }
    catch (Exception localException20)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin google_sign_in_android, io.flutter.plugins.googlesignin.GoogleSignInPlugin", localException20);
    }
    try
    {
      PluginRegistry localPluginRegistry10 = paramFlutterEngine.getPlugins();
      localObject = new xa/b;
      ((xa.b)localObject).<init>();
      localPluginRegistry10.add((FlutterPlugin)localObject);
    }
    catch (Exception localException21)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin in_app_review, dev.britannio.in_app_review.InAppReviewPlugin", localException21);
    }
    try
    {
      PluginRegistry localPluginRegistry11 = paramFlutterEngine.getPlugins();
      localObject = new ua/c;
      ((ua.c)localObject).<init>();
      localPluginRegistry11.add((FlutterPlugin)localObject);
    }
    catch (Exception localException22)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin just_audio, com.ryanheise.just_audio.JustAudioPlugin", localException22);
    }
    try
    {
      localObject = paramFlutterEngine.getPlugins();
      ab.a locala = new ab/a;
      locala.<init>();
      ((PluginRegistry)localObject).add(locala);
    }
    catch (Exception localException23)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", localException23);
    }
    try
    {
      localObject = paramFlutterEngine.getPlugins();
      PathProviderPlugin localPathProviderPlugin = new io/flutter/plugins/pathprovider/PathProviderPlugin;
      localPathProviderPlugin.<init>();
      ((PluginRegistry)localObject).add(localPathProviderPlugin);
    }
    catch (Exception localException24)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", localException24);
    }
    try
    {
      PluginRegistry localPluginRegistry12 = paramFlutterEngine.getPlugins();
      localObject = new e3/e;
      ((e3.e)localObject).<init>();
      localPluginRegistry12.add((FlutterPlugin)localObject);
    }
    catch (Exception localException25)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", localException25);
    }
    try
    {
      PluginRegistry localPluginRegistry13 = paramFlutterEngine.getPlugins();
      localObject = new bb/e;
      ((bb.e)localObject).<init>();
      localPluginRegistry13.add((FlutterPlugin)localObject);
    }
    catch (Exception localException26)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", localException26);
    }
    try
    {
      PluginRegistry localPluginRegistry14 = paramFlutterEngine.getPlugins();
      localObject = new io/flutter/plugins/sharedpreferences/SharedPreferencesPlugin;
      ((SharedPreferencesPlugin)localObject).<init>();
      localPluginRegistry14.add((FlutterPlugin)localObject);
    }
    catch (Exception localException27)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", localException27);
    }
    try
    {
      localObject = paramFlutterEngine.getPlugins();
      c3.a locala1 = new c3/a;
      locala1.<init>();
      ((PluginRegistry)localObject).add(locala1);
    }
    catch (Exception localException28)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin sign_in_with_apple, com.aboutyou.dart_packages.sign_in_with_apple.SignInWithApplePlugin", localException28);
    }
    try
    {
      PluginRegistry localPluginRegistry15 = paramFlutterEngine.getPlugins();
      localObject = new va/s;
      ((s)localObject).<init>();
      localPluginRegistry15.add((FlutterPlugin)localObject);
    }
    catch (Exception localException29)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", localException29);
    }
    try
    {
      localObject = paramFlutterEngine.getPlugins();
      UrlLauncherPlugin localUrlLauncherPlugin = new io/flutter/plugins/urllauncher/UrlLauncherPlugin;
      localUrlLauncherPlugin.<init>();
      ((PluginRegistry)localObject).add(localUrlLauncherPlugin);
    }
    catch (Exception localException30)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", localException30);
    }
    try
    {
      paramFlutterEngine = paramFlutterEngine.getPlugins();
      cb.c localc = new cb/c;
      localc.<init>();
      paramFlutterEngine.add(localc);
    }
    catch (Exception paramFlutterEngine)
    {
      Log.e("GeneratedPluginRegistrant", "Error registering plugin wakelock_plus, dev.fluttercommunity.plus.wakelock.WakelockPlusPlugin", paramFlutterEngine);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.GeneratedPluginRegistrant
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */