package androidx.core.database;

import android.database.Cursor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\0008\n\000\n\002\020\022\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\006\n\002\b\002\n\002\020\007\n\002\b\004\n\002\020\t\n\002\b\002\n\002\020\n\n\002\b\002\n\002\020\016\n\000\032\027\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\b\032\034\020\005\032\004\030\0010\006*\0020\0022\006\020\003\032\0020\004H\b¢\006\002\020\007\032\034\020\b\032\004\030\0010\t*\0020\0022\006\020\003\032\0020\004H\b¢\006\002\020\n\032\034\020\013\032\004\030\0010\004*\0020\0022\006\020\003\032\0020\004H\b¢\006\002\020\f\032\034\020\r\032\004\030\0010\016*\0020\0022\006\020\003\032\0020\004H\b¢\006\002\020\017\032\034\020\020\032\004\030\0010\021*\0020\0022\006\020\003\032\0020\004H\b¢\006\002\020\022\032\027\020\023\032\004\030\0010\024*\0020\0022\006\020\003\032\0020\004H\b¨\006\025"}, d2={"getBlobOrNull", "", "Landroid/database/Cursor;", "index", "", "getDoubleOrNull", "", "(Landroid/database/Cursor;I)Ljava/lang/Double;", "getFloatOrNull", "", "(Landroid/database/Cursor;I)Ljava/lang/Float;", "getIntOrNull", "(Landroid/database/Cursor;I)Ljava/lang/Integer;", "getLongOrNull", "", "(Landroid/database/Cursor;I)Ljava/lang/Long;", "getShortOrNull", "", "(Landroid/database/Cursor;I)Ljava/lang/Short;", "getStringOrNull", "", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class CursorKt
{
  @Nullable
  public static final byte[] getBlobOrNull(@NotNull Cursor paramCursor, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramCursor, "<this>");
    if (paramCursor.isNull(paramInt)) {
      paramCursor = null;
    } else {
      paramCursor = paramCursor.getBlob(paramInt);
    }
    return paramCursor;
  }
  
  @Nullable
  public static final Double getDoubleOrNull(@NotNull Cursor paramCursor, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramCursor, "<this>");
    if (paramCursor.isNull(paramInt)) {
      paramCursor = null;
    } else {
      paramCursor = Double.valueOf(paramCursor.getDouble(paramInt));
    }
    return paramCursor;
  }
  
  @Nullable
  public static final Float getFloatOrNull(@NotNull Cursor paramCursor, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramCursor, "<this>");
    if (paramCursor.isNull(paramInt)) {
      paramCursor = null;
    } else {
      paramCursor = Float.valueOf(paramCursor.getFloat(paramInt));
    }
    return paramCursor;
  }
  
  @Nullable
  public static final Integer getIntOrNull(@NotNull Cursor paramCursor, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramCursor, "<this>");
    if (paramCursor.isNull(paramInt)) {
      paramCursor = null;
    } else {
      paramCursor = Integer.valueOf(paramCursor.getInt(paramInt));
    }
    return paramCursor;
  }
  
  @Nullable
  public static final Long getLongOrNull(@NotNull Cursor paramCursor, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramCursor, "<this>");
    if (paramCursor.isNull(paramInt)) {
      paramCursor = null;
    } else {
      paramCursor = Long.valueOf(paramCursor.getLong(paramInt));
    }
    return paramCursor;
  }
  
  @Nullable
  public static final Short getShortOrNull(@NotNull Cursor paramCursor, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramCursor, "<this>");
    if (paramCursor.isNull(paramInt)) {
      paramCursor = null;
    } else {
      paramCursor = Short.valueOf(paramCursor.getShort(paramInt));
    }
    return paramCursor;
  }
  
  @Nullable
  public static final String getStringOrNull(@NotNull Cursor paramCursor, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramCursor, "<this>");
    if (paramCursor.isNull(paramInt)) {
      paramCursor = null;
    } else {
      paramCursor = paramCursor.getString(paramInt);
    }
    return paramCursor;
  }
}

/* Location:
 * Qualified Name:     androidx.core.database.CursorKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */