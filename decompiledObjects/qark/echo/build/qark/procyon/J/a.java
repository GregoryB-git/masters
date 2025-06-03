// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J;

import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import android.text.style.ClickableSpan;

public final class a extends ClickableSpan
{
    public final int a;
    public final u b;
    public final int c;
    
    public a(final int a, final u b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void onClick(final View view) {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.F(this.c, bundle);
    }
}
