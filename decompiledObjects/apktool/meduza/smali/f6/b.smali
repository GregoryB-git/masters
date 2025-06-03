.class public final Lf6/b;
.super Ln6/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lf6/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:Landroid/app/PendingIntent;

.field public final c:I

.field public final d:[B

.field public final e:I

.field public final f:Landroid/os/Bundle;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf6/d;

    invoke-direct {v0}, Lf6/d;-><init>()V

    sput-object v0, Lf6/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IILandroid/app/PendingIntent;ILandroid/os/Bundle;[B)V
    .locals 0

    invoke-direct {p0}, Ln6/a;-><init>()V

    iput p1, p0, Lf6/b;->e:I

    iput p2, p0, Lf6/b;->a:I

    iput p4, p0, Lf6/b;->c:I

    iput-object p5, p0, Lf6/b;->f:Landroid/os/Bundle;

    iput-object p6, p0, Lf6/b;->d:[B

    iput-object p3, p0, Lf6/b;->b:Landroid/app/PendingIntent;

    return-void
.end method


# virtual methods
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
    iget v2, p0, Lf6/b;->a:I

    .line 9
    .line 10
    invoke-static {p1, v1, v2}, Lb/z;->z(Landroid/os/Parcel;II)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    iget-object v2, p0, Lf6/b;->b:Landroid/app/PendingIntent;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static {p1, v1, v2, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 18
    .line 19
    .line 20
    const/4 p2, 0x3

    .line 21
    iget v1, p0, Lf6/b;->c:I

    .line 22
    .line 23
    invoke-static {p1, p2, v1}, Lb/z;->z(Landroid/os/Parcel;II)V

    .line 24
    .line 25
    .line 26
    const/4 p2, 0x4

    .line 27
    iget-object v1, p0, Lf6/b;->f:Landroid/os/Bundle;

    .line 28
    .line 29
    invoke-static {p1, p2, v1, v3}, Lb/z;->v(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    .line 30
    .line 31
    .line 32
    const/4 p2, 0x5

    .line 33
    iget-object v1, p0, Lf6/b;->d:[B

    .line 34
    .line 35
    invoke-static {p1, p2, v1, v3}, Lb/z;->w(Landroid/os/Parcel;I[BZ)V

    .line 36
    .line 37
    .line 38
    const/16 p2, 0x3e8

    .line 39
    .line 40
    iget v1, p0, Lf6/b;->e:I

    .line 41
    .line 42
    invoke-static {p1, p2, v1}, Lb/z;->z(Landroid/os/Parcel;II)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0, p1}, Lb/z;->L(ILandroid/os/Parcel;)V

    .line 46
    .line 47
    .line 48
    return-void
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
