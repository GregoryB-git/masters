package androidx.emoji2.text;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArraySet;
import androidx.core.util.Preconditions;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class EmojiCompat$Config
{
  @Nullable
  public int[] mEmojiAsDefaultStyleExceptions;
  public int mEmojiSpanIndicatorColor = -16711936;
  public boolean mEmojiSpanIndicatorEnabled;
  @NonNull
  public EmojiCompat.GlyphChecker mGlyphChecker = new DefaultGlyphChecker();
  @Nullable
  public Set<EmojiCompat.InitCallback> mInitCallbacks;
  public int mMetadataLoadStrategy = 0;
  @NonNull
  public final EmojiCompat.MetadataRepoLoader mMetadataLoader;
  public boolean mReplaceAll;
  public boolean mUseEmojiAsDefaultStyle;
  
  public EmojiCompat$Config(@NonNull EmojiCompat.MetadataRepoLoader paramMetadataRepoLoader)
  {
    Preconditions.checkNotNull(paramMetadataRepoLoader, "metadataLoader cannot be null.");
    mMetadataLoader = paramMetadataRepoLoader;
  }
  
  @NonNull
  public final EmojiCompat.MetadataRepoLoader getMetadataRepoLoader()
  {
    return mMetadataLoader;
  }
  
  @NonNull
  public Config registerInitCallback(@NonNull EmojiCompat.InitCallback paramInitCallback)
  {
    Preconditions.checkNotNull(paramInitCallback, "initCallback cannot be null");
    if (mInitCallbacks == null) {
      mInitCallbacks = new ArraySet();
    }
    mInitCallbacks.add(paramInitCallback);
    return this;
  }
  
  @NonNull
  public Config setEmojiSpanIndicatorColor(@ColorInt int paramInt)
  {
    mEmojiSpanIndicatorColor = paramInt;
    return this;
  }
  
  @NonNull
  public Config setEmojiSpanIndicatorEnabled(boolean paramBoolean)
  {
    mEmojiSpanIndicatorEnabled = paramBoolean;
    return this;
  }
  
  @NonNull
  public Config setGlyphChecker(@NonNull EmojiCompat.GlyphChecker paramGlyphChecker)
  {
    Preconditions.checkNotNull(paramGlyphChecker, "GlyphChecker cannot be null");
    mGlyphChecker = paramGlyphChecker;
    return this;
  }
  
  @NonNull
  public Config setMetadataLoadStrategy(int paramInt)
  {
    mMetadataLoadStrategy = paramInt;
    return this;
  }
  
  @NonNull
  public Config setReplaceAll(boolean paramBoolean)
  {
    mReplaceAll = paramBoolean;
    return this;
  }
  
  @NonNull
  public Config setUseEmojiAsDefaultStyle(boolean paramBoolean)
  {
    return setUseEmojiAsDefaultStyle(paramBoolean, null);
  }
  
  @NonNull
  public Config setUseEmojiAsDefaultStyle(boolean paramBoolean, @Nullable List<Integer> paramList)
  {
    mUseEmojiAsDefaultStyle = paramBoolean;
    if ((paramBoolean) && (paramList != null))
    {
      mEmojiAsDefaultStyleExceptions = new int[paramList.size()];
      int i = 0;
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        Integer localInteger = (Integer)paramList.next();
        mEmojiAsDefaultStyleExceptions[i] = localInteger.intValue();
        i++;
      }
      Arrays.sort(mEmojiAsDefaultStyleExceptions);
    }
    else
    {
      mEmojiAsDefaultStyleExceptions = null;
    }
    return this;
  }
  
  @NonNull
  public Config unregisterInitCallback(@NonNull EmojiCompat.InitCallback paramInitCallback)
  {
    Preconditions.checkNotNull(paramInitCallback, "initCallback cannot be null");
    Set localSet = mInitCallbacks;
    if (localSet != null) {
      localSet.remove(paramInitCallback);
    }
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.EmojiCompat.Config
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */