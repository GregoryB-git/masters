package androidx.core.app;

import a3;
import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import e;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import o3;
import p3;
import z2;

public final class RemoteInput
{
  public static final int EDIT_CHOICES_BEFORE_SENDING_AUTO = 0;
  public static final int EDIT_CHOICES_BEFORE_SENDING_DISABLED = 1;
  public static final int EDIT_CHOICES_BEFORE_SENDING_ENABLED = 2;
  private static final String EXTRA_DATA_TYPE_RESULTS_DATA = "android.remoteinput.dataTypeResultsData";
  public static final String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
  private static final String EXTRA_RESULTS_SOURCE = "android.remoteinput.resultsSource";
  public static final String RESULTS_CLIP_LABEL = "android.remoteinput.results";
  public static final int SOURCE_CHOICE = 1;
  public static final int SOURCE_FREE_FORM_INPUT = 0;
  private final boolean mAllowFreeFormTextInput;
  private final Set<String> mAllowedDataTypes;
  private final CharSequence[] mChoices;
  private final int mEditChoicesBeforeSending;
  private final Bundle mExtras;
  private final CharSequence mLabel;
  private final String mResultKey;
  
  public RemoteInput(String paramString, CharSequence paramCharSequence, CharSequence[] paramArrayOfCharSequence, boolean paramBoolean, int paramInt, Bundle paramBundle, Set<String> paramSet)
  {
    mResultKey = paramString;
    mLabel = paramCharSequence;
    mChoices = paramArrayOfCharSequence;
    mAllowFreeFormTextInput = paramBoolean;
    mEditChoicesBeforeSending = paramInt;
    mExtras = paramBundle;
    mAllowedDataTypes = paramSet;
    if ((getEditChoicesBeforeSending() == 2) && (!getAllowFreeFormInput())) {
      throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
    }
  }
  
  public static void addDataResultToIntent(@NonNull RemoteInput paramRemoteInput, @NonNull Intent paramIntent, @NonNull Map<String, Uri> paramMap)
  {
    if (Build.VERSION.SDK_INT >= 26)
    {
      Api26Impl.addDataResultToIntent(paramRemoteInput, paramIntent, paramMap);
    }
    else
    {
      Object localObject1 = getClipDataIntentFromIntent(paramIntent);
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new Intent();
      }
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        paramMap = (Map.Entry)localIterator.next();
        String str = (String)paramMap.getKey();
        Uri localUri = (Uri)paramMap.getValue();
        if (str != null)
        {
          localObject1 = ((Intent)localObject2).getBundleExtra(getExtraResultsKeyForData(str));
          paramMap = (Map<String, Uri>)localObject1;
          if (localObject1 == null) {
            paramMap = new Bundle();
          }
          paramMap.putString(paramRemoteInput.getResultKey(), localUri.toString());
          ((Intent)localObject2).putExtra(getExtraResultsKeyForData(str), paramMap);
        }
      }
      Api16Impl.setClipData(paramIntent, ClipData.newIntent("android.remoteinput.results", (Intent)localObject2));
    }
  }
  
  public static void addResultsToIntent(@NonNull RemoteInput[] paramArrayOfRemoteInput, @NonNull Intent paramIntent, @NonNull Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT >= 26)
    {
      Api20Impl.addResultsToIntent(fromCompat(paramArrayOfRemoteInput), paramIntent, paramBundle);
    }
    else
    {
      Object localObject = getResultsFromIntent(paramIntent);
      int i = getResultsSource(paramIntent);
      if (localObject != null)
      {
        ((Bundle)localObject).putAll(paramBundle);
        paramBundle = (Bundle)localObject;
      }
      int j = paramArrayOfRemoteInput.length;
      for (int k = 0; k < j; k++)
      {
        RemoteInput localRemoteInput = paramArrayOfRemoteInput[k];
        localObject = getDataResultsFromIntent(paramIntent, localRemoteInput.getResultKey());
        Api20Impl.addResultsToIntent(fromCompat(new RemoteInput[] { localRemoteInput }), paramIntent, paramBundle);
        if (localObject != null) {
          addDataResultToIntent(localRemoteInput, paramIntent, (Map)localObject);
        }
      }
      setResultsSource(paramIntent, i);
    }
  }
  
  @RequiresApi(20)
  public static android.app.RemoteInput fromCompat(RemoteInput paramRemoteInput)
  {
    return Api20Impl.fromCompat(paramRemoteInput);
  }
  
  @RequiresApi(20)
  public static android.app.RemoteInput[] fromCompat(RemoteInput[] paramArrayOfRemoteInput)
  {
    if (paramArrayOfRemoteInput == null) {
      return null;
    }
    android.app.RemoteInput[] arrayOfRemoteInput = new android.app.RemoteInput[paramArrayOfRemoteInput.length];
    for (int i = 0; i < paramArrayOfRemoteInput.length; i++) {
      arrayOfRemoteInput[i] = fromCompat(paramArrayOfRemoteInput[i]);
    }
    return arrayOfRemoteInput;
  }
  
  @RequiresApi(20)
  public static RemoteInput fromPlatform(android.app.RemoteInput paramRemoteInput)
  {
    return Api20Impl.fromPlatform(paramRemoteInput);
  }
  
  @RequiresApi(16)
  private static Intent getClipDataIntentFromIntent(Intent paramIntent)
  {
    ClipData localClipData = Api16Impl.getClipData(paramIntent);
    if (localClipData == null) {
      return null;
    }
    paramIntent = localClipData.getDescription();
    if (!paramIntent.hasMimeType("text/vnd.android.intent")) {
      return null;
    }
    if (!paramIntent.getLabel().toString().contentEquals("android.remoteinput.results")) {
      return null;
    }
    return localClipData.getItemAt(0).getIntent();
  }
  
  @Nullable
  public static Map<String, Uri> getDataResultsFromIntent(@NonNull Intent paramIntent, @NonNull String paramString)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.getDataResultsFromIntent(paramIntent, paramString);
    }
    Intent localIntent = getClipDataIntentFromIntent(paramIntent);
    paramIntent = null;
    if (localIntent == null) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    Iterator localIterator = localIntent.getExtras().keySet().iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      if (str1.startsWith("android.remoteinput.dataTypeResultsData"))
      {
        String str2 = str1.substring(39);
        if (!str2.isEmpty())
        {
          str1 = localIntent.getBundleExtra(str1).getString(paramString);
          if ((str1 != null) && (!str1.isEmpty())) {
            localHashMap.put(str2, Uri.parse(str1));
          }
        }
      }
    }
    if (!localHashMap.isEmpty()) {
      paramIntent = localHashMap;
    }
    return paramIntent;
  }
  
  private static String getExtraResultsKeyForData(String paramString)
  {
    return z2.o("android.remoteinput.dataTypeResultsData", paramString);
  }
  
  @Nullable
  public static Bundle getResultsFromIntent(@NonNull Intent paramIntent)
  {
    return Api20Impl.getResultsFromIntent(paramIntent);
  }
  
  public static int getResultsSource(@NonNull Intent paramIntent)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.getResultsSource(paramIntent);
    }
    paramIntent = getClipDataIntentFromIntent(paramIntent);
    if (paramIntent == null) {
      return 0;
    }
    return paramIntent.getExtras().getInt("android.remoteinput.resultsSource", 0);
  }
  
  public static void setResultsSource(@NonNull Intent paramIntent, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 28)
    {
      Api28Impl.setResultsSource(paramIntent, paramInt);
    }
    else
    {
      Intent localIntent1 = getClipDataIntentFromIntent(paramIntent);
      Intent localIntent2 = localIntent1;
      if (localIntent1 == null) {
        localIntent2 = new Intent();
      }
      localIntent2.putExtra("android.remoteinput.resultsSource", paramInt);
      Api16Impl.setClipData(paramIntent, ClipData.newIntent("android.remoteinput.results", localIntent2));
    }
  }
  
  public boolean getAllowFreeFormInput()
  {
    return mAllowFreeFormTextInput;
  }
  
  @Nullable
  public Set<String> getAllowedDataTypes()
  {
    return mAllowedDataTypes;
  }
  
  @Nullable
  public CharSequence[] getChoices()
  {
    return mChoices;
  }
  
  public int getEditChoicesBeforeSending()
  {
    return mEditChoicesBeforeSending;
  }
  
  @NonNull
  public Bundle getExtras()
  {
    return mExtras;
  }
  
  @Nullable
  public CharSequence getLabel()
  {
    return mLabel;
  }
  
  @NonNull
  public String getResultKey()
  {
    return mResultKey;
  }
  
  public boolean isDataOnly()
  {
    boolean bool;
    if ((!getAllowFreeFormInput()) && ((getChoices() == null) || (getChoices().length == 0)) && (getAllowedDataTypes() != null) && (!getAllowedDataTypes().isEmpty())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @RequiresApi(16)
  public static class Api16Impl
  {
    @DoNotInline
    public static ClipData getClipData(Intent paramIntent)
    {
      return paramIntent.getClipData();
    }
    
    @DoNotInline
    public static void setClipData(Intent paramIntent, ClipData paramClipData)
    {
      paramIntent.setClipData(paramClipData);
    }
  }
  
  @RequiresApi(20)
  public static class Api20Impl
  {
    @DoNotInline
    public static void addResultsToIntent(Object paramObject, Intent paramIntent, Bundle paramBundle)
    {
      android.app.RemoteInput.addResultsToIntent((android.app.RemoteInput[])paramObject, paramIntent, paramBundle);
    }
    
    public static android.app.RemoteInput fromCompat(RemoteInput paramRemoteInput)
    {
      android.app.RemoteInput.Builder localBuilder = new android.app.RemoteInput.Builder(paramRemoteInput.getResultKey()).setLabel(paramRemoteInput.getLabel()).setChoices(paramRemoteInput.getChoices()).setAllowFreeFormInput(paramRemoteInput.getAllowFreeFormInput()).addExtras(paramRemoteInput.getExtras());
      if (Build.VERSION.SDK_INT >= 26)
      {
        Object localObject = paramRemoteInput.getAllowedDataTypes();
        if (localObject != null)
        {
          localObject = ((Set)localObject).iterator();
          while (((Iterator)localObject).hasNext()) {
            RemoteInput.Api26Impl.setAllowDataType(localBuilder, (String)((Iterator)localObject).next(), true);
          }
        }
      }
      if (Build.VERSION.SDK_INT >= 29) {
        RemoteInput.Api29Impl.setEditChoicesBeforeSending(localBuilder, paramRemoteInput.getEditChoicesBeforeSending());
      }
      return localBuilder.build();
    }
    
    public static RemoteInput fromPlatform(Object paramObject)
    {
      paramObject = (android.app.RemoteInput)paramObject;
      RemoteInput.Builder localBuilder = new RemoteInput.Builder(((android.app.RemoteInput)paramObject).getResultKey()).setLabel(((android.app.RemoteInput)paramObject).getLabel()).setChoices(((android.app.RemoteInput)paramObject).getChoices()).setAllowFreeFormInput(((android.app.RemoteInput)paramObject).getAllowFreeFormInput()).addExtras(((android.app.RemoteInput)paramObject).getExtras());
      if (Build.VERSION.SDK_INT >= 26)
      {
        Object localObject = RemoteInput.Api26Impl.getAllowedDataTypes(paramObject);
        if (localObject != null)
        {
          localObject = ((Set)localObject).iterator();
          while (((Iterator)localObject).hasNext()) {
            localBuilder.setAllowDataType((String)((Iterator)localObject).next(), true);
          }
        }
      }
      if (Build.VERSION.SDK_INT >= 29) {
        localBuilder.setEditChoicesBeforeSending(RemoteInput.Api29Impl.getEditChoicesBeforeSending(paramObject));
      }
      return localBuilder.build();
    }
    
    @DoNotInline
    public static Bundle getResultsFromIntent(Intent paramIntent)
    {
      return android.app.RemoteInput.getResultsFromIntent(paramIntent);
    }
  }
  
  @RequiresApi(26)
  public static class Api26Impl
  {
    @DoNotInline
    public static void addDataResultToIntent(RemoteInput paramRemoteInput, Intent paramIntent, Map<String, Uri> paramMap)
    {
      p3.n(RemoteInput.fromCompat(paramRemoteInput), paramIntent, paramMap);
    }
    
    @DoNotInline
    public static Set<String> getAllowedDataTypes(Object paramObject)
    {
      return p3.k((android.app.RemoteInput)paramObject);
    }
    
    @DoNotInline
    public static Map<String, Uri> getDataResultsFromIntent(Intent paramIntent, String paramString)
    {
      return p3.j(paramIntent, paramString);
    }
    
    @DoNotInline
    public static android.app.RemoteInput.Builder setAllowDataType(android.app.RemoteInput.Builder paramBuilder, String paramString, boolean paramBoolean)
    {
      return p3.c(paramBuilder, paramString, paramBoolean);
    }
  }
  
  @RequiresApi(28)
  public static class Api28Impl
  {
    @DoNotInline
    public static int getResultsSource(Intent paramIntent)
    {
      return a3.b(paramIntent);
    }
    
    @DoNotInline
    public static void setResultsSource(Intent paramIntent, int paramInt)
    {
      a3.s(paramIntent, paramInt);
    }
  }
  
  @RequiresApi(29)
  public static class Api29Impl
  {
    @DoNotInline
    public static int getEditChoicesBeforeSending(Object paramObject)
    {
      return e.a((android.app.RemoteInput)paramObject);
    }
    
    @DoNotInline
    public static android.app.RemoteInput.Builder setEditChoicesBeforeSending(android.app.RemoteInput.Builder paramBuilder, int paramInt)
    {
      return o3.e(paramBuilder, paramInt);
    }
  }
  
  public static final class Builder
  {
    private boolean mAllowFreeFormTextInput = true;
    private final Set<String> mAllowedDataTypes = new HashSet();
    private CharSequence[] mChoices;
    private int mEditChoicesBeforeSending = 0;
    private final Bundle mExtras = new Bundle();
    private CharSequence mLabel;
    private final String mResultKey;
    
    public Builder(@NonNull String paramString)
    {
      if (paramString != null)
      {
        mResultKey = paramString;
        return;
      }
      throw new IllegalArgumentException("Result key can't be null");
    }
    
    @NonNull
    public Builder addExtras(@NonNull Bundle paramBundle)
    {
      if (paramBundle != null) {
        mExtras.putAll(paramBundle);
      }
      return this;
    }
    
    @NonNull
    public RemoteInput build()
    {
      return new RemoteInput(mResultKey, mLabel, mChoices, mAllowFreeFormTextInput, mEditChoicesBeforeSending, mExtras, mAllowedDataTypes);
    }
    
    @NonNull
    public Bundle getExtras()
    {
      return mExtras;
    }
    
    @NonNull
    public Builder setAllowDataType(@NonNull String paramString, boolean paramBoolean)
    {
      if (paramBoolean) {
        mAllowedDataTypes.add(paramString);
      } else {
        mAllowedDataTypes.remove(paramString);
      }
      return this;
    }
    
    @NonNull
    public Builder setAllowFreeFormInput(boolean paramBoolean)
    {
      mAllowFreeFormTextInput = paramBoolean;
      return this;
    }
    
    @NonNull
    public Builder setChoices(@Nullable CharSequence[] paramArrayOfCharSequence)
    {
      mChoices = paramArrayOfCharSequence;
      return this;
    }
    
    @NonNull
    public Builder setEditChoicesBeforeSending(int paramInt)
    {
      mEditChoicesBeforeSending = paramInt;
      return this;
    }
    
    @NonNull
    public Builder setLabel(@Nullable CharSequence paramCharSequence)
    {
      mLabel = paramCharSequence;
      return this;
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface EditChoicesBeforeSending {}
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface Source {}
}

/* Location:
 * Qualified Name:     androidx.core.app.RemoteInput
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */