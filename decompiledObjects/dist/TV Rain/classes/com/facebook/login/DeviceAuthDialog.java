package com.facebook.login;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphRequestAsyncTask;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.common.R.id;
import com.facebook.common.R.layout;
import com.facebook.common.R.string;
import com.facebook.common.R.style;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.facebook.internal.Utility;
import com.facebook.internal.Utility.PermissionsLists;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.AbstractCollection;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import z2;

public class DeviceAuthDialog
  extends DialogFragment
{
  private static final String DEVICE_LOGIN_ENDPOINT = "device/login";
  private static final String DEVICE_LOGIN_STATUS_ENDPOINT = "device/login_status";
  private static final int LOGIN_ERROR_SUBCODE_AUTHORIZATION_DECLINED = 1349173;
  private static final int LOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING = 1349174;
  private static final int LOGIN_ERROR_SUBCODE_CODE_EXPIRED = 1349152;
  private static final int LOGIN_ERROR_SUBCODE_EXCESSIVE_POLLING = 1349172;
  private static final String REQUEST_STATE_KEY = "request_state";
  private AtomicBoolean completed = new AtomicBoolean();
  private TextView confirmationCode;
  private volatile GraphRequestAsyncTask currentGraphRequestPoll;
  private volatile RequestState currentRequestState;
  private DeviceAuthMethodHandler deviceAuthMethodHandler;
  private Dialog dialog;
  private TextView instructions;
  private boolean isBeingDestroyed = false;
  private boolean isRetry = false;
  private LoginClient.Request mRequest = null;
  private View progressBar;
  private volatile ScheduledFuture scheduledPoll;
  
  private void completeLogin(String paramString1, Utility.PermissionsLists paramPermissionsLists, String paramString2, Date paramDate1, Date paramDate2)
  {
    deviceAuthMethodHandler.onSuccess(paramString2, FacebookSdk.getApplicationId(), paramString1, paramPermissionsLists.getGrantedPermissions(), paramPermissionsLists.getDeclinedPermissions(), paramPermissionsLists.getExpiredPermissions(), AccessTokenSource.DEVICE_AUTH, paramDate1, null, paramDate2);
    dialog.dismiss();
  }
  
  private GraphRequest getPollRequest()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("code", currentRequestState.getRequestCode());
    new GraphRequest(null, "device/login_status", localBundle, HttpMethod.POST, new GraphRequest.Callback()
    {
      public void onCompleted(GraphResponse paramAnonymousGraphResponse)
      {
        if (DeviceAuthDialog.access$300(DeviceAuthDialog.this).get()) {
          return;
        }
        FacebookRequestError localFacebookRequestError = paramAnonymousGraphResponse.getError();
        if (localFacebookRequestError != null)
        {
          int i = localFacebookRequestError.getSubErrorCode();
          if (i != 1349152)
          {
            switch (i)
            {
            default: 
              onError(paramAnonymousGraphResponse.getError().getException());
              break;
            case 1349173: 
              onCancel();
              break;
            case 1349172: 
            case 1349174: 
              DeviceAuthDialog.access$400(DeviceAuthDialog.this);
              break;
            }
          }
          else
          {
            if (DeviceAuthDialog.access$500(DeviceAuthDialog.this) != null) {
              DeviceRequestsHelper.cleanUpAdvertisementService(DeviceAuthDialog.access$500(DeviceAuthDialog.this).getUserCode());
            }
            if (DeviceAuthDialog.access$600(DeviceAuthDialog.this) != null)
            {
              paramAnonymousGraphResponse = DeviceAuthDialog.this;
              paramAnonymousGraphResponse.startLogin(DeviceAuthDialog.access$600(paramAnonymousGraphResponse));
            }
            else
            {
              onCancel();
            }
          }
          return;
        }
        try
        {
          paramAnonymousGraphResponse = paramAnonymousGraphResponse.getJSONObject();
          DeviceAuthDialog.access$700(DeviceAuthDialog.this, paramAnonymousGraphResponse.getString("access_token"), Long.valueOf(paramAnonymousGraphResponse.getLong("expires_in")), Long.valueOf(paramAnonymousGraphResponse.optLong("data_access_expiration_time")));
        }
        catch (JSONException paramAnonymousGraphResponse)
        {
          onError(new FacebookException(paramAnonymousGraphResponse));
        }
      }
    });
  }
  
  private void onSuccess(final String paramString, final Long paramLong1, Long paramLong2)
  {
    Bundle localBundle = z2.d("fields", "id,permissions,name");
    long l = paramLong1.longValue();
    final Date localDate = null;
    if (l != 0L)
    {
      l = new Date().getTime();
      paramLong1 = new Date(paramLong1.longValue() * 1000L + l);
    }
    else
    {
      paramLong1 = null;
    }
    if (paramLong2.longValue() != 0L) {
      localDate = new Date(paramLong2.longValue() * 1000L);
    }
    new GraphRequest(new AccessToken(paramString, FacebookSdk.getApplicationId(), "0", null, null, null, null, paramLong1, null, localDate), "me", localBundle, HttpMethod.GET, new GraphRequest.Callback()
    {
      public void onCompleted(GraphResponse paramAnonymousGraphResponse)
      {
        if (DeviceAuthDialog.access$300(DeviceAuthDialog.this).get()) {
          return;
        }
        if (paramAnonymousGraphResponse.getError() != null)
        {
          onError(paramAnonymousGraphResponse.getError().getException());
          return;
        }
        try
        {
          Object localObject = paramAnonymousGraphResponse.getJSONObject();
          String str = ((JSONObject)localObject).getString("id");
          paramAnonymousGraphResponse = Utility.handlePermissionResponse((JSONObject)localObject);
          localObject = ((JSONObject)localObject).getString("name");
          DeviceRequestsHelper.cleanUpAdvertisementService(DeviceAuthDialog.access$500(DeviceAuthDialog.this).getUserCode());
          if ((FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId()).getSmartLoginOptions().contains(SmartLoginOption.RequireConfirm)) && (!DeviceAuthDialog.access$1000(DeviceAuthDialog.this)))
          {
            DeviceAuthDialog.access$1002(DeviceAuthDialog.this, true);
            DeviceAuthDialog.access$1100(DeviceAuthDialog.this, str, paramAnonymousGraphResponse, paramString, (String)localObject, paramLong1, localDate);
            return;
          }
          DeviceAuthDialog.access$900(DeviceAuthDialog.this, str, paramAnonymousGraphResponse, paramString, paramLong1, localDate);
          return;
        }
        catch (JSONException paramAnonymousGraphResponse)
        {
          onError(new FacebookException(paramAnonymousGraphResponse));
        }
      }
    }).executeAsync();
  }
  
  private void poll()
  {
    currentRequestState.setLastPoll(new Date().getTime());
    currentGraphRequestPoll = getPollRequest().executeAsync();
  }
  
  private void presentConfirmation(final String paramString1, final Utility.PermissionsLists paramPermissionsLists, final String paramString2, String paramString3, final Date paramDate1, final Date paramDate2)
  {
    String str1 = getResources().getString(R.string.com_facebook_smart_login_confirmation_title);
    String str2 = getResources().getString(R.string.com_facebook_smart_login_confirmation_continue_as);
    String str3 = getResources().getString(R.string.com_facebook_smart_login_confirmation_cancel);
    str2 = String.format(str2, new Object[] { paramString3 });
    paramString3 = new AlertDialog.Builder(getContext());
    paramString3.setMessage(str1).setCancelable(true).setNegativeButton(str2, new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        DeviceAuthDialog.access$900(DeviceAuthDialog.this, paramString1, paramPermissionsLists, paramString2, paramDate1, paramDate2);
      }
    }).setPositiveButton(str3, new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface = initializeContentView(false);
        DeviceAuthDialog.access$800(DeviceAuthDialog.this).setContentView(paramAnonymousDialogInterface);
        paramAnonymousDialogInterface = DeviceAuthDialog.this;
        paramAnonymousDialogInterface.startLogin(DeviceAuthDialog.access$600(paramAnonymousDialogInterface));
      }
    });
    paramString3.create().show();
  }
  
  private void schedulePoll()
  {
    scheduledPoll = DeviceAuthMethodHandler.getBackgroundExecutor().schedule(new Runnable()
    {
      public void run()
      {
        if (CrashShieldHandler.isObjectCrashing(this)) {
          return;
        }
        try
        {
          DeviceAuthDialog.access$200(DeviceAuthDialog.this);
          return;
        }
        finally
        {
          CrashShieldHandler.handleThrowable(localThrowable, this);
        }
      }
    }, currentRequestState.getInterval(), TimeUnit.SECONDS);
  }
  
  private void setCurrentRequestState(RequestState paramRequestState)
  {
    currentRequestState = paramRequestState;
    confirmationCode.setText(paramRequestState.getUserCode());
    Object localObject = DeviceRequestsHelper.generateQRCode(paramRequestState.getAuthorizationUri());
    localObject = new BitmapDrawable(getResources(), (Bitmap)localObject);
    instructions.setCompoundDrawablesWithIntrinsicBounds(null, (Drawable)localObject, null, null);
    confirmationCode.setVisibility(0);
    progressBar.setVisibility(8);
    if ((!isRetry) && (DeviceRequestsHelper.startAdvertisementService(paramRequestState.getUserCode()))) {
      new InternalAppEventsLogger(getContext()).logEventImplicitly("fb_smart_login_service");
    }
    if (paramRequestState.withinLastRefreshWindow()) {
      schedulePoll();
    } else {
      poll();
    }
  }
  
  @LayoutRes
  public int getLayoutResId(boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = R.layout.com_facebook_smart_device_dialog_fragment;
    } else {
      i = R.layout.com_facebook_device_auth_dialog_fragment;
    }
    return i;
  }
  
  public View initializeContentView(boolean paramBoolean)
  {
    View localView = getActivity().getLayoutInflater().inflate(getLayoutResId(paramBoolean), null);
    progressBar = localView.findViewById(R.id.progress_bar);
    confirmationCode = ((TextView)localView.findViewById(R.id.confirmation_code));
    ((Button)localView.findViewById(R.id.cancel_button)).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (CrashShieldHandler.isObjectCrashing(this)) {
          return;
        }
        try
        {
          onCancel();
          return;
        }
        finally
        {
          CrashShieldHandler.handleThrowable(paramAnonymousView, this);
        }
      }
    });
    TextView localTextView = (TextView)localView.findViewById(R.id.com_facebook_device_auth_instructions);
    instructions = localTextView;
    localTextView.setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
    return localView;
  }
  
  public void onCancel()
  {
    if (!completed.compareAndSet(false, true)) {
      return;
    }
    if (currentRequestState != null) {
      DeviceRequestsHelper.cleanUpAdvertisementService(currentRequestState.getUserCode());
    }
    DeviceAuthMethodHandler localDeviceAuthMethodHandler = deviceAuthMethodHandler;
    if (localDeviceAuthMethodHandler != null) {
      localDeviceAuthMethodHandler.onCancel();
    }
    dialog.dismiss();
  }
  
  @NonNull
  public Dialog onCreateDialog(Bundle paramBundle)
  {
    dialog = new Dialog(getActivity(), R.style.com_facebook_auth_dialog);
    boolean bool;
    if ((DeviceRequestsHelper.isAvailable()) && (!isRetry)) {
      bool = true;
    } else {
      bool = false;
    }
    paramBundle = initializeContentView(bool);
    dialog.setContentView(paramBundle);
    return dialog;
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    deviceAuthMethodHandler = ((DeviceAuthMethodHandler)((LoginFragment)((FacebookActivity)getActivity()).getCurrentFragment()).getLoginClient().getCurrentHandler());
    if (paramBundle != null)
    {
      paramViewGroup = (RequestState)paramBundle.getParcelable("request_state");
      if (paramViewGroup != null) {
        setCurrentRequestState(paramViewGroup);
      }
    }
    return paramLayoutInflater;
  }
  
  public void onDestroyView()
  {
    isBeingDestroyed = true;
    completed.set(true);
    super.onDestroyView();
    if (currentGraphRequestPoll != null) {
      currentGraphRequestPoll.cancel(true);
    }
    if (scheduledPoll != null) {
      scheduledPoll.cancel(true);
    }
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    super.onDismiss(paramDialogInterface);
    if (!isBeingDestroyed) {
      onCancel();
    }
  }
  
  public void onError(FacebookException paramFacebookException)
  {
    if (!completed.compareAndSet(false, true)) {
      return;
    }
    if (currentRequestState != null) {
      DeviceRequestsHelper.cleanUpAdvertisementService(currentRequestState.getUserCode());
    }
    deviceAuthMethodHandler.onError(paramFacebookException);
    dialog.dismiss();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (currentRequestState != null) {
      paramBundle.putParcelable("request_state", currentRequestState);
    }
  }
  
  public void startLogin(LoginClient.Request paramRequest)
  {
    mRequest = paramRequest;
    Bundle localBundle = new Bundle();
    localBundle.putString("scope", TextUtils.join(",", paramRequest.getPermissions()));
    String str = paramRequest.getDeviceRedirectUriString();
    if (str != null) {
      localBundle.putString("redirect_uri", str);
    }
    paramRequest = paramRequest.getDeviceAuthTargetUserId();
    if (paramRequest != null) {
      localBundle.putString("target_user_id", paramRequest);
    }
    paramRequest = new StringBuilder();
    paramRequest.append(Validate.hasAppID());
    paramRequest.append("|");
    paramRequest.append(Validate.hasClientToken());
    localBundle.putString("access_token", paramRequest.toString());
    localBundle.putString("device_info", DeviceRequestsHelper.getDeviceInfo());
    new GraphRequest(null, "device/login", localBundle, HttpMethod.POST, new GraphRequest.Callback()
    {
      public void onCompleted(GraphResponse paramAnonymousGraphResponse)
      {
        if (DeviceAuthDialog.access$000(DeviceAuthDialog.this)) {
          return;
        }
        if (paramAnonymousGraphResponse.getError() != null)
        {
          onError(paramAnonymousGraphResponse.getError().getException());
          return;
        }
        paramAnonymousGraphResponse = paramAnonymousGraphResponse.getJSONObject();
        DeviceAuthDialog.RequestState localRequestState = new DeviceAuthDialog.RequestState();
        try
        {
          localRequestState.setUserCode(paramAnonymousGraphResponse.getString("user_code"));
          localRequestState.setRequestCode(paramAnonymousGraphResponse.getString("code"));
          localRequestState.setInterval(paramAnonymousGraphResponse.getLong("interval"));
          DeviceAuthDialog.access$100(DeviceAuthDialog.this, localRequestState);
          return;
        }
        catch (JSONException paramAnonymousGraphResponse)
        {
          onError(new FacebookException(paramAnonymousGraphResponse));
        }
      }
    }).executeAsync();
  }
  
  public static class RequestState
    implements Parcelable
  {
    public static final Parcelable.Creator<RequestState> CREATOR = new Parcelable.Creator()
    {
      public DeviceAuthDialog.RequestState createFromParcel(Parcel paramAnonymousParcel)
      {
        return new DeviceAuthDialog.RequestState(paramAnonymousParcel);
      }
      
      public DeviceAuthDialog.RequestState[] newArray(int paramAnonymousInt)
      {
        return new DeviceAuthDialog.RequestState[paramAnonymousInt];
      }
    };
    private String authorizationUri;
    private long interval;
    private long lastPoll;
    private String requestCode;
    private String userCode;
    
    public RequestState() {}
    
    public RequestState(Parcel paramParcel)
    {
      authorizationUri = paramParcel.readString();
      userCode = paramParcel.readString();
      requestCode = paramParcel.readString();
      interval = paramParcel.readLong();
      lastPoll = paramParcel.readLong();
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public String getAuthorizationUri()
    {
      return authorizationUri;
    }
    
    public long getInterval()
    {
      return interval;
    }
    
    public String getRequestCode()
    {
      return requestCode;
    }
    
    public String getUserCode()
    {
      return userCode;
    }
    
    public void setInterval(long paramLong)
    {
      interval = paramLong;
    }
    
    public void setLastPoll(long paramLong)
    {
      lastPoll = paramLong;
    }
    
    public void setRequestCode(String paramString)
    {
      requestCode = paramString;
    }
    
    public void setUserCode(String paramString)
    {
      userCode = paramString;
      authorizationUri = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", new Object[] { paramString });
    }
    
    public boolean withinLastRefreshWindow()
    {
      long l = lastPoll;
      boolean bool = false;
      if (l == 0L) {
        return false;
      }
      if (new Date().getTime() - lastPoll - interval * 1000L < 0L) {
        bool = true;
      }
      return bool;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(authorizationUri);
      paramParcel.writeString(userCode);
      paramParcel.writeString(requestCode);
      paramParcel.writeLong(interval);
      paramParcel.writeLong(lastPoll);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.DeviceAuthDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */