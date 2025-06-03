package com.facebook.share.model;

public enum ShareMedia$Type
{
  static
  {
    Type localType1 = new Type("PHOTO", 0);
    PHOTO = localType1;
    Type localType2 = new Type("VIDEO", 1);
    VIDEO = localType2;
    $VALUES = new Type[] { localType1, localType2 };
  }
  
  private ShareMedia$Type() {}
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareMedia.Type
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */