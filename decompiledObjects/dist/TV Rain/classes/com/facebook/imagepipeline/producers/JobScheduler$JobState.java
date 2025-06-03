package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.VisibleForTesting;

@VisibleForTesting
 enum JobScheduler$JobState
{
  static
  {
    JobState localJobState1 = new JobState("IDLE", 0);
    IDLE = localJobState1;
    JobState localJobState2 = new JobState("QUEUED", 1);
    QUEUED = localJobState2;
    JobState localJobState3 = new JobState("RUNNING", 2);
    RUNNING = localJobState3;
    JobState localJobState4 = new JobState("RUNNING_AND_PENDING", 3);
    RUNNING_AND_PENDING = localJobState4;
    $VALUES = new JobState[] { localJobState1, localJobState2, localJobState3, localJobState4 };
  }
  
  private JobScheduler$JobState() {}
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.JobScheduler.JobState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */