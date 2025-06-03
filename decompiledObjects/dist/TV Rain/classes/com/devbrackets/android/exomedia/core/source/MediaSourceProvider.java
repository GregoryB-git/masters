package com.devbrackets.android.exomedia.core.source;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.ExoMedia.Data;
import com.devbrackets.android.exomedia.core.source.builder.DefaultMediaSourceBuilder;
import com.devbrackets.android.exomedia.core.source.builder.MediaSourceBuilder;
import com.devbrackets.android.exomedia.util.MediaSourceUtil;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.util.Iterator;
import java.util.List;

public class MediaSourceProvider
{
  public static final String USER_AGENT_FORMAT = "ExoMedia %s (%d) / Android %s / %s";
  @SuppressLint({"DefaultLocale"})
  @NonNull
  public String userAgent = String.format("ExoMedia %s (%d) / Android %s / %s", new Object[] { "4.3.0", Integer.valueOf(43000), Build.VERSION.RELEASE, Build.MODEL });
  
  @Nullable
  public static SourceTypeBuilder findByExtension(@NonNull Uri paramUri)
  {
    String str = MediaSourceUtil.getExtension(paramUri);
    if ((str != null) && (!str.isEmpty()))
    {
      Iterator localIterator = ExoMedia.Data.sourceTypeBuilders.iterator();
      while (localIterator.hasNext())
      {
        SourceTypeBuilder localSourceTypeBuilder = (SourceTypeBuilder)localIterator.next();
        paramUri = extension;
        if ((paramUri != null) && (paramUri.equalsIgnoreCase(str))) {
          return localSourceTypeBuilder;
        }
      }
    }
    return null;
  }
  
  @Nullable
  public static SourceTypeBuilder findByLooseComparison(@NonNull Uri paramUri)
  {
    Iterator localIterator = ExoMedia.Data.sourceTypeBuilders.iterator();
    while (localIterator.hasNext())
    {
      SourceTypeBuilder localSourceTypeBuilder = (SourceTypeBuilder)localIterator.next();
      if ((looseComparisonRegex != null) && (paramUri.toString().matches(looseComparisonRegex))) {
        return localSourceTypeBuilder;
      }
    }
    return null;
  }
  
  @Nullable
  public static SourceTypeBuilder findByProviders(@NonNull Uri paramUri)
  {
    SourceTypeBuilder localSourceTypeBuilder = findByScheme(paramUri);
    if (localSourceTypeBuilder != null) {
      return localSourceTypeBuilder;
    }
    localSourceTypeBuilder = findByExtension(paramUri);
    if (localSourceTypeBuilder != null) {
      return localSourceTypeBuilder;
    }
    paramUri = findByLooseComparison(paramUri);
    if (paramUri != null) {
      return paramUri;
    }
    return null;
  }
  
  @Nullable
  public static SourceTypeBuilder findByScheme(@NonNull Uri paramUri)
  {
    String str1 = paramUri.getScheme();
    if ((str1 != null) && (!str1.isEmpty()))
    {
      paramUri = ExoMedia.Data.sourceTypeBuilders.iterator();
      while (paramUri.hasNext())
      {
        SourceTypeBuilder localSourceTypeBuilder = (SourceTypeBuilder)paramUri.next();
        String str2 = uriScheme;
        if ((str2 != null) && (str2.equalsIgnoreCase(str1))) {
          return localSourceTypeBuilder;
        }
      }
    }
    return null;
  }
  
  @NonNull
  public MediaSource generate(@NonNull Context paramContext, @NonNull Handler paramHandler, @NonNull Uri paramUri, @Nullable TransferListener paramTransferListener)
  {
    Object localObject = findByProviders(paramUri);
    if (localObject != null) {
      localObject = builder;
    } else {
      localObject = new DefaultMediaSourceBuilder();
    }
    return ((MediaSourceBuilder)localObject).build(paramContext, paramUri, userAgent, paramHandler, paramTransferListener);
  }
  
  public static class SourceTypeBuilder
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
    public SourceTypeBuilder(@NonNull MediaSourceBuilder paramMediaSourceBuilder, @NonNull String paramString1, @Nullable String paramString2)
    {
      this(paramMediaSourceBuilder, null, paramString1, paramString2);
    }
    
    public SourceTypeBuilder(@NonNull MediaSourceBuilder paramMediaSourceBuilder, @Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3)
    {
      builder = paramMediaSourceBuilder;
      uriScheme = paramString1;
      extension = paramString2;
      looseComparisonRegex = paramString3;
    }
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.source.MediaSourceProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */