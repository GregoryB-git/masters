package i6;

import android.content.Intent;
import android.os.BaseBundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class h
  extends zzf
{
  public h(c paramc, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    c localc = a;
    if (paramMessage != null)
    {
      Object localObject1 = obj;
      if ((localObject1 instanceof Intent))
      {
        localObject1 = (Intent)localObject1;
        ((Intent)localObject1).setExtrasClassLoader(new j());
        if (((Intent)localObject1).hasExtra("google.messenger"))
        {
          localObject1 = ((Intent)localObject1).getParcelableExtra("google.messenger");
          if ((localObject1 instanceof k)) {
            g = ((k)localObject1);
          }
          if ((localObject1 instanceof Messenger)) {
            f = ((Messenger)localObject1);
          }
        }
        Intent localIntent = (Intent)obj;
        paramMessage = localIntent.getAction();
        if (!Objects.equals(paramMessage, "com.google.android.c2dm.intent.REGISTRATION"))
        {
          if (!Log.isLoggable("Rpc", 3)) {
            return;
          }
          Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(paramMessage)));
          return;
        }
        localObject1 = localIntent.getStringExtra("registration_id");
        paramMessage = (Message)localObject1;
        if (localObject1 == null) {
          paramMessage = localIntent.getStringExtra("unregistered");
        }
        Object localObject3;
        String str;
        if (paramMessage == null)
        {
          localObject1 = localIntent.getStringExtra("error");
          if (localObject1 == null)
          {
            Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(localIntent.getExtras())));
            return;
          }
          if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Received InstanceID error ".concat((String)localObject1));
          }
          if (((String)localObject1).startsWith("|"))
          {
            paramMessage = ((String)localObject1).split("\\|");
            if ((paramMessage.length > 2) && (Objects.equals(paramMessage[1], "ID")))
            {
              localObject1 = paramMessage[2];
              localObject3 = paramMessage[3];
              paramMessage = (Message)localObject3;
              if (((String)localObject3).startsWith(":")) {
                paramMessage = ((String)localObject3).substring(1);
              }
              paramMessage = localIntent.putExtra("error", paramMessage).getExtras();
            }
            else
            {
              Log.w("Rpc", "Unexpected structured response ".concat((String)localObject1));
              return;
            }
          }
          else
          {
            paramMessage = a;
            int i = 0;
            try
            {
              for (;;)
              {
                localObject1 = a;
                if (i >= c) {
                  break;
                }
                localObject1 = (String)((r.h)localObject1).i(i);
                localc.c(localIntent.getExtras(), (String)localObject1);
                i++;
              }
            }
            finally {}
          }
        }
        else
        {
          localObject3 = c.j.matcher(paramMessage);
          if (!((Matcher)localObject3).matches())
          {
            if (!Log.isLoggable("Rpc", 3)) {
              return;
            }
            Log.d("Rpc", "Unexpected response string: ".concat(paramMessage));
            return;
          }
          str = ((Matcher)localObject3).group(1);
          localObject3 = ((Matcher)localObject3).group(2);
          if (str == null) {
            return;
          }
          paramMessage = localIntent.getExtras();
          paramMessage.putString("registration_id", (String)localObject3);
        }
        localc.c(paramMessage, str);
        return;
      }
    }
    Log.w("Rpc", "Dropping invalid message");
  }
}

/* Location:
 * Qualified Name:     i6.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */