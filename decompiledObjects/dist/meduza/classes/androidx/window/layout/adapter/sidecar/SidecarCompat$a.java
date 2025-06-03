package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import f2.i.a;

public final class SidecarCompat$a
{
  public static IBinder a(Activity paramActivity)
  {
    if (paramActivity != null)
    {
      paramActivity = paramActivity.getWindow();
      if (paramActivity != null)
      {
        paramActivity = paramActivity.getAttributes();
        if (paramActivity != null) {
          return token;
        }
      }
    }
    paramActivity = null;
    return paramActivity;
  }
  
  public static SidecarInterface b(Context paramContext)
  {
    ec.i.e(paramContext, "context");
    return SidecarProvider.getSidecarImpl(paramContext.getApplicationContext());
  }
  
  public static f2.i c()
  {
    try
    {
      localObject = SidecarProvider.getApiVersion();
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        f2.i locali = f2.i.f;
        localObject = i.a.a((String)localObject);
      }
    }
    catch (NoClassDefFoundError|UnsupportedOperationException localNoClassDefFoundError)
    {
      Object localObject;
      for (;;) {}
    }
    localObject = null;
    return (f2.i)localObject;
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.adapter.sidecar.SidecarCompat.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */