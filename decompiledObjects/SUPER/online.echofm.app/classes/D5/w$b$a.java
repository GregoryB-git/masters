package D5;

import android.os.Build.VERSION;
import org.json.JSONArray;
import org.json.JSONObject;

public class w$b$a
{
  public final String a;
  public final String[] b;
  public final w.e c;
  public final String d;
  
  public w$b$a(String paramString1, String[] paramArrayOfString, String paramString2, w.e parame)
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

/* Location:
 * Qualified Name:     D5.w.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */