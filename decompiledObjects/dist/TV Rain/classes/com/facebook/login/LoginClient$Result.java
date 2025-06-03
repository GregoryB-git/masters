package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.util.Map;

public class LoginClient$Result
  implements Parcelable
{
  public static final Parcelable.Creator<Result> CREATOR = new Parcelable.Creator()
  {
    public LoginClient.Result createFromParcel(Parcel paramAnonymousParcel)
    {
      return new LoginClient.Result(paramAnonymousParcel, null);
    }
    
    public LoginClient.Result[] newArray(int paramAnonymousInt)
    {
      return new LoginClient.Result[paramAnonymousInt];
    }
  };
  public final Code code;
  public final String errorCode;
  public final String errorMessage;
  public Map<String, String> extraData;
  public Map<String, String> loggingExtras;
  public final LoginClient.Request request;
  public final AccessToken token;
  
  private LoginClient$Result(Parcel paramParcel)
  {
    code = Code.valueOf(paramParcel.readString());
    token = ((AccessToken)paramParcel.readParcelable(AccessToken.class.getClassLoader()));
    errorMessage = paramParcel.readString();
    errorCode = paramParcel.readString();
    request = ((LoginClient.Request)paramParcel.readParcelable(LoginClient.Request.class.getClassLoader()));
    loggingExtras = Utility.readStringMapFromParcel(paramParcel);
    extraData = Utility.readStringMapFromParcel(paramParcel);
  }
  
  public LoginClient$Result(LoginClient.Request paramRequest, Code paramCode, AccessToken paramAccessToken, String paramString1, String paramString2)
  {
    Validate.notNull(paramCode, "code");
    request = paramRequest;
    token = paramAccessToken;
    errorMessage = paramString1;
    code = paramCode;
    errorCode = paramString2;
  }
  
  public static Result createCancelResult(LoginClient.Request paramRequest, String paramString)
  {
    return new Result(paramRequest, Code.CANCEL, null, paramString, null);
  }
  
  public static Result createErrorResult(LoginClient.Request paramRequest, String paramString1, String paramString2)
  {
    return createErrorResult(paramRequest, paramString1, paramString2, null);
  }
  
  public static Result createErrorResult(LoginClient.Request paramRequest, String paramString1, String paramString2, String paramString3)
  {
    paramString1 = TextUtils.join(": ", Utility.asListNoNulls(new String[] { paramString1, paramString2 }));
    return new Result(paramRequest, Code.ERROR, null, paramString1, paramString3);
  }
  
  public static Result createTokenResult(LoginClient.Request paramRequest, AccessToken paramAccessToken)
  {
    return new Result(paramRequest, Code.SUCCESS, paramAccessToken, null, null);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(code.name());
    paramParcel.writeParcelable(token, paramInt);
    paramParcel.writeString(errorMessage);
    paramParcel.writeString(errorCode);
    paramParcel.writeParcelable(request, paramInt);
    Utility.writeStringMapToParcel(paramParcel, loggingExtras);
    Utility.writeStringMapToParcel(paramParcel, extraData);
  }
  
  public static enum Code
  {
    private final String loggingValue;
    
    static
    {
      Code localCode1 = new Code("SUCCESS", 0, "success");
      SUCCESS = localCode1;
      Code localCode2 = new Code("CANCEL", 1, "cancel");
      CANCEL = localCode2;
      Code localCode3 = new Code("ERROR", 2, "error");
      ERROR = localCode3;
      $VALUES = new Code[] { localCode1, localCode2, localCode3 };
    }
    
    private Code(String paramString)
    {
      loggingValue = paramString;
    }
    
    public String getLoggingValue()
    {
      return loggingValue;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.LoginClient.Result
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */