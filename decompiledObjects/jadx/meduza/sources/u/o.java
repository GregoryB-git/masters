package u;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class o extends s {

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f14817b;

    /* renamed from: c, reason: collision with root package name */
    public IconCompat f14818c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14819d;

    public static class a {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigLargeIcon(icon);
        }
    }

    public static class b {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigPicture(icon);
        }

        public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setContentDescription(charSequence);
        }

        public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
            bigPictureStyle.showBigPictureWhenCollapsed(z10);
        }
    }

    @Override // u.s
    public final void b(t tVar) {
        Bitmap c10;
        Object obj;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(tVar.f14847b).setBigContentTitle(null);
        IconCompat iconCompat = this.f14817b;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                b.a(bigContentTitle, IconCompat.a.f(iconCompat, tVar.f14846a));
            } else {
                int i10 = iconCompat.f942a;
                if (i10 == -1) {
                    i10 = IconCompat.a.c(iconCompat.f943b);
                }
                if (i10 == 1) {
                    IconCompat iconCompat2 = this.f14817b;
                    int i11 = iconCompat2.f942a;
                    if (i11 == -1) {
                        obj = iconCompat2.f943b;
                        if (!(obj instanceof Bitmap)) {
                            c10 = null;
                            bigContentTitle = bigContentTitle.bigPicture(c10);
                        }
                        c10 = (Bitmap) obj;
                        bigContentTitle = bigContentTitle.bigPicture(c10);
                    } else if (i11 == 1) {
                        obj = iconCompat2.f943b;
                        c10 = (Bitmap) obj;
                        bigContentTitle = bigContentTitle.bigPicture(c10);
                    } else {
                        if (i11 != 5) {
                            throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                        }
                        c10 = IconCompat.c((Bitmap) iconCompat2.f943b, true);
                        bigContentTitle = bigContentTitle.bigPicture(c10);
                    }
                }
            }
        }
        if (this.f14819d) {
            IconCompat iconCompat3 = this.f14818c;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                a.a(bigContentTitle, IconCompat.a.f(iconCompat3, tVar.f14846a));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            b.c(bigContentTitle, false);
            b.b(bigContentTitle, null);
        }
    }

    @Override // u.s
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
