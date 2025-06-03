package androidx.constraintlayout.utils.widget;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageView;

class ImageFilterView$ImageMatrix
{
  public float[] m = new float[20];
  public float mBrightness = 1.0F;
  public ColorMatrix mColorMatrix = new ColorMatrix();
  public float mContrast = 1.0F;
  public float mSaturation = 1.0F;
  public ColorMatrix mTmpColorMatrix = new ColorMatrix();
  public float mWarmth = 1.0F;
  
  private void brightness(float paramFloat)
  {
    float[] arrayOfFloat = m;
    arrayOfFloat[0] = paramFloat;
    arrayOfFloat[1] = 0.0F;
    arrayOfFloat[2] = 0.0F;
    arrayOfFloat[3] = 0.0F;
    arrayOfFloat[4] = 0.0F;
    arrayOfFloat[5] = 0.0F;
    arrayOfFloat[6] = paramFloat;
    arrayOfFloat[7] = 0.0F;
    arrayOfFloat[8] = 0.0F;
    arrayOfFloat[9] = 0.0F;
    arrayOfFloat[10] = 0.0F;
    arrayOfFloat[11] = 0.0F;
    arrayOfFloat[12] = paramFloat;
    arrayOfFloat[13] = 0.0F;
    arrayOfFloat[14] = 0.0F;
    arrayOfFloat[15] = 0.0F;
    arrayOfFloat[16] = 0.0F;
    arrayOfFloat[17] = 0.0F;
    arrayOfFloat[18] = 1.0F;
    arrayOfFloat[19] = 0.0F;
  }
  
  private void saturation(float paramFloat)
  {
    float f1 = 1.0F - paramFloat;
    float f2 = 0.2999F * f1;
    float f3 = 0.587F * f1;
    f1 *= 0.114F;
    float[] arrayOfFloat = m;
    arrayOfFloat[0] = (f2 + paramFloat);
    arrayOfFloat[1] = f3;
    arrayOfFloat[2] = f1;
    arrayOfFloat[3] = 0.0F;
    arrayOfFloat[4] = 0.0F;
    arrayOfFloat[5] = f2;
    arrayOfFloat[6] = (f3 + paramFloat);
    arrayOfFloat[7] = f1;
    arrayOfFloat[8] = 0.0F;
    arrayOfFloat[9] = 0.0F;
    arrayOfFloat[10] = f2;
    arrayOfFloat[11] = f3;
    arrayOfFloat[12] = (f1 + paramFloat);
    arrayOfFloat[13] = 0.0F;
    arrayOfFloat[14] = 0.0F;
    arrayOfFloat[15] = 0.0F;
    arrayOfFloat[16] = 0.0F;
    arrayOfFloat[17] = 0.0F;
    arrayOfFloat[18] = 1.0F;
    arrayOfFloat[19] = 0.0F;
  }
  
  private void warmth(float paramFloat)
  {
    float f1 = paramFloat;
    if (paramFloat <= 0.0F) {
      f1 = 0.01F;
    }
    paramFloat = 5000.0F / f1 / 100.0F;
    if (paramFloat > 66.0F)
    {
      double d = paramFloat - 60.0F;
      f2 = (float)Math.pow(d, -0.13320475816726685D) * 329.69873F;
      f1 = (float)Math.pow(d, 0.07551484555006027D) * 288.12216F;
    }
    else
    {
      f1 = (float)Math.log(paramFloat) * 99.4708F - 161.11957F;
      f2 = 255.0F;
    }
    if (paramFloat < 66.0F)
    {
      if (paramFloat > 19.0F) {
        paramFloat = (float)Math.log(paramFloat - 10.0F) * 138.51773F - 305.0448F;
      } else {
        paramFloat = 0.0F;
      }
    }
    else {
      paramFloat = 255.0F;
    }
    float f2 = Math.min(255.0F, Math.max(f2, 0.0F));
    f1 = Math.min(255.0F, Math.max(f1, 0.0F));
    paramFloat = Math.min(255.0F, Math.max(paramFloat, 0.0F));
    float f3 = (float)Math.log(50.0F);
    float f4 = (float)Math.log(40.0F);
    float f5 = Math.min(255.0F, Math.max(255.0F, 0.0F));
    f3 = Math.min(255.0F, Math.max(f3 * 99.4708F - 161.11957F, 0.0F));
    f4 = Math.min(255.0F, Math.max(f4 * 138.51773F - 305.0448F, 0.0F));
    f2 /= f5;
    f1 /= f3;
    paramFloat /= f4;
    float[] arrayOfFloat = m;
    arrayOfFloat[0] = f2;
    arrayOfFloat[1] = 0.0F;
    arrayOfFloat[2] = 0.0F;
    arrayOfFloat[3] = 0.0F;
    arrayOfFloat[4] = 0.0F;
    arrayOfFloat[5] = 0.0F;
    arrayOfFloat[6] = f1;
    arrayOfFloat[7] = 0.0F;
    arrayOfFloat[8] = 0.0F;
    arrayOfFloat[9] = 0.0F;
    arrayOfFloat[10] = 0.0F;
    arrayOfFloat[11] = 0.0F;
    arrayOfFloat[12] = paramFloat;
    arrayOfFloat[13] = 0.0F;
    arrayOfFloat[14] = 0.0F;
    arrayOfFloat[15] = 0.0F;
    arrayOfFloat[16] = 0.0F;
    arrayOfFloat[17] = 0.0F;
    arrayOfFloat[18] = 1.0F;
    arrayOfFloat[19] = 0.0F;
  }
  
  public void updateMatrix(ImageView paramImageView)
  {
    mColorMatrix.reset();
    float f = mSaturation;
    int i = 1;
    int j;
    if (f != 1.0F)
    {
      saturation(f);
      mColorMatrix.set(m);
      j = 1;
    }
    else
    {
      j = 0;
    }
    f = mContrast;
    if (f != 1.0F)
    {
      mTmpColorMatrix.setScale(f, f, f, 1.0F);
      mColorMatrix.postConcat(mTmpColorMatrix);
      j = 1;
    }
    f = mWarmth;
    if (f != 1.0F)
    {
      warmth(f);
      mTmpColorMatrix.set(m);
      mColorMatrix.postConcat(mTmpColorMatrix);
      j = 1;
    }
    f = mBrightness;
    if (f != 1.0F)
    {
      brightness(f);
      mTmpColorMatrix.set(m);
      mColorMatrix.postConcat(mTmpColorMatrix);
      j = i;
    }
    if (j != 0) {
      paramImageView.setColorFilter(new ColorMatrixColorFilter(mColorMatrix));
    } else {
      paramImageView.clearColorFilter();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.utils.widget.ImageFilterView.ImageMatrix
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */