package com.facebook.internal.instrument.crashreport;

import com.facebook.internal.instrument.InstrumentData;
import java.util.Comparator;

final class CrashHandler$1
  implements Comparator<InstrumentData>
{
  public int compare(InstrumentData paramInstrumentData1, InstrumentData paramInstrumentData2)
  {
    return paramInstrumentData1.compareTo(paramInstrumentData2);
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.instrument.crashreport.CrashHandler.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */