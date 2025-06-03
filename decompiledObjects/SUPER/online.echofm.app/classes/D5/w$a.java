package D5;

import E5.j;
import E5.k.c;
import E5.k.d;
import android.os.BaseBundle;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t5.b;

public class w$a
  implements k.c
{
  public w$a(w paramw) {}
  
  public void onMethodCall(j paramj, k.d paramd)
  {
    if (w.a(a) == null) {
      return;
    }
    Object localObject1 = a;
    Object localObject2 = b;
    paramj = new StringBuilder();
    paramj.append("Received '");
    paramj.append((String)localObject1);
    paramj.append("' message.");
    b.f("TextInputChannel", paramj.toString());
    ((String)localObject1).hashCode();
    int i = ((String)localObject1).hashCode();
    int j = 0;
    int k = -1;
    switch (i)
    {
    default: 
      break;
    case 2113369584: 
      if (((String)localObject1).equals("TextInput.requestAutofill")) {
        k = 9;
      }
      break;
    case 1904427655: 
      if (((String)localObject1).equals("TextInput.clearClient")) {
        k = 8;
      }
      break;
    case 1727570905: 
      if (((String)localObject1).equals("TextInput.finishAutofillContext")) {
        k = 7;
      }
      break;
    case 1204752139: 
      if (((String)localObject1).equals("TextInput.setEditableSizeAndTransform")) {
        k = 6;
      }
      break;
    case 649192816: 
      if (((String)localObject1).equals("TextInput.sendAppPrivateCommand")) {
        k = 5;
      }
      break;
    case 270803918: 
      if (((String)localObject1).equals("TextInput.show")) {
        k = 4;
      }
      break;
    case 270476819: 
      if (((String)localObject1).equals("TextInput.hide")) {
        k = 3;
      }
      break;
    case -37561188: 
      if (((String)localObject1).equals("TextInput.setClient")) {
        k = 2;
      }
      break;
    case -1015421462: 
      if (((String)localObject1).equals("TextInput.setEditingState")) {
        k = 1;
      }
      break;
    case -1779068172: 
      if (((String)localObject1).equals("TextInput.setPlatformViewClient")) {
        k = 0;
      }
      break;
    }
    switch (k)
    {
    default: 
      paramd.c();
      break;
    case 9: 
      w.a(a).f();
    case 8: 
    case 7: 
      for (;;)
      {
        paramd.a(null);
        break;
        w.a(a).b();
        continue;
        w.a(a).i(((Boolean)localObject2).booleanValue());
      }
    case 6: 
    case 5: 
    case 4: 
    case 3: 
    case 2: 
      for (;;)
      {
        try
        {
          paramj = (JSONObject)localObject2;
          double d1 = paramj.getDouble("width");
          double d2 = paramj.getDouble("height");
          localObject1 = paramj.getJSONArray("transform");
          paramj = new double[16];
          k = j;
          if (k < 16)
          {
            paramj[k] = ((JSONArray)localObject1).getDouble(k);
            k++;
            continue;
          }
          paramj = (JSONObject)localObject2;
        }
        catch (JSONException paramj)
        {
          continue;
          w.a(a).e(d1, d2, paramj);
          paramd.a(null);
          return;
          paramd.b("error", paramj.getMessage(), null);
        }
        localObject1 = paramj.getString("action");
        localObject2 = paramj.getString("data");
        if ((localObject2 != null) && (!((String)localObject2).isEmpty()))
        {
          paramj = new android/os/Bundle;
          paramj.<init>();
          paramj.putString("data", (String)localObject2);
        }
        else
        {
          paramj = null;
        }
        w.a(a).c((String)localObject1, paramj);
        paramd.a(null);
        return;
        w.a(a).a();
        break;
        w.a(a).j();
        break;
        try
        {
          paramj = (JSONArray)localObject2;
          k = paramj.getInt(0);
          paramj = paramj.getJSONObject(1);
          w.a(a).g(k, w.b.a(paramj));
          paramd.a(null);
        }
        catch (NoSuchFieldException paramj) {}
      }
    case 1: 
      paramj = (JSONObject)localObject2;
      w.a(a).h(w.e.a(paramj));
      paramd.a(null);
      break;
    case 0: 
      paramj = (JSONObject)localObject2;
      k = paramj.getInt("platformViewId");
      boolean bool = paramj.optBoolean("usesVirtualDisplay", false);
      w.a(a).d(k, bool);
      paramd.a(null);
    }
  }
}

/* Location:
 * Qualified Name:     D5.w.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */