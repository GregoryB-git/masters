package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintLayoutStates
{
  private static final boolean DEBUG = false;
  public static final String TAG = "ConstraintLayoutStates";
  private final ConstraintLayout mConstraintLayout;
  private SparseArray<ConstraintSet> mConstraintSetMap = new SparseArray();
  private ConstraintsChangedListener mConstraintsChangedListener = null;
  public int mCurrentConstraintNumber = -1;
  public int mCurrentStateId = -1;
  public ConstraintSet mDefaultConstraintSet;
  private SparseArray<State> mStateList = new SparseArray();
  
  public ConstraintLayoutStates(Context paramContext, ConstraintLayout paramConstraintLayout, int paramInt)
  {
    mConstraintLayout = paramConstraintLayout;
    load(paramContext, paramInt);
  }
  
  private void load(Context paramContext, int paramInt)
  {
    XmlResourceParser localXmlResourceParser = paramContext.getResources().getXml(paramInt);
    Object localObject1 = null;
    try
    {
      paramInt = localXmlResourceParser.getEventType();
      for (;;)
      {
        int i = 1;
        if (paramInt == 1) {
          break;
        }
        Object localObject2;
        if (paramInt != 0)
        {
          if (paramInt != 2)
          {
            localObject2 = localObject1;
          }
          else
          {
            localObject2 = localXmlResourceParser.getName();
            switch (((String)localObject2).hashCode())
            {
            default: 
              break;
            case 1901439077: 
              if (((String)localObject2).equals("Variant")) {
                paramInt = 3;
              }
              break;
            case 1657696882: 
              if (((String)localObject2).equals("layoutDescription")) {
                paramInt = 0;
              }
              break;
            case 1382829617: 
              if (((String)localObject2).equals("StateSet")) {
                paramInt = i;
              }
              break;
            case 80204913: 
              if (((String)localObject2).equals("State")) {
                paramInt = 2;
              }
              break;
            case -1349929691: 
              if (((String)localObject2).equals("ConstraintSet")) {
                paramInt = 4;
              }
              break;
            }
            paramInt = -1;
            if (paramInt != 2)
            {
              if (paramInt != 3)
              {
                if (paramInt != 4)
                {
                  localObject2 = localObject1;
                }
                else
                {
                  parseConstraintSet(paramContext, localXmlResourceParser);
                  localObject2 = localObject1;
                }
              }
              else
              {
                Variant localVariant = new androidx/constraintlayout/widget/ConstraintLayoutStates$Variant;
                localVariant.<init>(paramContext, localXmlResourceParser);
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
              localObject2 = new androidx/constraintlayout/widget/ConstraintLayoutStates$State;
              ((State)localObject2).<init>(paramContext, localXmlResourceParser);
              mStateList.put(mId, localObject2);
            }
          }
        }
        else
        {
          localXmlResourceParser.getName();
          localObject2 = localObject1;
        }
        paramInt = localXmlResourceParser.next();
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
  
  private void parseConstraintSet(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    ConstraintSet localConstraintSet = new ConstraintSet();
    int i = paramXmlPullParser.getAttributeCount();
    for (int j = 0; j < i; j++)
    {
      String str1 = paramXmlPullParser.getAttributeName(j);
      String str2 = paramXmlPullParser.getAttributeValue(j);
      if ((str1 != null) && (str2 != null) && ("id".equals(str1)))
      {
        if (str2.contains("/"))
        {
          str1 = str2.substring(str2.indexOf('/') + 1);
          j = paramContext.getResources().getIdentifier(str1, "id", paramContext.getPackageName());
        }
        else
        {
          j = -1;
        }
        i = j;
        if (j == -1) {
          if (str2.length() > 1)
          {
            i = Integer.parseInt(str2.substring(1));
          }
          else
          {
            Log.e("ConstraintLayoutStates", "error in parsing id");
            i = j;
          }
        }
        localConstraintSet.load(paramContext, paramXmlPullParser);
        mConstraintSetMap.put(i, localConstraintSet);
        break;
      }
    }
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
  
  public void updateConstraints(int paramInt, float paramFloat1, float paramFloat2)
  {
    int i = mCurrentStateId;
    Object localObject1;
    Object localObject2;
    if (i == paramInt)
    {
      if (paramInt == -1) {
        localObject1 = (State)mStateList.valueAt(0);
      } else {
        localObject1 = (State)mStateList.get(i);
      }
      paramInt = mCurrentConstraintNumber;
      if ((paramInt != -1) && (((Variant)mVariants.get(paramInt)).match(paramFloat1, paramFloat2))) {
        return;
      }
      i = ((State)localObject1).findMatch(paramFloat1, paramFloat2);
      if (mCurrentConstraintNumber == i) {
        return;
      }
      if (i == -1) {
        localObject2 = mDefaultConstraintSet;
      } else {
        localObject2 = mVariants.get(i)).mConstraintSet;
      }
      if (i == -1) {
        paramInt = mConstraintID;
      } else {
        paramInt = mVariants.get(i)).mConstraintID;
      }
      if (localObject2 == null) {
        return;
      }
      mCurrentConstraintNumber = i;
      localObject1 = mConstraintsChangedListener;
      if (localObject1 != null) {
        ((ConstraintsChangedListener)localObject1).preLayoutChange(-1, paramInt);
      }
      ((ConstraintSet)localObject2).applyTo(mConstraintLayout);
      localObject1 = mConstraintsChangedListener;
      if (localObject1 != null) {
        ((ConstraintsChangedListener)localObject1).postLayoutChange(-1, paramInt);
      }
    }
    else
    {
      mCurrentStateId = paramInt;
      localObject2 = (State)mStateList.get(paramInt);
      int j = ((State)localObject2).findMatch(paramFloat1, paramFloat2);
      if (j == -1) {
        localObject1 = mConstraintSet;
      } else {
        localObject1 = mVariants.get(j)).mConstraintSet;
      }
      if (j == -1) {
        i = mConstraintID;
      } else {
        i = mVariants.get(j)).mConstraintID;
      }
      if (localObject1 == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("NO Constraint set found ! id=");
        ((StringBuilder)localObject1).append(paramInt);
        ((StringBuilder)localObject1).append(", dim =");
        ((StringBuilder)localObject1).append(paramFloat1);
        ((StringBuilder)localObject1).append(", ");
        ((StringBuilder)localObject1).append(paramFloat2);
        Log.v("ConstraintLayoutStates", ((StringBuilder)localObject1).toString());
        return;
      }
      mCurrentConstraintNumber = j;
      localObject2 = mConstraintsChangedListener;
      if (localObject2 != null) {
        ((ConstraintsChangedListener)localObject2).preLayoutChange(paramInt, i);
      }
      ((ConstraintSet)localObject1).applyTo(mConstraintLayout);
      localObject1 = mConstraintsChangedListener;
      if (localObject1 != null) {
        ((ConstraintsChangedListener)localObject1).postLayoutChange(paramInt, i);
      }
    }
  }
  
  public static class State
  {
    public int mConstraintID = -1;
    public ConstraintSet mConstraintSet;
    public int mId;
    public ArrayList<ConstraintLayoutStates.Variant> mVariants = new ArrayList();
    
    public State(Context paramContext, XmlPullParser paramXmlPullParser)
    {
      paramXmlPullParser = paramContext.obtainStyledAttributes(Xml.asAttributeSet(paramXmlPullParser), R.styleable.State);
      int i = paramXmlPullParser.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramXmlPullParser.getIndex(j);
        if (k == R.styleable.State_android_id)
        {
          mId = paramXmlPullParser.getResourceId(k, mId);
        }
        else if (k == R.styleable.State_constraints)
        {
          mConstraintID = paramXmlPullParser.getResourceId(k, mConstraintID);
          Object localObject = paramContext.getResources().getResourceTypeName(mConstraintID);
          paramContext.getResources().getResourceName(mConstraintID);
          if ("layout".equals(localObject))
          {
            localObject = new ConstraintSet();
            mConstraintSet = ((ConstraintSet)localObject);
            ((ConstraintSet)localObject).clone(paramContext, mConstraintID);
          }
        }
      }
      paramXmlPullParser.recycle();
    }
    
    public void add(ConstraintLayoutStates.Variant paramVariant)
    {
      mVariants.add(paramVariant);
    }
    
    public int findMatch(float paramFloat1, float paramFloat2)
    {
      for (int i = 0; i < mVariants.size(); i++) {
        if (((ConstraintLayoutStates.Variant)mVariants.get(i)).match(paramFloat1, paramFloat2)) {
          return i;
        }
      }
      return -1;
    }
  }
  
  public static class Variant
  {
    public int mConstraintID = -1;
    public ConstraintSet mConstraintSet;
    public int mId;
    public float mMaxHeight = NaN.0F;
    public float mMaxWidth = NaN.0F;
    public float mMinHeight = NaN.0F;
    public float mMinWidth = NaN.0F;
    
    public Variant(Context paramContext, XmlPullParser paramXmlPullParser)
    {
      paramXmlPullParser = paramContext.obtainStyledAttributes(Xml.asAttributeSet(paramXmlPullParser), R.styleable.Variant);
      int i = paramXmlPullParser.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramXmlPullParser.getIndex(j);
        if (k == R.styleable.Variant_constraints)
        {
          mConstraintID = paramXmlPullParser.getResourceId(k, mConstraintID);
          Object localObject = paramContext.getResources().getResourceTypeName(mConstraintID);
          paramContext.getResources().getResourceName(mConstraintID);
          if ("layout".equals(localObject))
          {
            localObject = new ConstraintSet();
            mConstraintSet = ((ConstraintSet)localObject);
            ((ConstraintSet)localObject).clone(paramContext, mConstraintID);
          }
        }
        else if (k == R.styleable.Variant_region_heightLessThan)
        {
          mMaxHeight = paramXmlPullParser.getDimension(k, mMaxHeight);
        }
        else if (k == R.styleable.Variant_region_heightMoreThan)
        {
          mMinHeight = paramXmlPullParser.getDimension(k, mMinHeight);
        }
        else if (k == R.styleable.Variant_region_widthLessThan)
        {
          mMaxWidth = paramXmlPullParser.getDimension(k, mMaxWidth);
        }
        else if (k == R.styleable.Variant_region_widthMoreThan)
        {
          mMinWidth = paramXmlPullParser.getDimension(k, mMinWidth);
        }
        else
        {
          Log.v("ConstraintLayoutStates", "Unknown tag");
        }
      }
      paramXmlPullParser.recycle();
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
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintLayoutStates
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */