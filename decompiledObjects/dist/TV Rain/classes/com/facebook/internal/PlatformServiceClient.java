package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

public abstract class PlatformServiceClient
  implements ServiceConnection
{
  private final String applicationId;
  private final Context context;
  private final Handler handler;
  private CompletedListener listener;
  private final int protocolVersion;
  private int replyMessage;
  private int requestMessage;
  private boolean running;
  private Messenger sender;
  
  public PlatformServiceClient(Context paramContext, int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null) {
      paramContext = localContext;
    }
    context = paramContext;
    requestMessage = paramInt1;
    replyMessage = paramInt2;
    applicationId = paramString;
    protocolVersion = paramInt3;
    handler = new Handler()
    {
      public void handleMessage(Message paramAnonymousMessage)
      {
        if (CrashShieldHandler.isObjectCrashing(this)) {
          return;
        }
        try
        {
          PlatformServiceClient.this.handleMessage(paramAnonymousMessage);
          return;
        }
        finally
        {
          CrashShieldHandler.handleThrowable(paramAnonymousMessage, this);
        }
      }
    };
  }
  
  private void callback(Bundle paramBundle)
  {
    if (!running) {
      return;
    }
    running = false;
    CompletedListener localCompletedListener = listener;
    if (localCompletedListener != null) {
      localCompletedListener.completed(paramBundle);
    }
  }
  
  private void sendMessage()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("com.facebook.platform.extra.APPLICATION_ID", applicationId);
    populateRequestBundle(localBundle);
    Message localMessage = Message.obtain(null, requestMessage);
    arg1 = protocolVersion;
    localMessage.setData(localBundle);
    replyTo = new Messenger(handler);
    try
    {
      sender.send(localMessage);
    }
    catch (RemoteException localRemoteException)
    {
      callback(null);
    }
  }
  
  public void cancel()
  {
    running = false;
  }
  
  public Context getContext()
  {
    return context;
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (what == replyMessage)
    {
      paramMessage = paramMessage.getData();
      if (paramMessage.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
        callback(null);
      } else {
        callback(paramMessage);
      }
    }
    try
    {
      context.unbindService(this);
      return;
    }
    catch (IllegalArgumentException paramMessage)
    {
      for (;;) {}
    }
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    sender = new Messenger(paramIBinder);
    sendMessage();
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    sender = null;
    try
    {
      context.unbindService(this);
      callback(null);
      return;
    }
    catch (IllegalArgumentException paramComponentName)
    {
      for (;;) {}
    }
  }
  
  public abstract void populateRequestBundle(Bundle paramBundle);
  
  public void setCompletedListener(CompletedListener paramCompletedListener)
  {
    listener = paramCompletedListener;
  }
  
  public boolean start()
  {
    if (running) {
      return false;
    }
    if (NativeProtocol.getLatestAvailableProtocolVersionForService(protocolVersion) == -1) {
      return false;
    }
    Intent localIntent = NativeProtocol.createPlatformServiceIntent(context);
    if (localIntent == null) {
      return false;
    }
    running = true;
    context.bindService(localIntent, this, 1);
    return true;
  }
  
  public static abstract interface CompletedListener
  {
    public abstract void completed(Bundle paramBundle);
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.PlatformServiceClient
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */