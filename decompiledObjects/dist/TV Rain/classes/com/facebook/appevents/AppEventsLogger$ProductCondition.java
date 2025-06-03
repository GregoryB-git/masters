package com.facebook.appevents;

public enum AppEventsLogger$ProductCondition
{
  static
  {
    ProductCondition localProductCondition1 = new ProductCondition("NEW", 0);
    NEW = localProductCondition1;
    ProductCondition localProductCondition2 = new ProductCondition("REFURBISHED", 1);
    REFURBISHED = localProductCondition2;
    ProductCondition localProductCondition3 = new ProductCondition("USED", 2);
    USED = localProductCondition3;
    $VALUES = new ProductCondition[] { localProductCondition1, localProductCondition2, localProductCondition3 };
  }
  
  private AppEventsLogger$ProductCondition() {}
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AppEventsLogger.ProductCondition
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */