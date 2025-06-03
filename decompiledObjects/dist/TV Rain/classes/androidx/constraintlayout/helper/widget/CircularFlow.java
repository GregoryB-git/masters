package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R.styleable;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;
import java.util.HashMap;
import z2;

public class CircularFlow
  extends VirtualLayout
{
  private static float DEFAULT_ANGLE = 0.0F;
  private static int DEFAULT_RADIUS = 0;
  private static final String TAG = "CircularFlow";
  private float[] mAngles;
  public ConstraintLayout mContainer;
  private int mCountAngle;
  private int mCountRadius;
  private int[] mRadius;
  private String mReferenceAngles;
  private Float mReferenceDefaultAngle;
  private Integer mReferenceDefaultRadius;
  private String mReferenceRadius;
  public int mViewCenter;
  
  public CircularFlow(Context paramContext)
  {
    super(paramContext);
  }
  
  public CircularFlow(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public CircularFlow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private void addAngle(String paramString)
  {
    if ((paramString != null) && (paramString.length() != 0))
    {
      if (myContext == null) {
        return;
      }
      float[] arrayOfFloat = mAngles;
      if (arrayOfFloat == null) {
        return;
      }
      if (mCountAngle + 1 > arrayOfFloat.length) {
        mAngles = Arrays.copyOf(arrayOfFloat, arrayOfFloat.length + 1);
      }
      mAngles[mCountAngle] = Integer.parseInt(paramString);
      mCountAngle += 1;
    }
  }
  
  private void addRadius(String paramString)
  {
    if ((paramString != null) && (paramString.length() != 0))
    {
      if (myContext == null) {
        return;
      }
      int[] arrayOfInt = mRadius;
      if (arrayOfInt == null) {
        return;
      }
      if (mCountRadius + 1 > arrayOfInt.length) {
        mRadius = Arrays.copyOf(arrayOfInt, arrayOfInt.length + 1);
      }
      mRadius[mCountRadius] = ((int)(Integer.parseInt(paramString) * myContext.getResources().getDisplayMetrics().density));
      mCountRadius += 1;
    }
  }
  
  private void anchorReferences()
  {
    mContainer = ((ConstraintLayout)getParent());
    for (int i = 0; i < mCount; i++)
    {
      View localView = mContainer.getViewById(mIds[i]);
      if (localView != null)
      {
        int j = DEFAULT_RADIUS;
        float f = DEFAULT_ANGLE;
        Object localObject = mRadius;
        if ((localObject != null) && (i < localObject.length))
        {
          j = localObject[i];
        }
        else
        {
          localObject = mReferenceDefaultRadius;
          if ((localObject != null) && (((Integer)localObject).intValue() != -1))
          {
            mCountRadius += 1;
            if (mRadius == null) {
              mRadius = new int[1];
            }
            localObject = getRadius();
            mRadius = ((int[])localObject);
            localObject[(mCountRadius - 1)] = j;
          }
          else
          {
            localObject = z2.t("Added radius to view with id: ");
            ((StringBuilder)localObject).append((String)mMap.get(Integer.valueOf(localView.getId())));
            Log.e("CircularFlow", ((StringBuilder)localObject).toString());
          }
        }
        localObject = mAngles;
        if ((localObject != null) && (i < localObject.length))
        {
          f = localObject[i];
        }
        else
        {
          localObject = mReferenceDefaultAngle;
          if ((localObject != null) && (((Float)localObject).floatValue() != -1.0F))
          {
            mCountAngle += 1;
            if (mAngles == null) {
              mAngles = new float[1];
            }
            localObject = getAngles();
            mAngles = ((float[])localObject);
            localObject[(mCountAngle - 1)] = f;
          }
          else
          {
            localObject = z2.t("Added angle to view with id: ");
            ((StringBuilder)localObject).append((String)mMap.get(Integer.valueOf(localView.getId())));
            Log.e("CircularFlow", ((StringBuilder)localObject).toString());
          }
        }
        localObject = (ConstraintLayout.LayoutParams)localView.getLayoutParams();
        circleAngle = f;
        circleConstraint = mViewCenter;
        circleRadius = j;
        localView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
    }
    applyLayoutFeatures();
  }
  
  private float[] removeAngle(float[] paramArrayOfFloat, int paramInt)
  {
    float[] arrayOfFloat = paramArrayOfFloat;
    if (paramArrayOfFloat != null)
    {
      arrayOfFloat = paramArrayOfFloat;
      if (paramInt >= 0) {
        if (paramInt >= mCountAngle) {
          arrayOfFloat = paramArrayOfFloat;
        } else {
          arrayOfFloat = removeElementFromArray(paramArrayOfFloat, paramInt);
        }
      }
    }
    return arrayOfFloat;
  }
  
  public static float[] removeElementFromArray(float[] paramArrayOfFloat, int paramInt)
  {
    float[] arrayOfFloat = new float[paramArrayOfFloat.length - 1];
    int i = 0;
    int j = 0;
    while (i < paramArrayOfFloat.length)
    {
      if (i != paramInt)
      {
        arrayOfFloat[j] = paramArrayOfFloat[i];
        j++;
      }
      i++;
    }
    return arrayOfFloat;
  }
  
  public static int[] removeElementFromArray(int[] paramArrayOfInt, int paramInt)
  {
    int[] arrayOfInt = new int[paramArrayOfInt.length - 1];
    int i = 0;
    int j = 0;
    while (i < paramArrayOfInt.length)
    {
      if (i != paramInt)
      {
        arrayOfInt[j] = paramArrayOfInt[i];
        j++;
      }
      i++;
    }
    return arrayOfInt;
  }
  
  private int[] removeRadius(int[] paramArrayOfInt, int paramInt)
  {
    int[] arrayOfInt = paramArrayOfInt;
    if (paramArrayOfInt != null)
    {
      arrayOfInt = paramArrayOfInt;
      if (paramInt >= 0) {
        if (paramInt >= mCountRadius) {
          arrayOfInt = paramArrayOfInt;
        } else {
          arrayOfInt = removeElementFromArray(paramArrayOfInt, paramInt);
        }
      }
    }
    return arrayOfInt;
  }
  
  private void setAngles(String paramString)
  {
    if (paramString == null) {
      return;
    }
    int i = 0;
    mCountAngle = 0;
    for (;;)
    {
      int j = paramString.indexOf(',', i);
      if (j == -1)
      {
        addAngle(paramString.substring(i).trim());
        return;
      }
      addAngle(paramString.substring(i, j).trim());
      i = j + 1;
    }
  }
  
  private void setRadius(String paramString)
  {
    if (paramString == null) {
      return;
    }
    int i = 0;
    mCountRadius = 0;
    for (;;)
    {
      int j = paramString.indexOf(',', i);
      if (j == -1)
      {
        addRadius(paramString.substring(i).trim());
        return;
      }
      addRadius(paramString.substring(i, j).trim());
      i = j + 1;
    }
  }
  
  public void addViewToCircularFlow(View paramView, int paramInt, float paramFloat)
  {
    if (containsId(paramView.getId())) {
      return;
    }
    addView(paramView);
    mCountAngle += 1;
    paramView = getAngles();
    mAngles = paramView;
    paramView[(mCountAngle - 1)] = paramFloat;
    mCountRadius += 1;
    paramView = getRadius();
    mRadius = paramView;
    paramView[(mCountRadius - 1)] = ((int)(paramInt * myContext.getResources().getDisplayMetrics().density));
    anchorReferences();
  }
  
  public float[] getAngles()
  {
    return Arrays.copyOf(mAngles, mCountAngle);
  }
  
  public int[] getRadius()
  {
    return Arrays.copyOf(mRadius, mCountRadius);
  }
  
  public void init(AttributeSet paramAttributeSet)
  {
    super.init(paramAttributeSet);
    if (paramAttributeSet != null)
    {
      paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.ConstraintLayout_Layout);
      int i = paramAttributeSet.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramAttributeSet.getIndex(j);
        if (k == R.styleable.ConstraintLayout_Layout_circularflow_viewCenter)
        {
          mViewCenter = paramAttributeSet.getResourceId(k, 0);
        }
        else
        {
          Object localObject;
          if (k == R.styleable.ConstraintLayout_Layout_circularflow_angles)
          {
            localObject = paramAttributeSet.getString(k);
            mReferenceAngles = ((String)localObject);
            setAngles((String)localObject);
          }
          else if (k == R.styleable.ConstraintLayout_Layout_circularflow_radiusInDP)
          {
            localObject = paramAttributeSet.getString(k);
            mReferenceRadius = ((String)localObject);
            setRadius((String)localObject);
          }
          else if (k == R.styleable.ConstraintLayout_Layout_circularflow_defaultAngle)
          {
            localObject = Float.valueOf(paramAttributeSet.getFloat(k, DEFAULT_ANGLE));
            mReferenceDefaultAngle = ((Float)localObject);
            setDefaultAngle(((Float)localObject).floatValue());
          }
          else if (k == R.styleable.ConstraintLayout_Layout_circularflow_defaultRadius)
          {
            localObject = Integer.valueOf(paramAttributeSet.getDimensionPixelSize(k, DEFAULT_RADIUS));
            mReferenceDefaultRadius = ((Integer)localObject);
            setDefaultRadius(((Integer)localObject).intValue());
          }
        }
      }
      paramAttributeSet.recycle();
    }
  }
  
  public boolean isUpdatable(View paramView)
  {
    boolean bool1 = containsId(paramView.getId());
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    if (indexFromId(paramView.getId()) != -1) {
      bool2 = true;
    }
    return bool2;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    Object localObject = mReferenceAngles;
    if (localObject != null)
    {
      mAngles = new float[1];
      setAngles((String)localObject);
    }
    localObject = mReferenceRadius;
    if (localObject != null)
    {
      mRadius = new int[1];
      setRadius((String)localObject);
    }
    localObject = mReferenceDefaultAngle;
    if (localObject != null) {
      setDefaultAngle(((Float)localObject).floatValue());
    }
    localObject = mReferenceDefaultRadius;
    if (localObject != null) {
      setDefaultRadius(((Integer)localObject).intValue());
    }
    anchorReferences();
  }
  
  public int removeView(View paramView)
  {
    int i = super.removeView(paramView);
    if (i == -1) {
      return i;
    }
    ConstraintSet localConstraintSet = new ConstraintSet();
    localConstraintSet.clone(mContainer);
    localConstraintSet.clear(paramView.getId(), 8);
    localConstraintSet.applyTo(mContainer);
    paramView = mAngles;
    if (i < paramView.length)
    {
      mAngles = removeAngle(paramView, i);
      mCountAngle -= 1;
    }
    paramView = mRadius;
    if (i < paramView.length)
    {
      mRadius = removeRadius(paramView, i);
      mCountRadius -= 1;
    }
    anchorReferences();
    return i;
  }
  
  public void setDefaultAngle(float paramFloat)
  {
    DEFAULT_ANGLE = paramFloat;
  }
  
  public void setDefaultRadius(int paramInt)
  {
    DEFAULT_RADIUS = paramInt;
  }
  
  public void updateAngle(View paramView, float paramFloat)
  {
    if (!isUpdatable(paramView))
    {
      StringBuilder localStringBuilder = z2.t("It was not possible to update angle to view with id: ");
      localStringBuilder.append(paramView.getId());
      Log.e("CircularFlow", localStringBuilder.toString());
      return;
    }
    int i = indexFromId(paramView.getId());
    if (i > mAngles.length) {
      return;
    }
    paramView = getAngles();
    mAngles = paramView;
    paramView[i] = paramFloat;
    anchorReferences();
  }
  
  public void updateRadius(View paramView, int paramInt)
  {
    if (!isUpdatable(paramView))
    {
      StringBuilder localStringBuilder = z2.t("It was not possible to update radius to view with id: ");
      localStringBuilder.append(paramView.getId());
      Log.e("CircularFlow", localStringBuilder.toString());
      return;
    }
    int i = indexFromId(paramView.getId());
    if (i > mRadius.length) {
      return;
    }
    paramView = getRadius();
    mRadius = paramView;
    paramView[i] = ((int)(paramInt * myContext.getResources().getDisplayMetrics().density));
    anchorReferences();
  }
  
  public void updateReference(View paramView, int paramInt, float paramFloat)
  {
    if (!isUpdatable(paramView))
    {
      StringBuilder localStringBuilder = z2.t("It was not possible to update radius and angle to view with id: ");
      localStringBuilder.append(paramView.getId());
      Log.e("CircularFlow", localStringBuilder.toString());
      return;
    }
    int i = indexFromId(paramView.getId());
    if (getAngles().length > i)
    {
      paramView = getAngles();
      mAngles = paramView;
      paramView[i] = paramFloat;
    }
    if (getRadius().length > i)
    {
      paramView = getRadius();
      mRadius = paramView;
      paramView[i] = ((int)(paramInt * myContext.getResources().getDisplayMetrics().density));
    }
    anchorReferences();
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.helper.widget.CircularFlow
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */