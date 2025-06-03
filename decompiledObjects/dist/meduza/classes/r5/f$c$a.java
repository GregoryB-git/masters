package r5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.Display.Mode;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;
import o7.t;
import v5.e0;
import v5.m;
import z4.j0;

public final class f$c$a
  extends m.a
{
  public boolean A;
  public boolean B;
  public boolean C;
  public boolean D;
  public boolean E;
  public boolean F;
  public boolean G;
  public boolean H;
  public boolean I;
  public boolean J;
  public boolean K;
  public boolean L;
  public boolean M;
  public final SparseArray<Map<j0, f.e>> N;
  public final SparseBooleanArray O;
  
  @Deprecated
  public f$c$a()
  {
    N = new SparseArray();
    O = new SparseBooleanArray();
    c();
  }
  
  public f$c$a(Context paramContext)
  {
    d(paramContext);
    e(paramContext);
    N = new SparseArray();
    O = new SparseBooleanArray();
    c();
  }
  
  public final m.a b(int paramInt1, int paramInt2)
  {
    super.b(paramInt1, paramInt2);
    return this;
  }
  
  public final void c()
  {
    A = true;
    B = false;
    C = true;
    D = false;
    E = true;
    F = false;
    G = false;
    H = false;
    I = false;
    J = true;
    K = true;
    L = false;
    M = true;
  }
  
  public final void d(Context paramContext)
  {
    int i = e0.a;
    if ((i >= 19) && ((i >= 23) || (Looper.myLooper() != null)))
    {
      paramContext = (CaptioningManager)paramContext.getSystemService("captioning");
      if ((paramContext != null) && (paramContext.isEnabled()))
      {
        t = 1088;
        paramContext = paramContext.getLocale();
        if (paramContext != null)
        {
          if (i >= 21) {
            paramContext = paramContext.toLanguageTag();
          } else {
            paramContext = paramContext.toString();
          }
          s = t.t(paramContext);
        }
      }
    }
  }
  
  public final void e(Context paramContext)
  {
    int i = e0.a;
    Object localObject1 = null;
    if (i >= 17)
    {
      localObject2 = (DisplayManager)paramContext.getSystemService("display");
      if (localObject2 != null)
      {
        localObject2 = ((DisplayManager)localObject2).getDisplay(0);
        break label42;
      }
    }
    Object localObject2 = null;
    label42:
    Object localObject3 = localObject2;
    if (localObject2 == null)
    {
      localObject2 = (WindowManager)paramContext.getSystemService("window");
      localObject2.getClass();
      localObject3 = ((WindowManager)localObject2).getDefaultDisplay();
    }
    if ((((Display)localObject3).getDisplayId() == 0) && (e0.H(paramContext)))
    {
      if (i < 28) {
        localObject2 = "sys.display-size";
      } else {
        localObject2 = "vendor.display-size";
      }
      try
      {
        Object localObject4 = Class.forName("android.os.SystemProperties");
        localObject4 = (String)((Class)localObject4).getMethod("get", new Class[] { String.class }).invoke(localObject4, new Object[] { localObject2 });
        localObject2 = localObject4;
      }
      catch (Exception localException)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Failed to read system property ");
        localStringBuilder.append((String)localObject2);
        m.d("Util", localStringBuilder.toString(), localException);
        localObject2 = localObject1;
      }
      if (TextUtils.isEmpty((CharSequence)localObject2)) {}
    }
    try
    {
      localObject1 = ((String)localObject2).trim().split("x", -1);
      if (localObject1.length == 2)
      {
        int j = Integer.parseInt(localObject1[0]);
        i = Integer.parseInt(localObject1[1]);
        if ((j > 0) && (i > 0))
        {
          localObject1 = new android/graphics/Point;
          ((Point)localObject1).<init>(j, i);
          paramContext = (Context)localObject1;
        }
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;) {}
    }
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Invalid display size: ");
    ((StringBuilder)localObject1).append((String)localObject2);
    m.c("Util", ((StringBuilder)localObject1).toString());
    if (("Sony".equals(e0.c)) && (e0.d.startsWith("BRAVIA")) && (paramContext.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")))
    {
      paramContext = new Point(3840, 2160);
    }
    else
    {
      paramContext = new Point();
      i = e0.a;
      if (i >= 23)
      {
        localObject2 = ((Display)localObject3).getMode();
        x = ((Display.Mode)localObject2).getPhysicalWidth();
        y = ((Display.Mode)localObject2).getPhysicalHeight();
      }
      else if (i >= 17)
      {
        ((Display)localObject3).getRealSize(paramContext);
      }
      else
      {
        ((Display)localObject3).getSize(paramContext);
      }
    }
    b(x, y);
  }
}

/* Location:
 * Qualified Name:     r5.f.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */