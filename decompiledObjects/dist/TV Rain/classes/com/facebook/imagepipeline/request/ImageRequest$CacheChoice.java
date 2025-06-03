package com.facebook.imagepipeline.request;

public enum ImageRequest$CacheChoice
{
  static
  {
    CacheChoice localCacheChoice1 = new CacheChoice("SMALL", 0);
    SMALL = localCacheChoice1;
    CacheChoice localCacheChoice2 = new CacheChoice("DEFAULT", 1);
    DEFAULT = localCacheChoice2;
    $VALUES = new CacheChoice[] { localCacheChoice1, localCacheChoice2 };
  }
  
  private ImageRequest$CacheChoice() {}
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.request.ImageRequest.CacheChoice
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */