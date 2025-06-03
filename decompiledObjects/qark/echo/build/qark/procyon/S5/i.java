// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S5;

import android.os.BaseBundle;
import java.util.List;
import q.b;
import java.util.Collections;
import io.flutter.plugins.urllauncher.WebViewActivity;
import android.content.ActivityNotFoundException;
import q.c;
import android.net.Uri;
import android.content.ComponentName;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import android.content.Intent;
import android.app.Activity;
import android.content.Context;

public final class i implements b
{
    public final Context a;
    public final a b;
    public Activity c;
    
    public i(final Context context) {
        this(context, (a)new h(context));
    }
    
    public i(final Context a, final a b) {
        this.a = a;
        this.b = b;
    }
    
    public static boolean g(final Map map) {
        final Iterator<String> iterator = map.keySet().iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            int n = 0;
            if (!hasNext) {
                return false;
            }
            final String lowerCase = iterator.next().toLowerCase(Locale.US);
            lowerCase.hashCode();
            Label_0160: {
                switch (lowerCase) {
                    case "accept-language": {
                        n = 3;
                        break Label_0160;
                    }
                    case "content-type": {
                        n = 2;
                        break Label_0160;
                    }
                    case "content-language": {
                        n = 1;
                        break Label_0160;
                    }
                    case "accept": {
                        break Label_0160;
                    }
                    default:
                        break;
                }
                n = -1;
            }
            switch (n) {
                case 0:
                case 1:
                case 2:
                case 3: {
                    continue;
                }
                default: {
                    return true;
                }
            }
        }
    }
    
    public static Bundle i(final Map map) {
        final Bundle bundle = new Bundle();
        for (final String s : map.keySet()) {
            ((BaseBundle)bundle).putString(s, (String)map.get(s));
        }
        return bundle;
    }
    
    public static boolean k(final Context context, final Uri uri, final Bundle bundle) {
        final q.c a = new q.c.b().a();
        a.a.putExtra("com.android.browser.headers", bundle);
        try {
            a.a(context, uri);
            return true;
        }
        catch (ActivityNotFoundException ex) {
            return false;
        }
    }
    
    @Override
    public Boolean a(String a) {
        final Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(a));
        a = this.b.a(intent);
        if (a == null) {
            return Boolean.FALSE;
        }
        return "{com.android.fallback/com.android.fallback.Fallback}".equals(a) ^ true;
    }
    
    @Override
    public Boolean b(final String s, final Boolean b, final d d) {
        this.h();
        final Bundle i = i(d.d());
        if (b && !g(d.d()) && k((Context)this.c, Uri.parse(s), i)) {
            return Boolean.TRUE;
        }
        final Intent a = WebViewActivity.a((Context)this.c, s, d.c(), d.b(), i);
        try {
            this.c.startActivity(a);
            return Boolean.TRUE;
        }
        catch (ActivityNotFoundException ex) {
            return Boolean.FALSE;
        }
    }
    
    @Override
    public void c() {
        this.a.sendBroadcast(new Intent("close action"));
    }
    
    @Override
    public Boolean d(final String s, final Map map) {
        this.h();
        final Intent putExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(s)).putExtra("com.android.browser.headers", i(map));
        try {
            this.c.startActivity(putExtra);
            return Boolean.TRUE;
        }
        catch (ActivityNotFoundException ex) {
            return Boolean.FALSE;
        }
    }
    
    @Override
    public Boolean e() {
        return q.b.a(this.a, Collections.emptyList()) != null;
    }
    
    public final void h() {
        if (this.c != null) {
            return;
        }
        throw new S5.a.a("NO_ACTIVITY", "Launching a URL requires a foreground activity.", null);
    }
    
    public void l(final Activity c) {
        this.c = c;
    }
    
    public interface a
    {
        String a(final Intent p0);
    }
}
