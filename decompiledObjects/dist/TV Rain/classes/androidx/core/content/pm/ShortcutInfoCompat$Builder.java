package androidx.core.content.pm;

import a3;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.Person;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.net.UriCompat;
import androidx.core.util.Preconditions;
import d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import z2;

public class ShortcutInfoCompat$Builder
{
  private Map<String, Map<String, List<String>>> mCapabilityBindingParams;
  private Set<String> mCapabilityBindings;
  private final ShortcutInfoCompat mInfo;
  private boolean mIsConversation;
  private Uri mSliceUri;
  
  @RequiresApi(25)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public ShortcutInfoCompat$Builder(@NonNull Context paramContext, @NonNull ShortcutInfo paramShortcutInfo)
  {
    ShortcutInfoCompat localShortcutInfoCompat = new ShortcutInfoCompat();
    mInfo = localShortcutInfoCompat;
    mContext = paramContext;
    mId = paramShortcutInfo.getId();
    mPackageName = paramShortcutInfo.getPackage();
    paramContext = paramShortcutInfo.getIntents();
    mIntents = ((Intent[])Arrays.copyOf(paramContext, paramContext.length));
    mActivity = paramShortcutInfo.getActivity();
    mLabel = paramShortcutInfo.getShortLabel();
    mLongLabel = paramShortcutInfo.getLongLabel();
    mDisabledMessage = paramShortcutInfo.getDisabledMessage();
    int i = Build.VERSION.SDK_INT;
    if (i >= 28)
    {
      mDisabledReason = a3.d(paramShortcutInfo);
    }
    else
    {
      int j;
      if (paramShortcutInfo.isEnabled()) {
        j = 0;
      } else {
        j = 3;
      }
      mDisabledReason = j;
    }
    mCategories = paramShortcutInfo.getCategories();
    mPersons = ShortcutInfoCompat.getPersonsFromExtra(paramShortcutInfo.getExtras());
    mUser = paramShortcutInfo.getUserHandle();
    mLastChangedTimestamp = paramShortcutInfo.getLastChangedTimestamp();
    if (i >= 30) {
      mIsCached = d.y(paramShortcutInfo);
    }
    mIsDynamic = paramShortcutInfo.isDynamic();
    mIsPinned = paramShortcutInfo.isPinned();
    mIsDeclaredInManifest = paramShortcutInfo.isDeclaredInManifest();
    mIsImmutable = paramShortcutInfo.isImmutable();
    mIsEnabled = paramShortcutInfo.isEnabled();
    mHasKeyFieldsOnly = paramShortcutInfo.hasKeyFieldsOnly();
    mLocusId = ShortcutInfoCompat.getLocusId(paramShortcutInfo);
    mRank = paramShortcutInfo.getRank();
    mExtras = paramShortcutInfo.getExtras();
  }
  
  public ShortcutInfoCompat$Builder(@NonNull Context paramContext, @NonNull String paramString)
  {
    ShortcutInfoCompat localShortcutInfoCompat = new ShortcutInfoCompat();
    mInfo = localShortcutInfoCompat;
    mContext = paramContext;
    mId = paramString;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public ShortcutInfoCompat$Builder(@NonNull ShortcutInfoCompat paramShortcutInfoCompat)
  {
    ShortcutInfoCompat localShortcutInfoCompat = new ShortcutInfoCompat();
    mInfo = localShortcutInfoCompat;
    mContext = mContext;
    mId = mId;
    mPackageName = mPackageName;
    Object localObject = mIntents;
    mIntents = ((Intent[])Arrays.copyOf((Object[])localObject, localObject.length));
    mActivity = mActivity;
    mLabel = mLabel;
    mLongLabel = mLongLabel;
    mDisabledMessage = mDisabledMessage;
    mDisabledReason = mDisabledReason;
    mIcon = mIcon;
    mIsAlwaysBadged = mIsAlwaysBadged;
    mUser = mUser;
    mLastChangedTimestamp = mLastChangedTimestamp;
    mIsCached = mIsCached;
    mIsDynamic = mIsDynamic;
    mIsPinned = mIsPinned;
    mIsDeclaredInManifest = mIsDeclaredInManifest;
    mIsImmutable = mIsImmutable;
    mIsEnabled = mIsEnabled;
    mLocusId = mLocusId;
    mIsLongLived = mIsLongLived;
    mHasKeyFieldsOnly = mHasKeyFieldsOnly;
    mRank = mRank;
    localObject = mPersons;
    if (localObject != null) {
      mPersons = ((Person[])Arrays.copyOf((Object[])localObject, localObject.length));
    }
    if (mCategories != null) {
      mCategories = new HashSet(mCategories);
    }
    localObject = mExtras;
    if (localObject != null) {
      mExtras = ((PersistableBundle)localObject);
    }
    mExcludedSurfaces = mExcludedSurfaces;
  }
  
  @SuppressLint({"MissingGetterMatchingBuilder"})
  @NonNull
  public Builder addCapabilityBinding(@NonNull String paramString)
  {
    if (mCapabilityBindings == null) {
      mCapabilityBindings = new HashSet();
    }
    mCapabilityBindings.add(paramString);
    return this;
  }
  
  @SuppressLint({"MissingGetterMatchingBuilder"})
  @NonNull
  public Builder addCapabilityBinding(@NonNull String paramString1, @NonNull String paramString2, @NonNull List<String> paramList)
  {
    addCapabilityBinding(paramString1);
    if (!paramList.isEmpty())
    {
      if (mCapabilityBindingParams == null) {
        mCapabilityBindingParams = new HashMap();
      }
      if (mCapabilityBindingParams.get(paramString1) == null) {
        mCapabilityBindingParams.put(paramString1, new HashMap());
      }
      ((Map)mCapabilityBindingParams.get(paramString1)).put(paramString2, paramList);
    }
    return this;
  }
  
  @NonNull
  public ShortcutInfoCompat build()
  {
    if (!TextUtils.isEmpty(mInfo.mLabel))
    {
      Object localObject1 = mInfo;
      Object localObject2 = mIntents;
      if ((localObject2 != null) && (localObject2.length != 0))
      {
        if (mIsConversation)
        {
          if (mLocusId == null) {
            mLocusId = new LocusIdCompat(mId);
          }
          mInfo.mIsLongLived = true;
        }
        if (mCapabilityBindings != null)
        {
          localObject1 = mInfo;
          if (mCategories == null) {
            mCategories = new HashSet();
          }
          mInfo.mCategories.addAll(mCapabilityBindings);
        }
        if (mCapabilityBindingParams != null)
        {
          localObject1 = mInfo;
          if (mExtras == null) {
            mExtras = new PersistableBundle();
          }
          Iterator localIterator1 = mCapabilityBindingParams.keySet().iterator();
          while (localIterator1.hasNext())
          {
            localObject2 = (String)localIterator1.next();
            Map localMap = (Map)mCapabilityBindingParams.get(localObject2);
            localObject1 = localMap.keySet();
            mInfo.mExtras.putStringArray((String)localObject2, (String[])((Set)localObject1).toArray(new String[0]));
            Iterator localIterator2 = localMap.keySet().iterator();
            while (localIterator2.hasNext())
            {
              String str = (String)localIterator2.next();
              localObject1 = (List)localMap.get(str);
              PersistableBundle localPersistableBundle = mInfo.mExtras;
              str = z2.p((String)localObject2, "/", str);
              if (localObject1 == null) {
                localObject1 = new String[0];
              } else {
                localObject1 = (String[])((List)localObject1).toArray(new String[0]);
              }
              localPersistableBundle.putStringArray(str, (String[])localObject1);
            }
          }
        }
        if (mSliceUri != null)
        {
          localObject1 = mInfo;
          if (mExtras == null) {
            mExtras = new PersistableBundle();
          }
          mInfo.mExtras.putString("extraSliceUri", UriCompat.toSafeString(mSliceUri));
        }
        return mInfo;
      }
      throw new IllegalArgumentException("Shortcut must have an intent");
    }
    throw new IllegalArgumentException("Shortcut must have a non-empty label");
  }
  
  @NonNull
  public Builder setActivity(@NonNull ComponentName paramComponentName)
  {
    mInfo.mActivity = paramComponentName;
    return this;
  }
  
  @NonNull
  public Builder setAlwaysBadged()
  {
    mInfo.mIsAlwaysBadged = true;
    return this;
  }
  
  @NonNull
  public Builder setCategories(@NonNull Set<String> paramSet)
  {
    mInfo.mCategories = paramSet;
    return this;
  }
  
  @NonNull
  public Builder setDisabledMessage(@NonNull CharSequence paramCharSequence)
  {
    mInfo.mDisabledMessage = paramCharSequence;
    return this;
  }
  
  @NonNull
  public Builder setExcludedFromSurfaces(int paramInt)
  {
    mInfo.mExcludedSurfaces = paramInt;
    return this;
  }
  
  @NonNull
  public Builder setExtras(@NonNull PersistableBundle paramPersistableBundle)
  {
    mInfo.mExtras = paramPersistableBundle;
    return this;
  }
  
  @NonNull
  public Builder setIcon(IconCompat paramIconCompat)
  {
    mInfo.mIcon = paramIconCompat;
    return this;
  }
  
  @NonNull
  public Builder setIntent(@NonNull Intent paramIntent)
  {
    return setIntents(new Intent[] { paramIntent });
  }
  
  @NonNull
  public Builder setIntents(@NonNull Intent[] paramArrayOfIntent)
  {
    mInfo.mIntents = paramArrayOfIntent;
    return this;
  }
  
  @NonNull
  public Builder setIsConversation()
  {
    mIsConversation = true;
    return this;
  }
  
  @NonNull
  public Builder setLocusId(@Nullable LocusIdCompat paramLocusIdCompat)
  {
    mInfo.mLocusId = paramLocusIdCompat;
    return this;
  }
  
  @NonNull
  public Builder setLongLabel(@NonNull CharSequence paramCharSequence)
  {
    mInfo.mLongLabel = paramCharSequence;
    return this;
  }
  
  @Deprecated
  @NonNull
  public Builder setLongLived()
  {
    mInfo.mIsLongLived = true;
    return this;
  }
  
  @NonNull
  public Builder setLongLived(boolean paramBoolean)
  {
    mInfo.mIsLongLived = paramBoolean;
    return this;
  }
  
  @NonNull
  public Builder setPerson(@NonNull Person paramPerson)
  {
    return setPersons(new Person[] { paramPerson });
  }
  
  @NonNull
  public Builder setPersons(@NonNull Person[] paramArrayOfPerson)
  {
    mInfo.mPersons = paramArrayOfPerson;
    return this;
  }
  
  @NonNull
  public Builder setRank(int paramInt)
  {
    mInfo.mRank = paramInt;
    return this;
  }
  
  @NonNull
  public Builder setShortLabel(@NonNull CharSequence paramCharSequence)
  {
    mInfo.mLabel = paramCharSequence;
    return this;
  }
  
  @SuppressLint({"MissingGetterMatchingBuilder"})
  @NonNull
  public Builder setSliceUri(@NonNull Uri paramUri)
  {
    mSliceUri = paramUri;
    return this;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public Builder setTransientExtras(@NonNull Bundle paramBundle)
  {
    mInfo.mTransientExtras = ((Bundle)Preconditions.checkNotNull(paramBundle));
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.pm.ShortcutInfoCompat.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */