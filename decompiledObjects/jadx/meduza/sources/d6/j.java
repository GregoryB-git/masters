package d6;

import android.app.PendingIntent;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public interface j {
    Task<c> beginSignIn(b bVar);

    Task<PendingIntent> getSignInIntent(f fVar);
}
