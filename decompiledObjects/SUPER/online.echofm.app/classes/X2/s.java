package X2;

public abstract class s
{
  public static int a(int paramInt, double paramDouble)
  {
    int i = Math.max(paramInt, 2);
    paramInt = Integer.highestOneBit(i);
    if (i > (int)(paramDouble * paramInt))
    {
      paramInt <<= 1;
      if (paramInt <= 0) {
        paramInt = 1073741824;
      }
      return paramInt;
    }
    return paramInt;
  }
  
  public static int b(int paramInt)
  {
    return (int)(Integer.rotateLeft((int)(paramInt * -862048943L), 15) * 461845907L);
  }
  
  public static int c(Object paramObject)
  {
    int i;
    if (paramObject == null) {
      i = 0;
    } else {
      i = paramObject.hashCode();
    }
    return b(i);
  }
}

/* Location:
 * Qualified Name:     X2.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */