.class public final Lb7/e;
.super Ln6/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lb7/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lb7/f0;

.field public final b:Lb7/n1;

.field public final c:Lb7/f;

.field public final d:Lb7/p1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb7/k1;

    invoke-direct {v0}, Lb7/k1;-><init>()V

    sput-object v0, Lb7/e;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lb7/f0;Lb7/n1;Lb7/f;Lb7/p1;)V
    .locals 0

    invoke-direct {p0}, Ln6/a;-><init>()V

    iput-object p1, p0, Lb7/e;->a:Lb7/f0;

    iput-object p2, p0, Lb7/e;->b:Lb7/n1;

    iput-object p3, p0, Lb7/e;->c:Lb7/f;

    iput-object p4, p0, Lb7/e;->d:Lb7/p1;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lb7/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lb7/e;

    iget-object v0, p0, Lb7/e;->a:Lb7/f0;

    iget-object v2, p1, Lb7/e;->a:Lb7/f0;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb7/e;->b:Lb7/n1;

    iget-object v2, p1, Lb7/e;->b:Lb7/n1;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb7/e;->c:Lb7/f;

    iget-object v2, p1, Lb7/e;->c:Lb7/f;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb7/e;->d:Lb7/p1;

    iget-object p1, p1, Lb7/e;->d:Lb7/p1;

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

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lb7/e;->a:Lb7/f0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/e;->b:Lb7/n1;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/e;->c:Lb7/f;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lb7/e;->d:Lb7/p1;

    const/4 v2, 0x3

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
    iget-object v2, p0, Lb7/e;->a:Lb7/f0;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v1, v2, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    iget-object v2, p0, Lb7/e;->b:Lb7/n1;

    .line 16
    .line 17
    invoke-static {p1, v1, v2, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    iget-object v2, p0, Lb7/e;->c:Lb7/f;

    .line 22
    .line 23
    invoke-static {p1, v1, v2, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    iget-object v2, p0, Lb7/e;->d:Lb7/p1;

    .line 28
    .line 29
    invoke-static {p1, v1, v2, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, p1}, Lb/z;->L(ILandroid/os/Parcel;)V

    .line 33
    .line 34
    .line 35
    return-void
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
