package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import androidx.annotation.Nullable;

final class ContentMetadataInternal
{
  private static final String METADATA_NAME_CONTENT_LENGTH = "exo_len";
  private static final String METADATA_NAME_REDIRECTED_URI = "exo_redir";
  private static final String PREFIX = "exo_";
  
  public static long getContentLength(ContentMetadata paramContentMetadata)
  {
    return paramContentMetadata.get("exo_len", -1L);
  }
  
  @Nullable
  public static Uri getRedirectedUri(ContentMetadata paramContentMetadata)
  {
    Object localObject = null;
    paramContentMetadata = paramContentMetadata.get("exo_redir", null);
    if (paramContentMetadata == null) {
      paramContentMetadata = (ContentMetadata)localObject;
    } else {
      paramContentMetadata = Uri.parse(paramContentMetadata);
    }
    return paramContentMetadata;
  }
  
  public static void removeContentLength(ContentMetadataMutations paramContentMetadataMutations)
  {
    paramContentMetadataMutations.remove("exo_len");
  }
  
  public static void removeRedirectedUri(ContentMetadataMutations paramContentMetadataMutations)
  {
    paramContentMetadataMutations.remove("exo_redir");
  }
  
  public static void setContentLength(ContentMetadataMutations paramContentMetadataMutations, long paramLong)
  {
    paramContentMetadataMutations.set("exo_len", paramLong);
  }
  
  public static void setRedirectedUri(ContentMetadataMutations paramContentMetadataMutations, Uri paramUri)
  {
    paramContentMetadataMutations.set("exo_redir", paramUri.toString());
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.cache.ContentMetadataInternal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */