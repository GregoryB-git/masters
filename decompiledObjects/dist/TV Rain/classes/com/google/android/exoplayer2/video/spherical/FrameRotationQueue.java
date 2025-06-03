package com.google.android.exoplayer2.video.spherical;

import android.opengl.Matrix;
import com.google.android.exoplayer2.util.TimedValueQueue;

public final class FrameRotationQueue
{
  private final float[] recenterMatrix = new float[16];
  private boolean recenterMatrixComputed;
  private final float[] rotationMatrix = new float[16];
  private final TimedValueQueue<float[]> rotations = new TimedValueQueue();
  
  private static void computeRecenterMatrix(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    Matrix.setIdentityM(paramArrayOfFloat1, 0);
    float f1 = paramArrayOfFloat2[10];
    float f2 = paramArrayOfFloat2[8];
    float f3 = (float)Math.sqrt(f2 * f2 + f1 * f1);
    f2 = paramArrayOfFloat2[10];
    paramArrayOfFloat1[0] = (f2 / f3);
    f1 = paramArrayOfFloat2[8];
    paramArrayOfFloat1[2] = (f1 / f3);
    paramArrayOfFloat1[8] = (-f1 / f3);
    paramArrayOfFloat1[10] = (f2 / f3);
  }
  
  private static void getRotationMatrixFromAngleAxis(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    float f1 = paramArrayOfFloat2[0];
    float f2 = -paramArrayOfFloat2[1];
    float f3 = -paramArrayOfFloat2[2];
    float f4 = Matrix.length(f1, f2, f3);
    if (f4 != 0.0F) {
      Matrix.setRotateM(paramArrayOfFloat1, 0, (float)Math.toDegrees(f4), f1 / f4, f2 / f4, f3 / f4);
    } else {
      Matrix.setIdentityM(paramArrayOfFloat1, 0);
    }
  }
  
  public boolean pollRotationMatrix(float[] paramArrayOfFloat, long paramLong)
  {
    float[] arrayOfFloat = (float[])rotations.pollFloor(paramLong);
    if (arrayOfFloat == null) {
      return false;
    }
    getRotationMatrixFromAngleAxis(rotationMatrix, arrayOfFloat);
    if (!recenterMatrixComputed)
    {
      computeRecenterMatrix(recenterMatrix, rotationMatrix);
      recenterMatrixComputed = true;
    }
    Matrix.multiplyMM(paramArrayOfFloat, 0, recenterMatrix, 0, rotationMatrix, 0);
    return true;
  }
  
  public void reset()
  {
    rotations.clear();
    recenterMatrixComputed = false;
  }
  
  public void setRotation(long paramLong, float[] paramArrayOfFloat)
  {
    rotations.add(paramLong, paramArrayOfFloat);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.video.spherical.FrameRotationQueue
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */