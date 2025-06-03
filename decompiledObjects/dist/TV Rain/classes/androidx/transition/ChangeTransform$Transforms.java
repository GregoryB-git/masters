package androidx.transition;

import android.view.View;
import androidx.core.view.ViewCompat;

class ChangeTransform$Transforms
{
  public final float mRotationX;
  public final float mRotationY;
  public final float mRotationZ;
  public final float mScaleX;
  public final float mScaleY;
  public final float mTranslationX;
  public final float mTranslationY;
  public final float mTranslationZ;
  
  public ChangeTransform$Transforms(View paramView)
  {
    mTranslationX = paramView.getTranslationX();
    mTranslationY = paramView.getTranslationY();
    mTranslationZ = ViewCompat.getTranslationZ(paramView);
    mScaleX = paramView.getScaleX();
    mScaleY = paramView.getScaleY();
    mRotationX = paramView.getRotationX();
    mRotationY = paramView.getRotationY();
    mRotationZ = paramView.getRotation();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Transforms;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (Transforms)paramObject;
    bool1 = bool2;
    if (mTranslationX == mTranslationX)
    {
      bool1 = bool2;
      if (mTranslationY == mTranslationY)
      {
        bool1 = bool2;
        if (mTranslationZ == mTranslationZ)
        {
          bool1 = bool2;
          if (mScaleX == mScaleX)
          {
            bool1 = bool2;
            if (mScaleY == mScaleY)
            {
              bool1 = bool2;
              if (mRotationX == mRotationX)
              {
                bool1 = bool2;
                if (mRotationY == mRotationY)
                {
                  bool1 = bool2;
                  if (mRotationZ == mRotationZ) {
                    bool1 = true;
                  }
                }
              }
            }
          }
        }
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    float f = mTranslationX;
    int i = 0;
    int j;
    if (f != 0.0F) {
      j = Float.floatToIntBits(f);
    } else {
      j = 0;
    }
    f = mTranslationY;
    int k;
    if (f != 0.0F) {
      k = Float.floatToIntBits(f);
    } else {
      k = 0;
    }
    f = mTranslationZ;
    int m;
    if (f != 0.0F) {
      m = Float.floatToIntBits(f);
    } else {
      m = 0;
    }
    f = mScaleX;
    int n;
    if (f != 0.0F) {
      n = Float.floatToIntBits(f);
    } else {
      n = 0;
    }
    f = mScaleY;
    int i1;
    if (f != 0.0F) {
      i1 = Float.floatToIntBits(f);
    } else {
      i1 = 0;
    }
    f = mRotationX;
    int i2;
    if (f != 0.0F) {
      i2 = Float.floatToIntBits(f);
    } else {
      i2 = 0;
    }
    f = mRotationY;
    int i3;
    if (f != 0.0F) {
      i3 = Float.floatToIntBits(f);
    } else {
      i3 = 0;
    }
    f = mRotationZ;
    if (f != 0.0F) {
      i = Float.floatToIntBits(f);
    }
    return ((((((j * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + i;
  }
  
  public void restore(View paramView)
  {
    ChangeTransform.setTransforms(paramView, mTranslationX, mTranslationY, mTranslationZ, mScaleX, mScaleY, mRotationX, mRotationY, mRotationZ);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ChangeTransform.Transforms
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */