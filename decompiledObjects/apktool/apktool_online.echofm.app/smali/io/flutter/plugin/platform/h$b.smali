.class public Lio/flutter/plugin/platform/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnSystemUiVisibilityChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugin/platform/h;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Lio/flutter/plugin/platform/h;


# direct methods
.method public constructor <init>(Lio/flutter/plugin/platform/h;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugin/platform/h$b;->b:Lio/flutter/plugin/platform/h;

    iput-object p2, p0, Lio/flutter/plugin/platform/h$b;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lio/flutter/plugin/platform/h$b;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/flutter/plugin/platform/h$b;->b(I)V

    return-void
.end method


# virtual methods
.method public final synthetic b(I)V
    .locals 1

    .line 1
    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/flutter/plugin/platform/h$b;->b:Lio/flutter/plugin/platform/h;

    invoke-static {p1}, Lio/flutter/plugin/platform/h;->g(Lio/flutter/plugin/platform/h;)LD5/o;

    move-result-object p1

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, LD5/o;->m(Z)V

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lio/flutter/plugin/platform/h$b;->b:Lio/flutter/plugin/platform/h;

    invoke-static {p1}, Lio/flutter/plugin/platform/h;->g(Lio/flutter/plugin/platform/h;)LD5/o;

    move-result-object p1

    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    return-void
.end method

.method public onSystemUiVisibilityChange(I)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/platform/h$b;->a:Landroid/view/View;

    new-instance v1, Lio/flutter/plugin/platform/i;

    invoke-direct {v1, p0, p1}, Lio/flutter/plugin/platform/i;-><init>(Lio/flutter/plugin/platform/h$b;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
