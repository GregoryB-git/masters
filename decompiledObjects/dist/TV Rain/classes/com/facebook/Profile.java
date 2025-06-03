package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.internal.ImageRequest;
import com.facebook.internal.Utility;
import com.facebook.internal.Utility.GraphMeRequestWithCacheCallback;
import com.facebook.internal.Validate;
import org.json.JSONException;
import org.json.JSONObject;

public final class Profile
  implements Parcelable
{
  public static final Parcelable.Creator<Profile> CREATOR = new Parcelable.Creator()
  {
    public Profile createFromParcel(Parcel paramAnonymousParcel)
    {
      return new Profile(paramAnonymousParcel, null);
    }
    
    public Profile[] newArray(int paramAnonymousInt)
    {
      return new Profile[paramAnonymousInt];
    }
  };
  private static final String FIRST_NAME_KEY = "first_name";
  private static final String ID_KEY = "id";
  private static final String LAST_NAME_KEY = "last_name";
  private static final String LINK_URI_KEY = "link_uri";
  private static final String MIDDLE_NAME_KEY = "middle_name";
  private static final String NAME_KEY = "name";
  private static final String TAG = "Profile";
  @Nullable
  private final String firstName;
  @Nullable
  private final String id;
  @Nullable
  private final String lastName;
  @Nullable
  private final Uri linkUri;
  @Nullable
  private final String middleName;
  @Nullable
  private final String name;
  
  private Profile(Parcel paramParcel)
  {
    id = paramParcel.readString();
    firstName = paramParcel.readString();
    middleName = paramParcel.readString();
    lastName = paramParcel.readString();
    name = paramParcel.readString();
    paramParcel = paramParcel.readString();
    if (paramParcel == null) {
      paramParcel = null;
    } else {
      paramParcel = Uri.parse(paramParcel);
    }
    linkUri = paramParcel;
  }
  
  public Profile(String paramString1, @Nullable String paramString2, @Nullable String paramString3, @Nullable String paramString4, @Nullable String paramString5, @Nullable Uri paramUri)
  {
    Validate.notNullOrEmpty(paramString1, "id");
    id = paramString1;
    firstName = paramString2;
    middleName = paramString3;
    lastName = paramString4;
    name = paramString5;
    linkUri = paramUri;
  }
  
  public Profile(JSONObject paramJSONObject)
  {
    Object localObject = null;
    id = paramJSONObject.optString("id", null);
    firstName = paramJSONObject.optString("first_name", null);
    middleName = paramJSONObject.optString("middle_name", null);
    lastName = paramJSONObject.optString("last_name", null);
    name = paramJSONObject.optString("name", null);
    paramJSONObject = paramJSONObject.optString("link_uri", null);
    if (paramJSONObject == null) {
      paramJSONObject = (JSONObject)localObject;
    } else {
      paramJSONObject = Uri.parse(paramJSONObject);
    }
    linkUri = paramJSONObject;
  }
  
  public static void fetchProfileForCurrentAccessToken()
  {
    AccessToken localAccessToken = AccessToken.getCurrentAccessToken();
    if (!AccessToken.isCurrentAccessTokenActive())
    {
      setCurrentProfile(null);
      return;
    }
    Utility.getGraphMeRequestWithCacheAsync(localAccessToken.getToken(), new Utility.GraphMeRequestWithCacheCallback()
    {
      public void onFailure(FacebookException paramAnonymousFacebookException)
      {
        String str = Profile.access$000();
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Got unexpected exception: ");
        localStringBuilder.append(paramAnonymousFacebookException);
        Log.e(str, localStringBuilder.toString());
      }
      
      public void onSuccess(JSONObject paramAnonymousJSONObject)
      {
        String str1 = paramAnonymousJSONObject.optString("id");
        if (str1 == null)
        {
          Log.w(Profile.access$000(), "No user ID returned on Me request");
          return;
        }
        String str2 = paramAnonymousJSONObject.optString("link");
        String str3 = paramAnonymousJSONObject.optString("first_name");
        String str4 = paramAnonymousJSONObject.optString("middle_name");
        String str5 = paramAnonymousJSONObject.optString("last_name");
        String str6 = paramAnonymousJSONObject.optString("name");
        if (str2 != null) {
          paramAnonymousJSONObject = Uri.parse(str2);
        } else {
          paramAnonymousJSONObject = null;
        }
        Profile.setCurrentProfile(new Profile(str1, str3, str4, str5, str6, paramAnonymousJSONObject));
      }
    });
  }
  
  public static Profile getCurrentProfile()
  {
    return ProfileManager.getInstance().getCurrentProfile();
  }
  
  public static void setCurrentProfile(@Nullable Profile paramProfile)
  {
    ProfileManager.getInstance().setCurrentProfile(paramProfile);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Profile)) {
      return false;
    }
    paramObject = (Profile)paramObject;
    Object localObject = id;
    if (localObject == null ? id == null : ((String)localObject).equals(id))
    {
      localObject = firstName;
      if (localObject == null ? firstName == null : ((String)localObject).equals(firstName))
      {
        localObject = middleName;
        if (localObject == null ? middleName == null : ((String)localObject).equals(middleName))
        {
          localObject = lastName;
          if (localObject == null ? lastName == null : ((String)localObject).equals(lastName))
          {
            localObject = name;
            if (localObject == null ? name == null : ((String)localObject).equals(name))
            {
              localObject = linkUri;
              paramObject = linkUri;
              if (localObject == null ? paramObject == null : ((Uri)localObject).equals(paramObject)) {
                return bool;
              }
            }
          }
        }
      }
    }
    bool = false;
    return bool;
  }
  
  public String getFirstName()
  {
    return firstName;
  }
  
  public String getId()
  {
    return id;
  }
  
  public String getLastName()
  {
    return lastName;
  }
  
  public Uri getLinkUri()
  {
    return linkUri;
  }
  
  public String getMiddleName()
  {
    return middleName;
  }
  
  public String getName()
  {
    return name;
  }
  
  public Uri getProfilePictureUri(int paramInt1, int paramInt2)
  {
    String str;
    if (AccessToken.isCurrentAccessTokenActive()) {
      str = AccessToken.getCurrentAccessToken().getToken();
    } else {
      str = "";
    }
    return ImageRequest.getProfilePictureUri(id, paramInt1, paramInt2, str);
  }
  
  public int hashCode()
  {
    int i = id.hashCode() + 527;
    Object localObject = firstName;
    int j = i;
    if (localObject != null) {
      j = i * 31 + ((String)localObject).hashCode();
    }
    localObject = middleName;
    i = j;
    if (localObject != null) {
      i = j * 31 + ((String)localObject).hashCode();
    }
    localObject = lastName;
    int k = i;
    if (localObject != null) {
      k = i * 31 + ((String)localObject).hashCode();
    }
    localObject = name;
    j = k;
    if (localObject != null) {
      j = k * 31 + ((String)localObject).hashCode();
    }
    localObject = linkUri;
    i = j;
    if (localObject != null) {
      i = j * 31 + ((Uri)localObject).hashCode();
    }
    return i;
  }
  
  public JSONObject toJSONObject()
  {
    JSONObject localJSONObject1 = new JSONObject();
    JSONObject localJSONObject3;
    try
    {
      localJSONObject1.put("id", id);
      localJSONObject1.put("first_name", firstName);
      localJSONObject1.put("middle_name", middleName);
      localJSONObject1.put("last_name", lastName);
      localJSONObject1.put("name", name);
      Uri localUri = linkUri;
      JSONObject localJSONObject2 = localJSONObject1;
      if (localUri != null)
      {
        localJSONObject1.put("link_uri", localUri.toString());
        localJSONObject2 = localJSONObject1;
      }
    }
    catch (JSONException localJSONException)
    {
      localJSONObject3 = null;
    }
    return localJSONObject3;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(id);
    paramParcel.writeString(firstName);
    paramParcel.writeString(middleName);
    paramParcel.writeString(lastName);
    paramParcel.writeString(name);
    Object localObject = linkUri;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((Uri)localObject).toString();
    }
    paramParcel.writeString((String)localObject);
  }
}

/* Location:
 * Qualified Name:     com.facebook.Profile
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */