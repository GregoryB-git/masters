package io.flutter.plugins.googlesignin;

import io.flutter.plugin.common.BasicMessageChannel.Reply;
import java.util.ArrayList;

class Messages$GoogleSignInApi$1
  implements Messages.Result<Messages.UserData>
{
  public void error(Throwable paramThrowable)
  {
    paramThrowable = Messages.wrapError(paramThrowable);
    val$reply.reply(paramThrowable);
  }
  
  public void success(Messages.UserData paramUserData)
  {
    val$wrapped.add(0, paramUserData);
    val$reply.reply(val$wrapped);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.googlesignin.Messages.GoogleSignInApi.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */