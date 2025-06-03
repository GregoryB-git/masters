package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation.Bounds;
import android.view.WindowInsetsAnimation.Callback;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.Insets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import l4;

@RequiresApi(30)
class WindowInsetsAnimationCompat$Impl30
  extends WindowInsetsAnimationCompat.Impl
{
  @NonNull
  private final WindowInsetsAnimation mWrapped;
  
  public WindowInsetsAnimationCompat$Impl30(int paramInt, Interpolator paramInterpolator, long paramLong)
  {
    this(new WindowInsetsAnimation(paramInt, paramInterpolator, paramLong));
  }
  
  public WindowInsetsAnimationCompat$Impl30(@NonNull WindowInsetsAnimation paramWindowInsetsAnimation)
  {
    super(0, null, 0L);
    mWrapped = paramWindowInsetsAnimation;
  }
  
  @NonNull
  public static WindowInsetsAnimation.Bounds createPlatformBounds(@NonNull WindowInsetsAnimationCompat.BoundsCompat paramBoundsCompat)
  {
    return new WindowInsetsAnimation.Bounds(paramBoundsCompat.getLowerBound().toPlatformInsets(), paramBoundsCompat.getUpperBound().toPlatformInsets());
  }
  
  @NonNull
  public static Insets getHigherBounds(@NonNull WindowInsetsAnimation.Bounds paramBounds)
  {
    return Insets.toCompatInsets(paramBounds.getUpperBound());
  }
  
  @NonNull
  public static Insets getLowerBounds(@NonNull WindowInsetsAnimation.Bounds paramBounds)
  {
    return Insets.toCompatInsets(paramBounds.getLowerBound());
  }
  
  public static void setCallback(@NonNull View paramView, @Nullable WindowInsetsAnimationCompat.Callback paramCallback)
  {
    if (paramCallback != null) {
      paramCallback = new ProxyCallback(paramCallback);
    } else {
      paramCallback = null;
    }
    l4.j(paramView, paramCallback);
  }
  
  public long getDurationMillis()
  {
    return mWrapped.getDurationMillis();
  }
  
  public float getFraction()
  {
    return mWrapped.getFraction();
  }
  
  public float getInterpolatedFraction()
  {
    return mWrapped.getInterpolatedFraction();
  }
  
  @Nullable
  public Interpolator getInterpolator()
  {
    return mWrapped.getInterpolator();
  }
  
  public int getTypeMask()
  {
    return mWrapped.getTypeMask();
  }
  
  public void setFraction(float paramFloat)
  {
    mWrapped.setFraction(paramFloat);
  }
  
  @RequiresApi(30)
  public static class ProxyCallback
    extends WindowInsetsAnimation.Callback
  {
    private final HashMap<WindowInsetsAnimation, WindowInsetsAnimationCompat> mAnimations = new HashMap();
    private final WindowInsetsAnimationCompat.Callback mCompat;
    private List<WindowInsetsAnimationCompat> mRORunningAnimations;
    private ArrayList<WindowInsetsAnimationCompat> mTmpRunningAnimations;
    
    public ProxyCallback(@NonNull WindowInsetsAnimationCompat.Callback paramCallback)
    {
      super();
      mCompat = paramCallback;
    }
    
    @NonNull
    private WindowInsetsAnimationCompat getWindowInsetsAnimationCompat(@NonNull WindowInsetsAnimation paramWindowInsetsAnimation)
    {
      WindowInsetsAnimationCompat localWindowInsetsAnimationCompat1 = (WindowInsetsAnimationCompat)mAnimations.get(paramWindowInsetsAnimation);
      WindowInsetsAnimationCompat localWindowInsetsAnimationCompat2 = localWindowInsetsAnimationCompat1;
      if (localWindowInsetsAnimationCompat1 == null)
      {
        localWindowInsetsAnimationCompat2 = WindowInsetsAnimationCompat.toWindowInsetsAnimationCompat(paramWindowInsetsAnimation);
        mAnimations.put(paramWindowInsetsAnimation, localWindowInsetsAnimationCompat2);
      }
      return localWindowInsetsAnimationCompat2;
    }
    
    public void onEnd(@NonNull WindowInsetsAnimation paramWindowInsetsAnimation)
    {
      mCompat.onEnd(getWindowInsetsAnimationCompat(paramWindowInsetsAnimation));
      mAnimations.remove(paramWindowInsetsAnimation);
    }
    
    public void onPrepare(@NonNull WindowInsetsAnimation paramWindowInsetsAnimation)
    {
      mCompat.onPrepare(getWindowInsetsAnimationCompat(paramWindowInsetsAnimation));
    }
    
    @NonNull
    public WindowInsets onProgress(@NonNull WindowInsets paramWindowInsets, @NonNull List<WindowInsetsAnimation> paramList)
    {
      Object localObject = mTmpRunningAnimations;
      if (localObject == null)
      {
        localObject = new ArrayList(paramList.size());
        mTmpRunningAnimations = ((ArrayList)localObject);
        mRORunningAnimations = Collections.unmodifiableList((List)localObject);
      }
      else
      {
        ((ArrayList)localObject).clear();
      }
      for (int i = paramList.size() - 1; i >= 0; i--)
      {
        WindowInsetsAnimation localWindowInsetsAnimation = (WindowInsetsAnimation)paramList.get(i);
        localObject = getWindowInsetsAnimationCompat(localWindowInsetsAnimation);
        ((WindowInsetsAnimationCompat)localObject).setFraction(localWindowInsetsAnimation.getFraction());
        mTmpRunningAnimations.add(localObject);
      }
      return mCompat.onProgress(WindowInsetsCompat.toWindowInsetsCompat(paramWindowInsets), mRORunningAnimations).toWindowInsets();
    }
    
    @NonNull
    public WindowInsetsAnimation.Bounds onStart(@NonNull WindowInsetsAnimation paramWindowInsetsAnimation, @NonNull WindowInsetsAnimation.Bounds paramBounds)
    {
      return mCompat.onStart(getWindowInsetsAnimationCompat(paramWindowInsetsAnimation), WindowInsetsAnimationCompat.BoundsCompat.toBoundsCompat(paramBounds)).toBounds();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationCompat.Impl30
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */