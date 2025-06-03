package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

public class TypedBundle
{
  private static final int INITIAL_BOOLEAN = 4;
  private static final int INITIAL_FLOAT = 10;
  private static final int INITIAL_INT = 10;
  private static final int INITIAL_STRING = 5;
  public int mCountBoolean = 0;
  public int mCountFloat = 0;
  public int mCountInt = 0;
  public int mCountString = 0;
  public int[] mTypeBoolean = new int[4];
  public int[] mTypeFloat = new int[10];
  public int[] mTypeInt = new int[10];
  public int[] mTypeString = new int[5];
  public boolean[] mValueBoolean = new boolean[4];
  public float[] mValueFloat = new float[10];
  public int[] mValueInt = new int[10];
  public String[] mValueString = new String[5];
  
  public void add(int paramInt, float paramFloat)
  {
    int i = mCountFloat;
    Object localObject = mTypeFloat;
    if (i >= localObject.length)
    {
      mTypeFloat = Arrays.copyOf((int[])localObject, localObject.length * 2);
      localObject = mValueFloat;
      mValueFloat = Arrays.copyOf((float[])localObject, localObject.length * 2);
    }
    localObject = mTypeFloat;
    i = mCountFloat;
    localObject[i] = paramInt;
    localObject = mValueFloat;
    mCountFloat = (i + 1);
    localObject[i] = paramFloat;
  }
  
  public void add(int paramInt1, int paramInt2)
  {
    int i = mCountInt;
    int[] arrayOfInt = mTypeInt;
    if (i >= arrayOfInt.length)
    {
      mTypeInt = Arrays.copyOf(arrayOfInt, arrayOfInt.length * 2);
      arrayOfInt = mValueInt;
      mValueInt = Arrays.copyOf(arrayOfInt, arrayOfInt.length * 2);
    }
    arrayOfInt = mTypeInt;
    i = mCountInt;
    arrayOfInt[i] = paramInt1;
    arrayOfInt = mValueInt;
    mCountInt = (i + 1);
    arrayOfInt[i] = paramInt2;
  }
  
  public void add(int paramInt, String paramString)
  {
    int i = mCountString;
    Object localObject = mTypeString;
    if (i >= localObject.length)
    {
      mTypeString = Arrays.copyOf((int[])localObject, localObject.length * 2);
      localObject = mValueString;
      mValueString = ((String[])Arrays.copyOf((Object[])localObject, localObject.length * 2));
    }
    localObject = mTypeString;
    i = mCountString;
    localObject[i] = paramInt;
    localObject = mValueString;
    mCountString = (i + 1);
    localObject[i] = paramString;
  }
  
  public void add(int paramInt, boolean paramBoolean)
  {
    int i = mCountBoolean;
    Object localObject = mTypeBoolean;
    if (i >= localObject.length)
    {
      mTypeBoolean = Arrays.copyOf((int[])localObject, localObject.length * 2);
      localObject = mValueBoolean;
      mValueBoolean = Arrays.copyOf((boolean[])localObject, localObject.length * 2);
    }
    localObject = mTypeBoolean;
    i = mCountBoolean;
    localObject[i] = paramInt;
    localObject = mValueBoolean;
    mCountBoolean = (i + 1);
    localObject[i] = paramBoolean;
  }
  
  public void addIfNotNull(int paramInt, String paramString)
  {
    if (paramString != null) {
      add(paramInt, paramString);
    }
  }
  
  public void applyDelta(TypedBundle paramTypedBundle)
  {
    int i = 0;
    for (int j = 0; j < mCountInt; j++) {
      paramTypedBundle.add(mTypeInt[j], mValueInt[j]);
    }
    for (j = 0; j < mCountFloat; j++) {
      paramTypedBundle.add(mTypeFloat[j], mValueFloat[j]);
    }
    int k;
    for (j = 0;; j++)
    {
      k = i;
      if (j >= mCountString) {
        break;
      }
      paramTypedBundle.add(mTypeString[j], mValueString[j]);
    }
    while (k < mCountBoolean)
    {
      paramTypedBundle.add(mTypeBoolean[k], mValueBoolean[k]);
      k++;
    }
  }
  
  public void applyDelta(TypedValues paramTypedValues)
  {
    int i = 0;
    for (int j = 0; j < mCountInt; j++) {
      paramTypedValues.setValue(mTypeInt[j], mValueInt[j]);
    }
    for (j = 0; j < mCountFloat; j++) {
      paramTypedValues.setValue(mTypeFloat[j], mValueFloat[j]);
    }
    for (int k = 0;; k++)
    {
      j = i;
      if (k >= mCountString) {
        break;
      }
      paramTypedValues.setValue(mTypeString[k], mValueString[k]);
    }
    while (j < mCountBoolean)
    {
      paramTypedValues.setValue(mTypeBoolean[j], mValueBoolean[j]);
      j++;
    }
  }
  
  public void clear()
  {
    mCountBoolean = 0;
    mCountString = 0;
    mCountFloat = 0;
    mCountInt = 0;
  }
  
  public int getInteger(int paramInt)
  {
    for (int i = 0; i < mCountInt; i++) {
      if (mTypeInt[i] == paramInt) {
        return mValueInt[i];
      }
    }
    return -1;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.TypedBundle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */