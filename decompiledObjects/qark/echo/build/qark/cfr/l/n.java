/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.textclassifier.TextClassificationManager
 *  android.view.textclassifier.TextClassifier
 *  android.widget.TextView
 *  java.lang.Class
 *  java.lang.Object
 */
package l;

import H.e;
import android.content.Context;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import l.j;
import l.k;
import l.l;
import l.m;

public final class n {
    public TextView a;
    public TextClassifier b;

    public n(TextView textView) {
        this.a = (TextView)e.b((Object)textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier;
        TextClassifier textClassifier2 = textClassifier = this.b;
        if (textClassifier == null) {
            textClassifier2 = k.a(this.a.getContext().getSystemService(j.a()));
            if (textClassifier2 != null) {
                return l.a((TextClassificationManager)textClassifier2);
            }
            textClassifier2 = m.a();
        }
        return textClassifier2;
    }

    public void b(TextClassifier textClassifier) {
        this.b = textClassifier;
    }
}

