.class public final Lm6/g;
.super Ln6/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lm6/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:J

.field public final e:J

.field public final f:Ljava/lang/String;

.field public final o:Ljava/lang/String;

.field public final p:I

.field public final q:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm6/v;

    invoke-direct {v0}, Lm6/v;-><init>()V

    sput-object v0, Lm6/g;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0}, Ln6/a;-><init>()V

    iput p1, p0, Lm6/g;->a:I

    iput p2, p0, Lm6/g;->b:I

    iput p3, p0, Lm6/g;->c:I

    iput-wide p4, p0, Lm6/g;->d:J

    iput-wide p6, p0, Lm6/g;->e:J

    iput-object p8, p0, Lm6/g;->f:Ljava/lang/String;

    iput-object p9, p0, Lm6/g;->o:Ljava/lang/String;

    iput p10, p0, Lm6/g;->p:I

    iput p11, p0, Lm6/g;->q:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    iget p2, p0, Lm6/g;->a:I

    .line 2
    .line 3
    const/16 v0, 0x4f45

    .line 4
    .line 5
    invoke-static {v0, p1}, Lb/z;->J(ILandroid/os/Parcel;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-static {p1, v1, p2}, Lb/z;->z(Landroid/os/Parcel;II)V

    .line 11
    .line 12
    .line 13
    const/4 p2, 0x2

    .line 14
    iget v1, p0, Lm6/g;->b:I

    .line 15
    .line 16
    invoke-static {p1, p2, v1}, Lb/z;->z(Landroid/os/Parcel;II)V

    .line 17
    .line 18
    .line 19
    const/4 p2, 0x3

    .line 20
    iget v1, p0, Lm6/g;->c:I

    .line 21
    .line 22
    invoke-static {p1, p2, v1}, Lb/z;->z(Landroid/os/Parcel;II)V

    .line 23
    .line 24
    .line 25
    const/4 p2, 0x4

    .line 26
    iget-wide v1, p0, Lm6/g;->d:J

    .line 27
    .line 28
    invoke-static {p1, p2, v1, v2}, Lb/z;->C(Landroid/os/Parcel;IJ)V

    .line 29
    .line 30
    .line 31
    const/4 p2, 0x5

    .line 32
    iget-wide v1, p0, Lm6/g;->e:J

    .line 33
    .line 34
    invoke-static {p1, p2, v1, v2}, Lb/z;->C(Landroid/os/Parcel;IJ)V

    .line 35
    .line 36
    .line 37
    const/4 p2, 0x6

    .line 38
    iget-object v1, p0, Lm6/g;->f:Ljava/lang/String;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-static {p1, p2, v1, v2}, Lb/z;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const/4 p2, 0x7

    .line 45
    iget-object v1, p0, Lm6/g;->o:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {p1, p2, v1, v2}, Lb/z;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 48
    .line 49
    .line 50
    const/16 p2, 0x8

    .line 51
    .line 52
    iget v1, p0, Lm6/g;->p:I

    .line 53
    .line 54
    invoke-static {p1, p2, v1}, Lb/z;->z(Landroid/os/Parcel;II)V

    .line 55
    .line 56
    .line 57
    const/16 p2, 0x9

    .line 58
    .line 59
    iget v1, p0, Lm6/g;->q:I

    .line 60
    .line 61
    invoke-static {p1, p2, v1}, Lb/z;->z(Landroid/os/Parcel;II)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0, p1}, Lb/z;->L(ILandroid/os/Parcel;)V

    .line 65
    .line 66
    .line 67
    return-void
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
