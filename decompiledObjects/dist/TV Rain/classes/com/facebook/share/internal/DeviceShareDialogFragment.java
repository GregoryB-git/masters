package com.facebook.share.internal;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.common.R.id;
import com.facebook.common.R.layout;
import com.facebook.common.R.string;
import com.facebook.common.R.style;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public class DeviceShareDialogFragment
  extends DialogFragment
{
  private static final String DEVICE_SHARE_ENDPOINT = "device/share";
  private static final String EXTRA_ERROR = "error";
  private static final String REQUEST_STATE_KEY = "request_state";
  public static final String TAG = "DeviceShareDialogFragment";
  private static ScheduledThreadPoolExecutor backgroundExecutor;
  private volatile ScheduledFuture codeExpiredFuture;
  private TextView confirmationCode;
  private volatile RequestState currentRequestState;
  private Dialog dialog;
  private ProgressBar progressBar;
  private ShareContent shareContent;
  
  private void detach()
  {
    if (isAdded()) {
      getFragmentManager().beginTransaction().remove(this).commit();
    }
  }
  
  private void finishActivity(int paramInt, Intent paramIntent)
  {
    if (currentRequestState != null) {
      DeviceRequestsHelper.cleanUpAdvertisementService(currentRequestState.getUserCode());
    }
    Object localObject = (FacebookRequestError)paramIntent.getParcelableExtra("error");
    if (localObject != null) {
      Toast.makeText(getContext(), ((FacebookRequestError)localObject).getErrorMessage(), 0).show();
    }
    if (isAdded())
    {
      localObject = getActivity();
      ((Activity)localObject).setResult(paramInt, paramIntent);
      ((Activity)localObject).finish();
    }
  }
  
  private void finishActivityWithError(FacebookRequestError paramFacebookRequestError)
  {
    detach();
    Intent localIntent = new Intent();
    localIntent.putExtra("error", paramFacebookRequestError);
    finishActivity(-1, localIntent);
  }
  
  private static ScheduledThreadPoolExecutor getBackgroundExecutor()
  {
    try
    {
      if (backgroundExecutor == null)
      {
        localScheduledThreadPoolExecutor = new java/util/concurrent/ScheduledThreadPoolExecutor;
        localScheduledThreadPoolExecutor.<init>(1);
        backgroundExecutor = localScheduledThreadPoolExecutor;
      }
      ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = backgroundExecutor;
      return localScheduledThreadPoolExecutor;
    }
    finally {}
  }
  
  private Bundle getGraphParametersForShareContent()
  {
    ShareContent localShareContent = shareContent;
    if (localShareContent == null) {
      return null;
    }
    if ((localShareContent instanceof ShareLinkContent)) {
      return WebDialogParameters.create((ShareLinkContent)localShareContent);
    }
    if ((localShareContent instanceof ShareOpenGraphContent)) {
      return WebDialogParameters.create((ShareOpenGraphContent)localShareContent);
    }
    return null;
  }
  
  private void setCurrentRequestState(RequestState paramRequestState)
  {
    currentRequestState = paramRequestState;
    confirmationCode.setText(paramRequestState.getUserCode());
    confirmationCode.setVisibility(0);
    progressBar.setVisibility(8);
    codeExpiredFuture = getBackgroundExecutor().schedule(new Runnable()
    {
      public void run()
      {
        if (CrashShieldHandler.isObjectCrashing(this)) {
          return;
        }
        try
        {
          DeviceShareDialogFragment.access$000(DeviceShareDialogFragment.this).dismiss();
          return;
        }
        finally
        {
          CrashShieldHandler.handleThrowable(localThrowable, this);
        }
      }
    }, paramRequestState.getExpiresIn(), TimeUnit.SECONDS);
  }
  
  private void startShare()
  {
    Bundle localBundle = getGraphParametersForShareContent();
    if ((localBundle == null) || (localBundle.size() == 0)) {
      finishActivityWithError(new FacebookRequestError(0, "", "Failed to get share content"));
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(Validate.hasAppID());
    localStringBuilder.append("|");
    localStringBuilder.append(Validate.hasClientToken());
    localBundle.putString("access_token", localStringBuilder.toString());
    localBundle.putString("device_info", DeviceRequestsHelper.getDeviceInfo());
    new GraphRequest(null, "device/share", localBundle, HttpMethod.POST, new GraphRequest.Callback()
    {
      public void onCompleted(GraphResponse paramAnonymousGraphResponse)
      {
        Object localObject = paramAnonymousGraphResponse.getError();
        if (localObject != null)
        {
          DeviceShareDialogFragment.access$100(DeviceShareDialogFragment.this, (FacebookRequestError)localObject);
          return;
        }
        paramAnonymousGraphResponse = paramAnonymousGraphResponse.getJSONObject();
        localObject = new DeviceShareDialogFragment.RequestState();
        try
        {
          ((DeviceShareDialogFragment.RequestState)localObject).setUserCode(paramAnonymousGraphResponse.getString("user_code"));
          ((DeviceShareDialogFragment.RequestState)localObject).setExpiresIn(paramAnonymousGraphResponse.getLong("expires_in"));
          DeviceShareDialogFragment.access$200(DeviceShareDialogFragment.this, (DeviceShareDialogFragment.RequestState)localObject);
          return;
        }
        catch (JSONException paramAnonymousGraphResponse)
        {
          DeviceShareDialogFragment.access$100(DeviceShareDialogFragment.this, new FacebookRequestError(0, "", "Malformed server response"));
        }
      }
    }).executeAsync();
  }
  
  @NonNull
  public Dialog onCreateDialog(Bundle paramBundle)
  {
    dialog = new Dialog(getActivity(), R.style.com_facebook_auth_dialog);
    paramBundle = getActivity().getLayoutInflater().inflate(R.layout.com_facebook_device_auth_dialog_fragment, null);
    progressBar = ((ProgressBar)paramBundle.findViewById(R.id.progress_bar));
    confirmationCode = ((TextView)paramBundle.findViewById(R.id.confirmation_code));
    ((Button)paramBundle.findViewById(R.id.cancel_button)).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (CrashShieldHandler.isObjectCrashing(this)) {
          return;
        }
        try
        {
          DeviceShareDialogFragment.access$000(DeviceShareDialogFragment.this).dismiss();
          return;
        }
        finally
        {
          CrashShieldHandler.handleThrowable(paramAnonymousView, this);
        }
      }
    });
    ((TextView)paramBundle.findViewById(R.id.com_facebook_device_auth_instructions)).setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
    dialog.setContentView(paramBundle);
    startShare();
    return dialog;
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    if (paramBundle != null)
    {
      paramViewGroup = (RequestState)paramBundle.getParcelable("request_state");
      if (paramViewGroup != null) {
        setCurrentRequestState(paramViewGroup);
      }
    }
    return paramLayoutInflater;
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    super.onDismiss(paramDialogInterface);
    if (codeExpiredFuture != null) {
      codeExpiredFuture.cancel(true);
    }
    finishActivity(-1, new Intent());
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (currentRequestState != null) {
      paramBundle.putParcelable("request_state", currentRequestState);
    }
  }
  
  public void setShareContent(ShareContent paramShareContent)
  {
    shareContent = paramShareContent;
  }
  
  public static class RequestState
    implements Parcelable
  {
    public static final Parcelable.Creator<RequestState> CREATOR = new Parcelable.Creator()
    {
      public DeviceShareDialogFragment.RequestState createFromParcel(Parcel paramAnonymousParcel)
      {
        return new DeviceShareDialogFragment.RequestState(paramAnonymousParcel);
      }
      
      public DeviceShareDialogFragment.RequestState[] newArray(int paramAnonymousInt)
      {
        return new DeviceShareDialogFragment.RequestState[paramAnonymousInt];
      }
    };
    private long expiresIn;
    private String userCode;
    
    public RequestState() {}
    
    public RequestState(Parcel paramParcel)
    {
      userCode = paramParcel.readString();
      expiresIn = paramParcel.readLong();
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public long getExpiresIn()
    {
      return expiresIn;
    }
    
    public String getUserCode()
    {
      return userCode;
    }
    
    public void setExpiresIn(long paramLong)
    {
      expiresIn = paramLong;
    }
    
    public void setUserCode(String paramString)
    {
      userCode = paramString;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(userCode);
      paramParcel.writeLong(expiresIn);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.DeviceShareDialogFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */