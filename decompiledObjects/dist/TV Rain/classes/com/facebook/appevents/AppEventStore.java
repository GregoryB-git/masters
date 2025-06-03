package com.facebook.appevents;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

class AppEventStore
{
  private static final String PERSISTED_EVENTS_FILENAME = "AppEventsLogger.persistedevents";
  private static final String TAG = "com.facebook.appevents.AppEventStore";
  
  /* Error */
  public static void persistEvents(AccessTokenAppIdPair paramAccessTokenAppIdPair, SessionEventsState paramSessionEventsState)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 2
    //   5: invokestatic 27	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   8: istore_2
    //   9: iload_2
    //   10: ifeq +7 -> 17
    //   13: ldc 2
    //   15: monitorexit
    //   16: return
    //   17: invokestatic 32	com/facebook/appevents/internal/AppEventUtility:assertIsNotMainThread	()V
    //   20: invokestatic 36	com/facebook/appevents/AppEventStore:readAndClearStore	()Lcom/facebook/appevents/PersistedEvents;
    //   23: astore_3
    //   24: aload_3
    //   25: aload_0
    //   26: aload_1
    //   27: invokevirtual 42	com/facebook/appevents/SessionEventsState:getEventsToPersist	()Ljava/util/List;
    //   30: invokevirtual 48	com/facebook/appevents/PersistedEvents:addEvents	(Lcom/facebook/appevents/AccessTokenAppIdPair;Ljava/util/List;)V
    //   33: aload_3
    //   34: invokestatic 52	com/facebook/appevents/AppEventStore:saveEventsToDisk	(Lcom/facebook/appevents/PersistedEvents;)V
    //   37: ldc 2
    //   39: monitorexit
    //   40: return
    //   41: astore_0
    //   42: aload_0
    //   43: ldc 2
    //   45: invokestatic 56	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   48: ldc 2
    //   50: monitorexit
    //   51: return
    //   52: astore_0
    //   53: ldc 2
    //   55: monitorexit
    //   56: aload_0
    //   57: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	58	0	paramAccessTokenAppIdPair	AccessTokenAppIdPair
    //   0	58	1	paramSessionEventsState	SessionEventsState
    //   8	2	2	bool	boolean
    //   23	11	3	localPersistedEvents	PersistedEvents
    // Exception table:
    //   from	to	target	type
    //   17	37	41	finally
    //   3	9	52	finally
    //   42	48	52	finally
  }
  
  /* Error */
  public static void persistEvents(AppEventCollection paramAppEventCollection)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 2
    //   5: invokestatic 27	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   8: istore_1
    //   9: iload_1
    //   10: ifeq +7 -> 17
    //   13: ldc 2
    //   15: monitorexit
    //   16: return
    //   17: invokestatic 32	com/facebook/appevents/internal/AppEventUtility:assertIsNotMainThread	()V
    //   20: invokestatic 36	com/facebook/appevents/AppEventStore:readAndClearStore	()Lcom/facebook/appevents/PersistedEvents;
    //   23: astore_2
    //   24: aload_0
    //   25: invokevirtual 63	com/facebook/appevents/AppEventCollection:keySet	()Ljava/util/Set;
    //   28: invokeinterface 69 1 0
    //   33: astore_3
    //   34: aload_3
    //   35: invokeinterface 75 1 0
    //   40: ifeq +32 -> 72
    //   43: aload_3
    //   44: invokeinterface 79 1 0
    //   49: checkcast 81	com/facebook/appevents/AccessTokenAppIdPair
    //   52: astore 4
    //   54: aload_2
    //   55: aload 4
    //   57: aload_0
    //   58: aload 4
    //   60: invokevirtual 85	com/facebook/appevents/AppEventCollection:get	(Lcom/facebook/appevents/AccessTokenAppIdPair;)Lcom/facebook/appevents/SessionEventsState;
    //   63: invokevirtual 42	com/facebook/appevents/SessionEventsState:getEventsToPersist	()Ljava/util/List;
    //   66: invokevirtual 48	com/facebook/appevents/PersistedEvents:addEvents	(Lcom/facebook/appevents/AccessTokenAppIdPair;Ljava/util/List;)V
    //   69: goto -35 -> 34
    //   72: aload_2
    //   73: invokestatic 52	com/facebook/appevents/AppEventStore:saveEventsToDisk	(Lcom/facebook/appevents/PersistedEvents;)V
    //   76: ldc 2
    //   78: monitorexit
    //   79: return
    //   80: astore_0
    //   81: aload_0
    //   82: ldc 2
    //   84: invokestatic 56	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   87: ldc 2
    //   89: monitorexit
    //   90: return
    //   91: astore_0
    //   92: ldc 2
    //   94: monitorexit
    //   95: aload_0
    //   96: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	paramAppEventCollection	AppEventCollection
    //   8	2	1	bool	boolean
    //   23	50	2	localPersistedEvents	PersistedEvents
    //   33	11	3	localIterator	java.util.Iterator
    //   52	7	4	localAccessTokenAppIdPair	AccessTokenAppIdPair
    // Exception table:
    //   from	to	target	type
    //   17	34	80	finally
    //   34	69	80	finally
    //   72	76	80	finally
    //   3	9	91	finally
    //   81	87	91	finally
  }
  
  /* Error */
  public static PersistedEvents readAndClearStore()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 2
    //   5: invokestatic 27	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   8: istore_0
    //   9: iload_0
    //   10: ifeq +8 -> 18
    //   13: ldc 2
    //   15: monitorexit
    //   16: aconst_null
    //   17: areturn
    //   18: invokestatic 32	com/facebook/appevents/internal/AppEventUtility:assertIsNotMainThread	()V
    //   21: invokestatic 95	com/facebook/FacebookSdk:getApplicationContext	()Landroid/content/Context;
    //   24: astore_1
    //   25: aload_1
    //   26: ldc 11
    //   28: invokevirtual 101	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   31: astore_2
    //   32: new 6	com/facebook/appevents/AppEventStore$MovedClassObjectInputStream
    //   35: astore_3
    //   36: new 103	java/io/BufferedInputStream
    //   39: astore 4
    //   41: aload 4
    //   43: aload_2
    //   44: invokespecial 106	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   47: aload_3
    //   48: aload 4
    //   50: invokespecial 107	com/facebook/appevents/AppEventStore$MovedClassObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   53: aload_3
    //   54: astore 4
    //   56: aload_3
    //   57: invokevirtual 112	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   60: checkcast 44	com/facebook/appevents/PersistedEvents
    //   63: astore_2
    //   64: aload_3
    //   65: invokestatic 118	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   68: aload_1
    //   69: ldc 11
    //   71: invokevirtual 122	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   74: invokevirtual 127	java/io/File:delete	()Z
    //   77: pop
    //   78: aload_2
    //   79: astore_3
    //   80: goto +146 -> 226
    //   83: astore_3
    //   84: getstatic 129	com/facebook/appevents/AppEventStore:TAG	Ljava/lang/String;
    //   87: ldc -125
    //   89: aload_3
    //   90: invokestatic 137	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   93: pop
    //   94: aload_2
    //   95: astore_3
    //   96: goto +130 -> 226
    //   99: astore_2
    //   100: goto +13 -> 113
    //   103: astore_3
    //   104: aconst_null
    //   105: astore 4
    //   107: goto +55 -> 162
    //   110: astore_2
    //   111: aconst_null
    //   112: astore_3
    //   113: aload_3
    //   114: astore 4
    //   116: getstatic 129	com/facebook/appevents/AppEventStore:TAG	Ljava/lang/String;
    //   119: ldc -117
    //   121: aload_2
    //   122: invokestatic 137	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   125: pop
    //   126: aload_3
    //   127: invokestatic 118	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   130: aload_1
    //   131: ldc 11
    //   133: invokevirtual 122	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   136: invokevirtual 127	java/io/File:delete	()Z
    //   139: pop
    //   140: goto +84 -> 224
    //   143: astore_3
    //   144: getstatic 129	com/facebook/appevents/AppEventStore:TAG	Ljava/lang/String;
    //   147: astore 4
    //   149: aload 4
    //   151: ldc -125
    //   153: aload_3
    //   154: invokestatic 137	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   157: pop
    //   158: goto +66 -> 224
    //   161: astore_3
    //   162: aload 4
    //   164: invokestatic 118	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   167: aload_1
    //   168: ldc 11
    //   170: invokevirtual 122	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   173: invokevirtual 127	java/io/File:delete	()Z
    //   176: pop
    //   177: goto +16 -> 193
    //   180: astore 4
    //   182: getstatic 129	com/facebook/appevents/AppEventStore:TAG	Ljava/lang/String;
    //   185: ldc -125
    //   187: aload 4
    //   189: invokestatic 137	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   192: pop
    //   193: aload_3
    //   194: athrow
    //   195: astore_3
    //   196: aconst_null
    //   197: astore_3
    //   198: aload_3
    //   199: invokestatic 118	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   202: aload_1
    //   203: ldc 11
    //   205: invokevirtual 122	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   208: invokevirtual 127	java/io/File:delete	()Z
    //   211: pop
    //   212: goto +12 -> 224
    //   215: astore_3
    //   216: getstatic 129	com/facebook/appevents/AppEventStore:TAG	Ljava/lang/String;
    //   219: astore 4
    //   221: goto -72 -> 149
    //   224: aconst_null
    //   225: astore_3
    //   226: aload_3
    //   227: astore 4
    //   229: aload_3
    //   230: ifnonnull +12 -> 242
    //   233: new 44	com/facebook/appevents/PersistedEvents
    //   236: dup
    //   237: invokespecial 140	com/facebook/appevents/PersistedEvents:<init>	()V
    //   240: astore 4
    //   242: ldc 2
    //   244: monitorexit
    //   245: aload 4
    //   247: areturn
    //   248: astore_3
    //   249: aload_3
    //   250: ldc 2
    //   252: invokestatic 56	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   255: ldc 2
    //   257: monitorexit
    //   258: aconst_null
    //   259: areturn
    //   260: astore_3
    //   261: ldc 2
    //   263: monitorexit
    //   264: aload_3
    //   265: athrow
    //   266: astore 4
    //   268: goto -70 -> 198
    // Local variable table:
    //   start	length	slot	name	signature
    //   8	2	0	bool	boolean
    //   24	179	1	localContext	android.content.Context
    //   31	64	2	localObject1	Object
    //   99	1	2	localException1	Exception
    //   110	12	2	localException2	Exception
    //   35	45	3	localObject2	Object
    //   83	7	3	localException3	Exception
    //   95	1	3	localObject3	Object
    //   103	1	3	localObject4	Object
    //   112	15	3	localCloseable1	java.io.Closeable
    //   143	11	3	localException4	Exception
    //   161	33	3	localObject5	Object
    //   195	1	3	localFileNotFoundException1	java.io.FileNotFoundException
    //   197	2	3	localCloseable2	java.io.Closeable
    //   215	1	3	localException5	Exception
    //   225	5	3	localObject6	Object
    //   248	2	3	localThrowable	Throwable
    //   260	5	3	localObject7	Object
    //   39	124	4	localObject8	Object
    //   180	8	4	localException6	Exception
    //   219	27	4	localObject9	Object
    //   266	1	4	localFileNotFoundException2	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   68	78	83	java/lang/Exception
    //   56	64	99	java/lang/Exception
    //   25	53	103	finally
    //   25	53	110	java/lang/Exception
    //   130	140	143	java/lang/Exception
    //   56	64	161	finally
    //   116	126	161	finally
    //   167	177	180	java/lang/Exception
    //   25	53	195	java/io/FileNotFoundException
    //   202	212	215	java/lang/Exception
    //   18	25	248	finally
    //   64	68	248	finally
    //   68	78	248	finally
    //   84	94	248	finally
    //   126	130	248	finally
    //   130	140	248	finally
    //   144	149	248	finally
    //   149	158	248	finally
    //   162	167	248	finally
    //   167	177	248	finally
    //   182	193	248	finally
    //   193	195	248	finally
    //   198	202	248	finally
    //   202	212	248	finally
    //   216	221	248	finally
    //   233	242	248	finally
    //   3	9	260	finally
    //   249	255	260	finally
    //   56	64	266	java/io/FileNotFoundException
  }
  
  /* Error */
  public static void saveEventsToDisk(PersistedEvents paramPersistedEvents)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 27	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aconst_null
    //   10: astore_1
    //   11: invokestatic 95	com/facebook/FacebookSdk:getApplicationContext	()Landroid/content/Context;
    //   14: astore_2
    //   15: new 142	java/io/ObjectOutputStream
    //   18: astore_3
    //   19: new 144	java/io/BufferedOutputStream
    //   22: astore 4
    //   24: aload 4
    //   26: aload_2
    //   27: ldc 11
    //   29: iconst_0
    //   30: invokevirtual 148	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   33: invokespecial 151	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   36: aload_3
    //   37: aload 4
    //   39: invokespecial 152	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   42: aload_3
    //   43: aload_0
    //   44: invokevirtual 156	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   47: aload_3
    //   48: invokestatic 118	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   51: goto +39 -> 90
    //   54: astore 4
    //   56: aload_3
    //   57: astore_0
    //   58: goto +7 -> 65
    //   61: astore 4
    //   63: aload_1
    //   64: astore_0
    //   65: getstatic 129	com/facebook/appevents/AppEventStore:TAG	Ljava/lang/String;
    //   68: ldc -98
    //   70: aload 4
    //   72: invokestatic 137	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   75: pop
    //   76: aload_2
    //   77: ldc 11
    //   79: invokevirtual 122	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   82: invokevirtual 127	java/io/File:delete	()Z
    //   85: pop
    //   86: aload_0
    //   87: invokestatic 118	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   90: return
    //   91: astore 4
    //   93: aload_0
    //   94: invokestatic 118	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   97: aload 4
    //   99: athrow
    //   100: astore_0
    //   101: aload_0
    //   102: ldc 2
    //   104: invokestatic 56	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   107: return
    //   108: astore 4
    //   110: goto -24 -> 86
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	113	0	paramPersistedEvents	PersistedEvents
    //   10	54	1	localObject1	Object
    //   14	63	2	localContext	android.content.Context
    //   18	39	3	localObjectOutputStream	java.io.ObjectOutputStream
    //   22	16	4	localBufferedOutputStream	java.io.BufferedOutputStream
    //   54	1	4	localObject2	Object
    //   61	10	4	localThrowable	Throwable
    //   91	7	4	localObject3	Object
    //   108	1	4	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   42	47	54	finally
    //   15	42	61	finally
    //   65	76	91	finally
    //   76	86	91	finally
    //   11	15	100	finally
    //   47	51	100	finally
    //   86	90	100	finally
    //   93	100	100	finally
    //   76	86	108	java/lang/Exception
  }
  
  public static class MovedClassObjectInputStream
    extends ObjectInputStream
  {
    private static final String ACCESS_TOKEN_APP_ID_PAIR_SERIALIZATION_PROXY_V1_CLASS_NAME = "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1";
    private static final String APP_EVENT_SERIALIZATION_PROXY_V1_CLASS_NAME = "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1";
    
    public MovedClassObjectInputStream(InputStream paramInputStream)
      throws IOException
    {
      super();
    }
    
    public ObjectStreamClass readClassDescriptor()
      throws IOException, ClassNotFoundException
    {
      ObjectStreamClass localObjectStreamClass1 = super.readClassDescriptor();
      ObjectStreamClass localObjectStreamClass2;
      if (localObjectStreamClass1.getName().equals("com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1"))
      {
        localObjectStreamClass2 = ObjectStreamClass.lookup(AccessTokenAppIdPair.SerializationProxyV1.class);
      }
      else
      {
        localObjectStreamClass2 = localObjectStreamClass1;
        if (localObjectStreamClass1.getName().equals("com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1")) {
          localObjectStreamClass2 = ObjectStreamClass.lookup(AppEvent.SerializationProxyV1.class);
        }
      }
      return localObjectStreamClass2;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AppEventStore
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */