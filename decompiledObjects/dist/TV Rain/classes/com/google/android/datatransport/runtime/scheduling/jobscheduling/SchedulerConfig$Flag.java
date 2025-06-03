package com.google.android.datatransport.runtime.scheduling.jobscheduling;

public enum SchedulerConfig$Flag
{
  static
  {
    Flag localFlag1 = new Flag("NETWORK_UNMETERED", 0);
    NETWORK_UNMETERED = localFlag1;
    Flag localFlag2 = new Flag("DEVICE_IDLE", 1);
    DEVICE_IDLE = localFlag2;
    Flag localFlag3 = new Flag("DEVICE_CHARGING", 2);
    DEVICE_CHARGING = localFlag3;
    $VALUES = new Flag[] { localFlag1, localFlag2, localFlag3 };
  }
  
  private SchedulerConfig$Flag() {}
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */