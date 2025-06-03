package androidx.core.app;

import android.app.RemoteInput.Builder;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Map;
import java.util.Set;
import p3;

@RequiresApi(26)
class RemoteInput$Api26Impl
{
  @DoNotInline
  public static void addDataResultToIntent(RemoteInput paramRemoteInput, Intent paramIntent, Map<String, Uri> paramMap)
  {
    p3.n(RemoteInput.fromCompat(paramRemoteInput), paramIntent, paramMap);
  }
  
  @DoNotInline
  public static Set<String> getAllowedDataTypes(Object paramObject)
  {
    return p3.k((android.app.RemoteInput)paramObject);
  }
  
  @DoNotInline
  public static Map<String, Uri> getDataResultsFromIntent(Intent paramIntent, String paramString)
  {
    return p3.j(paramIntent, paramString);
  }
  
  @DoNotInline
  public static RemoteInput.Builder setAllowDataType(RemoteInput.Builder paramBuilder, String paramString, boolean paramBoolean)
  {
    return p3.c(paramBuilder, paramString, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.RemoteInput.Api26Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */