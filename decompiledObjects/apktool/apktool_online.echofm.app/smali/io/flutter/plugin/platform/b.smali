.class public Lio/flutter/plugin/platform/b;
.super Lu5/r;
.source "SourceFile"


# instance fields
.field public u:Lio/flutter/plugin/platform/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;IILio/flutter/plugin/platform/a;)V
    .locals 1

    sget-object v0, Lu5/r$b;->p:Lu5/r$b;

    invoke-direct {p0, p1, p2, p3, v0}, Lu5/r;-><init>(Landroid/content/Context;IILu5/r$b;)V

    iput-object p4, p0, Lio/flutter/plugin/platform/b;->u:Lio/flutter/plugin/platform/a;

    return-void
.end method


# virtual methods
.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/platform/b;->u:Lio/flutter/plugin/platform/a;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lio/flutter/plugin/platform/a;->a(Landroid/view/MotionEvent;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
