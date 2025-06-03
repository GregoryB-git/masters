package com.facebook;

public enum GraphResponse$PagingDirection
{
  static
  {
    PagingDirection localPagingDirection1 = new PagingDirection("NEXT", 0);
    NEXT = localPagingDirection1;
    PagingDirection localPagingDirection2 = new PagingDirection("PREVIOUS", 1);
    PREVIOUS = localPagingDirection2;
    $VALUES = new PagingDirection[] { localPagingDirection1, localPagingDirection2 };
  }
  
  private GraphResponse$PagingDirection() {}
}

/* Location:
 * Qualified Name:     com.facebook.GraphResponse.PagingDirection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */