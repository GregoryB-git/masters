package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable2.AnimationCallback;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;

public abstract class Animatable2Compat$AnimationCallback
{
  public Animatable2.AnimationCallback mPlatformCallback;
  
  @RequiresApi(23)
  public Animatable2.AnimationCallback getPlatformCallback()
  {
    if (mPlatformCallback == null) {
      mPlatformCallback = new Animatable2.AnimationCallback()
      {
        public void onAnimationEnd(Drawable paramAnonymousDrawable)
        {
          Animatable2Compat.AnimationCallback.this.onAnimationEnd(paramAnonymousDrawable);
        }
        
        public void onAnimationStart(Drawable paramAnonymousDrawable)
        {
          Animatable2Compat.AnimationCallback.this.onAnimationStart(paramAnonymousDrawable);
        }
      };
    }
    return mPlatformCallback;
  }
  
  public void onAnimationEnd(Drawable paramDrawable) {}
  
  public void onAnimationStart(Drawable paramDrawable) {}
}

/* Location:
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */