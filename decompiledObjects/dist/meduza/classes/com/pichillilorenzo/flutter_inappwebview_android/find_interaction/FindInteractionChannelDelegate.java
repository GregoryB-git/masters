package com.pichillilorenzo.flutter_inappwebview_android.find_interaction;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.FindSession;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.HashMap;

public class FindInteractionChannelDelegate
  extends ChannelDelegateImpl
{
  private FindInteractionController findInteractionController;
  
  public FindInteractionChannelDelegate(FindInteractionController paramFindInteractionController, MethodChannel paramMethodChannel)
  {
    super(paramMethodChannel);
    findInteractionController = paramFindInteractionController;
  }
  
  public void dispose()
  {
    super.dispose();
    findInteractionController = null;
  }
  
  public void onFindResultReceived(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    if (paramBoolean)
    {
      localObject = findInteractionController;
      if ((localObject != null) && (webView != null)) {
        activeFindSession = new FindSession(paramInt2, paramInt1);
      }
    }
    Object localObject = new HashMap();
    ((HashMap)localObject).put("activeMatchOrdinal", Integer.valueOf(paramInt1));
    ((HashMap)localObject).put("numberOfMatches", Integer.valueOf(paramInt2));
    ((HashMap)localObject).put("isDoneCounting", Boolean.valueOf(paramBoolean));
    localMethodChannel.invokeMethod("onFindResultReceived", localObject);
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    Object localObject = method;
    localObject.getClass();
    int i = ((String)localObject).hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 2137531137: 
      if (((String)localObject).equals("getActiveFindSession")) {
        j = 5;
      }
      break;
    case 817048102: 
      if (((String)localObject).equals("clearMatches")) {
        j = 4;
      }
      break;
    case -234090249: 
      if (((String)localObject).equals("setSearchText")) {
        j = 3;
      }
      break;
    case -679382964: 
      if (((String)localObject).equals("findNext")) {
        j = 2;
      }
      break;
    case -853211864: 
      if (((String)localObject).equals("findAll")) {
        j = 1;
      }
      break;
    case -1008221461: 
      if (((String)localObject).equals("getSearchText")) {
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
      paramMethodCall = findInteractionController;
      if (paramMethodCall != null)
      {
        paramMethodCall = activeFindSession;
        if (paramMethodCall != null)
        {
          paramMethodCall = paramMethodCall.toMap();
          break label376;
        }
      }
      paramMethodCall = null;
      break;
    case 4: 
      paramMethodCall = findInteractionController;
      if (paramMethodCall != null) {
        paramMethodCall.clearMatches();
      }
      break;
    case 3: 
      localObject = findInteractionController;
      if (localObject != null) {
        searchText = ((String)paramMethodCall.argument("searchText"));
      } else {
        paramMethodCall = Boolean.FALSE;
      }
      break;
    case 2: 
      if (findInteractionController != null)
      {
        paramMethodCall = (Boolean)paramMethodCall.argument("forward");
        findInteractionController.findNext(paramMethodCall.booleanValue());
      }
      break;
    case 1: 
      if (findInteractionController != null)
      {
        paramMethodCall = (String)paramMethodCall.argument("find");
        findInteractionController.findAll(paramMethodCall);
      }
      break;
    }
    for (paramMethodCall = Boolean.TRUE;; paramMethodCall = searchText)
    {
      label376:
      paramResult.success(paramMethodCall);
      return;
      paramMethodCall = findInteractionController;
      if (paramMethodCall == null) {
        break;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionChannelDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */