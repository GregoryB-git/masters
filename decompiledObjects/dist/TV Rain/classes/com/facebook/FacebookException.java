package com.facebook;

import com.facebook.internal.FeatureManager;
import com.facebook.internal.FeatureManager.Callback;
import com.facebook.internal.FeatureManager.Feature;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import java.util.Random;

public class FacebookException
  extends RuntimeException
{
  public static final long serialVersionUID = 1L;
  
  public FacebookException() {}
  
  public FacebookException(final String paramString)
  {
    super(paramString);
    Random localRandom = new Random();
    if ((paramString != null) && (FacebookSdk.isInitialized()) && (localRandom.nextInt(100) > 50)) {
      FeatureManager.checkFeature(FeatureManager.Feature.ErrorReport, new FeatureManager.Callback()
      {
        public void onCompleted(boolean paramAnonymousBoolean)
        {
          if (paramAnonymousBoolean) {}
          try
          {
            ErrorReportHandler.save(paramString);
            return;
          }
          catch (Exception localException)
          {
            for (;;) {}
          }
        }
      });
    }
  }
  
  public FacebookException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
  
  public FacebookException(String paramString, Object... paramVarArgs)
  {
    this(String.format(paramString, paramVarArgs));
  }
  
  public FacebookException(Throwable paramThrowable)
  {
    super(paramThrowable);
  }
  
  public String toString()
  {
    return getMessage();
  }
}

/* Location:
 * Qualified Name:     com.facebook.FacebookException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */