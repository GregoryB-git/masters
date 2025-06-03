package io.flutter.plugin.common;

import f;
import io.flutter.Log;
import java.nio.ByteBuffer;

final class MethodChannel$IncomingMethodCallHandler
  implements BinaryMessenger.BinaryMessageHandler
{
  private final MethodChannel.MethodCallHandler handler;
  
  public MethodChannel$IncomingMethodCallHandler(MethodChannel paramMethodChannel, MethodChannel.MethodCallHandler paramMethodCallHandler)
  {
    handler = paramMethodCallHandler;
  }
  
  public void onMessage(ByteBuffer paramByteBuffer, BinaryMessenger.BinaryReply paramBinaryReply)
  {
    paramByteBuffer = MethodChannel.access$000(this$0).decodeMethodCall(paramByteBuffer);
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
      paramByteBuffer.append(MethodChannel.access$100(this$0));
      Log.e(paramByteBuffer.toString(), "Failed to handle method call", localRuntimeException);
      paramBinaryReply.reply(MethodChannel.access$000(this$0).encodeErrorEnvelopeWithStacktrace("error", localRuntimeException.getMessage(), null, Log.getStackTraceString(localRuntimeException)));
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.MethodChannel.IncomingMethodCallHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */