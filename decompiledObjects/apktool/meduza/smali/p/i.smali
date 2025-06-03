.class public final Lp/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Landroid/os/Bundle;

.field public final synthetic d:Lp/m;


# direct methods
.method public constructor <init>(Lp/m;IILandroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lp/i;->d:Lp/m;

    iput p2, p0, Lp/i;->a:I

    iput p3, p0, Lp/i;->b:I

    iput-object p4, p0, Lp/i;->c:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lp/i;->d:Lp/m;

    iget-object v0, v0, Lp/m;->b:Lp/b;

    iget v1, p0, Lp/i;->a:I

    iget v2, p0, Lp/i;->b:I

    iget-object v3, p0, Lp/i;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3}, Lp/b;->onActivityResized(IILandroid/os/Bundle;)V

    return-void
.end method
