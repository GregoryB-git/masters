package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.provider.FontRequest;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class DefaultEmojiCompatConfig
{
  @Nullable
  public static FontRequestEmojiCompatConfig create(@NonNull Context paramContext)
  {
    return (FontRequestEmojiCompatConfig)new DefaultEmojiCompatConfigFactory(null).create(paramContext);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static class DefaultEmojiCompatConfigFactory
  {
    @NonNull
    private static final String DEFAULT_EMOJI_QUERY = "emojicompat-emoji-font";
    @NonNull
    private static final String INTENT_LOAD_EMOJI_FONT = "androidx.content.action.LOAD_EMOJI_FONT";
    @NonNull
    private static final String TAG = "emoji2.text.DefaultEmojiConfig";
    private final DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper mHelper;
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public DefaultEmojiCompatConfigFactory(@Nullable DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper paramDefaultEmojiCompatConfigHelper)
    {
      if (paramDefaultEmojiCompatConfigHelper == null) {
        paramDefaultEmojiCompatConfigHelper = getHelperForApi();
      }
      mHelper = paramDefaultEmojiCompatConfigHelper;
    }
    
    @Nullable
    private EmojiCompat.Config configOrNull(@NonNull Context paramContext, @Nullable FontRequest paramFontRequest)
    {
      if (paramFontRequest == null) {
        return null;
      }
      return new FontRequestEmojiCompatConfig(paramContext, paramFontRequest);
    }
    
    @NonNull
    private List<List<byte[]>> convertToByteArray(@NonNull Signature[] paramArrayOfSignature)
    {
      ArrayList localArrayList = new ArrayList();
      int i = paramArrayOfSignature.length;
      for (int j = 0; j < i; j++) {
        localArrayList.add(paramArrayOfSignature[j].toByteArray());
      }
      return Collections.singletonList(localArrayList);
    }
    
    @NonNull
    private FontRequest generateFontRequestFrom(@NonNull ProviderInfo paramProviderInfo, @NonNull PackageManager paramPackageManager)
      throws PackageManager.NameNotFoundException
    {
      String str = authority;
      paramProviderInfo = packageName;
      return new FontRequest(str, paramProviderInfo, "emojicompat-emoji-font", convertToByteArray(mHelper.getSigningSignatures(paramPackageManager, paramProviderInfo)));
    }
    
    @NonNull
    private static DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper getHelperForApi()
    {
      if (Build.VERSION.SDK_INT >= 28) {
        return new DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper_API28();
      }
      return new DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper_API19();
    }
    
    private boolean hasFlagSystem(@Nullable ProviderInfo paramProviderInfo)
    {
      boolean bool = true;
      if (paramProviderInfo != null)
      {
        paramProviderInfo = applicationInfo;
        if ((paramProviderInfo != null) && ((flags & 0x1) == 1)) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    
    @Nullable
    private ProviderInfo queryDefaultInstalledContentProvider(@NonNull PackageManager paramPackageManager)
    {
      paramPackageManager = mHelper.queryIntentContentProviders(paramPackageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
      while (paramPackageManager.hasNext())
      {
        Object localObject = (ResolveInfo)paramPackageManager.next();
        localObject = mHelper.getProviderInfo((ResolveInfo)localObject);
        if (hasFlagSystem((ProviderInfo)localObject)) {
          return (ProviderInfo)localObject;
        }
      }
      return null;
    }
    
    @Nullable
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public EmojiCompat.Config create(@NonNull Context paramContext)
    {
      return configOrNull(paramContext, queryForDefaultFontRequest(paramContext));
    }
    
    @Nullable
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public FontRequest queryForDefaultFontRequest(@NonNull Context paramContext)
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      Preconditions.checkNotNull(localPackageManager, "Package manager required to locate emoji font provider");
      paramContext = queryDefaultInstalledContentProvider(localPackageManager);
      if (paramContext == null) {
        return null;
      }
      try
      {
        paramContext = generateFontRequestFrom(paramContext, localPackageManager);
        return paramContext;
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        Log.wtf("emoji2.text.DefaultEmojiConfig", paramContext);
      }
      return null;
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static class DefaultEmojiCompatConfigHelper
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
  
  @RequiresApi(19)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static class DefaultEmojiCompatConfigHelper_API19
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
  
  @RequiresApi(28)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static class DefaultEmojiCompatConfigHelper_API28
    extends DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper_API19
  {
    @NonNull
    public Signature[] getSigningSignatures(@NonNull PackageManager paramPackageManager, @NonNull String paramString)
      throws PackageManager.NameNotFoundException
    {
      return getPackageInfo64signatures;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.DefaultEmojiCompatConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */