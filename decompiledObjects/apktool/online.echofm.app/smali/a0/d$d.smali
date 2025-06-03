.class public La0/d$d;
.super La0/d$l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La0/d;->n(Ljava/lang/String;Landroid/os/Bundle;La0/d$f;Lb/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic f:Lb/b;

.field public final synthetic g:La0/d;


# direct methods
.method public constructor <init>(La0/d;Ljava/lang/Object;Lb/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, La0/d$d;->g:La0/d;

    .line 2
    .line 3
    iput-object p3, p0, La0/d$d;->f:Lb/b;

    .line 4
    .line 5
    invoke-direct {p0, p2}, La0/d$l;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public d(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, La0/d$d;->f:Lb/b;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-virtual {v0, v1, p1}, Lb/b;->b(ILandroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public bridge synthetic e(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La0/d$d;->h(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public h(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, La0/d$d;->f:Lb/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, p1}, Lb/b;->b(ILandroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
