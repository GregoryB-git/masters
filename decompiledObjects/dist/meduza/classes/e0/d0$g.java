package e0;

import android.support.v4.media.session.b;
import android.view.View;
import android.view.View.OnUnhandledKeyEventListener;
import d2.k;
import java.util.Objects;
import r.h;

public final class d0$g
{
  public static void a(View paramView, d0.l paraml)
  {
    Object localObject1 = (h)paramView.getTag(2131362043);
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new h();
      paramView.setTag(2131362043, localObject2);
    }
    Objects.requireNonNull(paraml);
    localObject1 = new e0(paraml);
    ((h)localObject2).put(paraml, localObject1);
    com.google.android.recaptcha.internal.a.m(paramView, (e0)localObject1);
  }
  
  public static CharSequence b(View paramView)
  {
    return k.e(paramView);
  }
  
  public static boolean c(View paramView)
  {
    return k.m(paramView);
  }
  
  public static boolean d(View paramView)
  {
    return k.k(paramView);
  }
  
  public static void e(View paramView, d0.l paraml)
  {
    h localh = (h)paramView.getTag(2131362043);
    if (localh == null) {
      return;
    }
    paraml = (View.OnUnhandledKeyEventListener)localh.getOrDefault(paraml, null);
    if (paraml != null) {
      k.j(paramView, paraml);
    }
  }
  
  public static <T> T f(View paramView, int paramInt)
  {
    return com.google.android.recaptcha.internal.a.i(paramInt, paramView);
  }
  
  public static void g(View paramView, boolean paramBoolean)
  {
    b.r(paramView, paramBoolean);
  }
  
  public static void h(View paramView, CharSequence paramCharSequence)
  {
    com.google.android.recaptcha.internal.a.n(paramView, paramCharSequence);
  }
  
  public static void i(View paramView, g0.a parama)
  {
    b.i(paramView);
  }
  
  public static void j(View paramView, boolean paramBoolean)
  {
    b.j(paramView, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     e0.d0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */