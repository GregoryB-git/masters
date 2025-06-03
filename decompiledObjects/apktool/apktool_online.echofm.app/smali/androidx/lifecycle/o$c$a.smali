.class public Landroidx/lifecycle/o$c$a;
.super Landroidx/lifecycle/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/o$c;->onActivityPreCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Landroidx/lifecycle/o$c;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/o$c;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/o$c$a;->this$1:Landroidx/lifecycle/o$c;

    invoke-direct {p0}, Landroidx/lifecycle/b;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityPostResumed(Landroid/app/Activity;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Landroidx/lifecycle/o$c$a;->this$1:Landroidx/lifecycle/o$c;

    iget-object p1, p1, Landroidx/lifecycle/o$c;->this$0:Landroidx/lifecycle/o;

    invoke-virtual {p1}, Landroidx/lifecycle/o;->b()V

    return-void
.end method

.method public onActivityPostStarted(Landroid/app/Activity;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Landroidx/lifecycle/o$c$a;->this$1:Landroidx/lifecycle/o$c;

    iget-object p1, p1, Landroidx/lifecycle/o$c;->this$0:Landroidx/lifecycle/o;

    invoke-virtual {p1}, Landroidx/lifecycle/o;->c()V

    return-void
.end method
