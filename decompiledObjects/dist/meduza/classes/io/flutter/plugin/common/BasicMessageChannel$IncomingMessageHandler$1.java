package io.flutter.plugin.common;

class BasicMessageChannel$IncomingMessageHandler$1
  implements BasicMessageChannel.Reply<T>
{
  public void reply(T paramT)
  {
    val$callback.reply(BasicMessageChannel.access$200(this$1.this$0).encodeMessage(paramT));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.BasicMessageChannel.IncomingMessageHandler.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */