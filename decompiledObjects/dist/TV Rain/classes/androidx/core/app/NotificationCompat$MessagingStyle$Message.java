package androidx.core.app;

import android.app.Notification.MessagingStyle.Message;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.List;

public final class NotificationCompat$MessagingStyle$Message
{
  public static final String KEY_DATA_MIME_TYPE = "type";
  public static final String KEY_DATA_URI = "uri";
  public static final String KEY_EXTRAS_BUNDLE = "extras";
  public static final String KEY_NOTIFICATION_PERSON = "sender_person";
  public static final String KEY_PERSON = "person";
  public static final String KEY_SENDER = "sender";
  public static final String KEY_TEXT = "text";
  public static final String KEY_TIMESTAMP = "time";
  @Nullable
  private String mDataMimeType;
  @Nullable
  private Uri mDataUri;
  private Bundle mExtras = new Bundle();
  @Nullable
  private final Person mPerson;
  private final CharSequence mText;
  private final long mTimestamp;
  
  public NotificationCompat$MessagingStyle$Message(@Nullable CharSequence paramCharSequence, long paramLong, @Nullable Person paramPerson)
  {
    mText = paramCharSequence;
    mTimestamp = paramLong;
    mPerson = paramPerson;
  }
  
  @Deprecated
  public NotificationCompat$MessagingStyle$Message(@Nullable CharSequence paramCharSequence1, long paramLong, @Nullable CharSequence paramCharSequence2)
  {
    this(paramCharSequence1, paramLong, new Person.Builder().setName(paramCharSequence2).build());
  }
  
  @NonNull
  public static Bundle[] getBundleArrayForMessages(@NonNull List<Message> paramList)
  {
    Bundle[] arrayOfBundle = new Bundle[paramList.size()];
    int i = paramList.size();
    for (int j = 0; j < i; j++) {
      arrayOfBundle[j] = ((Message)paramList.get(j)).toBundle();
    }
    return arrayOfBundle;
  }
  
  @Nullable
  public static Message getMessageFromBundle(@NonNull Bundle paramBundle)
  {
    try
    {
      if ((paramBundle.containsKey("text")) && (paramBundle.containsKey("time")))
      {
        Object localObject;
        if (paramBundle.containsKey("person"))
        {
          localObject = Person.fromBundle(paramBundle.getBundle("person"));
        }
        else if ((paramBundle.containsKey("sender_person")) && (Build.VERSION.SDK_INT >= 28))
        {
          localObject = Person.fromAndroidPerson((android.app.Person)paramBundle.getParcelable("sender_person"));
        }
        else if (paramBundle.containsKey("sender"))
        {
          localObject = new androidx/core/app/Person$Builder;
          ((Person.Builder)localObject).<init>();
          localObject = ((Person.Builder)localObject).setName(paramBundle.getCharSequence("sender")).build();
        }
        else
        {
          localObject = null;
        }
        Message localMessage = new androidx/core/app/NotificationCompat$MessagingStyle$Message;
        localMessage.<init>(paramBundle.getCharSequence("text"), paramBundle.getLong("time"), (Person)localObject);
        if ((paramBundle.containsKey("type")) && (paramBundle.containsKey("uri"))) {
          localMessage.setData(paramBundle.getString("type"), (Uri)paramBundle.getParcelable("uri"));
        }
        if (paramBundle.containsKey("extras")) {
          localMessage.getExtras().putAll(paramBundle.getBundle("extras"));
        }
        return localMessage;
      }
    }
    catch (ClassCastException paramBundle)
    {
      for (;;) {}
    }
    return null;
  }
  
  @NonNull
  public static List<Message> getMessagesFromBundleArray(@NonNull Parcelable[] paramArrayOfParcelable)
  {
    ArrayList localArrayList = new ArrayList(paramArrayOfParcelable.length);
    for (int i = 0; i < paramArrayOfParcelable.length; i++)
    {
      Object localObject = paramArrayOfParcelable[i];
      if ((localObject instanceof Bundle))
      {
        localObject = getMessageFromBundle((Bundle)localObject);
        if (localObject != null) {
          localArrayList.add(localObject);
        }
      }
    }
    return localArrayList;
  }
  
  @NonNull
  private Bundle toBundle()
  {
    Bundle localBundle = new Bundle();
    Object localObject = mText;
    if (localObject != null) {
      localBundle.putCharSequence("text", (CharSequence)localObject);
    }
    localBundle.putLong("time", mTimestamp);
    localObject = mPerson;
    if (localObject != null)
    {
      localBundle.putCharSequence("sender", ((Person)localObject).getName());
      if (Build.VERSION.SDK_INT >= 28) {
        localBundle.putParcelable("sender_person", mPerson.toAndroidPerson());
      } else {
        localBundle.putBundle("person", mPerson.toBundle());
      }
    }
    localObject = mDataMimeType;
    if (localObject != null) {
      localBundle.putString("type", (String)localObject);
    }
    localObject = mDataUri;
    if (localObject != null) {
      localBundle.putParcelable("uri", (Parcelable)localObject);
    }
    localObject = mExtras;
    if (localObject != null) {
      localBundle.putBundle("extras", (Bundle)localObject);
    }
    return localBundle;
  }
  
  @Nullable
  public String getDataMimeType()
  {
    return mDataMimeType;
  }
  
  @Nullable
  public Uri getDataUri()
  {
    return mDataUri;
  }
  
  @NonNull
  public Bundle getExtras()
  {
    return mExtras;
  }
  
  @Nullable
  public Person getPerson()
  {
    return mPerson;
  }
  
  @Deprecated
  @Nullable
  public CharSequence getSender()
  {
    Object localObject = mPerson;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((Person)localObject).getName();
    }
    return (CharSequence)localObject;
  }
  
  @Nullable
  public CharSequence getText()
  {
    return mText;
  }
  
  public long getTimestamp()
  {
    return mTimestamp;
  }
  
  @NonNull
  public Message setData(@Nullable String paramString, @Nullable Uri paramUri)
  {
    mDataMimeType = paramString;
    mDataUri = paramUri;
    return this;
  }
  
  @NonNull
  @RequiresApi(24)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public Notification.MessagingStyle.Message toAndroidMessage()
  {
    Person localPerson = getPerson();
    int i = Build.VERSION.SDK_INT;
    CharSequence localCharSequence1 = null;
    Object localObject = null;
    long l;
    if (i >= 28)
    {
      localCharSequence1 = getText();
      l = getTimestamp();
      if (localPerson != null) {
        localObject = localPerson.toAndroidPerson();
      }
      localObject = new Notification.MessagingStyle.Message(localCharSequence1, l, (android.app.Person)localObject);
    }
    else
    {
      CharSequence localCharSequence2 = getText();
      l = getTimestamp();
      if (localPerson == null) {
        localObject = localCharSequence1;
      } else {
        localObject = localPerson.getName();
      }
      localObject = new Notification.MessagingStyle.Message(localCharSequence2, l, (CharSequence)localObject);
    }
    if (getDataMimeType() != null) {
      ((Notification.MessagingStyle.Message)localObject).setData(getDataMimeType(), getDataUri());
    }
    return (Notification.MessagingStyle.Message)localObject;
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationCompat.MessagingStyle.Message
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */