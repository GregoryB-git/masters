package com.facebook.imagepipeline.request;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

public class MediaVariations$Builder
{
  private boolean mForceRequestForSpecifiedUri = false;
  private final String mMediaId;
  private String mSource = "request";
  private List<MediaVariations.Variant> mVariants;
  
  private MediaVariations$Builder(String paramString)
  {
    mMediaId = paramString;
  }
  
  public Builder addVariant(Uri paramUri, int paramInt1, int paramInt2)
  {
    return addVariant(paramUri, paramInt1, paramInt2, null);
  }
  
  public Builder addVariant(Uri paramUri, int paramInt1, int paramInt2, ImageRequest.CacheChoice paramCacheChoice)
  {
    if (mVariants == null) {
      mVariants = new ArrayList();
    }
    mVariants.add(new MediaVariations.Variant(paramUri, paramInt1, paramInt2, paramCacheChoice));
    return this;
  }
  
  public MediaVariations build()
  {
    return new MediaVariations(this, null);
  }
  
  public Builder setForceRequestForSpecifiedUri(boolean paramBoolean)
  {
    mForceRequestForSpecifiedUri = paramBoolean;
    return this;
  }
  
  public Builder setSource(String paramString)
  {
    mSource = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.request.MediaVariations.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */