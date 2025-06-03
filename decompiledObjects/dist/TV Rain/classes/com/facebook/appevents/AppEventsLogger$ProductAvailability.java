package com.facebook.appevents;

public enum AppEventsLogger$ProductAvailability
{
  static
  {
    ProductAvailability localProductAvailability1 = new ProductAvailability("IN_STOCK", 0);
    IN_STOCK = localProductAvailability1;
    ProductAvailability localProductAvailability2 = new ProductAvailability("OUT_OF_STOCK", 1);
    OUT_OF_STOCK = localProductAvailability2;
    ProductAvailability localProductAvailability3 = new ProductAvailability("PREORDER", 2);
    PREORDER = localProductAvailability3;
    ProductAvailability localProductAvailability4 = new ProductAvailability("AVALIABLE_FOR_ORDER", 3);
    AVALIABLE_FOR_ORDER = localProductAvailability4;
    ProductAvailability localProductAvailability5 = new ProductAvailability("DISCONTINUED", 4);
    DISCONTINUED = localProductAvailability5;
    $VALUES = new ProductAvailability[] { localProductAvailability1, localProductAvailability2, localProductAvailability3, localProductAvailability4, localProductAvailability5 };
  }
  
  private AppEventsLogger$ProductAvailability() {}
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AppEventsLogger.ProductAvailability
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */