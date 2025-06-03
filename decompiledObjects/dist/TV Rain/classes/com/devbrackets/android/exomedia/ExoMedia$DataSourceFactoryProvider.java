package com.devbrackets.android.exomedia;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.TransferListener;

public abstract interface ExoMedia$DataSourceFactoryProvider
{
  @NonNull
  public abstract DataSource.Factory provide(@NonNull String paramString, @Nullable TransferListener paramTransferListener);
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.ExoMedia.DataSourceFactoryProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */