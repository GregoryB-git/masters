.class public final Lp/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/os/Bundle;

.field public final synthetic c:Lp/m;


# direct methods
.method public constructor <init>(Lp/m;ILandroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lp/d;->c:Lp/m;

    iput p2, p0, Lp/d;->a:I

    iput-object p3, p0, Lp/d;->b:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lp/d;->c:Lp/m;

    iget-object v0, v0, Lp/m;->b:Lp/b;

    iget v1, p0, Lp/d;->a:I

    iget-object v2, p0, Lp/d;->b:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2}, Lp/b;->onNavigationEvent(ILandroid/os/Bundle;)V

    return-void
.end method
