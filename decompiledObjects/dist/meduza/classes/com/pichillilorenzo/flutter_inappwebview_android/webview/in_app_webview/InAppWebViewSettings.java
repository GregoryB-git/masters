package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import aa.w;
import android.os.Build.VERSION;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import b1.v;
import c2.n;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import d2.a.c;
import d2.a.e;
import d2.a.h;
import d2.c;
import d2.d;
import d2.i0;
import d2.i0.a;
import d2.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import x6.b;

public class InAppWebViewSettings
  implements ISettings<InAppWebViewInterface>
{
  public static final String LOG_TAG = "InAppWebViewSettings";
  public Boolean algorithmicDarkeningAllowed;
  public Boolean allowBackgroundAudioPlaying;
  public Boolean allowContentAccess;
  public Boolean allowFileAccess;
  public Boolean allowFileAccessFromFileURLs;
  public Boolean allowUniversalAccessFromFileURLs;
  public String appCachePath;
  public String applicationNameForUserAgent;
  public Boolean blockNetworkImage;
  public Boolean blockNetworkLoads;
  public Boolean builtInZoomControls;
  public Boolean cacheEnabled;
  public Integer cacheMode;
  @Deprecated
  public Boolean clearCache;
  @Deprecated
  public Boolean clearSessionCache;
  public List<Map<String, Map<String, Object>>> contentBlockers;
  public String cursiveFontFamily;
  public Boolean databaseEnabled;
  public Integer defaultFixedFontSize;
  public Integer defaultFontSize;
  public String defaultTextEncodingName;
  public byte[] defaultVideoPoster;
  public Boolean disableContextMenu;
  public Boolean disableDefaultErrorPage;
  public Boolean disableHorizontalScroll;
  public Boolean disableVerticalScroll;
  public Integer disabledActionModeMenuItems;
  public Boolean displayZoomControls;
  public Boolean domStorageEnabled;
  public Boolean enterpriseAuthenticationAppLinkPolicyEnabled;
  public String fantasyFontFamily;
  public String fixedFontFamily;
  public Integer forceDark;
  public Integer forceDarkStrategy;
  public Boolean geolocationEnabled;
  public Boolean hardwareAcceleration;
  public Boolean horizontalScrollBarEnabled;
  public String horizontalScrollbarThumbColor;
  public String horizontalScrollbarTrackColor;
  public Boolean incognito;
  public Integer initialScale;
  public Boolean interceptOnlyAsyncAjaxRequests;
  public Boolean javaScriptCanOpenWindowsAutomatically;
  public Boolean javaScriptEnabled;
  public WebSettings.LayoutAlgorithm layoutAlgorithm;
  public Boolean loadWithOverviewMode;
  public Boolean loadsImagesAutomatically;
  public Boolean mediaPlaybackRequiresUserGesture;
  public Integer minimumFontSize;
  public Integer minimumLogicalFontSize;
  public Integer mixedContentMode;
  public Boolean needInitialFocus;
  public Boolean networkAvailable;
  public Boolean offscreenPreRaster;
  public Integer overScrollMode;
  public Integer preferredContentMode;
  public String regexToCancelSubFramesLoading;
  public Map<String, Object> rendererPriorityPolicy;
  public Set<String> requestedWithHeaderOriginAllowList;
  public List<String> resourceCustomSchemes;
  public Boolean safeBrowsingEnabled;
  public String sansSerifFontFamily;
  public Boolean saveFormData;
  public Integer scrollBarDefaultDelayBeforeFade;
  public Integer scrollBarFadeDuration;
  public Integer scrollBarStyle;
  public Boolean scrollbarFadingEnabled;
  public String serifFontFamily;
  public String standardFontFamily;
  public Boolean supportMultipleWindows;
  public Boolean supportZoom;
  public Integer textZoom;
  public Boolean thirdPartyCookiesEnabled;
  public Boolean transparentBackground;
  public Boolean useHybridComposition;
  public Boolean useOnDownloadStart;
  public Boolean useOnLoadResource;
  public Boolean useOnRenderProcessGone;
  public Boolean useShouldInterceptAjaxRequest;
  public Boolean useShouldInterceptFetchRequest;
  public Boolean useShouldInterceptRequest;
  public Boolean useShouldOverrideUrlLoading;
  public Boolean useWideViewPort;
  public String userAgent;
  public Boolean verticalScrollBarEnabled;
  public Integer verticalScrollbarPosition;
  public String verticalScrollbarThumbColor;
  public String verticalScrollbarTrackColor;
  public Map<String, Object> webViewAssetLoader;
  
  public InAppWebViewSettings()
  {
    Boolean localBoolean1 = Boolean.FALSE;
    useShouldOverrideUrlLoading = localBoolean1;
    useOnLoadResource = localBoolean1;
    useOnDownloadStart = localBoolean1;
    clearCache = localBoolean1;
    userAgent = "";
    applicationNameForUserAgent = "";
    Boolean localBoolean2 = Boolean.TRUE;
    javaScriptEnabled = localBoolean2;
    javaScriptCanOpenWindowsAutomatically = localBoolean1;
    mediaPlaybackRequiresUserGesture = localBoolean2;
    Integer localInteger1 = Integer.valueOf(8);
    minimumFontSize = localInteger1;
    verticalScrollBarEnabled = localBoolean2;
    horizontalScrollBarEnabled = localBoolean2;
    resourceCustomSchemes = new ArrayList();
    contentBlockers = new ArrayList();
    preferredContentMode = Integer.valueOf(PreferredContentModeOptionType.RECOMMENDED.toValue());
    useShouldInterceptAjaxRequest = localBoolean1;
    interceptOnlyAsyncAjaxRequests = localBoolean2;
    useShouldInterceptFetchRequest = localBoolean1;
    incognito = localBoolean1;
    cacheEnabled = localBoolean2;
    transparentBackground = localBoolean1;
    disableVerticalScroll = localBoolean1;
    disableHorizontalScroll = localBoolean1;
    disableContextMenu = localBoolean1;
    supportZoom = localBoolean2;
    allowFileAccessFromFileURLs = localBoolean1;
    allowUniversalAccessFromFileURLs = localBoolean1;
    allowBackgroundAudioPlaying = localBoolean1;
    textZoom = Integer.valueOf(100);
    clearSessionCache = localBoolean1;
    builtInZoomControls = localBoolean2;
    displayZoomControls = localBoolean1;
    databaseEnabled = localBoolean1;
    domStorageEnabled = localBoolean2;
    useWideViewPort = localBoolean2;
    safeBrowsingEnabled = localBoolean2;
    allowContentAccess = localBoolean2;
    allowFileAccess = localBoolean2;
    blockNetworkImage = localBoolean1;
    blockNetworkLoads = localBoolean1;
    cacheMode = Integer.valueOf(-1);
    cursiveFontFamily = "cursive";
    Integer localInteger2 = Integer.valueOf(16);
    defaultFixedFontSize = localInteger2;
    defaultFontSize = localInteger2;
    defaultTextEncodingName = "UTF-8";
    fantasyFontFamily = "fantasy";
    fixedFontFamily = "monospace";
    localInteger2 = Integer.valueOf(0);
    forceDark = localInteger2;
    forceDarkStrategy = Integer.valueOf(2);
    geolocationEnabled = localBoolean2;
    loadWithOverviewMode = localBoolean2;
    loadsImagesAutomatically = localBoolean2;
    minimumLogicalFontSize = localInteger1;
    initialScale = localInteger2;
    needInitialFocus = localBoolean2;
    offscreenPreRaster = localBoolean1;
    sansSerifFontFamily = "sans-serif";
    serifFontFamily = "sans-serif";
    standardFontFamily = "sans-serif";
    saveFormData = localBoolean2;
    thirdPartyCookiesEnabled = localBoolean2;
    hardwareAcceleration = localBoolean2;
    supportMultipleWindows = localBoolean1;
    overScrollMode = Integer.valueOf(1);
    networkAvailable = null;
    scrollBarStyle = localInteger2;
    verticalScrollbarPosition = localInteger2;
    scrollBarDefaultDelayBeforeFade = null;
    scrollbarFadingEnabled = localBoolean2;
    scrollBarFadeDuration = null;
    rendererPriorityPolicy = null;
    useShouldInterceptRequest = localBoolean1;
    useOnRenderProcessGone = localBoolean1;
    disableDefaultErrorPage = localBoolean1;
    useHybridComposition = localBoolean2;
    algorithmicDarkeningAllowed = localBoolean1;
    enterpriseAuthenticationAppLinkPolicyEnabled = localBoolean2;
  }
  
  private String getLayoutAlgorithm()
  {
    WebSettings.LayoutAlgorithm localLayoutAlgorithm = layoutAlgorithm;
    if (localLayoutAlgorithm != null)
    {
      int i = 1.$SwitchMap$android$webkit$WebSettings$LayoutAlgorithm[localLayoutAlgorithm.ordinal()];
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3) {
            return "NARROW_COLUMNS";
          }
        }
        else {
          return "TEXT_AUTOSIZING";
        }
      }
      else {
        return "NORMAL";
      }
    }
    return null;
  }
  
  private void setLayoutAlgorithm(String paramString)
  {
    if (paramString != null)
    {
      int i = -1;
      switch (paramString.hashCode())
      {
      default: 
        break;
      case 1561826623: 
        if (paramString.equals("TEXT_AUTOSIZING")) {
          i = 2;
        }
        break;
      case 1055046617: 
        if (paramString.equals("NARROW_COLUMNS")) {
          i = 1;
        }
        break;
      case -1986416409: 
        if (paramString.equals("NORMAL")) {
          i = 0;
        }
        break;
      }
      switch (i)
      {
      default: 
        break;
      case 1: 
        layoutAlgorithm = WebSettings.LayoutAlgorithm.NARROW_COLUMNS;
      case 0: 
        layoutAlgorithm = WebSettings.LayoutAlgorithm.NORMAL;
      case 2: 
        layoutAlgorithm = WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING;
      }
    }
  }
  
  public Map<String, Object> getRealSettings(InAppWebViewInterface paramInAppWebViewInterface)
  {
    Map localMap = toMap();
    if ((paramInAppWebViewInterface instanceof InAppWebView))
    {
      paramInAppWebViewInterface = (InAppWebView)paramInAppWebViewInterface;
      WebSettings localWebSettings = paramInAppWebViewInterface.getSettings();
      localMap.put("userAgent", localWebSettings.getUserAgentString());
      localMap.put("javaScriptEnabled", Boolean.valueOf(localWebSettings.getJavaScriptEnabled()));
      localMap.put("javaScriptCanOpenWindowsAutomatically", Boolean.valueOf(localWebSettings.getJavaScriptCanOpenWindowsAutomatically()));
      localMap.put("mediaPlaybackRequiresUserGesture", Boolean.valueOf(localWebSettings.getMediaPlaybackRequiresUserGesture()));
      localMap.put("minimumFontSize", Integer.valueOf(localWebSettings.getMinimumFontSize()));
      localMap.put("verticalScrollBarEnabled", Boolean.valueOf(paramInAppWebViewInterface.isVerticalScrollBarEnabled()));
      localMap.put("horizontalScrollBarEnabled", Boolean.valueOf(paramInAppWebViewInterface.isHorizontalScrollBarEnabled()));
      localMap.put("textZoom", Integer.valueOf(localWebSettings.getTextZoom()));
      localMap.put("builtInZoomControls", Boolean.valueOf(localWebSettings.getBuiltInZoomControls()));
      localMap.put("supportZoom", Boolean.valueOf(localWebSettings.supportZoom()));
      localMap.put("displayZoomControls", Boolean.valueOf(localWebSettings.getDisplayZoomControls()));
      localMap.put("databaseEnabled", Boolean.valueOf(localWebSettings.getDatabaseEnabled()));
      localMap.put("domStorageEnabled", Boolean.valueOf(localWebSettings.getDomStorageEnabled()));
      localMap.put("useWideViewPort", Boolean.valueOf(localWebSettings.getUseWideViewPort()));
      Object localObject;
      boolean bool;
      if (b.c0("SAFE_BROWSING_ENABLE"))
      {
        localObject = i0.b;
        if (((a.e)localObject).c()) {
          bool = d2.f.b(localWebSettings);
        } else if (((d2.a)localObject).d()) {
          bool = ((WebSettingsBoundaryInterface)aa).getSafeBrowsingEnabled();
        } else {
          throw i0.a();
        }
      }
      else
      {
        if (Build.VERSION.SDK_INT < 26) {
          break label349;
        }
        bool = com.google.android.gms.internal.base.a.x(localWebSettings);
      }
      localMap.put("safeBrowsingEnabled", Boolean.valueOf(bool));
      label349:
      int i = Build.VERSION.SDK_INT;
      localMap.put("mixedContentMode", Integer.valueOf(localWebSettings.getMixedContentMode()));
      localMap.put("allowContentAccess", Boolean.valueOf(localWebSettings.getAllowContentAccess()));
      localMap.put("allowFileAccess", Boolean.valueOf(localWebSettings.getAllowFileAccess()));
      localMap.put("allowFileAccessFromFileURLs", Boolean.valueOf(localWebSettings.getAllowFileAccessFromFileURLs()));
      localMap.put("allowUniversalAccessFromFileURLs", Boolean.valueOf(localWebSettings.getAllowUniversalAccessFromFileURLs()));
      localMap.put("blockNetworkImage", Boolean.valueOf(localWebSettings.getBlockNetworkImage()));
      localMap.put("blockNetworkLoads", Boolean.valueOf(localWebSettings.getBlockNetworkLoads()));
      localMap.put("cacheMode", Integer.valueOf(localWebSettings.getCacheMode()));
      localMap.put("cursiveFontFamily", localWebSettings.getCursiveFontFamily());
      localMap.put("defaultFixedFontSize", Integer.valueOf(localWebSettings.getDefaultFixedFontSize()));
      localMap.put("defaultFontSize", Integer.valueOf(localWebSettings.getDefaultFontSize()));
      localMap.put("defaultTextEncodingName", localWebSettings.getDefaultTextEncodingName());
      int j;
      if (b.c0("DISABLED_ACTION_MODE_MENU_ITEMS"))
      {
        localObject = i0.c;
        if (((a.c)localObject).c())
        {
          j = d.f(localWebSettings);
        }
        else
        {
          if (!((d2.a)localObject).d()) {
            break label626;
          }
          j = ((WebSettingsBoundaryInterface)aa).getDisabledActionModeMenuItems();
        }
        localMap.put("disabledActionModeMenuItems", Integer.valueOf(j));
        break label630;
        label626:
        throw i0.a();
      }
      label630:
      if (i >= 24) {
        localMap.put("disabledActionModeMenuItems", Integer.valueOf(b0.f.a(localWebSettings)));
      }
      localMap.put("fantasyFontFamily", localWebSettings.getFantasyFontFamily());
      localMap.put("fixedFontFamily", localWebSettings.getFixedFontFamily());
      if (b.c0("FORCE_DARK"))
      {
        localObject = i0.G;
        if (((a.h)localObject).c()) {
          j = m.a(localWebSettings);
        } else if (((d2.a)localObject).d()) {
          j = ((WebSettingsBoundaryInterface)aa).getForceDark();
        } else {
          throw i0.a();
        }
      }
      else
      {
        if (i < 29) {
          break label773;
        }
        j = w.b(localWebSettings);
      }
      localMap.put("forceDark", Integer.valueOf(j));
      label773:
      if (b.c0("FORCE_DARK_STRATEGY")) {
        if (i0.H.d()) {
          localMap.put("forceDarkStrategy", Integer.valueOf(((WebSettingsBoundaryInterface)aa).getForceDark()));
        } else {
          throw i0.a();
        }
      }
      localMap.put("layoutAlgorithm", localWebSettings.getLayoutAlgorithm().name());
      localMap.put("loadWithOverviewMode", Boolean.valueOf(localWebSettings.getLoadWithOverviewMode()));
      localMap.put("loadsImagesAutomatically", Boolean.valueOf(localWebSettings.getLoadsImagesAutomatically()));
      localMap.put("minimumLogicalFontSize", Integer.valueOf(localWebSettings.getMinimumLogicalFontSize()));
      if (b.c0("OFF_SCREEN_PRERASTER"))
      {
        i0.a.getClass();
        bool = c.g(localWebSettings);
      }
      else
      {
        bool = localWebSettings.getOffscreenPreRaster();
      }
      localMap.put("offscreenPreRaster", Boolean.valueOf(bool));
      localMap.put("sansSerifFontFamily", localWebSettings.getSansSerifFontFamily());
      localMap.put("serifFontFamily", localWebSettings.getSerifFontFamily());
      localMap.put("standardFontFamily", localWebSettings.getStandardFontFamily());
      localMap.put("saveFormData", Boolean.valueOf(localWebSettings.getSaveFormData()));
      localMap.put("supportMultipleWindows", Boolean.valueOf(localWebSettings.supportMultipleWindows()));
      localMap.put("overScrollMode", Integer.valueOf(paramInAppWebViewInterface.getOverScrollMode()));
      localMap.put("scrollBarStyle", Integer.valueOf(paramInAppWebViewInterface.getScrollBarStyle()));
      localMap.put("verticalScrollbarPosition", Integer.valueOf(paramInAppWebViewInterface.getVerticalScrollbarPosition()));
      localMap.put("scrollBarDefaultDelayBeforeFade", Integer.valueOf(paramInAppWebViewInterface.getScrollBarDefaultDelayBeforeFade()));
      localMap.put("scrollbarFadingEnabled", Boolean.valueOf(paramInAppWebViewInterface.isScrollbarFadingEnabled()));
      localMap.put("scrollBarFadeDuration", Integer.valueOf(paramInAppWebViewInterface.getScrollBarFadeDuration()));
      if (i >= 26)
      {
        localObject = new HashMap();
        ((HashMap)localObject).put("rendererRequestedPriority", Integer.valueOf(paramInAppWebViewInterface.getRendererRequestedPriority()));
        ((HashMap)localObject).put("waivedWhenNotVisible", Boolean.valueOf(paramInAppWebViewInterface.getRendererPriorityWaivedWhenNotVisible()));
        localMap.put("rendererPriorityPolicy", localObject);
      }
      if ((b.c0("ALGORITHMIC_DARKENING")) && (i >= 29)) {
        if (i0.D.d()) {
          localMap.put("algorithmicDarkeningAllowed", Boolean.valueOf(((WebSettingsBoundaryInterface)aa).isAlgorithmicDarkeningAllowed()));
        } else {
          throw i0.a();
        }
      }
      if (b.c0("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY")) {
        if (i0.M.d()) {
          localMap.put("enterpriseAuthenticationAppLinkPolicyEnabled", Boolean.valueOf(((WebSettingsBoundaryInterface)aa).getEnterpriseAuthenticationAppLinkPolicyEnabled()));
        } else {
          throw i0.a();
        }
      }
      if (b.c0("REQUESTED_WITH_HEADER_ALLOW_LIST")) {
        if (i0.O.d()) {
          localMap.put("requestedWithHeaderOriginAllowList", new ArrayList(((WebSettingsBoundaryInterface)aa).getRequestedWithHeaderOriginAllowList()));
        } else {
          throw i0.a();
        }
      }
    }
    return localMap;
  }
  
  public InAppWebViewSettings parse(Map<String, Object> paramMap)
  {
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Object localObject = (Map.Entry)paramMap.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = ((Map.Entry)localObject).getValue();
      if (localObject != null)
      {
        str.getClass();
        int i = -1;
        switch (str.hashCode())
        {
        default: 
          break;
        case 2086547246: 
          if (str.equals("algorithmicDarkeningAllowed")) {
            i = 88;
          }
          break;
        case 2056553639: 
          if (str.equals("defaultVideoPoster")) {
            i = 87;
          }
          break;
        case 2038327673: 
          if (str.equals("clearSessionCache")) {
            i = 86;
          }
          break;
        case 2011947505: 
          if (str.equals("verticalScrollBarEnabled")) {
            i = 85;
          }
          break;
        case 1956631083: 
          if (str.equals("minimumLogicalFontSize")) {
            i = 84;
          }
          break;
        case 1812525393: 
          if (str.equals("thirdPartyCookiesEnabled")) {
            i = 83;
          }
          break;
        case 1793491907: 
          if (str.equals("defaultFixedFontSize")) {
            i = 82;
          }
          break;
        case 1774215812: 
          if (str.equals("supportMultipleWindows")) {
            i = 81;
          }
          break;
        case 1759079762: 
          if (str.equals("contentBlockers")) {
            i = 80;
          }
          break;
        case 1583791742: 
          if (str.equals("disableDefaultErrorPage")) {
            i = 79;
          }
          break;
        case 1527546113: 
          if (str.equals("forceDark")) {
            i = 78;
          }
          break;
        case 1519451805: 
          if (str.equals("verticalScrollbarThumbColor")) {
            i = 77;
          }
          break;
        case 1496887792: 
          if (str.equals("serifFontFamily")) {
            i = 76;
          }
          break;
        case 1474890029: 
          if (str.equals("safeBrowsingEnabled")) {
            i = 75;
          }
          break;
        case 1409728424: 
          if (str.equals("loadWithOverviewMode")) {
            i = 74;
          }
          break;
        case 1344414299: 
          if (str.equals("geolocationEnabled")) {
            i = 73;
          }
          break;
        case 1320461707: 
          if (str.equals("displayZoomControls")) {
            i = 72;
          }
          break;
        case 1301942064: 
          if (str.equals("standardFontFamily")) {
            i = 71;
          }
          break;
        case 1193086767: 
          if (str.equals("horizontalScrollbarThumbColor")) {
            i = 70;
          }
          break;
        case 1156608422: 
          if (str.equals("appCachePath")) {
            i = 69;
          }
          break;
        case 1138246185: 
          if (str.equals("allowFileAccess")) {
            i = 68;
          }
          break;
        case 849171798: 
          if (str.equals("scrollBarFadeDuration")) {
            i = 67;
          }
          break;
        case 760962753: 
          if (str.equals("mixedContentMode")) {
            i = 66;
          }
          break;
        case 590869196: 
          if (str.equals("applicationNameForUserAgent")) {
            i = 65;
          }
          break;
        case 487904071: 
          if (str.equals("useHybridComposition")) {
            i = 64;
          }
          break;
        case 477312960: 
          if (str.equals("requestedWithHeaderOriginAllowList")) {
            i = 63;
          }
          break;
        case 408799019: 
          if (str.equals("saveFormData")) {
            i = 62;
          }
          break;
        case 397237599: 
          if (str.equals("cacheEnabled")) {
            i = 61;
          }
          break;
        case 393481210: 
          if (str.equals("useOnLoadResource")) {
            i = 60;
          }
          break;
        case 387230482: 
          if (str.equals("useOnRenderProcessGone")) {
            i = 59;
          }
          break;
        case 311430650: 
          if (str.equals("userAgent")) {
            i = 58;
          }
          break;
        case 298870764: 
          if (str.equals("blockNetworkLoads")) {
            i = 57;
          }
          break;
        case 296040698: 
          if (str.equals("blockNetworkImage")) {
            i = 56;
          }
          break;
        case 273267153: 
          if (str.equals("mediaPlaybackRequiresUserGesture")) {
            i = 55;
          }
          break;
        case 257886264: 
          if (str.equals("cursiveFontFamily")) {
            i = 54;
          }
          break;
        case 229242772: 
          if (str.equals("forceDarkStrategy")) {
            i = 53;
          }
          break;
        case 174479508: 
          if (str.equals("useOnDownloadStart")) {
            i = 52;
          }
          break;
        case 100868168: 
          if (str.equals("verticalScrollbarTrackColor")) {
            i = 51;
          }
          break;
        case 57717170: 
          if (str.equals("regexToCancelSubFramesLoading")) {
            i = 50;
          }
          break;
        case -98561827: 
          if (str.equals("sansSerifFontFamily")) {
            i = 49;
          }
          break;
        case -158057575: 
          if (str.equals("rendererPriorityPolicy")) {
            i = 48;
          }
          break;
        case -216514471: 
          if (str.equals("fantasyFontFamily")) {
            i = 47;
          }
          break;
        case -225165915: 
          if (str.equals("offscreenPreRaster")) {
            i = 46;
          }
          break;
        case -225496870: 
          if (str.equals("horizontalScrollbarTrackColor")) {
            i = 45;
          }
          break;
        case -227577491: 
          if (str.equals("javaScriptCanOpenWindowsAutomatically")) {
            i = 44;
          }
          break;
        case -229178645: 
          if (str.equals("disableVerticalScroll")) {
            i = 43;
          }
          break;
        case -321425255: 
          if (str.equals("verticalScrollbarPosition")) {
            i = 42;
          }
          break;
        case -421090202: 
          if (str.equals("initialScale")) {
            i = 41;
          }
          break;
        case -435719349: 
          if (str.equals("scrollBarStyle")) {
            i = 40;
          }
          break;
        case -443422049: 
          if (str.equals("horizontalScrollBarEnabled")) {
            i = 39;
          }
          break;
        case -553792443: 
          if (str.equals("cacheMode")) {
            i = 38;
          }
          break;
        case -706772569: 
          if (str.equals("useShouldInterceptRequest")) {
            i = 37;
          }
          break;
        case -710246074: 
          if (str.equals("databaseEnabled")) {
            i = 36;
          }
          break;
        case -728016272: 
          if (str.equals("allowUniversalAccessFromFileURLs")) {
            i = 35;
          }
          break;
        case -741649011: 
          if (str.equals("enterpriseAuthenticationAppLinkPolicyEnabled")) {
            i = 34;
          }
          break;
        case -742944736: 
          if (str.equals("transparentBackground")) {
            i = 33;
          }
          break;
        case -759238347: 
          if (str.equals("clearCache")) {
            i = 32;
          }
          break;
        case -767637403: 
          if (str.equals("layoutAlgorithm")) {
            i = 31;
          }
          break;
        case -800676066: 
          if (str.equals("minimumFontSize")) {
            i = 30;
          }
          break;
        case -868328270: 
          if (str.equals("interceptOnlyAsyncAjaxRequests")) {
            i = 29;
          }
          break;
        case -1003454816: 
          if (str.equals("textZoom")) {
            i = 28;
          }
          break;
        case -1038715033: 
          if (str.equals("useShouldInterceptAjaxRequest")) {
            i = 27;
          }
          break;
        case -1143245914: 
          if (str.equals("disableContextMenu")) {
            i = 26;
          }
          break;
        case -1146673624: 
          if (str.equals("domStorageEnabled")) {
            i = 25;
          }
          break;
        case -1321236988: 
          if (str.equals("overScrollMode")) {
            i = 24;
          }
          break;
        case -1349570230: 
          if (str.equals("webViewAssetLoader")) {
            i = 23;
          }
          break;
        case -1410791825: 
          if (str.equals("allowBackgroundAudioPlaying")) {
            i = 22;
          }
          break;
        case -1423657812: 
          if (str.equals("incognito")) {
            i = 21;
          }
          break;
        case -1443655540: 
          if (str.equals("disabledActionModeMenuItems")) {
            i = 20;
          }
          break;
        case -1455624881: 
          if (str.equals("resourceCustomSchemes")) {
            i = 19;
          }
          break;
        case -1480607106: 
          if (str.equals("loadsImagesAutomatically")) {
            i = 18;
          }
          break;
        case -1574470051: 
          if (str.equals("useShouldInterceptFetchRequest")) {
            i = 17;
          }
          break;
        case -1578507205: 
          if (str.equals("networkAvailable")) {
            i = 16;
          }
          break;
        case -1578962296: 
          if (str.equals("hardwareAcceleration")) {
            i = 15;
          }
          break;
        case -1607633676: 
          if (str.equals("javaScriptEnabled")) {
            i = 14;
          }
          break;
        case -1615103092: 
          if (str.equals("builtInZoomControls")) {
            i = 13;
          }
          break;
        case -1626497241: 
          if (str.equals("fixedFontFamily")) {
            i = 12;
          }
          break;
        case -1657552268: 
          if (str.equals("allowContentAccess")) {
            i = 11;
          }
          break;
        case -1673892229: 
          if (str.equals("preferredContentMode")) {
            i = 10;
          }
          break;
        case -1712086669: 
          if (str.equals("useShouldOverrideUrlLoading")) {
            i = 9;
          }
          break;
        case -1746033750: 
          if (str.equals("needInitialFocus")) {
            i = 8;
          }
          break;
        case -1834028884: 
          if (str.equals("defaultTextEncodingName")) {
            i = 7;
          }
          break;
        case -1845480382: 
          if (str.equals("scrollbarFadingEnabled")) {
            i = 6;
          }
          break;
        case -1851090878: 
          if (str.equals("supportZoom")) {
            i = 5;
          }
          break;
        case -1931277743: 
          if (str.equals("defaultFontSize")) {
            i = 4;
          }
          break;
        case -2014672109: 
          if (str.equals("allowFileAccessFromFileURLs")) {
            i = 3;
          }
          break;
        case -2020146208: 
          if (str.equals("useWideViewPort")) {
            i = 2;
          }
          break;
        case -2095822429: 
          if (str.equals("scrollBarDefaultDelayBeforeFade")) {
            i = 1;
          }
          break;
        case -2116596967: 
          if (str.equals("disableHorizontalScroll")) {
            i = 0;
          }
          break;
        }
        switch (i)
        {
        default: 
          break;
        case 88: 
          algorithmicDarkeningAllowed = ((Boolean)localObject);
          break;
        case 87: 
          defaultVideoPoster = ((byte[])localObject);
          break;
        case 86: 
          clearSessionCache = ((Boolean)localObject);
          break;
        case 85: 
          verticalScrollBarEnabled = ((Boolean)localObject);
          break;
        case 84: 
          minimumLogicalFontSize = ((Integer)localObject);
          break;
        case 83: 
          thirdPartyCookiesEnabled = ((Boolean)localObject);
          break;
        case 82: 
          defaultFixedFontSize = ((Integer)localObject);
          break;
        case 81: 
          supportMultipleWindows = ((Boolean)localObject);
          break;
        case 80: 
          contentBlockers = ((List)localObject);
          break;
        case 79: 
          disableDefaultErrorPage = ((Boolean)localObject);
          break;
        case 78: 
          forceDark = ((Integer)localObject);
          break;
        case 77: 
          verticalScrollbarThumbColor = ((String)localObject);
          break;
        case 76: 
          serifFontFamily = ((String)localObject);
          break;
        case 75: 
          safeBrowsingEnabled = ((Boolean)localObject);
          break;
        case 74: 
          loadWithOverviewMode = ((Boolean)localObject);
          break;
        case 73: 
          geolocationEnabled = ((Boolean)localObject);
          break;
        case 72: 
          displayZoomControls = ((Boolean)localObject);
          break;
        case 71: 
          standardFontFamily = ((String)localObject);
          break;
        case 70: 
          horizontalScrollbarThumbColor = ((String)localObject);
          break;
        case 69: 
          appCachePath = ((String)localObject);
          break;
        case 68: 
          allowFileAccess = ((Boolean)localObject);
          break;
        case 67: 
          scrollBarFadeDuration = ((Integer)localObject);
          break;
        case 66: 
          mixedContentMode = ((Integer)localObject);
          break;
        case 65: 
          applicationNameForUserAgent = ((String)localObject);
          break;
        case 64: 
          useHybridComposition = ((Boolean)localObject);
          break;
        case 63: 
          requestedWithHeaderOriginAllowList = new HashSet((List)localObject);
          break;
        case 62: 
          saveFormData = ((Boolean)localObject);
          break;
        case 61: 
          cacheEnabled = ((Boolean)localObject);
          break;
        case 60: 
          useOnLoadResource = ((Boolean)localObject);
          break;
        case 59: 
          useOnRenderProcessGone = ((Boolean)localObject);
          break;
        case 58: 
          userAgent = ((String)localObject);
          break;
        case 57: 
          blockNetworkLoads = ((Boolean)localObject);
          break;
        case 56: 
          blockNetworkImage = ((Boolean)localObject);
          break;
        case 55: 
          mediaPlaybackRequiresUserGesture = ((Boolean)localObject);
          break;
        case 54: 
          cursiveFontFamily = ((String)localObject);
          break;
        case 53: 
          forceDarkStrategy = ((Integer)localObject);
          break;
        case 52: 
          useOnDownloadStart = ((Boolean)localObject);
          break;
        case 51: 
          verticalScrollbarTrackColor = ((String)localObject);
          break;
        case 50: 
          regexToCancelSubFramesLoading = ((String)localObject);
          break;
        case 49: 
          sansSerifFontFamily = ((String)localObject);
          break;
        case 48: 
          rendererPriorityPolicy = ((Map)localObject);
          break;
        case 47: 
          fantasyFontFamily = ((String)localObject);
          break;
        case 46: 
          offscreenPreRaster = ((Boolean)localObject);
          break;
        case 45: 
          horizontalScrollbarTrackColor = ((String)localObject);
          break;
        case 44: 
          javaScriptCanOpenWindowsAutomatically = ((Boolean)localObject);
          break;
        case 43: 
          disableVerticalScroll = ((Boolean)localObject);
          break;
        case 42: 
          verticalScrollbarPosition = ((Integer)localObject);
          break;
        case 41: 
          initialScale = ((Integer)localObject);
          break;
        case 40: 
          scrollBarStyle = ((Integer)localObject);
          break;
        case 39: 
          horizontalScrollBarEnabled = ((Boolean)localObject);
          break;
        case 38: 
          cacheMode = ((Integer)localObject);
          break;
        case 37: 
          useShouldInterceptRequest = ((Boolean)localObject);
          break;
        case 36: 
          databaseEnabled = ((Boolean)localObject);
          break;
        case 35: 
          allowUniversalAccessFromFileURLs = ((Boolean)localObject);
          break;
        case 34: 
          enterpriseAuthenticationAppLinkPolicyEnabled = ((Boolean)localObject);
          break;
        case 33: 
          transparentBackground = ((Boolean)localObject);
          break;
        case 32: 
          clearCache = ((Boolean)localObject);
          break;
        case 31: 
          setLayoutAlgorithm((String)localObject);
          break;
        case 30: 
          minimumFontSize = ((Integer)localObject);
          break;
        case 29: 
          interceptOnlyAsyncAjaxRequests = ((Boolean)localObject);
          break;
        case 28: 
          textZoom = ((Integer)localObject);
          break;
        case 27: 
          useShouldInterceptAjaxRequest = ((Boolean)localObject);
          break;
        case 26: 
          disableContextMenu = ((Boolean)localObject);
          break;
        case 25: 
          domStorageEnabled = ((Boolean)localObject);
          break;
        case 24: 
          overScrollMode = ((Integer)localObject);
          break;
        case 23: 
          webViewAssetLoader = ((Map)localObject);
          break;
        case 22: 
          allowBackgroundAudioPlaying = ((Boolean)localObject);
          break;
        case 21: 
          incognito = ((Boolean)localObject);
          break;
        case 20: 
          disabledActionModeMenuItems = ((Integer)localObject);
          break;
        case 19: 
          resourceCustomSchemes = ((List)localObject);
          break;
        case 18: 
          loadsImagesAutomatically = ((Boolean)localObject);
          break;
        case 17: 
          useShouldInterceptFetchRequest = ((Boolean)localObject);
          break;
        case 16: 
          networkAvailable = ((Boolean)localObject);
          break;
        case 15: 
          hardwareAcceleration = ((Boolean)localObject);
          break;
        case 14: 
          javaScriptEnabled = ((Boolean)localObject);
          break;
        case 13: 
          builtInZoomControls = ((Boolean)localObject);
          break;
        case 12: 
          fixedFontFamily = ((String)localObject);
          break;
        case 11: 
          allowContentAccess = ((Boolean)localObject);
          break;
        case 10: 
          preferredContentMode = ((Integer)localObject);
          break;
        case 9: 
          useShouldOverrideUrlLoading = ((Boolean)localObject);
          break;
        case 8: 
          needInitialFocus = ((Boolean)localObject);
          break;
        case 7: 
          defaultTextEncodingName = ((String)localObject);
          break;
        case 6: 
          scrollbarFadingEnabled = ((Boolean)localObject);
          break;
        case 5: 
          supportZoom = ((Boolean)localObject);
          break;
        case 4: 
          defaultFontSize = ((Integer)localObject);
          break;
        case 3: 
          allowFileAccessFromFileURLs = ((Boolean)localObject);
          break;
        case 2: 
          useWideViewPort = ((Boolean)localObject);
          break;
        case 1: 
          scrollBarDefaultDelayBeforeFade = ((Integer)localObject);
          break;
        case 0: 
          disableHorizontalScroll = ((Boolean)localObject);
        }
      }
    }
    return this;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("useShouldOverrideUrlLoading", useShouldOverrideUrlLoading);
    localHashMap.put("useOnLoadResource", useOnLoadResource);
    localHashMap.put("useOnDownloadStart", useOnDownloadStart);
    localHashMap.put("clearCache", clearCache);
    localHashMap.put("userAgent", userAgent);
    localHashMap.put("applicationNameForUserAgent", applicationNameForUserAgent);
    localHashMap.put("javaScriptEnabled", javaScriptEnabled);
    localHashMap.put("javaScriptCanOpenWindowsAutomatically", javaScriptCanOpenWindowsAutomatically);
    localHashMap.put("mediaPlaybackRequiresUserGesture", mediaPlaybackRequiresUserGesture);
    localHashMap.put("minimumFontSize", minimumFontSize);
    localHashMap.put("verticalScrollBarEnabled", verticalScrollBarEnabled);
    localHashMap.put("horizontalScrollBarEnabled", horizontalScrollBarEnabled);
    localHashMap.put("resourceCustomSchemes", resourceCustomSchemes);
    localHashMap.put("contentBlockers", contentBlockers);
    localHashMap.put("preferredContentMode", preferredContentMode);
    localHashMap.put("useShouldInterceptAjaxRequest", useShouldInterceptAjaxRequest);
    localHashMap.put("interceptOnlyAsyncAjaxRequests", interceptOnlyAsyncAjaxRequests);
    localHashMap.put("useShouldInterceptFetchRequest", useShouldInterceptFetchRequest);
    localHashMap.put("incognito", incognito);
    localHashMap.put("cacheEnabled", cacheEnabled);
    localHashMap.put("transparentBackground", transparentBackground);
    localHashMap.put("disableVerticalScroll", disableVerticalScroll);
    localHashMap.put("disableHorizontalScroll", disableHorizontalScroll);
    localHashMap.put("disableContextMenu", disableContextMenu);
    localHashMap.put("textZoom", textZoom);
    localHashMap.put("clearSessionCache", clearSessionCache);
    localHashMap.put("builtInZoomControls", builtInZoomControls);
    localHashMap.put("displayZoomControls", displayZoomControls);
    localHashMap.put("supportZoom", supportZoom);
    localHashMap.put("databaseEnabled", databaseEnabled);
    localHashMap.put("domStorageEnabled", domStorageEnabled);
    localHashMap.put("useWideViewPort", useWideViewPort);
    localHashMap.put("safeBrowsingEnabled", safeBrowsingEnabled);
    localHashMap.put("mixedContentMode", mixedContentMode);
    localHashMap.put("allowContentAccess", allowContentAccess);
    localHashMap.put("allowFileAccess", allowFileAccess);
    localHashMap.put("allowFileAccessFromFileURLs", allowFileAccessFromFileURLs);
    localHashMap.put("allowUniversalAccessFromFileURLs", allowUniversalAccessFromFileURLs);
    localHashMap.put("appCachePath", appCachePath);
    localHashMap.put("blockNetworkImage", blockNetworkImage);
    localHashMap.put("blockNetworkLoads", blockNetworkLoads);
    localHashMap.put("cacheMode", cacheMode);
    localHashMap.put("cursiveFontFamily", cursiveFontFamily);
    localHashMap.put("defaultFixedFontSize", defaultFixedFontSize);
    localHashMap.put("defaultFontSize", defaultFontSize);
    localHashMap.put("defaultTextEncodingName", defaultTextEncodingName);
    localHashMap.put("disabledActionModeMenuItems", disabledActionModeMenuItems);
    localHashMap.put("fantasyFontFamily", fantasyFontFamily);
    localHashMap.put("fixedFontFamily", fixedFontFamily);
    localHashMap.put("forceDark", forceDark);
    localHashMap.put("forceDarkStrategy", forceDarkStrategy);
    localHashMap.put("geolocationEnabled", geolocationEnabled);
    localHashMap.put("layoutAlgorithm", getLayoutAlgorithm());
    localHashMap.put("loadWithOverviewMode", loadWithOverviewMode);
    localHashMap.put("loadsImagesAutomatically", loadsImagesAutomatically);
    localHashMap.put("minimumLogicalFontSize", minimumLogicalFontSize);
    localHashMap.put("initialScale", initialScale);
    localHashMap.put("needInitialFocus", needInitialFocus);
    localHashMap.put("offscreenPreRaster", offscreenPreRaster);
    localHashMap.put("sansSerifFontFamily", sansSerifFontFamily);
    localHashMap.put("serifFontFamily", serifFontFamily);
    localHashMap.put("standardFontFamily", standardFontFamily);
    localHashMap.put("saveFormData", saveFormData);
    localHashMap.put("thirdPartyCookiesEnabled", thirdPartyCookiesEnabled);
    localHashMap.put("hardwareAcceleration", hardwareAcceleration);
    localHashMap.put("supportMultipleWindows", supportMultipleWindows);
    localHashMap.put("regexToCancelSubFramesLoading", regexToCancelSubFramesLoading);
    localHashMap.put("overScrollMode", overScrollMode);
    localHashMap.put("networkAvailable", networkAvailable);
    localHashMap.put("scrollBarStyle", scrollBarStyle);
    localHashMap.put("verticalScrollbarPosition", verticalScrollbarPosition);
    localHashMap.put("scrollBarDefaultDelayBeforeFade", scrollBarDefaultDelayBeforeFade);
    localHashMap.put("scrollbarFadingEnabled", scrollbarFadingEnabled);
    localHashMap.put("scrollBarFadeDuration", scrollBarFadeDuration);
    localHashMap.put("rendererPriorityPolicy", rendererPriorityPolicy);
    localHashMap.put("useShouldInterceptRequest", useShouldInterceptRequest);
    localHashMap.put("useOnRenderProcessGone", useOnRenderProcessGone);
    localHashMap.put("disableDefaultErrorPage", disableDefaultErrorPage);
    localHashMap.put("useHybridComposition", useHybridComposition);
    localHashMap.put("verticalScrollbarThumbColor", verticalScrollbarThumbColor);
    localHashMap.put("verticalScrollbarTrackColor", verticalScrollbarTrackColor);
    localHashMap.put("horizontalScrollbarThumbColor", horizontalScrollbarThumbColor);
    localHashMap.put("horizontalScrollbarTrackColor", horizontalScrollbarTrackColor);
    localHashMap.put("algorithmicDarkeningAllowed", algorithmicDarkeningAllowed);
    localHashMap.put("enterpriseAuthenticationAppLinkPolicyEnabled", enterpriseAuthenticationAppLinkPolicyEnabled);
    localHashMap.put("allowBackgroundAudioPlaying", allowBackgroundAudioPlaying);
    localHashMap.put("defaultVideoPoster", defaultVideoPoster);
    ArrayList localArrayList;
    if (requestedWithHeaderOriginAllowList != null) {
      localArrayList = new ArrayList(requestedWithHeaderOriginAllowList);
    } else {
      localArrayList = null;
    }
    localHashMap.put("requestedWithHeaderOriginAllowList", localArrayList);
    return localHashMap;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */