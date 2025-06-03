package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri.Builder;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.util.PriorityMapping;

public class AlarmManagerScheduler
  implements WorkScheduler
{
  public static final String ATTEMPT_NUMBER = "attemptNumber";
  public static final String BACKEND_NAME = "backendName";
  public static final String EVENT_PRIORITY = "priority";
  public static final String EXTRAS = "extras";
  private static final String LOG_TAG = "AlarmManagerScheduler";
  private AlarmManager alarmManager;
  private final Clock clock;
  private final SchedulerConfig config;
  private final Context context;
  private final EventStore eventStore;
  
  @VisibleForTesting
  public AlarmManagerScheduler(Context paramContext, EventStore paramEventStore, AlarmManager paramAlarmManager, Clock paramClock, SchedulerConfig paramSchedulerConfig)
  {
    context = paramContext;
    eventStore = paramEventStore;
    alarmManager = paramAlarmManager;
    clock = paramClock;
    config = paramSchedulerConfig;
  }
  
  public AlarmManagerScheduler(Context paramContext, EventStore paramEventStore, Clock paramClock, SchedulerConfig paramSchedulerConfig)
  {
    this(paramContext, paramEventStore, (AlarmManager)paramContext.getSystemService("alarm"), paramClock, paramSchedulerConfig);
  }
  
  @VisibleForTesting
  public boolean isJobServiceOn(Intent paramIntent)
  {
    Context localContext = context;
    boolean bool = false;
    if (PendingIntent.getBroadcast(localContext, 0, paramIntent, 603979776) != null) {
      bool = true;
    }
    return bool;
  }
  
  public void schedule(TransportContext paramTransportContext, int paramInt)
  {
    schedule(paramTransportContext, paramInt, false);
  }
  
  public void schedule(TransportContext paramTransportContext, int paramInt, boolean paramBoolean)
  {
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.appendQueryParameter("backendName", paramTransportContext.getBackendName());
    localBuilder.appendQueryParameter("priority", String.valueOf(PriorityMapping.toInt(paramTransportContext.getPriority())));
    if (paramTransportContext.getExtras() != null) {
      localBuilder.appendQueryParameter("extras", Base64.encodeToString(paramTransportContext.getExtras(), 0));
    }
    Intent localIntent = new Intent(context, AlarmManagerSchedulerBroadcastReceiver.class);
    localIntent.setData(localBuilder.build());
    localIntent.putExtra("attemptNumber", paramInt);
    if ((!paramBoolean) && (isJobServiceOn(localIntent)))
    {
      Logging.d("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", paramTransportContext);
      return;
    }
    long l1 = eventStore.getNextCallTime(paramTransportContext);
    long l2 = config.getScheduleDelay(paramTransportContext.getPriority(), l1, paramInt);
    Logging.d("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", new Object[] { paramTransportContext, Long.valueOf(l2), Long.valueOf(l1), Integer.valueOf(paramInt) });
    paramTransportContext = PendingIntent.getBroadcast(context, 0, localIntent, 67108864);
    alarmManager.set(3, clock.getTime() + l2, paramTransportContext);
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerScheduler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */