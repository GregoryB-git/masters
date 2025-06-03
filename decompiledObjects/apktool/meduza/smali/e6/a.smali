.class public abstract Le6/a;
.super Lk6/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk6/d<",
        "Lk6/a$d$c;",
        ">;"
    }
.end annotation


# static fields
.field private static final zza:Lk6/a$g;

.field private static final zzb:Lk6/a$a;

.field private static final zzc:Lk6/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk6/a$g;

    invoke-direct {v0}, Lk6/a$g;-><init>()V

    sput-object v0, Le6/a;->zza:Lk6/a$g;

    new-instance v1, Le6/b;

    invoke-direct {v1}, Le6/b;-><init>()V

    sput-object v1, Le6/a;->zzb:Lk6/a$a;

    new-instance v2, Lk6/a;

    const-string v3, "SmsRetriever.API"

    invoke-direct {v2, v3, v1, v0}, Lk6/a;-><init>(Ljava/lang/String;Lk6/a$a;Lk6/a$g;)V

    sput-object v2, Le6/a;->zzc:Lk6/a;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 3

    sget-object v0, Le6/a;->zzc:Lk6/a;

    sget-object v1, Lk6/a$d;->j:Lk6/a$d$c;

    sget-object v2, Lk6/d$a;->c:Lk6/d$a;

    invoke-direct {p0, p1, v0, v1, v2}, Lk6/d;-><init>(Landroid/app/Activity;Lk6/a;Lk6/a$d;Lk6/d$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    sget-object v0, Le6/a;->zzc:Lk6/a;

    sget-object v1, Lk6/a$d;->j:Lk6/a$d$c;

    sget-object v2, Lk6/d$a;->c:Lk6/d$a;

    invoke-direct {p0, p1, v0, v1, v2}, Lk6/d;-><init>(Landroid/content/Context;Lk6/a;Lk6/a$d;Lk6/d$a;)V

    return-void
.end method


# virtual methods
.method public abstract startSmsRetriever()Lcom/google/android/gms/tasks/Task;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end method

.method public abstract startSmsUserConsent(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end method
