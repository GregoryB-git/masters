.class public abstract Lu/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lu/q;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 2

    invoke-virtual {p0}, Lu/s;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "androidx.core.app.extra.COMPAT_TEMPLATE"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public abstract b(Lu/t;)V
.end method

.method public c()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public final f(Lu/q;)V
    .locals 1

    iget-object v0, p0, Lu/s;->a:Lu/q;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lu/s;->a:Lu/q;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Lu/q;->g(Lu/s;)V

    :cond_0
    return-void
.end method
