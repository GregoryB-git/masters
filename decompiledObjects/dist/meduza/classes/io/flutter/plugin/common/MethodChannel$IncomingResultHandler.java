package io.flutter.plugin.common;

import f;
import io.flutter.Log;
import java.nio.ByteBuffer;

final class MethodChannel$IncomingResultHandler
  implements BinaryMessenger.BinaryReply
{
  private final MethodChannel.Result callback;
  
  public MethodChannel$IncomingResultHandler(MethodChannel paramMethodChannel, MethodChannel.Result paramResult)
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
        callback.success(MethodChannel.access$000(this$0).decodeEnvelope(paramByteBuffer));
      }
      catch (FlutterException paramByteBuffer)
      {
        callback.error(code, paramByteBuffer.getMessage(), details);
      }
      localRuntimeException = localRuntimeException;
      paramByteBuffer = f.l("MethodChannel#");
      paramByteBuffer.append(MethodChannel.access$100(this$0));
      Log.e(paramByteBuffer.toString(), "Failed to handle method call result", localRuntimeException);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.MethodChannel.IncomingResultHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */