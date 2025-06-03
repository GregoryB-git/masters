.class public final Lv3/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv3/s1$a;
    }
.end annotation


# static fields
.field public static final b:Lv3/s1;


# instance fields
.field public final a:Lo7/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo7/t<",
            "Lv3/s1$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lv3/s1;

    .line 2
    .line 3
    sget-object v1, Lo7/t;->b:Lo7/t$b;

    .line 4
    .line 5
    sget-object v1, Lo7/l0;->e:Lo7/l0;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lv3/s1;-><init>(Lo7/l0;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lv3/s1;->b:Lv3/s1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public constructor <init>(Lo7/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lo7/t;->p(Ljava/util/Collection;)Lo7/t;

    move-result-object p1

    iput-object p1, p0, Lv3/s1;->a:Lo7/t;

    return-void
.end method


# virtual methods
.method public final a(I)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lv3/s1;->a:Lo7/t;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-ge v1, v2, :cond_3

    .line 10
    .line 11
    iget-object v2, p0, Lv3/s1;->a:Lo7/t;

    .line 12
    .line 13
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lv3/s1$a;

    .line 18
    .line 19
    iget-object v3, v2, Lv3/s1$a;->e:[Z

    .line 20
    .line 21
    array-length v4, v3

    .line 22
    move v5, v0

    .line 23
    :goto_1
    const/4 v6, 0x1

    .line 24
    if-ge v5, v4, :cond_1

    .line 25
    .line 26
    aget-boolean v7, v3, v5

    .line 27
    .line 28
    if-ne v7, v6, :cond_0

    .line 29
    .line 30
    move v3, v6

    .line 31
    goto :goto_2

    .line 32
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v3, v0

    .line 36
    :goto_2
    if-eqz v3, :cond_2

    .line 37
    .line 38
    iget-object v2, v2, Lv3/s1$a;->b:Lz4/i0;

    .line 39
    .line 40
    iget v2, v2, Lz4/i0;->c:I

    .line 41
    .line 42
    if-ne v2, p1, :cond_2

    .line 43
    .line 44
    return v6

    .line 45
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    return v0
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    const-class v0, Lv3/s1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lv3/s1;

    iget-object v0, p0, Lv3/s1;->a:Lo7/t;

    iget-object p1, p1, Lv3/s1;->a:Lo7/t;

    invoke-virtual {v0, p1}, Lo7/t;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lv3/s1;->a:Lo7/t;

    invoke-virtual {v0}, Lo7/t;->hashCode()I

    move-result v0

    return v0
.end method
