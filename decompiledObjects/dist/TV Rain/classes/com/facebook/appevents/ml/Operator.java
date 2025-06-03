package com.facebook.appevents.ml;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

final class Operator
{
  public static void addmv(MTensor paramMTensor1, MTensor paramMTensor2)
  {
    if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
      return;
    }
    try
    {
      int i = paramMTensor1.getShape(0);
      int j = paramMTensor1.getShape(1);
      int k = paramMTensor1.getShape(2);
      paramMTensor1 = paramMTensor1.getData();
      paramMTensor2 = paramMTensor2.getData();
      for (int m = 0; m < i; m++) {
        for (int n = 0; n < j; n++) {
          for (int i1 = 0; i1 < k; i1++)
          {
            int i2 = n * k + m * j * k + i1;
            paramMTensor1[i2] += paramMTensor2[i1];
          }
        }
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramMTensor1, Operator.class);
    }
  }
  
  public static MTensor concatenate(MTensor[] paramArrayOfMTensor)
  {
    if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
      return null;
    }
    try
    {
      int i = paramArrayOfMTensor[0].getShape(0);
      int j = 0;
      int k = j;
      while (j < paramArrayOfMTensor.length)
      {
        k += paramArrayOfMTensor[j].getShape(1);
        j++;
      }
      MTensor localMTensor = new com/facebook/appevents/ml/MTensor;
      localMTensor.<init>(new int[] { i, k });
      float[] arrayOfFloat1 = localMTensor.getData();
      for (j = 0; j < i; j++)
      {
        int m = j * k;
        for (int n = 0; n < paramArrayOfMTensor.length; n++)
        {
          float[] arrayOfFloat2 = paramArrayOfMTensor[n].getData();
          int i1 = paramArrayOfMTensor[n].getShape(1);
          System.arraycopy(arrayOfFloat2, j * i1, arrayOfFloat1, m, i1);
          m += i1;
        }
      }
      return localMTensor;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramArrayOfMTensor, Operator.class);
    }
    return null;
  }
  
  public static MTensor conv1D(MTensor paramMTensor1, MTensor paramMTensor2)
  {
    if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
      return null;
    }
    try
    {
      int i = paramMTensor1.getShape(0);
      int j = paramMTensor1.getShape(1);
      int k = paramMTensor1.getShape(2);
      int m = paramMTensor2.getShape(0);
      int n = j - m + 1;
      int i1 = paramMTensor2.getShape(2);
      MTensor localMTensor = new com/facebook/appevents/ml/MTensor;
      localMTensor.<init>(new int[] { i, n, i1 });
      paramMTensor1 = paramMTensor1.getData();
      float[] arrayOfFloat = localMTensor.getData();
      paramMTensor2 = paramMTensor2.getData();
      for (int i2 = 0; i2 < i; i2++) {
        for (int i3 = 0; i3 < i1; i3++) {
          for (int i4 = 0;; i4++)
          {
            int i5 = 0;
            if (i4 >= n) {
              break;
            }
            float f = 0.0F;
            while (i5 < m)
            {
              for (int i6 = 0; i6 < k; i6++) {
                f = paramMTensor1[((i5 + i4) * k + j * k * i2 + i6)] * paramMTensor2[((i5 * k + i6) * i1 + i3)] + f;
              }
              i5++;
            }
            arrayOfFloat[(i4 * i1 + n * i1 * i2 + i3)] = f;
          }
        }
      }
      return localMTensor;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramMTensor1, Operator.class);
    }
    return null;
  }
  
  public static MTensor dense(MTensor paramMTensor1, MTensor paramMTensor2, MTensor paramMTensor3)
  {
    if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
      return null;
    }
    try
    {
      int i = paramMTensor1.getShape(0);
      int j = paramMTensor3.getShape(0);
      paramMTensor1 = mul(paramMTensor1, paramMTensor2);
      paramMTensor2 = paramMTensor3.getData();
      paramMTensor3 = paramMTensor1.getData();
      for (int k = 0; k < i; k++) {
        for (int m = 0; m < j; m++)
        {
          int n = k * j + m;
          paramMTensor3[n] += paramMTensor2[m];
        }
      }
      return paramMTensor1;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramMTensor1, Operator.class);
    }
    return null;
  }
  
  public static MTensor embedding(String[] paramArrayOfString, int paramInt, MTensor paramMTensor)
  {
    if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
      return null;
    }
    try
    {
      int i = paramArrayOfString.length;
      int j = paramMTensor.getShape(1);
      MTensor localMTensor = new com/facebook/appevents/ml/MTensor;
      localMTensor.<init>(new int[] { i, paramInt, j });
      float[] arrayOfFloat = localMTensor.getData();
      paramMTensor = paramMTensor.getData();
      for (int k = 0; k < i; k++)
      {
        int[] arrayOfInt = Utils.vectorize(paramArrayOfString[k], paramInt);
        for (int m = 0; m < paramInt; m++) {
          System.arraycopy(paramMTensor, arrayOfInt[m] * j, arrayOfFloat, j * m + j * paramInt * k, j);
        }
      }
      return localMTensor;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramArrayOfString, Operator.class);
    }
    return null;
  }
  
  public static void flatten(MTensor paramMTensor, int paramInt)
  {
    if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
      return;
    }
    try
    {
      if (paramInt >= paramMTensor.getShapeSize()) {
        return;
      }
      int i = 1;
      for (int j = paramInt; j < paramMTensor.getShapeSize(); j++) {
        i *= paramMTensor.getShape(j);
      }
      int[] arrayOfInt = new int[paramInt + 1];
      for (j = 0; j < paramInt; j++) {
        arrayOfInt[j] = paramMTensor.getShape(j);
      }
      arrayOfInt[paramInt] = i;
      paramMTensor.reshape(arrayOfInt);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramMTensor, Operator.class);
    }
  }
  
  public static MTensor maxPool1D(MTensor paramMTensor, int paramInt)
  {
    if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
      return null;
    }
    try
    {
      int i = paramMTensor.getShape(0);
      int j = paramMTensor.getShape(1);
      int k = paramMTensor.getShape(2);
      int m = j - paramInt + 1;
      MTensor localMTensor = new com/facebook/appevents/ml/MTensor;
      localMTensor.<init>(new int[] { i, m, k });
      float[] arrayOfFloat = paramMTensor.getData();
      paramMTensor = localMTensor.getData();
      for (int n = 0; n < i; n++) {
        for (int i1 = 0; i1 < k; i1++) {
          for (int i2 = 0; i2 < m; i2++)
          {
            int i3 = i2 * k;
            int i4 = n * m * k + i3 + i1;
            paramMTensor[i4] = Float.MIN_VALUE;
            for (int i5 = 0; i5 < paramInt; i5++) {
              paramMTensor[i4] = Math.max(paramMTensor[i4], arrayOfFloat[(i5 * k + (n * j * k + i3 + i1))]);
            }
          }
        }
      }
      return localMTensor;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramMTensor, Operator.class);
    }
    return null;
  }
  
  public static MTensor mul(MTensor paramMTensor1, MTensor paramMTensor2)
  {
    if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
      return null;
    }
    try
    {
      int i = paramMTensor1.getShape(0);
      int j = paramMTensor2.getShape(0);
      int k = paramMTensor2.getShape(1);
      MTensor localMTensor = new com/facebook/appevents/ml/MTensor;
      localMTensor.<init>(new int[] { i, k });
      paramMTensor1 = paramMTensor1.getData();
      float[] arrayOfFloat = paramMTensor2.getData();
      paramMTensor2 = localMTensor.getData();
      for (int m = 0; m < i; m++) {
        for (int n = 0; n < k; n++)
        {
          int i1 = m * k + n;
          paramMTensor2[i1] = 0.0F;
          for (int i2 = 0; i2 < j; i2++)
          {
            float f = paramMTensor2[i1];
            paramMTensor2[i1] = (paramMTensor1[(m * j + i2)] * arrayOfFloat[(i2 * k + n)] + f);
          }
        }
      }
      return localMTensor;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramMTensor1, Operator.class);
    }
    return null;
  }
  
  public static void relu(MTensor paramMTensor)
  {
    if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
      return;
    }
    try
    {
      paramMTensor = paramMTensor.getData();
      for (int i = 0; i < paramMTensor.length; i++) {
        if (paramMTensor[i] < 0.0F) {
          paramMTensor[i] = 0.0F;
        }
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramMTensor, Operator.class);
    }
  }
  
  public static void softmax(MTensor paramMTensor)
  {
    if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
      return;
    }
    int i = 0;
    try
    {
      int j = paramMTensor.getShape(0);
      int k = paramMTensor.getShape(1);
      paramMTensor = paramMTensor.getData();
      while (i < j)
      {
        int m = i * k;
        int n = m + k;
        float f1 = Float.MIN_VALUE;
        float f2 = 0.0F;
        int i1 = m;
        while (i1 < n)
        {
          float f3 = paramMTensor[i1];
          float f4 = f1;
          if (f3 > f1) {
            f4 = f3;
          }
          i1++;
          f1 = f4;
        }
        for (i1 = m; i1 < n; i1++) {
          paramMTensor[i1] = ((float)Math.exp(paramMTensor[i1] - f1));
        }
        i1 = m;
        f1 = f2;
        int i2;
        for (;;)
        {
          i2 = m;
          if (i1 >= n) {
            break;
          }
          f1 += paramMTensor[i1];
          i1++;
        }
        while (i2 < n)
        {
          paramMTensor[i2] /= f1;
          i2++;
        }
        i++;
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramMTensor, Operator.class);
    }
  }
  
  public static MTensor transpose2D(MTensor paramMTensor)
  {
    if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
      return null;
    }
    try
    {
      int i = paramMTensor.getShape(0);
      int j = paramMTensor.getShape(1);
      MTensor localMTensor = new com/facebook/appevents/ml/MTensor;
      localMTensor.<init>(new int[] { j, i });
      paramMTensor = paramMTensor.getData();
      float[] arrayOfFloat = localMTensor.getData();
      for (int k = 0; k < i; k++) {
        for (int m = 0; m < j; m++) {
          arrayOfFloat[(m * i + k)] = paramMTensor[(k * j + m)];
        }
      }
      return localMTensor;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramMTensor, Operator.class);
    }
    return null;
  }
  
  public static MTensor transpose3D(MTensor paramMTensor)
  {
    if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
      return null;
    }
    try
    {
      int i = paramMTensor.getShape(0);
      int j = paramMTensor.getShape(1);
      int k = paramMTensor.getShape(2);
      MTensor localMTensor = new com/facebook/appevents/ml/MTensor;
      localMTensor.<init>(new int[] { k, j, i });
      paramMTensor = paramMTensor.getData();
      float[] arrayOfFloat = localMTensor.getData();
      for (int m = 0; m < i; m++) {
        for (int n = 0; n < j; n++) {
          for (int i1 = 0; i1 < k; i1++) {
            arrayOfFloat[(n * i + i1 * i * j + m)] = paramMTensor[(n * k + m * j * k + i1)];
          }
        }
      }
      return localMTensor;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramMTensor, Operator.class);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.ml.Operator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */