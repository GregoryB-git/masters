package i6;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.Objects;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class h extends zzf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f7586a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c cVar, Looper looper) {
        super(looper);
        this.f7586a = cVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String group;
        Bundle extras;
        c cVar = this.f7586a;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new j());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof k) {
                        cVar.f7579g = (k) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        cVar.f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra("error");
                    if (stringExtra2 == null) {
                        Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                        return;
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                    }
                    if (!stringExtra2.startsWith("|")) {
                        synchronized (cVar.f7574a) {
                            int i10 = 0;
                            while (true) {
                                r.h hVar = cVar.f7574a;
                                if (i10 < hVar.f13500c) {
                                    cVar.c(intent2.getExtras(), (String) hVar.i(i10));
                                    i10++;
                                }
                            }
                        }
                        return;
                    }
                    String[] split = stringExtra2.split("\\|");
                    if (split.length <= 2 || !Objects.equals(split[1], "ID")) {
                        Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                        return;
                    }
                    group = split[2];
                    String str = split[3];
                    if (str.startsWith(":")) {
                        str = str.substring(1);
                    }
                    extras = intent2.putExtra("error", str).getExtras();
                } else {
                    Matcher matcher = c.f7573j.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    } else {
                        group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (group == null) {
                            return;
                        }
                        extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                    }
                }
                cVar.c(extras, group);
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }
}
