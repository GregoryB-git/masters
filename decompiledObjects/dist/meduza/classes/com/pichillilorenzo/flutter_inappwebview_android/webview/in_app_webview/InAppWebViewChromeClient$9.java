package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import java.util.Map;

class InAppWebViewChromeClient$9
  implements DialogInterface.OnClickListener
{
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Object localObject = val$input.getText().toString();
    JsPromptResult localJsPromptResult = val$result;
    String str = val$finalValue;
    if (str != null) {
      localObject = str;
    }
    localJsPromptResult.confirm((String)localObject);
    paramDialogInterface.dismiss();
    this$0.dialogs.remove(paramDialogInterface);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.9
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */