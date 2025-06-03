.class public Lw/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/f$a;,
        Lw/f$b;
    }
.end annotation


# instance fields
.field public final a:Lw/f$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lw/f;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    new-instance v0, Lw/f$a;

    invoke-direct {v0, p1}, Lw/f$a;-><init>(I)V

    iput-object v0, p0, Lw/f;->a:Lw/f$b;

    goto :goto_0

    :cond_0
    new-instance p1, Lw/f$b;

    invoke-direct {p1}, Lw/f$b;-><init>()V

    iput-object p1, p0, Lw/f;->a:Lw/f$b;

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw/f;->a:Lw/f$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw/f$b;->a(Landroid/app/Activity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b()[Landroid/util/SparseIntArray;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/f;->a:Lw/f$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw/f$b;->b()[Landroid/util/SparseIntArray;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public c(Landroid/app/Activity;)[Landroid/util/SparseIntArray;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/f;->a:Lw/f$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw/f$b;->c(Landroid/app/Activity;)[Landroid/util/SparseIntArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public d()[Landroid/util/SparseIntArray;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/f;->a:Lw/f$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw/f$b;->d()[Landroid/util/SparseIntArray;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
