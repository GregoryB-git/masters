.class public final LA2/J;
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
.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {p1}, LB2/b;->u(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v4, v1

    .line 8
    move v7, v4

    .line 9
    move v8, v7

    .line 10
    move-object v5, v2

    .line 11
    move-object v6, v5

    .line 12
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ge v1, v0, :cond_5

    .line 17
    .line 18
    invoke-static {p1}, LB2/b;->n(Landroid/os/Parcel;)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v1}, LB2/b;->i(I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v3, 0x1

    .line 27
    if-eq v2, v3, :cond_4

    .line 28
    .line 29
    const/4 v3, 0x2

    .line 30
    if-eq v2, v3, :cond_3

    .line 31
    .line 32
    const/4 v3, 0x3

    .line 33
    if-eq v2, v3, :cond_2

    .line 34
    .line 35
    const/4 v3, 0x4

    .line 36
    if-eq v2, v3, :cond_1

    .line 37
    .line 38
    const/4 v3, 0x5

    .line 39
    if-eq v2, v3, :cond_0

    .line 40
    .line 41
    invoke-static {p1, v1}, LB2/b;->t(Landroid/os/Parcel;I)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {p1, v1}, LB2/b;->j(Landroid/os/Parcel;I)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    move v8, v1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-static {p1, v1}, LB2/b;->j(Landroid/os/Parcel;I)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    move v7, v1

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    sget-object v2, Lx2/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 58
    .line 59
    invoke-static {p1, v1, v2}, LB2/b;->c(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Lx2/b;

    .line 64
    .line 65
    move-object v6, v1

    .line 66
    goto :goto_0

    .line 67
    :cond_3
    invoke-static {p1, v1}, LB2/b;->o(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    move-object v5, v1

    .line 72
    goto :goto_0

    .line 73
    :cond_4
    invoke-static {p1, v1}, LB2/b;->p(Landroid/os/Parcel;I)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    move v4, v1

    .line 78
    goto :goto_0

    .line 79
    :cond_5
    invoke-static {p1, v0}, LB2/b;->h(Landroid/os/Parcel;I)V

    .line 80
    .line 81
    .line 82
    new-instance p1, LA2/I;

    .line 83
    .line 84
    move-object v3, p1

    .line 85
    invoke-direct/range {v3 .. v8}, LA2/I;-><init>(ILandroid/os/IBinder;Lx2/b;ZZ)V

    .line 86
    .line 87
    .line 88
    return-object p1
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    new-array p1, p1, [LA2/I;

    .line 2
    .line 3
    return-object p1
.end method
