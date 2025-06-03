package androidx.core.app;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import e;
import o3;

@RequiresApi(29)
class RemoteInput$Api29Impl
{
  @DoNotInline
  public static int getEditChoicesBeforeSending(Object paramObject)
  {
    return e.a((RemoteInput)paramObject);
  }
  
  @DoNotInline
  public static RemoteInput.Builder setEditChoicesBeforeSending(RemoteInput.Builder paramBuilder, int paramInt)
  {
    return o3.e(paramBuilder, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.RemoteInput.Api29Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */