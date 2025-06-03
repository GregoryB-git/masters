package androidx.core.app;

import a;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import z2;

public final class ShareCompat
{
  public static final String EXTRA_CALLING_ACTIVITY = "androidx.core.app.EXTRA_CALLING_ACTIVITY";
  public static final String EXTRA_CALLING_ACTIVITY_INTEROP = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
  public static final String EXTRA_CALLING_PACKAGE = "androidx.core.app.EXTRA_CALLING_PACKAGE";
  public static final String EXTRA_CALLING_PACKAGE_INTEROP = "android.support.v4.app.EXTRA_CALLING_PACKAGE";
  private static final String HISTORY_FILENAME_PREFIX = ".sharecompat_";
  
  @Deprecated
  public static void configureMenuItem(@NonNull Menu paramMenu, @IdRes int paramInt, @NonNull IntentBuilder paramIntentBuilder)
  {
    paramMenu = paramMenu.findItem(paramInt);
    if (paramMenu != null)
    {
      configureMenuItem(paramMenu, paramIntentBuilder);
      return;
    }
    throw new IllegalArgumentException(a.g("Could not find menu item with id ", paramInt, " in the supplied menu"));
  }
  
  @Deprecated
  public static void configureMenuItem(@NonNull MenuItem paramMenuItem, @NonNull IntentBuilder paramIntentBuilder)
  {
    Object localObject = paramMenuItem.getActionProvider();
    if (!(localObject instanceof ShareActionProvider)) {
      localObject = new ShareActionProvider(paramIntentBuilder.getContext());
    } else {
      localObject = (ShareActionProvider)localObject;
    }
    StringBuilder localStringBuilder = z2.t(".sharecompat_");
    localStringBuilder.append(paramIntentBuilder.getContext().getClass().getName());
    ((ShareActionProvider)localObject).setShareHistoryFileName(localStringBuilder.toString());
    ((ShareActionProvider)localObject).setShareIntent(paramIntentBuilder.getIntent());
    paramMenuItem.setActionProvider((ActionProvider)localObject);
  }
  
  @Nullable
  public static ComponentName getCallingActivity(@NonNull Activity paramActivity)
  {
    Intent localIntent = paramActivity.getIntent();
    ComponentName localComponentName = paramActivity.getCallingActivity();
    paramActivity = localComponentName;
    if (localComponentName == null) {
      paramActivity = getCallingActivity(localIntent);
    }
    return paramActivity;
  }
  
  @Nullable
  public static ComponentName getCallingActivity(@NonNull Intent paramIntent)
  {
    ComponentName localComponentName1 = (ComponentName)paramIntent.getParcelableExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY");
    ComponentName localComponentName2 = localComponentName1;
    if (localComponentName1 == null) {
      localComponentName2 = (ComponentName)paramIntent.getParcelableExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY");
    }
    return localComponentName2;
  }
  
  @Nullable
  public static String getCallingPackage(@NonNull Activity paramActivity)
  {
    Intent localIntent = paramActivity.getIntent();
    String str = paramActivity.getCallingPackage();
    paramActivity = str;
    if (str == null)
    {
      paramActivity = str;
      if (localIntent != null) {
        paramActivity = getCallingPackage(localIntent);
      }
    }
    return paramActivity;
  }
  
  @Nullable
  public static String getCallingPackage(@NonNull Intent paramIntent)
  {
    String str1 = paramIntent.getStringExtra("androidx.core.app.EXTRA_CALLING_PACKAGE");
    String str2 = str1;
    if (str1 == null) {
      str2 = paramIntent.getStringExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE");
    }
    return str2;
  }
  
  @RequiresApi(16)
  public static class Api16Impl
  {
    @DoNotInline
    public static String escapeHtml(CharSequence paramCharSequence)
    {
      return Html.escapeHtml(paramCharSequence);
    }
    
    @DoNotInline
    public static void migrateExtraStreamToClipData(@NonNull Intent paramIntent, @NonNull ArrayList<Uri> paramArrayList)
    {
      Object localObject1 = paramIntent.getCharSequenceExtra("android.intent.extra.TEXT");
      String str = paramIntent.getStringExtra("android.intent.extra.HTML_TEXT");
      Object localObject2 = paramIntent.getType();
      localObject1 = new ClipData.Item((CharSequence)localObject1, str, null, (Uri)paramArrayList.get(0));
      localObject2 = new ClipData(null, new String[] { localObject2 }, (ClipData.Item)localObject1);
      int i = paramArrayList.size();
      for (int j = 1; j < i; j++) {
        ((ClipData)localObject2).addItem(new ClipData.Item((Uri)paramArrayList.get(j)));
      }
      paramIntent.setClipData((ClipData)localObject2);
      paramIntent.addFlags(1);
    }
    
    @DoNotInline
    public static void removeClipData(@NonNull Intent paramIntent)
    {
      paramIntent.setClipData(null);
      paramIntent.setFlags(paramIntent.getFlags() & 0xFFFFFFFE);
    }
  }
  
  public static class IntentBuilder
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
    
    public IntentBuilder(@NonNull Context paramContext)
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
  
  public static class IntentReader
  {
    private static final String TAG = "IntentReader";
    @Nullable
    private final ComponentName mCallingActivity;
    @Nullable
    private final String mCallingPackage;
    @NonNull
    private final Context mContext;
    @NonNull
    private final Intent mIntent;
    @Nullable
    private ArrayList<Uri> mStreams;
    
    public IntentReader(@NonNull Activity paramActivity)
    {
      this((Context)Preconditions.checkNotNull(paramActivity), paramActivity.getIntent());
    }
    
    public IntentReader(@NonNull Context paramContext, @NonNull Intent paramIntent)
    {
      mContext = ((Context)Preconditions.checkNotNull(paramContext));
      mIntent = ((Intent)Preconditions.checkNotNull(paramIntent));
      mCallingPackage = ShareCompat.getCallingPackage(paramIntent);
      mCallingActivity = ShareCompat.getCallingActivity(paramIntent);
    }
    
    @Deprecated
    @NonNull
    public static IntentReader from(@NonNull Activity paramActivity)
    {
      return new IntentReader(paramActivity);
    }
    
    private static void withinStyle(StringBuilder paramStringBuilder, CharSequence paramCharSequence, int paramInt1, int paramInt2)
    {
      while (paramInt1 < paramInt2)
      {
        char c = paramCharSequence.charAt(paramInt1);
        if (c == '<')
        {
          paramStringBuilder.append("&lt;");
        }
        else if (c == '>')
        {
          paramStringBuilder.append("&gt;");
        }
        else if (c == '&')
        {
          paramStringBuilder.append("&amp;");
        }
        else if ((c <= '~') && (c >= ' '))
        {
          if (c == ' ')
          {
            for (;;)
            {
              int i = paramInt1 + 1;
              if ((i >= paramInt2) || (paramCharSequence.charAt(i) != ' ')) {
                break;
              }
              paramStringBuilder.append("&nbsp;");
              paramInt1 = i;
            }
            paramStringBuilder.append(' ');
          }
          else
          {
            paramStringBuilder.append(c);
          }
        }
        else
        {
          paramStringBuilder.append("&#");
          paramStringBuilder.append(c);
          paramStringBuilder.append(";");
        }
        paramInt1++;
      }
    }
    
    @Nullable
    public ComponentName getCallingActivity()
    {
      return mCallingActivity;
    }
    
    @Nullable
    public Drawable getCallingActivityIcon()
    {
      if (mCallingActivity == null) {
        return null;
      }
      Object localObject = mContext.getPackageManager();
      try
      {
        localObject = ((PackageManager)localObject).getActivityIcon(mCallingActivity);
        return (Drawable)localObject;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Log.e("IntentReader", "Could not retrieve icon for calling activity", localNameNotFoundException);
      }
      return null;
    }
    
    @Nullable
    public Drawable getCallingApplicationIcon()
    {
      if (mCallingPackage == null) {
        return null;
      }
      Object localObject = mContext.getPackageManager();
      try
      {
        localObject = ((PackageManager)localObject).getApplicationIcon(mCallingPackage);
        return (Drawable)localObject;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Log.e("IntentReader", "Could not retrieve icon for calling application", localNameNotFoundException);
      }
      return null;
    }
    
    @Nullable
    public CharSequence getCallingApplicationLabel()
    {
      if (mCallingPackage == null) {
        return null;
      }
      Object localObject = mContext.getPackageManager();
      try
      {
        localObject = ((PackageManager)localObject).getApplicationLabel(((PackageManager)localObject).getApplicationInfo(mCallingPackage, 0));
        return (CharSequence)localObject;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Log.e("IntentReader", "Could not retrieve label for calling application", localNameNotFoundException);
      }
      return null;
    }
    
    @Nullable
    public String getCallingPackage()
    {
      return mCallingPackage;
    }
    
    @Nullable
    public String[] getEmailBcc()
    {
      return mIntent.getStringArrayExtra("android.intent.extra.BCC");
    }
    
    @Nullable
    public String[] getEmailCc()
    {
      return mIntent.getStringArrayExtra("android.intent.extra.CC");
    }
    
    @Nullable
    public String[] getEmailTo()
    {
      return mIntent.getStringArrayExtra("android.intent.extra.EMAIL");
    }
    
    @Nullable
    public String getHtmlText()
    {
      String str1 = mIntent.getStringExtra("android.intent.extra.HTML_TEXT");
      String str2 = str1;
      if (str1 == null)
      {
        CharSequence localCharSequence = getText();
        if ((localCharSequence instanceof Spanned))
        {
          str2 = Html.toHtml((Spanned)localCharSequence);
        }
        else
        {
          str2 = str1;
          if (localCharSequence != null) {
            str2 = ShareCompat.Api16Impl.escapeHtml(localCharSequence);
          }
        }
      }
      return str2;
    }
    
    @Nullable
    public Uri getStream()
    {
      return (Uri)mIntent.getParcelableExtra("android.intent.extra.STREAM");
    }
    
    @Nullable
    public Uri getStream(int paramInt)
    {
      if ((mStreams == null) && (isMultipleShare())) {
        mStreams = mIntent.getParcelableArrayListExtra("android.intent.extra.STREAM");
      }
      Object localObject = mStreams;
      if (localObject != null) {
        return (Uri)((ArrayList)localObject).get(paramInt);
      }
      if (paramInt == 0) {
        return (Uri)mIntent.getParcelableExtra("android.intent.extra.STREAM");
      }
      localObject = z2.t("Stream items available: ");
      ((StringBuilder)localObject).append(getStreamCount());
      ((StringBuilder)localObject).append(" index requested: ");
      ((StringBuilder)localObject).append(paramInt);
      throw new IndexOutOfBoundsException(((StringBuilder)localObject).toString());
    }
    
    public int getStreamCount()
    {
      if ((mStreams == null) && (isMultipleShare())) {
        mStreams = mIntent.getParcelableArrayListExtra("android.intent.extra.STREAM");
      }
      ArrayList localArrayList = mStreams;
      if (localArrayList != null) {
        return localArrayList.size();
      }
      return mIntent.hasExtra("android.intent.extra.STREAM");
    }
    
    @Nullable
    public String getSubject()
    {
      return mIntent.getStringExtra("android.intent.extra.SUBJECT");
    }
    
    @Nullable
    public CharSequence getText()
    {
      return mIntent.getCharSequenceExtra("android.intent.extra.TEXT");
    }
    
    @Nullable
    public String getType()
    {
      return mIntent.getType();
    }
    
    public boolean isMultipleShare()
    {
      return "android.intent.action.SEND_MULTIPLE".equals(mIntent.getAction());
    }
    
    public boolean isShareIntent()
    {
      String str = mIntent.getAction();
      boolean bool;
      if ((!"android.intent.action.SEND".equals(str)) && (!"android.intent.action.SEND_MULTIPLE".equals(str))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public boolean isSingleShare()
    {
      return "android.intent.action.SEND".equals(mIntent.getAction());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.ShareCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */