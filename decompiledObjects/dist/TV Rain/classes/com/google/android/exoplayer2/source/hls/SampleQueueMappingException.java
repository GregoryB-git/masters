package com.google.android.exoplayer2.source.hls;

import androidx.annotation.Nullable;
import java.io.IOException;
import z2;

public final class SampleQueueMappingException
  extends IOException
{
  public SampleQueueMappingException(@Nullable String paramString)
  {
    super(z2.p("Unable to bind a sample queue to TrackGroup with mime type ", paramString, "."));
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.SampleQueueMappingException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */