package e0;

import a4.r;
import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

public final class d0$j
{
  public static String[] a(View paramView)
  {
    return r.k(paramView);
  }
  
  public static c b(View paramView, c paramc)
  {
    ContentInfo localContentInfo = a.b();
    Objects.requireNonNull(localContentInfo);
    paramView = h0.e(paramView, localContentInfo);
    if (paramView == null) {
      return null;
    }
    if (paramView == localContentInfo) {
      return paramc;
    }
    return new c(new c.d(paramView));
  }
  
  public static void c(View paramView, String[] paramArrayOfString, u paramu)
  {
    if (paramu == null) {
      i0.e(paramView, paramArrayOfString);
    } else {
      h0.i(paramView, paramArrayOfString, new d0.k(paramu));
    }
  }
}

/* Location:
 * Qualified Name:     e0.d0.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */