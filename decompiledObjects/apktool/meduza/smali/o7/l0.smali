.class public final Lo7/l0;
.super Lo7/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lo7/t<",
        "TE;>;"
    }
.end annotation


# static fields
.field public static final e:Lo7/l0;


# instance fields
.field public final transient c:[Ljava/lang/Object;

.field public final transient d:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lo7/l0;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, Lo7/l0;-><init>([Ljava/lang/Object;I)V

    sput-object v0, Lo7/l0;->e:Lo7/l0;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Lo7/t;-><init>()V

    iput-object p1, p0, Lo7/l0;->c:[Ljava/lang/Object;

    iput p2, p0, Lo7/l0;->d:I

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget v0, p0, Lo7/l0;->d:I

    invoke-static {p1, v0}, Lx6/b;->v(II)V

    iget-object v0, p0, Lo7/l0;->c:[Ljava/lang/Object;

    aget-object p1, v0, p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public final h(I[Ljava/lang/Object;)I
    .locals 3

    iget-object v0, p0, Lo7/l0;->c:[Ljava/lang/Object;

    iget v1, p0, Lo7/l0;->d:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p2, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p2, p0, Lo7/l0;->d:I

    add-int/2addr p1, p2

    return p1
.end method

.method public final i()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo7/l0;->c:[Ljava/lang/Object;

    return-object v0
.end method

.method public final k()I
    .locals 1

    iget v0, p0, Lo7/l0;->d:I

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

.method public final size()I
    .locals 1

    iget v0, p0, Lo7/l0;->d:I

    return v0
.end method
