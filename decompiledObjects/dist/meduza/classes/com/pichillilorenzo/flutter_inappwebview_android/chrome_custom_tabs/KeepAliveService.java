package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class KeepAliveService
  extends Service
{
  private static final Binder sBinder = new Binder();
  
  public IBinder onBind(Intent paramIntent)
  {
    return sBinder;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.KeepAliveService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */