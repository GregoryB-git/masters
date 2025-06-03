.class public Lio/flutter/plugin/platform/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lio/flutter/view/i;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/MotionEvent;Z)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/a;->a:Lio/flutter/view/i;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {v0, p1, p2}, Lio/flutter/view/i;->L(Landroid/view/MotionEvent;Z)Z

    move-result p1

    return p1
.end method

.method public b(Lio/flutter/view/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/flutter/plugin/platform/a;->a:Lio/flutter/view/i;

    return-void
.end method
