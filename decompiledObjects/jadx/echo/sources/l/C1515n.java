package l;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: l.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1515n {

    /* renamed from: a, reason: collision with root package name */
    public TextView f16465a;

    /* renamed from: b, reason: collision with root package name */
    public TextClassifier f16466b;

    public C1515n(TextView textView) {
        this.f16465a = (TextView) H.e.b(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier;
        TextClassifier textClassifier2;
        TextClassifier textClassifier3 = this.f16466b;
        if (textClassifier3 != null) {
            return textClassifier3;
        }
        TextClassificationManager a7 = AbstractC1512k.a(this.f16465a.getContext().getSystemService(AbstractC1511j.a()));
        if (a7 != null) {
            textClassifier2 = a7.getTextClassifier();
            return textClassifier2;
        }
        textClassifier = TextClassifier.NO_OP;
        return textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f16466b = textClassifier;
    }
}
