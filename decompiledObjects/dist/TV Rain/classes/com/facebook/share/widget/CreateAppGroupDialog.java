package com.facebook.share.widget;

import android.app.Activity;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.Callback;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FacebookDialogBase.ModeHandler;
import com.facebook.internal.FragmentWrapper;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.AppGroupCreationContent;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class CreateAppGroupDialog
  extends FacebookDialogBase<AppGroupCreationContent, Result>
{
  private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.AppGroupCreate.toRequestCode();
  private static final String GAME_GROUP_CREATION_DIALOG = "game_group_create";
  
  @Deprecated
  public CreateAppGroupDialog(Activity paramActivity)
  {
    super(paramActivity, DEFAULT_REQUEST_CODE);
  }
  
  @Deprecated
  public CreateAppGroupDialog(android.app.Fragment paramFragment)
  {
    this(new FragmentWrapper(paramFragment));
  }
  
  @Deprecated
  public CreateAppGroupDialog(androidx.fragment.app.Fragment paramFragment)
  {
    this(new FragmentWrapper(paramFragment));
  }
  
  private CreateAppGroupDialog(FragmentWrapper paramFragmentWrapper)
  {
    super(paramFragmentWrapper, DEFAULT_REQUEST_CODE);
  }
  
  @Deprecated
  public static boolean canShow()
  {
    return true;
  }
  
  @Deprecated
  public static void show(Activity paramActivity, AppGroupCreationContent paramAppGroupCreationContent)
  {
    new CreateAppGroupDialog(paramActivity).show(paramAppGroupCreationContent);
  }
  
  @Deprecated
  public static void show(android.app.Fragment paramFragment, AppGroupCreationContent paramAppGroupCreationContent)
  {
    show(new FragmentWrapper(paramFragment), paramAppGroupCreationContent);
  }
  
  @Deprecated
  public static void show(androidx.fragment.app.Fragment paramFragment, AppGroupCreationContent paramAppGroupCreationContent)
  {
    show(new FragmentWrapper(paramFragment), paramAppGroupCreationContent);
  }
  
  private static void show(FragmentWrapper paramFragmentWrapper, AppGroupCreationContent paramAppGroupCreationContent)
  {
    new CreateAppGroupDialog(paramFragmentWrapper).show(paramAppGroupCreationContent);
  }
  
  public AppCall createBaseAppCall()
  {
    return new AppCall(getRequestCode());
  }
  
  public List<FacebookDialogBase<AppGroupCreationContent, Result>.ModeHandler> getOrderedModeHandlers()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new WebHandler(null));
    return localArrayList;
  }
  
  public void registerCallbackImpl(CallbackManagerImpl paramCallbackManagerImpl, final FacebookCallback<Result> paramFacebookCallback)
  {
    if (paramFacebookCallback == null) {
      paramFacebookCallback = null;
    } else {
      paramFacebookCallback = new ResultProcessor(paramFacebookCallback)
      {
        public void onSuccess(AppCall paramAnonymousAppCall, Bundle paramAnonymousBundle)
        {
          paramFacebookCallback.onSuccess(new CreateAppGroupDialog.Result(paramAnonymousBundle.getString("id"), null));
        }
      };
    }
    paramFacebookCallback = new CallbackManagerImpl.Callback()
    {
      public boolean onActivityResult(int paramAnonymousInt, Intent paramAnonymousIntent)
      {
        return ShareInternalUtility.handleActivityResult(getRequestCode(), paramAnonymousInt, paramAnonymousIntent, paramFacebookCallback);
      }
    };
    paramCallbackManagerImpl.registerCallback(getRequestCode(), paramFacebookCallback);
  }
  
  @Deprecated
  public static final class Result
  {
    private final String id;
    
    private Result(String paramString)
    {
      id = paramString;
    }
    
    public String getId()
    {
      return id;
    }
  }
  
  public class WebHandler
    extends FacebookDialogBase<AppGroupCreationContent, CreateAppGroupDialog.Result>.ModeHandler
  {
    private WebHandler()
    {
      super();
    }
    
    public boolean canShow(AppGroupCreationContent paramAppGroupCreationContent, boolean paramBoolean)
    {
      return true;
    }
    
    public AppCall createAppCall(AppGroupCreationContent paramAppGroupCreationContent)
    {
      AppCall localAppCall = createBaseAppCall();
      DialogPresenter.setupAppCallForWebDialog(localAppCall, "game_group_create", WebDialogParameters.create(paramAppGroupCreationContent));
      return localAppCall;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.widget.CreateAppGroupDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */