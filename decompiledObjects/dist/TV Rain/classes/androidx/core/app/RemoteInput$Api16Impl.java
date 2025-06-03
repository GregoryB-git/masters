package androidx.core.app;

import android.content.ClipData;
import android.content.Intent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(16)
class RemoteInput$Api16Impl
{
  @DoNotInline
  public static ClipData getClipData(Intent paramIntent)
  {
    return paramIntent.getClipData();
  }
  
  @DoNotInline
  public static void setClipData(Intent paramIntent, ClipData paramClipData)
  {
    paramIntent.setClipData(paramClipData);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.RemoteInput.Api16Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */