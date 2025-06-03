package io.flutter.embedding.engine.systemchannels;

import f;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class LocalizationChannel
{
  private static final String TAG = "LocalizationChannel";
  public final MethodChannel channel;
  public final MethodChannel.MethodCallHandler handler;
  private LocalizationMessageHandler localizationMessageHandler;
  
  public LocalizationChannel(DartExecutor paramDartExecutor)
  {
    MethodChannel.MethodCallHandler local1 = new MethodChannel.MethodCallHandler()
    {
      public void onMethodCall(MethodCall paramAnonymousMethodCall, MethodChannel.Result paramAnonymousResult)
      {
        if (LocalizationChannel.access$000(LocalizationChannel.this) == null) {
          return;
        }
        String str = method;
        str.getClass();
        if (!str.equals("Localization.getStringResource"))
        {
          paramAnonymousResult.notImplemented();
        }
        else
        {
          paramAnonymousMethodCall = (JSONObject)paramAnonymousMethodCall.arguments();
          try
          {
            str = paramAnonymousMethodCall.getString("key");
            if (paramAnonymousMethodCall.has("locale")) {
              paramAnonymousMethodCall = paramAnonymousMethodCall.getString("locale");
            } else {
              paramAnonymousMethodCall = null;
            }
            paramAnonymousResult.success(LocalizationChannel.access$000(LocalizationChannel.this).getStringResource(str, paramAnonymousMethodCall));
          }
          catch (JSONException paramAnonymousMethodCall)
          {
            paramAnonymousResult.error("error", paramAnonymousMethodCall.getMessage(), null);
          }
        }
      }
    };
    handler = local1;
    paramDartExecutor = new MethodChannel(paramDartExecutor, "flutter/localization", JSONMethodCodec.INSTANCE);
    channel = paramDartExecutor;
    paramDartExecutor.setMethodCallHandler(local1);
  }
  
  public void sendLocales(List<Locale> paramList)
  {
    Log.v("LocalizationChannel", "Sending Locales to Flutter.");
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Locale localLocale = (Locale)paramList.next();
      StringBuilder localStringBuilder = f.l("Locale (Language: ");
      localStringBuilder.append(localLocale.getLanguage());
      localStringBuilder.append(", Country: ");
      localStringBuilder.append(localLocale.getCountry());
      localStringBuilder.append(", Variant: ");
      localStringBuilder.append(localLocale.getVariant());
      localStringBuilder.append(")");
      Log.v("LocalizationChannel", localStringBuilder.toString());
      localArrayList.add(localLocale.getLanguage());
      localArrayList.add(localLocale.getCountry());
      localArrayList.add(localLocale.getScript());
      localArrayList.add(localLocale.getVariant());
    }
    channel.invokeMethod("setLocale", localArrayList);
  }
  
  public void setLocalizationMessageHandler(LocalizationMessageHandler paramLocalizationMessageHandler)
  {
    localizationMessageHandler = paramLocalizationMessageHandler;
  }
  
  public static abstract interface LocalizationMessageHandler
  {
    public abstract String getStringResource(String paramString1, String paramString2);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.LocalizationChannel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */