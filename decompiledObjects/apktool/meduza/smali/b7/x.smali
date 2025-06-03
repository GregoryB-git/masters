.class public final Lb7/x;
.super Lb7/j;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lb7/x;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:[B

.field public final b:Ljava/lang/Double;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/List;

.field public final e:Ljava/lang/Integer;

.field public final f:Lb7/d0;

.field public final o:Lb7/g1;

.field public final p:Lb7/d;

.field public final q:Ljava/lang/Long;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb7/w0;

    invoke-direct {v0}, Lb7/w0;-><init>()V

    sput-object v0, Lb7/x;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>([BLjava/lang/Double;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Integer;Lb7/d0;Ljava/lang/String;Lb7/d;Ljava/lang/Long;)V
    .locals 0

    invoke-direct {p0}, Lb7/j;-><init>()V

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    iput-object p1, p0, Lb7/x;->a:[B

    iput-object p2, p0, Lb7/x;->b:Ljava/lang/Double;

    invoke-static {p3}, Lm6/j;->i(Ljava/lang/Object;)V

    iput-object p3, p0, Lb7/x;->c:Ljava/lang/String;

    iput-object p4, p0, Lb7/x;->d:Ljava/util/List;

    iput-object p5, p0, Lb7/x;->e:Ljava/lang/Integer;

    iput-object p6, p0, Lb7/x;->f:Lb7/d0;

    iput-object p9, p0, Lb7/x;->q:Ljava/lang/Long;

    if-eqz p7, :cond_0

    :try_start_0
    invoke-static {p7}, Lb7/g1;->f(Ljava/lang/String;)Lb7/g1;

    move-result-object p1

    iput-object p1, p0, Lb7/x;->o:Lb7/g1;
    :try_end_0
    .catch Lb7/f1; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lb7/x;->o:Lb7/g1;

    :goto_0
    iput-object p8, p0, Lb7/x;->p:Lb7/d;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lb7/x;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lb7/x;

    iget-object v0, p0, Lb7/x;->a:[B

    iget-object v2, p1, Lb7/x;->a:[B

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lb7/x;->b:Ljava/lang/Double;

    iget-object v2, p1, Lb7/x;->b:Ljava/lang/Double;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lb7/x;->c:Ljava/lang/String;

    iget-object v2, p1, Lb7/x;->c:Ljava/lang/String;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lb7/x;->d:Ljava/util/List;

    if-nez v0, :cond_1

    iget-object v2, p1, Lb7/x;->d:Ljava/util/List;

    if-eqz v2, :cond_2

    :cond_1
    if-eqz v0, :cond_3

    iget-object v2, p1, Lb7/x;->d:Ljava/util/List;

    if-eqz v2, :cond_3

    invoke-interface {v0, v2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p1, Lb7/x;->d:Ljava/util/List;

    iget-object v2, p0, Lb7/x;->d:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lb7/x;->e:Ljava/lang/Integer;

    iget-object v2, p1, Lb7/x;->e:Ljava/lang/Integer;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lb7/x;->f:Lb7/d0;

    iget-object v2, p1, Lb7/x;->f:Lb7/d0;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lb7/x;->o:Lb7/g1;

    iget-object v2, p1, Lb7/x;->o:Lb7/g1;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lb7/x;->p:Lb7/d;

    iget-object v2, p1, Lb7/x;->p:Lb7/d;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lb7/x;->q:Ljava/lang/Long;

    iget-object p1, p1, Lb7/x;->q:Ljava/lang/Long;

    invoke-static {v0, p1}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lb7/x;->a:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/x;->b:Ljava/lang/Double;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/x;->c:Ljava/lang/String;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/x;->d:Ljava/util/List;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/x;->e:Ljava/lang/Integer;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/x;->f:Lb7/d0;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/x;->o:Lb7/g1;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/x;->p:Lb7/d;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/x;->q:Ljava/lang/Long;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {v0, p1}, Lb/z;->J(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lb7/x;->a:[B

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v2, v1, v3}, Lb/z;->w(Landroid/os/Parcel;I[BZ)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lb7/x;->b:Ljava/lang/Double;

    .line 15
    .line 16
    const/4 v2, 0x3

    .line 17
    invoke-static {p1, v2, v1}, Lb/z;->x(Landroid/os/Parcel;ILjava/lang/Double;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lb7/x;->c:Ljava/lang/String;

    .line 21
    .line 22
    const/4 v2, 0x4

    .line 23
    invoke-static {p1, v2, v1, v3}, Lb/z;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lb7/x;->d:Ljava/util/List;

    .line 27
    .line 28
    const/4 v2, 0x5

    .line 29
    invoke-static {p1, v2, v1, v3}, Lb/z;->I(Landroid/os/Parcel;ILjava/util/List;Z)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lb7/x;->e:Ljava/lang/Integer;

    .line 33
    .line 34
    const/4 v2, 0x6

    .line 35
    invoke-static {p1, v2, v1}, Lb/z;->B(Landroid/os/Parcel;ILjava/lang/Integer;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lb7/x;->f:Lb7/d0;

    .line 39
    .line 40
    const/4 v2, 0x7

    .line 41
    invoke-static {p1, v2, v1, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lb7/x;->o:Lb7/g1;

    .line 45
    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget-object v1, v1, Lb7/g1;->a:Ljava/lang/String;

    .line 51
    .line 52
    :goto_0
    const/16 v2, 0x8

    .line 53
    .line 54
    invoke-static {p1, v2, v1, v3}, Lb/z;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 55
    .line 56
    .line 57
    const/16 v1, 0x9

    .line 58
    .line 59
    iget-object v2, p0, Lb7/x;->p:Lb7/d;

    .line 60
    .line 61
    invoke-static {p1, v1, v2, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 62
    .line 63
    .line 64
    const/16 p2, 0xa

    .line 65
    .line 66
    iget-object v1, p0, Lb7/x;->q:Ljava/lang/Long;

    .line 67
    .line 68
    invoke-static {p1, p2, v1}, Lb/z;->D(Landroid/os/Parcel;ILjava/lang/Long;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v0, p1}, Lb/z;->L(ILandroid/os/Parcel;)V

    .line 72
    .line 73
    .line 74
    return-void
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method
