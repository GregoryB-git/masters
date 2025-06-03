package androidx.emoji2.text;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import androidx.core.provider.FontsContractCompat.FontFamilyResult;
import androidx.core.provider.FontsContractCompat.FontInfo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class FontRequestEmojiCompatConfig$FontProviderHelper
{
  @Nullable
  public Typeface buildTypeface(@NonNull Context paramContext, @NonNull FontsContractCompat.FontInfo paramFontInfo)
    throws PackageManager.NameNotFoundException
  {
    return FontsContractCompat.buildTypeface(paramContext, null, new FontsContractCompat.FontInfo[] { paramFontInfo });
  }
  
  @NonNull
  public FontsContractCompat.FontFamilyResult fetchFonts(@NonNull Context paramContext, @NonNull FontRequest paramFontRequest)
    throws PackageManager.NameNotFoundException
  {
    return FontsContractCompat.fetchFonts(paramContext, null, paramFontRequest);
  }
  
  public void registerObserver(@NonNull Context paramContext, @NonNull Uri paramUri, @NonNull ContentObserver paramContentObserver)
  {
    paramContext.getContentResolver().registerContentObserver(paramUri, false, paramContentObserver);
  }
  
  public void unregisterObserver(@NonNull Context paramContext, @NonNull ContentObserver paramContentObserver)
  {
    paramContext.getContentResolver().unregisterContentObserver(paramContentObserver);
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */