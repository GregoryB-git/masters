package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class FacebookRequestError
  implements Parcelable
{
  private static final String BODY_KEY = "body";
  private static final String CODE_KEY = "code";
  public static final Parcelable.Creator<FacebookRequestError> CREATOR = new Parcelable.Creator()
  {
    public FacebookRequestError createFromParcel(Parcel paramAnonymousParcel)
    {
      return new FacebookRequestError(paramAnonymousParcel, null);
    }
    
    public FacebookRequestError[] newArray(int paramAnonymousInt)
    {
      return new FacebookRequestError[paramAnonymousInt];
    }
  };
  private static final String ERROR_CODE_FIELD_KEY = "code";
  private static final String ERROR_CODE_KEY = "error_code";
  private static final String ERROR_IS_TRANSIENT_KEY = "is_transient";
  private static final String ERROR_KEY = "error";
  private static final String ERROR_MESSAGE_FIELD_KEY = "message";
  private static final String ERROR_MSG_KEY = "error_msg";
  private static final String ERROR_REASON_KEY = "error_reason";
  private static final String ERROR_SUB_CODE_KEY = "error_subcode";
  private static final String ERROR_TYPE_FIELD_KEY = "type";
  private static final String ERROR_USER_MSG_KEY = "error_user_msg";
  private static final String ERROR_USER_TITLE_KEY = "error_user_title";
  public static final Range HTTP_RANGE_SUCCESS = new Range(200, 299, null);
  public static final int INVALID_ERROR_CODE = -1;
  public static final int INVALID_HTTP_STATUS_CODE = -1;
  private final Object batchRequestResult;
  private final Category category;
  private final HttpURLConnection connection;
  private final int errorCode;
  private final String errorMessage;
  private final String errorRecoveryMessage;
  private final String errorType;
  private final String errorUserMessage;
  private final String errorUserTitle;
  private final FacebookException exception;
  private final JSONObject requestResult;
  private final JSONObject requestResultBody;
  private final int requestStatusCode;
  private final int subErrorCode;
  
  private FacebookRequestError(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean, JSONObject paramJSONObject1, JSONObject paramJSONObject2, Object paramObject, HttpURLConnection paramHttpURLConnection, FacebookException paramFacebookException)
  {
    requestStatusCode = paramInt1;
    errorCode = paramInt2;
    subErrorCode = paramInt3;
    errorType = paramString1;
    errorMessage = paramString2;
    requestResultBody = paramJSONObject1;
    requestResult = paramJSONObject2;
    batchRequestResult = paramObject;
    connection = paramHttpURLConnection;
    errorUserTitle = paramString3;
    errorUserMessage = paramString4;
    if (paramFacebookException != null)
    {
      exception = paramFacebookException;
      paramInt1 = 1;
    }
    else
    {
      exception = new FacebookServiceException(this, paramString2);
      paramInt1 = 0;
    }
    paramString2 = getErrorClassification();
    if (paramInt1 != 0) {
      paramString1 = Category.OTHER;
    } else {
      paramString1 = paramString2.classify(paramInt2, paramInt3, paramBoolean);
    }
    category = paramString1;
    errorRecoveryMessage = paramString2.getRecoveryMessage(paramString1);
  }
  
  public FacebookRequestError(int paramInt, String paramString1, String paramString2)
  {
    this(-1, paramInt, -1, paramString1, paramString2, null, null, false, null, null, null, null, null);
  }
  
  private FacebookRequestError(Parcel paramParcel)
  {
    this(paramParcel.readInt(), paramParcel.readInt(), paramParcel.readInt(), paramParcel.readString(), paramParcel.readString(), paramParcel.readString(), paramParcel.readString(), false, null, null, null, null, null);
  }
  
  public FacebookRequestError(HttpURLConnection paramHttpURLConnection, Exception paramException)
  {
    this(-1, -1, -1, null, null, null, null, false, null, null, null, paramHttpURLConnection, paramException);
  }
  
  public static FacebookRequestError checkResponseAndCreateError(JSONObject paramJSONObject, Object paramObject, HttpURLConnection paramHttpURLConnection)
  {
    try
    {
      if (paramJSONObject.has("code"))
      {
        int i = paramJSONObject.getInt("code");
        Object localObject1 = Utility.getStringPropertyAsJSON(paramJSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
        if ((localObject1 != null) && ((localObject1 instanceof JSONObject)))
        {
          JSONObject localJSONObject1 = (JSONObject)localObject1;
          boolean bool = localJSONObject1.has("error");
          int j = 0;
          Object localObject2;
          int k;
          int m;
          Object localObject3;
          Object localObject4;
          if (bool)
          {
            JSONObject localJSONObject2 = (JSONObject)Utility.getStringPropertyAsJSON(localJSONObject1, "error", null);
            localObject1 = localJSONObject2.optString("type", null);
            localObject2 = localJSONObject2.optString("message", null);
            k = localJSONObject2.optInt("code", -1);
            m = localJSONObject2.optInt("error_subcode", -1);
            localObject3 = localJSONObject2.optString("error_user_msg", null);
            localObject4 = localJSONObject2.optString("error_user_title", null);
            bool = localJSONObject2.optBoolean("is_transient", false);
            j = 1;
          }
          else
          {
            bool = localJSONObject1.has("error_code");
            if ((!bool) && (!localJSONObject1.has("error_msg")) && (!localJSONObject1.has("error_reason")))
            {
              bool = false;
              k = -1;
              m = k;
              localObject1 = null;
              localObject2 = localObject1;
              localObject3 = localObject2;
              localObject4 = localObject3;
            }
            else
            {
              localObject1 = localJSONObject1.optString("error_reason", null);
              localObject2 = localJSONObject1.optString("error_msg", null);
              k = localJSONObject1.optInt("error_code", -1);
              m = localJSONObject1.optInt("error_subcode", -1);
              bool = false;
              localObject3 = null;
              localObject4 = localObject3;
              j = 1;
            }
          }
          if (j != 0) {
            return new FacebookRequestError(i, k, m, (String)localObject1, (String)localObject2, (String)localObject4, (String)localObject3, bool, localJSONObject1, paramJSONObject, paramObject, paramHttpURLConnection, null);
          }
        }
        if (!HTTP_RANGE_SUCCESS.contains(i))
        {
          if (paramJSONObject.has("body")) {
            localObject1 = (JSONObject)Utility.getStringPropertyAsJSON(paramJSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
          } else {
            localObject1 = null;
          }
          paramJSONObject = new FacebookRequestError(i, -1, -1, null, null, null, null, false, (JSONObject)localObject1, paramJSONObject, paramObject, paramHttpURLConnection, null);
          return paramJSONObject;
        }
      }
    }
    catch (JSONException paramJSONObject)
    {
      for (;;) {}
    }
    return null;
  }
  
  public static FacebookRequestErrorClassification getErrorClassification()
  {
    try
    {
      Object localObject1 = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
      if (localObject1 == null)
      {
        localObject1 = FacebookRequestErrorClassification.getDefaultErrorClassification();
        return (FacebookRequestErrorClassification)localObject1;
      }
      localObject1 = ((FetchedAppSettings)localObject1).getErrorClassification();
      return (FacebookRequestErrorClassification)localObject1;
    }
    finally {}
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Object getBatchRequestResult()
  {
    return batchRequestResult;
  }
  
  public Category getCategory()
  {
    return category;
  }
  
  public HttpURLConnection getConnection()
  {
    return connection;
  }
  
  public int getErrorCode()
  {
    return errorCode;
  }
  
  public String getErrorMessage()
  {
    String str = errorMessage;
    if (str != null) {
      return str;
    }
    return exception.getLocalizedMessage();
  }
  
  public String getErrorRecoveryMessage()
  {
    return errorRecoveryMessage;
  }
  
  public String getErrorType()
  {
    return errorType;
  }
  
  public String getErrorUserMessage()
  {
    return errorUserMessage;
  }
  
  public String getErrorUserTitle()
  {
    return errorUserTitle;
  }
  
  public FacebookException getException()
  {
    return exception;
  }
  
  public JSONObject getRequestResult()
  {
    return requestResult;
  }
  
  public JSONObject getRequestResultBody()
  {
    return requestResultBody;
  }
  
  public int getRequestStatusCode()
  {
    return requestStatusCode;
  }
  
  public int getSubErrorCode()
  {
    return subErrorCode;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{HttpStatus: ");
    localStringBuilder.append(requestStatusCode);
    localStringBuilder.append(", errorCode: ");
    localStringBuilder.append(errorCode);
    localStringBuilder.append(", subErrorCode: ");
    localStringBuilder.append(subErrorCode);
    localStringBuilder.append(", errorType: ");
    localStringBuilder.append(errorType);
    localStringBuilder.append(", errorMessage: ");
    localStringBuilder.append(getErrorMessage());
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(requestStatusCode);
    paramParcel.writeInt(errorCode);
    paramParcel.writeInt(subErrorCode);
    paramParcel.writeString(errorType);
    paramParcel.writeString(errorMessage);
    paramParcel.writeString(errorUserTitle);
    paramParcel.writeString(errorUserMessage);
  }
  
  public static enum Category
  {
    static
    {
      Category localCategory1 = new Category("LOGIN_RECOVERABLE", 0);
      LOGIN_RECOVERABLE = localCategory1;
      Category localCategory2 = new Category("OTHER", 1);
      OTHER = localCategory2;
      Category localCategory3 = new Category("TRANSIENT", 2);
      TRANSIENT = localCategory3;
      $VALUES = new Category[] { localCategory1, localCategory2, localCategory3 };
    }
    
    private Category() {}
  }
  
  public static class Range
  {
    private final int end;
    private final int start;
    
    private Range(int paramInt1, int paramInt2)
    {
      start = paramInt1;
      end = paramInt2;
    }
    
    public boolean contains(int paramInt)
    {
      boolean bool;
      if ((start <= paramInt) && (paramInt <= end)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.FacebookRequestError
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */