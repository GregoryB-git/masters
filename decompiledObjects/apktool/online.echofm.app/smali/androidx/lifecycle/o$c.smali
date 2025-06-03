.class public Landroidx/lifecycle/o$c;
.super Landroidx/lifecycle/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/o;->e(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/lifecycle/o;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/o;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/o$c;->this$0:Landroidx/lifecycle/o;

    invoke-direct {p0}, Landroidx/lifecycle/b;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    if-ge p2, v0, :cond_0

    invoke-static {p1}, Landroidx/lifecycle/q;->f(Landroid/app/Activity;)Landroidx/lifecycle/q;

    move-result-object p1

    iget-object p2, p0, Landroidx/lifecycle/o$c;->this$0:Landroidx/lifecycle/o;

    iget-object p2, p2, Landroidx/lifecycle/o;->v:Landroidx/lifecycle/q$a;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/q;->h(Landroidx/lifecycle/q$a;)V

    :cond_0
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    iget-object p1, p0, Landroidx/lifecycle/o$c;->this$0:Landroidx/lifecycle/o;

    invoke-virtual {p1}, Landroidx/lifecycle/o;->a()V

    return-void
.end method

.method public onActivityPreCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance p2, Landroidx/lifecycle/o$c$a;

    invoke-direct {p2, p0}, Landroidx/lifecycle/o$c$a;-><init>(Landroidx/lifecycle/o$c;)V

    invoke-static {p1, p2}, Landroidx/lifecycle/p;->a(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    iget-object p1, p0, Landroidx/lifecycle/o$c;->this$0:Landroidx/lifecycle/o;

    invoke-virtual {p1}, Landroidx/lifecycle/o;->d()V

    return-void
.end method
