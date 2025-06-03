package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

import android.webkit.WebViewDatabase;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class CredentialDatabaseHandler
  extends ChannelDelegateImpl
{
  public static final String LOG_TAG = "CredentialDatabaseHandler";
  public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_credential_database";
  public static CredentialDatabase credentialDatabase;
  public InAppWebViewFlutterPlugin plugin;
  
  public CredentialDatabaseHandler(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin)
  {
    super(new MethodChannel(messenger, "com.pichillilorenzo/flutter_inappwebview_credential_database"));
    plugin = paramInAppWebViewFlutterPlugin;
  }
  
  public static void init(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin)
  {
    if (credentialDatabase == null) {
      credentialDatabase = CredentialDatabase.getInstance(applicationContext);
    }
  }
  
  public void dispose()
  {
    super.dispose();
    plugin = null;
    credentialDatabase = null;
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    Object localObject1 = plugin;
    if (localObject1 != null) {
      init((InAppWebViewFlutterPlugin)localObject1);
    }
    localObject1 = method;
    localObject1.getClass();
    int i = -1;
    switch (((String)localObject1).hashCode())
    {
    default: 
      break;
    case 1930845769: 
      if (((String)localObject1).equals("getAllAuthCredentials")) {
        i = 5;
      }
      break;
    case 1084504936: 
      if (((String)localObject1).equals("removeHttpAuthCredentials")) {
        i = 4;
      }
      break;
    case 998955721: 
      if (((String)localObject1).equals("setHttpAuthCredential")) {
        i = 3;
      }
      break;
    case 589173355: 
      if (((String)localObject1).equals("removeHttpAuthCredential")) {
        i = 2;
      }
      break;
    case -410271914: 
      if (((String)localObject1).equals("getHttpAuthCredentials")) {
        i = 1;
      }
      break;
    case -1851697792: 
      if (((String)localObject1).equals("clearAllAuthCredentials")) {
        i = 0;
      }
      break;
    }
    Object localObject2;
    Object localObject3;
    Object localObject4;
    String str;
    switch (i)
    {
    default: 
      paramResult.notImplemented();
      break;
    case 5: 
      localObject1 = new ArrayList();
      localObject2 = credentialDatabase;
      paramMethodCall = (MethodCall)localObject1;
      if (localObject2 != null)
      {
        localObject2 = protectionSpaceDao.getAll().iterator();
        for (;;)
        {
          paramMethodCall = (MethodCall)localObject1;
          if (!((Iterator)localObject2).hasNext()) {
            break;
          }
          paramMethodCall = (URLProtectionSpace)((Iterator)localObject2).next();
          localObject3 = new ArrayList();
          localObject4 = credentialDatabasecredentialDao.getAllByProtectionSpaceId(paramMethodCall.getId()).iterator();
          while (((Iterator)localObject4).hasNext()) {
            ((ArrayList)localObject3).add(((URLCredential)((Iterator)localObject4).next()).toMap());
          }
          localObject4 = new HashMap();
          ((HashMap)localObject4).put("protectionSpace", paramMethodCall.toMap());
          ((HashMap)localObject4).put("credentials", localObject3);
          ((ArrayList)localObject1).add(localObject4);
        }
      }
      paramResult.success(paramMethodCall);
      break;
    case 4: 
      if (credentialDatabase != null)
      {
        localObject1 = (String)paramMethodCall.argument("host");
        localObject3 = (String)paramMethodCall.argument("protocol");
        localObject2 = (String)paramMethodCall.argument("realm");
        paramMethodCall = (Integer)paramMethodCall.argument("port");
        credentialDatabase.removeHttpAuthCredentials((String)localObject1, (String)localObject3, (String)localObject2, paramMethodCall);
      }
      break;
    case 3: 
      if (credentialDatabase != null)
      {
        str = (String)paramMethodCall.argument("host");
        localObject1 = (String)paramMethodCall.argument("protocol");
        localObject3 = (String)paramMethodCall.argument("realm");
        localObject2 = (Integer)paramMethodCall.argument("port");
        localObject4 = (String)paramMethodCall.argument("username");
        paramMethodCall = (String)paramMethodCall.argument("password");
        credentialDatabase.setHttpAuthCredential(str, (String)localObject1, (String)localObject3, (Integer)localObject2, (String)localObject4, paramMethodCall);
      }
      break;
    }
    for (;;)
    {
      label564:
      paramMethodCall = Boolean.TRUE;
      break;
      do
      {
        do
        {
          paramMethodCall = Boolean.FALSE;
          break;
        } while (credentialDatabase == null);
        localObject4 = (String)paramMethodCall.argument("host");
        localObject2 = (String)paramMethodCall.argument("protocol");
        localObject3 = (String)paramMethodCall.argument("realm");
        localObject1 = (Integer)paramMethodCall.argument("port");
        str = (String)paramMethodCall.argument("username");
        paramMethodCall = (String)paramMethodCall.argument("password");
        credentialDatabase.removeHttpAuthCredential((String)localObject4, (String)localObject2, (String)localObject3, (Integer)localObject1, str, paramMethodCall);
        break label564;
        localObject1 = new ArrayList();
        if (credentialDatabase != null)
        {
          localObject4 = (String)paramMethodCall.argument("host");
          localObject3 = (String)paramMethodCall.argument("protocol");
          localObject2 = (String)paramMethodCall.argument("realm");
          paramMethodCall = (Integer)paramMethodCall.argument("port");
          paramMethodCall = credentialDatabase.getHttpAuthCredentials((String)localObject4, (String)localObject3, (String)localObject2, paramMethodCall).iterator();
          while (paramMethodCall.hasNext()) {
            ((ArrayList)localObject1).add(((URLCredential)paramMethodCall.next()).toMap());
          }
        }
        paramResult.success(localObject1);
        return;
        paramMethodCall = credentialDatabase;
      } while (paramMethodCall == null);
      paramMethodCall.clearAllAuthCredentials();
      paramMethodCall = plugin;
      if (paramMethodCall != null)
      {
        paramMethodCall = applicationContext;
        if (paramMethodCall != null) {
          WebViewDatabase.getInstance(paramMethodCall).clearHttpAuthUsernamePassword();
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.credential_database.CredentialDatabaseHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */