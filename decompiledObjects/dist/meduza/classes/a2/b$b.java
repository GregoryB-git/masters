package a2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import java.util.ArrayList;
import r.b;

public final class b$b
  extends Drawable.ConstantState
{
  public f a;
  public AnimatorSet b;
  public ArrayList<Animator> c;
  public b<Animator, String> d;
  
  public b$b(b.a parama) {}
  
  public final int getChangingConfigurations()
  {
    return 0;
  }
  
  public final Drawable newDrawable()
  {
    throw new IllegalStateException("No constant state support for SDK < 24.");
  }
  
  public final Drawable newDrawable(Resources paramResources)
  {
    throw new IllegalStateException("No constant state support for SDK < 24.");
  }
}

/* Location:
 * Qualified Name:     a2.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */