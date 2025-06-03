package z5;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

/* loaded from: classes.dex */
public final class e extends UserRecoverableAuthException {
    public e(String str, Intent intent) {
        super(str, intent, 1);
    }
}
