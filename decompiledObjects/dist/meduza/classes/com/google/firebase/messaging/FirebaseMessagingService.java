package com.google.firebase.messaging;

import aa.c0;
import aa.d0;
import aa.g;
import aa.h;
import aa.q;
import aa.s;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import f;
import i6.a0;
import i6.c;
import i6.w;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FirebaseMessagingService
  extends h
{
  public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
  public static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
  public static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
  public static final String EXTRA_TOKEN = "token";
  private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
  private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
  private c rpc;
  
  private boolean alreadyReceivedMessage(String paramString)
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
  
  private void dispatchMessage(Intent paramIntent)
  {
    Object localObject1 = paramIntent.getExtras();
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = new Bundle();
    }
    ((Bundle)localObject2).remove("androidx.content.wakelockid");
    Object localObject3;
    if (s.l((Bundle)localObject2))
    {
      localObject3 = new s((Bundle)localObject2);
      localObject1 = Executors.newSingleThreadExecutor(new w6.a("Firebase-Messaging-Network-Io"));
      localObject3 = new g(this, (s)localObject3, (ExecutorService)localObject1);
    }
    try
    {
      boolean bool = ((g)localObject3).a();
      ((ExecutorService)localObject1).shutdown();
      return;
      if (q.d(paramIntent)) {
        q.c(paramIntent.getExtras(), "_nf");
      }
    }
    finally
    {
      ((ExecutorService)localObject1).shutdown();
    }
  }
  
  private String getMessageId(Intent paramIntent)
  {
    String str1 = paramIntent.getStringExtra("google.message_id");
    String str2 = str1;
    if (str1 == null) {
      str2 = paramIntent.getStringExtra("message_id");
    }
    return str2;
  }
  
  private c getRpc(Context paramContext)
  {
    if (rpc == null) {
      rpc = new c(paramContext.getApplicationContext());
    }
    return rpc;
  }
  
  private void handleMessageIntent(Intent arg1)
  {
    if (!alreadyReceivedMessage(???.getStringExtra("google.message_id"))) {
      passMessageIntentToSdk(???);
    }
    c localc = getRpc(this);
    ??? = new i6.a(???);
    Bundle localBundle;
    if (c.a() >= 233700000)
    {
      localBundle = new Bundle();
      localBundle.putString("google.message_id", ???.D());
      if (a.hasExtra("google.product_id")) {
        ??? = Integer.valueOf(a.getIntExtra("google.product_id", 0));
      } else {
        ??? = null;
      }
      if (??? != null) {
        localBundle.putInt("google.product_id", ???.intValue());
      }
    }
    synchronized (i6.z.a(b))
    {
      int i = d;
      d = (i + 1);
      ???.b(new w(i, 3, localBundle));
    }
  }
  
  private void passMessageIntentToSdk(Intent paramIntent)
  {
    String str1 = paramIntent.getStringExtra("message_type");
    String str2 = str1;
    if (str1 == null) {
      str2 = "gcm";
    }
    int i = -1;
    switch (str2.hashCode())
    {
    default: 
      break;
    case 814800675: 
      if (str2.equals("send_event")) {
        i = 3;
      }
      break;
    case 814694033: 
      if (str2.equals("send_error")) {
        i = 2;
      }
      break;
    case 102161: 
      if (str2.equals("gcm")) {
        i = 1;
      }
      break;
    case -2062414158: 
      if (str2.equals("deleted_messages")) {
        i = 0;
      }
      break;
    }
    switch (i)
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
      onSendError(getMessageId(paramIntent), new c0(paramIntent.getStringExtra("error")));
      break;
    case 1: 
      q.b(paramIntent);
      dispatchMessage(paramIntent);
      break;
    case 0: 
      onDeletedMessages();
    }
  }
  
  public static void resetForTesting()
  {
    recentlyReceivedMessageIds.clear();
  }
  
  public Intent getStartCommandIntent(Intent paramIntent)
  {
    return (Intent)ad.poll();
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
        localObject = f.l("Unknown intent action: ");
        ((StringBuilder)localObject).append(paramIntent.getAction());
        Log.d("FirebaseMessaging", ((StringBuilder)localObject).toString());
      }
    }
    else {
      handleMessageIntent(paramIntent);
    }
  }
  
  public void onDeletedMessages() {}
  
  public void onMessageReceived(aa.z paramz) {}
  
  @Deprecated
  public void onMessageSent(String paramString) {}
  
  public void onNewToken(String paramString) {}
  
  @Deprecated
  public void onSendError(String paramString, Exception paramException) {}
  
  public void setRpcForTesting(c paramc)
  {
    rpc = paramc;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.FirebaseMessagingService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */