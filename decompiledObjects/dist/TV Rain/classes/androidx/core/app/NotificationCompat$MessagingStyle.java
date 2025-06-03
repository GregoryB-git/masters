package androidx.core.app;

import android.app.Notification;
import android.app.Notification.MessagingStyle;
import android.app.Notification.MessagingStyle.Message;
import android.app.Notification.Style;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.text.BidiFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NotificationCompat$MessagingStyle
  extends NotificationCompat.Style
{
  public static final int MAXIMUM_RETAINED_MESSAGES = 25;
  private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$MessagingStyle";
  @Nullable
  private CharSequence mConversationTitle;
  private final List<Message> mHistoricMessages = new ArrayList();
  @Nullable
  private Boolean mIsGroupConversation;
  private final List<Message> mMessages = new ArrayList();
  private Person mUser;
  
  public NotificationCompat$MessagingStyle() {}
  
  public NotificationCompat$MessagingStyle(@NonNull Person paramPerson)
  {
    if (!TextUtils.isEmpty(paramPerson.getName()))
    {
      mUser = paramPerson;
      return;
    }
    throw new IllegalArgumentException("User's name must not be empty.");
  }
  
  @Deprecated
  public NotificationCompat$MessagingStyle(@NonNull CharSequence paramCharSequence)
  {
    mUser = new Person.Builder().setName(paramCharSequence).build();
  }
  
  @Nullable
  public static MessagingStyle extractMessagingStyleFromNotification(@NonNull Notification paramNotification)
  {
    paramNotification = NotificationCompat.Style.extractStyleFromNotification(paramNotification);
    if ((paramNotification instanceof MessagingStyle)) {
      return (MessagingStyle)paramNotification;
    }
    return null;
  }
  
  @Nullable
  private Message findLatestIncomingMessage()
  {
    int i = mMessages.size();
    Object localObject;
    do
    {
      int j;
      do
      {
        j = i - 1;
        if (j < 0) {
          break;
        }
        localObject = (Message)mMessages.get(j);
        i = j;
      } while (((Message)localObject).getPerson() == null);
      i = j;
    } while (TextUtils.isEmpty(((Message)localObject).getPerson().getName()));
    return (Message)localObject;
    if (!mMessages.isEmpty())
    {
      localObject = mMessages;
      return (Message)((List)localObject).get(((List)localObject).size() - 1);
    }
    return null;
  }
  
  private boolean hasMessagesWithoutSender()
  {
    for (int i = mMessages.size() - 1; i >= 0; i--)
    {
      Message localMessage = (Message)mMessages.get(i);
      if ((localMessage.getPerson() != null) && (localMessage.getPerson().getName() == null)) {
        return true;
      }
    }
    return false;
  }
  
  @NonNull
  private TextAppearanceSpan makeFontColorSpan(int paramInt)
  {
    return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(paramInt), null);
  }
  
  private CharSequence makeMessageLine(@NonNull Message paramMessage)
  {
    BidiFormatter localBidiFormatter = BidiFormatter.getInstance();
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    int i = -16777216;
    Object localObject1 = paramMessage.getPerson();
    String str = "";
    if (localObject1 == null) {
      localObject1 = "";
    } else {
      localObject1 = paramMessage.getPerson().getName();
    }
    int j = i;
    Object localObject2 = localObject1;
    if (TextUtils.isEmpty((CharSequence)localObject1))
    {
      localObject1 = mUser.getName();
      j = i;
      localObject2 = localObject1;
      if (mBuilder.getColor() != 0)
      {
        j = mBuilder.getColor();
        localObject2 = localObject1;
      }
    }
    localObject1 = localBidiFormatter.unicodeWrap((CharSequence)localObject2);
    localSpannableStringBuilder.append((CharSequence)localObject1);
    localSpannableStringBuilder.setSpan(makeFontColorSpan(j), localSpannableStringBuilder.length() - ((CharSequence)localObject1).length(), localSpannableStringBuilder.length(), 33);
    if (paramMessage.getText() == null) {
      paramMessage = str;
    } else {
      paramMessage = paramMessage.getText();
    }
    localSpannableStringBuilder.append("  ").append(localBidiFormatter.unicodeWrap(paramMessage));
    return localSpannableStringBuilder;
  }
  
  public void addCompatExtras(@NonNull Bundle paramBundle)
  {
    super.addCompatExtras(paramBundle);
    paramBundle.putCharSequence("android.selfDisplayName", mUser.getName());
    paramBundle.putBundle("android.messagingStyleUser", mUser.toBundle());
    paramBundle.putCharSequence("android.hiddenConversationTitle", mConversationTitle);
    if ((mConversationTitle != null) && (mIsGroupConversation.booleanValue())) {
      paramBundle.putCharSequence("android.conversationTitle", mConversationTitle);
    }
    if (!mMessages.isEmpty()) {
      paramBundle.putParcelableArray("android.messages", Message.getBundleArrayForMessages(mMessages));
    }
    if (!mHistoricMessages.isEmpty()) {
      paramBundle.putParcelableArray("android.messages.historic", Message.getBundleArrayForMessages(mHistoricMessages));
    }
    Boolean localBoolean = mIsGroupConversation;
    if (localBoolean != null) {
      paramBundle.putBoolean("android.isGroupConversation", localBoolean.booleanValue());
    }
  }
  
  @NonNull
  public MessagingStyle addHistoricMessage(@Nullable Message paramMessage)
  {
    if (paramMessage != null)
    {
      mHistoricMessages.add(paramMessage);
      if (mHistoricMessages.size() > 25) {
        mHistoricMessages.remove(0);
      }
    }
    return this;
  }
  
  @NonNull
  public MessagingStyle addMessage(@Nullable Message paramMessage)
  {
    if (paramMessage != null)
    {
      mMessages.add(paramMessage);
      if (mMessages.size() > 25) {
        mMessages.remove(0);
      }
    }
    return this;
  }
  
  @NonNull
  public MessagingStyle addMessage(@Nullable CharSequence paramCharSequence, long paramLong, @Nullable Person paramPerson)
  {
    addMessage(new Message(paramCharSequence, paramLong, paramPerson));
    return this;
  }
  
  @Deprecated
  @NonNull
  public MessagingStyle addMessage(@Nullable CharSequence paramCharSequence1, long paramLong, @Nullable CharSequence paramCharSequence2)
  {
    mMessages.add(new Message(paramCharSequence1, paramLong, new Person.Builder().setName(paramCharSequence2).build()));
    if (mMessages.size() > 25) {
      mMessages.remove(0);
    }
    return this;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void apply(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
  {
    setGroupConversation(isGroupConversation());
    Notification.MessagingStyle localMessagingStyle;
    if (Build.VERSION.SDK_INT >= 28) {
      localMessagingStyle = new Notification.MessagingStyle(mUser.toAndroidPerson());
    } else {
      localMessagingStyle = new Notification.MessagingStyle(mUser.getName());
    }
    Iterator localIterator = mMessages.iterator();
    while (localIterator.hasNext()) {
      localMessagingStyle.addMessage(((Message)localIterator.next()).toAndroidMessage());
    }
    if (Build.VERSION.SDK_INT >= 26)
    {
      localIterator = mHistoricMessages.iterator();
      while (localIterator.hasNext()) {
        localMessagingStyle.addHistoricMessage(((Message)localIterator.next()).toAndroidMessage());
      }
    }
    if ((mIsGroupConversation.booleanValue()) || (Build.VERSION.SDK_INT >= 28)) {
      localMessagingStyle.setConversationTitle(mConversationTitle);
    }
    if (Build.VERSION.SDK_INT >= 28) {
      localMessagingStyle.setGroupConversation(mIsGroupConversation.booleanValue());
    }
    localMessagingStyle.setBuilder(paramNotificationBuilderWithBuilderAccessor.getBuilder());
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void clearCompatExtraKeys(@NonNull Bundle paramBundle)
  {
    super.clearCompatExtraKeys(paramBundle);
    paramBundle.remove("android.messagingStyleUser");
    paramBundle.remove("android.selfDisplayName");
    paramBundle.remove("android.conversationTitle");
    paramBundle.remove("android.hiddenConversationTitle");
    paramBundle.remove("android.messages");
    paramBundle.remove("android.messages.historic");
    paramBundle.remove("android.isGroupConversation");
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public String getClassName()
  {
    return "androidx.core.app.NotificationCompat$MessagingStyle";
  }
  
  @Nullable
  public CharSequence getConversationTitle()
  {
    return mConversationTitle;
  }
  
  @NonNull
  public List<Message> getHistoricMessages()
  {
    return mHistoricMessages;
  }
  
  @NonNull
  public List<Message> getMessages()
  {
    return mMessages;
  }
  
  @NonNull
  public Person getUser()
  {
    return mUser;
  }
  
  @Deprecated
  @Nullable
  public CharSequence getUserDisplayName()
  {
    return mUser.getName();
  }
  
  public boolean isGroupConversation()
  {
    Object localObject = mBuilder;
    boolean bool1 = false;
    boolean bool2 = false;
    if ((localObject != null) && (mContext.getApplicationInfo().targetSdkVersion < 28) && (mIsGroupConversation == null))
    {
      if (mConversationTitle != null) {
        bool2 = true;
      }
      return bool2;
    }
    localObject = mIsGroupConversation;
    bool2 = bool1;
    if (localObject != null) {
      bool2 = ((Boolean)localObject).booleanValue();
    }
    return bool2;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void restoreFromCompatExtras(@NonNull Bundle paramBundle)
  {
    super.restoreFromCompatExtras(paramBundle);
    mMessages.clear();
    if (paramBundle.containsKey("android.messagingStyleUser")) {
      mUser = Person.fromBundle(paramBundle.getBundle("android.messagingStyleUser"));
    } else {
      mUser = new Person.Builder().setName(paramBundle.getString("android.selfDisplayName")).build();
    }
    Object localObject = paramBundle.getCharSequence("android.conversationTitle");
    mConversationTitle = ((CharSequence)localObject);
    if (localObject == null) {
      mConversationTitle = paramBundle.getCharSequence("android.hiddenConversationTitle");
    }
    localObject = paramBundle.getParcelableArray("android.messages");
    if (localObject != null) {
      mMessages.addAll(Message.getMessagesFromBundleArray((Parcelable[])localObject));
    }
    localObject = paramBundle.getParcelableArray("android.messages.historic");
    if (localObject != null) {
      mHistoricMessages.addAll(Message.getMessagesFromBundleArray((Parcelable[])localObject));
    }
    if (paramBundle.containsKey("android.isGroupConversation")) {
      mIsGroupConversation = Boolean.valueOf(paramBundle.getBoolean("android.isGroupConversation"));
    }
  }
  
  @NonNull
  public MessagingStyle setConversationTitle(@Nullable CharSequence paramCharSequence)
  {
    mConversationTitle = paramCharSequence;
    return this;
  }
  
  @NonNull
  public MessagingStyle setGroupConversation(boolean paramBoolean)
  {
    mIsGroupConversation = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public static final class Message
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
    
    public Message(@Nullable CharSequence paramCharSequence, long paramLong, @Nullable Person paramPerson)
    {
      mText = paramCharSequence;
      mTimestamp = paramLong;
      mPerson = paramPerson;
    }
    
    @Deprecated
    public Message(@Nullable CharSequence paramCharSequence1, long paramLong, @Nullable CharSequence paramCharSequence2)
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
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationCompat.MessagingStyle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */