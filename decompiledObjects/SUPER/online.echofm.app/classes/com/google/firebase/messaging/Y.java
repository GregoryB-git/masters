package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

public class Y
{
  public static Y e;
  public String a = null;
  public Boolean b = null;
  public Boolean c = null;
  public final Queue d = new ArrayDeque();
  
  public static Y b()
  {
    try
    {
      if (e == null)
      {
        Y localY1 = new com/google/firebase/messaging/Y;
        localY1.<init>();
        e = localY1;
      }
    }
    finally
    {
      break label37;
    }
    Y localY2 = e;
    return localY2;
    label37:
    throw localY2;
  }
  
  public final int a(Context paramContext, Intent paramIntent)
  {
    String str = f(paramContext, paramIntent);
    if (str != null)
    {
      if (Log.isLoggable("FirebaseMessaging", 3))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Restricting intent to a specific service: ");
        localStringBuilder.append(str);
        Log.d("FirebaseMessaging", localStringBuilder.toString());
      }
      paramIntent.setClassName(paramContext.getPackageName(), str);
    }
    try
    {
      if (e(paramContext)) {
        paramContext = j0.h(paramContext, paramIntent);
      }
    }
    catch (IllegalStateException paramContext)
    {
      break label122;
    }
    catch (SecurityException paramContext)
    {
      break label157;
    }
    paramContext = paramContext.startService(paramIntent);
    Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
    if (paramContext == null)
    {
      Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
      return 404;
    }
    return -1;
    label122:
    paramIntent = new StringBuilder();
    paramIntent.append("Failed to start service while in background: ");
    paramIntent.append(paramContext);
    Log.e("FirebaseMessaging", paramIntent.toString());
    return 402;
    label157:
    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", paramContext);
    return 401;
  }
  
  public Intent c()
  {
    return (Intent)d.poll();
  }
  
  public boolean d(Context paramContext)
  {
    if (c == null)
    {
      boolean bool;
      if (paramContext.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
        bool = true;
      } else {
        bool = false;
      }
      c = Boolean.valueOf(bool);
    }
    if ((!b.booleanValue()) && (Log.isLoggable("FirebaseMessaging", 3))) {
      Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
    }
    return c.booleanValue();
  }
  
  public boolean e(Context paramContext)
  {
    if (b == null)
    {
      boolean bool;
      if (paramContext.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
        bool = true;
      } else {
        bool = false;
      }
      b = Boolean.valueOf(bool);
    }
    if ((!b.booleanValue()) && (Log.isLoggable("FirebaseMessaging", 3))) {
      Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
    }
    return b.booleanValue();
  }
  
  public final String f(Context paramContext, Intent paramIntent)
  {
    for (;;)
    {
      try
      {
        Object localObject = a;
        if (localObject != null) {
          return (String)localObject;
        }
        paramIntent = paramContext.getPackageManager().resolveService(paramIntent, 0);
        if (paramIntent == null) {
          break label190;
        }
        paramIntent = serviceInfo;
        if (paramIntent == null) {
          break label190;
        }
        if (!paramContext.getPackageName().equals(packageName)) {
          break;
        }
        localObject = name;
        if (localObject == null) {
          break;
        }
        if (((String)localObject).startsWith("."))
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          ((StringBuilder)localObject).append(paramContext.getPackageName());
          ((StringBuilder)localObject).append(name);
          paramContext = ((StringBuilder)localObject).toString();
          a = paramContext;
        }
      }
      finally
      {
        break label202;
      }
      paramContext = name;
    }
    paramContext = a;
    return paramContext;
    paramContext = new java/lang/StringBuilder;
    paramContext.<init>();
    paramContext.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
    paramContext.append(packageName);
    paramContext.append("/");
    paramContext.append(name);
    Log.e("FirebaseMessaging", paramContext.toString());
    return null;
    label190:
    Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
    return null;
    label202:
    throw paramContext;
  }
  
  public int g(Context paramContext, Intent paramIntent)
  {
    if (Log.isLoggable("FirebaseMessaging", 3)) {
      Log.d("FirebaseMessaging", "Starting service");
    }
    d.offer(paramIntent);
    paramIntent = new Intent("com.google.firebase.MESSAGING_EVENT");
    paramIntent.setPackage(paramContext.getPackageName());
    return a(paramContext, paramIntent);
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.Y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */