package D5;

import E5.g;
import E5.j;
import E5.k;
import E5.k.c;
import E5.k.d;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import io.flutter.plugin.editing.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t5.b;
import w5.a;

public class w
{
  public final k a;
  public f b;
  public final k.c c;
  
  public w(a parama)
  {
    a locala = new a();
    c = locala;
    parama = new k(parama, "flutter/textinput", g.a);
    a = parama;
    parama.e(locala);
  }
  
  public static HashMap c(ArrayList paramArrayList)
  {
    HashMap localHashMap = new HashMap();
    JSONArray localJSONArray = new JSONArray();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext()) {
      localJSONArray.put(((o)paramArrayList.next()).b());
    }
    localHashMap.put("deltas", localJSONArray);
    return localHashMap;
  }
  
  public static HashMap d(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("text", paramString);
    localHashMap.put("selectionBase", Integer.valueOf(paramInt1));
    localHashMap.put("selectionExtent", Integer.valueOf(paramInt2));
    localHashMap.put("composingBase", Integer.valueOf(paramInt3));
    localHashMap.put("composingExtent", Integer.valueOf(paramInt4));
    return localHashMap;
  }
  
  public void b(int paramInt, Map paramMap)
  {
    b.f("TextInputChannel", "Sending 'commitContent' message.");
    a.c("TextInputClient.performAction", Arrays.asList(new Object[] { Integer.valueOf(paramInt), "TextInputAction.commitContent", paramMap }));
  }
  
  public void e(int paramInt)
  {
    b.f("TextInputChannel", "Sending 'done' message.");
    a.c("TextInputClient.performAction", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt), "TextInputAction.done" }));
  }
  
  public void f(int paramInt)
  {
    b.f("TextInputChannel", "Sending 'go' message.");
    a.c("TextInputClient.performAction", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt), "TextInputAction.go" }));
  }
  
  public void g(int paramInt)
  {
    b.f("TextInputChannel", "Sending 'newline' message.");
    a.c("TextInputClient.performAction", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt), "TextInputAction.newline" }));
  }
  
  public void h(int paramInt)
  {
    b.f("TextInputChannel", "Sending 'next' message.");
    a.c("TextInputClient.performAction", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt), "TextInputAction.next" }));
  }
  
  public void i(int paramInt, String paramString, Bundle paramBundle)
  {
    HashMap localHashMap1 = new HashMap();
    localHashMap1.put("action", paramString);
    if (paramBundle != null)
    {
      HashMap localHashMap2 = new HashMap();
      Iterator localIterator = paramBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        paramString = paramBundle.get(str);
        if ((paramString instanceof byte[])) {
          localHashMap2.put(str, paramBundle.getByteArray(str));
        } else if ((paramString instanceof Byte)) {
          localHashMap2.put(str, Byte.valueOf(paramBundle.getByte(str)));
        } else if ((paramString instanceof char[])) {
          localHashMap2.put(str, paramBundle.getCharArray(str));
        } else if ((paramString instanceof Character)) {
          localHashMap2.put(str, Character.valueOf(paramBundle.getChar(str)));
        } else if ((paramString instanceof CharSequence[])) {
          localHashMap2.put(str, paramBundle.getCharSequenceArray(str));
        } else if ((paramString instanceof CharSequence)) {
          localHashMap2.put(str, paramBundle.getCharSequence(str));
        } else if ((paramString instanceof float[])) {
          localHashMap2.put(str, paramBundle.getFloatArray(str));
        } else if ((paramString instanceof Float)) {
          localHashMap2.put(str, Float.valueOf(paramBundle.getFloat(str)));
        }
      }
      localHashMap1.put("data", localHashMap2);
    }
    a.c("TextInputClient.performPrivateCommand", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt), localHashMap1 }));
  }
  
  public void j(int paramInt)
  {
    b.f("TextInputChannel", "Sending 'previous' message.");
    a.c("TextInputClient.performAction", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt), "TextInputAction.previous" }));
  }
  
  public void k()
  {
    a.c("TextInputClient.requestExistingInputState", null);
  }
  
  public void l(int paramInt)
  {
    b.f("TextInputChannel", "Sending 'search' message.");
    a.c("TextInputClient.performAction", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt), "TextInputAction.search" }));
  }
  
  public void m(int paramInt)
  {
    b.f("TextInputChannel", "Sending 'send' message.");
    a.c("TextInputClient.performAction", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt), "TextInputAction.send" }));
  }
  
  public void n(f paramf)
  {
    b = paramf;
  }
  
  public void o(int paramInt)
  {
    b.f("TextInputChannel", "Sending 'unspecified' message.");
    a.c("TextInputClient.performAction", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt), "TextInputAction.unspecified" }));
  }
  
  public void p(int paramInt1, String paramString, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Sending message to update editing state: \nText: ");
    localStringBuilder.append(paramString);
    localStringBuilder.append("\nSelection start: ");
    localStringBuilder.append(paramInt2);
    localStringBuilder.append("\nSelection end: ");
    localStringBuilder.append(paramInt3);
    localStringBuilder.append("\nComposing start: ");
    localStringBuilder.append(paramInt4);
    localStringBuilder.append("\nComposing end: ");
    localStringBuilder.append(paramInt5);
    b.f("TextInputChannel", localStringBuilder.toString());
    paramString = d(paramString, paramInt2, paramInt3, paramInt4, paramInt5);
    a.c("TextInputClient.updateEditingState", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt1), paramString }));
  }
  
  public void q(int paramInt, ArrayList paramArrayList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Sending message to update editing state with deltas: \nNumber of deltas: ");
    localStringBuilder.append(paramArrayList.size());
    b.f("TextInputChannel", localStringBuilder.toString());
    paramArrayList = c(paramArrayList);
    a.c("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt), paramArrayList }));
  }
  
  public void r(int paramInt, HashMap paramHashMap)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Sending message to update editing state for ");
    ((StringBuilder)localObject).append(String.valueOf(paramHashMap.size()));
    ((StringBuilder)localObject).append(" field(s).");
    b.f("TextInputChannel", ((StringBuilder)localObject).toString());
    localObject = new HashMap();
    Iterator localIterator = paramHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramHashMap = (Map.Entry)localIterator.next();
      e locale = (e)paramHashMap.getValue();
      ((HashMap)localObject).put((String)paramHashMap.getKey(), d(a, b, c, -1, -1));
    }
    a.c("TextInputClient.updateEditingStateWithTag", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt), localObject }));
  }
  
  public class a
    implements k.c
  {
    public a() {}
    
    public void onMethodCall(j paramj, k.d paramd)
    {
      if (w.a(w.this) == null) {
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
        w.a(w.this).f();
      case 8: 
      case 7: 
        for (;;)
        {
          paramd.a(null);
          break;
          w.a(w.this).b();
          continue;
          w.a(w.this).i(((Boolean)localObject2).booleanValue());
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
            w.a(w.this).e(d1, d2, paramj);
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
          w.a(w.this).c((String)localObject1, paramj);
          paramd.a(null);
          return;
          w.a(w.this).a();
          break;
          w.a(w.this).j();
          break;
          try
          {
            paramj = (JSONArray)localObject2;
            k = paramj.getInt(0);
            paramj = paramj.getJSONObject(1);
            w.a(w.this).g(k, w.b.a(paramj));
            paramd.a(null);
          }
          catch (NoSuchFieldException paramj) {}
        }
      case 1: 
        paramj = (JSONObject)localObject2;
        w.a(w.this).h(w.e.a(paramj));
        paramd.a(null);
        break;
      case 0: 
        paramj = (JSONObject)localObject2;
        k = paramj.getInt("platformViewId");
        boolean bool = paramj.optBoolean("usesVirtualDisplay", false);
        w.a(w.this).d(k, bool);
        paramd.a(null);
      }
    }
  }
  
  public static class b
  {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final w.d f;
    public final w.c g;
    public final Integer h;
    public final String i;
    public final a j;
    public final String[] k;
    public final b[] l;
    
    public b(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, w.d paramd, w.c paramc, Integer paramInteger, String paramString, a parama, String[] paramArrayOfString, b[] paramArrayOfb)
    {
      a = paramBoolean1;
      b = paramBoolean2;
      c = paramBoolean3;
      d = paramBoolean4;
      e = paramBoolean5;
      f = paramd;
      g = paramc;
      h = paramInteger;
      i = paramString;
      j = parama;
      k = paramArrayOfString;
      l = paramArrayOfb;
    }
    
    public static b a(JSONObject paramJSONObject)
    {
      Object localObject1 = paramJSONObject.getString("inputAction");
      if (localObject1 != null)
      {
        boolean bool1 = paramJSONObject.isNull("fields");
        int m = 0;
        Object localObject2 = null;
        b[] arrayOfb;
        int i1;
        if (!bool1)
        {
          localObject3 = paramJSONObject.getJSONArray("fields");
          int n = ((JSONArray)localObject3).length();
          arrayOfb = new b[n];
          for (i1 = 0; i1 < n; i1++) {
            arrayOfb[i1] = a(((JSONArray)localObject3).getJSONObject(i1));
          }
        }
        else
        {
          arrayOfb = null;
        }
        Integer localInteger = b((String)localObject1);
        Object localObject3 = new ArrayList();
        if (paramJSONObject.isNull("contentCommitMimeTypes")) {
          localObject1 = null;
        } else {
          localObject1 = paramJSONObject.getJSONArray("contentCommitMimeTypes");
        }
        if (localObject1 != null) {
          for (i1 = m; i1 < ((JSONArray)localObject1).length(); i1++) {
            ((List)localObject3).add(((JSONArray)localObject1).optString(i1));
          }
        }
        boolean bool2 = paramJSONObject.optBoolean("obscureText");
        boolean bool3 = paramJSONObject.optBoolean("autocorrect", true);
        bool1 = paramJSONObject.optBoolean("enableSuggestions");
        boolean bool4 = paramJSONObject.optBoolean("enableIMEPersonalizedLearning");
        boolean bool5 = paramJSONObject.optBoolean("enableDeltaModel");
        w.d locald = w.d.e(paramJSONObject.getString("textCapitalization"));
        w.c localc = w.c.a(paramJSONObject.getJSONObject("inputType"));
        if (paramJSONObject.isNull("actionLabel")) {
          localObject1 = null;
        } else {
          localObject1 = paramJSONObject.getString("actionLabel");
        }
        if (paramJSONObject.isNull("autofill")) {}
        for (paramJSONObject = (JSONObject)localObject2;; paramJSONObject = a.a(paramJSONObject.getJSONObject("autofill"))) {
          break;
        }
        return new b(bool2, bool3, bool1, bool4, bool5, locald, localc, localInteger, (String)localObject1, paramJSONObject, (String[])((List)localObject3).toArray(new String[((List)localObject3).size()]), arrayOfb);
      }
      throw new JSONException("Configuration JSON missing 'inputAction' property.");
    }
    
    public static Integer b(String paramString)
    {
      paramString.hashCode();
      int m = paramString.hashCode();
      int n = 1;
      Integer localInteger1 = Integer.valueOf(1);
      Integer localInteger2 = Integer.valueOf(0);
      switch (m)
      {
      }
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      n = -1;
                      break;
                    } while (!paramString.equals("TextInputAction.previous"));
                    n = 8;
                    break;
                  } while (!paramString.equals("TextInputAction.newline"));
                  n = 7;
                  break;
                } while (!paramString.equals("TextInputAction.go"));
                n = 6;
                break;
              } while (!paramString.equals("TextInputAction.search"));
              n = 5;
              break;
            } while (!paramString.equals("TextInputAction.send"));
            n = 4;
            break;
          } while (!paramString.equals("TextInputAction.none"));
          n = 3;
          break;
        } while (!paramString.equals("TextInputAction.next"));
        n = 2;
        break;
        if (paramString.equals("TextInputAction.done")) {
          break;
        }
      } while ((goto 108) || (!paramString.equals("TextInputAction.unspecified")));
      n = 0;
      switch (n)
      {
      default: 
        return localInteger2;
      case 8: 
        return Integer.valueOf(7);
      case 7: 
        return localInteger1;
      case 6: 
        return Integer.valueOf(2);
      case 5: 
        return Integer.valueOf(3);
      case 4: 
        return Integer.valueOf(4);
      case 3: 
        return localInteger1;
      case 2: 
        return Integer.valueOf(5);
      case 1: 
        return Integer.valueOf(6);
      }
      return localInteger2;
    }
    
    public static class a
    {
      public final String a;
      public final String[] b;
      public final w.e c;
      public final String d;
      
      public a(String paramString1, String[] paramArrayOfString, String paramString2, w.e parame)
      {
        a = paramString1;
        b = paramArrayOfString;
        d = paramString2;
        c = parame;
      }
      
      public static a a(JSONObject paramJSONObject)
      {
        String str1 = paramJSONObject.getString("uniqueIdentifier");
        JSONArray localJSONArray = paramJSONObject.getJSONArray("hints");
        String str2;
        if (paramJSONObject.isNull("hintText")) {
          str2 = null;
        } else {
          str2 = paramJSONObject.getString("hintText");
        }
        paramJSONObject = paramJSONObject.getJSONObject("editingValue");
        String[] arrayOfString = new String[localJSONArray.length()];
        for (int i = 0; i < localJSONArray.length(); i++) {
          arrayOfString[i] = b(localJSONArray.getString(i));
        }
        return new a(str1, arrayOfString, str2, w.e.a(paramJSONObject));
      }
      
      public static String b(String paramString)
      {
        int i = Build.VERSION.SDK_INT;
        int j = 26;
        if (i < 26) {
          return paramString;
        }
        paramString.hashCode();
        switch (paramString.hashCode())
        {
        }
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          do
                          {
                            do
                            {
                              do
                              {
                                do
                                {
                                  do
                                  {
                                    do
                                    {
                                      do
                                      {
                                        do
                                        {
                                          do
                                          {
                                            do
                                            {
                                              do
                                              {
                                                do
                                                {
                                                  do
                                                  {
                                                    do
                                                    {
                                                      do
                                                      {
                                                        do
                                                        {
                                                          do
                                                          {
                                                            do
                                                            {
                                                              do
                                                              {
                                                                do
                                                                {
                                                                  do
                                                                  {
                                                                    do
                                                                    {
                                                                      do
                                                                      {
                                                                        do
                                                                        {
                                                                          do
                                                                          {
                                                                            do
                                                                            {
                                                                              j = -1;
                                                                              break;
                                                                            } while (!paramString.equals("birthdayDay"));
                                                                            j = 35;
                                                                            break;
                                                                          } while (!paramString.equals("postalCode"));
                                                                          j = 34;
                                                                          break;
                                                                        } while (!paramString.equals("postalAddressExtended"));
                                                                        j = 33;
                                                                        break;
                                                                      } while (!paramString.equals("postalAddress"));
                                                                      j = 32;
                                                                      break;
                                                                    } while (!paramString.equals("givenName"));
                                                                    j = 31;
                                                                    break;
                                                                  } while (!paramString.equals("password"));
                                                                  j = 30;
                                                                  break;
                                                                } while (!paramString.equals("birthday"));
                                                                j = 29;
                                                                break;
                                                              } while (!paramString.equals("newUsername"));
                                                              j = 28;
                                                              break;
                                                            } while (!paramString.equals("telephoneNumber"));
                                                            j = 27;
                                                            break;
                                                            if (paramString.equals("familyName")) {
                                                              break;
                                                            }
                                                          } while ((goto 324) || (!paramString.equals("birthdayMonth")));
                                                          j = 25;
                                                          break;
                                                        } while (!paramString.equals("addressState"));
                                                        j = 24;
                                                        break;
                                                      } while (!paramString.equals("email"));
                                                      j = 23;
                                                      break;
                                                    } while (!paramString.equals("name"));
                                                    j = 22;
                                                    break;
                                                  } while (!paramString.equals("username"));
                                                  j = 21;
                                                  break;
                                                } while (!paramString.equals("telephoneNumberCountryCode"));
                                                j = 20;
                                                break;
                                              } while (!paramString.equals("creditCardExpirationYear"));
                                              j = 19;
                                              break;
                                            } while (!paramString.equals("creditCardExpirationDate"));
                                            j = 18;
                                            break;
                                          } while (!paramString.equals("nameSuffix"));
                                          j = 17;
                                          break;
                                        } while (!paramString.equals("middleName"));
                                        j = 16;
                                        break;
                                      } while (!paramString.equals("namePrefix"));
                                      j = 15;
                                      break;
                                    } while (!paramString.equals("creditCardNumber"));
                                    j = 14;
                                    break;
                                  } while (!paramString.equals("postalAddressExtendedPostalCode"));
                                  j = 13;
                                  break;
                                } while (!paramString.equals("gender"));
                                j = 12;
                                break;
                              } while (!paramString.equals("addressCity"));
                              j = 11;
                              break;
                            } while (!paramString.equals("middleInitial"));
                            j = 10;
                            break;
                          } while (!paramString.equals("countryName"));
                          j = 9;
                          break;
                        } while (!paramString.equals("telephoneNumberDevice"));
                        j = 8;
                        break;
                      } while (!paramString.equals("fullStreetAddress"));
                      j = 7;
                      break;
                    } while (!paramString.equals("creditCardExpirationDay"));
                    j = 6;
                    break;
                  } while (!paramString.equals("creditCardSecurityCode"));
                  j = 5;
                  break;
                } while (!paramString.equals("newPassword"));
                j = 4;
                break;
              } while (!paramString.equals("telephoneNumberNational"));
              j = 3;
              break;
            } while (!paramString.equals("creditCardExpirationMonth"));
            j = 2;
            break;
          } while (!paramString.equals("oneTimeCode"));
          j = 1;
          break;
        } while (!paramString.equals("birthdayYear"));
        j = 0;
        switch (j)
        {
        default: 
          return paramString;
        case 35: 
          return "birthDateDay";
        case 34: 
          return "postalCode";
        case 33: 
          return "extendedAddress";
        case 32: 
          return "postalAddress";
        case 31: 
          return "personGivenName";
        case 30: 
          return "password";
        case 29: 
          return "birthDateFull";
        case 28: 
          return "newUsername";
        case 27: 
          return "phoneNumber";
        case 26: 
          return "personFamilyName";
        case 25: 
          return "birthDateMonth";
        case 24: 
          return "addressRegion";
        case 23: 
          return "emailAddress";
        case 22: 
          return "personName";
        case 21: 
          return "username";
        case 20: 
          return "phoneCountryCode";
        case 19: 
          return "creditCardExpirationYear";
        case 18: 
          return "creditCardExpirationDate";
        case 17: 
          return "personNameSuffix";
        case 16: 
          return "personMiddleName";
        case 15: 
          return "personNamePrefix";
        case 14: 
          return "creditCardNumber";
        case 13: 
          return "extendedPostalCode";
        case 12: 
          return "gender";
        case 11: 
          return "addressLocality";
        case 10: 
          return "personMiddleInitial";
        case 9: 
          return "addressCountry";
        case 8: 
          return "phoneNumberDevice";
        case 7: 
          return "streetAddress";
        case 6: 
          return "creditCardExpirationDay";
        case 5: 
          return "creditCardSecurityCode";
        case 4: 
          return "newPassword";
        case 3: 
          return "phoneNational";
        case 2: 
          return "creditCardExpirationMonth";
        case 1: 
          return "smsOTPCode";
        }
        return "birthDateYear";
      }
    }
  }
  
  public static class c
  {
    public final w.g a;
    public final boolean b;
    public final boolean c;
    
    public c(w.g paramg, boolean paramBoolean1, boolean paramBoolean2)
    {
      a = paramg;
      b = paramBoolean1;
      c = paramBoolean2;
    }
    
    public static c a(JSONObject paramJSONObject)
    {
      return new c(w.g.e(paramJSONObject.getString("name")), paramJSONObject.optBoolean("signed", false), paramJSONObject.optBoolean("decimal", false));
    }
  }
  
  public static enum d
  {
    public final String o;
    
    public d(String paramString1)
    {
      o = paramString1;
    }
    
    public static d e(String paramString)
    {
      for (localObject : ) {
        if (o.equals(paramString)) {
          return (d)localObject;
        }
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("No such TextCapitalization: ");
      ((StringBuilder)localObject).append(paramString);
      throw new NoSuchFieldException(((StringBuilder)localObject).toString());
    }
  }
  
  public static class e
  {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    
    public e(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      if (((paramInt1 == -1) && (paramInt2 == -1)) || ((paramInt1 >= 0) && (paramInt2 >= 0)))
      {
        if (((paramInt3 == -1) && (paramInt4 == -1)) || ((paramInt3 >= 0) && (paramInt3 <= paramInt4)))
        {
          if (paramInt4 <= paramString.length())
          {
            if (paramInt1 <= paramString.length())
            {
              if (paramInt2 <= paramString.length())
              {
                a = paramString;
                b = paramInt1;
                c = paramInt2;
                d = paramInt3;
                e = paramInt4;
                return;
              }
              paramString = new StringBuilder();
              paramString.append("invalid selection end: ");
              paramString.append(String.valueOf(paramInt2));
              throw new IndexOutOfBoundsException(paramString.toString());
            }
            paramString = new StringBuilder();
            paramString.append("invalid selection start: ");
            paramString.append(String.valueOf(paramInt1));
            throw new IndexOutOfBoundsException(paramString.toString());
          }
          paramString = new StringBuilder();
          paramString.append("invalid composing start: ");
          paramString.append(String.valueOf(paramInt3));
          throw new IndexOutOfBoundsException(paramString.toString());
        }
        paramString = new StringBuilder();
        paramString.append("invalid composing range: (");
        paramString.append(String.valueOf(paramInt3));
        paramString.append(", ");
        paramString.append(String.valueOf(paramInt4));
        paramString.append(")");
        throw new IndexOutOfBoundsException(paramString.toString());
      }
      paramString = new StringBuilder();
      paramString.append("invalid selection: (");
      paramString.append(String.valueOf(paramInt1));
      paramString.append(", ");
      paramString.append(String.valueOf(paramInt2));
      paramString.append(")");
      throw new IndexOutOfBoundsException(paramString.toString());
    }
    
    public static e a(JSONObject paramJSONObject)
    {
      return new e(paramJSONObject.getString("text"), paramJSONObject.getInt("selectionBase"), paramJSONObject.getInt("selectionExtent"), paramJSONObject.getInt("composingBase"), paramJSONObject.getInt("composingExtent"));
    }
    
    public boolean b()
    {
      int i = d;
      boolean bool;
      if ((i >= 0) && (e > i)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean c()
    {
      boolean bool;
      if (b >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public static abstract interface f
  {
    public abstract void a();
    
    public abstract void b();
    
    public abstract void c(String paramString, Bundle paramBundle);
    
    public abstract void d(int paramInt, boolean paramBoolean);
    
    public abstract void e(double paramDouble1, double paramDouble2, double[] paramArrayOfDouble);
    
    public abstract void f();
    
    public abstract void g(int paramInt, w.b paramb);
    
    public abstract void h(w.e parame);
    
    public abstract void i(boolean paramBoolean);
    
    public abstract void j();
  }
  
  public static enum g
  {
    public final String o;
    
    public g(String paramString1)
    {
      o = paramString1;
    }
    
    public static g e(String paramString)
    {
      for (g localg : ) {
        if (o.equals(paramString)) {
          return localg;
        }
      }
      ??? = new StringBuilder();
      ((StringBuilder)???).append("No such TextInputType: ");
      ((StringBuilder)???).append(paramString);
      throw new NoSuchFieldException(((StringBuilder)???).toString());
    }
  }
}

/* Location:
 * Qualified Name:     D5.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */