package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.util.AttributeSet;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.TypedArrayUtils;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

class VectorDrawableCompat$VGroup
  extends VectorDrawableCompat.VObject
{
  public int mChangingConfigurations;
  public final ArrayList<VectorDrawableCompat.VObject> mChildren = new ArrayList();
  private String mGroupName;
  public final Matrix mLocalMatrix;
  private float mPivotX = 0.0F;
  private float mPivotY = 0.0F;
  public float mRotate = 0.0F;
  private float mScaleX = 1.0F;
  private float mScaleY = 1.0F;
  public final Matrix mStackedMatrix = new Matrix();
  private int[] mThemeAttrs;
  private float mTranslateX = 0.0F;
  private float mTranslateY = 0.0F;
  
  public VectorDrawableCompat$VGroup()
  {
    super(null);
    mLocalMatrix = new Matrix();
    mGroupName = null;
  }
  
  public VectorDrawableCompat$VGroup(VGroup paramVGroup, ArrayMap<String, Object> paramArrayMap)
  {
    super(null);
    Object localObject1 = new Matrix();
    mLocalMatrix = ((Matrix)localObject1);
    mGroupName = null;
    mRotate = mRotate;
    mPivotX = mPivotX;
    mPivotY = mPivotY;
    mScaleX = mScaleX;
    mScaleY = mScaleY;
    mTranslateX = mTranslateX;
    mTranslateY = mTranslateY;
    mThemeAttrs = mThemeAttrs;
    Object localObject2 = mGroupName;
    mGroupName = ((String)localObject2);
    mChangingConfigurations = mChangingConfigurations;
    if (localObject2 != null) {
      paramArrayMap.put(localObject2, this);
    }
    ((Matrix)localObject1).set(mLocalMatrix);
    localObject2 = mChildren;
    int i = 0;
    while (i < ((ArrayList)localObject2).size())
    {
      paramVGroup = ((ArrayList)localObject2).get(i);
      if ((paramVGroup instanceof VGroup))
      {
        paramVGroup = (VGroup)paramVGroup;
        mChildren.add(new VGroup(paramVGroup, paramArrayMap));
      }
      else
      {
        if ((paramVGroup instanceof VectorDrawableCompat.VFullPath))
        {
          paramVGroup = new VectorDrawableCompat.VFullPath((VectorDrawableCompat.VFullPath)paramVGroup);
        }
        else
        {
          if (!(paramVGroup instanceof VectorDrawableCompat.VClipPath)) {
            break label316;
          }
          paramVGroup = new VectorDrawableCompat.VClipPath((VectorDrawableCompat.VClipPath)paramVGroup);
        }
        mChildren.add(paramVGroup);
        localObject1 = mPathName;
        if (localObject1 != null) {
          paramArrayMap.put(localObject1, paramVGroup);
        }
      }
      i++;
      continue;
      label316:
      throw new IllegalStateException("Unknown object in the tree!");
    }
  }
  
  private void updateLocalMatrix()
  {
    mLocalMatrix.reset();
    mLocalMatrix.postTranslate(-mPivotX, -mPivotY);
    mLocalMatrix.postScale(mScaleX, mScaleY);
    mLocalMatrix.postRotate(mRotate, 0.0F, 0.0F);
    mLocalMatrix.postTranslate(mTranslateX + mPivotX, mTranslateY + mPivotY);
  }
  
  private void updateStateFromTypedArray(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
  {
    mThemeAttrs = null;
    mRotate = TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "rotation", 5, mRotate);
    mPivotX = paramTypedArray.getFloat(1, mPivotX);
    mPivotY = paramTypedArray.getFloat(2, mPivotY);
    mScaleX = TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "scaleX", 3, mScaleX);
    mScaleY = TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "scaleY", 4, mScaleY);
    mTranslateX = TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "translateX", 6, mTranslateX);
    mTranslateY = TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "translateY", 7, mTranslateY);
    paramTypedArray = paramTypedArray.getString(0);
    if (paramTypedArray != null) {
      mGroupName = paramTypedArray;
    }
    updateLocalMatrix();
  }
  
  public String getGroupName()
  {
    return mGroupName;
  }
  
  public Matrix getLocalMatrix()
  {
    return mLocalMatrix;
  }
  
  public float getPivotX()
  {
    return mPivotX;
  }
  
  public float getPivotY()
  {
    return mPivotY;
  }
  
  public float getRotation()
  {
    return mRotate;
  }
  
  public float getScaleX()
  {
    return mScaleX;
  }
  
  public float getScaleY()
  {
    return mScaleY;
  }
  
  public float getTranslateX()
  {
    return mTranslateX;
  }
  
  public float getTranslateY()
  {
    return mTranslateY;
  }
  
  public void inflate(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
  {
    paramResources = TypedArrayUtils.obtainAttributes(paramResources, paramTheme, paramAttributeSet, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_GROUP);
    updateStateFromTypedArray(paramResources, paramXmlPullParser);
    paramResources.recycle();
  }
  
  public boolean isStateful()
  {
    for (int i = 0; i < mChildren.size(); i++) {
      if (((VectorDrawableCompat.VObject)mChildren.get(i)).isStateful()) {
        return true;
      }
    }
    return false;
  }
  
  public boolean onStateChanged(int[] paramArrayOfInt)
  {
    int i = 0;
    boolean bool = false;
    while (i < mChildren.size())
    {
      bool |= ((VectorDrawableCompat.VObject)mChildren.get(i)).onStateChanged(paramArrayOfInt);
      i++;
    }
    return bool;
  }
  
  public void setPivotX(float paramFloat)
  {
    if (paramFloat != mPivotX)
    {
      mPivotX = paramFloat;
      updateLocalMatrix();
    }
  }
  
  public void setPivotY(float paramFloat)
  {
    if (paramFloat != mPivotY)
    {
      mPivotY = paramFloat;
      updateLocalMatrix();
    }
  }
  
  public void setRotation(float paramFloat)
  {
    if (paramFloat != mRotate)
    {
      mRotate = paramFloat;
      updateLocalMatrix();
    }
  }
  
  public void setScaleX(float paramFloat)
  {
    if (paramFloat != mScaleX)
    {
      mScaleX = paramFloat;
      updateLocalMatrix();
    }
  }
  
  public void setScaleY(float paramFloat)
  {
    if (paramFloat != mScaleY)
    {
      mScaleY = paramFloat;
      updateLocalMatrix();
    }
  }
  
  public void setTranslateX(float paramFloat)
  {
    if (paramFloat != mTranslateX)
    {
      mTranslateX = paramFloat;
      updateLocalMatrix();
    }
  }
  
  public void setTranslateY(float paramFloat)
  {
    if (paramFloat != mTranslateY)
    {
      mTranslateY = paramFloat;
      updateLocalMatrix();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */