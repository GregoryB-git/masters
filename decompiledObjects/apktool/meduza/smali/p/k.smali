.class public final Lp/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:Landroid/os/Bundle;

.field public final synthetic o:Lp/m;


# direct methods
.method public constructor <init>(Lp/m;IIIIILandroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lp/k;->o:Lp/m;

    iput p2, p0, Lp/k;->a:I

    iput p3, p0, Lp/k;->b:I

    iput p4, p0, Lp/k;->c:I

    iput p5, p0, Lp/k;->d:I

    iput p6, p0, Lp/k;->e:I

    iput-object p7, p0, Lp/k;->f:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, Lp/k;->o:Lp/m;

    iget-object v1, v0, Lp/m;->b:Lp/b;

    iget v2, p0, Lp/k;->a:I

    iget v3, p0, Lp/k;->b:I

    iget v4, p0, Lp/k;->c:I

    iget v5, p0, Lp/k;->d:I

    iget v6, p0, Lp/k;->e:I

    iget-object v7, p0, Lp/k;->f:Landroid/os/Bundle;

    invoke-virtual/range {v1 .. v7}, Lp/b;->onActivityLayout(IIIIILandroid/os/Bundle;)V

    return-void
.end method
