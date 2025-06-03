.class public final Lcom/google/android/gms/common/internal/b;
.super Ln6/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/common/internal/b;",
            ">;"
        }
    .end annotation
.end field

.field public static final w:[Lcom/google/android/gms/common/api/Scope;

.field public static final x:[Lj6/d;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public d:Ljava/lang/String;

.field public e:Landroid/os/IBinder;

.field public f:[Lcom/google/android/gms/common/api/Scope;

.field public o:Landroid/os/Bundle;

.field public p:Landroid/accounts/Account;

.field public q:[Lj6/d;

.field public r:[Lj6/d;

.field public final s:Z

.field public final t:I

.field public u:Z

.field public final v:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm6/o0;

    invoke-direct {v0}, Lm6/o0;-><init>()V

    sput-object v0, Lcom/google/android/gms/common/internal/b;->CREATOR:Landroid/os/Parcelable$Creator;

    const/4 v0, 0x0

    new-array v1, v0, [Lcom/google/android/gms/common/api/Scope;

    sput-object v1, Lcom/google/android/gms/common/internal/b;->w:[Lcom/google/android/gms/common/api/Scope;

    new-array v0, v0, [Lj6/d;

    sput-object v0, Lcom/google/android/gms/common/internal/b;->x:[Lj6/d;

    return-void
.end method

.method public constructor <init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lj6/d;[Lj6/d;ZIZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ln6/a;-><init>()V

    if-nez p6, :cond_0

    sget-object p6, Lcom/google/android/gms/common/internal/b;->w:[Lcom/google/android/gms/common/api/Scope;

    :cond_0
    if-nez p7, :cond_1

    new-instance p7, Landroid/os/Bundle;

    invoke-direct {p7}, Landroid/os/Bundle;-><init>()V

    :cond_1
    if-nez p9, :cond_2

    sget-object p9, Lcom/google/android/gms/common/internal/b;->x:[Lj6/d;

    :cond_2
    if-nez p10, :cond_3

    sget-object p10, Lcom/google/android/gms/common/internal/b;->x:[Lj6/d;

    :cond_3
    iput p1, p0, Lcom/google/android/gms/common/internal/b;->a:I

    iput p2, p0, Lcom/google/android/gms/common/internal/b;->b:I

    iput p3, p0, Lcom/google/android/gms/common/internal/b;->c:I

    const-string p2, "com.google.android.gms"

    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    iput-object p2, p0, Lcom/google/android/gms/common/internal/b;->d:Ljava/lang/String;

    goto :goto_0

    :cond_4
    iput-object p4, p0, Lcom/google/android/gms/common/internal/b;->d:Ljava/lang/String;

    :goto_0
    const/4 p2, 0x2

    if-ge p1, p2, :cond_6

    if-eqz p5, :cond_5

    invoke-static {p5}, Lcom/google/android/gms/common/internal/IAccountAccessor$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/common/internal/IAccountAccessor;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/AccountAccessor;->getAccountBinderSafe(Lcom/google/android/gms/common/internal/IAccountAccessor;)Landroid/accounts/Account;

    move-result-object p1

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p0, Lcom/google/android/gms/common/internal/b;->p:Landroid/accounts/Account;

    goto :goto_2

    :cond_6
    iput-object p5, p0, Lcom/google/android/gms/common/internal/b;->e:Landroid/os/IBinder;

    iput-object p8, p0, Lcom/google/android/gms/common/internal/b;->p:Landroid/accounts/Account;

    :goto_2
    iput-object p6, p0, Lcom/google/android/gms/common/internal/b;->f:[Lcom/google/android/gms/common/api/Scope;

    iput-object p7, p0, Lcom/google/android/gms/common/internal/b;->o:Landroid/os/Bundle;

    iput-object p9, p0, Lcom/google/android/gms/common/internal/b;->q:[Lj6/d;

    iput-object p10, p0, Lcom/google/android/gms/common/internal/b;->r:[Lj6/d;

    iput-boolean p11, p0, Lcom/google/android/gms/common/internal/b;->s:Z

    iput p12, p0, Lcom/google/android/gms/common/internal/b;->t:I

    iput-boolean p13, p0, Lcom/google/android/gms/common/internal/b;->u:Z

    iput-object p14, p0, Lcom/google/android/gms/common/internal/b;->v:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lm6/o0;->a(Lcom/google/android/gms/common/internal/b;Landroid/os/Parcel;I)V

    return-void
.end method
