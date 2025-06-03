.class public final Lj6/z;
.super Ln6/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lj6/z;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Z

.field public final d:Landroid/content/Context;

.field public final e:Z

.field public final f:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj6/a0;

    invoke-direct {v0}, Lj6/a0;-><init>()V

    sput-object v0, Lj6/z;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZZLandroid/os/IBinder;ZZ)V
    .locals 0

    invoke-direct {p0}, Ln6/a;-><init>()V

    iput-object p1, p0, Lj6/z;->a:Ljava/lang/String;

    iput-boolean p2, p0, Lj6/z;->b:Z

    iput-boolean p3, p0, Lj6/z;->c:Z

    invoke-static {p4}, Lcom/google/android/gms/dynamic/IObjectWrapper$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->unwrap(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lj6/z;->d:Landroid/content/Context;

    iput-boolean p5, p0, Lj6/z;->e:Z

    iput-boolean p6, p0, Lj6/z;->f:Z

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    iget-object p2, p0, Lj6/z;->a:Ljava/lang/String;

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
    const/4 v2, 0x0

    .line 11
    invoke-static {p1, v1, p2, v2}, Lb/z;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    iget-boolean p2, p0, Lj6/z;->b:Z

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-static {p1, v1, p2}, Lb/z;->t(Landroid/os/Parcel;IZ)V

    .line 18
    .line 19
    .line 20
    iget-boolean p2, p0, Lj6/z;->c:Z

    .line 21
    .line 22
    const/4 v1, 0x3

    .line 23
    invoke-static {p1, v1, p2}, Lb/z;->t(Landroid/os/Parcel;IZ)V

    .line 24
    .line 25
    .line 26
    iget-object p2, p0, Lj6/z;->d:Landroid/content/Context;

    .line 27
    .line 28
    invoke-static {p2}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    const/4 v1, 0x4

    .line 33
    invoke-static {p1, v1, p2}, Lb/z;->y(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    .line 34
    .line 35
    .line 36
    iget-boolean p2, p0, Lj6/z;->e:Z

    .line 37
    .line 38
    const/4 v1, 0x5

    .line 39
    invoke-static {p1, v1, p2}, Lb/z;->t(Landroid/os/Parcel;IZ)V

    .line 40
    .line 41
    .line 42
    iget-boolean p2, p0, Lj6/z;->f:Z

    .line 43
    .line 44
    const/4 v1, 0x6

    .line 45
    invoke-static {p1, v1, p2}, Lb/z;->t(Landroid/os/Parcel;IZ)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0, p1}, Lb/z;->L(ILandroid/os/Parcel;)V

    .line 49
    .line 50
    .line 51
    return-void
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
