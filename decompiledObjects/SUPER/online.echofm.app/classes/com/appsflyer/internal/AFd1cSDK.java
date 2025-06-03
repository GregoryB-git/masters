package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;

public final class AFd1cSDK
{
  private static long AFKeystoreWrapper = 0L;
  private static int valueOf = 0;
  private static int values = 1;
  
  static
  {
    valueOf();
    View.resolveSize(0, 0);
    int i = valueOf + 39;
    values = i % 128;
    if (i % 2 != 0) {
      return;
    }
    throw null;
  }
  
  private static void AFKeystoreWrapper(String arg0, int paramInt, Object[] paramArrayOfObject)
  {
    Object localObject = ???;
    if (??? != null) {
      localObject = ???.toCharArray();
    }
    localObject = (char[])localObject;
    String str;
    synchronized (AFg1rSDK.AFInAppEventParameterName)
    {
      localObject = AFg1rSDK.AFInAppEventType(AFKeystoreWrapper, (char[])localObject, paramInt);
      AFg1rSDK.AFInAppEventType = 4;
      paramInt = AFg1rSDK.AFInAppEventType;
      if (paramInt < localObject.length)
      {
        AFg1rSDK.AFKeystoreWrapper = paramInt - 4;
        paramInt = AFg1rSDK.AFInAppEventType;
        localObject[paramInt] = ((char)(char)(int)(localObject[paramInt] ^ localObject[(paramInt % 4)] ^ AFg1rSDK.AFKeystoreWrapper * AFKeystoreWrapper));
        AFg1rSDK.AFInAppEventType += 1;
      }
    }
  }
  
  public static void valueOf()
  {
    AFKeystoreWrapper = -4836734234935930684L;
  }
  
  @NonNull
  private static AFf1xSDK values(@NonNull AFe1qSDK paramAFe1qSDK, String paramString1, @NonNull String paramString2, @NonNull String paramString3)
  {
    boolean bool = false;
    if (paramString1 == null)
    {
      if (values == AFe1aSDK.AFInAppEventType) {
        bool = true;
      }
      return new AFf1xSDK(bool, AFf1wSDK.valueOf);
    }
    int i = ExpandableListView.getPackedPositionType(0L);
    Object localObject = new Object[1];
    AFKeystoreWrapper("ዅዶ?봦䨥Ⱁ処縳༵铖㬌찅꘻?脖攠ặ냣䙦⃗嶧䷼᭶鿊肑໅?媆잃쯖鵗᧣ੳ蒣冧풖䥣䇄ᚷ鎅豓˰ꮇ仃?梑ඦ㘲顡ⷡ쥕產啲葃렒ᘴꟀ䍷！퍖擐㸓", i, (Object[])localObject);
    localObject = ((String)localObject[0]).intern();
    if (values == AFe1aSDK.AFKeystoreWrapper)
    {
      paramString2 = new StringBuilder(paramString2).reverse().toString();
    }
    else
    {
      paramString2 = "";
      paramString3 = (String)localObject;
    }
    paramAFe1qSDK = AFInAppEventType;
    bool = values(new StringBuilder(paramString3).reverse().toString(), paramAFe1qSDK, "android", "v1", paramString2).equals(paramString1);
    if (bool) {
      paramAFe1qSDK = AFf1wSDK.AFInAppEventParameterName;
    } else {
      paramAFe1qSDK = AFf1wSDK.AFKeystoreWrapper;
    }
    return new AFf1xSDK(bool, paramAFe1qSDK);
  }
  
  private static String values(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    int i = valueOf + 37;
    values = i % 128;
    if (i % 2 == 0)
    {
      String[] arrayOfString = new String[3];
      arrayOfString[0] = paramString2;
      arrayOfString[0] = paramString3;
      arrayOfString[5] = paramString4;
      arrayOfString[5] = paramString5;
      arrayOfString[4] = "";
      paramString2 = AFc1nSDK.valueOf(TextUtils.join("⁣", arrayOfString), paramString1);
      paramString1 = paramString2;
      if (paramString2.length() >= 116) {
        break label145;
      }
    }
    else
    {
      paramString2 = AFc1nSDK.valueOf(TextUtils.join("⁣", new String[] { paramString2, paramString3, paramString4, paramString5, "" }), paramString1);
      paramString1 = paramString2;
      if (paramString2.length() >= 12) {
        break label145;
      }
    }
    values = (valueOf + 11) % 128;
    return paramString2;
    label145:
    return paramString1.substring(0, 12);
  }
  
  @NonNull
  public final AFf1xSDK valueOf(@NonNull AFe1qSDK paramAFe1qSDK, String paramString1, @NonNull String paramString2, @NonNull String paramString3)
  {
    int i = valueOf + 75;
    int j = i % 128;
    values = j;
    if (i % 2 != 0)
    {
      if ((paramAFe1qSDK != null) && (paramString2 != null))
      {
        j += 35;
        i = j % 128;
        valueOf = i;
        if (j % 2 == 0)
        {
          if (paramString3 != null)
          {
            i++;
            values = i % 128;
            if (i % 2 != 0) {
              return values(paramAFe1qSDK, paramString1, paramString2, paramString3);
            }
          }
        }
        else {
          throw null;
        }
      }
      return new AFf1xSDK(false, AFf1wSDK.values);
    }
    throw null;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFd1cSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */