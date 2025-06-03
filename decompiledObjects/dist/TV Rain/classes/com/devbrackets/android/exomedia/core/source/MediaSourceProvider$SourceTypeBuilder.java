package com.devbrackets.android.exomedia.core.source;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.core.source.builder.MediaSourceBuilder;

public class MediaSourceProvider$SourceTypeBuilder
{
  @NonNull
  public final MediaSourceBuilder builder;
  @Nullable
  public final String extension;
  @Nullable
  public final String looseComparisonRegex;
  @Nullable
  public final String uriScheme;
  
  @Deprecated
  public MediaSourceProvider$SourceTypeBuilder(@NonNull MediaSourceBuilder paramMediaSourceBuilder, @NonNull String paramString1, @Nullable String paramString2)
  {
    this(paramMediaSourceBuilder, null, paramString1, paramString2);
  }
  
  public MediaSourceProvider$SourceTypeBuilder(@NonNull MediaSourceBuilder paramMediaSourceBuilder, @Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3)
  {
    builder = paramMediaSourceBuilder;
    uriScheme = paramString1;
    extension = paramString2;
    looseComparisonRegex = paramString3;
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.source.MediaSourceProvider.SourceTypeBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */