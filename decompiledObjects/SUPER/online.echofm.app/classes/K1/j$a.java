package K1;

import C1.f;
import O1.P;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.F.c;

public final class j$a
{
  public static final void g(String paramString1, String paramString2)
  {
    Intrinsics.checkNotNullParameter(paramString1, "$queriedEvent");
    Intrinsics.checkNotNullParameter(paramString2, "$buttonText");
    j.s.e(paramString1, paramString2, new float[0]);
  }
  
  public final void d(View paramView1, View paramView2, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramView1, "hostView");
    Intrinsics.checkNotNullParameter(paramView2, "rootView");
    Intrinsics.checkNotNullParameter(paramString, "activityName");
    int i = paramView1.hashCode();
    if (!j.b().contains(Integer.valueOf(i)))
    {
      f localf = f.a;
      f.r(paramView1, new j(paramView1, paramView2, paramString, null));
      j.b().add(Integer.valueOf(i));
    }
  }
  
  public final void e(String paramString1, String paramString2, float[] paramArrayOfFloat)
  {
    if (e.f(paramString1)) {
      new y1.F(B.l()).e(paramString1, paramString2);
    } else if (e.e(paramString1)) {
      h(paramString1, paramString2, paramArrayOfFloat);
    }
  }
  
  public final boolean f(String paramString1, String paramString2)
  {
    paramString1 = b.d(paramString1);
    if (paramString1 == null) {
      return false;
    }
    if (!Intrinsics.a(paramString1, "other"))
    {
      P localP = P.a;
      P.B0(new i(paramString1, paramString2));
    }
    return true;
  }
  
  public final void h(String paramString1, String paramString2, float[] paramArrayOfFloat)
  {
    Bundle localBundle = new Bundle();
    try
    {
      localBundle.putString("event_name", paramString1);
      paramString1 = new org/json/JSONObject;
      paramString1.<init>();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      int i = paramArrayOfFloat.length;
      int j = 0;
      while (j < i)
      {
        float f = paramArrayOfFloat[j];
        j++;
        localStringBuilder.append(f);
        localStringBuilder.append(",");
      }
      paramString1.put("dense", localStringBuilder.toString());
      paramString1.put("button_text", paramString2);
      localBundle.putString("metadata", paramString1.toString());
      paramString1 = x1.F.n;
      paramString2 = x.a;
      paramString2 = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[] { B.m() }, 1));
      Intrinsics.checkNotNullExpressionValue(paramString2, "java.lang.String.format(locale, format, *args)");
      paramString1 = paramString1.A(null, paramString2, null, null);
      paramString1.G(localBundle);
      paramString1.k();
      return;
    }
    catch (JSONException paramString1)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     K1.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */