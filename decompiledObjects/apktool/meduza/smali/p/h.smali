.class public final Lp/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/net/Uri;

.field public final synthetic c:Z

.field public final synthetic d:Landroid/os/Bundle;

.field public final synthetic e:Lp/m;


# direct methods
.method public constructor <init>(Lp/m;ILandroid/net/Uri;ZLandroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lp/h;->e:Lp/m;

    iput p2, p0, Lp/h;->a:I

    iput-object p3, p0, Lp/h;->b:Landroid/net/Uri;

    iput-boolean p4, p0, Lp/h;->c:Z

    iput-object p5, p0, Lp/h;->d:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lp/h;->e:Lp/m;

    iget-object v0, v0, Lp/m;->b:Lp/b;

    iget v1, p0, Lp/h;->a:I

    iget-object v2, p0, Lp/h;->b:Landroid/net/Uri;

    iget-boolean v3, p0, Lp/h;->c:Z

    iget-object v4, p0, Lp/h;->d:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3, v4}, Lp/b;->onRelationshipValidationResult(ILandroid/net/Uri;ZLandroid/os/Bundle;)V

    return-void
.end method
