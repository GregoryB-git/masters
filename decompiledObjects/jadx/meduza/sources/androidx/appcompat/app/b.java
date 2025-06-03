package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import g.n;
import io.meduza.meduza.R;

/* loaded from: classes.dex */
public final class b extends n {
    public final AlertController f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final AlertController.b f590a;

        /* renamed from: b, reason: collision with root package name */
        public final int f591b;

        public a(Context context) {
            this(context, b.e(context, 0));
        }

        public a(Context context, int i10) {
            this.f590a = new AlertController.b(new ContextThemeWrapper(context, b.e(context, i10)));
            this.f591b = i10;
        }

        public b create() {
            b bVar = new b(this.f590a.f571a, this.f591b);
            AlertController.b bVar2 = this.f590a;
            AlertController alertController = bVar.f;
            View view = bVar2.f575e;
            if (view != null) {
                alertController.C = view;
            } else {
                CharSequence charSequence = bVar2.f574d;
                if (charSequence != null) {
                    alertController.f548e = charSequence;
                    TextView textView = alertController.A;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar2.f573c;
                if (drawable != null) {
                    alertController.f566y = drawable;
                    alertController.f565x = 0;
                    ImageView imageView = alertController.f567z;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f567z.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = bVar2.f;
            if (charSequence2 != null) {
                alertController.f = charSequence2;
                TextView textView2 = alertController.B;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar2.f576g;
            if (charSequence3 != null) {
                alertController.d(-1, charSequence3, bVar2.f577h);
            }
            CharSequence charSequence4 = bVar2.f578i;
            if (charSequence4 != null) {
                alertController.d(-2, charSequence4, bVar2.f579j);
            }
            if (bVar2.f582m != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar2.f572b.inflate(alertController.H, (ViewGroup) null);
                int i10 = bVar2.f585p ? alertController.I : alertController.J;
                ListAdapter listAdapter = bVar2.f582m;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar2.f571a, i10);
                }
                alertController.D = listAdapter;
                alertController.E = bVar2.f586q;
                if (bVar2.f583n != null) {
                    recycleListView.setOnItemClickListener(new androidx.appcompat.app.a(bVar2, alertController));
                }
                if (bVar2.f585p) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f549g = recycleListView;
            }
            View view2 = bVar2.f584o;
            if (view2 != null) {
                alertController.f550h = view2;
                alertController.f551i = 0;
                alertController.f552j = false;
            }
            this.f590a.getClass();
            bVar.setCancelable(true);
            this.f590a.getClass();
            bVar.setCanceledOnTouchOutside(true);
            bVar.setOnCancelListener(this.f590a.f580k);
            this.f590a.getClass();
            bVar.setOnDismissListener(null);
            DialogInterface.OnKeyListener onKeyListener = this.f590a.f581l;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context getContext() {
            return this.f590a.f571a;
        }

        public a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f590a;
            bVar.f578i = bVar.f571a.getText(i10);
            this.f590a.f579j = onClickListener;
            return this;
        }

        public a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f590a;
            bVar.f576g = bVar.f571a.getText(i10);
            this.f590a.f577h = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f590a.f574d = charSequence;
            return this;
        }

        public a setView(View view) {
            this.f590a.f584o = view;
            return this;
        }
    }

    public b(Context context, int i10) {
        super(context, e(context, i10));
        this.f = new AlertController(getContext(), this, getWindow());
    }

    public static int e(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02f5  */
    @Override // g.n, b.l, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 867
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.b.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.f564w;
        if (nestedScrollView != null && nestedScrollView.e(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.f564w;
        if (nestedScrollView != null && nestedScrollView.e(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // g.n, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f;
        alertController.f548e = charSequence;
        TextView textView = alertController.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
