package com.facebook;

import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;

public final class ProfileManager
{
  public static final String ACTION_CURRENT_PROFILE_CHANGED = "com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED";
  public static final String EXTRA_NEW_PROFILE = "com.facebook.sdk.EXTRA_NEW_PROFILE";
  public static final String EXTRA_OLD_PROFILE = "com.facebook.sdk.EXTRA_OLD_PROFILE";
  private static volatile ProfileManager instance;
  private Profile currentProfile;
  private final LocalBroadcastManager localBroadcastManager;
  private final ProfileCache profileCache;
  
  public ProfileManager(LocalBroadcastManager paramLocalBroadcastManager, ProfileCache paramProfileCache)
  {
    Validate.notNull(paramLocalBroadcastManager, "localBroadcastManager");
    Validate.notNull(paramProfileCache, "profileCache");
    localBroadcastManager = paramLocalBroadcastManager;
    profileCache = paramProfileCache;
  }
  
  public static ProfileManager getInstance()
  {
    if (instance == null) {
      try
      {
        if (instance == null)
        {
          LocalBroadcastManager localLocalBroadcastManager = LocalBroadcastManager.getInstance(FacebookSdk.getApplicationContext());
          ProfileManager localProfileManager = new com/facebook/ProfileManager;
          ProfileCache localProfileCache = new com/facebook/ProfileCache;
          localProfileCache.<init>();
          localProfileManager.<init>(localLocalBroadcastManager, localProfileCache);
          instance = localProfileManager;
        }
      }
      finally {}
    }
    return instance;
  }
  
  private void sendCurrentProfileChangedBroadcast(Profile paramProfile1, Profile paramProfile2)
  {
    Intent localIntent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
    localIntent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", paramProfile1);
    localIntent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", paramProfile2);
    localBroadcastManager.sendBroadcast(localIntent);
  }
  
  private void setCurrentProfile(@Nullable Profile paramProfile, boolean paramBoolean)
  {
    Profile localProfile = currentProfile;
    currentProfile = paramProfile;
    if (paramBoolean) {
      if (paramProfile != null) {
        profileCache.save(paramProfile);
      } else {
        profileCache.clear();
      }
    }
    if (!Utility.areObjectsEqual(localProfile, paramProfile)) {
      sendCurrentProfileChangedBroadcast(localProfile, paramProfile);
    }
  }
  
  public Profile getCurrentProfile()
  {
    return currentProfile;
  }
  
  public boolean loadCurrentProfile()
  {
    Profile localProfile = profileCache.load();
    if (localProfile != null)
    {
      setCurrentProfile(localProfile, false);
      return true;
    }
    return false;
  }
  
  public void setCurrentProfile(@Nullable Profile paramProfile)
  {
    setCurrentProfile(paramProfile, true);
  }
}

/* Location:
 * Qualified Name:     com.facebook.ProfileManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */