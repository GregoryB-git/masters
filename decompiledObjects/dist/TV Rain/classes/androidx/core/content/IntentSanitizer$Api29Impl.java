package androidx.core.content;

import android.content.Intent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import e;

@RequiresApi(29)
class IntentSanitizer$Api29Impl
{
  @DoNotInline
  public static String getIdentifier(Intent paramIntent)
  {
    return e.j(paramIntent);
  }
  
  @DoNotInline
  public static Intent setIdentifier(Intent paramIntent, String paramString)
  {
    return e.c(paramIntent, paramString);
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.IntentSanitizer.Api29Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */