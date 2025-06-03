package com.pichillilorenzo.flutter_inappwebview_android;

import a0.j;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import d2.h0;
import d2.i0;
import d2.j0.a;
import g;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import x6.b;

public class MyCookieManager
  extends ChannelDelegateImpl
{
  public static final String LOG_TAG = "MyCookieManager";
  public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_cookiemanager";
  public static CookieManager cookieManager;
  public InAppWebViewFlutterPlugin plugin;
  
  public MyCookieManager(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin)
  {
    super(new MethodChannel(messenger, "com.pichillilorenzo/flutter_inappwebview_cookiemanager"));
    plugin = paramInAppWebViewFlutterPlugin;
  }
  
  public static String getCookieExpirationDate(Long paramLong)
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.US);
    localSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    return localSimpleDateFormat.format(new Date(paramLong.longValue()));
  }
  
  private static CookieManager getCookieManager()
  {
    if (cookieManager == null) {
      try
      {
        cookieManager = CookieManager.getInstance();
      }
      catch (Exception localException)
      {
        if ((localException.getMessage() != null) && (localException.getClass().getCanonicalName().equals("android.webkit.WebViewFactory.MissingWebViewPackageException"))) {
          return null;
        }
        throw localException;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        return null;
      }
    }
    return cookieManager;
  }
  
  public static void init()
  {
    if (cookieManager == null) {
      cookieManager = getCookieManager();
    }
  }
  
  public void deleteAllCookies(final MethodChannel.Result paramResult)
  {
    CookieManager localCookieManager = getCookieManager();
    cookieManager = localCookieManager;
    if (localCookieManager == null)
    {
      paramResult.success(Boolean.FALSE);
      return;
    }
    cookieManager.removeAllCookies(new ValueCallback()
    {
      public void onReceiveValue(Boolean paramAnonymousBoolean)
      {
        paramResult.success(paramAnonymousBoolean);
      }
    });
    cookieManager.flush();
  }
  
  public void deleteCookie(String paramString1, String paramString2, String paramString3, String paramString4, final MethodChannel.Result paramResult)
  {
    CookieManager localCookieManager = getCookieManager();
    cookieManager = localCookieManager;
    if (localCookieManager == null)
    {
      paramResult.success(Boolean.FALSE);
      return;
    }
    paramString4 = j.k(paramString2, "=; Path=", paramString4, "; Max-Age=-1");
    paramString2 = paramString4;
    if (paramString3 != null) {
      paramString2 = g.e(paramString4, "; Domain=", paramString3);
    }
    paramString2 = g.d(paramString2, ";");
    cookieManager.setCookie(paramString1, paramString2, new ValueCallback()
    {
      public void onReceiveValue(Boolean paramAnonymousBoolean)
      {
        paramResult.success(paramAnonymousBoolean);
      }
    });
    cookieManager.flush();
  }
  
  public void deleteCookies(String paramString1, String paramString2, String paramString3, MethodChannel.Result paramResult)
  {
    Object localObject = getCookieManager();
    cookieManager = (CookieManager)localObject;
    if (localObject == null)
    {
      paramString1 = Boolean.FALSE;
    }
    else
    {
      localObject = ((CookieManager)localObject).getCookie(paramString1);
      if (localObject != null)
      {
        String[] arrayOfString = ((String)localObject).split(";");
        int i = arrayOfString.length;
        for (int j = 0; j < i; j++)
        {
          String str = j.k(arrayOfString[j].split("=", 2)[0].trim(), "=; Path=", paramString3, "; Max-Age=-1");
          localObject = str;
          if (paramString2 != null) {
            localObject = g.e(str, "; Domain=", paramString2);
          }
          localObject = g.d((String)localObject, ";");
          cookieManager.setCookie(paramString1, (String)localObject, null);
        }
        cookieManager.flush();
      }
      paramString1 = Boolean.TRUE;
    }
    paramResult.success(paramString1);
  }
  
  public void dispose()
  {
    super.dispose();
    plugin = null;
  }
  
  public List<Map<String, Object>> getCookies(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = getCookieManager();
    cookieManager = (CookieManager)localObject1;
    if (localObject1 == null) {
      return localArrayList;
    }
    Object localObject2 = new ArrayList();
    localObject1 = "GET_COOKIE_INFO";
    boolean bool = b.c0("GET_COOKIE_INFO");
    Object localObject3 = ";";
    Object localObject4;
    if (bool)
    {
      localObject2 = cookieManager;
      if (i0.N.d()) {
        paramString = ((WebViewCookieManagerBoundaryInterface)zc.a.a(WebViewCookieManagerBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface)ab).convertCookieManager(localObject2))).getCookieInfo(paramString);
      } else {
        throw i0.a();
      }
    }
    else
    {
      localObject4 = cookieManager.getCookie(paramString);
      paramString = (String)localObject2;
      if (localObject4 != null) {
        paramString = Arrays.asList(((String)localObject4).split(";"));
      }
    }
    paramString = paramString.iterator();
    while (paramString.hasNext())
    {
      String[] arrayOfString = ((String)paramString.next()).split((String)localObject3);
      if (arrayOfString.length != 0)
      {
        localObject2 = arrayOfString[0].split("=", 2);
        localObject4 = localObject2[0].trim();
        if (localObject2.length > 1) {
          localObject2 = localObject2[1].trim();
        } else {
          localObject2 = "";
        }
        HashMap localHashMap = new HashMap();
        localHashMap.put("name", localObject4);
        localHashMap.put("value", localObject2);
        localHashMap.put("expiresDate", null);
        localHashMap.put("isSessionOnly", null);
        localHashMap.put("domain", null);
        localHashMap.put("sameSite", null);
        localHashMap.put("isSecure", null);
        localHashMap.put("isHttpOnly", null);
        localHashMap.put("path", null);
        localObject4 = paramString;
        Object localObject5 = localObject1;
        localObject2 = localObject3;
        if (b.c0((String)localObject1))
        {
          localObject2 = Boolean.FALSE;
          localHashMap.put("isSecure", localObject2);
          localHashMap.put("isHttpOnly", localObject2);
          for (int i = 1;; i++)
          {
            localObject4 = paramString;
            localObject5 = localObject1;
            localObject2 = localObject3;
            if (i >= arrayOfString.length) {
              break;
            }
            localObject2 = arrayOfString[i].split("=", 2);
            localObject4 = localObject2[0].trim();
            if (localObject2.length > 1) {
              localObject2 = localObject2[1].trim();
            } else {
              localObject2 = "";
            }
            if (((String)localObject4).equalsIgnoreCase("Expires")) {
              try
              {
                localObject4 = new java/text/SimpleDateFormat;
                try
                {
                  ((SimpleDateFormat)localObject4).<init>("EEE, dd MMM yyyy hh:mm:ss z", Locale.US);
                  localObject2 = ((DateFormat)localObject4).parse((String)localObject2);
                  if (localObject2 == null) {
                    continue;
                  }
                  localHashMap.put("expiresDate", Long.valueOf(((Date)localObject2).getTime()));
                }
                catch (ParseException localParseException1) {}
                Log.e("MyCookieManager", "", localParseException2);
              }
              catch (ParseException localParseException2) {}
            }
            for (;;)
            {
              break;
              if (((String)localObject4).equalsIgnoreCase("Max-Age")) {
                try
                {
                  long l = Long.parseLong(localParseException2);
                  localHashMap.put("expiresDate", Long.valueOf(System.currentTimeMillis() + l));
                }
                catch (NumberFormatException localNumberFormatException) {}
              } else if (((String)localObject4).equalsIgnoreCase("Domain")) {
                localHashMap.put("domain", localNumberFormatException);
              } else if (((String)localObject4).equalsIgnoreCase("SameSite")) {
                localHashMap.put("sameSite", localNumberFormatException);
              } else if (((String)localObject4).equalsIgnoreCase("Secure")) {
                localHashMap.put("isSecure", Boolean.TRUE);
              } else if (((String)localObject4).equalsIgnoreCase("HttpOnly")) {
                localHashMap.put("isHttpOnly", Boolean.TRUE);
              } else if (((String)localObject4).equalsIgnoreCase("Path")) {
                localHashMap.put("path", localNumberFormatException);
              }
            }
          }
        }
        localArrayList.add(localHashMap);
        localObject1 = localObject5;
        paramString = (String)localObject4;
        localObject3 = localNumberFormatException;
      }
    }
    return localArrayList;
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    init();
    Object localObject = method;
    localObject.getClass();
    int i = ((String)localObject).hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1989049945: 
      if (((String)localObject).equals("getCookies")) {
        j = 5;
      }
      break;
    case 822411705: 
      if (((String)localObject).equals("deleteAllCookies")) {
        j = 4;
      }
      break;
    case 747417188: 
      if (((String)localObject).equals("deleteCookies")) {
        j = 3;
      }
      break;
    case 126640486: 
      if (((String)localObject).equals("setCookie")) {
        j = 2;
      }
      break;
    case -913968963: 
      if (((String)localObject).equals("removeSessionCookies")) {
        j = 1;
      }
      break;
    case -1222815761: 
      if (((String)localObject).equals("deleteCookie")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      paramResult.notImplemented();
      break;
    case 5: 
      paramResult.success(getCookies((String)paramMethodCall.argument("url")));
      break;
    case 4: 
      deleteAllCookies(paramResult);
      break;
    case 3: 
      deleteCookies((String)paramMethodCall.argument("url"), (String)paramMethodCall.argument("domain"), (String)paramMethodCall.argument("path"), paramResult);
      break;
    case 2: 
      String str1 = (String)paramMethodCall.argument("url");
      String str2 = (String)paramMethodCall.argument("name");
      String str3 = (String)paramMethodCall.argument("value");
      String str4 = (String)paramMethodCall.argument("domain");
      String str5 = (String)paramMethodCall.argument("path");
      localObject = (String)paramMethodCall.argument("expiresDate");
      if (localObject != null) {
        localObject = new Long((String)localObject);
      } else {
        localObject = null;
      }
      setCookie(str1, str2, str3, str4, str5, (Long)localObject, (Integer)paramMethodCall.argument("maxAge"), (Boolean)paramMethodCall.argument("isSecure"), (Boolean)paramMethodCall.argument("isHttpOnly"), (String)paramMethodCall.argument("sameSite"), paramResult);
      break;
    case 1: 
      removeSessionCookies(paramResult);
      break;
    case 0: 
      deleteCookie((String)paramMethodCall.argument("url"), (String)paramMethodCall.argument("name"), (String)paramMethodCall.argument("domain"), (String)paramMethodCall.argument("path"), paramResult);
    }
  }
  
  public void removeSessionCookies(final MethodChannel.Result paramResult)
  {
    CookieManager localCookieManager = getCookieManager();
    cookieManager = localCookieManager;
    if (localCookieManager == null)
    {
      paramResult.success(Boolean.FALSE);
      return;
    }
    cookieManager.removeSessionCookies(new ValueCallback()
    {
      public void onReceiveValue(Boolean paramAnonymousBoolean)
      {
        paramResult.success(paramAnonymousBoolean);
      }
    });
    cookieManager.flush();
  }
  
  public void setCookie(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, Long paramLong, Integer paramInteger, Boolean paramBoolean1, Boolean paramBoolean2, String paramString6, final MethodChannel.Result paramResult)
  {
    Object localObject = getCookieManager();
    cookieManager = (CookieManager)localObject;
    if (localObject == null)
    {
      paramResult.success(Boolean.FALSE);
      return;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString2);
    ((StringBuilder)localObject).append("=");
    ((StringBuilder)localObject).append(paramString3);
    ((StringBuilder)localObject).append("; Path=");
    ((StringBuilder)localObject).append(paramString5);
    paramString3 = ((StringBuilder)localObject).toString();
    paramString2 = paramString3;
    if (paramString4 != null) {
      paramString2 = g.e(paramString3, "; Domain=", paramString4);
    }
    paramString3 = paramString2;
    if (paramLong != null)
    {
      paramString2 = g.g(paramString2, "; Expires=");
      paramString2.append(getCookieExpirationDate(paramLong));
      paramString3 = paramString2.toString();
    }
    paramString2 = paramString3;
    if (paramInteger != null)
    {
      paramString2 = g.g(paramString3, "; Max-Age=");
      paramString2.append(paramInteger.toString());
      paramString2 = paramString2.toString();
    }
    paramString3 = paramString2;
    if (paramBoolean1 != null)
    {
      paramString3 = paramString2;
      if (paramBoolean1.booleanValue()) {
        paramString3 = g.d(paramString2, "; Secure");
      }
    }
    paramString2 = paramString3;
    if (paramBoolean2 != null)
    {
      paramString2 = paramString3;
      if (paramBoolean2.booleanValue()) {
        paramString2 = g.d(paramString3, "; HttpOnly");
      }
    }
    paramString3 = paramString2;
    if (paramString6 != null) {
      paramString3 = g.e(paramString2, "; SameSite=", paramString6);
    }
    paramString2 = g.d(paramString3, ";");
    cookieManager.setCookie(paramString1, paramString2, new ValueCallback()
    {
      public void onReceiveValue(Boolean paramAnonymousBoolean)
      {
        paramResult.success(paramAnonymousBoolean);
      }
    });
    cookieManager.flush();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */