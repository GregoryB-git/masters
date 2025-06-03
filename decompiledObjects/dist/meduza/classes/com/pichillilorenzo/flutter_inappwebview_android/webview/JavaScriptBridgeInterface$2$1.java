package com.pichillilorenzo.flutter_inappwebview_android.webview;

import a0.j;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobController;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobManager;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import g;
import java.util.Map;

class JavaScriptBridgeInterface$2$1
  extends WebViewChannelDelegate.PrintRequestCallback
{
  public JavaScriptBridgeInterface$2$1(JavaScriptBridgeInterface.2 param2, String paramString) {}
  
  public void defaultBehaviour(Boolean paramBoolean)
  {
    if ((JavaScriptBridgeInterface.access$000(this$1.this$0) != null) && (access$000this$1.this$0).plugin != null) && (access$000this$1.this$0).plugin.printJobManager != null))
    {
      paramBoolean = (PrintJobController)access$000this$1.this$0).plugin.printJobManager.jobs.get(val$printJobId);
      if (paramBoolean != null) {
        paramBoolean.disposeNoCancel();
      }
    }
  }
  
  public void error(String paramString1, String paramString2, Object paramObject)
  {
    paramString1 = g.g(paramString1, ", ");
    if (paramString2 == null) {
      paramString2 = "";
    }
    j.t(paramString1, paramString2, "JSBridgeInterface");
    defaultBehaviour(null);
  }
  
  public boolean nonNullSuccess(Boolean paramBoolean)
  {
    return paramBoolean.booleanValue() ^ true;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface.2.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */