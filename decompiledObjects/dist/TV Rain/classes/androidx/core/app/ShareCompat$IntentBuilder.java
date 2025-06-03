package androidx.core.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.text.Html;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.util.Preconditions;
import java.util.ArrayList;

public class ShareCompat$IntentBuilder
{
  @Nullable
  private ArrayList<String> mBccAddresses;
  @Nullable
  private ArrayList<String> mCcAddresses;
  @Nullable
  private CharSequence mChooserTitle;
  @NonNull
  private final Context mContext;
  @NonNull
  private final Intent mIntent;
  @Nullable
  private ArrayList<Uri> mStreams;
  @Nullable
  private ArrayList<String> mToAddresses;
  
  public ShareCompat$IntentBuilder(@NonNull Context paramContext)
  {
    mContext = ((Context)Preconditions.checkNotNull(paramContext));
    Intent localIntent = new Intent().setAction("android.intent.action.SEND");
    mIntent = localIntent;
    localIntent.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", paramContext.getPackageName());
    localIntent.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", paramContext.getPackageName());
    localIntent.addFlags(524288);
    while ((paramContext instanceof ContextWrapper))
    {
      if ((paramContext instanceof Activity))
      {
        paramContext = (Activity)paramContext;
        break label97;
      }
      paramContext = ((ContextWrapper)paramContext).getBaseContext();
    }
    paramContext = null;
    label97:
    if (paramContext != null)
    {
      paramContext = paramContext.getComponentName();
      mIntent.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", paramContext);
      mIntent.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", paramContext);
    }
  }
  
  private void combineArrayExtra(String paramString, ArrayList<String> paramArrayList)
  {
    String[] arrayOfString1 = mIntent.getStringArrayExtra(paramString);
    int i;
    if (arrayOfString1 != null) {
      i = arrayOfString1.length;
    } else {
      i = 0;
    }
    String[] arrayOfString2 = new String[paramArrayList.size() + i];
    paramArrayList.toArray(arrayOfString2);
    if (arrayOfString1 != null) {
      System.arraycopy(arrayOfString1, 0, arrayOfString2, paramArrayList.size(), i);
    }
    mIntent.putExtra(paramString, arrayOfString2);
  }
  
  private void combineArrayExtra(@Nullable String paramString, @NonNull String[] paramArrayOfString)
  {
    Intent localIntent = getIntent();
    String[] arrayOfString1 = localIntent.getStringArrayExtra(paramString);
    int i;
    if (arrayOfString1 != null) {
      i = arrayOfString1.length;
    } else {
      i = 0;
    }
    String[] arrayOfString2 = new String[paramArrayOfString.length + i];
    if (arrayOfString1 != null) {
      System.arraycopy(arrayOfString1, 0, arrayOfString2, 0, i);
    }
    System.arraycopy(paramArrayOfString, 0, arrayOfString2, i, paramArrayOfString.length);
    localIntent.putExtra(paramString, arrayOfString2);
  }
  
  @Deprecated
  @NonNull
  public static IntentBuilder from(@NonNull Activity paramActivity)
  {
    return new IntentBuilder(paramActivity);
  }
  
  @NonNull
  public IntentBuilder addEmailBcc(@NonNull String paramString)
  {
    if (mBccAddresses == null) {
      mBccAddresses = new ArrayList();
    }
    mBccAddresses.add(paramString);
    return this;
  }
  
  @NonNull
  public IntentBuilder addEmailBcc(@NonNull String[] paramArrayOfString)
  {
    combineArrayExtra("android.intent.extra.BCC", paramArrayOfString);
    return this;
  }
  
  @NonNull
  public IntentBuilder addEmailCc(@NonNull String paramString)
  {
    if (mCcAddresses == null) {
      mCcAddresses = new ArrayList();
    }
    mCcAddresses.add(paramString);
    return this;
  }
  
  @NonNull
  public IntentBuilder addEmailCc(@NonNull String[] paramArrayOfString)
  {
    combineArrayExtra("android.intent.extra.CC", paramArrayOfString);
    return this;
  }
  
  @NonNull
  public IntentBuilder addEmailTo(@NonNull String paramString)
  {
    if (mToAddresses == null) {
      mToAddresses = new ArrayList();
    }
    mToAddresses.add(paramString);
    return this;
  }
  
  @NonNull
  public IntentBuilder addEmailTo(@NonNull String[] paramArrayOfString)
  {
    combineArrayExtra("android.intent.extra.EMAIL", paramArrayOfString);
    return this;
  }
  
  @NonNull
  public IntentBuilder addStream(@NonNull Uri paramUri)
  {
    if (mStreams == null) {
      mStreams = new ArrayList();
    }
    mStreams.add(paramUri);
    return this;
  }
  
  @NonNull
  public Intent createChooserIntent()
  {
    return Intent.createChooser(getIntent(), mChooserTitle);
  }
  
  @NonNull
  public Context getContext()
  {
    return mContext;
  }
  
  @NonNull
  public Intent getIntent()
  {
    ArrayList localArrayList = mToAddresses;
    if (localArrayList != null)
    {
      combineArrayExtra("android.intent.extra.EMAIL", localArrayList);
      mToAddresses = null;
    }
    localArrayList = mCcAddresses;
    if (localArrayList != null)
    {
      combineArrayExtra("android.intent.extra.CC", localArrayList);
      mCcAddresses = null;
    }
    localArrayList = mBccAddresses;
    if (localArrayList != null)
    {
      combineArrayExtra("android.intent.extra.BCC", localArrayList);
      mBccAddresses = null;
    }
    localArrayList = mStreams;
    int i = 1;
    if ((localArrayList == null) || (localArrayList.size() <= 1)) {
      i = 0;
    }
    if (i == 0)
    {
      mIntent.setAction("android.intent.action.SEND");
      localArrayList = mStreams;
      if ((localArrayList != null) && (!localArrayList.isEmpty()))
      {
        mIntent.putExtra("android.intent.extra.STREAM", (Parcelable)mStreams.get(0));
        ShareCompat.Api16Impl.migrateExtraStreamToClipData(mIntent, mStreams);
      }
      else
      {
        mIntent.removeExtra("android.intent.extra.STREAM");
        ShareCompat.Api16Impl.removeClipData(mIntent);
      }
    }
    else
    {
      mIntent.setAction("android.intent.action.SEND_MULTIPLE");
      mIntent.putParcelableArrayListExtra("android.intent.extra.STREAM", mStreams);
      ShareCompat.Api16Impl.migrateExtraStreamToClipData(mIntent, mStreams);
    }
    return mIntent;
  }
  
  @NonNull
  public IntentBuilder setChooserTitle(@StringRes int paramInt)
  {
    return setChooserTitle(mContext.getText(paramInt));
  }
  
  @NonNull
  public IntentBuilder setChooserTitle(@Nullable CharSequence paramCharSequence)
  {
    mChooserTitle = paramCharSequence;
    return this;
  }
  
  @NonNull
  public IntentBuilder setEmailBcc(@Nullable String[] paramArrayOfString)
  {
    mIntent.putExtra("android.intent.extra.BCC", paramArrayOfString);
    return this;
  }
  
  @NonNull
  public IntentBuilder setEmailCc(@Nullable String[] paramArrayOfString)
  {
    mIntent.putExtra("android.intent.extra.CC", paramArrayOfString);
    return this;
  }
  
  @NonNull
  public IntentBuilder setEmailTo(@Nullable String[] paramArrayOfString)
  {
    if (mToAddresses != null) {
      mToAddresses = null;
    }
    mIntent.putExtra("android.intent.extra.EMAIL", paramArrayOfString);
    return this;
  }
  
  @NonNull
  public IntentBuilder setHtmlText(@Nullable String paramString)
  {
    mIntent.putExtra("android.intent.extra.HTML_TEXT", paramString);
    if (!mIntent.hasExtra("android.intent.extra.TEXT")) {
      setText(Html.fromHtml(paramString));
    }
    return this;
  }
  
  @NonNull
  public IntentBuilder setStream(@Nullable Uri paramUri)
  {
    mStreams = null;
    if (paramUri != null) {
      addStream(paramUri);
    }
    return this;
  }
  
  @NonNull
  public IntentBuilder setSubject(@Nullable String paramString)
  {
    mIntent.putExtra("android.intent.extra.SUBJECT", paramString);
    return this;
  }
  
  @NonNull
  public IntentBuilder setText(@Nullable CharSequence paramCharSequence)
  {
    mIntent.putExtra("android.intent.extra.TEXT", paramCharSequence);
    return this;
  }
  
  @NonNull
  public IntentBuilder setType(@Nullable String paramString)
  {
    mIntent.setType(paramString);
    return this;
  }
  
  public void startChooser()
  {
    mContext.startActivity(createChooserIntent());
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.ShareCompat.IntentBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */