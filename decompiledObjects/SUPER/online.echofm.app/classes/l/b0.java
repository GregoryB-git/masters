package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewManager;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import e.c;
import e.e;
import e.f;
import e.h;

public class b0
{
  public final Context a;
  public final View b;
  public final TextView c;
  public final WindowManager.LayoutParams d;
  public final Rect e;
  public final int[] f;
  public final int[] g;
  
  public b0(Context paramContext)
  {
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams();
    d = localLayoutParams;
    e = new Rect();
    f = new int[2];
    g = new int[2];
    a = paramContext;
    View localView = LayoutInflater.from(paramContext).inflate(f.m, null);
    b = localView;
    c = ((TextView)localView.findViewById(e.m));
    localLayoutParams.setTitle(getClass().getSimpleName());
    packageName = paramContext.getPackageName();
    type = 1002;
    width = -2;
    height = -2;
    format = -3;
    windowAnimations = h.a;
    flags = 24;
  }
  
  public static View b(View paramView)
  {
    View localView = paramView.getRootView();
    ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
    if (((localLayoutParams instanceof WindowManager.LayoutParams)) && (type == 2)) {
      return localView;
    }
    for (paramView = paramView.getContext(); (paramView instanceof ContextWrapper); paramView = ((ContextWrapper)paramView).getBaseContext()) {
      if ((paramView instanceof Activity)) {
        return ((Activity)paramView).getWindow().getDecorView();
      }
    }
    return localView;
  }
  
  public final void a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean, WindowManager.LayoutParams paramLayoutParams)
  {
    token = paramView.getApplicationWindowToken();
    int i = a.getResources().getDimensionPixelOffset(c.h);
    if (paramView.getWidth() < i) {
      paramInt1 = paramView.getWidth() / 2;
    }
    if (paramView.getHeight() >= i)
    {
      j = a.getResources().getDimensionPixelOffset(c.g);
      i = paramInt2 + j;
      j = paramInt2 - j;
      paramInt2 = i;
      i = j;
    }
    else
    {
      paramInt2 = paramView.getHeight();
      i = 0;
    }
    gravity = 49;
    Object localObject1 = a.getResources();
    if (paramBoolean) {
      j = c.j;
    } else {
      j = c.i;
    }
    int k = ((Resources)localObject1).getDimensionPixelOffset(j);
    localObject1 = b(paramView);
    if (localObject1 == null)
    {
      Log.e("TooltipPopup", "Cannot find app view");
      return;
    }
    ((View)localObject1).getWindowVisibleDisplayFrame(e);
    Object localObject2 = e;
    if ((left < 0) && (top < 0))
    {
      localObject2 = a.getResources();
      j = ((Resources)localObject2).getIdentifier("status_bar_height", "dimen", "android");
      if (j != 0) {
        j = ((Resources)localObject2).getDimensionPixelSize(j);
      } else {
        j = 0;
      }
      localObject2 = ((Resources)localObject2).getDisplayMetrics();
      e.set(0, j, widthPixels, heightPixels);
    }
    ((View)localObject1).getLocationOnScreen(g);
    paramView.getLocationOnScreen(f);
    paramView = f;
    int j = paramView[0];
    localObject2 = g;
    j -= localObject2[0];
    paramView[0] = j;
    paramView[1] -= localObject2[1];
    x = (j + paramInt1 - ((View)localObject1).getWidth() / 2);
    paramInt1 = View.MeasureSpec.makeMeasureSpec(0, 0);
    b.measure(paramInt1, paramInt1);
    paramInt1 = b.getMeasuredHeight();
    j = f[1];
    i = i + j - k - paramInt1;
    paramInt2 = j + paramInt2 + k;
    if (paramBoolean) {
      if (i >= 0)
      {
        y = i;
        return;
      }
    }
    for (;;)
    {
      y = paramInt2;
      return;
      if (paramInt1 + paramInt2 > e.height()) {
        break;
      }
    }
  }
  
  public void c()
  {
    if (!d()) {
      return;
    }
    ((WindowManager)a.getSystemService("window")).removeView(b);
  }
  
  public boolean d()
  {
    boolean bool;
    if (b.getParent() != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void e(View paramView, int paramInt1, int paramInt2, boolean paramBoolean, CharSequence paramCharSequence)
  {
    if (d()) {
      c();
    }
    c.setText(paramCharSequence);
    a(paramView, paramInt1, paramInt2, paramBoolean, d);
    ((WindowManager)a.getSystemService("window")).addView(b, d);
  }
}

/* Location:
 * Qualified Name:     l.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */