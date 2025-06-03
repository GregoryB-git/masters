package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Message;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public final class MessageCompat
{
  private static boolean sTryIsAsynchronous = true;
  private static boolean sTrySetAsynchronous = true;
  
  @SuppressLint({"NewApi"})
  public static boolean isAsynchronous(@NonNull Message paramMessage)
  {
    return Api22Impl.isAsynchronous(paramMessage);
  }
  
  @SuppressLint({"NewApi"})
  public static void setAsynchronous(@NonNull Message paramMessage, boolean paramBoolean)
  {
    Api22Impl.setAsynchronous(paramMessage, paramBoolean);
  }
  
  @RequiresApi(22)
  public static class Api22Impl
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
}

/* Location:
 * Qualified Name:     androidx.core.os.MessageCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */