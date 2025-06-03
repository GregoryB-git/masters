package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

class AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState
  extends Drawable.ConstantState
{
  public AnimatorSet mAnimatorSet;
  public ArrayList<Animator> mAnimators;
  public int mChangingConfigurations;
  public ArrayMap<Animator, String> mTargetNameMap;
  public VectorDrawableCompat mVectorDrawable;
  
  public AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState(Context paramContext, AnimatedVectorDrawableCompatState paramAnimatedVectorDrawableCompatState, Drawable.Callback paramCallback, Resources paramResources)
  {
    if (paramAnimatedVectorDrawableCompatState != null)
    {
      mChangingConfigurations = mChangingConfigurations;
      paramContext = mVectorDrawable;
      int i = 0;
      if (paramContext != null)
      {
        paramContext = paramContext.getConstantState();
        if (paramResources != null) {
          mVectorDrawable = ((VectorDrawableCompat)paramContext.newDrawable(paramResources));
        } else {
          mVectorDrawable = ((VectorDrawableCompat)paramContext.newDrawable());
        }
        paramContext = (VectorDrawableCompat)mVectorDrawable.mutate();
        mVectorDrawable = paramContext;
        paramContext.setCallback(paramCallback);
        mVectorDrawable.setBounds(mVectorDrawable.getBounds());
        mVectorDrawable.setAllowCaching(false);
      }
      paramContext = mAnimators;
      if (paramContext != null)
      {
        int j = paramContext.size();
        mAnimators = new ArrayList(j);
        mTargetNameMap = new ArrayMap(j);
        while (i < j)
        {
          paramCallback = (Animator)mAnimators.get(i);
          paramContext = paramCallback.clone();
          paramCallback = (String)mTargetNameMap.get(paramCallback);
          paramContext.setTarget(mVectorDrawable.getTargetByName(paramCallback));
          mAnimators.add(paramContext);
          mTargetNameMap.put(paramContext, paramCallback);
          i++;
        }
        setupAnimatorSet();
      }
    }
  }
  
  public int getChangingConfigurations()
  {
    return mChangingConfigurations;
  }
  
  public Drawable newDrawable()
  {
    throw new IllegalStateException("No constant state support for SDK < 24.");
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    throw new IllegalStateException("No constant state support for SDK < 24.");
  }
  
  public void setupAnimatorSet()
  {
    if (mAnimatorSet == null) {
      mAnimatorSet = new AnimatorSet();
    }
    mAnimatorSet.playTogether(mAnimators);
  }
}

/* Location:
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableCompatState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */