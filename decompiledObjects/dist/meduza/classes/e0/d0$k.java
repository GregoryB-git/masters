package e0;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

public final class d0$k
  implements OnReceiveContentListener
{
  public final u a;
  
  public d0$k(u paramu)
  {
    a = paramu;
  }
  
  public final ContentInfo onReceiveContent(View paramView, ContentInfo paramContentInfo)
  {
    c localc = new c(new c.d(paramContentInfo));
    paramView = a.a(paramView, localc);
    if (paramView == null) {
      return null;
    }
    if (paramView == localc) {
      return paramContentInfo;
    }
    paramView = a.b();
    Objects.requireNonNull(paramView);
    return paramView;
  }
}

/* Location:
 * Qualified Name:     e0.d0.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */