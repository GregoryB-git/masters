package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.Buffer;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

public final class MetadataRenderer
  extends BaseRenderer
  implements Handler.Callback
{
  private static final int MAX_PENDING_METADATA_COUNT = 5;
  private static final int MSG_INVOKE_RENDERER = 0;
  private final MetadataInputBuffer buffer;
  private MetadataDecoder decoder;
  private final MetadataDecoderFactory decoderFactory;
  private final FormatHolder formatHolder;
  private boolean inputStreamEnded;
  private final MetadataOutput output;
  @Nullable
  private final Handler outputHandler;
  private final Metadata[] pendingMetadata;
  private int pendingMetadataCount;
  private int pendingMetadataIndex;
  private final long[] pendingMetadataTimestamps;
  
  public MetadataRenderer(MetadataOutput paramMetadataOutput, @Nullable Looper paramLooper)
  {
    this(paramMetadataOutput, paramLooper, MetadataDecoderFactory.DEFAULT);
  }
  
  public MetadataRenderer(MetadataOutput paramMetadataOutput, @Nullable Looper paramLooper, MetadataDecoderFactory paramMetadataDecoderFactory)
  {
    super(4);
    output = ((MetadataOutput)Assertions.checkNotNull(paramMetadataOutput));
    if (paramLooper == null) {
      paramMetadataOutput = null;
    } else {
      paramMetadataOutput = Util.createHandler(paramLooper, this);
    }
    outputHandler = paramMetadataOutput;
    decoderFactory = ((MetadataDecoderFactory)Assertions.checkNotNull(paramMetadataDecoderFactory));
    formatHolder = new FormatHolder();
    buffer = new MetadataInputBuffer();
    pendingMetadata = new Metadata[5];
    pendingMetadataTimestamps = new long[5];
  }
  
  private void flushPendingMetadata()
  {
    Arrays.fill(pendingMetadata, null);
    pendingMetadataIndex = 0;
    pendingMetadataCount = 0;
  }
  
  private void invokeRenderer(Metadata paramMetadata)
  {
    Handler localHandler = outputHandler;
    if (localHandler != null) {
      localHandler.obtainMessage(0, paramMetadata).sendToTarget();
    } else {
      invokeRendererInternal(paramMetadata);
    }
  }
  
  private void invokeRendererInternal(Metadata paramMetadata)
  {
    output.onMetadata(paramMetadata);
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (what == 0)
    {
      invokeRendererInternal((Metadata)obj);
      return true;
    }
    throw new IllegalStateException();
  }
  
  public boolean isEnded()
  {
    return inputStreamEnded;
  }
  
  public boolean isReady()
  {
    return true;
  }
  
  public void onDisabled()
  {
    flushPendingMetadata();
    decoder = null;
  }
  
  public void onPositionReset(long paramLong, boolean paramBoolean)
  {
    flushPendingMetadata();
    inputStreamEnded = false;
  }
  
  public void onStreamChanged(Format[] paramArrayOfFormat, long paramLong)
    throws ExoPlaybackException
  {
    decoder = decoderFactory.createDecoder(paramArrayOfFormat[0]);
  }
  
  public void render(long paramLong1, long paramLong2)
    throws ExoPlaybackException
  {
    Object localObject;
    int i;
    if ((!inputStreamEnded) && (pendingMetadataCount < 5))
    {
      buffer.clear();
      if (readSource(formatHolder, buffer, false) == -4) {
        if (buffer.isEndOfStream())
        {
          inputStreamEnded = true;
        }
        else if (!buffer.isDecodeOnly())
        {
          localObject = buffer;
          subsampleOffsetUs = formatHolder.format.subsampleOffsetUs;
          ((DecoderInputBuffer)localObject).flip();
          i = (pendingMetadataIndex + pendingMetadataCount) % 5;
          pendingMetadata[i] = decoder.decode(buffer);
          pendingMetadataTimestamps[i] = buffer.timeUs;
          pendingMetadataCount += 1;
        }
      }
    }
    if (pendingMetadataCount > 0)
    {
      localObject = pendingMetadataTimestamps;
      i = pendingMetadataIndex;
      if (localObject[i] <= paramLong1)
      {
        invokeRenderer(pendingMetadata[i]);
        localObject = pendingMetadata;
        i = pendingMetadataIndex;
        localObject[i] = null;
        pendingMetadataIndex = ((i + 1) % 5);
        pendingMetadataCount -= 1;
      }
    }
  }
  
  public int supportsFormat(Format paramFormat)
  {
    if (decoderFactory.supportsFormat(paramFormat))
    {
      int i;
      if (BaseRenderer.supportsFormatDrm(null, drmInitData)) {
        i = 4;
      } else {
        i = 2;
      }
      return i;
    }
    return 0;
  }
  
  @Deprecated
  public static abstract interface Output
    extends MetadataOutput
  {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.MetadataRenderer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */