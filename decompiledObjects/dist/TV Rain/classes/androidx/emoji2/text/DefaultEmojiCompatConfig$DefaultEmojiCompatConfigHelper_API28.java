package androidx.emoji2.text;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RequiresApi(28)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper_API28
  extends DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper_API19
{
  @NonNull
  public Signature[] getSigningSignatures(@NonNull PackageManager paramPackageManager, @NonNull String paramString)
    throws PackageManager.NameNotFoundException
  {
    return getPackageInfo64signatures;
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper_API28
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */