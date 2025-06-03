package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public final class ContentResolverCompat
{
  @Nullable
  public static Cursor query(@NonNull ContentResolver paramContentResolver, @NonNull Uri paramUri, @Nullable String[] paramArrayOfString1, @Nullable String paramString1, @Nullable String[] paramArrayOfString2, @Nullable String paramString2, @Nullable androidx.core.os.CancellationSignal paramCancellationSignal)
  {
    if (paramCancellationSignal != null) {
      try
      {
        paramCancellationSignal = paramCancellationSignal.getCancellationSignalObject();
      }
      catch (Exception paramContentResolver)
      {
        break label41;
      }
    } else {
      paramCancellationSignal = null;
    }
    paramContentResolver = Api16Impl.query(paramContentResolver, paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, (android.os.CancellationSignal)paramCancellationSignal);
    return paramContentResolver;
    label41:
    if ((paramContentResolver instanceof android.os.OperationCanceledException)) {
      throw new androidx.core.os.OperationCanceledException();
    }
    throw paramContentResolver;
  }
  
  @RequiresApi(16)
  public static class Api16Impl
  {
    @DoNotInline
    public static Cursor query(ContentResolver paramContentResolver, Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, android.os.CancellationSignal paramCancellationSignal)
    {
      return paramContentResolver.query(paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, paramCancellationSignal);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.ContentResolverCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */