package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;

class StateSet$Variant
{
  public int mConstraintID = -1;
  public int mId;
  public boolean mIsLayout;
  public float mMaxHeight = NaN.0F;
  public float mMaxWidth = NaN.0F;
  public float mMinHeight = NaN.0F;
  public float mMinWidth = NaN.0F;
  
  public StateSet$Variant(Context paramContext, XmlPullParser paramXmlPullParser)
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

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.StateSet.Variant
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */