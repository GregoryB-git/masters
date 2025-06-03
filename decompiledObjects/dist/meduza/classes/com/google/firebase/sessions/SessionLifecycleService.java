package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import ea.a0;
import ea.e0;
import ea.v;
import ea.x;
import ec.i;
import ga.h;
import ga.j;
import java.util.ArrayList;
import java.util.Iterator;
import mc.a;
import mc.c;

public final class SessionLifecycleService
  extends Service
{
  public final HandlerThread a = new HandlerThread("FirebaseSessions_HandlerThread");
  public a b;
  public Messenger c;
  
  public final IBinder onBind(Intent paramIntent)
  {
    Object localObject1 = null;
    if (paramIntent == null)
    {
      Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
      paramIntent = (Intent)localObject1;
    }
    else
    {
      Object localObject2 = f.l("Service bound to new client on process ");
      ((StringBuilder)localObject2).append(paramIntent.getAction());
      Log.d("SessionLifecycleService", ((StringBuilder)localObject2).toString());
      if (Build.VERSION.SDK_INT >= 33) {
        paramIntent = paramIntent.getParcelableExtra("ClientCallbackMessenger", Messenger.class);
      } else {
        paramIntent = paramIntent.getParcelableExtra("ClientCallbackMessenger");
      }
      localObject2 = (Messenger)paramIntent;
      if (localObject2 != null)
      {
        paramIntent = Message.obtain(null, 4, 0, 0);
        replyTo = ((Messenger)localObject2);
        localObject2 = b;
        if (localObject2 != null) {
          ((Handler)localObject2).sendMessage(paramIntent);
        }
      }
      localObject2 = c;
      paramIntent = (Intent)localObject1;
      if (localObject2 != null) {
        paramIntent = ((Messenger)localObject2).getBinder();
      }
    }
    return paramIntent;
  }
  
  public final void onCreate()
  {
    super.onCreate();
    a.start();
    Looper localLooper = a.getLooper();
    i.d(localLooper, "handlerThread.looper");
    b = new a(localLooper);
    c = new Messenger(b);
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    a.quit();
  }
  
  public static final class a
    extends Handler
  {
    public boolean a;
    public long b;
    public final ArrayList<Messenger> c = new ArrayList();
    
    public a(Looper paramLooper)
    {
      super();
    }
    
    public final void a(Messenger paramMessenger)
    {
      Object localObject;
      if (a)
      {
        localObject = u7.f.e().c(e0.class);
        i.d(localObject, "Firebase.app[SessionGenerator::class.java]");
        localObject = e;
        if (localObject != null)
        {
          localObject = a;
        }
        else
        {
          i.i("currentSession");
          throw null;
        }
      }
      else
      {
        localObject = u7.f.e().c(v.class);
        i.d(localObject, "Firebase.app[SessionDatastore::class.java]");
        localObject = ((v)localObject).a();
        Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session.");
        if (localObject == null) {
          return;
        }
      }
      b(paramMessenger, (String)localObject);
    }
    
    public final void b(Messenger paramMessenger, String paramString)
    {
      try
      {
        localObject = new android/os/Bundle;
        ((Bundle)localObject).<init>();
        ((BaseBundle)localObject).putString("SessionUpdateExtra", paramString);
        paramString = Message.obtain(null, 3, 0, 0);
        paramString.setData((Bundle)localObject);
        paramMessenger.send(paramString);
      }
      catch (Exception paramString)
      {
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Unable to push new session to ");
        ((StringBuilder)localObject).append(paramMessenger);
        ((StringBuilder)localObject).append('.');
        Log.w("SessionLifecycleService", ((StringBuilder)localObject).toString(), paramString);
      }
      catch (DeadObjectException paramString)
      {
        paramString = new StringBuilder();
        paramString.append("Removing dead client from list: ");
        paramString.append(paramMessenger);
        Log.d("SessionLifecycleService", paramString.toString());
        c.remove(paramMessenger);
      }
    }
    
    public final void handleMessage(Message paramMessage)
    {
      i.e(paramMessage, "msg");
      Object localObject1;
      if (b > paramMessage.getWhen())
      {
        localObject1 = f.l("Ignoring old message from ");
        ((StringBuilder)localObject1).append(paramMessage.getWhen());
        ((StringBuilder)localObject1).append(" which is older than ");
        ((StringBuilder)localObject1).append(b);
        ((StringBuilder)localObject1).append('.');
        Log.d("SessionLifecycleService", ((StringBuilder)localObject1).toString());
        return;
      }
      int i = what;
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 4)
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("Received unexpected event from the SessionLifecycleClient: ");
            ((StringBuilder)localObject1).append(paramMessage);
            Log.w("SessionLifecycleService", ((StringBuilder)localObject1).toString());
            super.handleMessage(paramMessage);
          }
          else
          {
            c.add(replyTo);
            localObject1 = replyTo;
            i.d(localObject1, "msg.replyTo");
            a((Messenger)localObject1);
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("Client ");
            ((StringBuilder)localObject1).append(replyTo);
            ((StringBuilder)localObject1).append(" bound at ");
            ((StringBuilder)localObject1).append(paramMessage.getWhen());
            ((StringBuilder)localObject1).append(". Clients: ");
            ((StringBuilder)localObject1).append(c.size());
            Log.d("SessionLifecycleService", ((StringBuilder)localObject1).toString());
          }
        }
        else
        {
          localObject1 = f.l("Activity backgrounding at ");
          ((StringBuilder)localObject1).append(paramMessage.getWhen());
          Log.d("SessionLifecycleService", ((StringBuilder)localObject1).toString());
          b = paramMessage.getWhen();
        }
      }
      else
      {
        localObject1 = f.l("Activity foregrounding at ");
        ((StringBuilder)localObject1).append(paramMessage.getWhen());
        ((StringBuilder)localObject1).append('.');
        Log.d("SessionLifecycleService", ((StringBuilder)localObject1).toString());
        if (!a)
        {
          Log.d("SessionLifecycleService", "Cold start detected.");
          a = true;
        }
        else
        {
          long l1 = paramMessage.getWhen();
          long l2 = b;
          h.c.getClass();
          localObject1 = u7.f.e().c(h.class);
          i.d(localObject1, "Firebase.app[SessionsSettings::class.java]");
          localObject2 = (h)localObject1;
          localObject1 = a.b();
          int j = 0;
          long l3;
          if (localObject1 != null)
          {
            l3 = a;
            i = a.d;
            if (l3 > 0L) {
              i = 1;
            } else {
              i = 0;
            }
            if ((i != 0) && ((a.f(l3) ^ true))) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {}
          }
          else
          {
            localObject1 = b.b();
            if (localObject1 != null)
            {
              l3 = a;
              i = a.d;
              if (l3 > 0L) {
                i = 1;
              } else {
                i = 0;
              }
              if ((i != 0) && ((a.f(l3) ^ true))) {
                i = 1;
              } else {
                i = 0;
              }
              if (i != 0) {}
            }
            else
            {
              i = a.d;
              l3 = p2.m0.c0(30, c.e);
            }
          }
          if (((int)l3 & 0x1) == 1) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && ((a.f(l3) ^ true))) {
            l3 >>= 1;
          } else {
            l3 = a.g(l3, c.c);
          }
          i = j;
          if (l1 - l2 > l3) {
            i = 1;
          }
          if (i == 0) {
            break label884;
          }
          Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
        }
        localObject1 = u7.f.e().c(e0.class);
        i.d(localObject1, "Firebase.app[SessionGenerator::class.java]");
        Object localObject2 = (e0)localObject1;
        i = d + 1;
        d = i;
        if (i == 0) {
          localObject1 = c;
        } else {
          localObject1 = ((e0)localObject2).a();
        }
        e = new x((String)localObject1, c, d, a.e());
        Log.d("SessionLifecycleService", "Generated new session.");
        Log.d("SessionLifecycleService", "Broadcasting new session");
        localObject1 = u7.f.e().c(a0.class);
        i.d(localObject1, "Firebase.app[SessionFirelogPublisher::class.java]");
        localObject1 = (a0)localObject1;
        localObject2 = u7.f.e().c(e0.class);
        i.d(localObject2, "Firebase.app[SessionGenerator::class.java]");
        localObject2 = e;
        if (localObject2 != null)
        {
          ((a0)localObject1).a((x)localObject2);
          localObject2 = new ArrayList(c).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject1 = (Messenger)((Iterator)localObject2).next();
            i.d(localObject1, "it");
            a((Messenger)localObject1);
          }
          localObject1 = u7.f.e().c(v.class);
          i.d(localObject1, "Firebase.app[SessionDatastore::class.java]");
          localObject1 = (v)localObject1;
          localObject2 = u7.f.e().c(e0.class);
          i.d(localObject2, "Firebase.app[SessionGenerator::class.java]");
          localObject2 = e;
          if (localObject2 != null)
          {
            ((v)localObject1).b(a);
          }
          else
          {
            i.i("currentSession");
            throw null;
          }
        }
        else
        {
          i.i("currentSession");
          throw null;
        }
        label884:
        b = paramMessage.getWhen();
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.sessions.SessionLifecycleService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */