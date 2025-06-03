package com.facebook.share.model;

public enum GameRequestContent$Filters
{
  static
  {
    Filters localFilters1 = new Filters("APP_USERS", 0);
    APP_USERS = localFilters1;
    Filters localFilters2 = new Filters("APP_NON_USERS", 1);
    APP_NON_USERS = localFilters2;
    $VALUES = new Filters[] { localFilters1, localFilters2 };
  }
  
  private GameRequestContent$Filters() {}
}

/* Location:
 * Qualified Name:     com.facebook.share.model.GameRequestContent.Filters
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */