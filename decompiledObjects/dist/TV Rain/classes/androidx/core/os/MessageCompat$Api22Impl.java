package androidx.core.os;

import android.os.Message;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(22)
class MessageCompat$Api22Impl
{
  @DoNotInline
  public static boolean isAsynchronous(Message paramMessage)
  {
    return paramMessage.isAsynchronous();
  }
  
  @DoNotInline
  public static void setAsynchronous(Message paramMessage, boolean paramBoolean)
  {
    paramMessage.setAsynchronous(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.MessageCompat.Api22Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */