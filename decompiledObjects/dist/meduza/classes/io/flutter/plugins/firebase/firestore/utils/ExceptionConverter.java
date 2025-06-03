package io.flutter.plugins.firebase.firestore.utils;

import android.util.Log;
import com.google.firebase.firestore.f;
import io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestoreException;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FlutterError;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ExceptionConverter
{
  public static Map<String, String> createDetails(Exception paramException)
  {
    HashMap localHashMap = new HashMap();
    if (paramException == null) {
      return localHashMap;
    }
    f localf = null;
    Object localObject;
    if ((paramException instanceof f))
    {
      localObject = new FlutterFirebaseFirestoreException((f)paramException, paramException.getCause());
    }
    else
    {
      localObject = localf;
      if (paramException.getCause() != null)
      {
        localObject = localf;
        if ((paramException.getCause() instanceof f))
        {
          localf = (f)paramException.getCause();
          if (paramException.getCause().getCause() != null) {
            localObject = paramException.getCause().getCause();
          } else {
            localObject = paramException.getCause();
          }
          localObject = new FlutterFirebaseFirestoreException(localf, (Throwable)localObject);
        }
      }
    }
    if (localObject != null)
    {
      localHashMap.put("code", ((FlutterFirebaseFirestoreException)localObject).getCode());
      localHashMap.put("message", ((FlutterFirebaseFirestoreException)localObject).getMessage());
    }
    if (localHashMap.containsKey("code"))
    {
      localObject = (String)localHashMap.get("code");
      Objects.requireNonNull(localObject);
      if (((String)localObject).equals("unknown")) {
        Log.e("FLTFirebaseFirestore", "An unknown error occurred", paramException);
      }
    }
    return localHashMap;
  }
  
  public static void sendErrorToFlutter(GeneratedAndroidFirebaseFirestore.Result paramResult, Exception paramException)
  {
    Map localMap = createDetails(paramException);
    if (paramException != null) {
      paramException = paramException.getMessage();
    } else {
      paramException = null;
    }
    paramResult.error(new GeneratedAndroidFirebaseFirestore.FlutterError("firebase_firestore", paramException, localMap));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.utils.ExceptionConverter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */