package io.flutter.plugins.firebase.messaging;

import O5.e;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.T;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import v5.j;

public class FlutterFirebaseMessagingBackgroundService
  extends a
{
  public static final List x = Collections.synchronizedList(new LinkedList());
  public static e y;
  
  public static void k(Context paramContext, Intent paramIntent)
  {
    Bundle localBundle = paramIntent.getExtras();
    Objects.requireNonNull(localBundle);
    int i = ((T)localBundle.get("notification")).S();
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    a.d(paramContext, FlutterFirebaseMessagingBackgroundService.class, 2020, paramIntent, bool);
  }
  
  public static void m()
  {
    Log.i("FLTFireMsgService", "FlutterFirebaseMessagingBackgroundService started!");
    synchronized (x)
    {
      Iterator localIterator = ???.iterator();
      if (localIterator.hasNext())
      {
        Intent localIntent = (Intent)localIterator.next();
        y.d(localIntent, null);
      }
    }
  }
  
  public static void n(long paramLong)
  {
    e.m(paramLong);
  }
  
  public static void o(long paramLong)
  {
    e.n(paramLong);
  }
  
  public static void p(long paramLong, j paramj)
  {
    if (y != null)
    {
      Log.w("FLTFireMsgService", "Attempted to start a duplicate background isolate. Returning...");
      return;
    }
    e locale = new e();
    y = locale;
    locale.p(paramLong, paramj);
  }
  
  public void g(Intent paramIntent)
  {
    if (!y.h())
    {
      Log.w("FLTFireMsgService", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
      return;
    }
    synchronized (x)
    {
      if (y.i())
      {
        Log.i("FLTFireMsgService", "Service has not yet started, messages will be queued.");
        ((List)???).add(paramIntent);
        return;
      }
    }
  }
  
  public void onCreate()
  {
    super.onCreate();
    if (y == null) {
      y = new e();
    }
    y.o();
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */