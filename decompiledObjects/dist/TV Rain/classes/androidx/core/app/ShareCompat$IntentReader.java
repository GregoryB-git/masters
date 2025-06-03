package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import z2;

public class ShareCompat$IntentReader
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
  
  public ShareCompat$IntentReader(@NonNull Activity paramActivity)
  {
    this((Context)Preconditions.checkNotNull(paramActivity), paramActivity.getIntent());
  }
  
  public ShareCompat$IntentReader(@NonNull Context paramContext, @NonNull Intent paramIntent)
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

/* Location:
 * Qualified Name:     androidx.core.app.ShareCompat.IntentReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */