package androidx.core.content;

import a;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Parcelable;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import androidx.core.util.Predicate;
import e;
import g;
import h2;
import i2;
import j2;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k2;
import u3;
import z2;

public class IntentSanitizer
{
  private static final String TAG = "IntentSanitizer";
  private boolean mAllowAnyComponent;
  private boolean mAllowClipDataText;
  private boolean mAllowIdentifier;
  private boolean mAllowSelector;
  private boolean mAllowSourceBounds;
  private Predicate<String> mAllowedActions;
  private Predicate<String> mAllowedCategories;
  private Predicate<ClipData> mAllowedClipData;
  private Predicate<Uri> mAllowedClipDataUri;
  private Predicate<ComponentName> mAllowedComponents;
  private Predicate<Uri> mAllowedData;
  private Map<String, Predicate<Object>> mAllowedExtras;
  private int mAllowedFlags;
  private Predicate<String> mAllowedPackages;
  private Predicate<String> mAllowedTypes;
  
  private void putExtra(Intent paramIntent, String paramString, Object paramObject)
  {
    if (paramObject == null)
    {
      paramIntent.getExtras().putString(paramString, null);
    }
    else if ((paramObject instanceof Parcelable))
    {
      paramIntent.putExtra(paramString, (Parcelable)paramObject);
    }
    else if ((paramObject instanceof Parcelable[]))
    {
      paramIntent.putExtra(paramString, (Parcelable[])paramObject);
    }
    else
    {
      if (!(paramObject instanceof Serializable)) {
        break label74;
      }
      paramIntent.putExtra(paramString, (Serializable)paramObject);
    }
    return;
    label74:
    paramIntent = z2.t("Unsupported type ");
    paramIntent.append(paramObject.getClass());
    throw new IllegalArgumentException(paramIntent.toString());
  }
  
  @NonNull
  public Intent sanitize(@NonNull Intent paramIntent, @NonNull Consumer<String> paramConsumer)
  {
    Intent localIntent = new Intent();
    Object localObject1 = paramIntent.getComponent();
    if (((mAllowAnyComponent) && (localObject1 == null)) || (mAllowedComponents.test(localObject1)))
    {
      localIntent.setComponent((ComponentName)localObject1);
    }
    else
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Component is not allowed: ");
      ((StringBuilder)localObject2).append(localObject1);
      paramConsumer.accept(((StringBuilder)localObject2).toString());
      localIntent.setComponent(new ComponentName("android", "java.lang.Void"));
    }
    Object localObject2 = paramIntent.getPackage();
    if ((localObject2 != null) && (!mAllowedPackages.test(localObject2)))
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Package is not allowed: ");
      ((StringBuilder)localObject1).append((String)localObject2);
      paramConsumer.accept(((StringBuilder)localObject1).toString());
    }
    else
    {
      localIntent.setPackage((String)localObject2);
    }
    int i = mAllowedFlags;
    int j = paramIntent.getFlags();
    int k = mAllowedFlags;
    if ((i | j) == k)
    {
      localIntent.setFlags(paramIntent.getFlags());
    }
    else
    {
      localIntent.setFlags(paramIntent.getFlags() & k);
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("The intent contains flags that are not allowed: 0x");
      ((StringBuilder)localObject2).append(Integer.toHexString(paramIntent.getFlags() & mAllowedFlags));
      paramConsumer.accept(((StringBuilder)localObject2).toString());
    }
    localObject2 = paramIntent.getAction();
    if ((localObject2 != null) && (!mAllowedActions.test(localObject2)))
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Action is not allowed: ");
      ((StringBuilder)localObject1).append((String)localObject2);
      paramConsumer.accept(((StringBuilder)localObject1).toString());
    }
    else
    {
      localIntent.setAction((String)localObject2);
    }
    localObject1 = paramIntent.getData();
    if ((localObject1 != null) && (!mAllowedData.test(localObject1)))
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Data is not allowed: ");
      ((StringBuilder)localObject2).append(localObject1);
      paramConsumer.accept(((StringBuilder)localObject2).toString());
    }
    else
    {
      localIntent.setData((Uri)localObject1);
    }
    localObject1 = paramIntent.getType();
    if ((localObject1 != null) && (!mAllowedTypes.test(localObject1)))
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Type is not allowed: ");
      ((StringBuilder)localObject2).append((String)localObject1);
      paramConsumer.accept(((StringBuilder)localObject2).toString());
    }
    else
    {
      localIntent.setDataAndType(localIntent.getData(), (String)localObject1);
    }
    localObject2 = paramIntent.getCategories();
    Object localObject3;
    if (localObject2 != null)
    {
      localObject1 = ((Set)localObject2).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        if (mAllowedCategories.test(localObject2))
        {
          localIntent.addCategory((String)localObject2);
        }
        else
        {
          localObject3 = new StringBuilder();
          ((StringBuilder)localObject3).append("Category is not allowed: ");
          ((StringBuilder)localObject3).append((String)localObject2);
          paramConsumer.accept(((StringBuilder)localObject3).toString());
        }
      }
    }
    localObject1 = paramIntent.getExtras();
    if (localObject1 != null)
    {
      localObject3 = ((BaseBundle)localObject1).keySet().iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject2 = (String)((Iterator)localObject3).next();
        if ((((String)localObject2).equals("android.intent.extra.STREAM")) && ((mAllowedFlags & 0x1) == 0))
        {
          paramConsumer.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
        }
        else if ((((String)localObject2).equals("output")) && ((mAllowedFlags & 0x3) != 0))
        {
          paramConsumer.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
        }
        else
        {
          Object localObject4 = ((BaseBundle)localObject1).get((String)localObject2);
          Object localObject5 = (Predicate)mAllowedExtras.get(localObject2);
          if ((localObject5 != null) && (((Predicate)localObject5).test(localObject4)))
          {
            putExtra(localIntent, (String)localObject2, localObject4);
          }
          else
          {
            localObject5 = new StringBuilder();
            ((StringBuilder)localObject5).append("Extra is not allowed. Key: ");
            ((StringBuilder)localObject5).append((String)localObject2);
            ((StringBuilder)localObject5).append(". Value: ");
            ((StringBuilder)localObject5).append(localObject4);
            paramConsumer.accept(((StringBuilder)localObject5).toString());
          }
        }
      }
    }
    i = Build.VERSION.SDK_INT;
    Api16Impl.sanitizeClipData(paramIntent, localIntent, mAllowedClipData, mAllowClipDataText, mAllowedClipDataUri, paramConsumer);
    if (i >= 29) {
      if (mAllowIdentifier)
      {
        Api29Impl.setIdentifier(localIntent, Api29Impl.getIdentifier(paramIntent));
      }
      else if (Api29Impl.getIdentifier(paramIntent) != null)
      {
        localObject2 = z2.t("Identifier is not allowed: ");
        ((StringBuilder)localObject2).append(Api29Impl.getIdentifier(paramIntent));
        paramConsumer.accept(((StringBuilder)localObject2).toString());
      }
    }
    if (mAllowSelector)
    {
      Api15Impl.setSelector(localIntent, Api15Impl.getSelector(paramIntent));
    }
    else if (Api15Impl.getSelector(paramIntent) != null)
    {
      localObject2 = z2.t("Selector is not allowed: ");
      ((StringBuilder)localObject2).append(Api15Impl.getSelector(paramIntent));
      paramConsumer.accept(((StringBuilder)localObject2).toString());
    }
    if (mAllowSourceBounds)
    {
      localIntent.setSourceBounds(paramIntent.getSourceBounds());
    }
    else if (paramIntent.getSourceBounds() != null)
    {
      localObject2 = z2.t("SourceBounds is not allowed: ");
      ((StringBuilder)localObject2).append(paramIntent.getSourceBounds());
      paramConsumer.accept(((StringBuilder)localObject2).toString());
    }
    return localIntent;
  }
  
  @NonNull
  public Intent sanitizeByFiltering(@NonNull Intent paramIntent)
  {
    return sanitize(paramIntent, new h2(0));
  }
  
  @NonNull
  public Intent sanitizeByThrowing(@NonNull Intent paramIntent)
  {
    return sanitize(paramIntent, new h2(1));
  }
  
  @RequiresApi(15)
  public static class Api15Impl
  {
    @DoNotInline
    public static Intent getSelector(Intent paramIntent)
    {
      return paramIntent.getSelector();
    }
    
    @DoNotInline
    public static void setSelector(Intent paramIntent1, Intent paramIntent2)
    {
      paramIntent1.setSelector(paramIntent2);
    }
  }
  
  @RequiresApi(16)
  public static class Api16Impl
  {
    private static void checkOtherMembers(int paramInt, ClipData.Item paramItem, Consumer<String> paramConsumer)
    {
      if ((paramItem.getHtmlText() != null) || (paramItem.getIntent() != null))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("ClipData item at position ");
        localStringBuilder.append(paramInt);
        localStringBuilder.append(" contains htmlText, textLinks or intent: ");
        localStringBuilder.append(paramItem);
        paramConsumer.accept(localStringBuilder.toString());
      }
    }
    
    @DoNotInline
    public static void sanitizeClipData(@NonNull Intent paramIntent1, Intent paramIntent2, Predicate<ClipData> paramPredicate, boolean paramBoolean, Predicate<Uri> paramPredicate1, Consumer<String> paramConsumer)
    {
      ClipData localClipData = paramIntent1.getClipData();
      if (localClipData == null) {
        return;
      }
      if ((paramPredicate != null) && (paramPredicate.test(localClipData)))
      {
        paramIntent2.setClipData(localClipData);
      }
      else
      {
        int i = 0;
        Object localObject2;
        for (paramIntent1 = null; i < localClipData.getItemCount(); paramIntent1 = (Intent)localObject2)
        {
          Object localObject1 = localClipData.getItemAt(i);
          if (Build.VERSION.SDK_INT >= 31) {
            Api31Impl.checkOtherMembers(i, (ClipData.Item)localObject1, paramConsumer);
          } else {
            checkOtherMembers(i, (ClipData.Item)localObject1, paramConsumer);
          }
          if (paramBoolean)
          {
            paramPredicate = ((ClipData.Item)localObject1).getText();
          }
          else
          {
            if (((ClipData.Item)localObject1).getText() != null)
            {
              paramPredicate = a.r("Item text cannot contain value. Item position: ", i, ". Text: ");
              paramPredicate.append(((ClipData.Item)localObject1).getText());
              paramConsumer.accept(paramPredicate.toString());
            }
            paramPredicate = null;
          }
          if (paramPredicate1 == null)
          {
            if (((ClipData.Item)localObject1).getUri() != null)
            {
              localObject2 = a.r("Item URI is not allowed. Item position: ", i, ". URI: ");
              ((StringBuilder)localObject2).append(((ClipData.Item)localObject1).getUri());
              paramConsumer.accept(((StringBuilder)localObject2).toString());
            }
          }
          else
          {
            if ((((ClipData.Item)localObject1).getUri() == null) || (paramPredicate1.test(((ClipData.Item)localObject1).getUri()))) {
              break label259;
            }
            localObject2 = a.r("Item URI is not allowed. Item position: ", i, ". URI: ");
            ((StringBuilder)localObject2).append(((ClipData.Item)localObject1).getUri());
            paramConsumer.accept(((StringBuilder)localObject2).toString());
          }
          localObject1 = null;
          break label266;
          label259:
          localObject1 = ((ClipData.Item)localObject1).getUri();
          label266:
          if (paramPredicate == null)
          {
            localObject2 = paramIntent1;
            if (localObject1 == null) {}
          }
          else if (paramIntent1 == null)
          {
            localObject2 = new ClipData(localClipData.getDescription(), new ClipData.Item(paramPredicate, null, (Uri)localObject1));
          }
          else
          {
            paramIntent1.addItem(new ClipData.Item(paramPredicate, null, (Uri)localObject1));
            localObject2 = paramIntent1;
          }
          i++;
        }
        if (paramIntent1 != null) {
          paramIntent2.setClipData(paramIntent1);
        }
      }
    }
    
    @RequiresApi(31)
    public static class Api31Impl
    {
      @DoNotInline
      public static void checkOtherMembers(int paramInt, ClipData.Item paramItem, Consumer<String> paramConsumer)
      {
        if ((paramItem.getHtmlText() != null) || (paramItem.getIntent() != null) || (g.f(paramItem) != null))
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("ClipData item at position ");
          localStringBuilder.append(paramInt);
          localStringBuilder.append(" contains htmlText, textLinks or intent: ");
          localStringBuilder.append(paramItem);
          paramConsumer.accept(localStringBuilder.toString());
        }
      }
    }
  }
  
  @RequiresApi(29)
  public static class Api29Impl
  {
    @DoNotInline
    public static String getIdentifier(Intent paramIntent)
    {
      return e.j(paramIntent);
    }
    
    @DoNotInline
    public static Intent setIdentifier(Intent paramIntent, String paramString)
    {
      return e.c(paramIntent, paramString);
    }
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     androidx.core.content.IntentSanitizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */