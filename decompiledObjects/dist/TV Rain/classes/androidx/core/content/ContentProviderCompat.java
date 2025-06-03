package androidx.core.content;

import android.content.ContentProvider;
import android.content.Context;
import androidx.annotation.NonNull;

public final class ContentProviderCompat
{
  @NonNull
  public static Context requireContext(@NonNull ContentProvider paramContentProvider)
  {
    paramContentProvider = paramContentProvider.getContext();
    if (paramContentProvider != null) {
      return paramContentProvider;
    }
    throw new IllegalStateException("Cannot find context from the provider.");
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.ContentProviderCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */