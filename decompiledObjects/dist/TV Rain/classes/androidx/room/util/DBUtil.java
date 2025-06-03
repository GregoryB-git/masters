package androidx.room.util;

import android.database.AbstractCursor;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.ArrayList;
import java.util.Iterator;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class DBUtil
{
  @Nullable
  public static CancellationSignal createCancellationSignal()
  {
    return new CancellationSignal();
  }
  
  public static void dropFtsSyncTriggers(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    Object localObject1 = new ArrayList();
    Object localObject2 = paramSupportSQLiteDatabase.query("SELECT name FROM sqlite_master WHERE type = 'trigger'");
    try
    {
      while (((Cursor)localObject2).moveToNext()) {
        ((ArrayList)localObject1).add(((Cursor)localObject2).getString(0));
      }
      ((Cursor)localObject2).close();
      localObject1 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        String str = (String)((Iterator)localObject1).next();
        if (str.startsWith("room_fts_content_sync_"))
        {
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("DROP TRIGGER IF EXISTS ");
          ((StringBuilder)localObject2).append(str);
          paramSupportSQLiteDatabase.execSQL(((StringBuilder)localObject2).toString());
        }
      }
      return;
    }
    finally
    {
      ((Cursor)localObject2).close();
    }
  }
  
  @Deprecated
  @NonNull
  public static Cursor query(RoomDatabase paramRoomDatabase, SupportSQLiteQuery paramSupportSQLiteQuery, boolean paramBoolean)
  {
    return query(paramRoomDatabase, paramSupportSQLiteQuery, paramBoolean, null);
  }
  
  @NonNull
  public static Cursor query(@NonNull RoomDatabase paramRoomDatabase, @NonNull SupportSQLiteQuery paramSupportSQLiteQuery, boolean paramBoolean, @Nullable CancellationSignal paramCancellationSignal)
  {
    paramSupportSQLiteQuery = paramRoomDatabase.query(paramSupportSQLiteQuery, paramCancellationSignal);
    paramRoomDatabase = paramSupportSQLiteQuery;
    if (paramBoolean)
    {
      paramRoomDatabase = paramSupportSQLiteQuery;
      if ((paramSupportSQLiteQuery instanceof AbstractWindowedCursor))
      {
        paramCancellationSignal = (AbstractWindowedCursor)paramSupportSQLiteQuery;
        int i = paramCancellationSignal.getCount();
        int j;
        if (paramCancellationSignal.hasWindow()) {
          j = paramCancellationSignal.getWindow().getNumRows();
        } else {
          j = i;
        }
        paramRoomDatabase = paramSupportSQLiteQuery;
        if (j < i) {
          paramRoomDatabase = CursorUtil.copyAndClose(paramCancellationSignal);
        }
      }
    }
    return paramRoomDatabase;
  }
  
  public static int readVersion(@NonNull File paramFile)
    throws IOException
  {
    IOException localIOException = null;
    Object localObject = localIOException;
    try
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
      localObject = localIOException;
      FileInputStream localFileInputStream = new java/io/FileInputStream;
      localObject = localIOException;
      localFileInputStream.<init>(paramFile);
      localObject = localIOException;
      paramFile = localFileInputStream.getChannel();
      localObject = paramFile;
      paramFile.tryLock(60L, 4L, true);
      localObject = paramFile;
      paramFile.position(60L);
      localObject = paramFile;
      if (paramFile.read(localByteBuffer) == 4)
      {
        localObject = paramFile;
        localByteBuffer.rewind();
        localObject = paramFile;
        int i = localByteBuffer.getInt();
        paramFile.close();
        return i;
      }
      localObject = paramFile;
      localIOException = new java/io/IOException;
      localObject = paramFile;
      localIOException.<init>("Bad database header, unable to read 4 bytes at offset 60");
      localObject = paramFile;
      throw localIOException;
    }
    finally
    {
      if (localObject != null) {
        ((AbstractInterruptibleChannel)localObject).close();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.room.util.DBUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */