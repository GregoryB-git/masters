package androidx.core.view;

import android.view.View;
import androidx.annotation.NonNull;

public abstract interface ViewPropertyAnimatorListener
{
  public abstract void onAnimationCancel(@NonNull View paramView);
  
  public abstract void onAnimationEnd(@NonNull View paramView);
  
  public abstract void onAnimationStart(@NonNull View paramView);
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewPropertyAnimatorListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */