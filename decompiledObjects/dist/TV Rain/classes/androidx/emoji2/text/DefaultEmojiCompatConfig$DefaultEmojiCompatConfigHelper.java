package androidx.emoji2.text;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Collections;
import java.util.List;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper
{
  @Nullable
  public ProviderInfo getProviderInfo(@NonNull ResolveInfo paramResolveInfo)
  {
    throw new IllegalStateException("Unable to get provider info prior to API 19");
  }
  
  @NonNull
  public Signature[] getSigningSignatures(@NonNull PackageManager paramPackageManager, @NonNull String paramString)
    throws PackageManager.NameNotFoundException
  {
    return getPackageInfo64signatures;
  }
  
  @NonNull
  public List<ResolveInfo> queryIntentContentProviders(@NonNull PackageManager paramPackageManager, @NonNull Intent paramIntent, int paramInt)
  {
    return Collections.emptyList();
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */