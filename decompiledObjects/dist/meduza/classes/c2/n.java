package c2;

import android.webkit.WebSettings;
import b1.v;
import d2.a.c;
import d2.a.e;
import d2.a.h;
import d2.d;
import d2.f;
import d2.h0;
import d2.i0;
import d2.j0.a;
import d2.m;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

public final class n
{
  public static v a(WebSettings paramWebSettings)
  {
    return new v((WebSettingsBoundaryInterface)zc.a.a(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface)ab).convertSettings(paramWebSettings)));
  }
  
  public static void b(WebSettings paramWebSettings, int paramInt)
  {
    a.c localc = i0.c;
    if (localc.c())
    {
      d.o(paramWebSettings, paramInt);
    }
    else
    {
      if (!localc.d()) {
        break label43;
      }
      ((WebSettingsBoundaryInterface)aa).setDisabledActionModeMenuItems(paramInt);
    }
    return;
    label43:
    throw i0.a();
  }
  
  @Deprecated
  public static void c(WebSettings paramWebSettings, int paramInt)
  {
    a.h localh = i0.G;
    if (localh.c())
    {
      m.d(paramWebSettings, paramInt);
    }
    else
    {
      if (!localh.d()) {
        break label43;
      }
      ((WebSettingsBoundaryInterface)aa).setForceDark(paramInt);
    }
    return;
    label43:
    throw i0.a();
  }
  
  public static void d(WebSettings paramWebSettings, boolean paramBoolean)
  {
    a.e locale = i0.b;
    if (locale.c())
    {
      f.e(paramWebSettings, paramBoolean);
    }
    else
    {
      if (!locale.d()) {
        break label43;
      }
      ((WebSettingsBoundaryInterface)aa).setSafeBrowsingEnabled(paramBoolean);
    }
    return;
    label43:
    throw i0.a();
  }
}

/* Location:
 * Qualified Name:     c2.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */