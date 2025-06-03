package u;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f14871a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f14872b;

    /* renamed from: c, reason: collision with root package name */
    public String f14873c;

    /* renamed from: d, reason: collision with root package name */
    public String f14874d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14875e;
    public boolean f;

    public static class a {
        public static x a(Person person) {
            IconCompat iconCompat;
            b bVar = new b();
            bVar.f14876a = person.getName();
            IconCompat iconCompat2 = null;
            if (person.getIcon() != null) {
                Icon icon = person.getIcon();
                PorterDuff.Mode mode = IconCompat.f941k;
                icon.getClass();
                int c10 = IconCompat.a.c(icon);
                if (c10 != 2) {
                    if (c10 == 4) {
                        Uri d10 = IconCompat.a.d(icon);
                        d10.getClass();
                        String uri = d10.toString();
                        uri.getClass();
                        iconCompat = new IconCompat(4);
                        iconCompat.f943b = uri;
                    } else if (c10 != 6) {
                        iconCompat2 = new IconCompat(-1);
                        iconCompat2.f943b = icon;
                    } else {
                        Uri d11 = IconCompat.a.d(icon);
                        d11.getClass();
                        String uri2 = d11.toString();
                        uri2.getClass();
                        iconCompat = new IconCompat(6);
                        iconCompat.f943b = uri2;
                    }
                    iconCompat2 = iconCompat;
                } else {
                    iconCompat2 = IconCompat.d(null, IconCompat.a.b(icon), IconCompat.a.a(icon));
                }
            }
            bVar.f14877b = iconCompat2;
            bVar.f14878c = person.getUri();
            bVar.f14879d = person.getKey();
            bVar.f14880e = person.isBot();
            bVar.f = person.isImportant();
            return new x(bVar);
        }

        public static Person b(x xVar) {
            Person.Builder name = new Object() { // from class: android.app.Person.Builder
                static {
                    throw new NoClassDefFoundError();
                }

                @NonNull
                public native /* synthetic */ Person build();

                @NonNull
                public native /* synthetic */ Builder setBot(boolean z10);

                @NonNull
                public native /* synthetic */ Builder setIcon(@Nullable Icon icon);

                @NonNull
                public native /* synthetic */ Builder setImportant(boolean z10);

                @NonNull
                public native /* synthetic */ Builder setKey(@Nullable String str);

                @NonNull
                public native /* synthetic */ Builder setName(@Nullable CharSequence charSequence);

                @NonNull
                public native /* synthetic */ Builder setUri(@Nullable String str);
            }.setName(xVar.f14871a);
            IconCompat iconCompat = xVar.f14872b;
            Icon icon = null;
            if (iconCompat != null) {
                iconCompat.getClass();
                icon = IconCompat.a.f(iconCompat, null);
            }
            return name.setIcon(icon).setUri(xVar.f14873c).setKey(xVar.f14874d).setBot(xVar.f14875e).setImportant(xVar.f).build();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public CharSequence f14876a;

        /* renamed from: b, reason: collision with root package name */
        public IconCompat f14877b;

        /* renamed from: c, reason: collision with root package name */
        public String f14878c;

        /* renamed from: d, reason: collision with root package name */
        public String f14879d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f14880e;
        public boolean f;
    }

    public x(b bVar) {
        this.f14871a = bVar.f14876a;
        this.f14872b = bVar.f14877b;
        this.f14873c = bVar.f14878c;
        this.f14874d = bVar.f14879d;
        this.f14875e = bVar.f14880e;
        this.f = bVar.f;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        String str = this.f14874d;
        String str2 = xVar.f14874d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(this.f14871a), Objects.toString(xVar.f14871a)) && Objects.equals(this.f14873c, xVar.f14873c) && Objects.equals(Boolean.valueOf(this.f14875e), Boolean.valueOf(xVar.f14875e)) && Objects.equals(Boolean.valueOf(this.f), Boolean.valueOf(xVar.f)) : Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.f14874d;
        return str != null ? str.hashCode() : Objects.hash(this.f14871a, this.f14873c, Boolean.valueOf(this.f14875e), Boolean.valueOf(this.f));
    }
}
