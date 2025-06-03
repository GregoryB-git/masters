package androidx.transition;

import a;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import java.util.ArrayList;
import java.util.Iterator;
import z2;

public class TransitionSet
  extends Transition
{
  private static final int FLAG_CHANGE_EPICENTER = 8;
  private static final int FLAG_CHANGE_INTERPOLATOR = 1;
  private static final int FLAG_CHANGE_PATH_MOTION = 4;
  private static final int FLAG_CHANGE_PROPAGATION = 2;
  public static final int ORDERING_SEQUENTIAL = 1;
  public static final int ORDERING_TOGETHER = 0;
  private int mChangeFlags = 0;
  public int mCurrentListeners;
  private boolean mPlayTogether = true;
  public boolean mStarted = false;
  private ArrayList<Transition> mTransitions = new ArrayList();
  
  public TransitionSet() {}
  
  @SuppressLint({"RestrictedApi"})
  public TransitionSet(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, Styleable.TRANSITION_SET);
    setOrdering(TypedArrayUtils.getNamedInt(paramContext, (XmlResourceParser)paramAttributeSet, "transitionOrdering", 0, 0));
    paramContext.recycle();
  }
  
  private void addTransitionInternal(@NonNull Transition paramTransition)
  {
    mTransitions.add(paramTransition);
    mParent = this;
  }
  
  private void setupStartEndListeners()
  {
    TransitionSetListener localTransitionSetListener = new TransitionSetListener(this);
    Iterator localIterator = mTransitions.iterator();
    while (localIterator.hasNext()) {
      ((Transition)localIterator.next()).addListener(localTransitionSetListener);
    }
    mCurrentListeners = mTransitions.size();
  }
  
  @NonNull
  public TransitionSet addListener(@NonNull Transition.TransitionListener paramTransitionListener)
  {
    return (TransitionSet)super.addListener(paramTransitionListener);
  }
  
  @NonNull
  public TransitionSet addTarget(@IdRes int paramInt)
  {
    for (int i = 0; i < mTransitions.size(); i++) {
      ((Transition)mTransitions.get(i)).addTarget(paramInt);
    }
    return (TransitionSet)super.addTarget(paramInt);
  }
  
  @NonNull
  public TransitionSet addTarget(@NonNull View paramView)
  {
    for (int i = 0; i < mTransitions.size(); i++) {
      ((Transition)mTransitions.get(i)).addTarget(paramView);
    }
    return (TransitionSet)super.addTarget(paramView);
  }
  
  @NonNull
  public TransitionSet addTarget(@NonNull Class<?> paramClass)
  {
    for (int i = 0; i < mTransitions.size(); i++) {
      ((Transition)mTransitions.get(i)).addTarget(paramClass);
    }
    return (TransitionSet)super.addTarget(paramClass);
  }
  
  @NonNull
  public TransitionSet addTarget(@NonNull String paramString)
  {
    for (int i = 0; i < mTransitions.size(); i++) {
      ((Transition)mTransitions.get(i)).addTarget(paramString);
    }
    return (TransitionSet)super.addTarget(paramString);
  }
  
  @NonNull
  public TransitionSet addTransition(@NonNull Transition paramTransition)
  {
    addTransitionInternal(paramTransition);
    long l = mDuration;
    if (l >= 0L) {
      paramTransition.setDuration(l);
    }
    if ((mChangeFlags & 0x1) != 0) {
      paramTransition.setInterpolator(getInterpolator());
    }
    if ((mChangeFlags & 0x2) != 0) {
      paramTransition.setPropagation(getPropagation());
    }
    if ((mChangeFlags & 0x4) != 0) {
      paramTransition.setPathMotion(getPathMotion());
    }
    if ((mChangeFlags & 0x8) != 0) {
      paramTransition.setEpicenterCallback(getEpicenterCallback());
    }
    return this;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void cancel()
  {
    super.cancel();
    int i = mTransitions.size();
    for (int j = 0; j < i; j++) {
      ((Transition)mTransitions.get(j)).cancel();
    }
  }
  
  public void captureEndValues(@NonNull TransitionValues paramTransitionValues)
  {
    if (isValidTarget(view))
    {
      Iterator localIterator = mTransitions.iterator();
      while (localIterator.hasNext())
      {
        Transition localTransition = (Transition)localIterator.next();
        if (localTransition.isValidTarget(view))
        {
          localTransition.captureEndValues(paramTransitionValues);
          mTargetedTransitions.add(localTransition);
        }
      }
    }
  }
  
  public void capturePropagationValues(TransitionValues paramTransitionValues)
  {
    super.capturePropagationValues(paramTransitionValues);
    int i = mTransitions.size();
    for (int j = 0; j < i; j++) {
      ((Transition)mTransitions.get(j)).capturePropagationValues(paramTransitionValues);
    }
  }
  
  public void captureStartValues(@NonNull TransitionValues paramTransitionValues)
  {
    if (isValidTarget(view))
    {
      Iterator localIterator = mTransitions.iterator();
      while (localIterator.hasNext())
      {
        Transition localTransition = (Transition)localIterator.next();
        if (localTransition.isValidTarget(view))
        {
          localTransition.captureStartValues(paramTransitionValues);
          mTargetedTransitions.add(localTransition);
        }
      }
    }
  }
  
  public Transition clone()
  {
    TransitionSet localTransitionSet = (TransitionSet)super.clone();
    mTransitions = new ArrayList();
    int i = mTransitions.size();
    for (int j = 0; j < i; j++) {
      localTransitionSet.addTransitionInternal(((Transition)mTransitions.get(j)).clone());
    }
    return localTransitionSet;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void createAnimators(ViewGroup paramViewGroup, TransitionValuesMaps paramTransitionValuesMaps1, TransitionValuesMaps paramTransitionValuesMaps2, ArrayList<TransitionValues> paramArrayList1, ArrayList<TransitionValues> paramArrayList2)
  {
    long l1 = getStartDelay();
    int i = mTransitions.size();
    for (int j = 0; j < i; j++)
    {
      Transition localTransition = (Transition)mTransitions.get(j);
      if ((l1 > 0L) && ((mPlayTogether) || (j == 0)))
      {
        long l2 = localTransition.getStartDelay();
        if (l2 > 0L) {
          localTransition.setStartDelay(l2 + l1);
        } else {
          localTransition.setStartDelay(l1);
        }
      }
      localTransition.createAnimators(paramViewGroup, paramTransitionValuesMaps1, paramTransitionValuesMaps2, paramArrayList1, paramArrayList2);
    }
  }
  
  @NonNull
  public Transition excludeTarget(int paramInt, boolean paramBoolean)
  {
    for (int i = 0; i < mTransitions.size(); i++) {
      ((Transition)mTransitions.get(i)).excludeTarget(paramInt, paramBoolean);
    }
    return super.excludeTarget(paramInt, paramBoolean);
  }
  
  @NonNull
  public Transition excludeTarget(@NonNull View paramView, boolean paramBoolean)
  {
    for (int i = 0; i < mTransitions.size(); i++) {
      ((Transition)mTransitions.get(i)).excludeTarget(paramView, paramBoolean);
    }
    return super.excludeTarget(paramView, paramBoolean);
  }
  
  @NonNull
  public Transition excludeTarget(@NonNull Class<?> paramClass, boolean paramBoolean)
  {
    for (int i = 0; i < mTransitions.size(); i++) {
      ((Transition)mTransitions.get(i)).excludeTarget(paramClass, paramBoolean);
    }
    return super.excludeTarget(paramClass, paramBoolean);
  }
  
  @NonNull
  public Transition excludeTarget(@NonNull String paramString, boolean paramBoolean)
  {
    for (int i = 0; i < mTransitions.size(); i++) {
      ((Transition)mTransitions.get(i)).excludeTarget(paramString, paramBoolean);
    }
    return super.excludeTarget(paramString, paramBoolean);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void forceToEnd(ViewGroup paramViewGroup)
  {
    super.forceToEnd(paramViewGroup);
    int i = mTransitions.size();
    for (int j = 0; j < i; j++) {
      ((Transition)mTransitions.get(j)).forceToEnd(paramViewGroup);
    }
  }
  
  public int getOrdering()
  {
    return mPlayTogether ^ true;
  }
  
  @Nullable
  public Transition getTransitionAt(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < mTransitions.size())) {
      return (Transition)mTransitions.get(paramInt);
    }
    return null;
  }
  
  public int getTransitionCount()
  {
    return mTransitions.size();
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void pause(View paramView)
  {
    super.pause(paramView);
    int i = mTransitions.size();
    for (int j = 0; j < i; j++) {
      ((Transition)mTransitions.get(j)).pause(paramView);
    }
  }
  
  @NonNull
  public TransitionSet removeListener(@NonNull Transition.TransitionListener paramTransitionListener)
  {
    return (TransitionSet)super.removeListener(paramTransitionListener);
  }
  
  @NonNull
  public TransitionSet removeTarget(@IdRes int paramInt)
  {
    for (int i = 0; i < mTransitions.size(); i++) {
      ((Transition)mTransitions.get(i)).removeTarget(paramInt);
    }
    return (TransitionSet)super.removeTarget(paramInt);
  }
  
  @NonNull
  public TransitionSet removeTarget(@NonNull View paramView)
  {
    for (int i = 0; i < mTransitions.size(); i++) {
      ((Transition)mTransitions.get(i)).removeTarget(paramView);
    }
    return (TransitionSet)super.removeTarget(paramView);
  }
  
  @NonNull
  public TransitionSet removeTarget(@NonNull Class<?> paramClass)
  {
    for (int i = 0; i < mTransitions.size(); i++) {
      ((Transition)mTransitions.get(i)).removeTarget(paramClass);
    }
    return (TransitionSet)super.removeTarget(paramClass);
  }
  
  @NonNull
  public TransitionSet removeTarget(@NonNull String paramString)
  {
    for (int i = 0; i < mTransitions.size(); i++) {
      ((Transition)mTransitions.get(i)).removeTarget(paramString);
    }
    return (TransitionSet)super.removeTarget(paramString);
  }
  
  @NonNull
  public TransitionSet removeTransition(@NonNull Transition paramTransition)
  {
    mTransitions.remove(paramTransition);
    mParent = null;
    return this;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void resume(View paramView)
  {
    super.resume(paramView);
    int i = mTransitions.size();
    for (int j = 0; j < i; j++) {
      ((Transition)mTransitions.get(j)).resume(paramView);
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void runAnimators()
  {
    if (mTransitions.isEmpty())
    {
      start();
      end();
      return;
    }
    setupStartEndListeners();
    Object localObject;
    if (!mPlayTogether)
    {
      for (int i = 1; i < mTransitions.size(); i++) {
        ((Transition)mTransitions.get(i - 1)).addListener(new TransitionListenerAdapter()
        {
          public void onTransitionEnd(@NonNull Transition paramAnonymousTransition)
          {
            val$nextTransition.runAnimators();
            paramAnonymousTransition.removeListener(this);
          }
        });
      }
      localObject = (Transition)mTransitions.get(0);
      if (localObject != null) {
        ((Transition)localObject).runAnimators();
      }
    }
    else
    {
      localObject = mTransitions.iterator();
      while (((Iterator)localObject).hasNext()) {
        ((Transition)((Iterator)localObject).next()).runAnimators();
      }
    }
  }
  
  public void setCanRemoveViews(boolean paramBoolean)
  {
    super.setCanRemoveViews(paramBoolean);
    int i = mTransitions.size();
    for (int j = 0; j < i; j++) {
      ((Transition)mTransitions.get(j)).setCanRemoveViews(paramBoolean);
    }
  }
  
  @NonNull
  public TransitionSet setDuration(long paramLong)
  {
    super.setDuration(paramLong);
    if (mDuration >= 0L)
    {
      ArrayList localArrayList = mTransitions;
      if (localArrayList != null)
      {
        int i = localArrayList.size();
        for (int j = 0; j < i; j++) {
          ((Transition)mTransitions.get(j)).setDuration(paramLong);
        }
      }
    }
    return this;
  }
  
  public void setEpicenterCallback(Transition.EpicenterCallback paramEpicenterCallback)
  {
    super.setEpicenterCallback(paramEpicenterCallback);
    mChangeFlags |= 0x8;
    int i = mTransitions.size();
    for (int j = 0; j < i; j++) {
      ((Transition)mTransitions.get(j)).setEpicenterCallback(paramEpicenterCallback);
    }
  }
  
  @NonNull
  public TransitionSet setInterpolator(@Nullable TimeInterpolator paramTimeInterpolator)
  {
    mChangeFlags |= 0x1;
    ArrayList localArrayList = mTransitions;
    if (localArrayList != null)
    {
      int i = localArrayList.size();
      for (int j = 0; j < i; j++) {
        ((Transition)mTransitions.get(j)).setInterpolator(paramTimeInterpolator);
      }
    }
    return (TransitionSet)super.setInterpolator(paramTimeInterpolator);
  }
  
  @NonNull
  public TransitionSet setOrdering(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt == 1) {
        mPlayTogether = false;
      } else {
        throw new AndroidRuntimeException(a.f("Invalid parameter for TransitionSet ordering: ", paramInt));
      }
    }
    else {
      mPlayTogether = true;
    }
    return this;
  }
  
  public void setPathMotion(PathMotion paramPathMotion)
  {
    super.setPathMotion(paramPathMotion);
    mChangeFlags |= 0x4;
    if (mTransitions != null) {
      for (int i = 0; i < mTransitions.size(); i++) {
        ((Transition)mTransitions.get(i)).setPathMotion(paramPathMotion);
      }
    }
  }
  
  public void setPropagation(TransitionPropagation paramTransitionPropagation)
  {
    super.setPropagation(paramTransitionPropagation);
    mChangeFlags |= 0x2;
    int i = mTransitions.size();
    for (int j = 0; j < i; j++) {
      ((Transition)mTransitions.get(j)).setPropagation(paramTransitionPropagation);
    }
  }
  
  public TransitionSet setSceneRoot(ViewGroup paramViewGroup)
  {
    super.setSceneRoot(paramViewGroup);
    int i = mTransitions.size();
    for (int j = 0; j < i; j++) {
      ((Transition)mTransitions.get(j)).setSceneRoot(paramViewGroup);
    }
    return this;
  }
  
  @NonNull
  public TransitionSet setStartDelay(long paramLong)
  {
    return (TransitionSet)super.setStartDelay(paramLong);
  }
  
  public String toString(String paramString)
  {
    Object localObject = super.toString(paramString);
    for (int i = 0; i < mTransitions.size(); i++)
    {
      StringBuilder localStringBuilder1 = z2.u((String)localObject, "\n");
      localObject = (Transition)mTransitions.get(i);
      StringBuilder localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append(paramString);
      localStringBuilder2.append("  ");
      localStringBuilder1.append(((Transition)localObject).toString(localStringBuilder2.toString()));
      localObject = localStringBuilder1.toString();
    }
    return (String)localObject;
  }
  
  public static class TransitionSetListener
    extends TransitionListenerAdapter
  {
    public TransitionSet mTransitionSet;
    
    public TransitionSetListener(TransitionSet paramTransitionSet)
    {
      mTransitionSet = paramTransitionSet;
    }
    
    public void onTransitionEnd(@NonNull Transition paramTransition)
    {
      TransitionSet localTransitionSet = mTransitionSet;
      int i = mCurrentListeners - 1;
      mCurrentListeners = i;
      if (i == 0)
      {
        mStarted = false;
        localTransitionSet.end();
      }
      paramTransition.removeListener(this);
    }
    
    public void onTransitionStart(@NonNull Transition paramTransition)
    {
      paramTransition = mTransitionSet;
      if (!mStarted)
      {
        paramTransition.start();
        mTransitionSet.mStarted = true;
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.transition.TransitionSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */