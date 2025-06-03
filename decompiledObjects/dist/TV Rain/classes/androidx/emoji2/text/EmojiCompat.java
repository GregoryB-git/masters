package androidx.emoji2.text;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.AnyThread;
import androidx.annotation.CheckResult;
import androidx.annotation.ColorInt;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@AnyThread
public class EmojiCompat
{
  private static final Object CONFIG_LOCK = new Object();
  public static final String EDITOR_INFO_METAVERSION_KEY = "android.support.text.emoji.emojiCompat_metadataVersion";
  public static final String EDITOR_INFO_REPLACE_ALL_KEY = "android.support.text.emoji.emojiCompat_replaceAll";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final int EMOJI_COUNT_UNLIMITED = Integer.MAX_VALUE;
  public static final int EMOJI_FALLBACK = 2;
  public static final int EMOJI_SUPPORTED = 1;
  public static final int EMOJI_UNSUPPORTED = 0;
  private static final Object INSTANCE_LOCK = new Object();
  public static final int LOAD_STATE_DEFAULT = 3;
  public static final int LOAD_STATE_FAILED = 2;
  public static final int LOAD_STATE_LOADING = 0;
  public static final int LOAD_STATE_SUCCEEDED = 1;
  public static final int LOAD_STRATEGY_DEFAULT = 0;
  public static final int LOAD_STRATEGY_MANUAL = 1;
  private static final String NOT_INITIALIZED_ERROR_TEXT = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";
  public static final int REPLACE_STRATEGY_ALL = 1;
  public static final int REPLACE_STRATEGY_DEFAULT = 0;
  public static final int REPLACE_STRATEGY_NON_EXISTENT = 2;
  @GuardedBy("CONFIG_LOCK")
  private static volatile boolean sHasDoneDefaultConfigLookup;
  @GuardedBy("INSTANCE_LOCK")
  @Nullable
  private static volatile EmojiCompat sInstance;
  @Nullable
  public final int[] mEmojiAsDefaultStyleExceptions;
  private final int mEmojiSpanIndicatorColor;
  private final boolean mEmojiSpanIndicatorEnabled;
  private final GlyphChecker mGlyphChecker;
  @NonNull
  private final CompatInternal mHelper;
  @GuardedBy("mInitLock")
  @NonNull
  private final Set<InitCallback> mInitCallbacks;
  @NonNull
  private final ReadWriteLock mInitLock = new ReentrantReadWriteLock();
  @GuardedBy("mInitLock")
  private volatile int mLoadState = 3;
  @NonNull
  private final Handler mMainHandler;
  private final int mMetadataLoadStrategy;
  @NonNull
  public final MetadataRepoLoader mMetadataLoader;
  public final boolean mReplaceAll;
  public final boolean mUseEmojiAsDefaultStyle;
  
  private EmojiCompat(@NonNull Config paramConfig)
  {
    mReplaceAll = mReplaceAll;
    mUseEmojiAsDefaultStyle = mUseEmojiAsDefaultStyle;
    mEmojiAsDefaultStyleExceptions = mEmojiAsDefaultStyleExceptions;
    mEmojiSpanIndicatorEnabled = mEmojiSpanIndicatorEnabled;
    mEmojiSpanIndicatorColor = mEmojiSpanIndicatorColor;
    mMetadataLoader = mMetadataLoader;
    mMetadataLoadStrategy = mMetadataLoadStrategy;
    mGlyphChecker = mGlyphChecker;
    mMainHandler = new Handler(Looper.getMainLooper());
    ArraySet localArraySet = new ArraySet();
    mInitCallbacks = localArraySet;
    Set localSet = mInitCallbacks;
    if ((localSet != null) && (!localSet.isEmpty())) {
      localArraySet.addAll(mInitCallbacks);
    }
    mHelper = new CompatInternal19(this);
    loadMetadata();
  }
  
  @NonNull
  public static EmojiCompat get()
  {
    synchronized (INSTANCE_LOCK)
    {
      EmojiCompat localEmojiCompat = sInstance;
      boolean bool;
      if (localEmojiCompat != null) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkState(bool, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
      return localEmojiCompat;
    }
  }
  
  public static boolean handleDeleteSurroundingText(@NonNull InputConnection paramInputConnection, @NonNull Editable paramEditable, @IntRange(from=0L) int paramInt1, @IntRange(from=0L) int paramInt2, boolean paramBoolean)
  {
    return EmojiProcessor.handleDeleteSurroundingText(paramInputConnection, paramEditable, paramInt1, paramInt2, paramBoolean);
  }
  
  public static boolean handleOnKeyDown(@NonNull Editable paramEditable, int paramInt, @NonNull KeyEvent paramKeyEvent)
  {
    return EmojiProcessor.handleOnKeyDown(paramEditable, paramInt, paramKeyEvent);
  }
  
  @Nullable
  public static EmojiCompat init(@NonNull Context paramContext)
  {
    return init(paramContext, null);
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static EmojiCompat init(@NonNull Context arg0, @Nullable DefaultEmojiCompatConfig.DefaultEmojiCompatConfigFactory paramDefaultEmojiCompatConfigFactory)
  {
    if (sHasDoneDefaultConfigLookup) {
      return sInstance;
    }
    if (paramDefaultEmojiCompatConfigFactory == null) {
      paramDefaultEmojiCompatConfigFactory = new DefaultEmojiCompatConfig.DefaultEmojiCompatConfigFactory(null);
    }
    paramDefaultEmojiCompatConfigFactory = paramDefaultEmojiCompatConfigFactory.create(???);
    synchronized (CONFIG_LOCK)
    {
      if (!sHasDoneDefaultConfigLookup)
      {
        if (paramDefaultEmojiCompatConfigFactory != null) {
          init(paramDefaultEmojiCompatConfigFactory);
        }
        sHasDoneDefaultConfigLookup = true;
      }
      paramDefaultEmojiCompatConfigFactory = sInstance;
      return paramDefaultEmojiCompatConfigFactory;
    }
  }
  
  @NonNull
  public static EmojiCompat init(@NonNull Config paramConfig)
  {
    EmojiCompat localEmojiCompat1 = sInstance;
    EmojiCompat localEmojiCompat2 = localEmojiCompat1;
    if (localEmojiCompat1 == null) {
      synchronized (INSTANCE_LOCK)
      {
        localEmojiCompat1 = sInstance;
        localEmojiCompat2 = localEmojiCompat1;
        if (localEmojiCompat1 == null)
        {
          localEmojiCompat2 = new androidx/emoji2/text/EmojiCompat;
          localEmojiCompat2.<init>(paramConfig);
          sInstance = localEmojiCompat2;
        }
      }
    }
    return localEmojiCompat2;
  }
  
  public static boolean isConfigured()
  {
    boolean bool;
    if (sInstance != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean isInitialized()
  {
    int i = getLoadState();
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  private void loadMetadata()
  {
    mInitLock.writeLock().lock();
    try
    {
      if (mMetadataLoadStrategy == 0) {
        mLoadState = 0;
      }
      mInitLock.writeLock().unlock();
      if (getLoadState() == 0) {
        mHelper.loadMetadata();
      }
      return;
    }
    finally
    {
      mInitLock.writeLock().unlock();
    }
  }
  
  @NonNull
  public static EmojiCompat reset(@NonNull Config paramConfig)
  {
    synchronized (INSTANCE_LOCK)
    {
      EmojiCompat localEmojiCompat = new androidx/emoji2/text/EmojiCompat;
      localEmojiCompat.<init>(paramConfig);
      sInstance = localEmojiCompat;
      return localEmojiCompat;
    }
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.TESTS})
  public static EmojiCompat reset(@Nullable EmojiCompat paramEmojiCompat)
  {
    synchronized (INSTANCE_LOCK)
    {
      sInstance = paramEmojiCompat;
      paramEmojiCompat = sInstance;
      return paramEmojiCompat;
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.TESTS})
  public static void skipDefaultConfigurationLookup(boolean paramBoolean)
  {
    synchronized (CONFIG_LOCK)
    {
      sHasDoneDefaultConfigLookup = paramBoolean;
      return;
    }
  }
  
  @NonNull
  public String getAssetSignature()
  {
    Preconditions.checkState(isInitialized(), "Not initialized yet");
    return mHelper.getAssetSignature();
  }
  
  public int getEmojiMatch(@NonNull CharSequence paramCharSequence, @IntRange(from=0L) int paramInt)
  {
    Preconditions.checkState(isInitialized(), "Not initialized yet");
    Preconditions.checkNotNull(paramCharSequence, "sequence cannot be null");
    return mHelper.getEmojiMatch(paramCharSequence, paramInt);
  }
  
  @ColorInt
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public int getEmojiSpanIndicatorColor()
  {
    return mEmojiSpanIndicatorColor;
  }
  
  public int getLoadState()
  {
    mInitLock.readLock().lock();
    try
    {
      int i = mLoadState;
      return i;
    }
    finally
    {
      mInitLock.readLock().unlock();
    }
  }
  
  @Deprecated
  public boolean hasEmojiGlyph(@NonNull CharSequence paramCharSequence)
  {
    Preconditions.checkState(isInitialized(), "Not initialized yet");
    Preconditions.checkNotNull(paramCharSequence, "sequence cannot be null");
    return mHelper.hasEmojiGlyph(paramCharSequence);
  }
  
  @Deprecated
  public boolean hasEmojiGlyph(@NonNull CharSequence paramCharSequence, @IntRange(from=0L) int paramInt)
  {
    Preconditions.checkState(isInitialized(), "Not initialized yet");
    Preconditions.checkNotNull(paramCharSequence, "sequence cannot be null");
    return mHelper.hasEmojiGlyph(paramCharSequence, paramInt);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public boolean isEmojiSpanIndicatorEnabled()
  {
    return mEmojiSpanIndicatorEnabled;
  }
  
  public void load()
  {
    int i = mMetadataLoadStrategy;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    Preconditions.checkState(bool, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    if (isInitialized()) {
      return;
    }
    mInitLock.writeLock().lock();
    try
    {
      i = mLoadState;
      if (i == 0) {
        return;
      }
      mLoadState = 0;
      mInitLock.writeLock().unlock();
      mHelper.loadMetadata();
      return;
    }
    finally
    {
      mInitLock.writeLock().unlock();
    }
  }
  
  public void onMetadataLoadFailed(@Nullable Throwable paramThrowable)
  {
    ArrayList localArrayList = new ArrayList();
    mInitLock.writeLock().lock();
    try
    {
      mLoadState = 2;
      localArrayList.addAll(mInitCallbacks);
      mInitCallbacks.clear();
      mInitLock.writeLock().unlock();
      mMainHandler.post(new ListenerDispatcher(localArrayList, mLoadState, paramThrowable));
      return;
    }
    finally
    {
      mInitLock.writeLock().unlock();
    }
  }
  
  public void onMetadataLoadSuccess()
  {
    ArrayList localArrayList = new ArrayList();
    mInitLock.writeLock().lock();
    try
    {
      mLoadState = 1;
      localArrayList.addAll(mInitCallbacks);
      mInitCallbacks.clear();
      mInitLock.writeLock().unlock();
      mMainHandler.post(new ListenerDispatcher(localArrayList, mLoadState));
      return;
    }
    finally
    {
      mInitLock.writeLock().unlock();
    }
  }
  
  @CheckResult
  @Nullable
  public CharSequence process(@Nullable CharSequence paramCharSequence)
  {
    int i;
    if (paramCharSequence == null) {
      i = 0;
    } else {
      i = paramCharSequence.length();
    }
    return process(paramCharSequence, 0, i);
  }
  
  @CheckResult
  @Nullable
  public CharSequence process(@Nullable CharSequence paramCharSequence, @IntRange(from=0L) int paramInt1, @IntRange(from=0L) int paramInt2)
  {
    return process(paramCharSequence, paramInt1, paramInt2, Integer.MAX_VALUE);
  }
  
  @CheckResult
  @Nullable
  public CharSequence process(@Nullable CharSequence paramCharSequence, @IntRange(from=0L) int paramInt1, @IntRange(from=0L) int paramInt2, @IntRange(from=0L) int paramInt3)
  {
    return process(paramCharSequence, paramInt1, paramInt2, paramInt3, 0);
  }
  
  @CheckResult
  @Nullable
  public CharSequence process(@Nullable CharSequence paramCharSequence, @IntRange(from=0L) int paramInt1, @IntRange(from=0L) int paramInt2, @IntRange(from=0L) int paramInt3, int paramInt4)
  {
    Preconditions.checkState(isInitialized(), "Not initialized yet");
    Preconditions.checkArgumentNonnegative(paramInt1, "start cannot be negative");
    Preconditions.checkArgumentNonnegative(paramInt2, "end cannot be negative");
    Preconditions.checkArgumentNonnegative(paramInt3, "maxEmojiCount cannot be negative");
    boolean bool1 = false;
    boolean bool2;
    if (paramInt1 <= paramInt2) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2, "start should be <= than end");
    if (paramCharSequence == null) {
      return null;
    }
    if (paramInt1 <= paramCharSequence.length()) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2, "start should be < than charSequence length");
    if (paramInt2 <= paramCharSequence.length()) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2, "end should be < than charSequence length");
    CharSequence localCharSequence = paramCharSequence;
    if (paramCharSequence.length() != 0) {
      if (paramInt1 == paramInt2)
      {
        localCharSequence = paramCharSequence;
      }
      else
      {
        if (paramInt4 != 1)
        {
          bool2 = bool1;
          if (paramInt4 != 2) {
            bool2 = mReplaceAll;
          }
        }
        else
        {
          bool2 = true;
        }
        localCharSequence = mHelper.process(paramCharSequence, paramInt1, paramInt2, paramInt3, bool2);
      }
    }
    return localCharSequence;
  }
  
  public void registerInitCallback(@NonNull InitCallback paramInitCallback)
  {
    Preconditions.checkNotNull(paramInitCallback, "initCallback cannot be null");
    mInitLock.writeLock().lock();
    try
    {
      if ((mLoadState != 1) && (mLoadState != 2))
      {
        mInitCallbacks.add(paramInitCallback);
      }
      else
      {
        Handler localHandler = mMainHandler;
        ListenerDispatcher localListenerDispatcher = new androidx/emoji2/text/EmojiCompat$ListenerDispatcher;
        localListenerDispatcher.<init>(paramInitCallback, mLoadState);
        localHandler.post(localListenerDispatcher);
      }
      return;
    }
    finally
    {
      mInitLock.writeLock().unlock();
    }
  }
  
  public void unregisterInitCallback(@NonNull InitCallback paramInitCallback)
  {
    Preconditions.checkNotNull(paramInitCallback, "initCallback cannot be null");
    mInitLock.writeLock().lock();
    try
    {
      mInitCallbacks.remove(paramInitCallback);
      return;
    }
    finally
    {
      mInitLock.writeLock().unlock();
    }
  }
  
  public void updateEditorInfo(@NonNull EditorInfo paramEditorInfo)
  {
    if ((isInitialized()) && (paramEditorInfo != null))
    {
      if (extras == null) {
        extras = new Bundle();
      }
      mHelper.updateEditorInfoAttrs(paramEditorInfo);
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static @interface CodepointSequenceMatchResult {}
  
  public static class CompatInternal
  {
    public final EmojiCompat mEmojiCompat;
    
    public CompatInternal(EmojiCompat paramEmojiCompat)
    {
      mEmojiCompat = paramEmojiCompat;
    }
    
    public String getAssetSignature()
    {
      return "";
    }
    
    public int getEmojiMatch(CharSequence paramCharSequence, int paramInt)
    {
      return 0;
    }
    
    public boolean hasEmojiGlyph(@NonNull CharSequence paramCharSequence)
    {
      return false;
    }
    
    public boolean hasEmojiGlyph(@NonNull CharSequence paramCharSequence, int paramInt)
    {
      return false;
    }
    
    public void loadMetadata()
    {
      mEmojiCompat.onMetadataLoadSuccess();
    }
    
    public CharSequence process(@NonNull CharSequence paramCharSequence, @IntRange(from=0L) int paramInt1, @IntRange(from=0L) int paramInt2, @IntRange(from=0L) int paramInt3, boolean paramBoolean)
    {
      return paramCharSequence;
    }
    
    public void updateEditorInfoAttrs(@NonNull EditorInfo paramEditorInfo) {}
  }
  
  @RequiresApi(19)
  public static final class CompatInternal19
    extends EmojiCompat.CompatInternal
  {
    private volatile MetadataRepo mMetadataRepo;
    private volatile EmojiProcessor mProcessor;
    
    public CompatInternal19(EmojiCompat paramEmojiCompat)
    {
      super();
    }
    
    public String getAssetSignature()
    {
      String str1 = mMetadataRepo.getMetadataList().sourceSha();
      String str2 = str1;
      if (str1 == null) {
        str2 = "";
      }
      return str2;
    }
    
    public int getEmojiMatch(CharSequence paramCharSequence, int paramInt)
    {
      return mProcessor.getEmojiMatch(paramCharSequence, paramInt);
    }
    
    public boolean hasEmojiGlyph(@NonNull CharSequence paramCharSequence)
    {
      int i = mProcessor.getEmojiMatch(paramCharSequence);
      boolean bool = true;
      if (i != 1) {
        bool = false;
      }
      return bool;
    }
    
    public boolean hasEmojiGlyph(@NonNull CharSequence paramCharSequence, int paramInt)
    {
      paramInt = mProcessor.getEmojiMatch(paramCharSequence, paramInt);
      boolean bool = true;
      if (paramInt != 1) {
        bool = false;
      }
      return bool;
    }
    
    /* Error */
    public void loadMetadata()
    {
      // Byte code:
      //   0: new 9	androidx/emoji2/text/EmojiCompat$CompatInternal19$1
      //   3: astore_1
      //   4: aload_1
      //   5: aload_0
      //   6: invokespecial 59	androidx/emoji2/text/EmojiCompat$CompatInternal19$1:<init>	(Landroidx/emoji2/text/EmojiCompat$CompatInternal19;)V
      //   9: aload_0
      //   10: getfield 63	androidx/emoji2/text/EmojiCompat$CompatInternal:mEmojiCompat	Landroidx/emoji2/text/EmojiCompat;
      //   13: getfield 67	androidx/emoji2/text/EmojiCompat:mMetadataLoader	Landroidx/emoji2/text/EmojiCompat$MetadataRepoLoader;
      //   16: aload_1
      //   17: invokeinterface 73 2 0
      //   22: goto +12 -> 34
      //   25: astore_1
      //   26: aload_0
      //   27: getfield 63	androidx/emoji2/text/EmojiCompat$CompatInternal:mEmojiCompat	Landroidx/emoji2/text/EmojiCompat;
      //   30: aload_1
      //   31: invokevirtual 77	androidx/emoji2/text/EmojiCompat:onMetadataLoadFailed	(Ljava/lang/Throwable;)V
      //   34: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	35	0	this	CompatInternal19
      //   3	14	1	local1	1
      //   25	6	1	localThrowable	Throwable
      // Exception table:
      //   from	to	target	type
      //   0	22	25	finally
    }
    
    public void onMetadataLoadSuccess(@NonNull MetadataRepo paramMetadataRepo)
    {
      if (paramMetadataRepo == null)
      {
        mEmojiCompat.onMetadataLoadFailed(new IllegalArgumentException("metadataRepo cannot be null"));
        return;
      }
      mMetadataRepo = paramMetadataRepo;
      MetadataRepo localMetadataRepo = mMetadataRepo;
      paramMetadataRepo = new EmojiCompat.SpanFactory();
      EmojiCompat.GlyphChecker localGlyphChecker = EmojiCompat.access$000(mEmojiCompat);
      EmojiCompat localEmojiCompat = mEmojiCompat;
      mProcessor = new EmojiProcessor(localMetadataRepo, paramMetadataRepo, localGlyphChecker, mUseEmojiAsDefaultStyle, mEmojiAsDefaultStyleExceptions);
      mEmojiCompat.onMetadataLoadSuccess();
    }
    
    public CharSequence process(@NonNull CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    {
      return mProcessor.process(paramCharSequence, paramInt1, paramInt2, paramInt3, paramBoolean);
    }
    
    public void updateEditorInfoAttrs(@NonNull EditorInfo paramEditorInfo)
    {
      extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", mMetadataRepo.getMetadataVersion());
      extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", mEmojiCompat.mReplaceAll);
    }
  }
  
  public static abstract class Config
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
    
    public Config(@NonNull EmojiCompat.MetadataRepoLoader paramMetadataRepoLoader)
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
  
  public static abstract interface GlyphChecker
  {
    public abstract boolean hasGlyph(@NonNull CharSequence paramCharSequence, @IntRange(from=0L) int paramInt1, @IntRange(from=0L) int paramInt2, @IntRange(from=0L) int paramInt3);
  }
  
  public static abstract class InitCallback
  {
    public void onFailed(@Nullable Throwable paramThrowable) {}
    
    public void onInitialized() {}
  }
  
  public static class ListenerDispatcher
    implements Runnable
  {
    private final List<EmojiCompat.InitCallback> mInitCallbacks;
    private final int mLoadState;
    private final Throwable mThrowable;
    
    public ListenerDispatcher(@NonNull EmojiCompat.InitCallback paramInitCallback, int paramInt)
    {
      this(Arrays.asList(new EmojiCompat.InitCallback[] { (EmojiCompat.InitCallback)Preconditions.checkNotNull(paramInitCallback, "initCallback cannot be null") }), paramInt, null);
    }
    
    public ListenerDispatcher(@NonNull Collection<EmojiCompat.InitCallback> paramCollection, int paramInt)
    {
      this(paramCollection, paramInt, null);
    }
    
    public ListenerDispatcher(@NonNull Collection<EmojiCompat.InitCallback> paramCollection, int paramInt, @Nullable Throwable paramThrowable)
    {
      Preconditions.checkNotNull(paramCollection, "initCallbacks cannot be null");
      mInitCallbacks = new ArrayList(paramCollection);
      mLoadState = paramInt;
      mThrowable = paramThrowable;
    }
    
    public void run()
    {
      int i = mInitCallbacks.size();
      int j = mLoadState;
      int k = 0;
      int m = 0;
      if (j != 1) {
        for (k = m; k < i; k++) {
          ((EmojiCompat.InitCallback)mInitCallbacks.get(k)).onFailed(mThrowable);
        }
      }
      while (k < i)
      {
        ((EmojiCompat.InitCallback)mInitCallbacks.get(k)).onInitialized();
        k++;
      }
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static @interface LoadStrategy {}
  
  public static abstract interface MetadataRepoLoader
  {
    public abstract void load(@NonNull EmojiCompat.MetadataRepoLoaderCallback paramMetadataRepoLoaderCallback);
  }
  
  public static abstract class MetadataRepoLoaderCallback
  {
    public abstract void onFailed(@Nullable Throwable paramThrowable);
    
    public abstract void onLoaded(@NonNull MetadataRepo paramMetadataRepo);
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static @interface ReplaceStrategy {}
  
  @RequiresApi(19)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static class SpanFactory
  {
    public EmojiSpan createSpan(@NonNull EmojiMetadata paramEmojiMetadata)
    {
      return new TypefaceEmojiSpan(paramEmojiMetadata);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.EmojiCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */