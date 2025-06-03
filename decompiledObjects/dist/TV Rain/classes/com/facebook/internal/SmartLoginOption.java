package com.facebook.internal;

import java.util.AbstractCollection;
import java.util.EnumSet;
import java.util.Iterator;

public enum SmartLoginOption
{
  public static final EnumSet<SmartLoginOption> ALL = EnumSet.allOf(SmartLoginOption.class);
  private final long mValue;
  
  static
  {
    SmartLoginOption localSmartLoginOption1 = new SmartLoginOption("None", 0, 0L);
    None = localSmartLoginOption1;
    SmartLoginOption localSmartLoginOption2 = new SmartLoginOption("Enabled", 1, 1L);
    Enabled = localSmartLoginOption2;
    SmartLoginOption localSmartLoginOption3 = new SmartLoginOption("RequireConfirm", 2, 2L);
    RequireConfirm = localSmartLoginOption3;
    $VALUES = new SmartLoginOption[] { localSmartLoginOption1, localSmartLoginOption2, localSmartLoginOption3 };
  }
  
  private SmartLoginOption(long paramLong)
  {
    mValue = paramLong;
  }
  
  public static EnumSet<SmartLoginOption> parseOptions(long paramLong)
  {
    EnumSet localEnumSet = EnumSet.noneOf(SmartLoginOption.class);
    Iterator localIterator = ALL.iterator();
    while (localIterator.hasNext())
    {
      SmartLoginOption localSmartLoginOption = (SmartLoginOption)localIterator.next();
      if ((localSmartLoginOption.getValue() & paramLong) != 0L) {
        localEnumSet.add(localSmartLoginOption);
      }
    }
    return localEnumSet;
  }
  
  public long getValue()
  {
    return mValue;
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.SmartLoginOption
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */