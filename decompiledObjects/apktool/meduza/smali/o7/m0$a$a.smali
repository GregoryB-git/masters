.class public final Lo7/m0$a$a;
.super Lo7/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo7/m0$a;->r()Lo7/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo7/t<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lo7/m0$a;


# direct methods
.method public constructor <init>(Lo7/m0$a;)V
    .locals 0

    iput-object p1, p0, Lo7/m0$a$a;->c:Lo7/m0$a;

    invoke-direct {p0}, Lo7/t;-><init>()V

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lo7/m0$a$a;->c:Lo7/m0$a;

    .line 2
    .line 3
    iget v0, v0, Lo7/m0$a;->o:I

    .line 4
    .line 5
    invoke-static {p1, v0}, Lx6/b;->v(II)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lo7/m0$a$a;->c:Lo7/m0$a;

    .line 9
    .line 10
    iget-object v1, v0, Lo7/m0$a;->e:[Ljava/lang/Object;

    .line 11
    .line 12
    mul-int/lit8 p1, p1, 0x2

    .line 13
    .line 14
    iget v0, v0, Lo7/m0$a;->f:I

    .line 15
    .line 16
    add-int/2addr v0, p1

    .line 17
    aget-object v0, v1, v0

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lo7/m0$a$a;->c:Lo7/m0$a;

    .line 23
    .line 24
    iget-object v2, v1, Lo7/m0$a;->e:[Ljava/lang/Object;

    .line 25
    .line 26
    iget v1, v1, Lo7/m0$a;->f:I

    .line 27
    .line 28
    xor-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    add-int/2addr p1, v1

    .line 31
    aget-object p1, v2, p1

    .line 32
    .line 33
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    new-instance v1, Ljava/util/AbstractMap$SimpleImmutableEntry;

    .line 37
    .line 38
    invoke-direct {v1, v0, p1}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-object v1
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final m()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lo7/m0$a$a;->c:Lo7/m0$a;

    iget v0, v0, Lo7/m0$a;->o:I

    return v0
.end method
