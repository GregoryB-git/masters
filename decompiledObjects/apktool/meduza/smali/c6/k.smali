.class public final Lc6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {p1}, Ln6/b;->u(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    move v5, v1

    .line 9
    move v8, v5

    .line 10
    move v9, v8

    .line 11
    move-wide v6, v2

    .line 12
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ge v1, v0, :cond_4

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    int-to-char v2, v1

    .line 23
    const/4 v3, 0x1

    .line 24
    if-eq v2, v3, :cond_3

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    if-eq v2, v3, :cond_2

    .line 28
    .line 29
    const/4 v3, 0x3

    .line 30
    if-eq v2, v3, :cond_1

    .line 31
    .line 32
    const/4 v3, 0x4

    .line 33
    if-eq v2, v3, :cond_0

    .line 34
    .line 35
    invoke-static {v1, p1}, Ln6/b;->t(ILandroid/os/Parcel;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {v1, p1}, Ln6/b;->k(ILandroid/os/Parcel;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    move v9, v1

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-static {v1, p1}, Ln6/b;->q(ILandroid/os/Parcel;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    move-wide v6, v1

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-static {v1, p1}, Ln6/b;->k(ILandroid/os/Parcel;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    move v8, v1

    .line 56
    goto :goto_0

    .line 57
    :cond_3
    invoke-static {v1, p1}, Ln6/b;->o(ILandroid/os/Parcel;)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    move v5, v1

    .line 62
    goto :goto_0

    .line 63
    :cond_4
    invoke-static {v0, p1}, Ln6/b;->j(ILandroid/os/Parcel;)V

    .line 64
    .line 65
    .line 66
    new-instance p1, Lc6/a;

    .line 67
    .line 68
    move-object v4, p1

    .line 69
    invoke-direct/range {v4 .. v9}, Lc6/a;-><init>(IJZZ)V

    .line 70
    .line 71
    .line 72
    return-object p1
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lc6/a;

    return-object p1
.end method
