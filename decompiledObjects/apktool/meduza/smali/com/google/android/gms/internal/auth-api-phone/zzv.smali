.class public final Lcom/google/android/gms/internal/auth-api-phone/zzv;
.super Lk6/d;
.source "SourceFile"


# static fields
.field private static final zza:Lk6/a$g;

.field private static final zzb:Lk6/a$a;

.field private static final zzc:Lk6/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk6/a$g;

    invoke-direct {v0}, Lk6/a$g;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/auth-api-phone/zzv;->zza:Lk6/a$g;

    new-instance v1, Lcom/google/android/gms/internal/auth-api-phone/zzt;

    invoke-direct {v1}, Lcom/google/android/gms/internal/auth-api-phone/zzt;-><init>()V

    sput-object v1, Lcom/google/android/gms/internal/auth-api-phone/zzv;->zzb:Lk6/a$a;

    new-instance v2, Lk6/a;

    const-string v3, "SmsCodeBrowser.API"

    invoke-direct {v2, v3, v1, v0}, Lk6/a;-><init>(Ljava/lang/String;Lk6/a$a;Lk6/a$g;)V

    sput-object v2, Lcom/google/android/gms/internal/auth-api-phone/zzv;->zzc:Lk6/a;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/auth-api-phone/zzv;->zzc:Lk6/a;

    sget-object v1, Lk6/a$d;->j:Lk6/a$d$c;

    sget-object v2, Lk6/d$a;->c:Lk6/d$a;

    invoke-direct {p0, p1, v0, v1, v2}, Lk6/d;-><init>(Landroid/app/Activity;Lk6/a;Lk6/a$d;Lk6/d$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/auth-api-phone/zzv;->zzc:Lk6/a;

    sget-object v1, Lk6/a$d;->j:Lk6/a$d$c;

    sget-object v2, Lk6/d$a;->c:Lk6/d$a;

    invoke-direct {p0, p1, v0, v1, v2}, Lk6/d;-><init>(Landroid/content/Context;Lk6/a;Lk6/a$d;Lk6/d$a;)V

    return-void
.end method


# virtual methods
.method public final startSmsCodeRetriever()Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ll6/q$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ll6/q$a;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v1, v1, [Lj6/d;

    .line 8
    .line 9
    sget-object v2, Lcom/google/android/gms/internal/auth-api-phone/zzac;->zzb:Lj6/d;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    aput-object v2, v1, v3

    .line 13
    .line 14
    iput-object v1, v0, Ll6/q$a;->c:[Lj6/d;

    .line 15
    .line 16
    new-instance v1, Lcom/google/android/gms/internal/auth-api-phone/zzs;

    .line 17
    .line 18
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/auth-api-phone/zzs;-><init>(Lcom/google/android/gms/internal/auth-api-phone/zzv;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, v0, Ll6/q$a;->a:Ll6/n;

    .line 22
    .line 23
    const/16 v1, 0x61e

    .line 24
    .line 25
    iput v1, v0, Ll6/q$a;->d:I

    .line 26
    .line 27
    invoke-virtual {v0}, Ll6/q$a;->a()Ll6/s0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0}, Lk6/d;->doWrite(Ll6/q;)Lcom/google/android/gms/tasks/Task;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
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
.end method
