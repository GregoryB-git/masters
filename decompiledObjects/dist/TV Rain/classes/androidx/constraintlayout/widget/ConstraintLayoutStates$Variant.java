package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;

class ConstraintLayoutStates$Variant
{
  public int mConstraintID = -1;
  public ConstraintSet mConstraintSet;
  public int mId;
  public float mMaxHeight = NaN.0F;
  public float mMaxWidth = NaN.0F;
  public float mMinHeight = NaN.0F;
  public float mMinWidth = NaN.0F;
  
  public ConstraintLayoutStates$Variant(Context paramContext, XmlPullParser paramXmlPullParser)
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

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintLayoutStates.Variant
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */