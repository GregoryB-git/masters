package androidx.appcompat.graphics.drawable;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.resources.Compatibility.Api18Impl;
import androidx.appcompat.resources.Compatibility.Api21Impl;
import androidx.appcompat.resources.R.styleable;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class AnimatedStateListDrawableCompat
  extends StateListDrawable
  implements TintAwareDrawable
{
  private static final String ELEMENT_ITEM = "item";
  private static final String ELEMENT_TRANSITION = "transition";
  private static final String ITEM_MISSING_DRAWABLE_ERROR = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";
  private static final String LOGTAG = "AnimatedStateListDrawableCompat";
  private static final String TRANSITION_MISSING_DRAWABLE_ERROR = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
  private static final String TRANSITION_MISSING_FROM_TO_ID = ": <transition> tag requires 'fromId' & 'toId' attributes";
  private boolean mMutated;
  private AnimatedStateListState mState;
  private Transition mTransition;
  private int mTransitionFromIndex = -1;
  private int mTransitionToIndex = -1;
  
  public AnimatedStateListDrawableCompat()
  {
    this(null, null);
  }
  
  public AnimatedStateListDrawableCompat(@Nullable AnimatedStateListState paramAnimatedStateListState, @Nullable Resources paramResources)
  {
    super(null);
    setConstantState(new AnimatedStateListState(paramAnimatedStateListState, this, paramResources));
    onStateChange(getState());
    jumpToCurrentState();
  }
  
  @Nullable
  public static AnimatedStateListDrawableCompat create(@NonNull Context paramContext, @DrawableRes int paramInt, @Nullable Resources.Theme paramTheme)
  {
    try
    {
      Resources localResources = paramContext.getResources();
      XmlResourceParser localXmlResourceParser = localResources.getXml(paramInt);
      AttributeSet localAttributeSet = Xml.asAttributeSet(localXmlResourceParser);
      do
      {
        paramInt = localXmlResourceParser.next();
      } while ((paramInt != 2) && (paramInt != 1));
      if (paramInt == 2) {
        return createFromXmlInner(paramContext, localResources, localXmlResourceParser, localAttributeSet, paramTheme);
      }
      paramContext = new org/xmlpull/v1/XmlPullParserException;
      paramContext.<init>("No start tag found");
      throw paramContext;
    }
    catch (IOException paramContext)
    {
      Log.e(LOGTAG, "parser error", paramContext);
    }
    catch (XmlPullParserException paramContext)
    {
      Log.e(LOGTAG, "parser error", paramContext);
    }
    return null;
  }
  
  @NonNull
  public static AnimatedStateListDrawableCompat createFromXmlInner(@NonNull Context paramContext, @NonNull Resources paramResources, @NonNull XmlPullParser paramXmlPullParser, @NonNull AttributeSet paramAttributeSet, @Nullable Resources.Theme paramTheme)
    throws IOException, XmlPullParserException
  {
    Object localObject = paramXmlPullParser.getName();
    if (((String)localObject).equals("animated-selector"))
    {
      localObject = new AnimatedStateListDrawableCompat();
      ((AnimatedStateListDrawableCompat)localObject).inflate(paramContext, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return (AnimatedStateListDrawableCompat)localObject;
    }
    paramContext = new StringBuilder();
    paramContext.append(paramXmlPullParser.getPositionDescription());
    paramContext.append(": invalid animated-selector tag ");
    paramContext.append((String)localObject);
    throw new XmlPullParserException(paramContext.toString());
  }
  
  private void inflateChildElements(@NonNull Context paramContext, @NonNull Resources paramResources, @NonNull XmlPullParser paramXmlPullParser, @NonNull AttributeSet paramAttributeSet, @Nullable Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    int i = paramXmlPullParser.getDepth() + 1;
    for (;;)
    {
      int j = paramXmlPullParser.next();
      if (j == 1) {
        break;
      }
      int k = paramXmlPullParser.getDepth();
      if ((k < i) && (j == 3)) {
        break;
      }
      if ((j == 2) && (k <= i)) {
        if (paramXmlPullParser.getName().equals("item")) {
          parseItem(paramContext, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
        } else if (paramXmlPullParser.getName().equals("transition")) {
          parseTransition(paramContext, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
        }
      }
    }
  }
  
  private void init()
  {
    onStateChange(getState());
  }
  
  private int parseItem(@NonNull Context paramContext, @NonNull Resources paramResources, @NonNull XmlPullParser paramXmlPullParser, @NonNull AttributeSet paramAttributeSet, @Nullable Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    Object localObject = TypedArrayUtils.obtainAttributes(paramResources, paramTheme, paramAttributeSet, R.styleable.AnimatedStateListDrawableItem);
    int i = ((TypedArray)localObject).getResourceId(R.styleable.AnimatedStateListDrawableItem_android_id, 0);
    int j = ((TypedArray)localObject).getResourceId(R.styleable.AnimatedStateListDrawableItem_android_drawable, -1);
    if (j > 0) {
      paramContext = ResourceManagerInternal.get().getDrawable(paramContext, j);
    } else {
      paramContext = null;
    }
    ((TypedArray)localObject).recycle();
    int[] arrayOfInt = extractStateSet(paramAttributeSet);
    localObject = paramContext;
    if (paramContext == null)
    {
      do
      {
        j = paramXmlPullParser.next();
      } while (j == 4);
      if (j == 2)
      {
        if (paramXmlPullParser.getName().equals("vector")) {
          localObject = VectorDrawableCompat.createFromXmlInner(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
        } else {
          localObject = Compatibility.Api21Impl.createFromXmlInner(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
        }
      }
      else
      {
        paramContext = new StringBuilder();
        paramContext.append(paramXmlPullParser.getPositionDescription());
        paramContext.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
        throw new XmlPullParserException(paramContext.toString());
      }
    }
    if (localObject != null) {
      return mState.addStateSet(arrayOfInt, (Drawable)localObject, i);
    }
    paramContext = new StringBuilder();
    paramContext.append(paramXmlPullParser.getPositionDescription());
    paramContext.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    throw new XmlPullParserException(paramContext.toString());
  }
  
  private int parseTransition(@NonNull Context paramContext, @NonNull Resources paramResources, @NonNull XmlPullParser paramXmlPullParser, @NonNull AttributeSet paramAttributeSet, @Nullable Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    Object localObject = TypedArrayUtils.obtainAttributes(paramResources, paramTheme, paramAttributeSet, R.styleable.AnimatedStateListDrawableTransition);
    int i = ((TypedArray)localObject).getResourceId(R.styleable.AnimatedStateListDrawableTransition_android_fromId, -1);
    int j = ((TypedArray)localObject).getResourceId(R.styleable.AnimatedStateListDrawableTransition_android_toId, -1);
    int k = ((TypedArray)localObject).getResourceId(R.styleable.AnimatedStateListDrawableTransition_android_drawable, -1);
    Drawable localDrawable;
    if (k > 0) {
      localDrawable = ResourceManagerInternal.get().getDrawable(paramContext, k);
    } else {
      localDrawable = null;
    }
    boolean bool = ((TypedArray)localObject).getBoolean(R.styleable.AnimatedStateListDrawableTransition_android_reversible, false);
    ((TypedArray)localObject).recycle();
    localObject = localDrawable;
    if (localDrawable == null)
    {
      do
      {
        k = paramXmlPullParser.next();
      } while (k == 4);
      if (k == 2)
      {
        if (paramXmlPullParser.getName().equals("animated-vector")) {
          localObject = AnimatedVectorDrawableCompat.createFromXmlInner(paramContext, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
        } else {
          localObject = Compatibility.Api21Impl.createFromXmlInner(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
        }
      }
      else
      {
        paramContext = new StringBuilder();
        paramContext.append(paramXmlPullParser.getPositionDescription());
        paramContext.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        throw new XmlPullParserException(paramContext.toString());
      }
    }
    if (localObject != null)
    {
      if ((i != -1) && (j != -1)) {
        return mState.addTransition(i, j, (Drawable)localObject, bool);
      }
      paramContext = new StringBuilder();
      paramContext.append(paramXmlPullParser.getPositionDescription());
      paramContext.append(": <transition> tag requires 'fromId' & 'toId' attributes");
      throw new XmlPullParserException(paramContext.toString());
    }
    paramContext = new StringBuilder();
    paramContext.append(paramXmlPullParser.getPositionDescription());
    paramContext.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
    throw new XmlPullParserException(paramContext.toString());
  }
  
  private boolean selectTransition(int paramInt)
  {
    Object localObject = mTransition;
    int i;
    if (localObject != null)
    {
      if (paramInt == mTransitionToIndex) {
        return true;
      }
      if ((paramInt == mTransitionFromIndex) && (((Transition)localObject).canReverse()))
      {
        ((Transition)localObject).reverse();
        mTransitionToIndex = mTransitionFromIndex;
        mTransitionFromIndex = paramInt;
        return true;
      }
      i = mTransitionToIndex;
      ((Transition)localObject).stop();
    }
    else
    {
      i = getCurrentIndex();
    }
    mTransition = null;
    mTransitionFromIndex = -1;
    mTransitionToIndex = -1;
    localObject = mState;
    int j = ((AnimatedStateListState)localObject).getKeyframeIdAt(i);
    int k = ((AnimatedStateListState)localObject).getKeyframeIdAt(paramInt);
    if ((k != 0) && (j != 0))
    {
      int m = ((AnimatedStateListState)localObject).indexOfTransition(j, k);
      if (m < 0) {
        return false;
      }
      boolean bool1 = ((AnimatedStateListState)localObject).transitionHasReversibleFlag(j, k);
      selectDrawable(m);
      Drawable localDrawable = getCurrent();
      if ((localDrawable instanceof AnimationDrawable))
      {
        boolean bool2 = ((AnimatedStateListState)localObject).isTransitionReversed(j, k);
        localObject = new AnimationDrawableTransition((AnimationDrawable)localDrawable, bool2, bool1);
      }
      else if ((localDrawable instanceof AnimatedVectorDrawableCompat))
      {
        localObject = new AnimatedVectorDrawableTransition((AnimatedVectorDrawableCompat)localDrawable);
      }
      else
      {
        if (!(localDrawable instanceof Animatable)) {
          break label261;
        }
        localObject = new AnimatableTransition((Animatable)localDrawable);
      }
      ((Transition)localObject).start();
      mTransition = ((Transition)localObject);
      mTransitionFromIndex = i;
      mTransitionToIndex = paramInt;
      return true;
    }
    label261:
    return false;
  }
  
  private void updateStateFromTypedArray(TypedArray paramTypedArray)
  {
    AnimatedStateListState localAnimatedStateListState = mState;
    mChangingConfigurations |= Compatibility.Api21Impl.getChangingConfigurations(paramTypedArray);
    localAnimatedStateListState.setVariablePadding(paramTypedArray.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_variablePadding, mVariablePadding));
    localAnimatedStateListState.setConstantSize(paramTypedArray.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_constantSize, mConstantSize));
    localAnimatedStateListState.setEnterFadeDuration(paramTypedArray.getInt(R.styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration, mEnterFadeDuration));
    localAnimatedStateListState.setExitFadeDuration(paramTypedArray.getInt(R.styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration, mExitFadeDuration));
    setDither(paramTypedArray.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_dither, mDither));
  }
  
  public void addState(@NonNull int[] paramArrayOfInt, @NonNull Drawable paramDrawable, int paramInt)
  {
    ObjectsCompat.requireNonNull(paramDrawable);
    mState.addStateSet(paramArrayOfInt, paramDrawable, paramInt);
    onStateChange(getState());
  }
  
  public <T extends Drawable,  extends Animatable> void addTransition(int paramInt1, int paramInt2, @NonNull T paramT, boolean paramBoolean)
  {
    ObjectsCompat.requireNonNull(paramT);
    mState.addTransition(paramInt1, paramInt2, paramT, paramBoolean);
  }
  
  public void clearMutated()
  {
    super.clearMutated();
    mMutated = false;
  }
  
  public AnimatedStateListState cloneConstantState()
  {
    return new AnimatedStateListState(mState, this, null);
  }
  
  public void inflate(@NonNull Context paramContext, @NonNull Resources paramResources, @NonNull XmlPullParser paramXmlPullParser, @NonNull AttributeSet paramAttributeSet, @Nullable Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    TypedArray localTypedArray = TypedArrayUtils.obtainAttributes(paramResources, paramTheme, paramAttributeSet, R.styleable.AnimatedStateListDrawableCompat);
    setVisible(localTypedArray.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_visible, true), true);
    updateStateFromTypedArray(localTypedArray);
    updateDensity(paramResources);
    localTypedArray.recycle();
    inflateChildElements(paramContext, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    init();
  }
  
  public boolean isStateful()
  {
    return true;
  }
  
  public void jumpToCurrentState()
  {
    super.jumpToCurrentState();
    Transition localTransition = mTransition;
    if (localTransition != null)
    {
      localTransition.stop();
      mTransition = null;
      selectDrawable(mTransitionToIndex);
      mTransitionToIndex = -1;
      mTransitionFromIndex = -1;
    }
  }
  
  @NonNull
  public Drawable mutate()
  {
    if ((!mMutated) && (super.mutate() == this))
    {
      mState.mutate();
      mMutated = true;
    }
    return this;
  }
  
  public boolean onStateChange(@NonNull int[] paramArrayOfInt)
  {
    int i = mState.indexOfKeyframe(paramArrayOfInt);
    boolean bool1;
    if ((i != getCurrentIndex()) && ((selectTransition(i)) || (selectDrawable(i)))) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    Drawable localDrawable = getCurrent();
    boolean bool2 = bool1;
    if (localDrawable != null) {
      bool2 = bool1 | localDrawable.setState(paramArrayOfInt);
    }
    return bool2;
  }
  
  public void setConstantState(@NonNull DrawableContainer.DrawableContainerState paramDrawableContainerState)
  {
    super.setConstantState(paramDrawableContainerState);
    if ((paramDrawableContainerState instanceof AnimatedStateListState)) {
      mState = ((AnimatedStateListState)paramDrawableContainerState);
    }
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    Transition localTransition = mTransition;
    if ((localTransition != null) && ((bool) || (paramBoolean2))) {
      if (paramBoolean1) {
        localTransition.start();
      } else {
        jumpToCurrentState();
      }
    }
    return bool;
  }
  
  public static class AnimatableTransition
    extends AnimatedStateListDrawableCompat.Transition
  {
    private final Animatable mA;
    
    public AnimatableTransition(Animatable paramAnimatable)
    {
      super();
      mA = paramAnimatable;
    }
    
    public void start()
    {
      mA.start();
    }
    
    public void stop()
    {
      mA.stop();
    }
  }
  
  public static class AnimatedStateListState
    extends StateListDrawable.StateListState
  {
    private static final long REVERSED_BIT = 4294967296L;
    private static final long REVERSIBLE_FLAG_BIT = 8589934592L;
    public SparseArrayCompat<Integer> mStateIds;
    public LongSparseArray<Long> mTransitions;
    
    public AnimatedStateListState(@Nullable AnimatedStateListState paramAnimatedStateListState, @NonNull AnimatedStateListDrawableCompat paramAnimatedStateListDrawableCompat, @Nullable Resources paramResources)
    {
      super(paramAnimatedStateListDrawableCompat, paramResources);
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
  
  public static class AnimatedVectorDrawableTransition
    extends AnimatedStateListDrawableCompat.Transition
  {
    private final AnimatedVectorDrawableCompat mAvd;
    
    public AnimatedVectorDrawableTransition(AnimatedVectorDrawableCompat paramAnimatedVectorDrawableCompat)
    {
      super();
      mAvd = paramAnimatedVectorDrawableCompat;
    }
    
    public void start()
    {
      mAvd.start();
    }
    
    public void stop()
    {
      mAvd.stop();
    }
  }
  
  public static class AnimationDrawableTransition
    extends AnimatedStateListDrawableCompat.Transition
  {
    private final ObjectAnimator mAnim;
    private final boolean mHasReversibleFlag;
    
    public AnimationDrawableTransition(AnimationDrawable paramAnimationDrawable, boolean paramBoolean1, boolean paramBoolean2)
    {
      super();
      int i = paramAnimationDrawable.getNumberOfFrames();
      int j;
      if (paramBoolean1) {
        j = i - 1;
      } else {
        j = 0;
      }
      if (paramBoolean1) {
        i = 0;
      } else {
        i--;
      }
      AnimatedStateListDrawableCompat.FrameInterpolator localFrameInterpolator = new AnimatedStateListDrawableCompat.FrameInterpolator(paramAnimationDrawable, paramBoolean1);
      paramAnimationDrawable = ObjectAnimator.ofInt(paramAnimationDrawable, "currentIndex", new int[] { j, i });
      Compatibility.Api18Impl.setAutoCancel(paramAnimationDrawable, true);
      paramAnimationDrawable.setDuration(localFrameInterpolator.getTotalDuration());
      paramAnimationDrawable.setInterpolator(localFrameInterpolator);
      mHasReversibleFlag = paramBoolean2;
      mAnim = paramAnimationDrawable;
    }
    
    public boolean canReverse()
    {
      return mHasReversibleFlag;
    }
    
    public void reverse()
    {
      mAnim.reverse();
    }
    
    public void start()
    {
      mAnim.start();
    }
    
    public void stop()
    {
      mAnim.cancel();
    }
  }
  
  public static class FrameInterpolator
    implements TimeInterpolator
  {
    private int[] mFrameTimes;
    private int mFrames;
    private int mTotalDuration;
    
    public FrameInterpolator(AnimationDrawable paramAnimationDrawable, boolean paramBoolean)
    {
      updateFrames(paramAnimationDrawable, paramBoolean);
    }
    
    public float getInterpolation(float paramFloat)
    {
      int i = (int)(paramFloat * mTotalDuration + 0.5F);
      int j = mFrames;
      int[] arrayOfInt = mFrameTimes;
      for (int k = 0; k < j; k++)
      {
        int m = arrayOfInt[k];
        if (i < m) {
          break;
        }
        i -= m;
      }
      if (k < j) {
        paramFloat = i / mTotalDuration;
      } else {
        paramFloat = 0.0F;
      }
      return k / j + paramFloat;
    }
    
    public int getTotalDuration()
    {
      return mTotalDuration;
    }
    
    public int updateFrames(AnimationDrawable paramAnimationDrawable, boolean paramBoolean)
    {
      int i = paramAnimationDrawable.getNumberOfFrames();
      mFrames = i;
      int[] arrayOfInt = mFrameTimes;
      if ((arrayOfInt == null) || (arrayOfInt.length < i)) {
        mFrameTimes = new int[i];
      }
      arrayOfInt = mFrameTimes;
      int j = 0;
      int k = 0;
      while (j < i)
      {
        if (paramBoolean) {
          m = i - j - 1;
        } else {
          m = j;
        }
        int m = paramAnimationDrawable.getDuration(m);
        arrayOfInt[j] = m;
        k += m;
        j++;
      }
      mTotalDuration = k;
      return k;
    }
  }
  
  public static abstract class Transition
  {
    public boolean canReverse()
    {
      return false;
    }
    
    public void reverse() {}
    
    public abstract void start();
    
    public abstract void stop();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */