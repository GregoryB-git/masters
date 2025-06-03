package j8;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p8.e;

public final class i
{
  public static final h d = new h();
  public static final q5.i e = new q5.i(3);
  public final e a;
  public String b = null;
  public String c = null;
  
  public i(e parame)
  {
    a = parame;
  }
  
  public static void a(e parame, String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString2 != null)) {
      try
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("aqs.");
        localStringBuilder.append(paramString2);
        parame.b(paramString1, localStringBuilder.toString()).createNewFile();
      }
      catch (IOException parame)
      {
        Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", parame);
      }
    }
  }
}

/* Location:
 * Qualified Name:     j8.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */