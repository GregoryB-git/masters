package com.facebook.appevents;

public enum FlushResult
{
  static
  {
    FlushResult localFlushResult1 = new FlushResult("SUCCESS", 0);
    SUCCESS = localFlushResult1;
    FlushResult localFlushResult2 = new FlushResult("SERVER_ERROR", 1);
    SERVER_ERROR = localFlushResult2;
    FlushResult localFlushResult3 = new FlushResult("NO_CONNECTIVITY", 2);
    NO_CONNECTIVITY = localFlushResult3;
    FlushResult localFlushResult4 = new FlushResult("UNKNOWN_ERROR", 3);
    UNKNOWN_ERROR = localFlushResult4;
    $VALUES = new FlushResult[] { localFlushResult1, localFlushResult2, localFlushResult3, localFlushResult4 };
  }
  
  private FlushResult() {}
}

/* Location:
 * Qualified Name:     com.facebook.appevents.FlushResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */