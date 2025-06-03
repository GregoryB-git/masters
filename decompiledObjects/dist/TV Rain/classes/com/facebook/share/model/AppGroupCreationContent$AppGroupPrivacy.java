package com.facebook.share.model;

public enum AppGroupCreationContent$AppGroupPrivacy
{
  static
  {
    AppGroupPrivacy localAppGroupPrivacy1 = new AppGroupPrivacy("Open", 0);
    Open = localAppGroupPrivacy1;
    AppGroupPrivacy localAppGroupPrivacy2 = new AppGroupPrivacy("Closed", 1);
    Closed = localAppGroupPrivacy2;
    $VALUES = new AppGroupPrivacy[] { localAppGroupPrivacy1, localAppGroupPrivacy2 };
  }
  
  private AppGroupCreationContent$AppGroupPrivacy() {}
}

/* Location:
 * Qualified Name:     com.facebook.share.model.AppGroupCreationContent.AppGroupPrivacy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */