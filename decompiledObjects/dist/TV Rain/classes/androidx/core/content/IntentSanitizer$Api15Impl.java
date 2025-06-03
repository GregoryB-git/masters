package androidx.core.content;

import android.content.Intent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(15)
class IntentSanitizer$Api15Impl
{
  @DoNotInline
  public static Intent getSelector(Intent paramIntent)
  {
    return paramIntent.getSelector();
  }
  
  @DoNotInline
  public static void setSelector(Intent paramIntent1, Intent paramIntent2)
  {
    paramIntent1.setSelector(paramIntent2);
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.IntentSanitizer.Api15Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */