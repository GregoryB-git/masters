package com.facebook.internal;

import a;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookDialog;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import java.util.Iterator;
import java.util.List;

public abstract class FacebookDialogBase<CONTENT, RESULT>
  implements FacebookDialog<CONTENT, RESULT>
{
  public static final Object BASE_AUTOMATIC_MODE = new Object();
  private static final String TAG = "FacebookDialog";
  private final Activity activity;
  private final FragmentWrapper fragmentWrapper;
  private List<FacebookDialogBase<CONTENT, RESULT>.ModeHandler> modeHandlers;
  private int requestCode;
  
  public FacebookDialogBase(Activity paramActivity, int paramInt)
  {
    Validate.notNull(paramActivity, "activity");
    activity = paramActivity;
    fragmentWrapper = null;
    requestCode = paramInt;
  }
  
  public FacebookDialogBase(FragmentWrapper paramFragmentWrapper, int paramInt)
  {
    Validate.notNull(paramFragmentWrapper, "fragmentWrapper");
    fragmentWrapper = paramFragmentWrapper;
    activity = null;
    requestCode = paramInt;
    if (paramFragmentWrapper.getActivity() != null) {
      return;
    }
    throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity");
  }
  
  private List<FacebookDialogBase<CONTENT, RESULT>.ModeHandler> cachedModeHandlers()
  {
    if (modeHandlers == null) {
      modeHandlers = getOrderedModeHandlers();
    }
    return modeHandlers;
  }
  
  private AppCall createAppCallForMode(CONTENT paramCONTENT, Object paramObject)
  {
    int i;
    if (paramObject == BASE_AUTOMATIC_MODE) {
      i = 1;
    } else {
      i = 0;
    }
    Object localObject1 = null;
    Iterator localIterator = cachedModeHandlers().iterator();
    Object localObject2;
    do
    {
      localObject2 = localObject1;
      if (!localIterator.hasNext()) {
        break;
      }
      localObject2 = (ModeHandler)localIterator.next();
    } while (((i == 0) && (!Utility.areObjectsEqual(((ModeHandler)localObject2).getMode(), paramObject))) || (!((ModeHandler)localObject2).canShow(paramCONTENT, true)));
    try
    {
      localObject2 = ((ModeHandler)localObject2).createAppCall(paramCONTENT);
    }
    catch (FacebookException paramCONTENT)
    {
      localObject2 = createBaseAppCall();
      DialogPresenter.setupAppCallForValidationError((AppCall)localObject2, paramCONTENT);
    }
    paramCONTENT = (CONTENT)localObject2;
    if (localObject2 == null)
    {
      paramCONTENT = createBaseAppCall();
      DialogPresenter.setupAppCallForCannotShowError(paramCONTENT);
    }
    return paramCONTENT;
  }
  
  public boolean canShow(CONTENT paramCONTENT)
  {
    return canShowImpl(paramCONTENT, BASE_AUTOMATIC_MODE);
  }
  
  public boolean canShowImpl(CONTENT paramCONTENT, Object paramObject)
  {
    int i;
    if (paramObject == BASE_AUTOMATIC_MODE) {
      i = 1;
    } else {
      i = 0;
    }
    Iterator localIterator = cachedModeHandlers().iterator();
    while (localIterator.hasNext())
    {
      ModeHandler localModeHandler = (ModeHandler)localIterator.next();
      if (((i != 0) || (Utility.areObjectsEqual(localModeHandler.getMode(), paramObject))) && (localModeHandler.canShow(paramCONTENT, false))) {
        return true;
      }
    }
    return false;
  }
  
  public abstract AppCall createBaseAppCall();
  
  public Activity getActivityContext()
  {
    Object localObject = activity;
    if (localObject != null) {
      return (Activity)localObject;
    }
    localObject = fragmentWrapper;
    if (localObject != null) {
      return ((FragmentWrapper)localObject).getActivity();
    }
    return null;
  }
  
  public abstract List<FacebookDialogBase<CONTENT, RESULT>.ModeHandler> getOrderedModeHandlers();
  
  public int getRequestCode()
  {
    return requestCode;
  }
  
  public final void registerCallback(CallbackManager paramCallbackManager, FacebookCallback<RESULT> paramFacebookCallback)
  {
    if ((paramCallbackManager instanceof CallbackManagerImpl))
    {
      registerCallbackImpl((CallbackManagerImpl)paramCallbackManager, paramFacebookCallback);
      return;
    }
    throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
  }
  
  public final void registerCallback(CallbackManager paramCallbackManager, FacebookCallback<RESULT> paramFacebookCallback, int paramInt)
  {
    setRequestCode(paramInt);
    registerCallback(paramCallbackManager, paramFacebookCallback);
  }
  
  public abstract void registerCallbackImpl(CallbackManagerImpl paramCallbackManagerImpl, FacebookCallback<RESULT> paramFacebookCallback);
  
  public void setRequestCode(int paramInt)
  {
    if (!FacebookSdk.isFacebookRequestCode(paramInt))
    {
      requestCode = paramInt;
      return;
    }
    throw new IllegalArgumentException(a.g("Request code ", paramInt, " cannot be within the range reserved by the Facebook SDK."));
  }
  
  public void show(CONTENT paramCONTENT)
  {
    showImpl(paramCONTENT, BASE_AUTOMATIC_MODE);
  }
  
  public void showImpl(CONTENT paramCONTENT, Object paramObject)
  {
    paramCONTENT = createAppCallForMode(paramCONTENT, paramObject);
    if (paramCONTENT != null)
    {
      paramObject = fragmentWrapper;
      if (paramObject != null) {
        DialogPresenter.present(paramCONTENT, (FragmentWrapper)paramObject);
      } else {
        DialogPresenter.present(paramCONTENT, activity);
      }
    }
    else
    {
      Log.e("FacebookDialog", "No code path should ever result in a null appCall");
      if (FacebookSdk.isDebugEnabled()) {
        break label54;
      }
    }
    return;
    label54:
    throw new IllegalStateException("No code path should ever result in a null appCall");
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    Object localObject = activity;
    String str = "Failed to find Activity or Fragment to startActivityForResult ";
    if (localObject != null)
    {
      ((Activity)localObject).startActivityForResult(paramIntent, paramInt);
    }
    else
    {
      FragmentWrapper localFragmentWrapper = fragmentWrapper;
      localObject = str;
      if (localFragmentWrapper == null) {
        break label86;
      }
      if (localFragmentWrapper.getNativeFragment() != null)
      {
        fragmentWrapper.getNativeFragment().startActivityForResult(paramIntent, paramInt);
      }
      else
      {
        localObject = str;
        if (fragmentWrapper.getSupportFragment() == null) {
          break label86;
        }
        fragmentWrapper.getSupportFragment().startActivityForResult(paramIntent, paramInt);
      }
    }
    localObject = null;
    label86:
    if (localObject != null) {
      Logger.log(LoggingBehavior.DEVELOPER_ERRORS, 6, getClass().getName(), (String)localObject);
    }
  }
  
  public abstract class ModeHandler
  {
    public ModeHandler() {}
    
    public abstract boolean canShow(CONTENT paramCONTENT, boolean paramBoolean);
    
    public abstract AppCall createAppCall(CONTENT paramCONTENT);
    
    public Object getMode()
    {
      return FacebookDialogBase.BASE_AUTOMATIC_MODE;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.FacebookDialogBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */