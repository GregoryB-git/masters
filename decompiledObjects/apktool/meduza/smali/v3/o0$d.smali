.class public final Lv3/o0$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv3/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv3/o0$d$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/UUID;

.field public final b:Landroid/net/Uri;

.field public final c:Lo7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo7/u<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Lo7/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo7/t<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final h:[B


# direct methods
.method public constructor <init>(Lv3/o0$d$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p1, Lv3/o0$d$a;->f:Z

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p1, Lv3/o0$d$a;->b:Landroid/net/Uri;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    goto :goto_1

    .line 15
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 16
    :goto_1
    invoke-static {v0}, Lx6/b;->H(Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p1, Lv3/o0$d$a;->a:Ljava/util/UUID;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lv3/o0$d;->a:Ljava/util/UUID;

    .line 25
    .line 26
    iget-object v0, p1, Lv3/o0$d$a;->b:Landroid/net/Uri;

    .line 27
    .line 28
    iput-object v0, p0, Lv3/o0$d;->b:Landroid/net/Uri;

    .line 29
    .line 30
    iget-object v0, p1, Lv3/o0$d$a;->c:Lo7/u;

    .line 31
    .line 32
    iput-object v0, p0, Lv3/o0$d;->c:Lo7/u;

    .line 33
    .line 34
    iget-boolean v0, p1, Lv3/o0$d$a;->d:Z

    .line 35
    .line 36
    iput-boolean v0, p0, Lv3/o0$d;->d:Z

    .line 37
    .line 38
    iget-boolean v0, p1, Lv3/o0$d$a;->f:Z

    .line 39
    .line 40
    iput-boolean v0, p0, Lv3/o0$d;->f:Z

    .line 41
    .line 42
    iget-boolean v0, p1, Lv3/o0$d$a;->e:Z

    .line 43
    .line 44
    iput-boolean v0, p0, Lv3/o0$d;->e:Z

    .line 45
    .line 46
    iget-object v0, p1, Lv3/o0$d$a;->g:Lo7/t;

    .line 47
    .line 48
    iput-object v0, p0, Lv3/o0$d;->g:Lo7/t;

    .line 49
    .line 50
    iget-object p1, p1, Lv3/o0$d$a;->h:[B

    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    array-length v0, p1

    .line 55
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    const/4 p1, 0x0

    .line 61
    :goto_2
    iput-object p1, p0, Lv3/o0$d;->h:[B

    .line 62
    .line 63
    return-void
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


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lv3/o0$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lv3/o0$d;

    iget-object v1, p0, Lv3/o0$d;->a:Ljava/util/UUID;

    iget-object v3, p1, Lv3/o0$d;->a:Ljava/util/UUID;

    invoke-virtual {v1, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lv3/o0$d;->b:Landroid/net/Uri;

    iget-object v3, p1, Lv3/o0$d;->b:Landroid/net/Uri;

    invoke-static {v1, v3}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lv3/o0$d;->c:Lo7/u;

    iget-object v3, p1, Lv3/o0$d;->c:Lo7/u;

    invoke-static {v1, v3}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lv3/o0$d;->d:Z

    iget-boolean v3, p1, Lv3/o0$d;->d:Z

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Lv3/o0$d;->f:Z

    iget-boolean v3, p1, Lv3/o0$d;->f:Z

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Lv3/o0$d;->e:Z

    iget-boolean v3, p1, Lv3/o0$d;->e:Z

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Lv3/o0$d;->g:Lo7/t;

    iget-object v3, p1, Lv3/o0$d;->g:Lo7/t;

    invoke-virtual {v1, v3}, Lo7/t;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lv3/o0$d;->h:[B

    iget-object p1, p1, Lv3/o0$d;->h:[B

    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lv3/o0$d;->a:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lv3/o0$d;->b:Landroid/net/Uri;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/net/Uri;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lv3/o0$d;->c:Lo7/u;

    invoke-virtual {v1}, Lo7/u;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lv3/o0$d;->d:Z

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lv3/o0$d;->f:Z

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lv3/o0$d;->e:Z

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lv3/o0$d;->g:Lo7/t;

    invoke-virtual {v0}, Lo7/t;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lv3/o0$d;->h:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
