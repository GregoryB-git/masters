package androidx.core.app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.Set;

public final class RemoteInput$Builder
{
  private boolean mAllowFreeFormTextInput = true;
  private final Set<String> mAllowedDataTypes = new HashSet();
  private CharSequence[] mChoices;
  private int mEditChoicesBeforeSending = 0;
  private final Bundle mExtras = new Bundle();
  private CharSequence mLabel;
  private final String mResultKey;
  
  public RemoteInput$Builder(@NonNull String paramString)
  {
    if (paramString != null)
    {
      mResultKey = paramString;
      return;
    }
    throw new IllegalArgumentException("Result key can't be null");
  }
  
  @NonNull
  public Builder addExtras(@NonNull Bundle paramBundle)
  {
    if (paramBundle != null) {
      mExtras.putAll(paramBundle);
    }
    return this;
  }
  
  @NonNull
  public RemoteInput build()
  {
    return new RemoteInput(mResultKey, mLabel, mChoices, mAllowFreeFormTextInput, mEditChoicesBeforeSending, mExtras, mAllowedDataTypes);
  }
  
  @NonNull
  public Bundle getExtras()
  {
    return mExtras;
  }
  
  @NonNull
  public Builder setAllowDataType(@NonNull String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      mAllowedDataTypes.add(paramString);
    } else {
      mAllowedDataTypes.remove(paramString);
    }
    return this;
  }
  
  @NonNull
  public Builder setAllowFreeFormInput(boolean paramBoolean)
  {
    mAllowFreeFormTextInput = paramBoolean;
    return this;
  }
  
  @NonNull
  public Builder setChoices(@Nullable CharSequence[] paramArrayOfCharSequence)
  {
    mChoices = paramArrayOfCharSequence;
    return this;
  }
  
  @NonNull
  public Builder setEditChoicesBeforeSending(int paramInt)
  {
    mEditChoicesBeforeSending = paramInt;
    return this;
  }
  
  @NonNull
  public Builder setLabel(@Nullable CharSequence paramCharSequence)
  {
    mLabel = paramCharSequence;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.RemoteInput.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */