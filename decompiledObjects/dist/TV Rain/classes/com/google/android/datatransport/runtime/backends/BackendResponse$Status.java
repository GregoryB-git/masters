package com.google.android.datatransport.runtime.backends;

public enum BackendResponse$Status
{
  static
  {
    Status localStatus1 = new Status("OK", 0);
    OK = localStatus1;
    Status localStatus2 = new Status("TRANSIENT_ERROR", 1);
    TRANSIENT_ERROR = localStatus2;
    Status localStatus3 = new Status("FATAL_ERROR", 2);
    FATAL_ERROR = localStatus3;
    Status localStatus4 = new Status("INVALID_PAYLOAD", 3);
    INVALID_PAYLOAD = localStatus4;
    $VALUES = new Status[] { localStatus1, localStatus2, localStatus3, localStatus4 };
  }
  
  private BackendResponse$Status() {}
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.backends.BackendResponse.Status
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */