package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

public class ConstraintSet$Transform
{
  private static final int ELEVATION = 11;
  private static final int ROTATION = 1;
  private static final int ROTATION_X = 2;
  private static final int ROTATION_Y = 3;
  private static final int SCALE_X = 4;
  private static final int SCALE_Y = 5;
  private static final int TRANSFORM_PIVOT_TARGET = 12;
  private static final int TRANSFORM_PIVOT_X = 6;
  private static final int TRANSFORM_PIVOT_Y = 7;
  private static final int TRANSLATION_X = 8;
  private static final int TRANSLATION_Y = 9;
  private static final int TRANSLATION_Z = 10;
  private static SparseIntArray mapToConstant;
  public boolean applyElevation = false;
  public float elevation = 0.0F;
  public boolean mApply = false;
  public float rotation = 0.0F;
  public float rotationX = 0.0F;
  public float rotationY = 0.0F;
  public float scaleX = 1.0F;
  public float scaleY = 1.0F;
  public int transformPivotTarget = -1;
  public float transformPivotX = NaN.0F;
  public float transformPivotY = NaN.0F;
  public float translationX = 0.0F;
  public float translationY = 0.0F;
  public float translationZ = 0.0F;
  
  static
  {
    SparseIntArray localSparseIntArray = new SparseIntArray();
    mapToConstant = localSparseIntArray;
    localSparseIntArray.append(R.styleable.Transform_android_rotation, 1);
    mapToConstant.append(R.styleable.Transform_android_rotationX, 2);
    mapToConstant.append(R.styleable.Transform_android_rotationY, 3);
    mapToConstant.append(R.styleable.Transform_android_scaleX, 4);
    mapToConstant.append(R.styleable.Transform_android_scaleY, 5);
    mapToConstant.append(R.styleable.Transform_android_transformPivotX, 6);
    mapToConstant.append(R.styleable.Transform_android_transformPivotY, 7);
    mapToConstant.append(R.styleable.Transform_android_translationX, 8);
    mapToConstant.append(R.styleable.Transform_android_translationY, 9);
    mapToConstant.append(R.styleable.Transform_android_translationZ, 10);
    mapToConstant.append(R.styleable.Transform_android_elevation, 11);
    mapToConstant.append(R.styleable.Transform_transformPivotTarget, 12);
  }
  
  public void copyFrom(Transform paramTransform)
  {
    mApply = mApply;
    rotation = rotation;
    rotationX = rotationX;
    rotationY = rotationY;
    scaleX = scaleX;
    scaleY = scaleY;
    transformPivotX = transformPivotX;
    transformPivotY = transformPivotY;
    transformPivotTarget = transformPivotTarget;
    translationX = translationX;
    translationY = translationY;
    translationZ = translationZ;
    applyElevation = applyElevation;
    elevation = elevation;
  }
  
  public void fillFromAttributeList(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.Transform);
    mApply = true;
    int i = paramContext.getIndexCount();
    for (int j = 0; j < i; j++)
    {
      int k = paramContext.getIndex(j);
      switch (mapToConstant.get(k))
      {
      default: 
        break;
      case 12: 
        transformPivotTarget = ConstraintSet.access$100(paramContext, k, transformPivotTarget);
        break;
      case 11: 
        applyElevation = true;
        elevation = paramContext.getDimension(k, elevation);
        break;
      case 10: 
        translationZ = paramContext.getDimension(k, translationZ);
        break;
      case 9: 
        translationY = paramContext.getDimension(k, translationY);
        break;
      case 8: 
        translationX = paramContext.getDimension(k, translationX);
        break;
      case 7: 
        transformPivotY = paramContext.getDimension(k, transformPivotY);
        break;
      case 6: 
        transformPivotX = paramContext.getDimension(k, transformPivotX);
        break;
      case 5: 
        scaleY = paramContext.getFloat(k, scaleY);
        break;
      case 4: 
        scaleX = paramContext.getFloat(k, scaleX);
        break;
      case 3: 
        rotationY = paramContext.getFloat(k, rotationY);
        break;
      case 2: 
        rotationX = paramContext.getFloat(k, rotationX);
        break;
      case 1: 
        rotation = paramContext.getFloat(k, rotation);
      }
    }
    paramContext.recycle();
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintSet.Transform
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */