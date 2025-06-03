.class public final Lb7/u;
.super Lb7/j;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lb7/u;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lb7/y;

.field public final b:Lb7/a0;

.field public final c:[B

.field public final d:Ljava/util/List;

.field public final e:Ljava/lang/Double;

.field public final f:Ljava/util/List;

.field public final o:Lb7/k;

.field public final p:Ljava/lang/Integer;

.field public final q:Lb7/d0;

.field public final r:Lb7/c;

.field public final s:Lb7/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb7/s0;

    invoke-direct {v0}, Lb7/s0;-><init>()V

    sput-object v0, Lb7/u;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lb7/y;Lb7/a0;[BLjava/util/ArrayList;Ljava/lang/Double;Ljava/util/ArrayList;Lb7/k;Ljava/lang/Integer;Lb7/d0;Ljava/lang/String;Lb7/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lb7/j;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lb7/u;->a:Lb7/y;

    .line 8
    .line 9
    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Lb7/u;->b:Lb7/a0;

    .line 13
    .line 14
    invoke-static {p3}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iput-object p3, p0, Lb7/u;->c:[B

    .line 18
    .line 19
    invoke-static {p4}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object p4, p0, Lb7/u;->d:Ljava/util/List;

    .line 23
    .line 24
    iput-object p5, p0, Lb7/u;->e:Ljava/lang/Double;

    .line 25
    .line 26
    iput-object p6, p0, Lb7/u;->f:Ljava/util/List;

    .line 27
    .line 28
    iput-object p7, p0, Lb7/u;->o:Lb7/k;

    .line 29
    .line 30
    iput-object p8, p0, Lb7/u;->p:Ljava/lang/Integer;

    .line 31
    .line 32
    iput-object p9, p0, Lb7/u;->q:Lb7/d0;

    .line 33
    .line 34
    if-eqz p10, :cond_2

    .line 35
    .line 36
    :try_start_0
    invoke-static {}, Lb7/c;->values()[Lb7/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    array-length p2, p1

    .line 41
    const/4 p3, 0x0

    .line 42
    :goto_0
    if-ge p3, p2, :cond_1

    .line 43
    .line 44
    aget-object p4, p1, p3

    .line 45
    .line 46
    iget-object p5, p4, Lb7/c;->a:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p10, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p5

    .line 52
    if-eqz p5, :cond_0

    .line 53
    .line 54
    iput-object p4, p0, Lb7/u;->r:Lb7/c;

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :catch_0
    move-exception p1

    .line 58
    goto :goto_1

    .line 59
    :cond_0
    add-int/lit8 p3, p3, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    new-instance p1, Lb7/c$a;

    .line 63
    .line 64
    invoke-direct {p1, p10}, Lb7/c$a;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1
    :try_end_0
    .catch Lb7/c$a; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    :goto_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 69
    .line 70
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    throw p2

    .line 74
    :cond_2
    const/4 p1, 0x0

    .line 75
    iput-object p1, p0, Lb7/u;->r:Lb7/c;

    .line 76
    .line 77
    :goto_2
    iput-object p11, p0, Lb7/u;->s:Lb7/d;

    .line 78
    .line 79
    return-void
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
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lb7/u;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lb7/u;

    iget-object v0, p0, Lb7/u;->a:Lb7/y;

    iget-object v2, p1, Lb7/u;->a:Lb7/y;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lb7/u;->b:Lb7/a0;

    iget-object v2, p1, Lb7/u;->b:Lb7/a0;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lb7/u;->c:[B

    iget-object v2, p1, Lb7/u;->c:[B

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lb7/u;->e:Ljava/lang/Double;

    iget-object v2, p1, Lb7/u;->e:Ljava/lang/Double;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lb7/u;->d:Ljava/util/List;

    iget-object v2, p1, Lb7/u;->d:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p1, Lb7/u;->d:Ljava/util/List;

    iget-object v2, p0, Lb7/u;->d:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lb7/u;->f:Ljava/util/List;

    if-nez v0, :cond_1

    iget-object v2, p1, Lb7/u;->f:Ljava/util/List;

    if-eqz v2, :cond_2

    :cond_1
    if-eqz v0, :cond_3

    iget-object v2, p1, Lb7/u;->f:Ljava/util/List;

    if-eqz v2, :cond_3

    invoke-interface {v0, v2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p1, Lb7/u;->f:Ljava/util/List;

    iget-object v2, p0, Lb7/u;->f:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lb7/u;->o:Lb7/k;

    iget-object v2, p1, Lb7/u;->o:Lb7/k;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lb7/u;->p:Ljava/lang/Integer;

    iget-object v2, p1, Lb7/u;->p:Ljava/lang/Integer;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lb7/u;->q:Lb7/d0;

    iget-object v2, p1, Lb7/u;->q:Lb7/d0;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lb7/u;->r:Lb7/c;

    iget-object v2, p1, Lb7/u;->r:Lb7/c;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lb7/u;->s:Lb7/d;

    iget-object p1, p1, Lb7/u;->s:Lb7/d;

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

    const/16 v0, 0xb

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lb7/u;->a:Lb7/y;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/u;->b:Lb7/a0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/u;->c:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/u;->d:Ljava/util/List;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/u;->e:Ljava/lang/Double;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/u;->f:Ljava/util/List;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/u;->o:Lb7/k;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/u;->p:Ljava/lang/Integer;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/u;->q:Lb7/d0;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/u;->r:Lb7/c;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/u;->s:Lb7/d;

    const/16 v2, 0xa

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
    iget-object v1, p0, Lb7/u;->a:Lb7/y;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v2, v1, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lb7/u;->b:Lb7/a0;

    .line 15
    .line 16
    const/4 v2, 0x3

    .line 17
    invoke-static {p1, v2, v1, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lb7/u;->c:[B

    .line 21
    .line 22
    const/4 v2, 0x4

    .line 23
    invoke-static {p1, v2, v1, v3}, Lb/z;->w(Landroid/os/Parcel;I[BZ)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lb7/u;->d:Ljava/util/List;

    .line 27
    .line 28
    const/4 v2, 0x5

    .line 29
    invoke-static {p1, v2, v1, v3}, Lb/z;->I(Landroid/os/Parcel;ILjava/util/List;Z)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lb7/u;->e:Ljava/lang/Double;

    .line 33
    .line 34
    const/4 v2, 0x6

    .line 35
    invoke-static {p1, v2, v1}, Lb/z;->x(Landroid/os/Parcel;ILjava/lang/Double;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lb7/u;->f:Ljava/util/List;

    .line 39
    .line 40
    const/4 v2, 0x7

    .line 41
    invoke-static {p1, v2, v1, v3}, Lb/z;->I(Landroid/os/Parcel;ILjava/util/List;Z)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lb7/u;->o:Lb7/k;

    .line 45
    .line 46
    const/16 v2, 0x8

    .line 47
    .line 48
    invoke-static {p1, v2, v1, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lb7/u;->p:Ljava/lang/Integer;

    .line 52
    .line 53
    const/16 v2, 0x9

    .line 54
    .line 55
    invoke-static {p1, v2, v1}, Lb/z;->B(Landroid/os/Parcel;ILjava/lang/Integer;)V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lb7/u;->q:Lb7/d0;

    .line 59
    .line 60
    const/16 v2, 0xa

    .line 61
    .line 62
    invoke-static {p1, v2, v1, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lb7/u;->r:Lb7/c;

    .line 66
    .line 67
    if-nez v1, :cond_0

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    goto :goto_0

    .line 71
    :cond_0
    iget-object v1, v1, Lb7/c;->a:Ljava/lang/String;

    .line 72
    .line 73
    :goto_0
    const/16 v2, 0xb

    .line 74
    .line 75
    invoke-static {p1, v2, v1, v3}, Lb/z;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    const/16 v1, 0xc

    .line 79
    .line 80
    iget-object v2, p0, Lb7/u;->s:Lb7/d;

    .line 81
    .line 82
    invoke-static {p1, v1, v2, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 83
    .line 84
    .line 85
    invoke-static {v0, p1}, Lb/z;->L(ILandroid/os/Parcel;)V

    .line 86
    .line 87
    .line 88
    return-void
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
