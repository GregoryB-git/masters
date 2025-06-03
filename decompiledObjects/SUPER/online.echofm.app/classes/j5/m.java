package j5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import java.util.Map;

public class m
{
  public static final d e = d.q;
  public static final l f = l.q;
  public final d a;
  public final l b;
  public final d c;
  public final l d;
  
  public m(SharedPreferences paramSharedPreferences, Map paramMap)
  {
    d locald1 = e;
    a = d.valueOf(paramSharedPreferences.getString("FlutterSecureSAlgorithmKey", locald1.name()));
    l locall = f;
    b = l.valueOf(paramSharedPreferences.getString("FlutterSecureSAlgorithmStorage", locall.name()));
    d locald2 = d.valueOf(b(paramMap, "keyCipherAlgorithm", locald1.name()));
    int i = p;
    int j = Build.VERSION.SDK_INT;
    paramSharedPreferences = locald1;
    if (i <= j) {
      paramSharedPreferences = locald2;
    }
    c = paramSharedPreferences;
    paramMap = l.valueOf(b(paramMap, "storageCipherAlgorithm", locall.name()));
    paramSharedPreferences = locall;
    if (p <= j) {
      paramSharedPreferences = paramMap;
    }
    d = paramSharedPreferences;
  }
  
  public i a(Context paramContext)
  {
    a locala = c.o.a(paramContext);
    return d.o.a(paramContext, locala);
  }
  
  public final String b(Map paramMap, String paramString1, String paramString2)
  {
    paramMap = paramMap.get(paramString1);
    if (paramMap != null) {
      paramString2 = paramMap.toString();
    }
    return paramString2;
  }
  
  public i c(Context paramContext)
  {
    a locala = a.o.a(paramContext);
    return b.o.a(paramContext, locala);
  }
  
  public void d(SharedPreferences.Editor paramEditor)
  {
    paramEditor.remove("FlutterSecureSAlgorithmKey");
    paramEditor.remove("FlutterSecureSAlgorithmStorage");
  }
  
  public boolean e()
  {
    boolean bool;
    if ((a == c) && (b == d)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void f(SharedPreferences.Editor paramEditor)
  {
    paramEditor.putString("FlutterSecureSAlgorithmKey", c.name());
    paramEditor.putString("FlutterSecureSAlgorithmStorage", d.name());
  }
}

/* Location:
 * Qualified Name:     j5.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */