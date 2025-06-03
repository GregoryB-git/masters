.class public final Ln5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh5/g;


# instance fields
.field public final a:[Lh5/a;

.field public final b:[J


# direct methods
.method public constructor <init>([Lh5/a;[J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln5/b;->a:[Lh5/a;

    iput-object p2, p0, Ln5/b;->b:[J

    return-void
.end method


# virtual methods
.method public final f(J)I
    .locals 2

    iget-object v0, p0, Ln5/b;->b:[J

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, v1}, Lv5/e0;->b([JJZ)I

    move-result p1

    iget-object p2, p0, Ln5/b;->b:[J

    array-length p2, p2

    if-ge p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public final g(I)J
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ltz p1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-static {v2}, Lx6/b;->q(Z)V

    iget-object v2, p0, Ln5/b;->b:[J

    array-length v2, v2

    if-ge p1, v2, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    invoke-static {v0}, Lx6/b;->q(Z)V

    iget-object v0, p0, Ln5/b;->b:[J

    aget-wide v1, v0, p1

    return-wide v1
.end method

.method public final h(J)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lh5/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln5/b;->b:[J

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, v1}, Lv5/e0;->f([JJZ)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_1

    iget-object p2, p0, Ln5/b;->a:[Lh5/a;

    aget-object p1, p2, p1

    sget-object p2, Lh5/a;->z:Lh5/a;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final i()I
    .locals 1

    iget-object v0, p0, Ln5/b;->b:[J

    array-length v0, v0

    return v0
.end method
