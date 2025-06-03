package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec.CodecException;

public class jr
  extends Exception
{
  private final String a;
  
  public jr(Throwable paramThrowable, jp paramjp)
  {
    super(paramjp, paramThrowable);
    paramjp = (jp)localObject;
    if (wl.a >= 21)
    {
      paramjp = (jp)localObject;
      if ((paramThrowable instanceof MediaCodec.CodecException)) {
        paramjp = ((MediaCodec.CodecException)paramThrowable).getDiagnosticInfo();
      }
    }
    a = paramjp;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.jr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */