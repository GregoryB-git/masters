package x;

import E.f;
import H.c;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.Executor;
import w.k;

public abstract class a
{
  public static final Object a = new Object();
  public static final Object b = new Object();
  
  public static int a(Context paramContext, String paramString)
  {
    c.d(paramString, "permission must be non-null");
    if ((!E.b.c()) && (TextUtils.equals("android.permission.POST_NOTIFICATIONS", paramString)))
    {
      int i;
      if (k.b(paramContext).a()) {
        i = 0;
      } else {
        i = -1;
      }
      return i;
    }
    return paramContext.checkPermission(paramString, Process.myPid(), Process.myUid());
  }
  
  public static Context b(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return d.a(paramContext);
    }
    return null;
  }
  
  public static int c(Context paramContext, int paramInt)
  {
    return c.a(paramContext, paramInt);
  }
  
  public static Drawable d(Context paramContext, int paramInt)
  {
    return b.b(paramContext, paramInt);
  }
  
  public static Executor e(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return f.a(paramContext);
    }
    return f.a(new Handler(paramContext.getMainLooper()));
  }
  
  public static File f(Context paramContext)
  {
    return b.c(paramContext);
  }
  
  public static String g(Context paramContext)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramContext.getPackageName());
    ((StringBuilder)localObject).append(".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
    localObject = ((StringBuilder)localObject).toString();
    if (b.b(paramContext, (String)localObject) == 0) {
      return (String)localObject;
    }
    paramContext = new StringBuilder();
    paramContext.append("Permission ");
    paramContext.append((String)localObject);
    paramContext.append(" is required by your application to receive broadcasts, please add it to your manifest");
    throw new RuntimeException(paramContext.toString());
  }
  
  public static Intent h(Context paramContext, BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter, int paramInt)
  {
    return i(paramContext, paramBroadcastReceiver, paramIntentFilter, null, null, paramInt);
  }
  
  public static Intent i(Context paramContext, BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter, String paramString, Handler paramHandler, int paramInt)
  {
    int i = paramInt & 0x1;
    if ((i != 0) && ((paramInt & 0x4) != 0)) {
      throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
    }
    int j = paramInt;
    if (i != 0) {
      j = paramInt | 0x2;
    }
    paramInt = j & 0x2;
    if ((paramInt == 0) && ((j & 0x4) == 0)) {
      throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
    }
    if ((paramInt != 0) && ((j & 0x4) != 0)) {
      throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
    }
    if (E.b.c()) {
      return g.a(paramContext, paramBroadcastReceiver, paramIntentFilter, paramString, paramHandler, j);
    }
    if (Build.VERSION.SDK_INT >= 26) {
      return e.a(paramContext, paramBroadcastReceiver, paramIntentFilter, paramString, paramHandler, j);
    }
    if (((j & 0x4) != 0) && (paramString == null)) {
      return paramContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter, g(paramContext), paramHandler);
    }
    return paramContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter, paramString, paramHandler);
  }
  
  public static void j(Context paramContext, Intent paramIntent, Bundle paramBundle)
  {
    a.b(paramContext, paramIntent, paramBundle);
  }
  
  public static void k(Context paramContext, Intent paramIntent)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      e.b(paramContext, paramIntent);
    } else {
      paramContext.startService(paramIntent);
    }
  }
  
  public static abstract class a
  {
    public static void a(Context paramContext, Intent[] paramArrayOfIntent, Bundle paramBundle)
    {
      paramContext.startActivities(paramArrayOfIntent, paramBundle);
    }
    
    public static void b(Context paramContext, Intent paramIntent, Bundle paramBundle)
    {
      paramContext.startActivity(paramIntent, paramBundle);
    }
  }
  
  public static abstract class b
  {
    public static File a(Context paramContext)
    {
      return paramContext.getCodeCacheDir();
    }
    
    public static Drawable b(Context paramContext, int paramInt)
    {
      return paramContext.getDrawable(paramInt);
    }
    
    public static File c(Context paramContext)
    {
      return paramContext.getNoBackupFilesDir();
    }
  }
  
  public static abstract class c
  {
    public static int a(Context paramContext, int paramInt)
    {
      return paramContext.getColor(paramInt);
    }
    
    public static <T> T b(Context paramContext, Class<T> paramClass)
    {
      return (T)paramContext.getSystemService(paramClass);
    }
    
    public static String c(Context paramContext, Class<?> paramClass)
    {
      return paramContext.getSystemServiceName(paramClass);
    }
  }
  
  public static abstract class d
  {
    public static Context a(Context paramContext)
    {
      return paramContext.createDeviceProtectedStorageContext();
    }
    
    public static File b(Context paramContext)
    {
      return paramContext.getDataDir();
    }
    
    public static boolean c(Context paramContext)
    {
      return paramContext.isDeviceProtectedStorage();
    }
  }
  
  public static abstract class e
  {
    public static Intent a(Context paramContext, BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter, String paramString, Handler paramHandler, int paramInt)
    {
      if (((paramInt & 0x4) != 0) && (paramString == null)) {
        return paramContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter, a.g(paramContext), paramHandler);
      }
      return paramContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter, paramString, paramHandler, paramInt & 0x1);
    }
    
    public static ComponentName b(Context paramContext, Intent paramIntent)
    {
      return paramContext.startForegroundService(paramIntent);
    }
  }
  
  public static abstract class f
  {
    public static Executor a(Context paramContext)
    {
      return paramContext.getMainExecutor();
    }
  }
  
  public static abstract class g
  {
    public static Intent a(Context paramContext, BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter, String paramString, Handler paramHandler, int paramInt)
    {
      return paramContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter, paramString, paramHandler, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     x.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */