package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
class AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState
  extends Drawable.ConstantState
{
  private final Drawable.ConstantState mDelegateState;
  
  public AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState(Drawable.ConstantState paramConstantState)
  {
    mDelegateState = paramConstantState;
  }
  
  public boolean canApplyTheme()
  {
    return mDelegateState.canApplyTheme();
  }
  
  public int getChangingConfigurations()
  {
    return mDelegateState.getChangingConfigurations();
  }
  
  public Drawable newDrawable()
  {
    AnimatedVectorDrawableCompat localAnimatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
    Drawable localDrawable = mDelegateState.newDrawable();
    mDelegateDrawable = localDrawable;
    localDrawable.setCallback(mCallback);
    return localAnimatedVectorDrawableCompat;
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    AnimatedVectorDrawableCompat localAnimatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
    paramResources = mDelegateState.newDrawable(paramResources);
    mDelegateDrawable = paramResources;
    paramResources.setCallback(mCallback);
    return localAnimatedVectorDrawableCompat;
  }
  
  public Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
  {
    AnimatedVectorDrawableCompat localAnimatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
    paramResources = mDelegateState.newDrawable(paramResources, paramTheme);
    mDelegateDrawable = paramResources;
    paramResources.setCallback(mCallback);
    return localAnimatedVectorDrawableCompat;
  }
}

/* Location:
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableDelegateState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */