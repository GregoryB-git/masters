package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import b.a0;
import g.n;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class AlertController {
    public TextView A;
    public TextView B;
    public View C;
    public ListAdapter D;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public c L;

    /* renamed from: a, reason: collision with root package name */
    public final Context f544a;

    /* renamed from: b, reason: collision with root package name */
    public final n f545b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f546c;

    /* renamed from: d, reason: collision with root package name */
    public final int f547d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f548e;
    public CharSequence f;

    /* renamed from: g, reason: collision with root package name */
    public RecycleListView f549g;

    /* renamed from: h, reason: collision with root package name */
    public View f550h;

    /* renamed from: i, reason: collision with root package name */
    public int f551i;

    /* renamed from: k, reason: collision with root package name */
    public Button f553k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f554l;

    /* renamed from: m, reason: collision with root package name */
    public Message f555m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f556n;

    /* renamed from: o, reason: collision with root package name */
    public Button f557o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f558p;

    /* renamed from: q, reason: collision with root package name */
    public Message f559q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f560r;

    /* renamed from: s, reason: collision with root package name */
    public Button f561s;
    public CharSequence t;

    /* renamed from: u, reason: collision with root package name */
    public Message f562u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f563v;

    /* renamed from: w, reason: collision with root package name */
    public NestedScrollView f564w;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f566y;

    /* renamed from: z, reason: collision with root package name */
    public ImageView f567z;

    /* renamed from: j, reason: collision with root package name */
    public boolean f552j = false;

    /* renamed from: x, reason: collision with root package name */
    public int f565x = 0;
    public int E = -1;
    public final a M = new a();

    public static class RecycleListView extends ListView {

        /* renamed from: a, reason: collision with root package name */
        public final int f568a;

        /* renamed from: b, reason: collision with root package name */
        public final int f569b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.G);
            this.f569b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f568a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message obtain = ((view != alertController.f553k || (message2 = alertController.f555m) == null) && (view != alertController.f557o || (message2 = alertController.f559q) == null)) ? (view != alertController.f561s || (message = alertController.f562u) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.L.obtainMessage(1, alertController2.f545b).sendToTarget();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f571a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f572b;

        /* renamed from: c, reason: collision with root package name */
        public Drawable f573c;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f574d;

        /* renamed from: e, reason: collision with root package name */
        public View f575e;
        public CharSequence f;

        /* renamed from: g, reason: collision with root package name */
        public CharSequence f576g;

        /* renamed from: h, reason: collision with root package name */
        public DialogInterface.OnClickListener f577h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f578i;

        /* renamed from: j, reason: collision with root package name */
        public DialogInterface.OnClickListener f579j;

        /* renamed from: k, reason: collision with root package name */
        public DialogInterface.OnCancelListener f580k;

        /* renamed from: l, reason: collision with root package name */
        public DialogInterface.OnKeyListener f581l;

        /* renamed from: m, reason: collision with root package name */
        public ListAdapter f582m;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f583n;

        /* renamed from: o, reason: collision with root package name */
        public View f584o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f585p;

        /* renamed from: q, reason: collision with root package name */
        public int f586q = -1;

        public b(ContextThemeWrapper contextThemeWrapper) {
            this.f571a = contextThemeWrapper;
            this.f572b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    public static final class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public WeakReference<DialogInterface> f587a;

        public c(DialogInterface dialogInterface) {
            this.f587a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f587a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i10) {
            super(context, i10, R.id.text1, (Object[]) null);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, n nVar, Window window) {
        this.f544a = context;
        this.f545b = nVar;
        this.f546c = window;
        this.L = new c(nVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, a0.f1577r, io.meduza.meduza.R.attr.alertDialogStyle, 0);
        this.F = obtainStyledAttributes.getResourceId(0, 0);
        this.G = obtainStyledAttributes.getResourceId(2, 0);
        this.H = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.I = obtainStyledAttributes.getResourceId(7, 0);
        this.J = obtainStyledAttributes.getResourceId(3, 0);
        this.K = obtainStyledAttributes.getBoolean(6, true);
        this.f547d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        nVar.c().w(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void b(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public static ViewGroup c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void d(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.L.obtainMessage(i10, onClickListener) : null;
        if (i10 == -3) {
            this.t = charSequence;
            this.f562u = obtainMessage;
            this.f563v = null;
        } else if (i10 == -2) {
            this.f558p = charSequence;
            this.f559q = obtainMessage;
            this.f560r = null;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f554l = charSequence;
            this.f555m = obtainMessage;
            this.f556n = null;
        }
    }
}
