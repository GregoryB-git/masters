package com.facebook.appevents;

import android.content.Context;
import com.facebook.GraphRequest;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

class SessionEventsState
{
  private static final String TAG = "SessionEventsState";
  private final int MAX_ACCUMULATED_LOG_EVENTS = 1000;
  private List<AppEvent> accumulatedEvents = new ArrayList();
  private String anonymousAppDeviceGUID;
  private AttributionIdentifiers attributionIdentifiers;
  private List<AppEvent> inFlightEvents = new ArrayList();
  private int numSkippedEventsDueToFullBuffer;
  
  public SessionEventsState(AttributionIdentifiers paramAttributionIdentifiers, String paramString)
  {
    attributionIdentifiers = paramAttributionIdentifiers;
    anonymousAppDeviceGUID = paramString;
  }
  
  /* Error */
  private void populateRequest(GraphRequest paramGraphRequest, Context paramContext, int paramInt, JSONArray paramJSONArray, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 47	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: getstatic 53	com/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType:CUSTOM_APP_EVENTS	Lcom/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType;
    //   11: aload_0
    //   12: getfield 34	com/facebook/appevents/SessionEventsState:attributionIdentifiers	Lcom/facebook/internal/AttributionIdentifiers;
    //   15: aload_0
    //   16: getfield 36	com/facebook/appevents/SessionEventsState:anonymousAppDeviceGUID	Ljava/lang/String;
    //   19: iload 5
    //   21: aload_2
    //   22: invokestatic 59	com/facebook/appevents/internal/AppEventsLoggerUtility:getJSONObjectForGraphAPICall	(Lcom/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType;Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;ZLandroid/content/Context;)Lorg/json/JSONObject;
    //   25: astore 6
    //   27: aload 6
    //   29: astore_2
    //   30: aload_0
    //   31: getfield 61	com/facebook/appevents/SessionEventsState:numSkippedEventsDueToFullBuffer	I
    //   34: ifle +31 -> 65
    //   37: aload 6
    //   39: ldc 63
    //   41: iload_3
    //   42: invokevirtual 69	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   45: pop
    //   46: aload 6
    //   48: astore_2
    //   49: goto +16 -> 65
    //   52: astore_1
    //   53: goto +71 -> 124
    //   56: astore_2
    //   57: new 65	org/json/JSONObject
    //   60: dup
    //   61: invokespecial 70	org/json/JSONObject:<init>	()V
    //   64: astore_2
    //   65: aload_1
    //   66: aload_2
    //   67: invokevirtual 76	com/facebook/GraphRequest:setGraphObject	(Lorg/json/JSONObject;)V
    //   70: aload_1
    //   71: invokevirtual 80	com/facebook/GraphRequest:getParameters	()Landroid/os/Bundle;
    //   74: astore 6
    //   76: aload 6
    //   78: astore_2
    //   79: aload 6
    //   81: ifnonnull +11 -> 92
    //   84: new 82	android/os/Bundle
    //   87: astore_2
    //   88: aload_2
    //   89: invokespecial 83	android/os/Bundle:<init>	()V
    //   92: aload 4
    //   94: invokevirtual 89	org/json/JSONArray:toString	()Ljava/lang/String;
    //   97: astore 4
    //   99: aload 4
    //   101: ifnull +17 -> 118
    //   104: aload_2
    //   105: ldc 91
    //   107: aload 4
    //   109: invokevirtual 97	android/os/BaseBundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   112: aload_1
    //   113: aload 4
    //   115: invokevirtual 101	com/facebook/GraphRequest:setTag	(Ljava/lang/Object;)V
    //   118: aload_1
    //   119: aload_2
    //   120: invokevirtual 105	com/facebook/GraphRequest:setParameters	(Landroid/os/Bundle;)V
    //   123: return
    //   124: aload_1
    //   125: aload_0
    //   126: invokestatic 109	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   129: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	this	SessionEventsState
    //   0	130	1	paramGraphRequest	GraphRequest
    //   0	130	2	paramContext	Context
    //   0	130	3	paramInt	int
    //   0	130	4	paramJSONArray	JSONArray
    //   0	130	5	paramBoolean	boolean
    //   25	55	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   8	27	52	finally
    //   30	46	52	finally
    //   57	65	52	finally
    //   65	76	52	finally
    //   84	92	52	finally
    //   92	99	52	finally
    //   104	118	52	finally
    //   118	123	52	finally
    //   8	27	56	org/json/JSONException
    //   30	46	56	org/json/JSONException
  }
  
  /* Error */
  public void accumulatePersistedEvents(List<AppEvent> paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokestatic 47	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 28	com/facebook/appevents/SessionEventsState:accumulatedEvents	Ljava/util/List;
    //   18: aload_1
    //   19: invokeinterface 117 2 0
    //   24: pop
    //   25: aload_0
    //   26: monitorexit
    //   27: return
    //   28: astore_1
    //   29: aload_1
    //   30: aload_0
    //   31: invokestatic 109	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   34: aload_0
    //   35: monitorexit
    //   36: return
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	this	SessionEventsState
    //   0	42	1	paramList	List<AppEvent>
    //   6	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   14	25	28	finally
    //   2	7	37	finally
    //   29	34	37	finally
  }
  
  /* Error */
  public void addEvent(AppEvent paramAppEvent)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokestatic 47	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 28	com/facebook/appevents/SessionEventsState:accumulatedEvents	Ljava/util/List;
    //   18: invokeinterface 125 1 0
    //   23: aload_0
    //   24: getfield 30	com/facebook/appevents/SessionEventsState:inFlightEvents	Ljava/util/List;
    //   27: invokeinterface 125 1 0
    //   32: iadd
    //   33: aload_0
    //   34: invokevirtual 128	com/facebook/appevents/SessionEventsState:getMAX_ACCUMULATED_LOG_EVENTS	()I
    //   37: if_icmplt +16 -> 53
    //   40: aload_0
    //   41: aload_0
    //   42: getfield 61	com/facebook/appevents/SessionEventsState:numSkippedEventsDueToFullBuffer	I
    //   45: iconst_1
    //   46: iadd
    //   47: putfield 61	com/facebook/appevents/SessionEventsState:numSkippedEventsDueToFullBuffer	I
    //   50: goto +14 -> 64
    //   53: aload_0
    //   54: getfield 28	com/facebook/appevents/SessionEventsState:accumulatedEvents	Ljava/util/List;
    //   57: aload_1
    //   58: invokeinterface 131 2 0
    //   63: pop
    //   64: aload_0
    //   65: monitorexit
    //   66: return
    //   67: astore_1
    //   68: aload_1
    //   69: aload_0
    //   70: invokestatic 109	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   73: aload_0
    //   74: monitorexit
    //   75: return
    //   76: astore_1
    //   77: aload_0
    //   78: monitorexit
    //   79: aload_1
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	SessionEventsState
    //   0	81	1	paramAppEvent	AppEvent
    //   6	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   14	50	67	finally
    //   53	64	67	finally
    //   2	7	76	finally
    //   68	73	76	finally
  }
  
  /* Error */
  public void clearInFlightAndStats(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokestatic 47	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: iload_1
    //   15: ifeq +17 -> 32
    //   18: aload_0
    //   19: getfield 28	com/facebook/appevents/SessionEventsState:accumulatedEvents	Ljava/util/List;
    //   22: aload_0
    //   23: getfield 30	com/facebook/appevents/SessionEventsState:inFlightEvents	Ljava/util/List;
    //   26: invokeinterface 117 2 0
    //   31: pop
    //   32: aload_0
    //   33: getfield 30	com/facebook/appevents/SessionEventsState:inFlightEvents	Ljava/util/List;
    //   36: invokeinterface 136 1 0
    //   41: aload_0
    //   42: iconst_0
    //   43: putfield 61	com/facebook/appevents/SessionEventsState:numSkippedEventsDueToFullBuffer	I
    //   46: aload_0
    //   47: monitorexit
    //   48: return
    //   49: astore_3
    //   50: aload_3
    //   51: aload_0
    //   52: invokestatic 109	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   55: aload_0
    //   56: monitorexit
    //   57: return
    //   58: astore_3
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_3
    //   62: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	this	SessionEventsState
    //   0	63	1	paramBoolean	boolean
    //   6	2	2	bool	boolean
    //   49	2	3	localThrowable	Throwable
    //   58	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   18	32	49	finally
    //   32	46	49	finally
    //   2	7	58	finally
    //   50	55	58	finally
  }
  
  /* Error */
  public int getAccumulatedEventCount()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokestatic 47	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +7 -> 15
    //   11: aload_0
    //   12: monitorexit
    //   13: iconst_0
    //   14: ireturn
    //   15: aload_0
    //   16: getfield 28	com/facebook/appevents/SessionEventsState:accumulatedEvents	Ljava/util/List;
    //   19: invokeinterface 125 1 0
    //   24: istore_2
    //   25: aload_0
    //   26: monitorexit
    //   27: iload_2
    //   28: ireturn
    //   29: astore_3
    //   30: aload_3
    //   31: aload_0
    //   32: invokestatic 109	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   35: aload_0
    //   36: monitorexit
    //   37: iconst_0
    //   38: ireturn
    //   39: astore_3
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_3
    //   43: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	this	SessionEventsState
    //   6	2	1	bool	boolean
    //   24	4	2	i	int
    //   29	2	3	localThrowable	Throwable
    //   39	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   15	25	29	finally
    //   2	7	39	finally
    //   30	35	39	finally
  }
  
  /* Error */
  public List<AppEvent> getEventsToPersist()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokestatic 47	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +7 -> 15
    //   11: aload_0
    //   12: monitorexit
    //   13: aconst_null
    //   14: areturn
    //   15: aload_0
    //   16: getfield 28	com/facebook/appevents/SessionEventsState:accumulatedEvents	Ljava/util/List;
    //   19: astore_2
    //   20: new 25	java/util/ArrayList
    //   23: astore_3
    //   24: aload_3
    //   25: invokespecial 26	java/util/ArrayList:<init>	()V
    //   28: aload_0
    //   29: aload_3
    //   30: putfield 28	com/facebook/appevents/SessionEventsState:accumulatedEvents	Ljava/util/List;
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_2
    //   36: areturn
    //   37: astore_2
    //   38: aload_2
    //   39: aload_0
    //   40: invokestatic 109	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   43: aload_0
    //   44: monitorexit
    //   45: aconst_null
    //   46: areturn
    //   47: astore_2
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_2
    //   51: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	52	0	this	SessionEventsState
    //   6	2	1	bool	boolean
    //   19	17	2	localList	List
    //   37	2	2	localThrowable	Throwable
    //   47	4	2	localObject	Object
    //   23	7	3	localArrayList	ArrayList
    // Exception table:
    //   from	to	target	type
    //   15	33	37	finally
    //   2	7	47	finally
    //   38	43	47	finally
  }
  
  public int getMAX_ACCUMULATED_LOG_EVENTS()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return 0;
    }
    return 1000;
  }
  
  public int populateRequest(GraphRequest paramGraphRequest, Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return 0;
    }
    try
    {
      try
      {
        int i = numSkippedEventsDueToFullBuffer;
        EventDeactivationManager.processEvents(accumulatedEvents);
        inFlightEvents.addAll(accumulatedEvents);
        accumulatedEvents.clear();
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>();
        Iterator localIterator = inFlightEvents.iterator();
        while (localIterator.hasNext())
        {
          AppEvent localAppEvent = (AppEvent)localIterator.next();
          if (localAppEvent.isChecksumValid())
          {
            if ((paramBoolean1) || (!localAppEvent.getIsImplicit())) {
              localJSONArray.put(localAppEvent.getJSONObject());
            }
          }
          else
          {
            String str = TAG;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localStringBuilder.append("Event with invalid checksum: ");
            localStringBuilder.append(localAppEvent.toString());
            Utility.logd(str, localStringBuilder.toString());
          }
        }
        if (localJSONArray.length() == 0) {
          return 0;
        }
        populateRequest(paramGraphRequest, paramContext, i, localJSONArray, paramBoolean2);
        i = localJSONArray.length();
        return i;
      }
      finally {}
      return 0;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramGraphRequest, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.SessionEventsState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */