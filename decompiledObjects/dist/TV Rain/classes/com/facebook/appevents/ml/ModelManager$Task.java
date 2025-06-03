package com.facebook.appevents.ml;

import androidx.annotation.Nullable;

public enum ModelManager$Task
{
  static
  {
    Task localTask1 = new Task("MTML_INTEGRITY_DETECT", 0);
    MTML_INTEGRITY_DETECT = localTask1;
    Task localTask2 = new Task("MTML_APP_EVENT_PREDICTION", 1);
    MTML_APP_EVENT_PREDICTION = localTask2;
    $VALUES = new Task[] { localTask1, localTask2 };
  }
  
  private ModelManager$Task() {}
  
  public String toKey()
  {
    int i = ModelManager.4.$SwitchMap$com$facebook$appevents$ml$ModelManager$Task[ordinal()];
    if (i != 1)
    {
      if (i != 2) {
        return "Unknown";
      }
      return "app_event_pred";
    }
    return "integrity_detect";
  }
  
  @Nullable
  public String toUseCase()
  {
    int i = ModelManager.4.$SwitchMap$com$facebook$appevents$ml$ModelManager$Task[ordinal()];
    if (i != 1)
    {
      if (i != 2) {
        return null;
      }
      return "MTML_APP_EVENT_PRED";
    }
    return "MTML_INTEGRITY_DETECT";
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.ml.ModelManager.Task
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */