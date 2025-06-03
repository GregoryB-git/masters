package u;

import a0.d;
import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings.Secure;
import android.support.v4.app.INotificationSideChannel;
import android.support.v4.app.INotificationSideChannel.Stub;
import android.util.Log;
import c0.b;
import com.google.android.gms.internal.base.a;
import f;
import g;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class u
{
  public static final Object c = new Object();
  public static String d;
  public static HashSet e = new HashSet();
  public static final Object f = new Object();
  public static e g;
  public final Context a;
  public final NotificationManager b;
  
  public u(Context paramContext)
  {
    a = paramContext;
    b = ((NotificationManager)paramContext.getSystemService("notification"));
  }
  
  public final boolean a()
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return a.a(b);
    }
    AppOpsManager localAppOpsManager = (AppOpsManager)a.getSystemService("appops");
    Object localObject = a.getApplicationInfo();
    String str = a.getApplicationContext().getPackageName();
    int i = uid;
    boolean bool = true;
    try
    {
      Class localClass = Class.forName(AppOpsManager.class.getName());
      localObject = Integer.TYPE;
      i = ((Integer)localClass.getMethod("checkOpNoThrow", new Class[] { localObject, localObject, String.class }).invoke(localAppOpsManager, new Object[] { Integer.valueOf(((Integer)localClass.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), str })).intValue();
      if (i != 0) {
        bool = false;
      }
    }
    catch (ClassNotFoundException|NoSuchMethodException|NoSuchFieldException|InvocationTargetException|IllegalAccessException|RuntimeException localClassNotFoundException)
    {
      for (;;) {}
    }
    return bool;
  }
  
  public final void b(int paramInt, Notification arg2)
  {
    Object localObject1 = extras;
    int i;
    if ((localObject1 != null) && (((BaseBundle)localObject1).getBoolean("android.support.useSideChannel"))) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      c localc = new c(a.getPackageName(), paramInt, ???);
      synchronized (f)
      {
        if (g == null)
        {
          localObject1 = new u/u$e;
          ((e)localObject1).<init>(a.getApplicationContext());
          g = (e)localObject1;
        }
        gb.obtainMessage(0, localc).sendToTarget();
        b.cancel(null, paramInt);
      }
    }
    b.notify(null, paramInt, ???);
  }
  
  public static final class a
  {
    public static boolean a(NotificationManager paramNotificationManager)
    {
      return a0.e.k(paramNotificationManager);
    }
    
    public static int b(NotificationManager paramNotificationManager)
    {
      return d.a(paramNotificationManager);
    }
  }
  
  public static final class b
  {
    public static void a(NotificationManager paramNotificationManager, NotificationChannel paramNotificationChannel)
    {
      b.p(paramNotificationManager, paramNotificationChannel);
    }
    
    public static void b(NotificationManager paramNotificationManager, NotificationChannelGroup paramNotificationChannelGroup)
    {
      d2.e.n(paramNotificationManager, paramNotificationChannelGroup);
    }
    
    public static void c(NotificationManager paramNotificationManager, List<NotificationChannelGroup> paramList)
    {
      b.q(paramNotificationManager, paramList);
    }
    
    public static void d(NotificationManager paramNotificationManager, List<NotificationChannel> paramList)
    {
      a.q(paramNotificationManager, paramList);
    }
    
    public static void e(NotificationManager paramNotificationManager, String paramString)
    {
      d2.e.o(paramNotificationManager, paramString);
    }
    
    public static void f(NotificationManager paramNotificationManager, String paramString)
    {
      d2.e.w(paramNotificationManager, paramString);
    }
    
    public static String g(NotificationChannel paramNotificationChannel)
    {
      return paramNotificationChannel.getId();
    }
    
    public static String h(NotificationChannelGroup paramNotificationChannelGroup)
    {
      return paramNotificationChannelGroup.getId();
    }
    
    public static NotificationChannel i(NotificationManager paramNotificationManager, String paramString)
    {
      return a.g(paramNotificationManager, paramString);
    }
    
    public static List<NotificationChannelGroup> j(NotificationManager paramNotificationManager)
    {
      return b.n(paramNotificationManager);
    }
    
    public static List<NotificationChannel> k(NotificationManager paramNotificationManager)
    {
      return a.o(paramNotificationManager);
    }
  }
  
  public static final class c
    implements u.f
  {
    public final String a;
    public final int b;
    public final String c;
    public final Notification d;
    
    public c(String paramString, int paramInt, Notification paramNotification)
    {
      a = paramString;
      b = paramInt;
      c = null;
      d = paramNotification;
    }
    
    public final void a(INotificationSideChannel paramINotificationSideChannel)
    {
      paramINotificationSideChannel.P2(a, b, c, d);
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("NotifyTask[");
      localStringBuilder.append("packageName:");
      localStringBuilder.append(a);
      localStringBuilder.append(", id:");
      localStringBuilder.append(b);
      localStringBuilder.append(", tag:");
      return g.f(localStringBuilder, c, "]");
    }
  }
  
  public static final class d
  {
    public final ComponentName a;
    public final IBinder b;
    
    public d(ComponentName paramComponentName, IBinder paramIBinder)
    {
      a = paramComponentName;
      b = paramIBinder;
    }
  }
  
  public static final class e
    implements Handler.Callback, ServiceConnection
  {
    public final Context a;
    public final Handler b;
    public final HashMap c = new HashMap();
    public HashSet d = new HashSet();
    
    public e(Context paramContext)
    {
      a = paramContext;
      paramContext = new HandlerThread("NotificationManagerCompat");
      paramContext.start();
      b = new Handler(paramContext.getLooper(), this);
    }
    
    public final void a(a parama)
    {
      Object localObject1;
      if (Log.isLoggable("NotifManCompat", 3))
      {
        localObject1 = f.l("Processing component ");
        ((StringBuilder)localObject1).append(a);
        ((StringBuilder)localObject1).append(", ");
        ((StringBuilder)localObject1).append(d.size());
        ((StringBuilder)localObject1).append(" queued tasks");
        Log.d("NotifManCompat", ((StringBuilder)localObject1).toString());
      }
      if (d.isEmpty()) {
        return;
      }
      boolean bool;
      if (b)
      {
        bool = true;
      }
      else
      {
        localObject1 = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(a);
        bool = a.bindService((Intent)localObject1, this, 33);
        b = bool;
        if (bool)
        {
          e = 0;
        }
        else
        {
          localObject1 = f.l("Unable to bind to listener ");
          ((StringBuilder)localObject1).append(a);
          Log.w("NotifManCompat", ((StringBuilder)localObject1).toString());
          a.unbindService(this);
        }
        bool = b;
      }
      if ((bool) && (c != null))
      {
        for (;;)
        {
          Object localObject2 = (u.f)d.peek();
          if (localObject2 != null) {
            try
            {
              if (Log.isLoggable("NotifManCompat", 3))
              {
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>();
                ((StringBuilder)localObject1).append("Sending task ");
                ((StringBuilder)localObject1).append(localObject2);
                Log.d("NotifManCompat", ((StringBuilder)localObject1).toString());
              }
              ((u.f)localObject2).a(c);
              d.remove();
            }
            catch (RemoteException localRemoteException)
            {
              localObject2 = f.l("RemoteException communicating with ");
              ((StringBuilder)localObject2).append(a);
              Log.w("NotifManCompat", ((StringBuilder)localObject2).toString(), localRemoteException);
            }
            catch (DeadObjectException localDeadObjectException)
            {
              if (Log.isLoggable("NotifManCompat", 3))
              {
                StringBuilder localStringBuilder = f.l("Remote service has died: ");
                localStringBuilder.append(a);
                Log.d("NotifManCompat", localStringBuilder.toString());
              }
            }
          }
        }
        if (!d.isEmpty()) {
          b(parama);
        }
        return;
      }
      b(parama);
    }
    
    public final void b(a parama)
    {
      if (b.hasMessages(3, a)) {
        return;
      }
      int i = e + 1;
      e = i;
      StringBuilder localStringBuilder;
      if (i > 6)
      {
        localStringBuilder = f.l("Giving up on delivering ");
        localStringBuilder.append(d.size());
        localStringBuilder.append(" tasks to ");
        localStringBuilder.append(a);
        localStringBuilder.append(" after ");
        localStringBuilder.append(e);
        localStringBuilder.append(" retries");
        Log.w("NotifManCompat", localStringBuilder.toString());
        d.clear();
        return;
      }
      i = (1 << i - 1) * 1000;
      if (Log.isLoggable("NotifManCompat", 3))
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("Scheduling retry for ");
        localStringBuilder.append(i);
        localStringBuilder.append(" ms");
        Log.d("NotifManCompat", localStringBuilder.toString());
      }
      parama = b.obtainMessage(3, a);
      b.sendMessageDelayed(parama, i);
    }
    
    public final boolean handleMessage(Message paramMessage)
    {
      int i = what;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3) {
              return false;
            }
            paramMessage = (ComponentName)obj;
            paramMessage = (a)c.get(paramMessage);
            if (paramMessage != null) {
              a(paramMessage);
            }
            return true;
          }
          paramMessage = (ComponentName)obj;
          paramMessage = (a)c.get(paramMessage);
          if (paramMessage != null)
          {
            if (b)
            {
              a.unbindService(this);
              b = false;
            }
            c = null;
          }
          return true;
        }
        localObject1 = (u.d)obj;
        paramMessage = a;
        localObject1 = b;
        paramMessage = (a)c.get(paramMessage);
        if (paramMessage != null)
        {
          c = INotificationSideChannel.Stub.asInterface((IBinder)localObject1);
          e = 0;
          a(paramMessage);
        }
        return true;
      }
      paramMessage = (u.f)obj;
      Object localObject2 = Settings.Secure.getString(a.getContentResolver(), "enabled_notification_listeners");
      Object localObject1 = u.c;
      if (localObject2 != null) {}
      try
      {
        Object localObject3;
        Object localObject4;
        Object localObject5;
        if (!((String)localObject2).equals(u.d))
        {
          localObject3 = ((String)localObject2).split(":", -1);
          localObject4 = new java/util/HashSet;
          ((HashSet)localObject4).<init>(localObject3.length);
          int j = localObject3.length;
          for (i = 0; i < j; i++)
          {
            localObject5 = ComponentName.unflattenFromString(localObject3[i]);
            if (localObject5 != null) {
              ((HashSet)localObject4).add(((ComponentName)localObject5).getPackageName());
            }
          }
          u.e = (HashSet)localObject4;
          u.d = (String)localObject2;
        }
        localObject2 = u.e;
        if (!((Set)localObject2).equals(d))
        {
          d = ((HashSet)localObject2);
          localObject4 = a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
          localObject1 = new HashSet();
          localObject4 = ((List)localObject4).iterator();
          while (((Iterator)localObject4).hasNext())
          {
            localObject3 = (ResolveInfo)((Iterator)localObject4).next();
            if (((HashSet)localObject2).contains(serviceInfo.packageName))
            {
              localObject5 = serviceInfo;
              localObject5 = new ComponentName(packageName, name);
              if (serviceInfo.permission != null)
              {
                localObject3 = new StringBuilder();
                ((StringBuilder)localObject3).append("Permission present on component ");
                ((StringBuilder)localObject3).append(localObject5);
                ((StringBuilder)localObject3).append(", not adding listener record.");
                Log.w("NotifManCompat", ((StringBuilder)localObject3).toString());
              }
              else
              {
                ((HashSet)localObject1).add(localObject5);
              }
            }
          }
          localObject2 = ((HashSet)localObject1).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject3 = (ComponentName)((Iterator)localObject2).next();
            if (!c.containsKey(localObject3))
            {
              if (Log.isLoggable("NotifManCompat", 3))
              {
                localObject4 = new StringBuilder();
                ((StringBuilder)localObject4).append("Adding listener record for ");
                ((StringBuilder)localObject4).append(localObject3);
                Log.d("NotifManCompat", ((StringBuilder)localObject4).toString());
              }
              c.put(localObject3, new a((ComponentName)localObject3));
            }
          }
          localObject2 = c.entrySet().iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject4 = (Map.Entry)((Iterator)localObject2).next();
            if (!((HashSet)localObject1).contains(((Map.Entry)localObject4).getKey()))
            {
              if (Log.isLoggable("NotifManCompat", 3))
              {
                localObject3 = f.l("Removing listener record for ");
                ((StringBuilder)localObject3).append(((Map.Entry)localObject4).getKey());
                Log.d("NotifManCompat", ((StringBuilder)localObject3).toString());
              }
              localObject4 = (a)((Map.Entry)localObject4).getValue();
              if (b)
              {
                a.unbindService(this);
                b = false;
              }
              c = null;
              ((Iterator)localObject2).remove();
            }
          }
        }
        localObject1 = c.values().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (a)((Iterator)localObject1).next();
          d.add(paramMessage);
          a((a)localObject2);
        }
        return true;
      }
      finally {}
    }
    
    public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      if (Log.isLoggable("NotifManCompat", 3))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Connected to service ");
        localStringBuilder.append(paramComponentName);
        Log.d("NotifManCompat", localStringBuilder.toString());
      }
      b.obtainMessage(1, new u.d(paramComponentName, paramIBinder)).sendToTarget();
    }
    
    public final void onServiceDisconnected(ComponentName paramComponentName)
    {
      if (Log.isLoggable("NotifManCompat", 3))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Disconnected from service ");
        localStringBuilder.append(paramComponentName);
        Log.d("NotifManCompat", localStringBuilder.toString());
      }
      b.obtainMessage(2, paramComponentName).sendToTarget();
    }
    
    public static final class a
    {
      public final ComponentName a;
      public boolean b = false;
      public INotificationSideChannel c;
      public ArrayDeque<u.f> d = new ArrayDeque();
      public int e = 0;
      
      public a(ComponentName paramComponentName)
      {
        a = paramComponentName;
      }
    }
  }
  
  public static abstract interface f
  {
    public abstract void a(INotificationSideChannel paramINotificationSideChannel);
  }
}

/* Location:
 * Qualified Name:     u.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */