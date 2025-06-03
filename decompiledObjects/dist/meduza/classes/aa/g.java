package aa;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import f;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m6.j;
import u.o;

public final class g
{
  public final ExecutorService a;
  public final Context b;
  public final s c;
  
  public g(Context paramContext, s params, ExecutorService paramExecutorService)
  {
    a = paramExecutorService;
    b = paramContext;
    c = params;
  }
  
  public final boolean a()
  {
    if (c.a("gcm.n.noui")) {
      return true;
    }
    Object localObject1;
    if (!((KeyguardManager)b.getSystemService("keyguard")).inKeyguardRestrictedInputMode())
    {
      i = Process.myPid();
      localObject1 = ((ActivityManager)b.getSystemService("activity")).getRunningAppProcesses();
      if (localObject1 != null)
      {
        localObject2 = ((List)localObject1).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject2).next();
          if (pid == i) {
            if (importance == 100)
            {
              i = 1;
              break label109;
            }
          }
        }
      }
    }
    int i = 0;
    label109:
    if (i != 0) {
      return false;
    }
    Object localObject2 = c.j("gcm.n.image");
    StringBuilder localStringBuilder1;
    if (!TextUtils.isEmpty((CharSequence)localObject2)) {
      try
      {
        localObject1 = new java/net/URL;
        ((URL)localObject1).<init>((String)localObject2);
        localObject1 = new p((URL)localObject1);
      }
      catch (MalformedURLException localMalformedURLException)
      {
        localStringBuilder1 = new StringBuilder();
        localStringBuilder1.append("Not downloading image, bad URL: ");
        localStringBuilder1.append((String)localObject2);
        Log.w("FirebaseMessaging", localStringBuilder1.toString());
      }
    } else {
      localStringBuilder1 = null;
    }
    if (localStringBuilder1 != null)
    {
      localObject2 = a;
      localObject3 = new TaskCompletionSource();
      b = ((ExecutorService)localObject2).submit(new g.q(23, localStringBuilder1, localObject3));
      c = ((TaskCompletionSource)localObject3).getTask();
    }
    Object localObject3 = e.a(b, c);
    u.q localq = a;
    if (localStringBuilder1 != null) {
      try
      {
        localObject2 = c;
        j.i(localObject2);
        Bitmap localBitmap = (Bitmap)Tasks.await((Task)localObject2, 5L, TimeUnit.SECONDS);
        localq.e(localBitmap);
        o localo = new u/o;
        localo.<init>();
        if (localBitmap == null)
        {
          localObject2 = null;
        }
        else
        {
          localObject2 = new androidx/core/graphics/drawable/IconCompat;
          ((IconCompat)localObject2).<init>(1);
          b = localBitmap;
        }
        b = ((IconCompat)localObject2);
        c = null;
        d = true;
        localq.g(localo);
      }
      catch (TimeoutException localTimeoutException)
      {
        Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
        localStringBuilder1.close();
      }
      catch (InterruptedException localInterruptedException)
      {
        Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
        localStringBuilder1.close();
        Thread.currentThread().interrupt();
      }
      catch (ExecutionException localExecutionException)
      {
        StringBuilder localStringBuilder2 = f.l("Failed to download image: ");
        localStringBuilder2.append(localExecutionException.getCause());
        Log.w("FirebaseMessaging", localStringBuilder2.toString());
      }
    }
    if (Log.isLoggable("FirebaseMessaging", 3)) {
      Log.d("FirebaseMessaging", "Showing notification");
    }
    ((NotificationManager)b.getSystemService("notification")).notify(b, 0, a.a());
    return true;
  }
}

/* Location:
 * Qualified Name:     aa.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */