package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import java.util.Map;

class InAppWebViewChromeClient$10
  implements DialogInterface.OnClickListener
{
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    val$result.cancel();
    paramDialogInterface.dismiss();
    this$0.dialogs.remove(paramDialogInterface);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.10
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */