package com.google.android.exoplayer2.mediacodec;

import android.text.TextUtils;
import androidx.annotation.Nullable;

final class MediaCodecUtil$CodecKey
{
  public final String mimeType;
  public final boolean secure;
  
  public MediaCodecUtil$CodecKey(String paramString, boolean paramBoolean)
  {
    mimeType = paramString;
    secure = paramBoolean;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (paramObject.getClass() == CodecKey.class))
    {
      paramObject = (CodecKey)paramObject;
      if ((!TextUtils.equals(mimeType, mimeType)) || (secure != secure)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    String str = mimeType;
    int i;
    if (str == null) {
      i = 0;
    } else {
      i = str.hashCode();
    }
    int j;
    if (secure) {
      j = 1231;
    } else {
      j = 1237;
    }
    return (i + 31) * 31 + j;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.mediacodec.MediaCodecUtil.CodecKey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */