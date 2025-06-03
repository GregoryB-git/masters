package u1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import java.util.ArrayList;
import t.a;
import t.h;

public class b$b
  extends Drawable.ConstantState
{
  public int a;
  public g b;
  public AnimatorSet c;
  public ArrayList d;
  public a e;
  
  public b$b(Context paramContext, b paramb, Drawable.Callback paramCallback, Resources paramResources)
  {
    if (paramb != null)
    {
      a = a;
      paramContext = b;
      int i = 0;
      if (paramContext != null)
      {
        paramContext = paramContext.getConstantState();
        if (paramResources != null) {}
        for (paramContext = paramContext.newDrawable(paramResources);; paramContext = paramContext.newDrawable())
        {
          b = ((g)paramContext);
          break;
        }
        paramContext = (g)b.mutate();
        b = paramContext;
        paramContext.setCallback(paramCallback);
        b.setBounds(b.getBounds());
        b.h(false);
      }
      paramContext = d;
      if (paramContext != null)
      {
        int j = paramContext.size();
        d = new ArrayList(j);
        e = new a(j);
        while (i < j)
        {
          paramCallback = (Animator)d.get(i);
          paramContext = paramCallback.clone();
          paramCallback = (String)e.get(paramCallback);
          paramContext.setTarget(b.d(paramCallback));
          d.add(paramContext);
          e.put(paramContext, paramCallback);
          i++;
        }
        a();
      }
    }
  }
  
  public void a()
  {
    if (c == null) {
      c = new AnimatorSet();
    }
    c.playTogether(d);
  }
  
  public int getChangingConfigurations()
  {
    return a;
  }
  
  public Drawable newDrawable()
  {
    throw new IllegalStateException("No constant state support for SDK < 24.");
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    throw new IllegalStateException("No constant state support for SDK < 24.");
  }
}

/* Location:
 * Qualified Name:     u1.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */