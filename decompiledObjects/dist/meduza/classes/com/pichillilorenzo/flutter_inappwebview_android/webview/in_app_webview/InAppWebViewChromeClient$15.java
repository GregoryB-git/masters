package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsResult;
import java.util.Map;

class InAppWebViewChromeClient$15
  implements DialogInterface.OnCancelListener
{
  public void onCancel(DialogInterface paramDialogInterface)
  {
    val$result.cancel();
    paramDialogInterface.dismiss();
    this$0.dialogs.remove(paramDialogInterface);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.15
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */