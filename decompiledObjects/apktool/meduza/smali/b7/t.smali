.class public final Lb7/t;
.super Ln6/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lb7/t;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:[B

.field public final d:Lb7/h;

.field public final e:Lb7/g;

.field public final f:Lb7/i;

.field public final o:Lb7/e;

.field public final p:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb7/t0;

    invoke-direct {v0}, Lb7/t0;-><init>()V

    sput-object v0, Lb7/t;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[BLb7/h;Lb7/g;Lb7/i;Lb7/e;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ln6/a;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p4, :cond_0

    if-nez p5, :cond_0

    if-eqz p6, :cond_3

    :cond_0
    if-nez p4, :cond_1

    if-eqz p5, :cond_1

    if-eqz p6, :cond_3

    :cond_1
    if-nez p4, :cond_2

    if-nez p5, :cond_2

    if-eqz p6, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :cond_3
    :goto_0
    invoke-static {v0}, Lm6/j;->b(Z)V

    iput-object p1, p0, Lb7/t;->a:Ljava/lang/String;

    iput-object p2, p0, Lb7/t;->b:Ljava/lang/String;

    iput-object p3, p0, Lb7/t;->c:[B

    iput-object p4, p0, Lb7/t;->d:Lb7/h;

    iput-object p5, p0, Lb7/t;->e:Lb7/g;

    iput-object p6, p0, Lb7/t;->f:Lb7/i;

    iput-object p7, p0, Lb7/t;->o:Lb7/e;

    iput-object p8, p0, Lb7/t;->p:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lb7/t;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lb7/t;

    iget-object v0, p0, Lb7/t;->a:Ljava/lang/String;

    iget-object v2, p1, Lb7/t;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb7/t;->b:Ljava/lang/String;

    iget-object v2, p1, Lb7/t;->b:Ljava/lang/String;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb7/t;->c:[B

    iget-object v2, p1, Lb7/t;->c:[B

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb7/t;->d:Lb7/h;

    iget-object v2, p1, Lb7/t;->d:Lb7/h;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb7/t;->e:Lb7/g;

    iget-object v2, p1, Lb7/t;->e:Lb7/g;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb7/t;->f:Lb7/i;

    iget-object v2, p1, Lb7/t;->f:Lb7/i;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb7/t;->o:Lb7/e;

    iget-object v2, p1, Lb7/t;->o:Lb7/e;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb7/t;->p:Ljava/lang/String;

    iget-object p1, p1, Lb7/t;->p:Ljava/lang/String;

    invoke-static {v0, p1}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lb7/t;->a:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/t;->b:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/t;->c:[B

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/t;->e:Lb7/g;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/t;->d:Lb7/h;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/t;->f:Lb7/i;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/t;->o:Lb7/e;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/t;->p:Ljava/lang/String;

    const/4 v2, 0x7

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
    const/4 v1, 0x1

    .line 8
    iget-object v2, p0, Lb7/t;->a:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v1, v2, v3}, Lb/z;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    iget-object v2, p0, Lb7/t;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {p1, v1, v2, v3}, Lb/z;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    iget-object v2, p0, Lb7/t;->c:[B

    .line 22
    .line 23
    invoke-static {p1, v1, v2, v3}, Lb/z;->w(Landroid/os/Parcel;I[BZ)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    iget-object v2, p0, Lb7/t;->d:Lb7/h;

    .line 28
    .line 29
    invoke-static {p1, v1, v2, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x5

    .line 33
    iget-object v2, p0, Lb7/t;->e:Lb7/g;

    .line 34
    .line 35
    invoke-static {p1, v1, v2, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x6

    .line 39
    iget-object v2, p0, Lb7/t;->f:Lb7/i;

    .line 40
    .line 41
    invoke-static {p1, v1, v2, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x7

    .line 45
    iget-object v2, p0, Lb7/t;->o:Lb7/e;

    .line 46
    .line 47
    invoke-static {p1, v1, v2, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 48
    .line 49
    .line 50
    const/16 p2, 0x8

    .line 51
    .line 52
    iget-object v1, p0, Lb7/t;->p:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {p1, p2, v1, v3}, Lb/z;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0, p1}, Lb/z;->L(ILandroid/os/Parcel;)V

    .line 58
    .line 59
    .line 60
    return-void
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
