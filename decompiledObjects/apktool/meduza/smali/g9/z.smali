.class public final Lg9/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg9/z$a;
    }
.end annotation


# instance fields
.field public final a:Lg9/z$a;

.field public final b:Lj9/i;


# direct methods
.method public constructor <init>(Lg9/z$a;Lj9/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/z;->a:Lg9/z$a;

    iput-object p2, p0, Lg9/z;->b:Lj9/i;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lg9/z;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lg9/z;

    .line 8
    .line 9
    iget-object v0, p0, Lg9/z;->a:Lg9/z$a;

    .line 10
    .line 11
    iget-object v2, p1, Lg9/z;->a:Lg9/z$a;

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lg9/z;->b:Lj9/i;

    .line 20
    .line 21
    iget-object p1, p1, Lg9/z;->b:Lj9/i;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lj9/i;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    :cond_1
    return v1
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
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lg9/z;->a:Lg9/z$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x81d

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lg9/z;->b:Lj9/i;

    invoke-virtual {v1}, Lj9/i;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
