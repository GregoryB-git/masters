package androidx.core.app;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import java.util.Set;

@RequiresApi(20)
class RemoteInput$Api20Impl
{
  @DoNotInline
  public static void addResultsToIntent(Object paramObject, Intent paramIntent, Bundle paramBundle)
  {
    android.app.RemoteInput.addResultsToIntent((android.app.RemoteInput[])paramObject, paramIntent, paramBundle);
  }
  
  public static android.app.RemoteInput fromCompat(RemoteInput paramRemoteInput)
  {
    android.app.RemoteInput.Builder localBuilder = new android.app.RemoteInput.Builder(paramRemoteInput.getResultKey()).setLabel(paramRemoteInput.getLabel()).setChoices(paramRemoteInput.getChoices()).setAllowFreeFormInput(paramRemoteInput.getAllowFreeFormInput()).addExtras(paramRemoteInput.getExtras());
    if (Build.VERSION.SDK_INT >= 26)
    {
      Object localObject = paramRemoteInput.getAllowedDataTypes();
      if (localObject != null)
      {
        localObject = ((Set)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          RemoteInput.Api26Impl.setAllowDataType(localBuilder, (String)((Iterator)localObject).next(), true);
        }
      }
    }
    if (Build.VERSION.SDK_INT >= 29) {
      RemoteInput.Api29Impl.setEditChoicesBeforeSending(localBuilder, paramRemoteInput.getEditChoicesBeforeSending());
    }
    return localBuilder.build();
  }
  
  public static RemoteInput fromPlatform(Object paramObject)
  {
    paramObject = (android.app.RemoteInput)paramObject;
    RemoteInput.Builder localBuilder = new RemoteInput.Builder(((android.app.RemoteInput)paramObject).getResultKey()).setLabel(((android.app.RemoteInput)paramObject).getLabel()).setChoices(((android.app.RemoteInput)paramObject).getChoices()).setAllowFreeFormInput(((android.app.RemoteInput)paramObject).getAllowFreeFormInput()).addExtras(((android.app.RemoteInput)paramObject).getExtras());
    if (Build.VERSION.SDK_INT >= 26)
    {
      Object localObject = RemoteInput.Api26Impl.getAllowedDataTypes(paramObject);
      if (localObject != null)
      {
        localObject = ((Set)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          localBuilder.setAllowDataType((String)((Iterator)localObject).next(), true);
        }
      }
    }
    if (Build.VERSION.SDK_INT >= 29) {
      localBuilder.setEditChoicesBeforeSending(RemoteInput.Api29Impl.getEditChoicesBeforeSending(paramObject));
    }
    return localBuilder.build();
  }
  
  @DoNotInline
  public static Bundle getResultsFromIntent(Intent paramIntent)
  {
    return android.app.RemoteInput.getResultsFromIntent(paramIntent);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.RemoteInput.Api20Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */