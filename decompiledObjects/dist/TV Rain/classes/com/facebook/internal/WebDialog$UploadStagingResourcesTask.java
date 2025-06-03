package com.facebook.internal;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.BaseBundle;
import android.os.Bundle;
import android.widget.ImageView;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.internal.ShareInternalUtility;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

class WebDialog$UploadStagingResourcesTask
  extends AsyncTask<Void, Void, String[]>
{
  private String action;
  private Exception[] exceptions;
  private Bundle parameters;
  
  public WebDialog$UploadStagingResourcesTask(WebDialog paramWebDialog, String paramString, Bundle paramBundle)
  {
    action = paramString;
    parameters = paramBundle;
  }
  
  public String[] doInBackground(Void... paramVarArgs)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      String[] arrayOfString1 = parameters.getStringArray("media");
      String[] arrayOfString2 = new String[arrayOfString1.length];
      exceptions = new Exception[arrayOfString1.length];
      Object localObject = new java/util/concurrent/CountDownLatch;
      ((CountDownLatch)localObject).<init>(arrayOfString1.length);
      paramVarArgs = new java/util/concurrent/ConcurrentLinkedQueue;
      paramVarArgs.<init>();
      AccessToken localAccessToken = AccessToken.getCurrentAccessToken();
      int i = 0;
      try
      {
        while (i < arrayOfString1.length)
        {
          if (isCancelled())
          {
            localObject = paramVarArgs.iterator();
            while (((Iterator)localObject).hasNext()) {
              ((AsyncTask)((Iterator)localObject).next()).cancel(true);
            }
            return null;
          }
          Uri localUri = Uri.parse(arrayOfString1[i]);
          if (Utility.isWebUri(localUri))
          {
            arrayOfString2[i] = localUri.toString();
            ((CountDownLatch)localObject).countDown();
          }
          else
          {
            GraphRequest.Callback local1 = new com/facebook/internal/WebDialog$UploadStagingResourcesTask$1;
            local1.<init>(this, arrayOfString2, i, (CountDownLatch)localObject);
            paramVarArgs.add(ShareInternalUtility.newUploadStagingResourceWithImageRequest(localAccessToken, localUri, local1).executeAsync());
          }
          i++;
        }
        ((CountDownLatch)localObject).await();
        return arrayOfString2;
      }
      catch (Exception localException)
      {
        paramVarArgs = paramVarArgs.iterator();
        while (paramVarArgs.hasNext()) {
          ((AsyncTask)paramVarArgs.next()).cancel(true);
        }
        return null;
      }
      return null;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramVarArgs, this);
    }
  }
  
  public void onPostExecute(String[] paramArrayOfString)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      WebDialog.access$300(this$0).dismiss();
      for (localObject2 : exceptions) {
        if (localObject2 != null)
        {
          this$0.sendErrorToListener((Throwable)localObject2);
          return;
        }
      }
      if (paramArrayOfString == null)
      {
        ??? = this$0;
        paramArrayOfString = new com/facebook/FacebookException;
        paramArrayOfString.<init>("Failed to stage photos for web dialog");
        ((WebDialog)???).sendErrorToListener(paramArrayOfString);
        return;
      }
      Object localObject2 = Arrays.asList(paramArrayOfString);
      if (((List)localObject2).contains(null))
      {
        paramArrayOfString = this$0;
        ??? = new com/facebook/FacebookException;
        ((FacebookException)???).<init>("Failed to stage photos for web dialog");
        paramArrayOfString.sendErrorToListener((Throwable)???);
        return;
      }
      paramArrayOfString = parameters;
      ??? = new org/json/JSONArray;
      ((JSONArray)???).<init>((Collection)localObject2);
      Utility.putJSONValueInBundle(paramArrayOfString, "media", ???);
      ??? = ServerProtocol.getDialogAuthority();
      paramArrayOfString = new java/lang/StringBuilder;
      paramArrayOfString.<init>();
      paramArrayOfString.append(FacebookSdk.getGraphApiVersion());
      paramArrayOfString.append("/");
      paramArrayOfString.append("dialog/");
      paramArrayOfString.append(action);
      paramArrayOfString = Utility.buildUri((String)???, paramArrayOfString.toString(), parameters);
      WebDialog.access$902(this$0, paramArrayOfString.toString());
      ??? = WebDialog.access$600(this$0).getDrawable().getIntrinsicWidth();
      WebDialog.access$1000(this$0, ??? / 2 + 1);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramArrayOfString, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.WebDialog.UploadStagingResourcesTask
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */