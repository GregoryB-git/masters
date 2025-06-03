package com.devbrackets.android.exomedia.util;

import java.util.Formatter;
import java.util.Locale;

public class TimeFormatUtil
{
  private static StringBuilder formatBuilder = new StringBuilder();
  private static Formatter formatter = new Formatter(formatBuilder, Locale.getDefault());
  
  public static String formatMs(long paramLong)
  {
    if (paramLong < 0L) {
      return "--:--";
    }
    long l1 = paramLong % 60000L / 1000L;
    long l2 = paramLong % 3600000L / 60000L;
    paramLong = paramLong % 86400000L / 3600000L;
    formatBuilder.setLength(0);
    if (paramLong > 0L) {
      return formatter.format("%d:%02d:%02d", new Object[] { Long.valueOf(paramLong), Long.valueOf(l2), Long.valueOf(l1) }).toString();
    }
    return formatter.format("%02d:%02d", new Object[] { Long.valueOf(l2), Long.valueOf(l1) }).toString();
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.util.TimeFormatUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */