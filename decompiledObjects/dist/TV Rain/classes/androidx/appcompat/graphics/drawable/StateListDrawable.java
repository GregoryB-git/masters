package androidx.appcompat.graphics.drawable;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.resources.Compatibility.Api21Impl;
import androidx.appcompat.resources.R.styleable;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.content.res.TypedArrayUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
class StateListDrawable
  extends DrawableContainer
{
  private static final boolean DEBUG = false;
  private static final String TAG = "StateListDrawable";
  private boolean mMutated;
  private StateListState mStateListState;
  
  public StateListDrawable()
  {
    this(null, null);
  }
  
  public StateListDrawable(@Nullable StateListState paramStateListState)
  {
    if (paramStateListState != null) {
      setConstantState(paramStateListState);
    }
  }
  
  public StateListDrawable(StateListState paramStateListState, Resources paramResources)
  {
    setConstantState(new StateListState(paramStateListState, this, paramResources));
    onStateChange(getState());
  }
  
  private void inflateChildElements(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    StateListState localStateListState = mStateListState;
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
      if ((j == 2) && (k <= i) && (paramXmlPullParser.getName().equals("item")))
      {
        Object localObject = TypedArrayUtils.obtainAttributes(paramResources, paramTheme, paramAttributeSet, R.styleable.StateListDrawableItem);
        Drawable localDrawable = null;
        j = ((TypedArray)localObject).getResourceId(R.styleable.StateListDrawableItem_android_drawable, -1);
        if (j > 0) {
          localDrawable = ResourceManagerInternal.get().getDrawable(paramContext, j);
        }
        ((TypedArray)localObject).recycle();
        int[] arrayOfInt = extractStateSet(paramAttributeSet);
        localObject = localDrawable;
        if (localDrawable == null)
        {
          do
          {
            j = paramXmlPullParser.next();
          } while (j == 4);
          if (j == 2)
          {
            localObject = Compatibility.Api21Impl.createFromXmlInner(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
          }
          else
          {
            paramContext = new StringBuilder();
            paramContext.append(paramXmlPullParser.getPositionDescription());
            paramContext.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            throw new XmlPullParserException(paramContext.toString());
          }
        }
        localStateListState.addStateSet(arrayOfInt, (Drawable)localObject);
      }
    }
  }
  
  private void updateStateFromTypedArray(TypedArray paramTypedArray)
  {
    StateListState localStateListState = mStateListState;
    mChangingConfigurations |= Compatibility.Api21Impl.getChangingConfigurations(paramTypedArray);
    mVariablePadding = paramTypedArray.getBoolean(R.styleable.StateListDrawable_android_variablePadding, mVariablePadding);
    mConstantSize = paramTypedArray.getBoolean(R.styleable.StateListDrawable_android_constantSize, mConstantSize);
    mEnterFadeDuration = paramTypedArray.getInt(R.styleable.StateListDrawable_android_enterFadeDuration, mEnterFadeDuration);
    mExitFadeDuration = paramTypedArray.getInt(R.styleable.StateListDrawable_android_exitFadeDuration, mExitFadeDuration);
    mDither = paramTypedArray.getBoolean(R.styleable.StateListDrawable_android_dither, mDither);
  }
  
  public void addState(int[] paramArrayOfInt, Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      mStateListState.addStateSet(paramArrayOfInt, paramDrawable);
      onStateChange(getState());
    }
  }
  
  @RequiresApi(21)
  public void applyTheme(@NonNull Resources.Theme paramTheme)
  {
    super.applyTheme(paramTheme);
    onStateChange(getState());
  }
  
  public void clearMutated()
  {
    super.clearMutated();
    mMutated = false;
  }
  
  public StateListState cloneConstantState()
  {
    return new StateListState(mStateListState, this, null);
  }
  
  public int[] extractStateSet(AttributeSet paramAttributeSet)
  {
    int i = paramAttributeSet.getAttributeCount();
    int[] arrayOfInt = new int[i];
    int j = 0;
    int n;
    for (int k = j; j < i; k = n)
    {
      int m = paramAttributeSet.getAttributeNameResource(j);
      n = k;
      if (m != 0)
      {
        n = k;
        if (m != 16842960)
        {
          n = k;
          if (m != 16843161)
          {
            if (paramAttributeSet.getAttributeBooleanValue(j, false)) {
              n = m;
            } else {
              n = -m;
            }
            arrayOfInt[k] = n;
            n = k + 1;
          }
        }
      }
      j++;
    }
    return StateSet.trimStateSet(arrayOfInt, k);
  }
  
  int getStateCount()
  {
    return mStateListState.getChildCount();
  }
  
  Drawable getStateDrawable(int paramInt)
  {
    return mStateListState.getChild(paramInt);
  }
  
  public int getStateDrawableIndex(int[] paramArrayOfInt)
  {
    return mStateListState.indexOfStateSet(paramArrayOfInt);
  }
  
  public StateListState getStateListState()
  {
    return mStateListState;
  }
  
  int[] getStateSet(int paramInt)
  {
    return mStateListState.mStateSets[paramInt];
  }
  
  public void inflate(@NonNull Context paramContext, @NonNull Resources paramResources, @NonNull XmlPullParser paramXmlPullParser, @NonNull AttributeSet paramAttributeSet, @Nullable Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    TypedArray localTypedArray = TypedArrayUtils.obtainAttributes(paramResources, paramTheme, paramAttributeSet, R.styleable.StateListDrawable);
    setVisible(localTypedArray.getBoolean(R.styleable.StateListDrawable_android_visible, true), true);
    updateStateFromTypedArray(localTypedArray);
    updateDensity(paramResources);
    localTypedArray.recycle();
    inflateChildElements(paramContext, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    onStateChange(getState());
  }
  
  public boolean isStateful()
  {
    return true;
  }
  
  @NonNull
  public Drawable mutate()
  {
    if ((!mMutated) && (super.mutate() == this))
    {
      mStateListState.mutate();
      mMutated = true;
    }
    return this;
  }
  
  public boolean onStateChange(@NonNull int[] paramArrayOfInt)
  {
    boolean bool = super.onStateChange(paramArrayOfInt);
    int i = mStateListState.indexOfStateSet(paramArrayOfInt);
    int j = i;
    if (i < 0) {
      j = mStateListState.indexOfStateSet(StateSet.WILD_CARD);
    }
    if ((!selectDrawable(j)) && (!bool)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void setConstantState(@NonNull DrawableContainer.DrawableContainerState paramDrawableContainerState)
  {
    super.setConstantState(paramDrawableContainerState);
    if ((paramDrawableContainerState instanceof StateListState)) {
      mStateListState = ((StateListState)paramDrawableContainerState);
    }
  }
  
  public static class StateListState
    extends DrawableContainer.DrawableContainerState
  {
    public int[][] mStateSets;
    
    public StateListState(StateListState paramStateListState, StateListDrawable paramStateListDrawable, Resources paramResources)
    {
      super(paramStateListDrawable, paramResources);
      if (paramStateListState != null) {
        mStateSets = mStateSets;
      } else {
        mStateSets = new int[getCapacity()][];
      }
    }
    
    public int addStateSet(int[] paramArrayOfInt, Drawable paramDrawable)
    {
      int i = addChild(paramDrawable);
      mStateSets[i] = paramArrayOfInt;
      return i;
    }
    
    public void growArray(int paramInt1, int paramInt2)
    {
      super.growArray(paramInt1, paramInt2);
      int[][] arrayOfInt = new int[paramInt2][];
      System.arraycopy(mStateSets, 0, arrayOfInt, 0, paramInt1);
      mStateSets = arrayOfInt;
    }
    
    public int indexOfStateSet(int[] paramArrayOfInt)
    {
      int[][] arrayOfInt = mStateSets;
      int i = getChildCount();
      for (int j = 0; j < i; j++) {
        if (StateSet.stateSetMatches(arrayOfInt[j], paramArrayOfInt)) {
          return j;
        }
      }
      return -1;
    }
    
    public void mutate()
    {
      Object localObject = mStateSets;
      int[][] arrayOfInt = new int[localObject.length][];
      for (int i = localObject.length - 1; i >= 0; i--)
      {
        localObject = mStateSets[i];
        if (localObject != null) {
          localObject = (int[])((int[])localObject).clone();
        } else {
          localObject = null;
        }
        arrayOfInt[i] = localObject;
      }
      mStateSets = arrayOfInt;
    }
    
    @NonNull
    public Drawable newDrawable()
    {
      return new StateListDrawable(this, null);
    }
    
    @NonNull
    public Drawable newDrawable(Resources paramResources)
    {
      return new StateListDrawable(this, paramResources);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.graphics.drawable.StateListDrawable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */