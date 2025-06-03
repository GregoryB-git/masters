package com.facebook.common.internal;

public class Ints
{
  public static int max(int... paramVarArgs)
  {
    int i = paramVarArgs.length;
    int j = 1;
    boolean bool;
    if (i > 0) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool);
    for (int k = paramVarArgs[0]; j < paramVarArgs.length; k = i)
    {
      int m = paramVarArgs[j];
      i = k;
      if (m > k) {
        i = m;
      }
      j++;
    }
    return k;
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.internal.Ints
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */