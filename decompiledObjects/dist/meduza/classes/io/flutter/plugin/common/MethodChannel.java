package io.flutter.plugin.common;

import f;
import io.flutter.Log;
import java.nio.ByteBuffer;

public class MethodChannel
{
  private static final String TAG = "MethodChannel#";
  private final MethodCodec codec;
  private final BinaryMessenger messenger;
  private final String name;
  private final BinaryMessenger.TaskQueue taskQueue;
  
  public MethodChannel(BinaryMessenger paramBinaryMessenger, String paramString)
  {
    this(paramBinaryMessenger, paramString, StandardMethodCodec.INSTANCE);
  }
  
  public MethodChannel(BinaryMessenger paramBinaryMessenger, String paramString, MethodCodec paramMethodCodec)
  {
    this(paramBinaryMessenger, paramString, paramMethodCodec, null);
  }
  
  public MethodChannel(BinaryMessenger paramBinaryMessenger, String paramString, MethodCodec paramMethodCodec, BinaryMessenger.TaskQueue paramTaskQueue)
  {
    messenger = paramBinaryMessenger;
    name = paramString;
    codec = paramMethodCodec;
    taskQueue = paramTaskQueue;
  }
  
  public void invokeMethod(String paramString, Object paramObject)
  {
    invokeMethod(paramString, paramObject, null);
  }
  
  public void invokeMethod(String paramString, Object paramObject, Result paramResult)
  {
    BinaryMessenger localBinaryMessenger = messenger;
    String str = name;
    paramObject = codec.encodeMethodCall(new MethodCall(paramString, paramObject));
    if (paramResult == null) {
      paramString = null;
    } else {
      paramString = new IncomingResultHandler(paramResult);
    }
    localBinaryMessenger.send(str, (ByteBuffer)paramObject, paramString);
  }
  
  public void resizeChannelBuffer(int paramInt)
  {
    BasicMessageChannel.resizeChannelBuffer(messenger, name, paramInt);
  }
  
  public void setMethodCallHandler(MethodCallHandler paramMethodCallHandler)
  {
    Object localObject = taskQueue;
    BinaryMessenger localBinaryMessenger1 = null;
    BinaryMessenger localBinaryMessenger2 = null;
    if (localObject != null)
    {
      localBinaryMessenger1 = messenger;
      localObject = name;
      if (paramMethodCallHandler == null) {
        paramMethodCallHandler = localBinaryMessenger2;
      } else {
        paramMethodCallHandler = new IncomingMethodCallHandler(paramMethodCallHandler);
      }
      localBinaryMessenger1.setMessageHandler((String)localObject, paramMethodCallHandler, taskQueue);
    }
    else
    {
      localBinaryMessenger2 = messenger;
      localObject = name;
      if (paramMethodCallHandler == null) {
        paramMethodCallHandler = localBinaryMessenger1;
      } else {
        paramMethodCallHandler = new IncomingMethodCallHandler(paramMethodCallHandler);
      }
      localBinaryMessenger2.setMessageHandler((String)localObject, paramMethodCallHandler);
    }
  }
  
  public void setWarnsOnChannelOverflow(boolean paramBoolean)
  {
    BasicMessageChannel.setWarnsOnChannelOverflow(messenger, name, paramBoolean);
  }
  
  public final class IncomingMethodCallHandler
    implements BinaryMessenger.BinaryMessageHandler
  {
    private final MethodChannel.MethodCallHandler handler;
    
    public IncomingMethodCallHandler(MethodChannel.MethodCallHandler paramMethodCallHandler)
    {
      handler = paramMethodCallHandler;
    }
    
    public void onMessage(ByteBuffer paramByteBuffer, BinaryMessenger.BinaryReply paramBinaryReply)
    {
      paramByteBuffer = MethodChannel.access$000(MethodChannel.this).decodeMethodCall(paramByteBuffer);
      try
      {
        MethodChannel.MethodCallHandler localMethodCallHandler = handler;
        MethodChannel.Result local1 = new io/flutter/plugin/common/MethodChannel$IncomingMethodCallHandler$1;
        local1.<init>(this, paramBinaryReply);
        localMethodCallHandler.onMethodCall(paramByteBuffer, local1);
      }
      catch (RuntimeException localRuntimeException)
      {
        paramByteBuffer = f.l("MethodChannel#");
        paramByteBuffer.append(MethodChannel.access$100(MethodChannel.this));
        Log.e(paramByteBuffer.toString(), "Failed to handle method call", localRuntimeException);
        paramBinaryReply.reply(MethodChannel.access$000(MethodChannel.this).encodeErrorEnvelopeWithStacktrace("error", localRuntimeException.getMessage(), null, Log.getStackTraceString(localRuntimeException)));
      }
    }
  }
  
  public final class IncomingResultHandler
    implements BinaryMessenger.BinaryReply
  {
    private final MethodChannel.Result callback;
    
    public IncomingResultHandler(MethodChannel.Result paramResult)
    {
      callback = paramResult;
    }
    
    public void reply(ByteBuffer paramByteBuffer)
    {
      if (paramByteBuffer == null) {}
      try
      {
        callback.notImplemented();
      }
      catch (RuntimeException localRuntimeException)
      {
        try
        {
          callback.success(MethodChannel.access$000(MethodChannel.this).decodeEnvelope(paramByteBuffer));
        }
        catch (FlutterException paramByteBuffer)
        {
          callback.error(code, paramByteBuffer.getMessage(), details);
        }
        localRuntimeException = localRuntimeException;
        paramByteBuffer = f.l("MethodChannel#");
        paramByteBuffer.append(MethodChannel.access$100(MethodChannel.this));
        Log.e(paramByteBuffer.toString(), "Failed to handle method call result", localRuntimeException);
      }
    }
  }
  
  public static abstract interface MethodCallHandler
  {
    public abstract void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult);
  }
  
  public static abstract interface Result
  {
    public abstract void error(String paramString1, String paramString2, Object paramObject);
    
    public abstract void notImplemented();
    
    public abstract void success(Object paramObject);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.MethodChannel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */