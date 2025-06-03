package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.os.Handler;
import android.webkit.ValueCallback;
import android.webkit.WebView;

class InAppWebView$4
  implements Runnable
{
  public InAppWebView$4(InAppWebView paramInAppWebView) {}
  
  public void run()
  {
    InAppWebView localInAppWebView = this$0;
    if (floatingContextMenu != null) {
      localInAppWebView.evaluateJavascript("(function(){  var txt;  if (window.getSelection) {    txt = window.getSelection().toString();  } else if (window.document.getSelection) {    txt = window.document.getSelection().toString();  } else if (window.document.selection) {    txt = window.document.selection.createRange().text;  }var activeEl = document.activeElement;var nodeName = (activeEl != null) ? activeEl.nodeName.toLowerCase() : '';var isActiveElementInputEditable = activeEl != null && (activeEl.nodeType == 1 && (nodeName == 'textarea' || (nodeName == 'input' && /^(?:text|email|number|search|tel|url|password)$/i.test(activeEl.type != null ? activeEl.type : 'text')))) && !activeEl.disabled && !activeEl.readOnly;var isActiveElementEditable = isActiveElementInputEditable || (activeEl != null && activeEl.isContentEditable) || document.designMode === 'on';  return txt === '' && !isActiveElementEditable;})();", new ValueCallback()
      {
        public void onReceiveValue(String paramAnonymousString)
        {
          if ((paramAnonymousString != null) && (!paramAnonymousString.equals("true")))
          {
            paramAnonymousString = this$0;
            mainLooperHandler.postDelayed(checkContextMenuShouldBeClosedTask, newCheckContextMenuShouldBeClosedTaskTask);
          }
          else
          {
            paramAnonymousString = this$0;
            if (floatingContextMenu != null) {
              paramAnonymousString.hideContextMenu();
            }
          }
        }
      });
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */