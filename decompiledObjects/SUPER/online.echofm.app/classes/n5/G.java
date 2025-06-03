package n5;

import android.database.Cursor;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o5.a;

public abstract class G
{
  public static List a(Cursor paramCursor, int paramInt)
  {
    ArrayList localArrayList = new ArrayList(paramInt);
    for (int i = 0; i < paramInt; i++)
    {
      Object localObject1 = b(paramCursor, i);
      if (a.c)
      {
        Object localObject2;
        if (localObject1 != null)
        {
          if (localObject1.getClass().isArray())
          {
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("array(");
            ((StringBuilder)localObject2).append(localObject1.getClass().getComponentType().getName());
            ((StringBuilder)localObject2).append(")");
            localObject2 = ((StringBuilder)localObject2).toString();
          }
          else
          {
            localObject2 = localObject1.getClass().getName();
          }
        }
        else {
          localObject2 = null;
        }
        StringBuilder localStringBuilder1 = new StringBuilder();
        localStringBuilder1.append("column ");
        localStringBuilder1.append(i);
        localStringBuilder1.append(" ");
        localStringBuilder1.append(paramCursor.getType(i));
        localStringBuilder1.append(": ");
        localStringBuilder1.append(localObject1);
        if (localObject2 == null)
        {
          localObject2 = "";
        }
        else
        {
          StringBuilder localStringBuilder2 = new StringBuilder();
          localStringBuilder2.append(" (");
          localStringBuilder2.append((String)localObject2);
          localStringBuilder2.append(")");
          localObject2 = localStringBuilder2.toString();
        }
        localStringBuilder1.append((String)localObject2);
        Log.d("Sqflite", localStringBuilder1.toString());
      }
      localArrayList.add(localObject1);
    }
    return localArrayList;
  }
  
  public static Object b(Cursor paramCursor, int paramInt)
  {
    int i = paramCursor.getType(paramInt);
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4) {
            return null;
          }
          return paramCursor.getBlob(paramInt);
        }
        return paramCursor.getString(paramInt);
      }
      return Double.valueOf(paramCursor.getDouble(paramInt));
    }
    return Long.valueOf(paramCursor.getLong(paramInt));
  }
  
  public static Locale c(String paramString)
  {
    return Locale.forLanguageTag(paramString);
  }
  
  public static Locale d(String paramString)
  {
    return c(paramString);
  }
}

/* Location:
 * Qualified Name:     n5.G
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */