.class public final Lo7/m0;
.super Lo7/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo7/m0$b;,
        Lo7/m0$c;,
        Lo7/m0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lo7/u<",
        "TK;TV;>;"
    }
.end annotation


# static fields
.field public static final o:Lo7/m0;


# instance fields
.field public final transient d:Ljava/lang/Object;

.field public final transient e:[Ljava/lang/Object;

.field public final transient f:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lo7/m0;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v2, v1}, Lo7/m0;-><init>(Ljava/lang/Object;[Ljava/lang/Object;I)V

    sput-object v0, Lo7/m0;->o:Lo7/m0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;[Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Lo7/u;-><init>()V

    iput-object p1, p0, Lo7/m0;->d:Ljava/lang/Object;

    iput-object p2, p0, Lo7/m0;->e:[Ljava/lang/Object;

    iput p3, p0, Lo7/m0;->f:I

    return-void
.end method


# virtual methods
.method public final c()Lo7/m0$a;
    .locals 3

    new-instance v0, Lo7/m0$a;

    iget-object v1, p0, Lo7/m0;->e:[Ljava/lang/Object;

    iget v2, p0, Lo7/m0;->f:I

    invoke-direct {v0, p0, v1, v2}, Lo7/m0$a;-><init>(Lo7/u;[Ljava/lang/Object;I)V

    return-object v0
.end method

.method public final d()Lo7/m0$b;
    .locals 4

    new-instance v0, Lo7/m0$c;

    iget-object v1, p0, Lo7/m0;->e:[Ljava/lang/Object;

    iget v2, p0, Lo7/m0;->f:I

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lo7/m0$c;-><init>([Ljava/lang/Object;II)V

    new-instance v1, Lo7/m0$b;

    invoke-direct {v1, p0, v0}, Lo7/m0$b;-><init>(Lo7/u;Lo7/m0$c;)V

    return-object v1
.end method

.method public final e()Lo7/m0$c;
    .locals 4

    new-instance v0, Lo7/m0$c;

    iget-object v1, p0, Lo7/m0;->e:[Ljava/lang/Object;

    iget v2, p0, Lo7/m0;->f:I

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2}, Lo7/m0$c;-><init>([Ljava/lang/Object;II)V

    return-object v0
.end method

.method public final f()V
    .locals 0

    return-void
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    iget-object v0, p0, Lo7/m0;->d:Ljava/lang/Object;

    iget-object v1, p0, Lo7/m0;->e:[Ljava/lang/Object;

    iget v2, p0, Lo7/m0;->f:I

    const/4 v3, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x1

    if-ne v2, v4, :cond_2

    const/4 v0, 0x0

    aget-object v0, v1, v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    aget-object p1, v1, v4

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_4

    :cond_1
    :goto_0
    move-object p1, v3

    goto/16 :goto_4

    :cond_2
    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    instance-of v2, v0, [B

    const/4 v5, -0x1

    if-eqz v2, :cond_6

    move-object v2, v0

    check-cast v2, [B

    array-length v0, v2

    add-int/lit8 v6, v0, -0x1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Lx6/b;->r0(I)I

    move-result v0

    :goto_1
    and-int/2addr v0, v6

    aget-byte v5, v2, v0

    const/16 v7, 0xff

    and-int/2addr v5, v7

    if-ne v5, v7, :cond_4

    goto :goto_0

    :cond_4
    aget-object v7, v1, v5

    invoke-virtual {p1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    xor-int/lit8 p1, v5, 0x1

    aget-object p1, v1, p1

    goto :goto_4

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_6
    instance-of v2, v0, [S

    if-eqz v2, :cond_9

    move-object v2, v0

    check-cast v2, [S

    array-length v0, v2

    add-int/lit8 v6, v0, -0x1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Lx6/b;->r0(I)I

    move-result v0

    :goto_2
    and-int/2addr v0, v6

    aget-short v5, v2, v0

    const v7, 0xffff

    and-int/2addr v5, v7

    if-ne v5, v7, :cond_7

    goto :goto_0

    :cond_7
    aget-object v7, v1, v5

    invoke-virtual {p1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    xor-int/lit8 p1, v5, 0x1

    aget-object p1, v1, p1

    goto :goto_4

    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_9
    check-cast v0, [I

    array-length v2, v0

    sub-int/2addr v2, v4

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v6

    invoke-static {v6}, Lx6/b;->r0(I)I

    move-result v6

    :goto_3
    and-int/2addr v6, v2

    aget v7, v0, v6

    if-ne v7, v5, :cond_a

    goto :goto_0

    :cond_a
    aget-object v8, v1, v7

    invoke-virtual {p1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_c

    xor-int/lit8 p1, v7, 0x1

    aget-object p1, v1, p1

    :goto_4
    if-nez p1, :cond_b

    return-object v3

    :cond_b
    return-object p1

    :cond_c
    add-int/lit8 v6, v6, 0x1

    goto :goto_3
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lo7/m0;->f:I

    return v0
.end method
