package com.devbrackets.android.exomedia.core.source.builder;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.ExoMedia.Data;
import com.devbrackets.android.exomedia.ExoMedia.DataSourceFactoryProvider;
import com.devbrackets.android.exomedia.ExoMedia.HttpDataSourceFactoryProvider;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory;
import com.google.android.exoplayer2.upstream.TransferListener;

public abstract class MediaSourceBuilder
{
  @NonNull
  public abstract MediaSource build(@NonNull Context paramContext, @NonNull Uri paramUri, @NonNull String paramString, @NonNull Handler paramHandler, @Nullable TransferListener paramTransferListener);
  
  @NonNull
  public DataSource.Factory buildDataSourceFactory(@NonNull Context paramContext, @NonNull String paramString, @Nullable TransferListener paramTransferListener)
  {
    Object localObject1 = ExoMedia.Data.dataSourceFactoryProvider;
    Object localObject2 = null;
    if (localObject1 != null) {
      localObject3 = ((ExoMedia.DataSourceFactoryProvider)localObject1).provide(paramString, paramTransferListener);
    } else {
      localObject3 = null;
    }
    localObject1 = localObject3;
    if (localObject3 == null)
    {
      localObject3 = ExoMedia.Data.httpDataSourceFactoryProvider;
      localObject1 = localObject2;
      if (localObject3 != null) {
        localObject1 = ((ExoMedia.HttpDataSourceFactoryProvider)localObject3).provide(paramString, paramTransferListener);
      }
    }
    Object localObject3 = localObject1;
    if (localObject1 == null) {
      localObject3 = new DefaultHttpDataSourceFactory(paramString, paramTransferListener);
    }
    return new DefaultDataSourceFactory(paramContext, paramTransferListener, (DataSource.Factory)localObject3);
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.source.builder.MediaSourceBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */