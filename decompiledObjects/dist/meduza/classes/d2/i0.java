package d2;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import c2.p;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import x6.b;

public final class i0
{
  public static final z.b A;
  public static final z.a B;
  public static final a.h C;
  public static final a D;
  public static final a.d E;
  public static final a.d F;
  public static final a.h G;
  public static final a.d H;
  public static final a.d I;
  public static final a.d J;
  public static final a.d K;
  public static final a.d L;
  public static final a.d M;
  public static final a.d N;
  public static final a.d O;
  public static final a.b a;
  public static final a.e b;
  public static final a.c c;
  public static final a.f d;
  public static final a.f e;
  public static final a.f f;
  public static final a.f g;
  public static final a.c h;
  public static final a.c i;
  public static final a.c j;
  public static final a.c k;
  public static final a.c l;
  public static final a.c m;
  public static final a.b n;
  public static final a.b o;
  public static final a.f p;
  public static final a.f q;
  public static final a.f r;
  public static final a.b s;
  public static final a.b t;
  public static final a.d u;
  public static final a.b v;
  public static final a.b w;
  public static final a.b x;
  public static final a.h y;
  public static final a.g z;
  
  static
  {
    new a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
    a = new a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
    b = new a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
    c = new a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
    d = new a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");
    new a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
    new a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
    e = new a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
    f = new a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
    g = new a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
    h = new a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
    i = new a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
    j = new a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
    k = new a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
    l = new a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
    new a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
    new a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
    new a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
    new a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
    new a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
    m = new a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
    n = new a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
    o = new a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
    p = new a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
    q = new a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
    r = new a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
    s = new a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
    t = new a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
    u = new a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
    v = new a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
    w = new a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
    x = new a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
    new a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
    new a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
    new a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
    new a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
    y = new a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
    z = new a.g();
    A = new z.b();
    B = new z.a();
    C = new a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
    D = new a();
    E = new a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
    F = new a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
    G = new a.h("FORCE_DARK", "FORCE_DARK");
    H = new a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
    I = new a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
    J = new a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
    K = new a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
    L = new a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
    M = new a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
    N = new a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");
    O = new a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
    new a.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");
    new b();
    new a.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");
    new a.d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");
    new a.d("MUTE_AUDIO", "MUTE_AUDIO");
  }
  
  public static UnsupportedOperationException a()
  {
    return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
  }
  
  public final class a
    extends a.i
  {
    public final Pattern d = Pattern.compile("\\A\\d+");
    
    public final boolean d()
    {
      boolean bool1 = super.d();
      if (bool1)
      {
        int i = Build.VERSION.SDK_INT;
        if (i < 29)
        {
          Object localObject1 = p.a;
          Object localObject2;
          if (i >= 26) {
            localObject1 = f.a();
          } else {
            try
            {
              localObject1 = p.c();
            }
            catch (ClassNotFoundException|IllegalAccessException|InvocationTargetException|NoSuchMethodException localClassNotFoundException)
            {
              localObject2 = null;
            }
          }
          boolean bool2 = false;
          if (localObject2 == null) {
            return false;
          }
          Matcher localMatcher = d.matcher(versionName);
          bool1 = bool2;
          if (localMatcher.find())
          {
            bool1 = bool2;
            if (Integer.parseInt(versionName.substring(localMatcher.start(), localMatcher.end())) >= 105) {
              bool1 = true;
            }
          }
          return bool1;
        }
      }
      return bool1;
    }
  }
  
  public final class b
    extends a.d
  {
    public b()
    {
      super("MULTI_PROFILE");
    }
    
    public final boolean d()
    {
      if (!super.d()) {
        return false;
      }
      if (b.c0("MULTI_PROCESS"))
      {
        Uri localUri = p.a;
        if (i0.F.d()) {
          return j0.b.a.getStatics().isMultiProcessEnabled();
        }
        throw i0.a();
      }
      return false;
    }
  }
}

/* Location:
 * Qualified Name:     d2.i0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */