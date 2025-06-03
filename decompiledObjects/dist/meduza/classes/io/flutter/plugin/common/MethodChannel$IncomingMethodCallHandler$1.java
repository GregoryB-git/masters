package io.flutter.plugin.common;

class MethodChannel$IncomingMethodCallHandler$1
  implements MethodChannel.Result
{
  public void error(String paramString1, String paramString2, Object paramObject)
  {
    val$reply.reply(MethodChannel.access$000(this$1.this$0).encodeErrorEnvelope(paramString1, paramString2, paramObject));
  }
  
  public void notImplemented()
  {
    val$reply.reply(null);
  }
  
  public void success(Object paramObject)
  {
    val$reply.reply(MethodChannel.access$000(this$1.this$0).encodeSuccessEnvelope(paramObject));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.MethodChannel.IncomingMethodCallHandler.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */