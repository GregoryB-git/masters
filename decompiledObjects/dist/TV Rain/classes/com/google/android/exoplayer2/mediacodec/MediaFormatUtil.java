package com.google.android.exoplayer2.mediacodec;

import a;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;
import java.util.List;

@TargetApi(16)
public final class MediaFormatUtil
{
  public static void maybeSetByteBuffer(MediaFormat paramMediaFormat, String paramString, @Nullable byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      paramMediaFormat.setByteBuffer(paramString, ByteBuffer.wrap(paramArrayOfByte));
    }
  }
  
  public static void maybeSetColorInfo(MediaFormat paramMediaFormat, @Nullable ColorInfo paramColorInfo)
  {
    if (paramColorInfo != null)
    {
      maybeSetInteger(paramMediaFormat, "color-transfer", colorTransfer);
      maybeSetInteger(paramMediaFormat, "color-standard", colorSpace);
      maybeSetInteger(paramMediaFormat, "color-range", colorRange);
      maybeSetByteBuffer(paramMediaFormat, "hdr-static-info", hdrStaticInfo);
    }
  }
  
  public static void maybeSetFloat(MediaFormat paramMediaFormat, String paramString, float paramFloat)
  {
    if (paramFloat != -1.0F) {
      paramMediaFormat.setFloat(paramString, paramFloat);
    }
  }
  
  public static void maybeSetInteger(MediaFormat paramMediaFormat, String paramString, int paramInt)
  {
    if (paramInt != -1) {
      paramMediaFormat.setInteger(paramString, paramInt);
    }
  }
  
  public static void setCsdBuffers(MediaFormat paramMediaFormat, List<byte[]> paramList)
  {
    for (int i = 0; i < paramList.size(); i++) {
      paramMediaFormat.setByteBuffer(a.f("csd-", i), ByteBuffer.wrap((byte[])paramList.get(i)));
    }
  }
  
  public static void setString(MediaFormat paramMediaFormat, String paramString1, String paramString2)
  {
    paramMediaFormat.setString(paramString1, paramString2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.mediacodec.MediaFormatUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */