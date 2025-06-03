package com.facebook.appevents.ml;

public class MTensor
{
  private int capacity;
  private float[] data;
  private int[] shape;
  
  public MTensor(int[] paramArrayOfInt)
  {
    shape = paramArrayOfInt;
    int i = getCapacity(paramArrayOfInt);
    capacity = i;
    data = new float[i];
  }
  
  private static int getCapacity(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    int j = 1;
    for (int k = 0; k < i; k++) {
      j *= paramArrayOfInt[k];
    }
    return j;
  }
  
  public float[] getData()
  {
    return data;
  }
  
  public int getShape(int paramInt)
  {
    return shape[paramInt];
  }
  
  public int getShapeSize()
  {
    return shape.length;
  }
  
  public void reshape(int[] paramArrayOfInt)
  {
    shape = paramArrayOfInt;
    int i = getCapacity(paramArrayOfInt);
    paramArrayOfInt = new float[i];
    System.arraycopy(data, 0, paramArrayOfInt, 0, Math.min(capacity, i));
    data = paramArrayOfInt;
    capacity = i;
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.ml.MTensor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */