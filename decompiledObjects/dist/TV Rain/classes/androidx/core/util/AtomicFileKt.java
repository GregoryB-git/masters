package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.AtomicFile;
import androidx.annotation.RequiresApi;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000.\n\000\n\002\020\022\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\007\032\r\020\000\032\0020\001*\0020\002H\b\032\026\020\003\032\0020\004*\0020\0022\b\b\002\020\005\032\0020\006H\007\0323\020\007\032\0020\b*\0020\0022!\020\t\032\035\022\023\022\0210\013¢\006\f\b\f\022\b\b\r\022\004\b\b(\016\022\004\022\0020\b0\nH\bø\001\000\032\024\020\017\032\0020\b*\0020\0022\006\020\020\032\0020\001H\007\032\036\020\021\032\0020\b*\0020\0022\006\020\022\032\0020\0042\b\b\002\020\005\032\0020\006H\007\002\007\n\005\b20\001¨\006\023"}, d2={"readBytes", "", "Landroid/util/AtomicFile;", "readText", "", "charset", "Ljava/nio/charset/Charset;", "tryWrite", "", "block", "Lkotlin/Function1;", "Ljava/io/FileOutputStream;", "Lkotlin/ParameterName;", "name", "out", "writeBytes", "array", "writeText", "text", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
@SuppressLint({"ClassVerificationFailure"})
public final class AtomicFileKt
{
  @RequiresApi(17)
  @NotNull
  public static final byte[] readBytes(@NotNull AtomicFile paramAtomicFile)
  {
    Intrinsics.checkNotNullParameter(paramAtomicFile, "<this>");
    paramAtomicFile = paramAtomicFile.readFully();
    Intrinsics.checkNotNullExpressionValue(paramAtomicFile, "readFully()");
    return paramAtomicFile;
  }
  
  @RequiresApi(17)
  @NotNull
  public static final String readText(@NotNull AtomicFile paramAtomicFile, @NotNull Charset paramCharset)
  {
    Intrinsics.checkNotNullParameter(paramAtomicFile, "<this>");
    Intrinsics.checkNotNullParameter(paramCharset, "charset");
    paramAtomicFile = paramAtomicFile.readFully();
    Intrinsics.checkNotNullExpressionValue(paramAtomicFile, "readFully()");
    return new String(paramAtomicFile, paramCharset);
  }
  
  @RequiresApi(17)
  public static final void tryWrite(@NotNull AtomicFile paramAtomicFile, @NotNull Function1<? super FileOutputStream, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramAtomicFile, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "block");
    FileOutputStream localFileOutputStream = paramAtomicFile.startWrite();
    try
    {
      Intrinsics.checkNotNullExpressionValue(localFileOutputStream, "stream");
      paramFunction1.invoke(localFileOutputStream);
      return;
    }
    finally
    {
      InlineMarker.finallyStart(1);
      paramAtomicFile.failWrite(localFileOutputStream);
      InlineMarker.finallyEnd(1);
    }
  }
  
  @RequiresApi(17)
  public static final void writeBytes(@NotNull AtomicFile paramAtomicFile, @NotNull byte[] paramArrayOfByte)
  {
    Intrinsics.checkNotNullParameter(paramAtomicFile, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfByte, "array");
    FileOutputStream localFileOutputStream = paramAtomicFile.startWrite();
    try
    {
      Intrinsics.checkNotNullExpressionValue(localFileOutputStream, "stream");
      localFileOutputStream.write(paramArrayOfByte);
      return;
    }
    finally
    {
      paramAtomicFile.failWrite(localFileOutputStream);
    }
  }
  
  @RequiresApi(17)
  public static final void writeText(@NotNull AtomicFile paramAtomicFile, @NotNull String paramString, @NotNull Charset paramCharset)
  {
    Intrinsics.checkNotNullParameter(paramAtomicFile, "<this>");
    Intrinsics.checkNotNullParameter(paramString, "text");
    Intrinsics.checkNotNullParameter(paramCharset, "charset");
    paramString = paramString.getBytes(paramCharset);
    Intrinsics.checkNotNullExpressionValue(paramString, "this as java.lang.String).getBytes(charset)");
    writeBytes(paramAtomicFile, paramString);
  }
}

/* Location:
 * Qualified Name:     androidx.core.util.AtomicFileKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */