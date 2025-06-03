package androidx.core.app;

import a3;
import android.content.Intent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(28)
class RemoteInput$Api28Impl
{
  @DoNotInline
  public static int getResultsSource(Intent paramIntent)
  {
    return a3.b(paramIntent);
  }
  
  @DoNotInline
  public static void setResultsSource(Intent paramIntent, int paramInt)
  {
    a3.s(paramIntent, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.RemoteInput.Api28Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */