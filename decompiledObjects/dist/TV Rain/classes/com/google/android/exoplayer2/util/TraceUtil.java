package com.google.android.exoplayer2.util;

import android.annotation.TargetApi;
import android.os.Trace;

public final class TraceUtil
{
  public static void beginSection(String paramString)
  {
    if (Util.SDK_INT >= 18) {
      beginSectionV18(paramString);
    }
  }
  
  @TargetApi(18)
  private static void beginSectionV18(String paramString)
  {
    Trace.beginSection(paramString);
  }
  
  public static void endSection()
  {
    if (Util.SDK_INT >= 18) {
      endSectionV18();
    }
  }
  
  @TargetApi(18)
  private static void endSectionV18() {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.TraceUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */