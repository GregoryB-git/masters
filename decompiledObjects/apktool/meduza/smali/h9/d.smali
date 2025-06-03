.class public abstract Lh9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lh9/d;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Lh9/d;

    invoke-virtual {p0}, Lh9/d;->i()I

    move-result v0

    invoke-virtual {p1}, Lh9/d;->i()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lh9/d;->h()Lj9/i;

    move-result-object v0

    invoke-virtual {p1}, Lh9/d;->h()Lj9/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj9/i;->f(Lj9/i;)I

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lh9/d;->f()[B

    move-result-object v0

    invoke-virtual {p1}, Lh9/d;->f()[B

    move-result-object v1

    invoke-static {v0, v1}, Ln9/o;->b([B[B)I

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lh9/d;->g()[B

    move-result-object v0

    invoke-virtual {p1}, Lh9/d;->g()[B

    move-result-object p1

    invoke-static {v0, p1}, Ln9/o;->b([B[B)I

    move-result v0

    :goto_0
    return v0
.end method

.method public abstract f()[B
.end method

.method public abstract g()[B
.end method

.method public abstract h()Lj9/i;
.end method

.method public abstract i()I
.end method
