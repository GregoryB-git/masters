package io.flutter.plugins.firebase.firestore.utils;

import com.google.firebase.firestore.d.a;

public class ServerTimestampBehaviorConverter
{
  public static d.a toServerTimestampBehavior(String paramString)
  {
    d.a locala = d.a.a;
    if (paramString == null) {
      return locala;
    }
    int i = -1;
    int j = paramString.hashCode();
    if (j != -1959779032)
    {
      if (j != -1273775369)
      {
        if ((j == 3387192) && (paramString.equals("none"))) {
          i = 2;
        }
      }
      else if (paramString.equals("previous")) {
        i = 1;
      }
    }
    else if (paramString.equals("estimate")) {
      i = 0;
    }
    if (i != 0)
    {
      if (i != 1) {
        return locala;
      }
      return d.a.c;
    }
    return d.a.b;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.utils.ServerTimestampBehaviorConverter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */