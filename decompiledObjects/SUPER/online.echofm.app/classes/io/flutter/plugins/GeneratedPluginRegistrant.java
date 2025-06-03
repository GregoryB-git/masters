package io.flutter.plugins;

import J5.i;
import L5.w;
import N5.h;
import O5.x;
import R5.l;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.appsflyer.appsflyersdk.AppsflyerSdkPlugin;
import k5.F;
import m5.f;
import n5.E;
import w1.m;

@Keep
public final class GeneratedPluginRegistrant
{
  private static final String TAG = "GeneratedPluginRegistrant";
  
  public static void registerWith(@NonNull io.flutter.embedding.engine.a parama)
  {
    Object localObject;
    try
    {
      A5.b localb1 = parama.r();
      localObject = new com/appsflyer/appsflyersdk/AppsflyerSdkPlugin;
      ((AppsflyerSdkPlugin)localObject).<init>();
      localb1.c((A5.a)localObject);
    }
    catch (Exception localException1)
    {
      t5.b.c("GeneratedPluginRegistrant", "Error registering plugin appsflyer_sdk, com.appsflyer.appsflyersdk.AppsflyerSdkPlugin", localException1);
    }
    try
    {
      localObject = parama.r();
      com.ryanheise.audioservice.a locala = new com/ryanheise/audioservice/a;
      locala.<init>();
      ((A5.b)localObject).c(locala);
    }
    catch (Exception localException2)
    {
      t5.b.c("GeneratedPluginRegistrant", "Error registering plugin audio_service, com.ryanheise.audioservice.AudioServicePlugin", localException2);
    }
    try
    {
      A5.b localb2 = parama.r();
      localObject = new k5/F;
      ((F)localObject).<init>();
      localb2.c((A5.a)localObject);
    }
    catch (Exception localException3)
    {
      t5.b.c("GeneratedPluginRegistrant", "Error registering plugin audio_session, com.ryanheise.audio_session.AudioSessionPlugin", localException3);
    }
    try
    {
      A5.b localb3 = parama.r();
      localObject = new s5/a;
      ((s5.a)localObject).<init>();
      localb3.c((A5.a)localObject);
    }
    catch (Exception localException4)
    {
      t5.b.c("GeneratedPluginRegistrant", "Error registering plugin facebook_app_events, id.oddbit.flutter.facebook_app_events.FacebookAppEventsPlugin", localException4);
    }
    try
    {
      A5.b localb4 = parama.r();
      localObject = new I5/n;
      ((I5.n)localObject).<init>();
      localb4.c((A5.a)localObject);
    }
    catch (Exception localException5)
    {
      t5.b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_analytics, io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin", localException5);
    }
    try
    {
      A5.b localb5 = parama.r();
      localObject = new N5/h;
      ((h)localObject).<init>();
      localb5.c((A5.a)localObject);
    }
    catch (Exception localException6)
    {
      t5.b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_app_installations, io.flutter.plugins.firebase.installations.firebase_app_installations.FirebaseInstallationsPlugin", localException6);
    }
    try
    {
      localObject = parama.r();
      i locali = new J5/i;
      locali.<init>();
      ((A5.b)localObject).c(locali);
    }
    catch (Exception localException7)
    {
      t5.b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", localException7);
    }
    try
    {
      localObject = parama.r();
      K5.n localn = new K5/n;
      localn.<init>();
      ((A5.b)localObject).c(localn);
    }
    catch (Exception localException8)
    {
      t5.b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_crashlytics, io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin", localException8);
    }
    try
    {
      localObject = parama.r();
      w localw = new L5/w;
      localw.<init>();
      ((A5.b)localObject).c(localw);
    }
    catch (Exception localException9)
    {
      t5.b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_database, io.flutter.plugins.firebase.database.FirebaseDatabasePlugin", localException9);
    }
    try
    {
      A5.b localb6 = parama.r();
      localObject = new O5/x;
      ((x)localObject).<init>();
      localb6.c((A5.a)localObject);
    }
    catch (Exception localException10)
    {
      t5.b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_messaging, io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin", localException10);
    }
    try
    {
      localObject = parama.r();
      P5.j localj = new P5/j;
      localj.<init>();
      ((A5.b)localObject).c(localj);
    }
    catch (Exception localException11)
    {
      t5.b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_performance, io.flutter.plugins.firebase.performance.FlutterFirebasePerformancePlugin", localException11);
    }
    try
    {
      localObject = parama.r();
      M5.e locale = new M5/e;
      locale.<init>();
      ((A5.b)localObject).c(locale);
    }
    catch (Exception localException12)
    {
      t5.b.c("GeneratedPluginRegistrant", "Error registering plugin firebase_remote_config, io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigPlugin", localException12);
    }
    try
    {
      A5.b localb7 = parama.r();
      localObject = new A6/a;
      ((A6.a)localObject).<init>();
      localb7.c((A5.a)localObject);
    }
    catch (Exception localException13)
    {
      t5.b.c("GeneratedPluginRegistrant", "Error registering plugin flutter_native_splash, net.jonhanson.flutter_native_splash.FlutterNativeSplashPlugin", localException13);
    }
    try
    {
      A5.b localb8 = parama.r();
      localObject = new i5/e;
      ((i5.e)localObject).<init>();
      localb8.c((A5.a)localObject);
    }
    catch (Exception localException14)
    {
      t5.b.c("GeneratedPluginRegistrant", "Error registering plugin flutter_secure_storage, com.it_nomads.fluttersecurestorage.FlutterSecureStoragePlugin", localException14);
    }
    try
    {
      A5.b localb9 = parama.r();
      localObject = new m5/f;
      ((f)localObject).<init>();
      localb9.c((A5.a)localObject);
    }
    catch (Exception localException15)
    {
      t5.b.c("GeneratedPluginRegistrant", "Error registering plugin just_audio, com.ryanheise.just_audio.JustAudioPlugin", localException15);
    }
    try
    {
      localObject = parama.r();
      r5.e locale1 = new r5/e;
      locale1.<init>();
      ((A5.b)localObject).c(locale1);
    }
    catch (Exception localException16)
    {
      t5.b.c("GeneratedPluginRegistrant", "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", localException16);
    }
    try
    {
      A5.b localb10 = parama.r();
      localObject = new Q5/j;
      ((Q5.j)localObject).<init>();
      localb10.c((A5.a)localObject);
    }
    catch (Exception localException17)
    {
      t5.b.c("GeneratedPluginRegistrant", "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", localException17);
    }
    try
    {
      A5.b localb11 = parama.r();
      localObject = new w1/m;
      ((m)localObject).<init>();
      localb11.c((A5.a)localObject);
    }
    catch (Exception localException18)
    {
      t5.b.c("GeneratedPluginRegistrant", "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", localException18);
    }
    try
    {
      localObject = parama.r();
      l locall = new R5/l;
      locall.<init>();
      ((A5.b)localObject).c(locall);
    }
    catch (Exception localException19)
    {
      t5.b.c("GeneratedPluginRegistrant", "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", localException19);
    }
    try
    {
      localObject = parama.r();
      E localE = new n5/E;
      localE.<init>();
      ((A5.b)localObject).c(localE);
    }
    catch (Exception localException20)
    {
      t5.b.c("GeneratedPluginRegistrant", "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", localException20);
    }
    try
    {
      A5.b localb12 = parama.r();
      parama = new S5/j;
      parama.<init>();
      localb12.c(parama);
    }
    catch (Exception parama)
    {
      t5.b.c("GeneratedPluginRegistrant", "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", parama);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.GeneratedPluginRegistrant
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */