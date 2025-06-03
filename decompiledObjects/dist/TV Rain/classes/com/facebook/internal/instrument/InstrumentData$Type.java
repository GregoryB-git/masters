package com.facebook.internal.instrument;

public enum InstrumentData$Type
{
  static
  {
    Type localType1 = new Type("Unknown", 0);
    Unknown = localType1;
    Type localType2 = new Type("Analysis", 1);
    Analysis = localType2;
    Type localType3 = new Type("CrashReport", 2);
    CrashReport = localType3;
    Type localType4 = new Type("CrashShield", 3);
    CrashShield = localType4;
    Type localType5 = new Type("ThreadCheck", 4);
    ThreadCheck = localType5;
    $VALUES = new Type[] { localType1, localType2, localType3, localType4, localType5 };
  }
  
  private InstrumentData$Type() {}
  
  public String getLogPrefix()
  {
    int i = InstrumentData.1.$SwitchMap$com$facebook$internal$instrument$InstrumentData$Type[ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4) {
            return "Unknown";
          }
          return "thread_check_log_";
        }
        return "shield_log_";
      }
      return "crash_log_";
    }
    return "analysis_log_";
  }
  
  public String toString()
  {
    int i = InstrumentData.1.$SwitchMap$com$facebook$internal$instrument$InstrumentData$Type[ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4) {
            return "Unknown";
          }
          return "ThreadCheck";
        }
        return "CrashShield";
      }
      return "CrashReport";
    }
    return "Analysis";
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.instrument.InstrumentData.Type
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */