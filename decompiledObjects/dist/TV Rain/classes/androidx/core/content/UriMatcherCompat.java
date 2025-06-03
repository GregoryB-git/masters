package androidx.core.content;

import android.content.UriMatcher;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.util.Predicate;
import k2;

public class UriMatcherCompat
{
  @NonNull
  public static Predicate<Uri> asPredicate(@NonNull UriMatcher paramUriMatcher)
  {
    return new k2(paramUriMatcher, 1);
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.UriMatcherCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */