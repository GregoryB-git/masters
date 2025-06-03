package androidx.core.app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.IconCompat;

public class Person$Builder
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
  
  public Person$Builder() {}
  
  public Person$Builder(Person paramPerson)
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

/* Location:
 * Qualified Name:     androidx.core.app.Person.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */