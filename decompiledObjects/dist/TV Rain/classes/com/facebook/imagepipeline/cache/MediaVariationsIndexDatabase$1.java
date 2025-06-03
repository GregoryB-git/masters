package com.facebook.imagepipeline.cache;

import com.facebook.imagepipeline.request.MediaVariations;
import com.facebook.imagepipeline.request.MediaVariations.Builder;
import java.util.concurrent.Callable;

class MediaVariationsIndexDatabase$1
  implements Callable<MediaVariations>
{
  public MediaVariationsIndexDatabase$1(MediaVariationsIndexDatabase paramMediaVariationsIndexDatabase, String paramString, MediaVariations.Builder paramBuilder) {}
  
  public MediaVariations call()
    throws Exception
  {
    return this$0.getCachedVariantsSync(val$mediaId, val$mediaVariationsBuilder);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.MediaVariationsIndexDatabase.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */