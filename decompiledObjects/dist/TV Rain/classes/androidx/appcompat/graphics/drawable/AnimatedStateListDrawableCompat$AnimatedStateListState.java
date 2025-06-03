package androidx.appcompat.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;

class AnimatedStateListDrawableCompat$AnimatedStateListState
  extends StateListDrawable.StateListState
{
  private static final long REVERSED_BIT = 4294967296L;
  private static final long REVERSIBLE_FLAG_BIT = 8589934592L;
  public SparseArrayCompat<Integer> mStateIds;
  public LongSparseArray<Long> mTransitions;
  
  public AnimatedStateListDrawableCompat$AnimatedStateListState(@Nullable AnimatedStateListState paramAnimatedStateListState, @NonNull AnimatedStateListDrawableCompat paramAnimatedStateListDrawableCompat, @Nullable Resources paramResources)
  {
    super(paramAnimatedStateListState, paramAnimatedStateListDrawableCompat, paramResources);
    if (paramAnimatedStateListState != null)
    {
      mTransitions = mTransitions;
      mStateIds = mStateIds;
    }
    else
    {
      mTransitions = new LongSparseArray();
      mStateIds = new SparseArrayCompat();
    }
  }
  
  private static long generateTransitionKey(int paramInt1, int paramInt2)
  {
    long l = paramInt1;
    return paramInt2 | l << 32;
  }
  
  public int addStateSet(@NonNull int[] paramArrayOfInt, @NonNull Drawable paramDrawable, int paramInt)
  {
    int i = super.addStateSet(paramArrayOfInt, paramDrawable);
    mStateIds.put(i, Integer.valueOf(paramInt));
    return i;
  }
  
  public int addTransition(int paramInt1, int paramInt2, @NonNull Drawable paramDrawable, boolean paramBoolean)
  {
    int i = super.addChild(paramDrawable);
    long l1 = generateTransitionKey(paramInt1, paramInt2);
    long l2;
    if (paramBoolean) {
      l2 = 8589934592L;
    } else {
      l2 = 0L;
    }
    paramDrawable = mTransitions;
    long l3 = i;
    paramDrawable.append(l1, Long.valueOf(l3 | l2));
    if (paramBoolean)
    {
      l1 = generateTransitionKey(paramInt2, paramInt1);
      mTransitions.append(l1, Long.valueOf(0x100000000 | l3 | l2));
    }
    return i;
  }
  
  public int getKeyframeIdAt(int paramInt)
  {
    int i = 0;
    if (paramInt < 0) {
      paramInt = i;
    } else {
      paramInt = ((Integer)mStateIds.get(paramInt, Integer.valueOf(0))).intValue();
    }
    return paramInt;
  }
  
  public int indexOfKeyframe(@NonNull int[] paramArrayOfInt)
  {
    int i = super.indexOfStateSet(paramArrayOfInt);
    if (i >= 0) {
      return i;
    }
    return super.indexOfStateSet(StateSet.WILD_CARD);
  }
  
  public int indexOfTransition(int paramInt1, int paramInt2)
  {
    long l = generateTransitionKey(paramInt1, paramInt2);
    return (int)((Long)mTransitions.get(l, Long.valueOf(-1L))).longValue();
  }
  
  public boolean isTransitionReversed(int paramInt1, int paramInt2)
  {
    long l = generateTransitionKey(paramInt1, paramInt2);
    boolean bool;
    if ((((Long)mTransitions.get(l, Long.valueOf(-1L))).longValue() & 0x100000000) != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void mutate()
  {
    mTransitions = mTransitions.clone();
    mStateIds = mStateIds.clone();
  }
  
  @NonNull
  public Drawable newDrawable()
  {
    return new AnimatedStateListDrawableCompat(this, null);
  }
  
  @NonNull
  public Drawable newDrawable(Resources paramResources)
  {
    return new AnimatedStateListDrawableCompat(this, paramResources);
  }
  
  public boolean transitionHasReversibleFlag(int paramInt1, int paramInt2)
  {
    long l = generateTransitionKey(paramInt1, paramInt2);
    boolean bool;
    if ((((Long)mTransitions.get(l, Long.valueOf(-1L))).longValue() & 0x200000000) != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */