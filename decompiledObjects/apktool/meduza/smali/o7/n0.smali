.class public final Lo7/n0;
.super Lo7/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lo7/x<",
        "TE;>;"
    }
.end annotation


# static fields
.field public static final q:[Ljava/lang/Object;

.field public static final r:Lo7/n0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo7/n0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final transient d:[Ljava/lang/Object;

.field public final transient e:I

.field public final transient f:[Ljava/lang/Object;

.field public final transient o:I

.field public final transient p:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    const/4 v0, 0x0

    new-array v4, v0, [Ljava/lang/Object;

    sput-object v4, Lo7/n0;->q:[Ljava/lang/Object;

    new-instance v0, Lo7/n0;

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, v4

    invoke-direct/range {v1 .. v6}, Lo7/n0;-><init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    sput-object v0, Lo7/n0;->r:Lo7/n0;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lo7/x;-><init>()V

    iput-object p1, p0, Lo7/n0;->d:[Ljava/lang/Object;

    iput p2, p0, Lo7/n0;->e:I

    iput-object p3, p0, Lo7/n0;->f:[Ljava/lang/Object;

    iput p4, p0, Lo7/n0;->o:I

    iput p5, p0, Lo7/n0;->p:I

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 4

    iget-object v0, p0, Lo7/n0;->f:[Ljava/lang/Object;

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    array-length v2, v0

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1}, Lx6/b;->s0(Ljava/lang/Object;)I

    move-result v2

    :goto_0
    iget v3, p0, Lo7/n0;->o:I

    and-int/2addr v2, v3

    aget-object v3, v0, v2

    if-nez v3, :cond_1

    return v1

    :cond_1
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v1
.end method

.method public final h(I[Ljava/lang/Object;)I
    .locals 3

    iget-object v0, p0, Lo7/n0;->d:[Ljava/lang/Object;

    iget v1, p0, Lo7/n0;->p:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p2, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p2, p0, Lo7/n0;->p:I

    add-int/2addr p1, p2

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lo7/n0;->e:I

    return v0
.end method

.method public final i()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo7/n0;->d:[Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lo7/n0;->n()Lo7/x0;

    move-result-object v0

    return-object v0
.end method

.method public final k()I
    .locals 1

    iget v0, p0, Lo7/n0;->p:I

    return v0
.end method

.method public final l()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final n()Lo7/x0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo7/x0<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lo7/x;->a()Lo7/t;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo7/t;->r(I)Lo7/t$b;

    move-result-object v0

    return-object v0
.end method

.method public final r()Lo7/t;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo7/t<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, Lo7/n0;->d:[Ljava/lang/Object;

    iget v1, p0, Lo7/n0;->p:I

    invoke-static {v1, v0}, Lo7/t;->o(I[Ljava/lang/Object;)Lo7/l0;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lo7/n0;->p:I

    return v0
.end method
