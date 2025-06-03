package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

public class DisplayListenerProxy
{
  private static final String TAG = "DisplayListenerProxy";
  private ArrayList<DisplayManager.DisplayListener> listenersBeforeWebView;
  
  private static ArrayList<DisplayManager.DisplayListener> yoinkDisplayListeners(DisplayManager paramDisplayManager)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return new ArrayList();
    }
    try
    {
      localObject1 = DisplayManager.class.getDeclaredField("mGlobal");
      ((AccessibleObject)localObject1).setAccessible(true);
      paramDisplayManager = ((Field)localObject1).get(paramDisplayManager);
      localObject1 = paramDisplayManager.getClass().getDeclaredField("mDisplayListeners");
      ((AccessibleObject)localObject1).setAccessible(true);
      localObject1 = (ArrayList)((Field)localObject1).get(paramDisplayManager);
      paramDisplayManager = null;
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = ((ArrayList)localObject1).iterator();
      while (localIterator.hasNext())
      {
        Object localObject2 = localIterator.next();
        localObject1 = paramDisplayManager;
        if (paramDisplayManager == null)
        {
          localObject1 = localObject2.getClass().getField("mListener");
          ((AccessibleObject)localObject1).setAccessible(true);
        }
        localArrayList.add((DisplayManager.DisplayListener)((Field)localObject1).get(localObject2));
        paramDisplayManager = (DisplayManager)localObject1;
      }
      return localArrayList;
    }
    catch (IllegalAccessException paramDisplayManager) {}catch (NoSuchFieldException paramDisplayManager) {}
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Could not extract WebView's display listeners. ");
    ((StringBuilder)localObject1).append(paramDisplayManager);
    Log.w("DisplayListenerProxy", ((StringBuilder)localObject1).toString());
    return new ArrayList();
  }
  
  public void onPostWebViewInitialization(final DisplayManager paramDisplayManager)
  {
    final ArrayList localArrayList = yoinkDisplayListeners(paramDisplayManager);
    localArrayList.removeAll(listenersBeforeWebView);
    if (localArrayList.isEmpty()) {
      return;
    }
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      paramDisplayManager.unregisterDisplayListener((DisplayManager.DisplayListener)localIterator.next());
      paramDisplayManager.registerDisplayListener(new DisplayManager.DisplayListener()
      {
        public void onDisplayAdded(int paramAnonymousInt)
        {
          Iterator localIterator = localArrayList.iterator();
          while (localIterator.hasNext()) {
            ((DisplayManager.DisplayListener)localIterator.next()).onDisplayAdded(paramAnonymousInt);
          }
        }
        
        public void onDisplayChanged(int paramAnonymousInt)
        {
          if (paramDisplayManager.getDisplay(paramAnonymousInt) == null) {
            return;
          }
          Iterator localIterator = localArrayList.iterator();
          while (localIterator.hasNext()) {
            ((DisplayManager.DisplayListener)localIterator.next()).onDisplayChanged(paramAnonymousInt);
          }
        }
        
        public void onDisplayRemoved(int paramAnonymousInt)
        {
          Iterator localIterator = localArrayList.iterator();
          while (localIterator.hasNext()) {
            ((DisplayManager.DisplayListener)localIterator.next()).onDisplayRemoved(paramAnonymousInt);
          }
        }
      }, null);
    }
  }
  
  public void onPreWebViewInitialization(DisplayManager paramDisplayManager)
  {
    listenersBeforeWebView = yoinkDisplayListeners(paramDisplayManager);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.DisplayListenerProxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */