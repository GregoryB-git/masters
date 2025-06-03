package com.devbrackets.android.exomedia;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.HttpDataSource.BaseFactory;
import com.google.android.exoplayer2.upstream.TransferListener;

@Deprecated
public abstract interface ExoMedia$HttpDataSourceFactoryProvider
{
  @NonNull
  public abstract HttpDataSource.BaseFactory provide(@NonNull String paramString, @Nullable TransferListener paramTransferListener);
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.ExoMedia.HttpDataSourceFactoryProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */