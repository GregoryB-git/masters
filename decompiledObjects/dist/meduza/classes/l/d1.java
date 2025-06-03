package l;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;

public final class d1
{
  public final Context a;
  public final View b;
  public final TextView c;
  public final WindowManager.LayoutParams d;
  public final Rect e;
  public final int[] f;
  public final int[] g;
  
  public d1(Context paramContext)
  {
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams();
    d = localLayoutParams;
    e = new Rect();
    f = new int[2];
    g = new int[2];
    a = paramContext;
    View localView = LayoutInflater.from(paramContext).inflate(2131558427, null);
    b = localView;
    c = ((TextView)localView.findViewById(2131361978));
    localLayoutParams.setTitle(d1.class.getSimpleName());
    packageName = paramContext.getPackageName();
    type = 1002;
    width = -2;
    height = -2;
    format = -3;
    windowAnimations = 2131951620;
    flags = 24;
  }
}

/* Location:
 * Qualified Name:     l.d1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */