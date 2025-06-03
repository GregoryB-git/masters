package x0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public final class e$b
  extends e.f
{
  public final boolean b;
  public boolean c;
  public n d;
  
  public e$b(r0.c paramc, boolean paramBoolean)
  {
    super(paramc);
    b = paramBoolean;
  }
  
  public final n b(Context paramContext)
  {
    Object localObject1;
    Object localObject2;
    boolean bool1;
    int m;
    if (c)
    {
      paramContext = d;
    }
    else
    {
      localObject1 = a;
      localObject2 = c;
      i = a;
      j = 0;
      if (i == 2) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      boolean bool2 = b;
      int k = ((i)localObject2).getNextTransition();
      if (bool2)
      {
        if (bool1) {
          i = ((i)localObject2).getPopEnterAnim();
        } else {
          i = ((i)localObject2).getPopExitAnim();
        }
      }
      else if (bool1) {
        i = ((i)localObject2).getEnterAnim();
      } else {
        i = ((i)localObject2).getExitAnim();
      }
      ((i)localObject2).setAnimations(0, 0, 0, 0);
      localObject1 = mContainer;
      if ((localObject1 != null) && (((View)localObject1).getTag(2131362066) != null)) {
        mContainer.setTag(2131362066, null);
      }
      localObject1 = mContainer;
      if ((localObject1 == null) || (((ViewGroup)localObject1).getLayoutTransition() == null))
      {
        localObject1 = ((i)localObject2).onCreateAnimation(k, bool1, i);
        if (localObject1 != null)
        {
          paramContext = new n((Animation)localObject1);
          break label532;
        }
        localObject2 = ((i)localObject2).onCreateAnimator(k, bool1, i);
        if (localObject2 != null)
        {
          paramContext = new n((Animator)localObject2);
          break label532;
        }
        m = i;
        if (i == 0)
        {
          m = i;
          if (k != 0)
          {
            m = -1;
            if (k != 4097)
            {
              if (k != 8194)
              {
                if (k != 8197)
                {
                  if (k != 4099)
                  {
                    if (k != 4100) {
                      break label405;
                    }
                    if (bool1) {
                      i = 16842936;
                    } else {
                      i = 16842937;
                    }
                  }
                  else
                  {
                    if (bool1)
                    {
                      i = 2130837506;
                      break label401;
                    }
                    i = 2130837507;
                    break label401;
                  }
                }
                else if (bool1) {
                  i = 16842938;
                } else {
                  i = 16842939;
                }
                localObject2 = paramContext.obtainStyledAttributes(16973825, new int[] { i });
                m = ((TypedArray)localObject2).getResourceId(0, -1);
                ((TypedArray)localObject2).recycle();
                break label405;
              }
              else if (bool1)
              {
                i = 2130837504;
              }
              else
              {
                i = 2130837505;
              }
            }
            else if (bool1) {
              i = 2130837508;
            } else {
              i = 2130837509;
            }
            label401:
            m = i;
          }
        }
        label405:
        if (m != 0)
        {
          bool1 = "anim".equals(paramContext.getResources().getResourceTypeName(m));
          i = j;
          if (!bool1) {}
        }
      }
    }
    try
    {
      try
      {
        localObject1 = AnimationUtils.loadAnimation(paramContext, m);
        if (localObject1 != null)
        {
          localObject2 = new x0/n;
          ((n)localObject2).<init>((Animation)localObject1);
          paramContext = (Context)localObject2;
          break label532;
        }
        i = 1;
      }
      catch (Resources.NotFoundException paramContext)
      {
        throw paramContext;
      }
    }
    catch (RuntimeException localRuntimeException2)
    {
      for (;;)
      {
        label532:
        i = j;
      }
    }
    if (i == 0) {
      try
      {
        localObject1 = AnimatorInflater.loadAnimator(paramContext, m);
        if (localObject1 != null)
        {
          localObject2 = new x0/n;
          ((n)localObject2).<init>((Animator)localObject1);
          paramContext = (Context)localObject2;
        }
      }
      catch (RuntimeException localRuntimeException1)
      {
        if (!bool1)
        {
          paramContext = AnimationUtils.loadAnimation(paramContext, m);
          if (paramContext != null)
          {
            paramContext = new n(paramContext);
            break label532;
          }
        }
        else
        {
          throw localRuntimeException1;
        }
      }
    }
    paramContext = null;
    d = paramContext;
    c = true;
    return paramContext;
  }
}

/* Location:
 * Qualified Name:     x0.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */