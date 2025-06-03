package com.pichillilorenzo.flutter_inappwebview_android.find_interaction;

import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.FindSession;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import io.flutter.plugin.common.MethodChannel;

public class FindInteractionController
  implements Disposable
{
  public static final String LOG_TAG = "FindInteractionController";
  public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_find_interaction_";
  public FindSession activeFindSession;
  public FindInteractionChannelDelegate channelDelegate;
  public String searchText;
  public FindInteractionSettings settings;
  public InAppWebViewInterface webView;
  
  public FindInteractionController(InAppWebViewInterface paramInAppWebViewInterface, InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin, Object paramObject, FindInteractionSettings paramFindInteractionSettings)
  {
    webView = paramInAppWebViewInterface;
    settings = paramFindInteractionSettings;
    paramInAppWebViewInterface = messenger;
    paramInAppWebViewFlutterPlugin = new StringBuilder();
    paramInAppWebViewFlutterPlugin.append("com.pichillilorenzo/flutter_inappwebview_find_interaction_");
    paramInAppWebViewFlutterPlugin.append(paramObject);
    channelDelegate = new FindInteractionChannelDelegate(this, new MethodChannel(paramInAppWebViewInterface, paramInAppWebViewFlutterPlugin.toString()));
  }
  
  public void clearMatches()
  {
    InAppWebViewInterface localInAppWebViewInterface = webView;
    if (localInAppWebViewInterface != null) {
      localInAppWebViewInterface.clearMatches();
    }
  }
  
  public void dispose()
  {
    FindInteractionChannelDelegate localFindInteractionChannelDelegate = channelDelegate;
    if (localFindInteractionChannelDelegate != null)
    {
      localFindInteractionChannelDelegate.dispose();
      channelDelegate = null;
    }
    webView = null;
    activeFindSession = null;
    searchText = null;
  }
  
  public void findAll(String paramString)
  {
    if (paramString == null) {
      paramString = searchText;
    } else {
      searchText = paramString;
    }
    InAppWebViewInterface localInAppWebViewInterface = webView;
    if ((localInAppWebViewInterface != null) && (paramString != null)) {
      localInAppWebViewInterface.findAllAsync(paramString);
    }
  }
  
  public void findNext(boolean paramBoolean)
  {
    InAppWebViewInterface localInAppWebViewInterface = webView;
    if (localInAppWebViewInterface != null) {
      localInAppWebViewInterface.findNext(paramBoolean);
    }
  }
  
  public void prepare() {}
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */