package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

class StateSet$State
{
  public int mConstraintID = -1;
  public int mId;
  public boolean mIsLayout;
  public ArrayList<StateSet.Variant> mVariants = new ArrayList();
  
  public StateSet$State(Context paramContext, XmlPullParser paramXmlPullParser)
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

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.StateSet.State
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */