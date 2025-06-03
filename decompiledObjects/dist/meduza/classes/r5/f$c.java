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
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import o7.t;
import v5.e0;
import z4.j0;

public final class f$c
  extends m
{
  public final boolean j0;
  public final boolean k0;
  public final boolean l0;
  public final boolean m0;
  public final boolean n0;
  public final boolean o0;
  public final boolean p0;
  public final boolean q0;
  public final boolean r0;
  public final boolean s0;
  public final boolean t0;
  public final boolean u0;
  public final boolean v0;
  public final SparseArray<Map<j0, f.e>> w0;
  public final SparseBooleanArray x0;
  
  static
  {
    new c(new a());
    e0.E(1000);
    e0.E(1001);
    e0.E(1002);
    e0.E(1003);
    e0.E(1004);
    e0.E(1005);
    e0.E(1006);
    e0.E(1007);
    e0.E(1008);
    e0.E(1009);
    e0.E(1010);
    e0.E(1011);
    e0.E(1012);
    e0.E(1013);
    e0.E(1014);
    e0.E(1015);
    e0.E(1016);
  }
  
  public f$c(a parama)
  {
    super(parama);
    j0 = A;
    k0 = B;
    l0 = C;
    m0 = D;
    n0 = E;
    o0 = F;
    p0 = G;
    q0 = H;
    r0 = I;
    s0 = J;
    t0 = K;
    u0 = L;
    v0 = M;
    w0 = N;
    x0 = O;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (c.class == paramObject.getClass()))
    {
      Object localObject1 = (c)paramObject;
      if ((super.equals(localObject1)) && (j0 == j0) && (k0 == k0) && (l0 == l0) && (m0 == m0) && (n0 == n0) && (o0 == o0) && (p0 == p0) && (q0 == q0) && (r0 == r0) && (s0 == s0) && (t0 == t0) && (u0 == u0) && (v0 == v0))
      {
        Object localObject2 = x0;
        paramObject = x0;
        int i = ((SparseBooleanArray)localObject2).size();
        int j;
        if (((SparseBooleanArray)paramObject).size() != i)
        {
          j = 0;
        }
        else
        {
          for (j = 0;; j++)
          {
            if (j >= i) {
              break label247;
            }
            if (((SparseBooleanArray)paramObject).indexOfKey(((SparseBooleanArray)localObject2).keyAt(j)) < 0) {
              break;
            }
          }
          label247:
          j = 1;
        }
        if (j != 0)
        {
          paramObject = w0;
          localObject1 = w0;
          int k = ((SparseArray)paramObject).size();
          if (((SparseArray)localObject1).size() != k)
          {
            j = 0;
          }
          else
          {
            for (j = 0;; j++)
            {
              if (j >= k) {
                break label464;
              }
              i = ((SparseArray)localObject1).indexOfKey(((SparseArray)paramObject).keyAt(j));
              if (i < 0) {
                break;
              }
              Object localObject3 = (Map)((SparseArray)paramObject).valueAt(j);
              localObject2 = (Map)((SparseArray)localObject1).valueAt(i);
              i = ((Map)localObject3).size();
              if (((Map)localObject2).size() == i)
              {
                Iterator localIterator = ((Map)localObject3).entrySet().iterator();
                j0 localj0;
                do
                {
                  if (!localIterator.hasNext()) {
                    break;
                  }
                  localObject3 = (Map.Entry)localIterator.next();
                  localj0 = (j0)((Map.Entry)localObject3).getKey();
                } while ((((Map)localObject2).containsKey(localj0)) && (e0.a(((Map.Entry)localObject3).getValue(), ((Map)localObject2).get(localj0))));
              }
              i = 0;
              break label450;
              i = 1;
              label450:
              if (i == 0) {
                break;
              }
            }
            label464:
            j = 1;
          }
          if (j != 0) {
            break label477;
          }
        }
      }
      bool = false;
      label477:
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (((((((((((((super.hashCode() + 31) * 31 + j0) * 31 + k0) * 31 + l0) * 31 + m0) * 31 + n0) * 31 + o0) * 31 + p0) * 31 + q0) * 31 + r0) * 31 + s0) * 31 + t0) * 31 + u0) * 31 + v0;
  }
  
  public static final class a
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
    public a()
    {
      N = new SparseArray();
      O = new SparseBooleanArray();
      c();
    }
    
    public a(Context paramContext)
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
          v5.m.d("Util", localStringBuilder.toString(), localException);
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
      v5.m.c("Util", ((StringBuilder)localObject1).toString());
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
}

/* Location:
 * Qualified Name:     r5.f.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */