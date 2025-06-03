package f0;

import android.os.BaseBundle;
import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import g0.M;
import g0.a;
import java.util.ArrayList;

public abstract class c
{
  public static final String a = M.w0(0);
  public static final String b = M.w0(1);
  public static final String c = M.w0(2);
  public static final String d = M.w0(3);
  public static final String e = M.w0(4);
  
  public static ArrayList a(Spanned paramSpanned)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramSpanned.length();
    int j = 0;
    Object localObject2;
    for (localObject2 : (e[])paramSpanned.getSpans(0, i, e.class)) {
      localArrayList.add(b(paramSpanned, localObject2, 1, ((e)localObject2).b()));
    }
    for (??? : (g[])paramSpanned.getSpans(0, paramSpanned.length(), g.class)) {
      localArrayList.add(b(paramSpanned, ???, 2, ((g)???).b()));
    }
    ??? = (d[])paramSpanned.getSpans(0, paramSpanned.length(), d.class);
    ??? = ???.length;
    for (i = j; i < ???; i++) {
      localArrayList.add(b(paramSpanned, ???[i], 3, null));
    }
    return localArrayList;
  }
  
  public static Bundle b(Spanned paramSpanned, Object paramObject, int paramInt, Bundle paramBundle)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt(a, paramSpanned.getSpanStart(paramObject));
    localBundle.putInt(b, paramSpanned.getSpanEnd(paramObject));
    localBundle.putInt(c, paramSpanned.getSpanFlags(paramObject));
    localBundle.putInt(d, paramInt);
    if (paramBundle != null) {
      localBundle.putBundle(e, paramBundle);
    }
    return localBundle;
  }
  
  public static void c(Bundle paramBundle, Spannable paramSpannable)
  {
    int i = paramBundle.getInt(a);
    int j = paramBundle.getInt(b);
    int k = paramBundle.getInt(c);
    int m = paramBundle.getInt(d, -1);
    paramBundle = paramBundle.getBundle(e);
    if (m != 1) {
      if (m != 2)
      {
        if (m != 3) {
          return;
        }
        paramBundle = new d();
      }
    }
    for (;;)
    {
      paramSpannable.setSpan(paramBundle, i, j, k);
      break;
      paramBundle = g.a((Bundle)a.e(paramBundle));
      continue;
      paramBundle = e.a((Bundle)a.e(paramBundle));
    }
  }
}

/* Location:
 * Qualified Name:     f0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */