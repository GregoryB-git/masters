package io.flutter.embedding.engine.dart;

import android.content.res.AssetManager;
import f;
import g;
import io.flutter.FlutterInjector;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler;
import io.flutter.plugin.common.BinaryMessenger.BinaryReply;
import io.flutter.plugin.common.BinaryMessenger.TaskQueue;
import io.flutter.plugin.common.BinaryMessenger.TaskQueueOptions;
import io.flutter.plugin.common.StringCodec;
import io.flutter.view.FlutterCallbackInformation;
import java.nio.ByteBuffer;

public class DartExecutor
  implements BinaryMessenger
{
  private static final String TAG = "DartExecutor";
  private final AssetManager assetManager;
  private final BinaryMessenger binaryMessenger;
  private final DartMessenger dartMessenger;
  private final FlutterJNI flutterJNI;
  private boolean isApplicationRunning = false;
  private final BinaryMessenger.BinaryMessageHandler isolateChannelMessageHandler;
  private String isolateServiceId;
  private IsolateServiceIdListener isolateServiceIdListener;
  
  public DartExecutor(FlutterJNI paramFlutterJNI, AssetManager paramAssetManager)
  {
    BinaryMessenger.BinaryMessageHandler local1 = new BinaryMessenger.BinaryMessageHandler()
    {
      public void onMessage(ByteBuffer paramAnonymousByteBuffer, BinaryMessenger.BinaryReply paramAnonymousBinaryReply)
      {
        DartExecutor.access$002(DartExecutor.this, StringCodec.INSTANCE.decodeMessage(paramAnonymousByteBuffer));
        if (DartExecutor.access$100(DartExecutor.this) != null) {
          DartExecutor.access$100(DartExecutor.this).onIsolateServiceIdAvailable(DartExecutor.access$000(DartExecutor.this));
        }
      }
    };
    isolateChannelMessageHandler = local1;
    flutterJNI = paramFlutterJNI;
    assetManager = paramAssetManager;
    paramAssetManager = new DartMessenger(paramFlutterJNI);
    dartMessenger = paramAssetManager;
    paramAssetManager.setMessageHandler("flutter/isolate", local1);
    binaryMessenger = new DefaultBinaryMessenger(paramAssetManager, null);
    if (paramFlutterJNI.isAttached()) {
      isApplicationRunning = true;
    }
  }
  
  @Deprecated
  public void disableBufferingIncomingMessages()
  {
    dartMessenger.disableBufferingIncomingMessages();
  }
  
  @Deprecated
  public void enableBufferingIncomingMessages()
  {
    dartMessenger.enableBufferingIncomingMessages();
  }
  
  /* Error */
  public void executeDartCallback(DartCallback paramDartCallback)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 46	io/flutter/embedding/engine/dart/DartExecutor:isApplicationRunning	Z
    //   4: ifeq +11 -> 15
    //   7: ldc 24
    //   9: ldc 102
    //   11: invokestatic 108	io/flutter/Log:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   14: return
    //   15: ldc 110
    //   17: invokestatic 116	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   20: astore_2
    //   21: new 118	java/lang/StringBuilder
    //   24: astore_3
    //   25: aload_3
    //   26: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   29: aload_3
    //   30: ldc 121
    //   32: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: pop
    //   36: aload_3
    //   37: aload_1
    //   38: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   41: pop
    //   42: ldc 24
    //   44: aload_3
    //   45: invokevirtual 132	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: invokestatic 135	io/flutter/Log:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   51: aload_0
    //   52: getfield 53	io/flutter/embedding/engine/dart/DartExecutor:flutterJNI	Lio/flutter/embedding/engine/FlutterJNI;
    //   55: astore 4
    //   57: aload_1
    //   58: getfield 138	io/flutter/embedding/engine/dart/DartExecutor$DartCallback:pathToBundle	Ljava/lang/String;
    //   61: astore 5
    //   63: aload_1
    //   64: getfield 142	io/flutter/embedding/engine/dart/DartExecutor$DartCallback:callbackHandle	Lio/flutter/view/FlutterCallbackInformation;
    //   67: astore_3
    //   68: aload 4
    //   70: aload 5
    //   72: aload_3
    //   73: getfield 147	io/flutter/view/FlutterCallbackInformation:callbackName	Ljava/lang/String;
    //   76: aload_3
    //   77: getfield 150	io/flutter/view/FlutterCallbackInformation:callbackLibraryPath	Ljava/lang/String;
    //   80: aload_1
    //   81: getfield 153	io/flutter/embedding/engine/dart/DartExecutor$DartCallback:androidAssetManager	Landroid/content/res/AssetManager;
    //   84: aconst_null
    //   85: invokevirtual 157	io/flutter/embedding/engine/FlutterJNI:runBundleAndSnapshotFromLibrary	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;Ljava/util/List;)V
    //   88: aload_0
    //   89: iconst_1
    //   90: putfield 46	io/flutter/embedding/engine/dart/DartExecutor:isApplicationRunning	Z
    //   93: aload_2
    //   94: ifnull +7 -> 101
    //   97: aload_2
    //   98: invokevirtual 160	io/flutter/util/TraceSection:close	()V
    //   101: return
    //   102: astore_1
    //   103: aload_2
    //   104: ifnull +16 -> 120
    //   107: aload_2
    //   108: invokevirtual 160	io/flutter/util/TraceSection:close	()V
    //   111: goto +9 -> 120
    //   114: astore_2
    //   115: aload_1
    //   116: aload_2
    //   117: invokevirtual 166	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   120: aload_1
    //   121: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	this	DartExecutor
    //   0	122	1	paramDartCallback	DartCallback
    //   20	88	2	localTraceSection	io.flutter.util.TraceSection
    //   114	3	2	localThrowable	Throwable
    //   24	53	3	localObject	Object
    //   55	14	4	localFlutterJNI	FlutterJNI
    //   61	10	5	str	String
    // Exception table:
    //   from	to	target	type
    //   21	93	102	finally
    //   107	111	114	finally
  }
  
  public void executeDartEntrypoint(DartEntrypoint paramDartEntrypoint)
  {
    executeDartEntrypoint(paramDartEntrypoint, null);
  }
  
  /* Error */
  public void executeDartEntrypoint(DartEntrypoint paramDartEntrypoint, java.util.List<String> paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 46	io/flutter/embedding/engine/dart/DartExecutor:isApplicationRunning	Z
    //   4: ifeq +11 -> 15
    //   7: ldc 24
    //   9: ldc 102
    //   11: invokestatic 108	io/flutter/Log:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   14: return
    //   15: ldc -83
    //   17: invokestatic 116	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   20: astore_3
    //   21: new 118	java/lang/StringBuilder
    //   24: astore 4
    //   26: aload 4
    //   28: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   31: aload 4
    //   33: ldc -81
    //   35: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: pop
    //   39: aload 4
    //   41: aload_1
    //   42: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: ldc 24
    //   48: aload 4
    //   50: invokevirtual 132	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   53: invokestatic 135	io/flutter/Log:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   56: aload_0
    //   57: getfield 53	io/flutter/embedding/engine/dart/DartExecutor:flutterJNI	Lio/flutter/embedding/engine/FlutterJNI;
    //   60: aload_1
    //   61: getfield 176	io/flutter/embedding/engine/dart/DartExecutor$DartEntrypoint:pathToBundle	Ljava/lang/String;
    //   64: aload_1
    //   65: getfield 179	io/flutter/embedding/engine/dart/DartExecutor$DartEntrypoint:dartEntrypointFunctionName	Ljava/lang/String;
    //   68: aload_1
    //   69: getfield 182	io/flutter/embedding/engine/dart/DartExecutor$DartEntrypoint:dartEntrypointLibrary	Ljava/lang/String;
    //   72: aload_0
    //   73: getfield 55	io/flutter/embedding/engine/dart/DartExecutor:assetManager	Landroid/content/res/AssetManager;
    //   76: aload_2
    //   77: invokevirtual 157	io/flutter/embedding/engine/FlutterJNI:runBundleAndSnapshotFromLibrary	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;Ljava/util/List;)V
    //   80: aload_0
    //   81: iconst_1
    //   82: putfield 46	io/flutter/embedding/engine/dart/DartExecutor:isApplicationRunning	Z
    //   85: aload_3
    //   86: ifnull +7 -> 93
    //   89: aload_3
    //   90: invokevirtual 160	io/flutter/util/TraceSection:close	()V
    //   93: return
    //   94: astore_1
    //   95: aload_3
    //   96: ifnull +16 -> 112
    //   99: aload_3
    //   100: invokevirtual 160	io/flutter/util/TraceSection:close	()V
    //   103: goto +9 -> 112
    //   106: astore_2
    //   107: aload_1
    //   108: aload_2
    //   109: invokevirtual 166	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   112: aload_1
    //   113: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	this	DartExecutor
    //   0	114	1	paramDartEntrypoint	DartEntrypoint
    //   0	114	2	paramList	java.util.List<String>
    //   20	80	3	localTraceSection	io.flutter.util.TraceSection
    //   24	25	4	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   21	85	94	finally
    //   99	103	106	finally
  }
  
  public BinaryMessenger getBinaryMessenger()
  {
    return binaryMessenger;
  }
  
  public String getIsolateServiceId()
  {
    return isolateServiceId;
  }
  
  public int getPendingChannelResponseCount()
  {
    return dartMessenger.getPendingChannelResponseCount();
  }
  
  public boolean isExecutingDart()
  {
    return isApplicationRunning;
  }
  
  @Deprecated
  public BinaryMessenger.TaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions paramTaskQueueOptions)
  {
    return binaryMessenger.makeBackgroundTaskQueue(paramTaskQueueOptions);
  }
  
  public void notifyLowMemoryWarning()
  {
    if (flutterJNI.isAttached()) {
      flutterJNI.notifyLowMemoryWarning();
    }
  }
  
  public void onAttachedToJNI()
  {
    Log.v("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
    flutterJNI.setPlatformMessageHandler(dartMessenger);
  }
  
  public void onDetachedFromJNI()
  {
    Log.v("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
    flutterJNI.setPlatformMessageHandler(null);
  }
  
  @Deprecated
  public void send(String paramString, ByteBuffer paramByteBuffer)
  {
    binaryMessenger.send(paramString, paramByteBuffer);
  }
  
  @Deprecated
  public void send(String paramString, ByteBuffer paramByteBuffer, BinaryMessenger.BinaryReply paramBinaryReply)
  {
    binaryMessenger.send(paramString, paramByteBuffer, paramBinaryReply);
  }
  
  public void setIsolateServiceIdListener(IsolateServiceIdListener paramIsolateServiceIdListener)
  {
    isolateServiceIdListener = paramIsolateServiceIdListener;
    if (paramIsolateServiceIdListener != null)
    {
      String str = isolateServiceId;
      if (str != null) {
        paramIsolateServiceIdListener.onIsolateServiceIdAvailable(str);
      }
    }
  }
  
  @Deprecated
  public void setMessageHandler(String paramString, BinaryMessenger.BinaryMessageHandler paramBinaryMessageHandler)
  {
    binaryMessenger.setMessageHandler(paramString, paramBinaryMessageHandler);
  }
  
  @Deprecated
  public void setMessageHandler(String paramString, BinaryMessenger.BinaryMessageHandler paramBinaryMessageHandler, BinaryMessenger.TaskQueue paramTaskQueue)
  {
    binaryMessenger.setMessageHandler(paramString, paramBinaryMessageHandler, paramTaskQueue);
  }
  
  public static class DartCallback
  {
    public final AssetManager androidAssetManager;
    public final FlutterCallbackInformation callbackHandle;
    public final String pathToBundle;
    
    public DartCallback(AssetManager paramAssetManager, String paramString, FlutterCallbackInformation paramFlutterCallbackInformation)
    {
      androidAssetManager = paramAssetManager;
      pathToBundle = paramString;
      callbackHandle = paramFlutterCallbackInformation;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = f.l("DartCallback( bundle path: ");
      localStringBuilder.append(pathToBundle);
      localStringBuilder.append(", library path: ");
      localStringBuilder.append(callbackHandle.callbackLibraryPath);
      localStringBuilder.append(", function: ");
      return g.f(localStringBuilder, callbackHandle.callbackName, " )");
    }
  }
  
  public static class DartEntrypoint
  {
    public final String dartEntrypointFunctionName;
    public final String dartEntrypointLibrary;
    public final String pathToBundle;
    
    public DartEntrypoint(String paramString1, String paramString2)
    {
      pathToBundle = paramString1;
      dartEntrypointLibrary = null;
      dartEntrypointFunctionName = paramString2;
    }
    
    public DartEntrypoint(String paramString1, String paramString2, String paramString3)
    {
      pathToBundle = paramString1;
      dartEntrypointLibrary = paramString2;
      dartEntrypointFunctionName = paramString3;
    }
    
    public static DartEntrypoint createDefault()
    {
      FlutterLoader localFlutterLoader = FlutterInjector.instance().flutterLoader();
      if (localFlutterLoader.initialized()) {
        return new DartEntrypoint(localFlutterLoader.findAppBundlePath(), "main");
      }
      throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (getClass() == paramObject.getClass()))
      {
        paramObject = (DartEntrypoint)paramObject;
        if (!pathToBundle.equals(pathToBundle)) {
          return false;
        }
        return dartEntrypointFunctionName.equals(dartEntrypointFunctionName);
      }
      return false;
    }
    
    public int hashCode()
    {
      int i = pathToBundle.hashCode();
      return dartEntrypointFunctionName.hashCode() + i * 31;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = f.l("DartEntrypoint( bundle path: ");
      localStringBuilder.append(pathToBundle);
      localStringBuilder.append(", function: ");
      return g.f(localStringBuilder, dartEntrypointFunctionName, " )");
    }
  }
  
  public static class DefaultBinaryMessenger
    implements BinaryMessenger
  {
    private final DartMessenger messenger;
    
    private DefaultBinaryMessenger(DartMessenger paramDartMessenger)
    {
      messenger = paramDartMessenger;
    }
    
    public void disableBufferingIncomingMessages()
    {
      messenger.disableBufferingIncomingMessages();
    }
    
    public void enableBufferingIncomingMessages()
    {
      messenger.enableBufferingIncomingMessages();
    }
    
    public BinaryMessenger.TaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions paramTaskQueueOptions)
    {
      return messenger.makeBackgroundTaskQueue(paramTaskQueueOptions);
    }
    
    public void send(String paramString, ByteBuffer paramByteBuffer)
    {
      messenger.send(paramString, paramByteBuffer, null);
    }
    
    public void send(String paramString, ByteBuffer paramByteBuffer, BinaryMessenger.BinaryReply paramBinaryReply)
    {
      messenger.send(paramString, paramByteBuffer, paramBinaryReply);
    }
    
    public void setMessageHandler(String paramString, BinaryMessenger.BinaryMessageHandler paramBinaryMessageHandler)
    {
      messenger.setMessageHandler(paramString, paramBinaryMessageHandler);
    }
    
    public void setMessageHandler(String paramString, BinaryMessenger.BinaryMessageHandler paramBinaryMessageHandler, BinaryMessenger.TaskQueue paramTaskQueue)
    {
      messenger.setMessageHandler(paramString, paramBinaryMessageHandler, paramTaskQueue);
    }
  }
  
  public static abstract interface IsolateServiceIdListener
  {
    public abstract void onIsolateServiceIdAvailable(String paramString);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.dart.DartExecutor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */