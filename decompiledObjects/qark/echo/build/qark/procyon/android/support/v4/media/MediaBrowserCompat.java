// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.media;

import java.lang.ref.Reference;
import android.os.BaseBundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.Process;
import t.a;
import android.media.browse.MediaBrowser;
import android.media.browse.MediaBrowser$ConnectionCallback;
import android.os.BadParcelableException;
import java.util.List;
import android.os.Message;
import android.os.Messenger;
import java.lang.ref.WeakReference;
import android.os.Handler;
import java.util.ArrayList;
import android.text.TextUtils;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;
import b.b;
import android.support.v4.media.session.MediaSessionCompat;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.content.ComponentName;
import android.content.Context;
import android.util.Log;

public final class MediaBrowserCompat
{
    public static final boolean b;
    public final c a;
    
    static {
        b = Log.isLoggable("MediaBrowserCompat", 3);
    }
    
    public MediaBrowserCompat(final Context context, final ComponentName componentName, final b b, final Bundle bundle) {
        d a;
        if (Build$VERSION.SDK_INT >= 26) {
            a = new f(context, componentName, b, bundle);
        }
        else {
            a = new e(context, componentName, b, bundle);
        }
        this.a = (c)a;
    }
    
    public void a() {
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        this.a.a();
    }
    
    public void b() {
        this.a.c();
    }
    
    public MediaSessionCompat.Token c() {
        return this.a.b();
    }
    
    public static class CustomActionResultReceiver extends b
    {
        @Override
        public void a(final int n, final Bundle bundle) {
        }
    }
    
    public static class ItemReceiver extends b
    {
        @Override
        public void a(final int n, final Bundle bundle) {
            Bundle u = bundle;
            if (bundle != null) {
                u = MediaSessionCompat.u(bundle);
            }
            if (n != 0 || u == null || !((BaseBundle)u).containsKey("media_item")) {
                throw null;
            }
            final Parcelable parcelable = u.getParcelable("media_item");
            if (parcelable != null && !(parcelable instanceof MediaItem)) {
                throw null;
            }
            final MediaItem mediaItem = (MediaItem)parcelable;
            throw null;
        }
    }
    
    @SuppressLint({ "BanParcelableUsage" })
    public static class MediaItem implements Parcelable
    {
        public static final Parcelable$Creator<MediaItem> CREATOR;
        public final int o;
        public final MediaDescriptionCompat p;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
                public MediaItem a(final Parcel parcel) {
                    return new MediaItem(parcel);
                }
                
                public MediaItem[] b(final int n) {
                    return new MediaItem[n];
                }
            };
        }
        
        public MediaItem(final Parcel parcel) {
            this.o = parcel.readInt();
            this.p = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
        
        public MediaItem(final MediaDescriptionCompat p2, final int o) {
            if (p2 == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (!TextUtils.isEmpty((CharSequence)p2.g())) {
                this.o = o;
                this.p = p2;
                return;
            }
            throw new IllegalArgumentException("description must have a non-empty media id");
        }
        
        public int describeContents() {
            return 0;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("MediaItem{");
            sb.append("mFlags=");
            sb.append(this.o);
            sb.append(", mDescription=");
            sb.append(this.p);
            sb.append('}');
            return sb.toString();
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeInt(this.o);
            this.p.writeToParcel(parcel, n);
        }
    }
    
    public static class SearchResultReceiver extends b
    {
        @Override
        public void a(int i, final Bundle bundle) {
            Bundle u = bundle;
            if (bundle != null) {
                u = MediaSessionCompat.u(bundle);
            }
            if (i == 0 && u != null && ((BaseBundle)u).containsKey("search_results")) {
                final Parcelable[] parcelableArray = u.getParcelableArray("search_results");
                parcelableArray.getClass();
                final ArrayList list = new ArrayList<MediaItem>(parcelableArray.length);
                int length;
                for (length = parcelableArray.length, i = 0; i < length; ++i) {
                    list.add((MediaItem)parcelableArray[i]);
                }
                throw null;
            }
            throw null;
        }
    }
    
    public static class a extends Handler
    {
        public final WeakReference a;
        public WeakReference b;
        
        public a(final g referent) {
            this.a = new WeakReference((T)referent);
        }
        
        public void a(final Messenger referent) {
            this.b = new WeakReference((T)referent);
        }
        
        public void handleMessage(final Message obj) {
            Object b = this.b;
            if (b == null || ((Reference)b).get() == null) {
                return;
            }
            if (this.a.get() == null) {
                return;
            }
            final Bundle data = obj.getData();
            MediaSessionCompat.a(data);
            b = this.a.get();
            final Messenger messenger = (Messenger)this.b.get();
            while (true) {
                try {
                    final int what = obj.what;
                    if (what == 1) {
                        final Bundle bundle = data.getBundle("data_root_hints");
                        MediaSessionCompat.a(bundle);
                        ((g)b).e(messenger, ((BaseBundle)data).getString("data_media_item_id"), (MediaSessionCompat.Token)data.getParcelable("data_media_session_token"), bundle);
                        return;
                    }
                    if (what == 2) {
                        ((g)b).d(messenger);
                        return;
                    }
                    if (what != 3) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unhandled message: ");
                        sb.append(obj);
                        sb.append("\n  Client version: ");
                        sb.append(1);
                        sb.append("\n  Service version: ");
                        sb.append(obj.arg1);
                        Log.w("MediaBrowserCompat", sb.toString());
                        return;
                    }
                    final Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.a(bundle2);
                    final Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                    MediaSessionCompat.a(bundle3);
                    ((g)b).h(messenger, ((BaseBundle)data).getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                    return;
                    // iftrue(Label_0280:, obj.what != 1)
                    while (true) {
                        ((g)b).d(messenger);
                        return;
                        Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                        continue;
                    }
                    Label_0280: {
                        return;
                    }
                }
                catch (BadParcelableException ex) {}
                continue;
            }
        }
    }
    
    public abstract static class b
    {
        public final MediaBrowser$ConnectionCallback a;
        public MediaBrowserCompat.b.b b;
        
        public b() {
            this.a = new a();
        }
        
        public abstract void a();
        
        public abstract void b();
        
        public abstract void c();
        
        public void d(final MediaBrowserCompat.b.b b) {
            this.b = b;
        }
        
        public class a extends MediaBrowser$ConnectionCallback
        {
            public void onConnected() {
                final MediaBrowserCompat.b.b b = MediaBrowserCompat.b.this.b;
                if (b != null) {
                    b.f();
                }
                MediaBrowserCompat.b.this.a();
            }
            
            public void onConnectionFailed() {
                final MediaBrowserCompat.b.b b = MediaBrowserCompat.b.this.b;
                if (b != null) {
                    b.g();
                }
                MediaBrowserCompat.b.this.b();
            }
            
            public void onConnectionSuspended() {
                final MediaBrowserCompat.b.b b = MediaBrowserCompat.b.this.b;
                if (b != null) {
                    b.i();
                }
                MediaBrowserCompat.b.this.c();
            }
        }
        
        public interface b
        {
            void f();
            
            void g();
            
            void i();
        }
    }
    
    public interface c
    {
        void a();
        
        MediaSessionCompat.Token b();
        
        void c();
    }
    
    public abstract static class d implements c, g, MediaBrowserCompat.b.b
    {
        public final Context a;
        public final MediaBrowser b;
        public final Bundle c;
        public final MediaBrowserCompat.a d;
        public final a e;
        public int f;
        public h g;
        public Messenger h;
        public MediaSessionCompat.Token i;
        
        public d(final Context a, final ComponentName componentName, final MediaBrowserCompat.b b, Bundle c) {
            this.d = new MediaBrowserCompat.a(this);
            this.e = new a();
            this.a = a;
            if (c != null) {
                c = new Bundle(c);
            }
            else {
                c = new Bundle();
            }
            ((BaseBundle)(this.c = c)).putInt("extra_client_version", 1);
            ((BaseBundle)c).putInt("extra_calling_pid", Process.myPid());
            b.d((MediaBrowserCompat.b.b)this);
            this.b = new MediaBrowser(a, componentName, b.a, c);
        }
        
        @Override
        public void a() {
            this.b.connect();
        }
        
        @Override
        public MediaSessionCompat.Token b() {
            if (this.i == null) {
                this.i = MediaSessionCompat.Token.a(this.b.getSessionToken());
            }
            return this.i;
        }
        
        @Override
        public void c() {
            final h g = this.g;
        Label_0034:
            while (true) {
                if (g == null) {
                    break Label_0034;
                }
                final Messenger h = this.h;
                if (h == null) {
                    break Label_0034;
                }
                while (true) {
                    while (true) {
                        try {
                            g.c(h);
                            this.b.disconnect();
                            return;
                            Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                            continue Label_0034;
                        }
                        catch (RemoteException ex) {}
                        continue;
                    }
                }
                break;
            }
        }
        
        @Override
        public void d(final Messenger messenger) {
        }
        
        @Override
        public void e(final Messenger messenger, final String s, final MediaSessionCompat.Token token, final Bundle bundle) {
        }
        
        @Override
        public void f() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        android/support/v4/media/MediaBrowserCompat$d.b:Landroid/media/browse/MediaBrowser;
            //     4: invokevirtual   android/media/browse/MediaBrowser.getExtras:()Landroid/os/Bundle;
            //     7: astore_1       
            //     8: aload_1        
            //     9: ifnonnull       13
            //    12: return         
            //    13: aload_0        
            //    14: aload_1        
            //    15: ldc             "extra_service_version"
            //    17: iconst_0       
            //    18: invokevirtual   android/os/BaseBundle.getInt:(Ljava/lang/String;I)I
            //    21: putfield        android/support/v4/media/MediaBrowserCompat$d.f:I
            //    24: aload_1        
            //    25: ldc             "extra_messenger"
            //    27: invokestatic    w/d.a:(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;
            //    30: astore_2       
            //    31: aload_2        
            //    32: ifnull          102
            //    35: aload_0        
            //    36: new             Landroid/support/v4/media/MediaBrowserCompat$h;
            //    39: dup            
            //    40: aload_2        
            //    41: aload_0        
            //    42: getfield        android/support/v4/media/MediaBrowserCompat$d.c:Landroid/os/Bundle;
            //    45: invokespecial   android/support/v4/media/MediaBrowserCompat$h.<init>:(Landroid/os/IBinder;Landroid/os/Bundle;)V
            //    48: putfield        android/support/v4/media/MediaBrowserCompat$d.g:Landroid/support/v4/media/MediaBrowserCompat$h;
            //    51: new             Landroid/os/Messenger;
            //    54: dup            
            //    55: aload_0        
            //    56: getfield        android/support/v4/media/MediaBrowserCompat$d.d:Landroid/support/v4/media/MediaBrowserCompat$a;
            //    59: invokespecial   android/os/Messenger.<init>:(Landroid/os/Handler;)V
            //    62: astore_2       
            //    63: aload_0        
            //    64: aload_2        
            //    65: putfield        android/support/v4/media/MediaBrowserCompat$d.h:Landroid/os/Messenger;
            //    68: aload_0        
            //    69: getfield        android/support/v4/media/MediaBrowserCompat$d.d:Landroid/support/v4/media/MediaBrowserCompat$a;
            //    72: aload_2        
            //    73: invokevirtual   android/support/v4/media/MediaBrowserCompat$a.a:(Landroid/os/Messenger;)V
            //    76: aload_0        
            //    77: getfield        android/support/v4/media/MediaBrowserCompat$d.g:Landroid/support/v4/media/MediaBrowserCompat$h;
            //    80: aload_0        
            //    81: getfield        android/support/v4/media/MediaBrowserCompat$d.a:Landroid/content/Context;
            //    84: aload_0        
            //    85: getfield        android/support/v4/media/MediaBrowserCompat$d.h:Landroid/os/Messenger;
            //    88: invokevirtual   android/support/v4/media/MediaBrowserCompat$h.a:(Landroid/content/Context;Landroid/os/Messenger;)V
            //    91: goto            102
            //    94: ldc             "MediaBrowserCompat"
            //    96: ldc             "Remote error registering client messenger."
            //    98: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
            //   101: pop            
            //   102: aload_1        
            //   103: ldc             "extra_session_binder"
            //   105: invokestatic    w/d.a:(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;
            //   108: invokestatic    android/support/v4/media/session/b$a.n:(Landroid/os/IBinder;)Landroid/support/v4/media/session/b;
            //   111: astore_1       
            //   112: aload_1        
            //   113: ifnull          131
            //   116: aload_0        
            //   117: aload_0        
            //   118: getfield        android/support/v4/media/MediaBrowserCompat$d.b:Landroid/media/browse/MediaBrowser;
            //   121: invokevirtual   android/media/browse/MediaBrowser.getSessionToken:()Landroid/media/session/MediaSession$Token;
            //   124: aload_1        
            //   125: invokestatic    android/support/v4/media/session/MediaSessionCompat$Token.b:(Ljava/lang/Object;Landroid/support/v4/media/session/b;)Landroid/support/v4/media/session/MediaSessionCompat$Token;
            //   128: putfield        android/support/v4/media/MediaBrowserCompat$d.i:Landroid/support/v4/media/session/MediaSessionCompat$Token;
            //   131: return         
            //   132: astore_1       
            //   133: ldc             "MediaBrowserCompat"
            //   135: ldc             "Unexpected IllegalStateException"
            //   137: aload_1        
            //   138: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   141: pop            
            //   142: return         
            //   143: astore_2       
            //   144: goto            94
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                             
            //  -----  -----  -----  -----  ---------------------------------
            //  0      8      132    143    Ljava/lang/IllegalStateException;
            //  76     91     143    102    Landroid/os/RemoteException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0094:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @Override
        public void g() {
        }
        
        @Override
        public void h(final Messenger messenger, final String str, final List list, final Bundle bundle, final Bundle bundle2) {
            if (this.h != messenger) {
                return;
            }
            android.support.v4.media.a.a(this.e.get(str));
            if (MediaBrowserCompat.b) {
                final StringBuilder sb = new StringBuilder();
                sb.append("onLoadChildren for id that isn't subscribed id=");
                sb.append(str);
                Log.d("MediaBrowserCompat", sb.toString());
            }
        }
        
        @Override
        public void i() {
            this.g = null;
            this.h = null;
            this.i = null;
            this.d.a(null);
        }
    }
    
    public static class e extends d
    {
        public e(final Context context, final ComponentName componentName, final MediaBrowserCompat.b b, final Bundle bundle) {
            super(context, componentName, b, bundle);
        }
    }
    
    public static class f extends e
    {
        public f(final Context context, final ComponentName componentName, final MediaBrowserCompat.b b, final Bundle bundle) {
            super(context, componentName, b, bundle);
        }
    }
    
    public interface g
    {
        void d(final Messenger p0);
        
        void e(final Messenger p0, final String p1, final MediaSessionCompat.Token p2, final Bundle p3);
        
        void h(final Messenger p0, final String p1, final List p2, final Bundle p3, final Bundle p4);
    }
    
    public static class h
    {
        public Messenger a;
        public Bundle b;
        
        public h(final IBinder binder, final Bundle b) {
            this.a = new Messenger(binder);
            this.b = b;
        }
        
        public void a(final Context context, final Messenger messenger) {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putString("data_package_name", context.getPackageName());
            ((BaseBundle)bundle).putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.b);
            this.b(6, bundle, messenger);
        }
        
        public final void b(final int what, final Bundle data, final Messenger replyTo) {
            final Message obtain = Message.obtain();
            obtain.what = what;
            obtain.arg1 = 1;
            obtain.setData(data);
            obtain.replyTo = replyTo;
            this.a.send(obtain);
        }
        
        public void c(final Messenger messenger) {
            this.b(7, null, messenger);
        }
    }
}
