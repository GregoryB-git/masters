package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec.CodecException;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import z2;

public class MediaCodecRenderer$DecoderInitializationException
  extends Exception
{
  private static final int CUSTOM_ERROR_CODE_BASE = -50000;
  private static final int DECODER_QUERY_ERROR = -49998;
  private static final int NO_SUITABLE_DECODER_ERROR = -49999;
  public final String decoderName;
  public final String diagnosticInfo;
  @Nullable
  public final DecoderInitializationException fallbackDecoderInitializationException;
  public final String mimeType;
  public final boolean secureDecoderRequired;
  
  public MediaCodecRenderer$DecoderInitializationException(Format paramFormat, Throwable paramThrowable, boolean paramBoolean, int paramInt)
  {
    this(localStringBuilder.toString(), paramThrowable, sampleMimeType, paramBoolean, null, buildCustomDiagnosticInfo(paramInt), null);
  }
  
  public MediaCodecRenderer$DecoderInitializationException(Format paramFormat, Throwable paramThrowable, boolean paramBoolean, String paramString)
  {
    this((String)localObject, paramThrowable, str, paramBoolean, paramString, paramFormat, null);
  }
  
  private MediaCodecRenderer$DecoderInitializationException(String paramString1, Throwable paramThrowable, String paramString2, boolean paramBoolean, @Nullable String paramString3, @Nullable String paramString4, @Nullable DecoderInitializationException paramDecoderInitializationException)
  {
    super(paramString1, paramThrowable);
    mimeType = paramString2;
    secureDecoderRequired = paramBoolean;
    decoderName = paramString3;
    diagnosticInfo = paramString4;
    fallbackDecoderInitializationException = paramDecoderInitializationException;
  }
  
  private static String buildCustomDiagnosticInfo(int paramInt)
  {
    if (paramInt < 0) {
      localObject = "neg_";
    } else {
      localObject = "";
    }
    Object localObject = z2.u("com.google.android.exoplayer.MediaCodecTrackRenderer_", (String)localObject);
    ((StringBuilder)localObject).append(Math.abs(paramInt));
    return ((StringBuilder)localObject).toString();
  }
  
  @CheckResult
  private DecoderInitializationException copyWithFallbackException(DecoderInitializationException paramDecoderInitializationException)
  {
    return new DecoderInitializationException(getMessage(), getCause(), mimeType, secureDecoderRequired, decoderName, diagnosticInfo, paramDecoderInitializationException);
  }
  
  @TargetApi(21)
  private static String getDiagnosticInfoV21(Throwable paramThrowable)
  {
    if ((paramThrowable instanceof MediaCodec.CodecException)) {
      return ((MediaCodec.CodecException)paramThrowable).getDiagnosticInfo();
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */