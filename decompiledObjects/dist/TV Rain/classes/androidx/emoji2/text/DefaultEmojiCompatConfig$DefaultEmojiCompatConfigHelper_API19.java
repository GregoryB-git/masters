package androidx.emoji2.text;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.List;

@RequiresApi(19)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper_API19
  extends DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
{
  @Nullable
  public ProviderInfo getProviderInfo(@NonNull ResolveInfo paramResolveInfo)
  {
    return providerInfo;
  }
  
  @NonNull
  public List<ResolveInfo> queryIntentContentProviders(@NonNull PackageManager paramPackageManager, @NonNull Intent paramIntent, int paramInt)
  {
    return paramPackageManager.queryIntentContentProviders(paramIntent, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper_API19
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */