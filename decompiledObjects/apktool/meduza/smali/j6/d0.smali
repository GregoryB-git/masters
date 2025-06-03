.class public final Lj6/d0;
.super Ln6/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lj6/d0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lj6/u;

.field public final c:Z

.field public final d:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj6/e0;

    invoke-direct {v0}, Lj6/e0;-><init>()V

    sput-object v0, Lj6/d0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/os/IBinder;ZZ)V
    .locals 2

    const-string v0, "Could not unwrap certificate"

    const-string v1, "GoogleCertificatesQuery"

    invoke-direct {p0}, Ln6/a;-><init>()V

    iput-object p1, p0, Lj6/d0;->a:Ljava/lang/String;

    const/4 p1, 0x0

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzz;->zzg(Landroid/os/IBinder;)Lm6/b0;

    move-result-object p2

    invoke-interface {p2}, Lm6/b0;->zzd()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object p2
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p2, :cond_1

    move-object p2, p1

    goto :goto_0

    :cond_1
    invoke-static {p2}, Lcom/google/android/gms/dynamic/ObjectWrapper;->unwrap(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [B

    :goto_0
    if-eqz p2, :cond_2

    new-instance p1, Lj6/v;

    invoke-direct {p1, p2}, Lj6/v;-><init>([B)V

    goto :goto_1

    :cond_2
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :catch_0
    move-exception p2

    invoke-static {v1, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    iput-object p1, p0, Lj6/d0;->b:Lj6/u;

    iput-boolean p3, p0, Lj6/d0;->c:Z

    iput-boolean p4, p0, Lj6/d0;->d:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lj6/u;ZZ)V
    .locals 0

    invoke-direct {p0}, Ln6/a;-><init>()V

    iput-object p1, p0, Lj6/d0;->a:Ljava/lang/String;

    iput-object p2, p0, Lj6/d0;->b:Lj6/u;

    iput-boolean p3, p0, Lj6/d0;->c:Z

    iput-boolean p4, p0, Lj6/d0;->d:Z

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    iget-object p2, p0, Lj6/d0;->a:Ljava/lang/String;

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
    iget-object p2, p0, Lj6/d0;->b:Lj6/u;

    .line 15
    .line 16
    if-nez p2, :cond_0

    .line 17
    .line 18
    const-string p2, "GoogleCertificatesQuery"

    .line 19
    .line 20
    const-string v1, "certificate binder is null"

    .line 21
    .line 22
    invoke-static {p2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    const/4 p2, 0x0

    .line 26
    :cond_0
    const/4 v1, 0x2

    .line 27
    invoke-static {p1, v1, p2}, Lb/z;->y(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    .line 28
    .line 29
    .line 30
    const/4 p2, 0x3

    .line 31
    iget-boolean v1, p0, Lj6/d0;->c:Z

    .line 32
    .line 33
    invoke-static {p1, p2, v1}, Lb/z;->t(Landroid/os/Parcel;IZ)V

    .line 34
    .line 35
    .line 36
    const/4 p2, 0x4

    .line 37
    iget-boolean v1, p0, Lj6/d0;->d:Z

    .line 38
    .line 39
    invoke-static {p1, p2, v1}, Lb/z;->t(Landroid/os/Parcel;IZ)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0, p1}, Lb/z;->L(ILandroid/os/Parcel;)V

    .line 43
    .line 44
    .line 45
    return-void
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
