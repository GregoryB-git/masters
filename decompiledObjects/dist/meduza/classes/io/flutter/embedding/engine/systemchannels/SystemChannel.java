package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.JSONMessageCodec;
import java.util.HashMap;

public class SystemChannel
{
  private static final String TAG = "SystemChannel";
  public final BasicMessageChannel<Object> channel;
  
  public SystemChannel(DartExecutor paramDartExecutor)
  {
    channel = new BasicMessageChannel(paramDartExecutor, "flutter/system", JSONMessageCodec.INSTANCE);
  }
  
  public void sendMemoryPressureWarning()
  {
    Log.v("SystemChannel", "Sending memory pressure warning to Flutter.");
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("type", "memoryPressure");
    channel.send(localHashMap);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.SystemChannel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */