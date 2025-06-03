package androidx.profileinstaller;

import a0.d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Process;
import android.util.Log;
import java.io.File;
import m1.b;
import p.s;

public class ProfileInstallReceiver
  extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null) {
      return;
    }
    Object localObject1 = paramIntent.getAction();
    if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(localObject1))
    {
      c.b(paramContext, new b(2), new a(), true);
    }
    else if ("androidx.profileinstaller.action.SKIP_FILE".equals(localObject1))
    {
      paramIntent = paramIntent.getExtras();
      if (paramIntent != null)
      {
        paramIntent = paramIntent.getString("EXTRA_SKIP_FILE_OPERATION");
        if ("WRITE_SKIP_FILE".equals(paramIntent))
        {
          localObject1 = new m.a(3);
          paramIntent = new a();
          String str = paramContext.getApplicationContext().getPackageName();
          Object localObject2 = paramContext.getPackageManager();
          try
          {
            localObject2 = ((PackageManager)localObject2).getPackageInfo(str, 0);
            c.a((PackageInfo)localObject2, paramContext.getFilesDir());
            ((m.a)localObject1).execute(new s(paramIntent, 10, null, 1));
          }
          catch (PackageManager.NameNotFoundException paramContext)
          {
            ((m.a)localObject1).execute(new s(paramIntent, 7, paramContext, 1));
          }
        }
        else if ("DELETE_SKIP_FILE".equals(paramIntent))
        {
          paramIntent = new a();
          new File(paramContext.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
          new s(paramIntent, 11, null, 1).run();
        }
      }
    }
    else
    {
      int i;
      if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(localObject1))
      {
        if (Build.VERSION.SDK_INT >= 24)
        {
          Process.sendSignal(Process.myPid(), 10);
          i = 12;
        }
        else
        {
          i = 13;
        }
        c.b.b(i, null);
        setResultCode(i);
      }
      else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(localObject1))
      {
        paramIntent = paramIntent.getExtras();
        if (paramIntent != null) {
          if ("DROP_SHADER_CACHE".equals(paramIntent.getString("EXTRA_BENCHMARK_OPERATION")))
          {
            if (Build.VERSION.SDK_INT >= 24) {
              paramContext = d.f(paramContext).getCodeCacheDir();
            } else {
              paramContext = paramContext.getCodeCacheDir();
            }
            if (a.a(paramContext)) {
              i = 14;
            } else {
              i = 15;
            }
            c.b.b(i, null);
            setResultCode(i);
          }
          else
          {
            c.b.b(16, null);
            setResultCode(16);
          }
        }
      }
    }
  }
  
  public final class a
    implements c.c
  {
    public a() {}
    
    public final void a()
    {
      Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }
    
    public final void b(int paramInt, Object paramObject)
    {
      c.b.b(paramInt, paramObject);
      setResultCode(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.profileinstaller.ProfileInstallReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */