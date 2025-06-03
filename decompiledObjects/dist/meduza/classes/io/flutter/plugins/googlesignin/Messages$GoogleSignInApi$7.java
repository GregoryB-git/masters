package io.flutter.plugins.googlesignin;

import io.flutter.plugin.common.BasicMessageChannel.Reply;
import java.util.ArrayList;

class Messages$GoogleSignInApi$7
  implements Messages.Result<Boolean>
{
  public void error(Throwable paramThrowable)
  {
    paramThrowable = Messages.wrapError(paramThrowable);
    val$reply.reply(paramThrowable);
  }
  
  public void success(Boolean paramBoolean)
  {
    val$wrapped.add(0, paramBoolean);
    val$reply.reply(val$wrapped);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.googlesignin.Messages.GoogleSignInApi.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */