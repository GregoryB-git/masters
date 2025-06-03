package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.common.internal.Objects;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
public class MediaVariations
{
  public static final String SOURCE_ID_EXTRACTOR = "id_extractor";
  public static final String SOURCE_IMAGE_REQUEST = "request";
  public static final String SOURCE_INDEX_DB = "index_db";
  private final boolean mForceRequestForSpecifiedUri;
  private final String mMediaId;
  private final String mSource;
  @Nullable
  private final List<Variant> mVariants;
  
  private MediaVariations(Builder paramBuilder)
  {
    mMediaId = Builder.access$000(paramBuilder);
    mVariants = Builder.access$100(paramBuilder);
    mForceRequestForSpecifiedUri = Builder.access$200(paramBuilder);
    mSource = Builder.access$300(paramBuilder);
  }
  
  @Nullable
  public static MediaVariations forMediaId(@Nullable String paramString)
  {
    if ((paramString != null) && (!paramString.isEmpty())) {
      return newBuilderForMediaId(paramString).build();
    }
    return null;
  }
  
  public static Builder newBuilderForMediaId(String paramString)
  {
    return new Builder(paramString, null);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof MediaVariations;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (MediaVariations)paramObject;
    bool1 = bool2;
    if (Objects.equal(mMediaId, mMediaId))
    {
      bool1 = bool2;
      if (mForceRequestForSpecifiedUri == mForceRequestForSpecifiedUri)
      {
        bool1 = bool2;
        if (Objects.equal(mVariants, mVariants)) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public String getMediaId()
  {
    return mMediaId;
  }
  
  public List<Variant> getSortedVariants(Comparator<Variant> paramComparator)
  {
    int i = getVariantsCount();
    if (i == 0) {
      return Collections.emptyList();
    }
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      localArrayList.add(mVariants.get(j));
    }
    Collections.sort(localArrayList, paramComparator);
    return localArrayList;
  }
  
  public String getSource()
  {
    return mSource;
  }
  
  public Variant getVariant(int paramInt)
  {
    return (Variant)mVariants.get(paramInt);
  }
  
  public int getVariantsCount()
  {
    List localList = mVariants;
    int i;
    if (localList == null) {
      i = 0;
    } else {
      i = localList.size();
    }
    return i;
  }
  
  public int hashCode()
  {
    return Objects.hashCode(new Object[] { mMediaId, Boolean.valueOf(mForceRequestForSpecifiedUri), mVariants, mSource });
  }
  
  public boolean shouldForceRequestForSpecifiedUri()
  {
    return mForceRequestForSpecifiedUri;
  }
  
  public String toString()
  {
    return String.format(null, "%s-%b-%s-%s", new Object[] { mMediaId, Boolean.valueOf(mForceRequestForSpecifiedUri), mVariants, mSource });
  }
  
  public static class Builder
  {
    private boolean mForceRequestForSpecifiedUri = false;
    private final String mMediaId;
    private String mSource = "request";
    private List<MediaVariations.Variant> mVariants;
    
    private Builder(String paramString)
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
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Source {}
  
  public static final class Variant
  {
    @Nullable
    private final ImageRequest.CacheChoice mCacheChoice;
    private final int mHeight;
    private final Uri mUri;
    private final int mWidth;
    
    public Variant(Uri paramUri, int paramInt1, int paramInt2)
    {
      this(paramUri, paramInt1, paramInt2, null);
    }
    
    public Variant(Uri paramUri, int paramInt1, int paramInt2, @Nullable ImageRequest.CacheChoice paramCacheChoice)
    {
      mUri = paramUri;
      mWidth = paramInt1;
      mHeight = paramInt2;
      mCacheChoice = paramCacheChoice;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof Variant;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      paramObject = (Variant)paramObject;
      bool1 = bool2;
      if (Objects.equal(mUri, mUri))
      {
        bool1 = bool2;
        if (mWidth == mWidth)
        {
          bool1 = bool2;
          if (mHeight == mHeight)
          {
            bool1 = bool2;
            if (mCacheChoice == mCacheChoice) {
              bool1 = true;
            }
          }
        }
      }
      return bool1;
    }
    
    @Nullable
    public ImageRequest.CacheChoice getCacheChoice()
    {
      return mCacheChoice;
    }
    
    public int getHeight()
    {
      return mHeight;
    }
    
    public Uri getUri()
    {
      return mUri;
    }
    
    public int getWidth()
    {
      return mWidth;
    }
    
    public int hashCode()
    {
      return (mUri.hashCode() * 31 + mWidth) * 31 + mHeight;
    }
    
    public String toString()
    {
      return String.format(null, "%dx%d %s %s", new Object[] { Integer.valueOf(mWidth), Integer.valueOf(mHeight), mUri, mCacheChoice });
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.request.MediaVariations
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */