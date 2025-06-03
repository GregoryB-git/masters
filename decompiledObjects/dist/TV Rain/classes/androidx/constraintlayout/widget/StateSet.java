package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class StateSet
{
  private static final boolean DEBUG = false;
  public static final String TAG = "ConstraintLayoutStates";
  private SparseArray<ConstraintSet> mConstraintSetMap = new SparseArray();
  private ConstraintsChangedListener mConstraintsChangedListener = null;
  public int mCurrentConstraintNumber = -1;
  public int mCurrentStateId = -1;
  public ConstraintSet mDefaultConstraintSet;
  public int mDefaultState = -1;
  private SparseArray<State> mStateList = new SparseArray();
  
  public StateSet(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    load(paramContext, paramXmlPullParser);
  }
  
  private void load(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    Object localObject1 = paramContext.obtainStyledAttributes(Xml.asAttributeSet(paramXmlPullParser), R.styleable.StateSet);
    int i = ((TypedArray)localObject1).getIndexCount();
    for (int j = 0; j < i; j++)
    {
      int k = ((TypedArray)localObject1).getIndex(j);
      if (k == R.styleable.StateSet_defaultState) {
        mDefaultState = ((TypedArray)localObject1).getResourceId(k, mDefaultState);
      }
    }
    ((TypedArray)localObject1).recycle();
    localObject1 = null;
    try
    {
      j = paramXmlPullParser.getEventType();
      for (;;)
      {
        i = 1;
        if (j == 1) {
          break;
        }
        Object localObject2;
        if (j != 0)
        {
          if (j != 2)
          {
            if (j != 3)
            {
              localObject2 = localObject1;
            }
            else
            {
              localObject2 = localObject1;
              if (!"StateSet".equals(paramXmlPullParser.getName())) {}
            }
          }
          else
          {
            localObject2 = paramXmlPullParser.getName();
            switch (((String)localObject2).hashCode())
            {
            default: 
              break;
            case 1901439077: 
              if (((String)localObject2).equals("Variant")) {
                j = 3;
              }
              break;
            case 1382829617: 
              if (((String)localObject2).equals("StateSet")) {
                j = i;
              }
              break;
            case 1301459538: 
              if (((String)localObject2).equals("LayoutDescription")) {
                j = 0;
              }
              break;
            case 80204913: 
              if (((String)localObject2).equals("State")) {
                j = 2;
              }
              break;
            }
            j = -1;
            if (j != 2)
            {
              if (j != 3)
              {
                localObject2 = localObject1;
              }
              else
              {
                Variant localVariant = new androidx/constraintlayout/widget/StateSet$Variant;
                localVariant.<init>(paramContext, paramXmlPullParser);
                localObject2 = localObject1;
                if (localObject1 != null)
                {
                  ((State)localObject1).add(localVariant);
                  localObject2 = localObject1;
                }
              }
            }
            else
            {
              localObject2 = new androidx/constraintlayout/widget/StateSet$State;
              ((State)localObject2).<init>(paramContext, paramXmlPullParser);
              mStateList.put(mId, localObject2);
            }
          }
        }
        else
        {
          paramXmlPullParser.getName();
          localObject2 = localObject1;
        }
        j = paramXmlPullParser.next();
        localObject1 = localObject2;
      }
      return;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    catch (XmlPullParserException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  public int convertToConstraintSet(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2)
  {
    State localState = (State)mStateList.get(paramInt2);
    if (localState == null) {
      return paramInt2;
    }
    if ((paramFloat1 != -1.0F) && (paramFloat2 != -1.0F))
    {
      localObject = null;
      Iterator localIterator = mVariants.iterator();
      while (localIterator.hasNext())
      {
        Variant localVariant = (Variant)localIterator.next();
        if (localVariant.match(paramFloat1, paramFloat2))
        {
          if (paramInt1 == mConstraintID) {
            return paramInt1;
          }
          localObject = localVariant;
        }
      }
      if (localObject != null) {
        return mConstraintID;
      }
      return mConstraintID;
    }
    if (mConstraintID == paramInt1) {
      return paramInt1;
    }
    Object localObject = mVariants.iterator();
    while (((Iterator)localObject).hasNext()) {
      if (paramInt1 == nextmConstraintID) {
        return paramInt1;
      }
    }
    return mConstraintID;
  }
  
  public boolean needsToChange(int paramInt, float paramFloat1, float paramFloat2)
  {
    int i = mCurrentStateId;
    if (i != paramInt) {
      return true;
    }
    if (paramInt == -1) {
      localObject = mStateList.valueAt(0);
    } else {
      localObject = mStateList.get(i);
    }
    Object localObject = (State)localObject;
    paramInt = mCurrentConstraintNumber;
    if ((paramInt != -1) && (((Variant)mVariants.get(paramInt)).match(paramFloat1, paramFloat2))) {
      return false;
    }
    return mCurrentConstraintNumber != ((State)localObject).findMatch(paramFloat1, paramFloat2);
  }
  
  public void setOnConstraintsChanged(ConstraintsChangedListener paramConstraintsChangedListener)
  {
    mConstraintsChangedListener = paramConstraintsChangedListener;
  }
  
  public int stateGetConstraintID(int paramInt1, int paramInt2, int paramInt3)
  {
    return updateConstraints(-1, paramInt1, paramInt2, paramInt3);
  }
  
  public int updateConstraints(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2)
  {
    if (paramInt1 == paramInt2)
    {
      if (paramInt2 == -1) {
        localState = (State)mStateList.valueAt(0);
      } else {
        localState = (State)mStateList.get(mCurrentStateId);
      }
      if (localState == null) {
        return -1;
      }
      if ((mCurrentConstraintNumber != -1) && (((Variant)mVariants.get(paramInt1)).match(paramFloat1, paramFloat2))) {
        return paramInt1;
      }
      paramInt2 = localState.findMatch(paramFloat1, paramFloat2);
      if (paramInt1 == paramInt2) {
        return paramInt1;
      }
      if (paramInt2 == -1) {
        paramInt1 = mConstraintID;
      } else {
        paramInt1 = mVariants.get(paramInt2)).mConstraintID;
      }
      return paramInt1;
    }
    State localState = (State)mStateList.get(paramInt2);
    if (localState == null) {
      return -1;
    }
    paramInt1 = localState.findMatch(paramFloat1, paramFloat2);
    if (paramInt1 == -1) {
      paramInt1 = mConstraintID;
    } else {
      paramInt1 = mVariants.get(paramInt1)).mConstraintID;
    }
    return paramInt1;
  }
  
  public static class State
  {
    public int mConstraintID = -1;
    public int mId;
    public boolean mIsLayout;
    public ArrayList<StateSet.Variant> mVariants = new ArrayList();
    
    public State(Context paramContext, XmlPullParser paramXmlPullParser)
    {
      int i = 0;
      mIsLayout = false;
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(Xml.asAttributeSet(paramXmlPullParser), R.styleable.State);
      int j = localTypedArray.getIndexCount();
      while (i < j)
      {
        int k = localTypedArray.getIndex(i);
        if (k == R.styleable.State_android_id)
        {
          mId = localTypedArray.getResourceId(k, mId);
        }
        else if (k == R.styleable.State_constraints)
        {
          mConstraintID = localTypedArray.getResourceId(k, mConstraintID);
          paramXmlPullParser = paramContext.getResources().getResourceTypeName(mConstraintID);
          paramContext.getResources().getResourceName(mConstraintID);
          if ("layout".equals(paramXmlPullParser)) {
            mIsLayout = true;
          }
        }
        i++;
      }
      localTypedArray.recycle();
    }
    
    public void add(StateSet.Variant paramVariant)
    {
      mVariants.add(paramVariant);
    }
    
    public int findMatch(float paramFloat1, float paramFloat2)
    {
      for (int i = 0; i < mVariants.size(); i++) {
        if (((StateSet.Variant)mVariants.get(i)).match(paramFloat1, paramFloat2)) {
          return i;
        }
      }
      return -1;
    }
  }
  
  public static class Variant
  {
    public int mConstraintID = -1;
    public int mId;
    public boolean mIsLayout;
    public float mMaxHeight = NaN.0F;
    public float mMaxWidth = NaN.0F;
    public float mMinHeight = NaN.0F;
    public float mMinWidth = NaN.0F;
    
    public Variant(Context paramContext, XmlPullParser paramXmlPullParser)
    {
      int i = 0;
      mIsLayout = false;
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(Xml.asAttributeSet(paramXmlPullParser), R.styleable.Variant);
      int j = localTypedArray.getIndexCount();
      while (i < j)
      {
        int k = localTypedArray.getIndex(i);
        if (k == R.styleable.Variant_constraints)
        {
          mConstraintID = localTypedArray.getResourceId(k, mConstraintID);
          paramXmlPullParser = paramContext.getResources().getResourceTypeName(mConstraintID);
          paramContext.getResources().getResourceName(mConstraintID);
          if ("layout".equals(paramXmlPullParser)) {
            mIsLayout = true;
          }
        }
        else if (k == R.styleable.Variant_region_heightLessThan)
        {
          mMaxHeight = localTypedArray.getDimension(k, mMaxHeight);
        }
        else if (k == R.styleable.Variant_region_heightMoreThan)
        {
          mMinHeight = localTypedArray.getDimension(k, mMinHeight);
        }
        else if (k == R.styleable.Variant_region_widthLessThan)
        {
          mMaxWidth = localTypedArray.getDimension(k, mMaxWidth);
        }
        else if (k == R.styleable.Variant_region_widthMoreThan)
        {
          mMinWidth = localTypedArray.getDimension(k, mMinWidth);
        }
        else
        {
          Log.v("ConstraintLayoutStates", "Unknown tag");
        }
        i++;
      }
      localTypedArray.recycle();
    }
    
    public boolean match(float paramFloat1, float paramFloat2)
    {
      if ((!Float.isNaN(mMinWidth)) && (paramFloat1 < mMinWidth)) {
        return false;
      }
      if ((!Float.isNaN(mMinHeight)) && (paramFloat2 < mMinHeight)) {
        return false;
      }
      if ((!Float.isNaN(mMaxWidth)) && (paramFloat1 > mMaxWidth)) {
        return false;
      }
      return (Float.isNaN(mMaxHeight)) || (paramFloat2 <= mMaxHeight);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.StateSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */