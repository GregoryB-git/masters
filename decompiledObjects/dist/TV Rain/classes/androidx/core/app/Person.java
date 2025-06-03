package androidx.core.app;

import android.graphics.drawable.Icon;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import z2;

public class Person
{
  private static final String ICON_KEY = "icon";
  private static final String IS_BOT_KEY = "isBot";
  private static final String IS_IMPORTANT_KEY = "isImportant";
  private static final String KEY_KEY = "key";
  private static final String NAME_KEY = "name";
  private static final String URI_KEY = "uri";
  @Nullable
  public IconCompat mIcon;
  public boolean mIsBot;
  public boolean mIsImportant;
  @Nullable
  public String mKey;
  @Nullable
  public CharSequence mName;
  @Nullable
  public String mUri;
  
  public Person(Builder paramBuilder)
  {
    mName = mName;
    mIcon = mIcon;
    mUri = mUri;
    mKey = mKey;
    mIsBot = mIsBot;
    mIsImportant = mIsImportant;
  }
  
  @NonNull
  @RequiresApi(28)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static Person fromAndroidPerson(@NonNull android.app.Person paramPerson)
  {
    return Api28Impl.fromAndroidPerson(paramPerson);
  }
  
  @NonNull
  public static Person fromBundle(@NonNull Bundle paramBundle)
  {
    Object localObject = paramBundle.getBundle("icon");
    Builder localBuilder = new Builder().setName(paramBundle.getCharSequence("name"));
    if (localObject != null) {
      localObject = IconCompat.createFromBundle((Bundle)localObject);
    } else {
      localObject = null;
    }
    return localBuilder.setIcon((IconCompat)localObject).setUri(paramBundle.getString("uri")).setKey(paramBundle.getString("key")).setBot(paramBundle.getBoolean("isBot")).setImportant(paramBundle.getBoolean("isImportant")).build();
  }
  
  @NonNull
  @RequiresApi(22)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static Person fromPersistableBundle(@NonNull PersistableBundle paramPersistableBundle)
  {
    return Api22Impl.fromPersistableBundle(paramPersistableBundle);
  }
  
  @Nullable
  public IconCompat getIcon()
  {
    return mIcon;
  }
  
  @Nullable
  public String getKey()
  {
    return mKey;
  }
  
  @Nullable
  public CharSequence getName()
  {
    return mName;
  }
  
  @Nullable
  public String getUri()
  {
    return mUri;
  }
  
  public boolean isBot()
  {
    return mIsBot;
  }
  
  public boolean isImportant()
  {
    return mIsImportant;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public String resolveToLegacyUri()
  {
    Object localObject = mUri;
    if (localObject != null) {
      return (String)localObject;
    }
    if (mName != null)
    {
      localObject = z2.t("name:");
      ((StringBuilder)localObject).append(mName);
      return ((StringBuilder)localObject).toString();
    }
    return "";
  }
  
  @NonNull
  @RequiresApi(28)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public android.app.Person toAndroidPerson()
  {
    return Api28Impl.toAndroidPerson(this);
  }
  
  @NonNull
  public Builder toBuilder()
  {
    return new Builder(this);
  }
  
  @NonNull
  public Bundle toBundle()
  {
    Bundle localBundle = new Bundle();
    localBundle.putCharSequence("name", mName);
    Object localObject = mIcon;
    if (localObject != null) {
      localObject = ((IconCompat)localObject).toBundle();
    } else {
      localObject = null;
    }
    localBundle.putBundle("icon", (Bundle)localObject);
    localBundle.putString("uri", mUri);
    localBundle.putString("key", mKey);
    localBundle.putBoolean("isBot", mIsBot);
    localBundle.putBoolean("isImportant", mIsImportant);
    return localBundle;
  }
  
  @NonNull
  @RequiresApi(22)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public PersistableBundle toPersistableBundle()
  {
    return Api22Impl.toPersistableBundle(this);
  }
  
  @RequiresApi(22)
  public static class Api22Impl
  {
    @DoNotInline
    public static Person fromPersistableBundle(PersistableBundle paramPersistableBundle)
    {
      return new Person.Builder().setName(paramPersistableBundle.getString("name")).setUri(paramPersistableBundle.getString("uri")).setKey(paramPersistableBundle.getString("key")).setBot(paramPersistableBundle.getBoolean("isBot")).setImportant(paramPersistableBundle.getBoolean("isImportant")).build();
    }
    
    @DoNotInline
    public static PersistableBundle toPersistableBundle(Person paramPerson)
    {
      PersistableBundle localPersistableBundle = new PersistableBundle();
      Object localObject = mName;
      if (localObject != null) {
        localObject = ((CharSequence)localObject).toString();
      } else {
        localObject = null;
      }
      localPersistableBundle.putString("name", (String)localObject);
      localPersistableBundle.putString("uri", mUri);
      localPersistableBundle.putString("key", mKey);
      localPersistableBundle.putBoolean("isBot", mIsBot);
      localPersistableBundle.putBoolean("isImportant", mIsImportant);
      return localPersistableBundle;
    }
  }
  
  @RequiresApi(28)
  public static class Api28Impl
  {
    @DoNotInline
    public static Person fromAndroidPerson(android.app.Person paramPerson)
    {
      Person.Builder localBuilder = new Person.Builder().setName(paramPerson.getName());
      IconCompat localIconCompat;
      if (paramPerson.getIcon() != null) {
        localIconCompat = IconCompat.createFromIcon(paramPerson.getIcon());
      } else {
        localIconCompat = null;
      }
      return localBuilder.setIcon(localIconCompat).setUri(paramPerson.getUri()).setKey(paramPerson.getKey()).setBot(paramPerson.isBot()).setImportant(paramPerson.isImportant()).build();
    }
    
    @DoNotInline
    public static android.app.Person toAndroidPerson(Person paramPerson)
    {
      android.app.Person.Builder localBuilder = new android.app.Person.Builder().setName(paramPerson.getName());
      Icon localIcon;
      if (paramPerson.getIcon() != null) {
        localIcon = paramPerson.getIcon().toIcon();
      } else {
        localIcon = null;
      }
      return localBuilder.setIcon(localIcon).setUri(paramPerson.getUri()).setKey(paramPerson.getKey()).setBot(paramPerson.isBot()).setImportant(paramPerson.isImportant()).build();
    }
  }
  
  public static class Builder
  {
    @Nullable
    public IconCompat mIcon;
    public boolean mIsBot;
    public boolean mIsImportant;
    @Nullable
    public String mKey;
    @Nullable
    public CharSequence mName;
    @Nullable
    public String mUri;
    
    public Builder() {}
    
    public Builder(Person paramPerson)
    {
      mName = mName;
      mIcon = mIcon;
      mUri = mUri;
      mKey = mKey;
      mIsBot = mIsBot;
      mIsImportant = mIsImportant;
    }
    
    @NonNull
    public Person build()
    {
      return new Person(this);
    }
    
    @NonNull
    public Builder setBot(boolean paramBoolean)
    {
      mIsBot = paramBoolean;
      return this;
    }
    
    @NonNull
    public Builder setIcon(@Nullable IconCompat paramIconCompat)
    {
      mIcon = paramIconCompat;
      return this;
    }
    
    @NonNull
    public Builder setImportant(boolean paramBoolean)
    {
      mIsImportant = paramBoolean;
      return this;
    }
    
    @NonNull
    public Builder setKey(@Nullable String paramString)
    {
      mKey = paramString;
      return this;
    }
    
    @NonNull
    public Builder setName(@Nullable CharSequence paramCharSequence)
    {
      mName = paramCharSequence;
      return this;
    }
    
    @NonNull
    public Builder setUri(@Nullable String paramString)
    {
      mUri = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.Person
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */