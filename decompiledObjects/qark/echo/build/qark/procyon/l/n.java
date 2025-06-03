// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import android.view.View;
import android.view.textclassifier.TextClassificationManager;
import H.e;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

public final class n
{
    public TextView a;
    public TextClassifier b;
    
    public n(final TextView textView) {
        this.a = (TextView)e.b(textView);
    }
    
    public TextClassifier a() {
        TextClassifier textClassifier;
        if ((textClassifier = this.b) == null) {
            final TextClassificationManager a = k.a(((View)this.a).getContext().getSystemService(j.a()));
            if (a != null) {
                return l.a(a);
            }
            textClassifier = m.a();
        }
        return textClassifier;
    }
    
    public void b(final TextClassifier b) {
        this.b = b;
    }
}
