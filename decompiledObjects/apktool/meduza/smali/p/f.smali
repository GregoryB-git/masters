.class public final Lp/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/os/Bundle;

.field public final synthetic b:Lp/m;


# direct methods
.method public constructor <init>(Lp/m;Landroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lp/f;->b:Lp/m;

    iput-object p2, p0, Lp/f;->a:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp/f;->b:Lp/m;

    iget-object v0, v0, Lp/m;->b:Lp/b;

    iget-object v1, p0, Lp/f;->a:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Lp/b;->onMessageChannelReady(Landroid/os/Bundle;)V

    return-void
.end method
