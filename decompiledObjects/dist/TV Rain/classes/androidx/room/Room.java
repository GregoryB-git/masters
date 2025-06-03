package androidx.room;

import android.content.Context;
import androidx.annotation.NonNull;
import z2;

public class Room
{
  private static final String CURSOR_CONV_SUFFIX = "_CursorConverter";
  public static final String LOG_TAG = "ROOM";
  public static final String MASTER_TABLE_NAME = "room_master_table";
  
  @NonNull
  public static <T extends RoomDatabase> RoomDatabase.Builder<T> databaseBuilder(@NonNull Context paramContext, @NonNull Class<T> paramClass, @NonNull String paramString)
  {
    if ((paramString != null) && (paramString.trim().length() != 0)) {
      return new RoomDatabase.Builder(paramContext, paramClass, paramString);
    }
    throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
  }
  
  @NonNull
  public static <T, C> T getGeneratedImplementation(Class<C> paramClass, String paramString)
  {
    String str1 = paramClass.getPackage().getName();
    String str2 = paramClass.getCanonicalName();
    if (!str1.isEmpty()) {
      str2 = str2.substring(str1.length() + 1);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str2.replace('.', '_'));
    localStringBuilder.append(paramString);
    str2 = localStringBuilder.toString();
    try
    {
      if (str1.isEmpty())
      {
        paramString = str2;
      }
      else
      {
        paramString = new java/lang/StringBuilder;
        paramString.<init>();
        paramString.append(str1);
        paramString.append(".");
        paramString.append(str2);
        paramString = paramString.toString();
      }
      paramString = Class.forName(paramString).newInstance();
      return paramString;
    }
    catch (InstantiationException paramString)
    {
      paramString = z2.t("Failed to create an instance of ");
      paramString.append(paramClass.getCanonicalName());
      throw new RuntimeException(paramString.toString());
    }
    catch (IllegalAccessException paramString)
    {
      paramString = z2.t("Cannot access the constructor");
      paramString.append(paramClass.getCanonicalName());
      throw new RuntimeException(paramString.toString());
    }
    catch (ClassNotFoundException paramString)
    {
      paramString = z2.t("cannot find implementation for ");
      paramString.append(paramClass.getCanonicalName());
      paramString.append(". ");
      paramString.append(str2);
      paramString.append(" does not exist");
      throw new RuntimeException(paramString.toString());
    }
  }
  
  @NonNull
  public static <T extends RoomDatabase> RoomDatabase.Builder<T> inMemoryDatabaseBuilder(@NonNull Context paramContext, @NonNull Class<T> paramClass)
  {
    return new RoomDatabase.Builder(paramContext, paramClass, null);
  }
}

/* Location:
 * Qualified Name:     androidx.room.Room
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */