.class public LA2/f;
.super LB2/a;
.source "SourceFile"


# static fields
.field public static final C:[Lcom/google/android/gms/common/api/Scope;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LA2/f;",
            ">;"
        }
    .end annotation
.end field

.field public static final D:[Lx2/d;


# instance fields
.field public A:Z

.field public B:Ljava/lang/String;

.field public final o:I

.field public final p:I

.field public q:I

.field public r:Ljava/lang/String;

.field public s:Landroid/os/IBinder;

.field public t:[Lcom/google/android/gms/common/api/Scope;

.field public u:Landroid/os/Bundle;

.field public v:Landroid/accounts/Account;

.field public w:[Lx2/d;

.field public x:[Lx2/d;

.field public y:Z

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LA2/d0;

    .line 2
    .line 3
    invoke-direct {v0}, LA2/d0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LA2/f;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    new-array v1, v0, [Lcom/google/android/gms/common/api/Scope;

    .line 10
    .line 11
    sput-object v1, LA2/f;->C:[Lcom/google/android/gms/common/api/Scope;

    .line 12
    .line 13
    new-array v0, v0, [Lx2/d;

    .line 14
    .line 15
    sput-object v0, LA2/f;->D:[Lx2/d;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lx2/d;[Lx2/d;ZIZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LB2/a;-><init>()V

    .line 2
    .line 3
    .line 4
    if-nez p6, :cond_0

    .line 5
    .line 6
    sget-object p6, LA2/f;->C:[Lcom/google/android/gms/common/api/Scope;

    .line 7
    .line 8
    :cond_0
    if-nez p7, :cond_1

    .line 9
    .line 10
    new-instance p7, Landroid/os/Bundle;

    .line 11
    .line 12
    invoke-direct {p7}, Landroid/os/Bundle;-><init>()V

    .line 13
    .line 14
    .line 15
    :cond_1
    if-nez p9, :cond_2

    .line 16
    .line 17
    sget-object p9, LA2/f;->D:[Lx2/d;

    .line 18
    .line 19
    :cond_2
    if-nez p10, :cond_3

    .line 20
    .line 21
    sget-object p10, LA2/f;->D:[Lx2/d;

    .line 22
    .line 23
    :cond_3
    iput p1, p0, LA2/f;->o:I

    .line 24
    .line 25
    iput p2, p0, LA2/f;->p:I

    .line 26
    .line 27
    iput p3, p0, LA2/f;->q:I

    .line 28
    .line 29
    const-string p2, "com.google.android.gms"

    .line 30
    .line 31
    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    if-eqz p3, :cond_4

    .line 36
    .line 37
    iput-object p2, p0, LA2/f;->r:Ljava/lang/String;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iput-object p4, p0, LA2/f;->r:Ljava/lang/String;

    .line 41
    .line 42
    :goto_0
    const/4 p2, 0x2

    .line 43
    if-ge p1, p2, :cond_6

    .line 44
    .line 45
    if-eqz p5, :cond_5

    .line 46
    .line 47
    invoke-static {p5}, LA2/i$a;->o(Landroid/os/IBinder;)LA2/i;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p1}, LA2/a;->v(LA2/i;)Landroid/accounts/Account;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    goto :goto_1

    .line 56
    :cond_5
    const/4 p1, 0x0

    .line 57
    :goto_1
    iput-object p1, p0, LA2/f;->v:Landroid/accounts/Account;

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_6
    iput-object p5, p0, LA2/f;->s:Landroid/os/IBinder;

    .line 61
    .line 62
    iput-object p8, p0, LA2/f;->v:Landroid/accounts/Account;

    .line 63
    .line 64
    :goto_2
    iput-object p6, p0, LA2/f;->t:[Lcom/google/android/gms/common/api/Scope;

    .line 65
    .line 66
    iput-object p7, p0, LA2/f;->u:Landroid/os/Bundle;

    .line 67
    .line 68
    iput-object p9, p0, LA2/f;->w:[Lx2/d;

    .line 69
    .line 70
    iput-object p10, p0, LA2/f;->x:[Lx2/d;

    .line 71
    .line 72
    iput-boolean p11, p0, LA2/f;->y:Z

    .line 73
    .line 74
    iput p12, p0, LA2/f;->z:I

    .line 75
    .line 76
    iput-boolean p13, p0, LA2/f;->A:Z

    .line 77
    .line 78
    iput-object p14, p0, LA2/f;->B:Ljava/lang/String;

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LA2/f;->B:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LA2/d0;->a(LA2/f;Landroid/os/Parcel;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
