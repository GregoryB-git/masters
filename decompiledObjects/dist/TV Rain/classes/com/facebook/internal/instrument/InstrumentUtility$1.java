package com.facebook.internal.instrument;

import java.io.File;
import java.io.FilenameFilter;

final class InstrumentUtility$1
  implements FilenameFilter
{
  public boolean accept(File paramFile, String paramString)
  {
    return paramString.matches(String.format("^%s[0-9]+.json$", new Object[] { "analysis_log_" }));
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.instrument.InstrumentUtility.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */