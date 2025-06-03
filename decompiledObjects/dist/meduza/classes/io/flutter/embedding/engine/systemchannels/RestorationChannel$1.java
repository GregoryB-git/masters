package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.plugin.common.MethodChannel.Result;

class RestorationChannel$1
  implements MethodChannel.Result
{
  public void error(String paramString1, String paramString2, Object paramObject)
  {
    paramObject = new StringBuilder();
    ((StringBuilder)paramObject).append("Error ");
    ((StringBuilder)paramObject).append(paramString1);
    ((StringBuilder)paramObject).append(" while sending restoration data to framework: ");
    ((StringBuilder)paramObject).append(paramString2);
    Log.e("RestorationChannel", ((StringBuilder)paramObject).toString());
  }
  
  public void notImplemented() {}
  
  public void success(Object paramObject)
  {
    RestorationChannel.access$002(this$0, val$data);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.RestorationChannel.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */