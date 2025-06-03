package com.google.android.exoplayer2.video.spherical;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

public class CameraMotionRenderer
  extends BaseRenderer
{
  private static final int SAMPLE_WINDOW_DURATION_US = 100000;
  private final DecoderInputBuffer buffer = new DecoderInputBuffer(1);
  private final FormatHolder formatHolder = new FormatHolder();
  private long lastTimestampUs;
  @Nullable
  private CameraMotionListener listener;
  private long offsetUs;
  private final ParsableByteArray scratch = new ParsableByteArray();
  
  public CameraMotionRenderer()
  {
    super(5);
  }
  
  @Nullable
  private float[] parseMetadata(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer.remaining() != 16) {
      return null;
    }
    scratch.reset(paramByteBuffer.array(), paramByteBuffer.limit());
    scratch.setPosition(paramByteBuffer.arrayOffset() + 4);
    paramByteBuffer = new float[3];
    for (int i = 0; i < 3; i++) {
      paramByteBuffer[i] = Float.intBitsToFloat(scratch.readLittleEndianInt());
    }
    return paramByteBuffer;
  }
  
  private void reset()
  {
    lastTimestampUs = 0L;
    CameraMotionListener localCameraMotionListener = listener;
    if (localCameraMotionListener != null) {
      localCameraMotionListener.onCameraMotionReset();
    }
  }
  
  public void handleMessage(int paramInt, @Nullable Object paramObject)
    throws ExoPlaybackException
  {
    if (paramInt == 7) {
      listener = ((CameraMotionListener)paramObject);
    } else {
      super.handleMessage(paramInt, paramObject);
    }
  }
  
  public boolean isEnded()
  {
    return hasReadStreamToEnd();
  }
  
  public boolean isReady()
  {
    return true;
  }
  
  public void onDisabled()
  {
    reset();
  }
  
  public void onPositionReset(long paramLong, boolean paramBoolean)
    throws ExoPlaybackException
  {
    reset();
  }
  
  public void onStreamChanged(Format[] paramArrayOfFormat, long paramLong)
    throws ExoPlaybackException
  {
    offsetUs = paramLong;
  }
  
  public void render(long paramLong1, long paramLong2)
    throws ExoPlaybackException
  {
    while ((!hasReadStreamToEnd()) && (lastTimestampUs < 100000L + paramLong1))
    {
      buffer.clear();
      if ((readSource(formatHolder, buffer, false) != -4) || (buffer.isEndOfStream())) {
        break;
      }
      buffer.flip();
      Object localObject = buffer;
      lastTimestampUs = timeUs;
      if (listener != null)
      {
        localObject = parseMetadata(data);
        if (localObject != null) {
          ((CameraMotionListener)Util.castNonNull(listener)).onCameraMotion(lastTimestampUs - offsetUs, (float[])localObject);
        }
      }
    }
  }
  
  public int supportsFormat(Format paramFormat)
  {
    int i;
    if ("application/x-camera-motion".equals(sampleMimeType)) {
      i = 4;
    } else {
      i = 0;
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.video.spherical.CameraMotionRenderer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */