package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

public class FirebaseMessagingService
  extends i
{
  public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
  static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
  static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
  static final String EXTRA_TOKEN = "token";
  private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
  private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
  
  public static void resetForTesting()
  {
    recentlyReceivedMessageIds.clear();
  }
  
  public final boolean g(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    Object localObject = recentlyReceivedMessageIds;
    if (((Collection)localObject).contains(paramString))
    {
      if (Log.isLoggable("FirebaseMessaging", 3))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Received duplicate message: ");
        ((StringBuilder)localObject).append(paramString);
        Log.d("FirebaseMessaging", ((StringBuilder)localObject).toString());
      }
      return true;
    }
    if (((Collection)localObject).size() >= 10) {
      ((Queue)localObject).remove();
    }
    ((Queue)localObject).add(paramString);
    return false;
  }
  
  public Intent getStartCommandIntent(Intent paramIntent)
  {
    return Y.b().c();
  }
  
  public final void h(Intent paramIntent)
  {
    Object localObject1 = paramIntent.getExtras();
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = new Bundle();
    }
    ((Bundle)localObject2).remove("androidx.content.wakelockid");
    Object localObject3;
    if (L.t((Bundle)localObject2))
    {
      localObject3 = new L((Bundle)localObject2);
      localObject1 = o.e();
      localObject3 = new f(this, (L)localObject3, (ExecutorService)localObject1);
    }
    try
    {
      boolean bool = ((f)localObject3).a();
      ((ExecutorService)localObject1).shutdown();
      return;
      if (J.B(paramIntent)) {
        J.t(paramIntent);
      }
    }
    finally
    {
      ((ExecutorService)localObject1).shutdown();
    }
  }
  
  public void handleIntent(Intent paramIntent)
  {
    Object localObject = paramIntent.getAction();
    if ((!"com.google.android.c2dm.intent.RECEIVE".equals(localObject)) && (!"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(localObject)))
    {
      if ("com.google.firebase.messaging.NEW_TOKEN".equals(localObject))
      {
        onNewToken(paramIntent.getStringExtra("token"));
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Unknown intent action: ");
        ((StringBuilder)localObject).append(paramIntent.getAction());
        Log.d("FirebaseMessaging", ((StringBuilder)localObject).toString());
      }
    }
    else {
      j(paramIntent);
    }
  }
  
  public final String i(Intent paramIntent)
  {
    String str1 = paramIntent.getStringExtra("google.message_id");
    String str2 = str1;
    if (str1 == null) {
      str2 = paramIntent.getStringExtra("message_id");
    }
    return str2;
  }
  
  public final void j(Intent paramIntent)
  {
    if (!g(paramIntent.getStringExtra("google.message_id"))) {
      k(paramIntent);
    }
  }
  
  public final void k(Intent paramIntent)
  {
    String str1 = paramIntent.getStringExtra("message_type");
    String str2 = str1;
    if (str1 == null) {
      str2 = "gcm";
    }
    int i = str2.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 814800675: 
      if (str2.equals("send_event")) {
        j = 3;
      }
      break;
    case 814694033: 
      if (str2.equals("send_error")) {
        j = 2;
      }
      break;
    case 102161: 
      if (str2.equals("gcm")) {
        j = 1;
      }
      break;
    case -2062414158: 
      if (str2.equals("deleted_messages")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      paramIntent = new StringBuilder();
      paramIntent.append("Received message with unknown type: ");
      paramIntent.append(str2);
      Log.w("FirebaseMessaging", paramIntent.toString());
      break;
    case 3: 
      onMessageSent(paramIntent.getStringExtra("google.message_id"));
      break;
    case 2: 
      onSendError(i(paramIntent), new X(paramIntent.getStringExtra("error")));
      break;
    case 1: 
      J.v(paramIntent);
      h(paramIntent);
      break;
    case 0: 
      onDeletedMessages();
    }
  }
  
  public void onDeletedMessages() {}
  
  public void onMessageReceived(@NonNull T paramT) {}
  
  public void onMessageSent(@NonNull String paramString) {}
  
  public void onNewToken(String paramString) {}
  
  public void onSendError(@NonNull String paramString, @NonNull Exception paramException) {}
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.FirebaseMessagingService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */