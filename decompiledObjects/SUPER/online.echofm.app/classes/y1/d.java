package y1;

import G1.g;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import x1.B;

public final class d
{
  public static final d a = new d();
  public static final String b = d.class.getSimpleName();
  public static final ReentrantReadWriteLock c = new ReentrantReadWriteLock();
  public static String d;
  public static volatile boolean e;
  
  public static final String c()
  {
    if (!e)
    {
      Log.w(b, "initStore should have been called before calling setUserID");
      a.d();
    }
    ReentrantReadWriteLock localReentrantReadWriteLock = c;
    localReentrantReadWriteLock.readLock().lock();
    try
    {
      String str = d;
      localReentrantReadWriteLock.readLock().unlock();
      return str;
    }
    finally
    {
      c.readLock().unlock();
    }
  }
  
  public static final void e()
  {
    if (e) {
      return;
    }
    F.b.b().execute(new c());
  }
  
  public static final void f()
  {
    a.d();
  }
  
  public static final void g(String paramString)
  {
    
    if (!e)
    {
      Log.w(b, "initStore should have been called before calling setUserID");
      a.d();
    }
    F.b.b().execute(new b(paramString));
  }
  
  public static final void h(String paramString)
  {
    ReentrantReadWriteLock localReentrantReadWriteLock = c;
    localReentrantReadWriteLock.writeLock().lock();
    try
    {
      d = paramString;
      paramString = PreferenceManager.getDefaultSharedPreferences(B.l()).edit();
      paramString.putString("com.facebook.appevents.AnalyticsUserIDStore.userID", d);
      paramString.apply();
      localReentrantReadWriteLock.writeLock().unlock();
      return;
    }
    finally
    {
      c.writeLock().unlock();
    }
  }
  
  public final void d()
  {
    if (e) {
      return;
    }
    ReentrantReadWriteLock localReentrantReadWriteLock = c;
    localReentrantReadWriteLock.writeLock().lock();
    try
    {
      boolean bool = e;
      if (bool)
      {
        localReentrantReadWriteLock.writeLock().unlock();
        return;
      }
      d = PreferenceManager.getDefaultSharedPreferences(B.l()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
      e = true;
      localReentrantReadWriteLock.writeLock().unlock();
      return;
    }
    finally
    {
      c.writeLock().unlock();
    }
  }
}

/* Location:
 * Qualified Name:     y1.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */