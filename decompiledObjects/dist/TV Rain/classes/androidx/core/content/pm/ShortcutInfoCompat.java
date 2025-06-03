package androidx.core.content.pm;

import a3;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutInfo.Builder;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.net.UriCompat;
import androidx.core.util.Preconditions;
import d;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o3;
import z2;

public class ShortcutInfoCompat
{
  private static final String EXTRA_LOCUS_ID = "extraLocusId";
  private static final String EXTRA_LONG_LIVED = "extraLongLived";
  private static final String EXTRA_PERSON_ = "extraPerson_";
  private static final String EXTRA_PERSON_COUNT = "extraPersonCount";
  private static final String EXTRA_SLICE_URI = "extraSliceUri";
  public static final int SURFACE_LAUNCHER = 1;
  public ComponentName mActivity;
  public Set<String> mCategories;
  public Context mContext;
  public CharSequence mDisabledMessage;
  public int mDisabledReason;
  public int mExcludedSurfaces;
  public PersistableBundle mExtras;
  public boolean mHasKeyFieldsOnly;
  public IconCompat mIcon;
  public String mId;
  public Intent[] mIntents;
  public boolean mIsAlwaysBadged;
  public boolean mIsCached;
  public boolean mIsDeclaredInManifest;
  public boolean mIsDynamic;
  public boolean mIsEnabled = true;
  public boolean mIsImmutable;
  public boolean mIsLongLived;
  public boolean mIsPinned;
  public CharSequence mLabel;
  public long mLastChangedTimestamp;
  @Nullable
  public LocusIdCompat mLocusId;
  public CharSequence mLongLabel;
  public String mPackageName;
  public androidx.core.app.Person[] mPersons;
  public int mRank;
  public Bundle mTransientExtras;
  public UserHandle mUser;
  
  @RequiresApi(22)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  private PersistableBundle buildLegacyExtrasBundle()
  {
    if (mExtras == null) {
      mExtras = new PersistableBundle();
    }
    Object localObject = mPersons;
    if ((localObject != null) && (localObject.length > 0))
    {
      mExtras.putInt("extraPersonCount", localObject.length);
      int j;
      for (int i = 0; i < mPersons.length; i = j)
      {
        localObject = mExtras;
        StringBuilder localStringBuilder = z2.t("extraPerson_");
        j = i + 1;
        localStringBuilder.append(j);
        ((PersistableBundle)localObject).putPersistableBundle(localStringBuilder.toString(), mPersons[i].toPersistableBundle());
      }
    }
    localObject = mLocusId;
    if (localObject != null) {
      mExtras.putString("extraLocusId", ((LocusIdCompat)localObject).getId());
    }
    mExtras.putBoolean("extraLongLived", mIsLongLived);
    return mExtras;
  }
  
  @RequiresApi(25)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static List<ShortcutInfoCompat> fromShortcuts(@NonNull Context paramContext, @NonNull List<ShortcutInfo> paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(new Builder(paramContext, (ShortcutInfo)paramList.next()).build());
    }
    return localArrayList;
  }
  
  @Nullable
  @RequiresApi(25)
  public static LocusIdCompat getLocusId(@NonNull ShortcutInfo paramShortcutInfo)
  {
    if (Build.VERSION.SDK_INT >= 29)
    {
      if (o3.f(paramShortcutInfo) == null) {
        return null;
      }
      return LocusIdCompat.toLocusIdCompat(o3.f(paramShortcutInfo));
    }
    return getLocusIdFromExtra(paramShortcutInfo.getExtras());
  }
  
  @Nullable
  @RequiresApi(25)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  private static LocusIdCompat getLocusIdFromExtra(@Nullable PersistableBundle paramPersistableBundle)
  {
    Object localObject = null;
    if (paramPersistableBundle == null) {
      return null;
    }
    paramPersistableBundle = paramPersistableBundle.getString("extraLocusId");
    if (paramPersistableBundle == null) {
      paramPersistableBundle = (PersistableBundle)localObject;
    } else {
      paramPersistableBundle = new LocusIdCompat(paramPersistableBundle);
    }
    return paramPersistableBundle;
  }
  
  @RequiresApi(25)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  @VisibleForTesting
  public static boolean getLongLivedFromExtra(@Nullable PersistableBundle paramPersistableBundle)
  {
    if ((paramPersistableBundle != null) && (paramPersistableBundle.containsKey("extraLongLived"))) {
      return paramPersistableBundle.getBoolean("extraLongLived");
    }
    return false;
  }
  
  @Nullable
  @RequiresApi(25)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  @VisibleForTesting
  public static androidx.core.app.Person[] getPersonsFromExtra(@NonNull PersistableBundle paramPersistableBundle)
  {
    if ((paramPersistableBundle != null) && (paramPersistableBundle.containsKey("extraPersonCount")))
    {
      int i = paramPersistableBundle.getInt("extraPersonCount");
      androidx.core.app.Person[] arrayOfPerson = new androidx.core.app.Person[i];
      int k;
      for (int j = 0; j < i; j = k)
      {
        StringBuilder localStringBuilder = z2.t("extraPerson_");
        k = j + 1;
        localStringBuilder.append(k);
        arrayOfPerson[j] = androidx.core.app.Person.fromPersistableBundle(paramPersistableBundle.getPersistableBundle(localStringBuilder.toString()));
      }
      return arrayOfPerson;
    }
    return null;
  }
  
  public Intent addToIntent(Intent paramIntent)
  {
    Object localObject1 = mIntents;
    paramIntent.putExtra("android.intent.extra.shortcut.INTENT", localObject1[(localObject1.length - 1)]).putExtra("android.intent.extra.shortcut.NAME", mLabel.toString());
    Object localObject3;
    Object localObject4;
    PackageManager localPackageManager;
    if (mIcon != null)
    {
      localObject3 = null;
      localObject4 = null;
      if (mIsAlwaysBadged)
      {
        localPackageManager = mContext.getPackageManager();
        localObject3 = mActivity;
        localObject1 = localObject4;
        if (localObject3 == null) {}
      }
    }
    try
    {
      localObject1 = localPackageManager.getActivityIcon((ComponentName)localObject3);
      localObject3 = localObject1;
      if (localObject1 == null) {
        localObject3 = mContext.getApplicationInfo().loadIcon(localPackageManager);
      }
      mIcon.addToShortcutIntent(paramIntent, (Drawable)localObject3, mContext);
      return paramIntent;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject2 = localObject4;
      }
    }
  }
  
  @Nullable
  public ComponentName getActivity()
  {
    return mActivity;
  }
  
  @Nullable
  public Set<String> getCategories()
  {
    return mCategories;
  }
  
  @Nullable
  public CharSequence getDisabledMessage()
  {
    return mDisabledMessage;
  }
  
  public int getDisabledReason()
  {
    return mDisabledReason;
  }
  
  public int getExcludedFromSurfaces()
  {
    return mExcludedSurfaces;
  }
  
  @Nullable
  public PersistableBundle getExtras()
  {
    return mExtras;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public IconCompat getIcon()
  {
    return mIcon;
  }
  
  @NonNull
  public String getId()
  {
    return mId;
  }
  
  @NonNull
  public Intent getIntent()
  {
    Intent[] arrayOfIntent = mIntents;
    return arrayOfIntent[(arrayOfIntent.length - 1)];
  }
  
  @NonNull
  public Intent[] getIntents()
  {
    Intent[] arrayOfIntent = mIntents;
    return (Intent[])Arrays.copyOf(arrayOfIntent, arrayOfIntent.length);
  }
  
  public long getLastChangedTimestamp()
  {
    return mLastChangedTimestamp;
  }
  
  @Nullable
  public LocusIdCompat getLocusId()
  {
    return mLocusId;
  }
  
  @Nullable
  public CharSequence getLongLabel()
  {
    return mLongLabel;
  }
  
  @NonNull
  public String getPackage()
  {
    return mPackageName;
  }
  
  public int getRank()
  {
    return mRank;
  }
  
  @NonNull
  public CharSequence getShortLabel()
  {
    return mLabel;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public Bundle getTransientExtras()
  {
    return mTransientExtras;
  }
  
  @Nullable
  public UserHandle getUserHandle()
  {
    return mUser;
  }
  
  public boolean hasKeyFieldsOnly()
  {
    return mHasKeyFieldsOnly;
  }
  
  public boolean isCached()
  {
    return mIsCached;
  }
  
  public boolean isDeclaredInManifest()
  {
    return mIsDeclaredInManifest;
  }
  
  public boolean isDynamic()
  {
    return mIsDynamic;
  }
  
  public boolean isEnabled()
  {
    return mIsEnabled;
  }
  
  public boolean isExcludedFromSurfaces(int paramInt)
  {
    boolean bool;
    if ((paramInt & mExcludedSurfaces) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isImmutable()
  {
    return mIsImmutable;
  }
  
  public boolean isPinned()
  {
    return mIsPinned;
  }
  
  @RequiresApi(25)
  public ShortcutInfo toShortcutInfo()
  {
    ShortcutInfo.Builder localBuilder = new ShortcutInfo.Builder(mContext, mId).setShortLabel(mLabel).setIntents(mIntents);
    Object localObject = mIcon;
    if (localObject != null) {
      localBuilder.setIcon(((IconCompat)localObject).toIcon(mContext));
    }
    if (!TextUtils.isEmpty(mLongLabel)) {
      localBuilder.setLongLabel(mLongLabel);
    }
    if (!TextUtils.isEmpty(mDisabledMessage)) {
      localBuilder.setDisabledMessage(mDisabledMessage);
    }
    localObject = mActivity;
    if (localObject != null) {
      localBuilder.setActivity((ComponentName)localObject);
    }
    localObject = mCategories;
    if (localObject != null) {
      localBuilder.setCategories((Set)localObject);
    }
    localBuilder.setRank(mRank);
    localObject = mExtras;
    if (localObject != null) {
      localBuilder.setExtras((PersistableBundle)localObject);
    }
    if (Build.VERSION.SDK_INT >= 29)
    {
      localObject = mPersons;
      if ((localObject != null) && (localObject.length > 0))
      {
        int i = localObject.length;
        localObject = new android.app.Person[i];
        for (int j = 0; j < i; j++) {
          localObject[j] = mPersons[j].toAndroidPerson();
        }
        o3.t(localBuilder, (android.app.Person[])localObject);
      }
      localObject = mLocusId;
      if (localObject != null) {
        o3.r(localBuilder, ((LocusIdCompat)localObject).toLocusId());
      }
      o3.s(localBuilder, mIsLongLived);
    }
    else
    {
      localBuilder.setExtras(buildLegacyExtrasBundle());
    }
    return localBuilder.build();
  }
  
  public static class Builder
  {
    private Map<String, Map<String, List<String>>> mCapabilityBindingParams;
    private Set<String> mCapabilityBindings;
    private final ShortcutInfoCompat mInfo;
    private boolean mIsConversation;
    private Uri mSliceUri;
    
    @RequiresApi(25)
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Builder(@NonNull Context paramContext, @NonNull ShortcutInfo paramShortcutInfo)
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
    
    public Builder(@NonNull Context paramContext, @NonNull String paramString)
    {
      ShortcutInfoCompat localShortcutInfoCompat = new ShortcutInfoCompat();
      mInfo = localShortcutInfoCompat;
      mContext = paramContext;
      mId = paramString;
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Builder(@NonNull ShortcutInfoCompat paramShortcutInfoCompat)
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
        mPersons = ((androidx.core.app.Person[])Arrays.copyOf((Object[])localObject, localObject.length));
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
    public Builder setPerson(@NonNull androidx.core.app.Person paramPerson)
    {
      return setPersons(new androidx.core.app.Person[] { paramPerson });
    }
    
    @NonNull
    public Builder setPersons(@NonNull androidx.core.app.Person[] paramArrayOfPerson)
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
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface Surface {}
}

/* Location:
 * Qualified Name:     androidx.core.content.pm.ShortcutInfoCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */