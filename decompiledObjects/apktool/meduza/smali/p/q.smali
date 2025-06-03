.class public final synthetic Lp/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lp/v;

.field public final synthetic b:Z

.field public final synthetic c:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lp/v;ZLandroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp/q;->a:Lp/v;

    iput-boolean p2, p0, Lp/q;->b:Z

    iput-object p3, p0, Lp/q;->c:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lp/q;->a:Lp/v;

    iget-boolean v1, p0, Lp/q;->b:Z

    iget-object v2, p0, Lp/q;->c:Landroid/os/Bundle;

    invoke-interface {v0, v1, v2}, Lp/v;->onVerticalScrollEvent(ZLandroid/os/Bundle;)V

    return-void
.end method
