package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

class ConstraintLayoutStates$State
{
  public int mConstraintID = -1;
  public ConstraintSet mConstraintSet;
  public int mId;
  public ArrayList<ConstraintLayoutStates.Variant> mVariants = new ArrayList();
  
  public ConstraintLayoutStates$State(Context paramContext, XmlPullParser paramXmlPullParser)
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

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintLayoutStates.State
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */