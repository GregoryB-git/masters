package io.flutter.embedding.engine.dart;

import io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler;
import io.flutter.plugin.common.BinaryMessenger.BinaryReply;
import io.flutter.plugin.common.StringCodec;
import java.nio.ByteBuffer;

class DartExecutor$1
  implements BinaryMessenger.BinaryMessageHandler
{
  public DartExecutor$1(DartExecutor paramDartExecutor) {}
  
  public void onMessage(ByteBuffer paramByteBuffer, BinaryMessenger.BinaryReply paramBinaryReply)
  {
    DartExecutor.access$002(this$0, StringCodec.INSTANCE.decodeMessage(paramByteBuffer));
    if (DartExecutor.access$100(this$0) != null) {
      DartExecutor.access$100(this$0).onIsolateServiceIdAvailable(DartExecutor.access$000(this$0));
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.dart.DartExecutor.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */