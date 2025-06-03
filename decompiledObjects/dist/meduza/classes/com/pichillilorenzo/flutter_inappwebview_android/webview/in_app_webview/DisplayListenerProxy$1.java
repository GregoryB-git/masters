package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import java.util.ArrayList;
import java.util.Iterator;

class DisplayListenerProxy$1
  implements DisplayManager.DisplayListener
{
  public void onDisplayAdded(int paramInt)
  {
    Iterator localIterator = val$webViewListeners.iterator();
    while (localIterator.hasNext()) {
      ((DisplayManager.DisplayListener)localIterator.next()).onDisplayAdded(paramInt);
    }
  }
  
  public void onDisplayChanged(int paramInt)
  {
    if (val$displayManager.getDisplay(paramInt) == null) {
      return;
    }
    Iterator localIterator = val$webViewListeners.iterator();
    while (localIterator.hasNext()) {
      ((DisplayManager.DisplayListener)localIterator.next()).onDisplayChanged(paramInt);
    }
  }
  
  public void onDisplayRemoved(int paramInt)
  {
    Iterator localIterator = val$webViewListeners.iterator();
    while (localIterator.hasNext()) {
      ((DisplayManager.DisplayListener)localIterator.next()).onDisplayRemoved(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.DisplayListenerProxy.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */