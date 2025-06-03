package androidx.core.net;

import android.net.Uri;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\022\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\032\n\020\000\032\0020\001*\0020\002\032\r\020\003\032\0020\002*\0020\001H\b\032\r\020\003\032\0020\002*\0020\004H\b¨\006\005"}, d2={"toFile", "Ljava/io/File;", "Landroid/net/Uri;", "toUri", "", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class UriKt
{
  @NotNull
  public static final File toFile(@NotNull Uri paramUri)
  {
    Intrinsics.checkNotNullParameter(paramUri, "<this>");
    if (Intrinsics.areEqual(paramUri.getScheme(), "file"))
    {
      localObject = paramUri.getPath();
      if (localObject != null) {
        return new File((String)localObject);
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Uri path is null: ");
      ((StringBuilder)localObject).append(paramUri);
      throw new IllegalArgumentException(((StringBuilder)localObject).toString().toString());
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Uri lacks 'file' scheme: ");
    ((StringBuilder)localObject).append(paramUri);
    throw new IllegalArgumentException(((StringBuilder)localObject).toString().toString());
  }
  
  @NotNull
  public static final Uri toUri(@NotNull File paramFile)
  {
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    paramFile = Uri.fromFile(paramFile);
    Intrinsics.checkNotNullExpressionValue(paramFile, "fromFile(this)");
    return paramFile;
  }
  
  @NotNull
  public static final Uri toUri(@NotNull String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    paramString = Uri.parse(paramString);
    Intrinsics.checkNotNullExpressionValue(paramString, "parse(this)");
    return paramString;
  }
}

/* Location:
 * Qualified Name:     androidx.core.net.UriKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */