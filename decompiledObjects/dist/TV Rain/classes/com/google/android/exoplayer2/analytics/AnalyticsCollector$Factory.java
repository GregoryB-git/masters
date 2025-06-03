package com.google.android.exoplayer2.analytics;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.Clock;

public class AnalyticsCollector$Factory
{
  public AnalyticsCollector createAnalyticsCollector(@Nullable Player paramPlayer, Clock paramClock)
  {
    return new AnalyticsCollector(paramPlayer, paramClock);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.analytics.AnalyticsCollector.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */