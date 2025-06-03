package com.facebook;

class FacebookRequestError$Range
{
  private final int end;
  private final int start;
  
  private FacebookRequestError$Range(int paramInt1, int paramInt2)
  {
    start = paramInt1;
    end = paramInt2;
  }
  
  public boolean contains(int paramInt)
  {
    boolean bool;
    if ((start <= paramInt) && (paramInt <= end)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.facebook.FacebookRequestError.Range
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */