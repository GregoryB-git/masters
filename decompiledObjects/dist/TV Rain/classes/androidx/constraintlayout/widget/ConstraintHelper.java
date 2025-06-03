package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import z2;

public abstract class ConstraintHelper
  extends View
{
  public int mCount;
  public Helper mHelperWidget;
  public int[] mIds = new int[32];
  public HashMap<Integer, String> mMap = new HashMap();
  public String mReferenceIds;
  public String mReferenceTags;
  public boolean mUseViewMeasure = false;
  private View[] mViews = null;
  public Context myContext;
  
  public ConstraintHelper(Context paramContext)
  {
    super(paramContext);
    myContext = paramContext;
    init(null);
  }
  
  public ConstraintHelper(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    myContext = paramContext;
    init(paramAttributeSet);
  }
  
  public ConstraintHelper(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    myContext = paramContext;
    init(paramAttributeSet);
  }
  
  private void addID(String paramString)
  {
    if ((paramString != null) && (paramString.length() != 0))
    {
      if (myContext == null) {
        return;
      }
      paramString = paramString.trim();
      Object localObject;
      if ((getParent() instanceof ConstraintLayout)) {
        localObject = (ConstraintLayout)getParent();
      }
      int i = findId(paramString);
      if (i != 0)
      {
        mMap.put(Integer.valueOf(i), paramString);
        addRscID(i);
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Could not find id of \"");
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append("\"");
        Log.w("ConstraintHelper", ((StringBuilder)localObject).toString());
      }
    }
  }
  
  private void addRscID(int paramInt)
  {
    if (paramInt == getId()) {
      return;
    }
    int i = mCount;
    int[] arrayOfInt = mIds;
    if (i + 1 > arrayOfInt.length) {
      mIds = Arrays.copyOf(arrayOfInt, arrayOfInt.length * 2);
    }
    arrayOfInt = mIds;
    i = mCount;
    arrayOfInt[i] = paramInt;
    mCount = (i + 1);
  }
  
  private void addTag(String paramString)
  {
    if ((paramString != null) && (paramString.length() != 0))
    {
      if (myContext == null) {
        return;
      }
      String str = paramString.trim();
      paramString = null;
      if ((getParent() instanceof ConstraintLayout)) {
        paramString = (ConstraintLayout)getParent();
      }
      if (paramString == null)
      {
        Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
        return;
      }
      int i = paramString.getChildCount();
      for (int j = 0; j < i; j++)
      {
        View localView = paramString.getChildAt(j);
        Object localObject = localView.getLayoutParams();
        if (((localObject instanceof ConstraintLayout.LayoutParams)) && (str.equals(constraintTag))) {
          if (localView.getId() == -1)
          {
            localObject = z2.t("to use ConstraintTag view ");
            ((StringBuilder)localObject).append(localView.getClass().getSimpleName());
            ((StringBuilder)localObject).append(" must have an ID");
            Log.w("ConstraintHelper", ((StringBuilder)localObject).toString());
          }
          else
          {
            addRscID(localView.getId());
          }
        }
      }
    }
  }
  
  private int[] convertReferenceString(View paramView, String paramString)
  {
    String[] arrayOfString = paramString.split(",");
    paramView.getContext();
    paramString = new int[arrayOfString.length];
    int i = 0;
    int m;
    for (int j = 0; i < arrayOfString.length; j = m)
    {
      int k = findId(arrayOfString[i].trim());
      m = j;
      if (k != 0)
      {
        paramString[j] = k;
        m = j + 1;
      }
      i++;
    }
    paramView = paramString;
    if (j != arrayOfString.length) {
      paramView = Arrays.copyOf(paramString, j);
    }
    return paramView;
  }
  
  private int findId(ConstraintLayout paramConstraintLayout, String paramString)
  {
    if ((paramString != null) && (paramConstraintLayout != null))
    {
      Resources localResources = myContext.getResources();
      if (localResources == null) {
        return 0;
      }
      int i = paramConstraintLayout.getChildCount();
      for (int j = 0; j < i; j++)
      {
        View localView = paramConstraintLayout.getChildAt(j);
        Object localObject;
        if (localView.getId() != -1) {
          localObject = null;
        }
        try
        {
          String str = localResources.getResourceEntryName(localView.getId());
          localObject = str;
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          for (;;) {}
        }
        if (paramString.equals(localObject)) {
          return localView.getId();
        }
      }
    }
    else
    {
      return 0;
    }
  }
  
  private int findId(String paramString)
  {
    ConstraintLayout localConstraintLayout;
    if ((getParent() instanceof ConstraintLayout)) {
      localConstraintLayout = (ConstraintLayout)getParent();
    } else {
      localConstraintLayout = null;
    }
    boolean bool = isInEditMode();
    int i = 0;
    int j = i;
    if (bool)
    {
      j = i;
      if (localConstraintLayout != null)
      {
        Object localObject = localConstraintLayout.getDesignInformation(0, paramString);
        j = i;
        if ((localObject instanceof Integer)) {
          j = ((Integer)localObject).intValue();
        }
      }
    }
    i = j;
    if (j == 0)
    {
      i = j;
      if (localConstraintLayout != null) {
        i = findId(localConstraintLayout, paramString);
      }
    }
    j = i;
    if (i == 0) {}
    try
    {
      j = R.id.class.getField(paramString).getInt(null);
      i = j;
      if (j == 0) {
        i = myContext.getResources().getIdentifier(paramString, "id", myContext.getPackageName());
      }
      return i;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        j = i;
      }
    }
  }
  
  public void addView(View paramView)
  {
    if (paramView == this) {
      return;
    }
    if (paramView.getId() == -1)
    {
      Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
      return;
    }
    if (paramView.getParent() == null)
    {
      Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
      return;
    }
    mReferenceIds = null;
    addRscID(paramView.getId());
    requestLayout();
  }
  
  public void applyLayoutFeatures()
  {
    ViewParent localViewParent = getParent();
    if ((localViewParent != null) && ((localViewParent instanceof ConstraintLayout))) {
      applyLayoutFeatures((ConstraintLayout)localViewParent);
    }
  }
  
  public void applyLayoutFeatures(ConstraintLayout paramConstraintLayout)
  {
    int i = getVisibility();
    float f = getElevation();
    for (int j = 0; j < mCount; j++)
    {
      View localView = paramConstraintLayout.getViewById(mIds[j]);
      if (localView != null)
      {
        localView.setVisibility(i);
        if (f > 0.0F) {
          localView.setTranslationZ(localView.getTranslationZ() + f);
        }
      }
    }
  }
  
  public void applyLayoutFeaturesInConstraintSet(ConstraintLayout paramConstraintLayout) {}
  
  public boolean containsId(int paramInt)
  {
    int[] arrayOfInt = mIds;
    int i = arrayOfInt.length;
    boolean bool1 = false;
    boolean bool2;
    for (int j = 0;; j++)
    {
      bool2 = bool1;
      if (j >= i) {
        break;
      }
      if (arrayOfInt[j] == paramInt)
      {
        bool2 = true;
        break;
      }
    }
    return bool2;
  }
  
  public int[] getReferencedIds()
  {
    return Arrays.copyOf(mIds, mCount);
  }
  
  public View[] getViews(ConstraintLayout paramConstraintLayout)
  {
    View[] arrayOfView = mViews;
    if ((arrayOfView == null) || (arrayOfView.length != mCount)) {
      mViews = new View[mCount];
    }
    for (int i = 0; i < mCount; i++)
    {
      int j = mIds[i];
      mViews[i] = paramConstraintLayout.getViewById(j);
    }
    return mViews;
  }
  
  public int indexFromId(int paramInt)
  {
    int[] arrayOfInt = mIds;
    int i = arrayOfInt.length;
    int j = -1;
    for (int k = 0; k < i; k++)
    {
      int m = arrayOfInt[k];
      j++;
      if (m == paramInt) {
        return j;
      }
    }
    return j;
  }
  
  public void init(AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet != null)
    {
      paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.ConstraintLayout_Layout);
      int i = paramAttributeSet.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramAttributeSet.getIndex(j);
        String str;
        if (k == R.styleable.ConstraintLayout_Layout_constraint_referenced_ids)
        {
          str = paramAttributeSet.getString(k);
          mReferenceIds = str;
          setIds(str);
        }
        else if (k == R.styleable.ConstraintLayout_Layout_constraint_referenced_tags)
        {
          str = paramAttributeSet.getString(k);
          mReferenceTags = str;
          setReferenceTags(str);
        }
      }
      paramAttributeSet.recycle();
    }
  }
  
  public void loadParameters(ConstraintSet.Constraint paramConstraint, HelperWidget paramHelperWidget, ConstraintLayout.LayoutParams paramLayoutParams, SparseArray<ConstraintWidget> paramSparseArray)
  {
    ConstraintSet.Layout localLayout = layout;
    paramLayoutParams = mReferenceIds;
    if (paramLayoutParams != null)
    {
      setReferencedIds(paramLayoutParams);
    }
    else
    {
      paramLayoutParams = mReferenceIdString;
      if (paramLayoutParams != null) {
        if (paramLayoutParams.length() > 0)
        {
          paramLayoutParams = layout;
          mReferenceIds = convertReferenceString(this, mReferenceIdString);
        }
        else
        {
          layout.mReferenceIds = null;
        }
      }
    }
    if (paramHelperWidget != null)
    {
      paramHelperWidget.removeAllIds();
      if (layout.mReferenceIds != null) {
        for (int i = 0;; i++)
        {
          paramLayoutParams = layout.mReferenceIds;
          if (i >= paramLayoutParams.length) {
            break;
          }
          paramLayoutParams = (ConstraintWidget)paramSparseArray.get(paramLayoutParams[i]);
          if (paramLayoutParams != null) {
            paramHelperWidget.add(paramLayoutParams);
          }
        }
      }
    }
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    String str = mReferenceIds;
    if (str != null) {
      setIds(str);
    }
    str = mReferenceTags;
    if (str != null) {
      setReferenceTags(str);
    }
  }
  
  public void onDraw(Canvas paramCanvas) {}
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    if (mUseViewMeasure) {
      super.onMeasure(paramInt1, paramInt2);
    } else {
      setMeasuredDimension(0, 0);
    }
  }
  
  public int removeView(View paramView)
  {
    int i = paramView.getId();
    int j = -1;
    if (i == -1) {
      return -1;
    }
    mReferenceIds = null;
    int m;
    for (int k = 0;; k++)
    {
      m = j;
      if (k >= mCount) {
        break;
      }
      if (mIds[k] == i)
      {
        for (m = k;; m = j)
        {
          j = mCount;
          if (m >= j - 1) {
            break;
          }
          paramView = mIds;
          j = m + 1;
          paramView[m] = paramView[j];
        }
        mIds[(j - 1)] = 0;
        mCount = (j - 1);
        m = k;
        break;
      }
    }
    requestLayout();
    return m;
  }
  
  public void resolveRtl(ConstraintWidget paramConstraintWidget, boolean paramBoolean) {}
  
  public void setIds(String paramString)
  {
    mReferenceIds = paramString;
    if (paramString == null) {
      return;
    }
    int i = 0;
    mCount = 0;
    for (;;)
    {
      int j = paramString.indexOf(',', i);
      if (j == -1)
      {
        addID(paramString.substring(i));
        return;
      }
      addID(paramString.substring(i, j));
      i = j + 1;
    }
  }
  
  public void setReferenceTags(String paramString)
  {
    mReferenceTags = paramString;
    if (paramString == null) {
      return;
    }
    int i = 0;
    mCount = 0;
    for (;;)
    {
      int j = paramString.indexOf(',', i);
      if (j == -1)
      {
        addTag(paramString.substring(i));
        return;
      }
      addTag(paramString.substring(i, j));
      i = j + 1;
    }
  }
  
  public void setReferencedIds(int[] paramArrayOfInt)
  {
    mReferenceIds = null;
    int i = 0;
    mCount = 0;
    while (i < paramArrayOfInt.length)
    {
      addRscID(paramArrayOfInt[i]);
      i++;
    }
  }
  
  public void setTag(int paramInt, Object paramObject)
  {
    super.setTag(paramInt, paramObject);
    if ((paramObject == null) && (mReferenceIds == null)) {
      addRscID(paramInt);
    }
  }
  
  public void updatePostConstraints(ConstraintLayout paramConstraintLayout) {}
  
  public void updatePostLayout(ConstraintLayout paramConstraintLayout) {}
  
  public void updatePostMeasure(ConstraintLayout paramConstraintLayout) {}
  
  public void updatePreDraw(ConstraintLayout paramConstraintLayout) {}
  
  public void updatePreLayout(ConstraintWidgetContainer paramConstraintWidgetContainer, Helper paramHelper, SparseArray<ConstraintWidget> paramSparseArray)
  {
    paramHelper.removeAllIds();
    for (int i = 0; i < mCount; i++) {
      paramHelper.add((ConstraintWidget)paramSparseArray.get(mIds[i]));
    }
  }
  
  public void updatePreLayout(ConstraintLayout paramConstraintLayout)
  {
    if (isInEditMode()) {
      setIds(mReferenceIds);
    }
    Object localObject = mHelperWidget;
    if (localObject == null) {
      return;
    }
    ((Helper)localObject).removeAllIds();
    for (int i = 0; i < mCount; i++)
    {
      int j = mIds[i];
      View localView = paramConstraintLayout.getViewById(j);
      localObject = localView;
      if (localView == null)
      {
        String str = (String)mMap.get(Integer.valueOf(j));
        j = findId(paramConstraintLayout, str);
        localObject = localView;
        if (j != 0)
        {
          mIds[i] = j;
          mMap.put(Integer.valueOf(j), str);
          localObject = paramConstraintLayout.getViewById(j);
        }
      }
      if (localObject != null) {
        mHelperWidget.add(paramConstraintLayout.getViewWidget((View)localObject));
      }
    }
    mHelperWidget.updateConstraints(mLayoutWidget);
  }
  
  public void validateParams()
  {
    if (mHelperWidget == null) {
      return;
    }
    ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
    if ((localLayoutParams instanceof ConstraintLayout.LayoutParams)) {
      widget = ((ConstraintWidget)mHelperWidget);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */