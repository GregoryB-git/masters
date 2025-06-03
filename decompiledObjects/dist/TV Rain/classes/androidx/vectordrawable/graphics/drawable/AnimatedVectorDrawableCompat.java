package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class AnimatedVectorDrawableCompat
  extends VectorDrawableCommon
  implements Animatable2Compat
{
  private static final String ANIMATED_VECTOR = "animated-vector";
  private static final boolean DBG_ANIMATION_VECTOR_DRAWABLE = false;
  private static final String LOGTAG = "AnimatedVDCompat";
  private static final String TARGET = "target";
  private AnimatedVectorDrawableCompatState mAnimatedVectorState;
  public ArrayList<Animatable2Compat.AnimationCallback> mAnimationCallbacks = null;
  private Animator.AnimatorListener mAnimatorListener = null;
  private ArgbEvaluator mArgbEvaluator = null;
  public AnimatedVectorDrawableDelegateState mCachedConstantStateDelegate;
  public final Drawable.Callback mCallback;
  private Context mContext;
  
  public AnimatedVectorDrawableCompat()
  {
    this(null, null, null);
  }
  
  private AnimatedVectorDrawableCompat(@Nullable Context paramContext)
  {
    this(paramContext, null, null);
  }
  
  private AnimatedVectorDrawableCompat(@Nullable Context paramContext, @Nullable AnimatedVectorDrawableCompatState paramAnimatedVectorDrawableCompatState, @Nullable Resources paramResources)
  {
    Drawable.Callback local1 = new Drawable.Callback()
    {
      public void invalidateDrawable(Drawable paramAnonymousDrawable)
      {
        invalidateSelf();
      }
      
      public void scheduleDrawable(Drawable paramAnonymousDrawable, Runnable paramAnonymousRunnable, long paramAnonymousLong)
      {
        scheduleSelf(paramAnonymousRunnable, paramAnonymousLong);
      }
      
      public void unscheduleDrawable(Drawable paramAnonymousDrawable, Runnable paramAnonymousRunnable)
      {
        unscheduleSelf(paramAnonymousRunnable);
      }
    };
    mCallback = local1;
    mContext = paramContext;
    if (paramAnimatedVectorDrawableCompatState != null) {
      mAnimatedVectorState = paramAnimatedVectorDrawableCompatState;
    } else {
      mAnimatedVectorState = new AnimatedVectorDrawableCompatState(paramContext, paramAnimatedVectorDrawableCompatState, local1, paramResources);
    }
  }
  
  public static void clearAnimationCallbacks(Drawable paramDrawable)
  {
    if (!(paramDrawable instanceof Animatable)) {
      return;
    }
    ((AnimatedVectorDrawable)paramDrawable).clearAnimationCallbacks();
  }
  
  @Nullable
  public static AnimatedVectorDrawableCompat create(@NonNull Context paramContext, @DrawableRes int paramInt)
  {
    AnimatedVectorDrawableCompat localAnimatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(paramContext);
    paramContext = ResourcesCompat.getDrawable(paramContext.getResources(), paramInt, paramContext.getTheme());
    mDelegateDrawable = paramContext;
    paramContext.setCallback(mCallback);
    mCachedConstantStateDelegate = new AnimatedVectorDrawableDelegateState(mDelegateDrawable.getConstantState());
    return localAnimatedVectorDrawableCompat;
  }
  
  public static AnimatedVectorDrawableCompat createFromXmlInner(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    paramContext = new AnimatedVectorDrawableCompat(paramContext);
    paramContext.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return paramContext;
  }
  
  public static void registerAnimationCallback(Drawable paramDrawable, Animatable2Compat.AnimationCallback paramAnimationCallback)
  {
    if ((paramDrawable != null) && (paramAnimationCallback != null))
    {
      if (!(paramDrawable instanceof Animatable)) {
        return;
      }
      registerPlatformCallback((AnimatedVectorDrawable)paramDrawable, paramAnimationCallback);
    }
  }
  
  @RequiresApi(23)
  private static void registerPlatformCallback(@NonNull AnimatedVectorDrawable paramAnimatedVectorDrawable, @NonNull Animatable2Compat.AnimationCallback paramAnimationCallback)
  {
    paramAnimatedVectorDrawable.registerAnimationCallback(paramAnimationCallback.getPlatformCallback());
  }
  
  private void removeAnimatorSetListener()
  {
    Animator.AnimatorListener localAnimatorListener = mAnimatorListener;
    if (localAnimatorListener != null)
    {
      mAnimatedVectorState.mAnimatorSet.removeListener(localAnimatorListener);
      mAnimatorListener = null;
    }
  }
  
  private void setupAnimatorsForTarget(String paramString, Animator paramAnimator)
  {
    paramAnimator.setTarget(mAnimatedVectorState.mVectorDrawable.getTargetByName(paramString));
    AnimatedVectorDrawableCompatState localAnimatedVectorDrawableCompatState = mAnimatedVectorState;
    if (mAnimators == null)
    {
      mAnimators = new ArrayList();
      mAnimatedVectorState.mTargetNameMap = new ArrayMap();
    }
    mAnimatedVectorState.mAnimators.add(paramAnimator);
    mAnimatedVectorState.mTargetNameMap.put(paramAnimator, paramString);
  }
  
  private void setupColorAnimator(Animator paramAnimator)
  {
    Object localObject;
    if ((paramAnimator instanceof AnimatorSet))
    {
      localObject = ((AnimatorSet)paramAnimator).getChildAnimations();
      if (localObject != null) {
        for (int i = 0; i < ((List)localObject).size(); i++) {
          setupColorAnimator((Animator)((List)localObject).get(i));
        }
      }
    }
    if ((paramAnimator instanceof ObjectAnimator))
    {
      localObject = (ObjectAnimator)paramAnimator;
      paramAnimator = ((ObjectAnimator)localObject).getPropertyName();
      if (("fillColor".equals(paramAnimator)) || ("strokeColor".equals(paramAnimator)))
      {
        if (mArgbEvaluator == null) {
          mArgbEvaluator = new ArgbEvaluator();
        }
        ((ValueAnimator)localObject).setEvaluator(mArgbEvaluator);
      }
    }
  }
  
  public static boolean unregisterAnimationCallback(Drawable paramDrawable, Animatable2Compat.AnimationCallback paramAnimationCallback)
  {
    if ((paramDrawable != null) && (paramAnimationCallback != null))
    {
      if (!(paramDrawable instanceof Animatable)) {
        return false;
      }
      return unregisterPlatformCallback((AnimatedVectorDrawable)paramDrawable, paramAnimationCallback);
    }
    return false;
  }
  
  @RequiresApi(23)
  private static boolean unregisterPlatformCallback(AnimatedVectorDrawable paramAnimatedVectorDrawable, Animatable2Compat.AnimationCallback paramAnimationCallback)
  {
    return paramAnimatedVectorDrawable.unregisterAnimationCallback(paramAnimationCallback.getPlatformCallback());
  }
  
  public void applyTheme(Resources.Theme paramTheme)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      DrawableCompat.applyTheme(localDrawable, paramTheme);
    }
  }
  
  public boolean canApplyTheme()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return DrawableCompat.canApplyTheme(localDrawable);
    }
    return false;
  }
  
  public void clearAnimationCallbacks()
  {
    Object localObject = mDelegateDrawable;
    if (localObject != null)
    {
      ((AnimatedVectorDrawable)localObject).clearAnimationCallbacks();
      return;
    }
    removeAnimatorSetListener();
    localObject = mAnimationCallbacks;
    if (localObject == null) {
      return;
    }
    ((ArrayList)localObject).clear();
  }
  
  public void draw(Canvas paramCanvas)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      localDrawable.draw(paramCanvas);
      return;
    }
    mAnimatedVectorState.mVectorDrawable.draw(paramCanvas);
    if (mAnimatedVectorState.mAnimatorSet.isStarted()) {
      invalidateSelf();
    }
  }
  
  public int getAlpha()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return DrawableCompat.getAlpha(localDrawable);
    }
    return mAnimatedVectorState.mVectorDrawable.getAlpha();
  }
  
  public int getChangingConfigurations()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return localDrawable.getChangingConfigurations();
    }
    return super.getChangingConfigurations() | mAnimatedVectorState.mChangingConfigurations;
  }
  
  public ColorFilter getColorFilter()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return DrawableCompat.getColorFilter(localDrawable);
    }
    return mAnimatedVectorState.mVectorDrawable.getColorFilter();
  }
  
  public Drawable.ConstantState getConstantState()
  {
    if (mDelegateDrawable != null) {
      return new AnimatedVectorDrawableDelegateState(mDelegateDrawable.getConstantState());
    }
    return null;
  }
  
  public int getIntrinsicHeight()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return localDrawable.getIntrinsicHeight();
    }
    return mAnimatedVectorState.mVectorDrawable.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return localDrawable.getIntrinsicWidth();
    }
    return mAnimatedVectorState.mVectorDrawable.getIntrinsicWidth();
  }
  
  public int getOpacity()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return localDrawable.getOpacity();
    }
    return mAnimatedVectorState.mVectorDrawable.getOpacity();
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
    throws XmlPullParserException, IOException
  {
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    Object localObject1 = mDelegateDrawable;
    if (localObject1 != null)
    {
      DrawableCompat.inflate((Drawable)localObject1, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    }
    int i = paramXmlPullParser.getEventType();
    int j = paramXmlPullParser.getDepth();
    while ((i != 1) && ((paramXmlPullParser.getDepth() >= j + 1) || (i != 3)))
    {
      if (i == 2)
      {
        localObject1 = paramXmlPullParser.getName();
        Object localObject2;
        Object localObject3;
        if ("animated-vector".equals(localObject1))
        {
          localObject2 = TypedArrayUtils.obtainAttributes(paramResources, paramTheme, paramAttributeSet, AndroidResources.STYLEABLE_ANIMATED_VECTOR_DRAWABLE);
          i = ((TypedArray)localObject2).getResourceId(0, 0);
          if (i != 0)
          {
            localObject3 = VectorDrawableCompat.create(paramResources, i, paramTheme);
            ((VectorDrawableCompat)localObject3).setAllowCaching(false);
            ((Drawable)localObject3).setCallback(mCallback);
            localObject1 = mAnimatedVectorState.mVectorDrawable;
            if (localObject1 != null) {
              ((Drawable)localObject1).setCallback(null);
            }
            mAnimatedVectorState.mVectorDrawable = ((VectorDrawableCompat)localObject3);
          }
          ((TypedArray)localObject2).recycle();
        }
        else if ("target".equals(localObject1))
        {
          localObject1 = paramResources.obtainAttributes(paramAttributeSet, AndroidResources.STYLEABLE_ANIMATED_VECTOR_DRAWABLE_TARGET);
          localObject3 = ((TypedArray)localObject1).getString(0);
          i = ((TypedArray)localObject1).getResourceId(1, 0);
          if (i != 0)
          {
            localObject2 = mContext;
            if (localObject2 != null)
            {
              setupAnimatorsForTarget((String)localObject3, AnimatorInflaterCompat.loadAnimator((Context)localObject2, i));
            }
            else
            {
              ((TypedArray)localObject1).recycle();
              throw new IllegalStateException("Context can't be null when inflating animators");
            }
          }
          ((TypedArray)localObject1).recycle();
        }
      }
      i = paramXmlPullParser.next();
    }
    mAnimatedVectorState.setupAnimatorSet();
  }
  
  public boolean isAutoMirrored()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return DrawableCompat.isAutoMirrored(localDrawable);
    }
    return mAnimatedVectorState.mVectorDrawable.isAutoMirrored();
  }
  
  public boolean isRunning()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return ((AnimatedVectorDrawable)localDrawable).isRunning();
    }
    return mAnimatedVectorState.mAnimatorSet.isRunning();
  }
  
  public boolean isStateful()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return localDrawable.isStateful();
    }
    return mAnimatedVectorState.mVectorDrawable.isStateful();
  }
  
  public Drawable mutate()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      localDrawable.mutate();
    }
    return this;
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      localDrawable.setBounds(paramRect);
      return;
    }
    mAnimatedVectorState.mVectorDrawable.setBounds(paramRect);
  }
  
  public boolean onLevelChange(int paramInt)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return localDrawable.setLevel(paramInt);
    }
    return mAnimatedVectorState.mVectorDrawable.setLevel(paramInt);
  }
  
  public boolean onStateChange(int[] paramArrayOfInt)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return localDrawable.setState(paramArrayOfInt);
    }
    return mAnimatedVectorState.mVectorDrawable.setState(paramArrayOfInt);
  }
  
  public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback paramAnimationCallback)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      registerPlatformCallback((AnimatedVectorDrawable)localDrawable, paramAnimationCallback);
      return;
    }
    if (paramAnimationCallback == null) {
      return;
    }
    if (mAnimationCallbacks == null) {
      mAnimationCallbacks = new ArrayList();
    }
    if (mAnimationCallbacks.contains(paramAnimationCallback)) {
      return;
    }
    mAnimationCallbacks.add(paramAnimationCallback);
    if (mAnimatorListener == null) {
      mAnimatorListener = new AnimatorListenerAdapter()
      {
        public void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          paramAnonymousAnimator = new ArrayList(mAnimationCallbacks);
          int i = paramAnonymousAnimator.size();
          for (int j = 0; j < i; j++) {
            ((Animatable2Compat.AnimationCallback)paramAnonymousAnimator.get(j)).onAnimationEnd(AnimatedVectorDrawableCompat.this);
          }
        }
        
        public void onAnimationStart(Animator paramAnonymousAnimator)
        {
          paramAnonymousAnimator = new ArrayList(mAnimationCallbacks);
          int i = paramAnonymousAnimator.size();
          for (int j = 0; j < i; j++) {
            ((Animatable2Compat.AnimationCallback)paramAnonymousAnimator.get(j)).onAnimationStart(AnimatedVectorDrawableCompat.this);
          }
        }
      };
    }
    mAnimatedVectorState.mAnimatorSet.addListener(mAnimatorListener);
  }
  
  public void setAlpha(int paramInt)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      localDrawable.setAlpha(paramInt);
      return;
    }
    mAnimatedVectorState.mVectorDrawable.setAlpha(paramInt);
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      DrawableCompat.setAutoMirrored(localDrawable, paramBoolean);
      return;
    }
    mAnimatedVectorState.mVectorDrawable.setAutoMirrored(paramBoolean);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      localDrawable.setColorFilter(paramColorFilter);
      return;
    }
    mAnimatedVectorState.mVectorDrawable.setColorFilter(paramColorFilter);
  }
  
  public void setTint(int paramInt)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      DrawableCompat.setTint(localDrawable, paramInt);
      return;
    }
    mAnimatedVectorState.mVectorDrawable.setTint(paramInt);
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      DrawableCompat.setTintList(localDrawable, paramColorStateList);
      return;
    }
    mAnimatedVectorState.mVectorDrawable.setTintList(paramColorStateList);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      DrawableCompat.setTintMode(localDrawable, paramMode);
      return;
    }
    mAnimatedVectorState.mVectorDrawable.setTintMode(paramMode);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return localDrawable.setVisible(paramBoolean1, paramBoolean2);
    }
    mAnimatedVectorState.mVectorDrawable.setVisible(paramBoolean1, paramBoolean2);
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void start()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      ((AnimatedVectorDrawable)localDrawable).start();
      return;
    }
    if (mAnimatedVectorState.mAnimatorSet.isStarted()) {
      return;
    }
    mAnimatedVectorState.mAnimatorSet.start();
    invalidateSelf();
  }
  
  public void stop()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      ((AnimatedVectorDrawable)localDrawable).stop();
      return;
    }
    mAnimatedVectorState.mAnimatorSet.end();
  }
  
  public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback paramAnimationCallback)
  {
    Object localObject = mDelegateDrawable;
    if (localObject != null) {
      unregisterPlatformCallback((AnimatedVectorDrawable)localObject, paramAnimationCallback);
    }
    localObject = mAnimationCallbacks;
    if ((localObject != null) && (paramAnimationCallback != null))
    {
      boolean bool = ((ArrayList)localObject).remove(paramAnimationCallback);
      if (mAnimationCallbacks.size() == 0) {
        removeAnimatorSetListener();
      }
      return bool;
    }
    return false;
  }
  
  public static class AnimatedVectorDrawableCompatState
    extends Drawable.ConstantState
  {
    public AnimatorSet mAnimatorSet;
    public ArrayList<Animator> mAnimators;
    public int mChangingConfigurations;
    public ArrayMap<Animator, String> mTargetNameMap;
    public VectorDrawableCompat mVectorDrawable;
    
    public AnimatedVectorDrawableCompatState(Context paramContext, AnimatedVectorDrawableCompatState paramAnimatedVectorDrawableCompatState, Drawable.Callback paramCallback, Resources paramResources)
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
  
  @RequiresApi(24)
  public static class AnimatedVectorDrawableDelegateState
    extends Drawable.ConstantState
  {
    private final Drawable.ConstantState mDelegateState;
    
    public AnimatedVectorDrawableDelegateState(Drawable.ConstantState paramConstantState)
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
}

/* Location:
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */