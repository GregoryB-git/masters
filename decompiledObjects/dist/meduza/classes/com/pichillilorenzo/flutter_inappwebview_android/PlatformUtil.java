package com.pichillilorenzo.flutter_inappwebview_android;

import android.os.Build.VERSION;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class PlatformUtil
  extends ChannelDelegateImpl
{
  public static final String LOG_TAG = "PlatformUtil";
  public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_platformutil";
  public InAppWebViewFlutterPlugin plugin;
  
  public PlatformUtil(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin)
  {
    super(new MethodChannel(messenger, "com.pichillilorenzo/flutter_inappwebview_platformutil"));
    plugin = paramInAppWebViewFlutterPlugin;
  }
  
  public static String formatDate(long paramLong, String paramString, Locale paramLocale, TimeZone paramTimeZone)
  {
    paramString = new SimpleDateFormat(paramString, paramLocale);
    paramString.setTimeZone(paramTimeZone);
    return paramString.format(new Date(paramLong));
  }
  
  public static Locale getLocaleFromString(String paramString)
  {
    if (paramString == null) {
      return Locale.US;
    }
    String[] arrayOfString = paramString.split("_");
    String str1 = arrayOfString[0];
    int i = arrayOfString.length;
    String str2 = "";
    if (i > 1) {
      paramString = arrayOfString[1];
    } else {
      paramString = "";
    }
    if (arrayOfString.length > 2) {
      str2 = arrayOfString[2];
    }
    return new Locale(str1, paramString, str2);
  }
  
  public void dispose()
  {
    super.dispose();
    plugin = null;
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    String str1 = method;
    str1.getClass();
    if (!str1.equals("formatDate")) {
      if (!str1.equals("getSystemVersion"))
      {
        paramResult.notImplemented();
        return;
      }
    }
    long l;
    String str2;
    Locale localLocale;
    for (paramMethodCall = String.valueOf(Build.VERSION.SDK_INT);; paramMethodCall = formatDate(l, str2, localLocale, TimeZone.getTimeZone(paramMethodCall)))
    {
      paramResult.success(paramMethodCall);
      break;
      l = ((Long)paramMethodCall.argument("date")).longValue();
      str2 = (String)paramMethodCall.argument("format");
      localLocale = getLocaleFromString((String)paramMethodCall.argument("locale"));
      str1 = (String)paramMethodCall.argument("timezone");
      paramMethodCall = str1;
      if (str1 == null) {
        paramMethodCall = "UTC";
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.PlatformUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */