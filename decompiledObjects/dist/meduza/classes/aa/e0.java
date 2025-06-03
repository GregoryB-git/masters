package aa;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class e0
{
  public final SharedPreferences a;
  public final String b;
  public final String c;
  public final ArrayDeque<String> d = new ArrayDeque();
  public final Executor e;
  
  public e0(SharedPreferences paramSharedPreferences, Executor paramExecutor)
  {
    a = paramSharedPreferences;
    b = "topic_operation_queue";
    c = ",";
    e = paramExecutor;
  }
  
  public static e0 a(SharedPreferences arg0, Executor paramExecutor)
  {
    paramExecutor = new e0(???, paramExecutor);
    synchronized (d)
    {
      d.clear();
      String str = a.getString(b, "");
      if ((!TextUtils.isEmpty(str)) && (str.contains(c)))
      {
        String[] arrayOfString = str.split(c, -1);
        if (arrayOfString.length == 0) {
          Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
        }
        int i = arrayOfString.length;
        for (int j = 0; j < i; j++)
        {
          str = arrayOfString[j];
          if (!TextUtils.isEmpty(str)) {
            d.add(str);
          }
        }
      }
      return paramExecutor;
    }
  }
}

/* Location:
 * Qualified Name:     aa.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */