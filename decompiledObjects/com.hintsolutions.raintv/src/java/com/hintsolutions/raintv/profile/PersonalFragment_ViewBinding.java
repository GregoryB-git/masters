/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.TextView
 *  androidx.annotation.CallSuper
 *  androidx.annotation.UiThread
 *  butterknife.Unbinder
 *  butterknife.internal.DebouncingOnClickListener
 *  butterknife.internal.Utils
 *  com.hintsolutions.raintv.profile.PersonalFragment
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.profile;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.profile.PersonalFragment;

public class PersonalFragment_ViewBinding
implements Unbinder {
    private PersonalFragment target;
    private View view7f090169;
    private View view7f0901f8;
    private View view7f090334;
    private View view7f09038b;
    private View view7f090411;
    private View view7f09043d;

    @UiThread
    public PersonalFragment_ViewBinding(PersonalFragment personalFragment, View view) {
        this.target = personalFragment;
        personalFragment.firstnameEditText = (EditText)Utils.findRequiredViewAsType((View)view, (int)2131296629, (String)"field 'firstnameEditText'", EditText.class);
        personalFragment.lastnameEditText = (EditText)Utils.findRequiredViewAsType((View)view, (int)2131296727, (String)"field 'lastnameEditText'", EditText.class);
        personalFragment.emailEditText = (EditText)Utils.findRequiredViewAsType((View)view, (int)2131296580, (String)"field 'emailEditText'", EditText.class);
        View view2 = Utils.findRequiredView((View)view, (int)2131297163, (String)"field 'linkButton' and method 'startlinking'");
        personalFragment.linkButton = (Button)Utils.castView((View)view2, (int)2131297163, (String)"field 'linkButton'", Button.class);
        this.view7f09038b = view2;
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, personalFragment){
            public final PersonalFragment_ViewBinding this$0;
            public final PersonalFragment val$target;
            {
                this.this$0 = personalFragment_ViewBinding;
                this.val$target = personalFragment;
            }

            public void doClick(View view) {
                this.val$target.startlinking();
            }
        });
        personalFragment.userid = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297310, (String)"field 'userid'", TextView.class);
        personalFragment.versionView = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296363, (String)"field 'versionView'", TextView.class);
        this.view7f090169 = view2 = Utils.findRequiredView((View)view, (int)2131296617, (String)"method 'linkFacebook'");
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, personalFragment){
            public final PersonalFragment_ViewBinding this$0;
            public final PersonalFragment val$target;
            {
                this.this$0 = personalFragment_ViewBinding;
                this.val$target = personalFragment;
            }

            public void doClick(View view) {
                this.val$target.linkFacebook();
            }
        });
        this.view7f09043d = view2 = Utils.findRequiredView((View)view, (int)2131297341, (String)"method 'linkVk'");
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, personalFragment){
            public final PersonalFragment_ViewBinding this$0;
            public final PersonalFragment val$target;
            {
                this.this$0 = personalFragment_ViewBinding;
                this.val$target = personalFragment;
            }

            public void doClick(View view) {
                this.val$target.linkVk();
            }
        });
        this.view7f090411 = view2 = Utils.findRequiredView((View)view, (int)2131297297, (String)"method 'linkTwitter'");
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, personalFragment){
            public final PersonalFragment_ViewBinding this$0;
            public final PersonalFragment val$target;
            {
                this.this$0 = personalFragment_ViewBinding;
                this.val$target = personalFragment;
            }

            public void doClick(View view) {
                this.val$target.linkTwitter();
            }
        });
        this.view7f090334 = view2 = Utils.findRequiredView((View)view, (int)2131297076, (String)"method 'save'");
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, personalFragment){
            public final PersonalFragment_ViewBinding this$0;
            public final PersonalFragment val$target;
            {
                this.this$0 = personalFragment_ViewBinding;
                this.val$target = personalFragment;
            }

            public void doClick(View view) {
                this.val$target.save();
            }
        });
        this.view7f0901f8 = view = Utils.findRequiredView((View)view, (int)2131296760, (String)"method 'logout'");
        view.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, personalFragment){
            public final PersonalFragment_ViewBinding this$0;
            public final PersonalFragment val$target;
            {
                this.this$0 = personalFragment_ViewBinding;
                this.val$target = personalFragment;
            }

            public void doClick(View view) {
                this.val$target.logout();
            }
        });
    }

    @CallSuper
    public void unbind() {
        PersonalFragment personalFragment = this.target;
        if (personalFragment != null) {
            this.target = null;
            personalFragment.firstnameEditText = null;
            personalFragment.lastnameEditText = null;
            personalFragment.emailEditText = null;
            personalFragment.linkButton = null;
            personalFragment.userid = null;
            personalFragment.versionView = null;
            this.view7f09038b.setOnClickListener(null);
            this.view7f09038b = null;
            this.view7f090169.setOnClickListener(null);
            this.view7f090169 = null;
            this.view7f09043d.setOnClickListener(null);
            this.view7f09043d = null;
            this.view7f090411.setOnClickListener(null);
            this.view7f090411 = null;
            this.view7f090334.setOnClickListener(null);
            this.view7f090334 = null;
            this.view7f0901f8.setOnClickListener(null);
            this.view7f0901f8 = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

