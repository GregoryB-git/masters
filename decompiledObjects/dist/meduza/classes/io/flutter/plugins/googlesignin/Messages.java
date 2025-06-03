package io.flutter.plugins.googlesignin;

import android.util.Log;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class Messages
{
  public static ArrayList<Object> wrapError(Throwable paramThrowable)
  {
    ArrayList localArrayList = new ArrayList(3);
    if ((paramThrowable instanceof FlutterError))
    {
      paramThrowable = (FlutterError)paramThrowable;
      localArrayList.add(code);
      localArrayList.add(paramThrowable.getMessage());
      paramThrowable = details;
    }
    else
    {
      localArrayList.add(paramThrowable.toString());
      localArrayList.add(paramThrowable.getClass().getSimpleName());
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Cause: ");
      localStringBuilder.append(paramThrowable.getCause());
      localStringBuilder.append(", Stacktrace: ");
      localStringBuilder.append(Log.getStackTraceString(paramThrowable));
      paramThrowable = localStringBuilder.toString();
    }
    localArrayList.add(paramThrowable);
    return localArrayList;
  }
  
  public static class FlutterError
    extends RuntimeException
  {
    public final String code;
    public final Object details;
    
    public FlutterError(String paramString1, String paramString2, Object paramObject)
    {
      super();
      code = paramString1;
      details = paramObject;
    }
  }
  
  public static abstract interface GoogleSignInApi
  {
    public abstract void clearAuthCache(String paramString, Messages.Result<Void> paramResult);
    
    public abstract void disconnect(Messages.Result<Void> paramResult);
    
    public abstract void getAccessToken(String paramString, Boolean paramBoolean, Messages.Result<String> paramResult);
    
    public abstract void init(Messages.InitParams paramInitParams);
    
    public abstract Boolean isSignedIn();
    
    public abstract void requestScopes(List<String> paramList, Messages.Result<Boolean> paramResult);
    
    public abstract void signIn(Messages.Result<Messages.UserData> paramResult);
    
    public abstract void signInSilently(Messages.Result<Messages.UserData> paramResult);
    
    public abstract void signOut(Messages.Result<Void> paramResult);
  }
  
  public static class GoogleSignInApiCodec
    extends StandardMessageCodec
  {
    public static final GoogleSignInApiCodec INSTANCE = new GoogleSignInApiCodec();
    
    public Object readValueOfType(byte paramByte, ByteBuffer paramByteBuffer)
    {
      if (paramByte != Byte.MIN_VALUE)
      {
        if (paramByte != -127) {
          return super.readValueOfType(paramByte, paramByteBuffer);
        }
        return Messages.UserData.fromList((ArrayList)readValue(paramByteBuffer));
      }
      return Messages.InitParams.fromList((ArrayList)readValue(paramByteBuffer));
    }
    
    public void writeValue(ByteArrayOutputStream paramByteArrayOutputStream, Object paramObject)
    {
      if ((paramObject instanceof Messages.InitParams)) {
        paramByteArrayOutputStream.write(128);
      }
      for (paramObject = ((Messages.InitParams)paramObject).toList();; paramObject = ((Messages.UserData)paramObject).toList())
      {
        writeValue(paramByteArrayOutputStream, paramObject);
        return;
        if (!(paramObject instanceof Messages.UserData)) {
          break;
        }
        paramByteArrayOutputStream.write(129);
      }
      super.writeValue(paramByteArrayOutputStream, paramObject);
    }
  }
  
  public static final class InitParams
  {
    private String clientId;
    private Boolean forceCodeForRefreshToken;
    private String hostedDomain;
    private List<String> scopes;
    private String serverClientId;
    private Messages.SignInType signInType;
    
    public static InitParams fromList(ArrayList<Object> paramArrayList)
    {
      InitParams localInitParams = new InitParams();
      localInitParams.setScopes((List)paramArrayList.get(0));
      Object localObject = paramArrayList.get(1);
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = Messages.SignInType.values()[((Integer)localObject).intValue()];
      }
      localInitParams.setSignInType((Messages.SignInType)localObject);
      localInitParams.setHostedDomain((String)paramArrayList.get(2));
      localInitParams.setClientId((String)paramArrayList.get(3));
      localInitParams.setServerClientId((String)paramArrayList.get(4));
      localInitParams.setForceCodeForRefreshToken((Boolean)paramArrayList.get(5));
      return localInitParams;
    }
    
    public String getClientId()
    {
      return clientId;
    }
    
    public Boolean getForceCodeForRefreshToken()
    {
      return forceCodeForRefreshToken;
    }
    
    public String getHostedDomain()
    {
      return hostedDomain;
    }
    
    public List<String> getScopes()
    {
      return scopes;
    }
    
    public String getServerClientId()
    {
      return serverClientId;
    }
    
    public Messages.SignInType getSignInType()
    {
      return signInType;
    }
    
    public void setClientId(String paramString)
    {
      clientId = paramString;
    }
    
    public void setForceCodeForRefreshToken(Boolean paramBoolean)
    {
      if (paramBoolean != null)
      {
        forceCodeForRefreshToken = paramBoolean;
        return;
      }
      throw new IllegalStateException("Nonnull field \"forceCodeForRefreshToken\" is null.");
    }
    
    public void setHostedDomain(String paramString)
    {
      hostedDomain = paramString;
    }
    
    public void setScopes(List<String> paramList)
    {
      if (paramList != null)
      {
        scopes = paramList;
        return;
      }
      throw new IllegalStateException("Nonnull field \"scopes\" is null.");
    }
    
    public void setServerClientId(String paramString)
    {
      serverClientId = paramString;
    }
    
    public void setSignInType(Messages.SignInType paramSignInType)
    {
      if (paramSignInType != null)
      {
        signInType = paramSignInType;
        return;
      }
      throw new IllegalStateException("Nonnull field \"signInType\" is null.");
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(6);
      localArrayList.add(scopes);
      Object localObject = signInType;
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = Integer.valueOf(index);
      }
      localArrayList.add(localObject);
      localArrayList.add(hostedDomain);
      localArrayList.add(clientId);
      localArrayList.add(serverClientId);
      localArrayList.add(forceCodeForRefreshToken);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private String clientId;
      private Boolean forceCodeForRefreshToken;
      private String hostedDomain;
      private List<String> scopes;
      private String serverClientId;
      private Messages.SignInType signInType;
      
      public Messages.InitParams build()
      {
        Messages.InitParams localInitParams = new Messages.InitParams();
        localInitParams.setScopes(scopes);
        localInitParams.setSignInType(signInType);
        localInitParams.setHostedDomain(hostedDomain);
        localInitParams.setClientId(clientId);
        localInitParams.setServerClientId(serverClientId);
        localInitParams.setForceCodeForRefreshToken(forceCodeForRefreshToken);
        return localInitParams;
      }
      
      public Builder setClientId(String paramString)
      {
        clientId = paramString;
        return this;
      }
      
      public Builder setForceCodeForRefreshToken(Boolean paramBoolean)
      {
        forceCodeForRefreshToken = paramBoolean;
        return this;
      }
      
      public Builder setHostedDomain(String paramString)
      {
        hostedDomain = paramString;
        return this;
      }
      
      public Builder setScopes(List<String> paramList)
      {
        scopes = paramList;
        return this;
      }
      
      public Builder setServerClientId(String paramString)
      {
        serverClientId = paramString;
        return this;
      }
      
      public Builder setSignInType(Messages.SignInType paramSignInType)
      {
        signInType = paramSignInType;
        return this;
      }
    }
  }
  
  public static abstract interface Result<T>
  {
    public abstract void error(Throwable paramThrowable);
    
    public abstract void success(T paramT);
  }
  
  public static enum SignInType
  {
    public final int index;
    
    static
    {
      GAMES = new SignInType("GAMES", 1, 1);
    }
    
    private SignInType(int paramInt)
    {
      index = paramInt;
    }
  }
  
  public static final class UserData
  {
    private String displayName;
    private String email;
    private String id;
    private String idToken;
    private String photoUrl;
    private String serverAuthCode;
    
    public static UserData fromList(ArrayList<Object> paramArrayList)
    {
      UserData localUserData = new UserData();
      localUserData.setDisplayName((String)paramArrayList.get(0));
      localUserData.setEmail((String)paramArrayList.get(1));
      localUserData.setId((String)paramArrayList.get(2));
      localUserData.setPhotoUrl((String)paramArrayList.get(3));
      localUserData.setIdToken((String)paramArrayList.get(4));
      localUserData.setServerAuthCode((String)paramArrayList.get(5));
      return localUserData;
    }
    
    public String getDisplayName()
    {
      return displayName;
    }
    
    public String getEmail()
    {
      return email;
    }
    
    public String getId()
    {
      return id;
    }
    
    public String getIdToken()
    {
      return idToken;
    }
    
    public String getPhotoUrl()
    {
      return photoUrl;
    }
    
    public String getServerAuthCode()
    {
      return serverAuthCode;
    }
    
    public void setDisplayName(String paramString)
    {
      displayName = paramString;
    }
    
    public void setEmail(String paramString)
    {
      if (paramString != null)
      {
        email = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"email\" is null.");
    }
    
    public void setId(String paramString)
    {
      if (paramString != null)
      {
        id = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"id\" is null.");
    }
    
    public void setIdToken(String paramString)
    {
      idToken = paramString;
    }
    
    public void setPhotoUrl(String paramString)
    {
      photoUrl = paramString;
    }
    
    public void setServerAuthCode(String paramString)
    {
      serverAuthCode = paramString;
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(6);
      localArrayList.add(displayName);
      localArrayList.add(email);
      localArrayList.add(id);
      localArrayList.add(photoUrl);
      localArrayList.add(idToken);
      localArrayList.add(serverAuthCode);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private String displayName;
      private String email;
      private String id;
      private String idToken;
      private String photoUrl;
      private String serverAuthCode;
      
      public Messages.UserData build()
      {
        Messages.UserData localUserData = new Messages.UserData();
        localUserData.setDisplayName(displayName);
        localUserData.setEmail(email);
        localUserData.setId(id);
        localUserData.setPhotoUrl(photoUrl);
        localUserData.setIdToken(idToken);
        localUserData.setServerAuthCode(serverAuthCode);
        return localUserData;
      }
      
      public Builder setDisplayName(String paramString)
      {
        displayName = paramString;
        return this;
      }
      
      public Builder setEmail(String paramString)
      {
        email = paramString;
        return this;
      }
      
      public Builder setId(String paramString)
      {
        id = paramString;
        return this;
      }
      
      public Builder setIdToken(String paramString)
      {
        idToken = paramString;
        return this;
      }
      
      public Builder setPhotoUrl(String paramString)
      {
        photoUrl = paramString;
        return this;
      }
      
      public Builder setServerAuthCode(String paramString)
      {
        serverAuthCode = paramString;
        return this;
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.googlesignin.Messages
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */