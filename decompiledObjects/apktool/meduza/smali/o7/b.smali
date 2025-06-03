.class public abstract Lo7/b;
.super Lo7/x0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lo7/x0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lo7/x0;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lo7/b;->a:I

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public final hasNext()Z
    .locals 5

    iget v0, p0, Lo7/b;->a:I

    const/4 v1, 0x1

    const/4 v2, 0x4

    const/4 v3, 0x0

    if-eq v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    invoke-static {v0}, Lx6/b;->J(Z)V

    iget v0, p0, Lo7/b;->a:I

    invoke-static {v0}, Lq0/g;->c(I)I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v4, 0x2

    if-eq v0, v4, :cond_2

    iput v2, p0, Lo7/b;->a:I

    invoke-virtual {p0}, Lo7/b;->a()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lo7/b;->b:Ljava/lang/Object;

    iget v0, p0, Lo7/b;->a:I

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    iput v1, p0, Lo7/b;->a:I

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    return v1

    :cond_2
    return v3

    :cond_3
    return v1
.end method

.method public final next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lo7/b;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    iput v0, p0, Lo7/b;->a:I

    iget-object v0, p0, Lo7/b;->b:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, Lo7/b;->b:Ljava/lang/Object;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
