package com.facebook.internal.instrument;

import java.io.File;
import java.io.FilenameFilter;

final class InstrumentUtility$2
  implements FilenameFilter
{
  public boolean accept(File paramFile, String paramString)
  {
    return paramString.matches(String.format("^(%s|%s|%s)[0-9]+.json$", new Object[] { "crash_log_", "shield_log_", "thread_check_log_" }));
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.instrument.InstrumentUtility.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */