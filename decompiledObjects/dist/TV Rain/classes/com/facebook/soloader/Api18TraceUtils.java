package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;

@TargetApi(18)
@DoNotOptimize
class Api18TraceUtils
{
  public static void beginTraceSection(String paramString)
  {
    Trace.beginSection(paramString);
  }
  
  public static void endSection() {}
}

/* Location:
 * Qualified Name:     com.facebook.soloader.Api18TraceUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */