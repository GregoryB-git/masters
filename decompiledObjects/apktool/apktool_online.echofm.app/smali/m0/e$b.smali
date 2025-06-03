.class public abstract Lm0/e$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private static a()LX2/y;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LX2/y;"
        }
    .end annotation

    .line 1
    new-instance v0, LX2/y$a;

    .line 2
    .line 3
    invoke-direct {v0}, LX2/y$a;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x7

    .line 13
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x2

    .line 18
    new-array v4, v3, [Ljava/lang/Integer;

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    aput-object v1, v4, v5

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    aput-object v2, v4, v1

    .line 25
    .line 26
    invoke-virtual {v0, v4}, LX2/y$a;->i([Ljava/lang/Object;)LX2/y$a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget v2, Lg0/M;->a:I

    .line 31
    .line 32
    const/16 v4, 0x1f

    .line 33
    .line 34
    if-lt v2, v4, :cond_0

    .line 35
    .line 36
    const/16 v4, 0x1a

    .line 37
    .line 38
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    const/16 v6, 0x1b

    .line 43
    .line 44
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    new-array v3, v3, [Ljava/lang/Integer;

    .line 49
    .line 50
    aput-object v4, v3, v5

    .line 51
    .line 52
    aput-object v6, v3, v1

    .line 53
    .line 54
    invoke-virtual {v0, v3}, LX2/y$a;->i([Ljava/lang/Object;)LX2/y$a;

    .line 55
    .line 56
    .line 57
    :cond_0
    const/16 v1, 0x21

    .line 58
    .line 59
    if-lt v2, v1, :cond_1

    .line 60
    .line 61
    const/16 v1, 0x1e

    .line 62
    .line 63
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v0, v1}, LX2/y$a;->h(Ljava/lang/Object;)LX2/y$a;

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-virtual {v0}, LX2/y$a;->l()LX2/y;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    return-object v0
.end method

.method public static b(Landroid/media/AudioManager;Lm0/j;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Landroid/media/AudioManager;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-virtual {p0, p1}, Landroid/media/AudioManager;->getDevices(I)[Landroid/media/AudioDeviceInfo;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object p0, p1, Lm0/j;->a:Landroid/media/AudioDeviceInfo;

    .line 18
    .line 19
    new-array p1, v1, [Landroid/media/AudioDeviceInfo;

    .line 20
    .line 21
    aput-object p0, p1, v0

    .line 22
    .line 23
    move-object p0, p1

    .line 24
    :goto_0
    invoke-static {}, Lm0/e$b;->a()LX2/y;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    array-length v2, p0

    .line 29
    move v3, v0

    .line 30
    :goto_1
    if-ge v3, v2, :cond_2

    .line 31
    .line 32
    aget-object v4, p0, v3

    .line 33
    .line 34
    invoke-virtual {v4}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {p1, v4}, LX2/t;->contains(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    return v1

    .line 49
    :cond_1
    add-int/2addr v3, v1

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    return v0
.end method
