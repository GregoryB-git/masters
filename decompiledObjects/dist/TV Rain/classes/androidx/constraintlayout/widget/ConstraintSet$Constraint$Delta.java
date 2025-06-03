package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.util.Log;
import java.util.Arrays;

class ConstraintSet$Constraint$Delta
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
  
  public void applyDelta(ConstraintSet.Constraint paramConstraint)
  {
    int i = 0;
    for (int j = 0; j < mCountInt; j++) {
      ConstraintSet.access$300(paramConstraint, mTypeInt[j], mValueInt[j]);
    }
    for (j = 0; j < mCountFloat; j++) {
      ConstraintSet.access$400(paramConstraint, mTypeFloat[j], mValueFloat[j]);
    }
    for (int k = 0;; k++)
    {
      j = i;
      if (k >= mCountString) {
        break;
      }
      ConstraintSet.access$500(paramConstraint, mTypeString[k], mValueString[k]);
    }
    while (j < mCountBoolean)
    {
      ConstraintSet.access$600(paramConstraint, mTypeBoolean[j], mValueBoolean[j]);
      j++;
    }
  }
  
  @SuppressLint({"LogConditional"})
  public void printDelta(String paramString)
  {
    Log.v(paramString, "int");
    int i = 0;
    StringBuilder localStringBuilder;
    for (int j = 0; j < mCountInt; j++)
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(mTypeInt[j]);
      localStringBuilder.append(" = ");
      localStringBuilder.append(mValueInt[j]);
      Log.v(paramString, localStringBuilder.toString());
    }
    Log.v(paramString, "float");
    for (j = 0; j < mCountFloat; j++)
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(mTypeFloat[j]);
      localStringBuilder.append(" = ");
      localStringBuilder.append(mValueFloat[j]);
      Log.v(paramString, localStringBuilder.toString());
    }
    Log.v(paramString, "strings");
    for (j = 0; j < mCountString; j++)
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(mTypeString[j]);
      localStringBuilder.append(" = ");
      localStringBuilder.append(mValueString[j]);
      Log.v(paramString, localStringBuilder.toString());
    }
    Log.v(paramString, "boolean");
    for (j = i; j < mCountBoolean; j++)
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(mTypeBoolean[j]);
      localStringBuilder.append(" = ");
      localStringBuilder.append(mValueBoolean[j]);
      Log.v(paramString, localStringBuilder.toString());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */