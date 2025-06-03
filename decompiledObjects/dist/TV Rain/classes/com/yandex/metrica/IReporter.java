package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;

public abstract interface IReporter
{
  @NonNull
  public abstract IPluginReporter getPluginExtension();
  
  public abstract void pauseSession();
  
  public abstract void reportAdRevenue(@NonNull AdRevenue paramAdRevenue);
  
  public abstract void reportECommerce(@NonNull ECommerceEvent paramECommerceEvent);
  
  public abstract void reportError(@NonNull String paramString1, @Nullable String paramString2);
  
  public abstract void reportError(@NonNull String paramString1, @Nullable String paramString2, @Nullable Throwable paramThrowable);
  
  public abstract void reportError(@NonNull String paramString, @Nullable Throwable paramThrowable);
  
  public abstract void reportEvent(@NonNull String paramString);
  
  public abstract void reportEvent(@NonNull String paramString1, @Nullable String paramString2);
  
  public abstract void reportEvent(@NonNull String paramString, @Nullable Map<String, Object> paramMap);
  
  public abstract void reportRevenue(@NonNull Revenue paramRevenue);
  
  public abstract void reportUnhandledException(@NonNull Throwable paramThrowable);
  
  public abstract void reportUserProfile(@NonNull UserProfile paramUserProfile);
  
  public abstract void resumeSession();
  
  public abstract void sendEventsBuffer();
  
  public abstract void setStatisticsSending(boolean paramBoolean);
  
  public abstract void setUserProfileID(@Nullable String paramString);
}

/* Location:
 * Qualified Name:     com.yandex.metrica.IReporter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */