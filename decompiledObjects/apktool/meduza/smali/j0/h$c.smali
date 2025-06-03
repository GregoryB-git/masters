.class public final Lj0/h$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# direct methods
.method public static a(Landroid/text/PrecomputedText;)Ljava/lang/CharSequence;
    .locals 0

    return-object p0
.end method

.method public static b(Landroid/icu/text/DecimalFormatSymbols;)[Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Ld2/k;->l(Landroid/icu/text/DecimalFormatSymbols;)[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/widget/TextView;)Landroid/text/PrecomputedText$Params;
    .locals 0

    invoke-static {p0}, Lcom/google/android/recaptcha/internal/a;->h(Landroid/widget/TextView;)Landroid/text/PrecomputedText$Params;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/widget/TextView;I)V
    .locals 0

    invoke-static {p0, p1}, Landroid/support/v4/media/session/b;->n(Landroid/widget/TextView;I)V

    return-void
.end method
