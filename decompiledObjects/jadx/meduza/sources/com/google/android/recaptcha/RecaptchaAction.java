package com.google.android.recaptcha;

import defpackage.f;
import defpackage.g;
import ec.e;
import ec.i;

/* loaded from: classes.dex */
public final class RecaptchaAction {
    public static final Companion Companion = new Companion(null);
    public static final RecaptchaAction LOGIN = new RecaptchaAction("login");
    public static final RecaptchaAction SIGNUP = new RecaptchaAction("signup");
    private final String action;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final RecaptchaAction custom(String str) {
            return new RecaptchaAction(str, null);
        }
    }

    private RecaptchaAction(String str) {
        this.action = str;
    }

    public /* synthetic */ RecaptchaAction(String str, e eVar) {
        this(str);
    }

    public static /* synthetic */ RecaptchaAction copy$default(RecaptchaAction recaptchaAction, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = recaptchaAction.action;
        }
        return recaptchaAction.copy(str);
    }

    public static final RecaptchaAction custom(String str) {
        return Companion.custom(str);
    }

    public final String component1() {
        return this.action;
    }

    public final RecaptchaAction copy(String str) {
        return new RecaptchaAction(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecaptchaAction) && i.a(this.action, ((RecaptchaAction) obj).action);
    }

    public final String getAction() {
        return this.action;
    }

    public int hashCode() {
        return this.action.hashCode();
    }

    public String toString() {
        return g.f(f.l("RecaptchaAction(action="), this.action, ")");
    }
}
