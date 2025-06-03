.class public final Le7/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Le7/e;",
        ">;"
    }
.end annotation


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
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    move-wide v6, v1

    .line 9
    move-wide v8, v6

    .line 10
    move v5, v3

    .line 11
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-ge v1, v0, :cond_3

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    int-to-char v2, v1

    .line 22
    const/4 v3, 0x1

    .line 23
    if-eq v2, v3, :cond_2

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    if-eq v2, v3, :cond_1

    .line 27
    .line 28
    const/4 v3, 0x3

    .line 29
    if-eq v2, v3, :cond_0

    .line 30
    .line 31
    invoke-static {v1, p1}, Ln6/b;->t(ILandroid/os/Parcel;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {v1, p1}, Ln6/b;->q(ILandroid/os/Parcel;)J

    .line 36
    .line 37
    .line 38
    move-result-wide v8

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-static {v1, p1}, Ln6/b;->o(ILandroid/os/Parcel;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static {v1, p1}, Ln6/b;->q(ILandroid/os/Parcel;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v6

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    invoke-static {v0, p1}, Ln6/b;->j(ILandroid/os/Parcel;)V

    .line 51
    .line 52
    .line 53
    new-instance p1, Le7/e;

    .line 54
    .line 55
    move-object v4, p1

    .line 56
    invoke-direct/range {v4 .. v9}, Le7/e;-><init>(IJJ)V

    .line 57
    .line 58
    .line 59
    return-object p1
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

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Le7/e;

    return-object p1
.end method
