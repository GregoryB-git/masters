package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ComponentName;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import androidx.core.util.Predicate;
import i2;
import j2;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import k2;
import u3;

public final class IntentSanitizer$Builder
{
  private static final int HISTORY_STACK_FLAGS = 2112614400;
  private static final int RECEIVER_FLAGS = 2015363072;
  private boolean mAllowAnyComponent;
  private boolean mAllowClipDataText = false;
  private boolean mAllowIdentifier;
  private boolean mAllowSelector;
  private boolean mAllowSomeComponents;
  private boolean mAllowSourceBounds;
  private Predicate<String> mAllowedActions = new i2(2);
  private Predicate<String> mAllowedCategories = new i2(5);
  private Predicate<ClipData> mAllowedClipData = new i2(9);
  private Predicate<Uri> mAllowedClipDataUri = new i2(8);
  private Predicate<ComponentName> mAllowedComponents = new i2(7);
  private Predicate<Uri> mAllowedData = new i2(3);
  private Map<String, Predicate<Object>> mAllowedExtras = new HashMap();
  private int mAllowedFlags;
  private Predicate<String> mAllowedPackages = new i2(6);
  private Predicate<String> mAllowedTypes = new i2(4);
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowAction(@NonNull Predicate<String> paramPredicate)
  {
    Preconditions.checkNotNull(paramPredicate);
    mAllowedActions = mAllowedActions.or(paramPredicate);
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowAction(@NonNull String paramString)
  {
    Preconditions.checkNotNull(paramString);
    Objects.requireNonNull(paramString);
    allowAction(new j2(paramString, 5));
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowAnyComponent()
  {
    mAllowAnyComponent = true;
    mAllowedComponents = new i2(10);
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowCategory(@NonNull Predicate<String> paramPredicate)
  {
    Preconditions.checkNotNull(paramPredicate);
    mAllowedCategories = mAllowedCategories.or(paramPredicate);
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowCategory(@NonNull String paramString)
  {
    Preconditions.checkNotNull(paramString);
    Objects.requireNonNull(paramString);
    return allowCategory(new j2(paramString, 4));
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowClipData(@NonNull Predicate<ClipData> paramPredicate)
  {
    Preconditions.checkNotNull(paramPredicate);
    mAllowedClipData = mAllowedClipData.or(paramPredicate);
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowClipDataText()
  {
    mAllowClipDataText = true;
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowClipDataUri(@NonNull Predicate<Uri> paramPredicate)
  {
    Preconditions.checkNotNull(paramPredicate);
    mAllowedClipDataUri = mAllowedClipDataUri.or(paramPredicate);
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowClipDataUriWithAuthority(@NonNull String paramString)
  {
    Preconditions.checkNotNull(paramString);
    return allowClipDataUri(new j2(paramString, 0));
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowComponent(@NonNull ComponentName paramComponentName)
  {
    Preconditions.checkNotNull(paramComponentName);
    Objects.requireNonNull(paramComponentName);
    return allowComponent(new k2(paramComponentName, 0));
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowComponent(@NonNull Predicate<ComponentName> paramPredicate)
  {
    Preconditions.checkNotNull(paramPredicate);
    mAllowSomeComponents = true;
    mAllowedComponents = mAllowedComponents.or(paramPredicate);
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowComponentWithPackage(@NonNull String paramString)
  {
    Preconditions.checkNotNull(paramString);
    return allowComponent(new j2(paramString, 6));
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowData(@NonNull Predicate<Uri> paramPredicate)
  {
    Preconditions.checkNotNull(paramPredicate);
    mAllowedData = mAllowedData.or(paramPredicate);
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowDataWithAuthority(@NonNull String paramString)
  {
    Preconditions.checkNotNull(paramString);
    allowData(new j2(paramString, 7));
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowExtra(@NonNull String paramString, @NonNull Predicate<Object> paramPredicate)
  {
    Preconditions.checkNotNull(paramString);
    Preconditions.checkNotNull(paramPredicate);
    Predicate localPredicate = (Predicate)mAllowedExtras.get(paramString);
    Object localObject = localPredicate;
    if (localPredicate == null) {
      localObject = new i2(0);
    }
    paramPredicate = ((Predicate)localObject).or(paramPredicate);
    mAllowedExtras.put(paramString, paramPredicate);
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowExtra(@NonNull String paramString, @NonNull Class<?> paramClass)
  {
    return allowExtra(paramString, paramClass, new i2(1));
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public <T> Builder allowExtra(@NonNull String paramString, @NonNull Class<T> paramClass, @NonNull Predicate<T> paramPredicate)
  {
    Preconditions.checkNotNull(paramString);
    Preconditions.checkNotNull(paramClass);
    Preconditions.checkNotNull(paramPredicate);
    return allowExtra(paramString, new u3(paramClass, paramPredicate));
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowExtraOutput(@NonNull Predicate<Uri> paramPredicate)
  {
    allowExtra("output", Uri.class, paramPredicate);
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowExtraOutput(@NonNull String paramString)
  {
    allowExtra("output", Uri.class, new j2(paramString, 8));
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowExtraStream(@NonNull Predicate<Uri> paramPredicate)
  {
    allowExtra("android.intent.extra.STREAM", Uri.class, paramPredicate);
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowExtraStreamUriWithAuthority(@NonNull String paramString)
  {
    Preconditions.checkNotNull(paramString);
    allowExtra("android.intent.extra.STREAM", Uri.class, new j2(paramString, 3));
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowFlags(int paramInt)
  {
    mAllowedFlags = (paramInt | mAllowedFlags);
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowHistoryStackFlags()
  {
    mAllowedFlags |= 0x7DEBF000;
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowIdentifier()
  {
    mAllowIdentifier = true;
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowPackage(@NonNull Predicate<String> paramPredicate)
  {
    Preconditions.checkNotNull(paramPredicate);
    mAllowedPackages = mAllowedPackages.or(paramPredicate);
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowPackage(@NonNull String paramString)
  {
    Preconditions.checkNotNull(paramString);
    Objects.requireNonNull(paramString);
    return allowPackage(new j2(paramString, 2));
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowReceiverFlags()
  {
    mAllowedFlags |= 0x78200000;
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowSelector()
  {
    mAllowSelector = true;
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowSourceBounds()
  {
    mAllowSourceBounds = true;
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowType(@NonNull Predicate<String> paramPredicate)
  {
    Preconditions.checkNotNull(paramPredicate);
    mAllowedTypes = mAllowedTypes.or(paramPredicate);
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public Builder allowType(@NonNull String paramString)
  {
    Preconditions.checkNotNull(paramString);
    Objects.requireNonNull(paramString);
    return allowType(new j2(paramString, 1));
  }
  
  @SuppressLint({"SyntheticAccessor"})
  @NonNull
  public IntentSanitizer build()
  {
    boolean bool = mAllowAnyComponent;
    if (((bool) && (mAllowSomeComponents)) || ((!bool) && (!mAllowSomeComponents))) {
      throw new SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
    }
    IntentSanitizer localIntentSanitizer = new IntentSanitizer(null);
    IntentSanitizer.access$102(localIntentSanitizer, mAllowedFlags);
    IntentSanitizer.access$202(localIntentSanitizer, mAllowedActions);
    IntentSanitizer.access$302(localIntentSanitizer, mAllowedData);
    IntentSanitizer.access$402(localIntentSanitizer, mAllowedTypes);
    IntentSanitizer.access$502(localIntentSanitizer, mAllowedCategories);
    IntentSanitizer.access$602(localIntentSanitizer, mAllowedPackages);
    IntentSanitizer.access$702(localIntentSanitizer, mAllowAnyComponent);
    IntentSanitizer.access$802(localIntentSanitizer, mAllowedComponents);
    IntentSanitizer.access$902(localIntentSanitizer, mAllowedExtras);
    IntentSanitizer.access$1002(localIntentSanitizer, mAllowClipDataText);
    IntentSanitizer.access$1102(localIntentSanitizer, mAllowedClipDataUri);
    IntentSanitizer.access$1202(localIntentSanitizer, mAllowedClipData);
    IntentSanitizer.access$1302(localIntentSanitizer, mAllowIdentifier);
    IntentSanitizer.access$1402(localIntentSanitizer, mAllowSelector);
    IntentSanitizer.access$1502(localIntentSanitizer, mAllowSourceBounds);
    return localIntentSanitizer;
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.IntentSanitizer.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */