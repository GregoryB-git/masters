package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.TrackOutput.CryptoData;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;

public final class TrackEncryptionBox
{
  private static final String TAG = "TrackEncryptionBox";
  public final TrackOutput.CryptoData cryptoData;
  public final byte[] defaultInitializationVector;
  public final boolean isEncrypted;
  public final int perSampleIvSize;
  @Nullable
  public final String schemeType;
  
  public TrackEncryptionBox(boolean paramBoolean, @Nullable String paramString, int paramInt1, byte[] paramArrayOfByte1, int paramInt2, int paramInt3, @Nullable byte[] paramArrayOfByte2)
  {
    int i = 1;
    int j;
    if (paramInt1 == 0) {
      j = 1;
    } else {
      j = 0;
    }
    if (paramArrayOfByte2 != null) {
      i = 0;
    }
    Assertions.checkArgument(i ^ j);
    isEncrypted = paramBoolean;
    schemeType = paramString;
    perSampleIvSize = paramInt1;
    defaultInitializationVector = paramArrayOfByte2;
    cryptoData = new TrackOutput.CryptoData(schemeToCryptoMode(paramString), paramArrayOfByte1, paramInt2, paramInt3);
  }
  
  private static int schemeToCryptoMode(@Nullable String paramString)
  {
    if (paramString == null) {
      return 1;
    }
    int i = -1;
    switch (paramString.hashCode())
    {
    default: 
      break;
    case 3049895: 
      if (paramString.equals("cens")) {
        i = 3;
      }
      break;
    case 3049879: 
      if (paramString.equals("cenc")) {
        i = 2;
      }
      break;
    case 3046671: 
      if (paramString.equals("cbcs")) {
        i = 1;
      }
      break;
    case 3046605: 
      if (paramString.equals("cbc1")) {
        i = 0;
      }
      break;
    }
    switch (i)
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unsupported protection scheme type '");
      localStringBuilder.append(paramString);
      localStringBuilder.append("'. Assuming AES-CTR crypto mode.");
      Log.w("TrackEncryptionBox", localStringBuilder.toString());
    case 2: 
    case 3: 
      return 1;
    }
    return 2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */