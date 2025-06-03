.class public Lio/flutter/view/i$c;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/view/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lio/flutter/view/i;


# direct methods
.method public constructor <init>(Lio/flutter/view/i;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/view/i$c;->a:Lio/flutter/view/i;

    invoke-direct {p0, p2}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public onChange(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lio/flutter/view/i$c;->onChange(ZLandroid/net/Uri;)V

    return-void
.end method

.method public onChange(ZLandroid/net/Uri;)V
    .locals 0

    .line 2
    iget-object p1, p0, Lio/flutter/view/i$c;->a:Lio/flutter/view/i;

    invoke-static {p1}, Lio/flutter/view/i;->k(Lio/flutter/view/i;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lio/flutter/view/i$c;->a:Lio/flutter/view/i;

    invoke-static {p1}, Lio/flutter/view/i;->d(Lio/flutter/view/i;)Landroid/content/ContentResolver;

    move-result-object p1

    const-string p2, "transition_animation_scale"

    invoke-static {p1, p2}, Landroid/provider/Settings$Global;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string p2, "0"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/flutter/view/i$c;->a:Lio/flutter/view/i;

    sget-object p2, Lio/flutter/view/i$f;->r:Lio/flutter/view/i$f;

    iget p2, p2, Lio/flutter/view/i$f;->o:I

    invoke-static {p1, p2}, Lio/flutter/view/i;->f(Lio/flutter/view/i;I)I

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lio/flutter/view/i$c;->a:Lio/flutter/view/i;

    sget-object p2, Lio/flutter/view/i$f;->r:Lio/flutter/view/i$f;

    iget p2, p2, Lio/flutter/view/i$f;->o:I

    not-int p2, p2

    invoke-static {p1, p2}, Lio/flutter/view/i;->e(Lio/flutter/view/i;I)I

    :goto_0
    iget-object p1, p0, Lio/flutter/view/i$c;->a:Lio/flutter/view/i;

    invoke-static {p1}, Lio/flutter/view/i;->g(Lio/flutter/view/i;)V

    return-void
.end method
